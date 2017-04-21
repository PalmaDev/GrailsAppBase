<!DOCTYPE html>
<html lang="en">
  <head>
    <meta name="layout" content="main">
  </head>
  <body>
    <div class="container-fluid">
      <div class="page-title">
        <h1>
          <i class="icon-factura fa-3x"></i>
          Gestión de Usuarios
          <small>Crear Usuario</small>
        </h1>
      </div>

      <div class="row">
      <div class="portlet">
        <div class="portlet-body">
          <g:form action="saveWithRole">
            <g:render template="newUserWithRole"/>
            <div class="row">
              <div class="col-md-3 col-md-offset-3 text-center">
                <button class="btn btn-primary btn-block">Guardar</button>
              </div>
              <div class="col-md-3 text-center">
                <g:link class="btn btn-danger btn-block" controller="dashboard" action="index">Cancelar</g:link>
              </div>
            </div>
          </g:form>
        </div>
      </div>
      </div>
    </div>
  </body>
</html>
