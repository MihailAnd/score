<#import "parts/common.ftl" as c>

<@c.page>

    <input class="form-control" type="text" placeholder=${user.username} readonly>

   <form method="post" class="needs-validation" novalidate>
  <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="validationCustom01">Фио</label>
      <input type="text" class="form-control" id="validationCustom01" name="fullname" placeholder="Фио" required>
      <div class="valid-feedback">
        Looks good!
      </div>
    </div>
      <div class="col-md-4 mb-3">
          <label for="validationCustom02">Last name</label>
          <input type="number" class="form-control" id="validationCustom02" name="phonenumber" placeholder="номер телефона" value="80" required>
          <div class="valid-feedback">
              Looks good!
          </div>
      </div>

  </div>
  <div class="form-row">
    <div class="col-md-6 mb-3">
      <label for="validationCustom03">Город</label>
      <input type="text" class="form-control" id="validationCustom03" name="city" placeholder="Город доставки" required>
      <div class="invalid-feedback">
          Пожалуйста укажите город.
      </div>
    </div>
    <div class="col-md-3 mb-3">
      <label for="validationCustom04">Адресс</label>
      <input type="text" class="form-control" id="validationCustom04" name="address" placeholder="Адресс доставки" required>
      <div class="invalid-feedback">
        Пожалуйста укажите адресс.
      </div>
    </div>
      <div class="form-group">
          <select class="custom-select" name="delivery" required>
              <option value="">Выбирите способ доставки</option>
              <option value="1">Укр почта</option>
              <option value="2">Новая почта</option>

          </select>
          <div class="invalid-feedback">Example invalid custom select feedback</div>
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
      <label class="form-check-label" for="invalidCheck">
        Подтвердите заказ.
      </label>
      <div class="invalid-feedback">
        Вы должны подтвердить.
      </div>
    </div>
  </div>
  <button class="btn btn-primary" type="submit">Оформить заказ</button>
   </form>

<script>
// Example starter JavaScript for disabling form submissions if there are invalid fields
(function() {
  'use strict';
  window.addEventListener('load', function() {
    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    var forms = document.getElementsByClassName('needs-validation');
    // Loop over them and prevent submission
    var validation = Array.prototype.filter.call(forms, function(form) {
      form.addEventListener('submit', function(event) {
        if (form.checkValidity() === false) {
          event.preventDefault();
          event.stopPropagation();
        }
        form.classList.add('was-validated');
      }, false);
    });
  }, false);
})();
</script>




</@c.page>