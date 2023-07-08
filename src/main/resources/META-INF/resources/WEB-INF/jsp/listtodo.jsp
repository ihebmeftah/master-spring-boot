<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="webjars/bootstrap/5.3.0/css/bootstrap.min.css">
    <title>Todos</title>
  </head>
  <body>
  <div class="container">
    <h1>Welcome ${name}</h1>
    <table class="table">
      <thead>
      <tr>
        <th>id</th>
        <th>description</th>
        <th>Target date</th>
        <th>done</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach items="${todoList}" var="todo">
        <tr>
          <td>${todo.id}</td>
          <td>${todo.desc}</td>
          <td>${todo.date}</td>
          <td>${todo.done}</td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
    <a href="addtodo" class="btn btn-success">add</a>
  </div>
  <script src="webjars/bootstrap/5.3.0/js/bootstrap.min.js"></script>
  <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
  </body>
</html>
