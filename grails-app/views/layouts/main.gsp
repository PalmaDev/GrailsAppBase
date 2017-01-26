<!doctype html>
<html lang="en" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title><g:layoutTitle default="Grails"/></title>
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
                </ul>
                <ul class="nav navbar-nav navbar-right">
                  <li><p class="navbar-text">baseAppGrails v1.0</p></li>
                </ul>
              </div>
            </div>
          </nav>

        </div>
      </div>
        <g:layoutBody/>
        <div class="footer" role="contentinfo"></div>
        <div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
    </body>
</html>
