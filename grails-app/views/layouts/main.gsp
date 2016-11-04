<!doctype html>
<html lang="en" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title><g:layoutTitle default="SISCAIM-v2"/></title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <asset:stylesheet src="application.css"/>
        <asset:javascript src="application.js"/>
        <style>
          body {
            background-color: #AAD9C0;
          }
        </style>
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
                    <li><p class="navbar-text">Sistema de Control Administrativo Integral MARBA</p></li>
                  </ul>
                  <ul class="nav navbar-nav navbar-right">
                    <li><p class="navbar-text">SISCAIM v2.0</p></li>
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
            <g:layoutBody/>
          </div>
        </div>

        <div class="footer" role="contentinfo"></div>
        <div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
    </body>
</html>
