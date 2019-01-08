<#import "parts/common.ftl" as c>

<@c.page>
    <form method="get">
    <#list cartItems as cartItem>
        <div class="card my-3">
 <div class="m-2">

    <span> ${cartItem.productAmount}</span>
    Количество
     <span> ${cartItem.product}</span>
     номер товара


    <#else >

        nothing

    </#list>
    <div class="alert alert-success" role="alert">
    Сумма
      <span>${sum?string}</span>
    </div>

   <a class="btn btn-primary" href="/purchase" role="button">оформить заказ</a>

    </form>
</@c.page>