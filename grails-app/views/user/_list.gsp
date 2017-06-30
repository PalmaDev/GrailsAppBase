<div class="table-responsive">
  <table class="table">
    <tr>
      <th>Usuario</th>
      <th>Estatus</th>
      <th>Roles</th>
    </tr>
    <g:each in="${usersList}" var="user">
      <tr>
        <td>${user.username}</td>
        <td><g:message code="user.status.${user.enabled}"/></td>
        <td>
          <g:each in="${user.getAuthorities()}" var="role">
            ${role.authority}<br/>
          </g:each>
        </td>
      </tr>
    </g:each>
  </table>
</div>

