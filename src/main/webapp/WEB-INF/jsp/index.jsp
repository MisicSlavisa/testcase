<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

<jsp:include page="fragment/headTag.jsp"/>
<body>
<jsp:include page="fragment/menu.jsp"/>
<section class="about-banner" style="background-image: url(/resources/img/top.jpg);
                background-repeat: no-repeat; background-position: 100% 100%; background-size: 100%">
    <div class="container">
        <div class="row d-flex align-items-center justify-content-center">
            <div class="about-content col-lg-12" style="text-shadow: black 2px 3px 4px">
                <row class="text-white">
                    <br/><br/>
                    <h1 class="text-center">Добро пожаловать!</h1>
                    <br/>
                    <h1 class="text-center">Выберите опцию из верхнего меню</h1>
                    <br/><br/><br/>
                </row>
            </div>
        </div>
    </div>
</section>
<jsp:include page="fragment/footer.jsp"/>
</body>
</html>