<#-- @ftlvariable name="title" type="java.lang.String" -->
<#-- @ftlvariable name="page" type="app.controllers.HelloController.ViewUser" -->

<h1>${title}</h1>

<h2>Access values with normal getters</h2>
<p>
    Hello, this is ${page.getName()}, age: ${page.getAge()}
</p>

<#if false>

<h3>Access values with Freemarker trickery</h3>
<p>
    Hello, this is ${page.nme}, age: ${page.age}
</p>
</#if>

<hr>

<p>
    <@link_to controller="root" action="index">Go to root index via freemarker macro</@>
</p>
