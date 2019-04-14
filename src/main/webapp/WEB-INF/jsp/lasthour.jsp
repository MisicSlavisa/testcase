<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<jsp:include page="fragment/headTag.jsp"/>
<body>
<script type="text/javascript" src="resources/js/datatablesUtil.js" defer></script>
<script type="text/javascript" src="resources/js/lastHourDatatables.js" defer></script>
<jsp:include page="fragment/menu.jsp"/>

<div class="jumbotron pt-4" style="background-color: rgba(189,216,255,0.4); margin-bottom: 0; margin-top: 59.7222px">
    <div class="container">
        <br/>
        <h3 class="text-center font-weight-bold " style="font-family: 'Verdana'; color: #20c997; text-shadow: black 1px 2px 3px">Список пользователей и используемых ими форм за последний час</h3>
        <br/>

        <table class="table table-striped" id="datatable">
            <thead>
            <tr>
                <th>ID пользователя</th>
                <th>Время</th>
                <%-- <th>Группа события</th>
                <th>Тип события</th>
                <th>Подтип события</th>
                <th>Адрес</th>
                <th>Организация</th>--%>
                <th>ID формы</th>
                <%--<th>Ключ сессии</th>
                <th>Ответ</th>
                <th>Дата</th>--%>
            </tr>
            </thead>
        </table>
    </div>
</div>

<jsp:include page="fragment/footer.jsp"/>
</body>
</html>