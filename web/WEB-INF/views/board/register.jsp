<%--
  Created by IntelliJ IDEA.
  User: mufasa
  Date: 2017. 11. 28.
  Time: 오후 6:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/header.jsp"%>
<form role="form" method="post">
    <div class="box-body">
        <div class="form-group">
            <label for="exampleInputEmail1">
                Title
            </label>
            <input type="text" name="title" class="form-control" placeholder="Enter Title">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">
                Content
            </label>
            <textarea name="content" id="" rows="3" class="form-control" placeholder="Enter..."></textarea>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Writer</label>
            <input type="text" name="writer" class="form-control" placeholder="Enter Writer">
        </div>
    </div><!-- /.box-body -->
    <div class="box-footer">
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
<%@ include file="../include/footer.jsp"%>