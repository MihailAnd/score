<#import "parts/common.ftl" as c>

<@c.page>

<form method="post">
<#list products as product>
<div class="card" style="width: 18rem;">
 <div class="card-body">
    <h5 class="card-header">${product.id}</h5>
    <h5 class="card-title"> ${product.title}</h5>
    <p class="card-text"> ${product.description}</p>
    <span>${product.amount}</span>
    <span>${product.price} </span>

        <input type="hidden"  name="productAmount" value="1" >
        <input type="hidden" value="${product.getId()}" name="productId">
<button type="submit" class="btn btn-primary">Добавить в корзину</button>
<input type="hidden" value="${_csrf.token}" name="_csrf">



 </div>
</div>


<#else >

nothing

</#list>

    </form>

</@c.page>