<#-- @ftlvariable name="title" type="java.lang.String" -->
<#-- @ftlvariable name="page" type="app.controllers.HelloController.ViewUser" -->

<h1>${title}</h1>

<h2>Access values with normal getters</h2>
<p>
    Hello, this is ${page.getName()}, age: ${page.getAge()}
</p>

<h3>Access values with Freemarker trickery</h3>
<p>
    Hello, this is ${page.name}, age: ${page.age}
</p>

<hr>

<p>
    <@link_to controller="root" action="index">Go to root index via freemarker macro</@>
</p>
