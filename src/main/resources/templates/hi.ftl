<html>
<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
<body>
<div>
<#list products as product>
    <p>${product.id}
    <p>${product.amount?string}
    <p>${product.description}
    <p>${product.price?string}
    <p>${product.title}



<#else>
No message
</#list>
</div>
<div>
    <form method="post" >
        <input type="text" name="title" placeholder="title">
        <input type="number" name="amount" placeholder="amount">
        <input type="number" name="price" placeholder="price">
        <input type="text" name="description" placeholder="description">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="submit"> go</button>
    </form>


</div>
</body>
</html>

</@c.page>