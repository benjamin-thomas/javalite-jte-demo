@param app.controllers.HelloController.JteDataBag data

<h1>${data.getPageTitle()}</h1>

<h2>Access values with normal getters</h2>
@if(false)
    <h3>Test</h3>
<p>
    Hello, this is ${data.getName()}, age: ${data.getAge()}
</p>
@endif

<hr>

<h3>Can call static methods</h3>
<p>
    The current timestamp is ${System.currentTimeMillis()}.
</p>

<h4>And instantiate objects</h4>

<p>
    ${(new app.controllers.HelloController.ViewUser("Bob", 99)).toString()}
</p>


<hr>

<p>
Pass URLs from the top : <a href="${data.getRootURL()}">Root URL</a>
</p>

<p>
    Or it could be useful if all controllers knew their path for instance:
    <pre>
        HelloController.indexPath -> ${app.controllers.HelloController.indexPath}
    </pre>
</p>
