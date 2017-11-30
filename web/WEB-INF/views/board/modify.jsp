<%--
  Created by IntelliJ IDEA.
  User: mufasa
  Date: 2017. 11. 30.
  Time: 오후 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/header.jsp"%>
<form role="form" method="post">
    <div class="box-body">
        <div class="form-group">
            <label for="bno">BNO</label>
            <input type="text" name="bno" class="form-control" value="${boardVO.bno}" readonly>
        </div>
        <div class="box-body">
            <label for="title"></label>
            <input type="text" name="title" class="form-control" value="${boardVO.title}">
        </div>
        <div class="box-body">
            <label for="content"></label>
            <textarea class="form-control" name="content" rows="3">${boardVO.content}</textarea>
        </div>
        <div class="box-body">
            <label for="writer"></label>
            <input type="text" class="form-control" name="writer" value="${boardVO.writer}">
        </div>
    </div><!--./box-body -->
</form>
<div class="box-footer">
    <button type="submit" class="btn-primary">SAVE</button>
    <button type="submit" class="btn-warning">CANCEL</button>
</div>
<%@ include file="../include/footer.jsp"%>
<script>
    $(document).ready(function () {

        var formObj = $("form[role='form']")

        $('.btn-primary').click(function () {
            formObj.submit();
        })

        $('.btn-warning').click(function () {
            self.location = '/board/listAll';
        })
    })
</script>