<html>
<jsp:include page="fragment/headTag.jsp"/>
<body>
<jsp:include page="fragment/menu.jsp"/>

<!-- start banner Area -->
<section class="about-banner" style="background-image: url(/resources/img/top.jpg);
                background-repeat: no-repeat; background-position: 100% 100%; background-size: 100%">
    <div class="container">
        <div class="row d-flex align-items-center justify-content-center">
            <div class="about-content col-lg-12" style="text-shadow: black 2px 3px 4px">
                <br>
                <h2 class="text-white">Upload Status</h2>
                <br>

                <h1 class="text-white-50">${message}</h1>
                <br>
            </div>
        </div>
    </div>
</section>
<!-- End banner Area -->

</body>
</html>