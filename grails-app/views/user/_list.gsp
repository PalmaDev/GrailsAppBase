<div class="table-responsive">
  <table class="table">
    <tr>
      <th>Usuario</th>
      <th>Estatus</th>
      <th>Roles</th>
    </tr>
    <g:each in="${users}" var="user">
      <tr>
        <td>${user.username}</td>
        <td>${user.enabled}</td>
        <td>
          <g:each in="${user.getAuthorities()}" var="role">
            ${role.authority}<br/>
          </g:each>
        </td>
      </tr>
    </g:each>
  </table>
  <nav>
    <ul class="pagination">
      <g:paginate class="pagination" controller="user" action="list" total="${usersCount}" />
    </ul>
  </nav>
</div>
