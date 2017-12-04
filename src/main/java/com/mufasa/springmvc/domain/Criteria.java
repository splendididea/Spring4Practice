package com.mufasa.springmvc.domain;

public class Criteria {
    private int page;
    private int perPageNum;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if(page <= 0 ){
            this.page = 1;
            return;
        }
        this.page = page;
    }

    public int getPerPageNum() {
        return perPageNum;
    }

    public void setPerPageNum(int perPageNum) {
        this.perPageNum = perPageNum;
    }

    public Criteria() {
        this.page = 1;
        this.perPageNum = 10;
    }

    @Override
    public String toString() {
        return "Criteria{" +
                "page=" + page +
                ", perPageNum=" + perPageNum +
                '}';
    }
}
