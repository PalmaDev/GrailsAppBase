<div class="table-responsive">
  <table class="table">
    <tr>
      <th>Usuario</th>
      <th>Estatus</th>
      <th>Acciones</th>
    </tr>
    <g:each in="${usersList}" var="user">
      <tr>
        <td>${user.username}</td>
        <td><g:message code="user.status.${user.enabled}"/></td>
        <td>
          <g:if test="${user.enabled}">
            <g:link class="btn btn-default" title="Desactivar"><i class="fa fa-toggle-off"></i></g:link>
          </g:if>
          <g:else>
            <g:link class="btn btn-default" title="Activar"><i class="fa fa-toggle-on"></i></g:link>
          </g:else>
          <g:link class="btn btn-default" title="Permisos"><i class="fa fa-shield"></i></g:link>

        </td>
      </tr>
    </g:each>
  </table>
  <nav class="text-center">
    <div class="pagination">
      <g:paginate class="pagination" controller="user" action="list" total="${usersCount}" />
    </div>
  </nav>
</div>

