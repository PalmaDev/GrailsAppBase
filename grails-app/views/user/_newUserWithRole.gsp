<div class="row">
  <div class="col-md-6 col-md-offset-3">
    <div class="form-group">
      <div class="row">
        <label>Nombre de Usuario: *</label>
        <input class="form-control" type="text" maxLength="10" name="username"/>
      </div>
    </div>
    <div class="form-group">
      <div class="row">
        <label>Rol: *</label>
        <g:select class="form-control" name="roleId" from="${roles}" optionKey="id" optionValue="authority"/>
      </div>
    </div>

  </div>
</div>
