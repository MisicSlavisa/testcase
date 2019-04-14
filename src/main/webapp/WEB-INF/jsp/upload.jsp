<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>
    <meta charset="UTF-8">
    <title>Загрузка файла</title>
</head>
<jsp:include page="fragment/headTag.jsp"/>
<body>
<jsp:include page="fragment/menu.jsp"/>

<section class="about-banner" style="margin-top: 59.7222px; background-image: url(/resources/img/top.jpg);
                background-repeat: no-repeat; background-position: 100% 100%; background-size: 100%">
    <div class="container">
        <div class="row d-flex justify-content-center">
            <form class="text-white justify-content-center" action="/upload" method="post" style="max-width: 500px" >
                <br/><br/><br/>
                <h4>Введите путь к файлу для загрузки</h4>
                <p>
                    <input style="width: 500px" type="text" name="filePath" id="filePath" value="C:/test_case.csv"><br/>
                </p>
                <p>
                    <input class="btn btn-primary text-uppercase" type="submit" value="Загрузить" name="submit">
                </p>
                <br/><br/>
            </form>
        </div>
    </div>
</section>
<jsp:include page="fragment/footer.jsp"/>
</body>
</html>