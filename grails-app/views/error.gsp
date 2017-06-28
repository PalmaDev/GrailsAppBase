<!doctype html>
<html>
    <head>
      <title><g:if env="development">Grails Runtime Exception</g:if><g:else><g:message code="error.page.title"/></g:else></title>
        <meta name="layout" content="main">
        <g:if env="development"><asset:stylesheet src="errors.css"/></g:if>
    </head>
    <body>
      <div class="row">
        <div class="col-md-10 col-md-offset-1">
          <div class="panel panel-warning">
            <div class="panel-heading">
              <h2>
                <g:img dir="images" file="error.png" class="img-rounded" width="20" height="20"/>&nbsp;
                Evento no esperado
              </h2>
            </div>
            <div class="panel-body">

              <g:if env="development">
                <g:if test="${Throwable.isInstance(exception)}">
                  <g:renderException exception="${exception}" />
                </g:if>
                <g:elseif test="${request.getAttribute('javax.servlet.error.exception')}">
                  <g:renderException exception="${request.getAttribute('javax.servlet.error.exception')}" />
                </g:elseif>
                <g:else>
                  <ul class="errors">
                    <li>An error has occurred</li>
                    <li>Exception: ${exception}</li>
                    <li>Message: ${message}</li>
                    <li>Path: ${path}</li>
                  </ul>
                </g:else>
              </g:if>
              <g:else>
                <div class="text-center">
                  <g:img dir="images" file="error.png" class="img-rounded" width="200" height="200"/>
                  <p><label><g:message code="error.message.production.environment"/></label></p>
                </div>
              </g:else>

            </div>
          </div>
        </div>
      </div>
    </body>
</html>
