<!DOCTYPE html>
<html>
<head>
  <title>Login Page</title>
  <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<style>
    body {
  font-family: Arial, sans-serif;
  background-color: #f2f2f2;
}

.container {
  max-width: 400px;
  margin: 0 auto;
  padding: 40px;
  background-color: #fff;
  border-radius: 5px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

h2 {
  text-align: center;
  color: #333;
}

form {
  margin-top: 20px;
}

.input-group {
  margin-bottom: 20px;
}

.input-group label {
  display: block;
  margin-bottom: 5px;
  color: #777;
}

.input-group input {
  width: 100%;
  padding: 10px;
  font-size: 16px;
  border-radius: 5px;
  border: 1px solid #ccc;
}

button {
  display: block;
  width: 100%;
  padding: 10px;
  font-size: 16px;
  font-weight: bold;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 5px;
  cursor: pointer;
}

button:hover {
  background-color: #45a049;
}
</style>
<body>
  <div class="container">
    <h2>Login</h2>
    <form method="post">
      <div class="input-group">
        <label for="username">Username</label>
        <input type="text" id="username" name="name" placeholder="Enter your username" value="${name}">
      </div>
      <div class="input-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Enter your password" value="${name}">
      </div>
      <pre>${error}</pre>
      <button type="submit">Login</button>
    </form>
  </div>
</body>
</html>
