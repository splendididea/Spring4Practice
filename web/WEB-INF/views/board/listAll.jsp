<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: mufasa
  Date: 2017. 11. 28.
  Time: 오후 7:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/header.jsp"%>
<div class="box">
<div class="box-body">
    <table class="table table-bordered">
    <tr>
        <th style="width: 10px;">bno</th>
        <th>TITLE</th>
        <th>WRITER</th>
        <th>REGDATE</th>
        <th style="width: 40px;"></th>
    </tr>

    <c:forEach var="boardVO" items="${list}">
        <tr>
            <td>${boardVO.bno}</td>
            <td><a href=""> ${boardVO.title} </a></td>
            <td>${boardVO.writer}</td>
            <td>
                <fmt:formatDate value="${boardVO.regdate}" pattern="yyyy-mm-dd"/>
            </td>
            <td><span class="badge bg-red">${boardVO.viewcnt}</span></td>
        </tr>
    </c:forEach>
</table>
</div>
</div>
<%@ include file="../include/footer.jsp"%>
<script>
    var msg = '${msg}';
    if(msg == 'SUCCESS'){
        alert("처리되었습니다.");
    }
</script>