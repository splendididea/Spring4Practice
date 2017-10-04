package com.mufasa.springmvc.model.board.dto;

import java.sql.Date;

/**
 * Created by mufasa on 17. 6. 5.
 */
public class BoardDTO {
    int seq;
    String content;
    String username;
    Date reg_date;
    Date mod_date;
    String title;
    String writer;
}
