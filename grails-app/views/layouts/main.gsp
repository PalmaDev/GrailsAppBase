<!doctype html>
<html lang="en" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title><g:message code="main.layout.page.title"/></title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <asset:stylesheet src="application.css"/>
        <asset:javascript src="application.js"/>

        <g:layoutHead/>
    </head>
    <body>
      <div class="navbar-wrapper">
        <div class="container">

          <nav class="navbar navbar-inverse navbar-static-top">
            <div class="container-fluid">
              <div class="navbar-header">
                <g:link class="navbar-brand" controller="home">
                <span class="glyphicon glyphicon-home" aria-hidden="true"></span>
                </g:link>
              </div>
              <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                  <li><p class="navbar-text">Base Aplication</p></li>

                  <sec:ifAnyGranted roles="SUPER_USER">
                  <li role="presentation" class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                      Administración <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                      <li>
                        <g:link controller="user" action="createUserAdmin">
                          Crear Usuario Administrador
                        </g:link>
                      </li>
                      <li>
                        <g:link controller="user" action="list">
                          Lista de Usuarios
                        </g:link>
                      </li>
                    </ul>
                  </li>
                  </sec:ifAnyGranted>

                </ul>
                <ul class="nav navbar-nav navbar-right">
                  <li><p class="navbar-text">baseAppGrails v1.0</p></li>
                  <sec:ifLoggedIn>
                  <li>
                    <g:link controller="logout" action="index">
                    <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                    </g:link>
                  </li>
                  </sec:ifLoggedIn>
                </ul>
              </div>
            </div>
          </nav>

        </div>
      </div>

      <div id="page-wrapper">
        <div class="page-content page-content-ease-in">
          <div class="row">
            <div class="col-lg-1"></div>
            <div class="col-lg-10">
              <g:layoutBody/>
            </div>
            <div class="col-lg-1"></div>
          </div>
        </div>
      </div>

        <div class="footer" role="contentinfo"></div>
        <div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
    </body>
</html>
