<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link href="${context_path}/css/main.css" rel="stylesheet" type="text/css"/>
    <script src="${context_path}/js/aw.js" type="text/javascript"></script>
    <title>ActiveWeb - <@yield to="title"/></title>
</head>
<body>

<#include "header.ftl" >

<div class="container">
    ${page_content}
</div><!-- /.container -->

<#include "footer.ftl" >

</body>

</html>
