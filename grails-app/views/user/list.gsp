<!DOCTYPE html>
<html lang="en">
  <head>
    <meta name="layout" content="main">
  </head>
  <body>
      <div class="page-title">
        <h1>
          <i class="fa fa-users fa-lg"></i>
          Gestión de Usuarios
        </h1>
        <h2> <small>Lista de Usuarios</small></h2>
      </div>

      <div class="row">
      <div class="portlet">
        <div class="portlet-body">
          <g:render template="list"/>
          <div class="row">
            <div class="col-md-3 col-md-offset-9 text-center">
              <g:link class="btn btn-danger btn-block" controller="dashboard" action="index">Cancelar</g:link>
            </div>
          </div>
        </div>
      </div>
      </div>
  </body>
</html>
