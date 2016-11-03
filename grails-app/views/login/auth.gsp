<html>
  <head>
    <meta name="layout" content="main"/>
 </head>

  <body>
    <div class="container">
      <div class="row">
        <div class="col-md-4 col-md-offset-4">
         <div class="portlet-body">

        <g:if test='${flash.message}'>
        <div class="alert alert-danger">${flash.message}</div>
        </g:if>

        <form action="${postUrl ?: '/login/authenticate'}" method="POST" id="loginForm" class="cssform" autocomplete="off">
         <div class="form-group">
            <label for="username"><g:message code='springSecurity.login.username.label'/>:</label>
            <input type="text" class="form-control" name="${usernameParameter ?: 'username'}" id="username"/>
          </div>

          <div class="form-group">
            <label for="password"><g:message code='springSecurity.login.password.label'/>:</label>
            <input type="password" class="form-control" name="${passwordParameter ?: 'password'}" id="password"/>
          </div>

          <div class="form-group">
            <button type="submit" class="btn btn-primary btn-lg btn-block">Ingresa</button>
          </div>
        </form>
            </div>
          </div>
       </div>
    </div>
    <script>
(function() {
  document.forms['loginForm'].elements['${usernameParameter ?: 'username'}'].focus();
  })();
    </script>
  </body>
</html>
