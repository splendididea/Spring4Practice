<%--
  Created by IntelliJ IDEA.
  User: mufasa
  Date: 2017. 11. 30.
  Time: 오전 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/header.jsp"%>
<form role="form" method="post">
    <input type="hidden" name="bno" value="${boardVO.bno}">
</form>

<div class="box-body">
    <div class="form-group">
        <label for="exampleInputEmail1">Title</label>
        <input type="text" name="title" class="form-control" value="${boardVO.title}" readonly>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Content</label>
        <textarea name="content" rows="3" class="form-control" readonly="readonly">${boardVO.content}</textarea>
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Writer</label>
        <input type="text" class="form-control" name="writer" value="${boardVO.writer}" readonly>
    </div>
</div><!--./box-body -->

<div class="footer">
    <button type="submit" class="btn btn-warning">Modify</button>
    <button type="submit" class="btn btn-danger">REMOVE</button>
    <button type="submit" class="btn btn-primary">LIST ALL</button>
</div>
<%@ include file="../include/footer.jsp"%>
<script>
    $(document).ready(function () {
        var formObj = $("form[role=form]");
        console.log(formObj);

        $('.btn-warning').click(function () {
            formObj.attr('action','/board/modify');
            formObj.attr('method','get');
            formObj.submit();
        });

        $('.btn-danger').click(function () {
            formObj.attr('action','/board/remove');
            formObj.submit();
        });
        
        $('.btn-primary').click(function () {
            self.location = '/board/listAll';
        })
    })
</script>