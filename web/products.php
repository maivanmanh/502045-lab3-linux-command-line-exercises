<?php 

    require_once('connection.php');

    $conn = new mysqli(HOST, USER, PASS, DB_NAME, DB_PORT);

    if ($conn->connect_error) {
        die('Can not connect to server: ' . $conn->connect_error);
    }

    $result = $conn->query('select * from product');
    

?>


<!DOCTYPE html>
<html lang="en">
<head>
  <title>Product Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>List of Products</h2>
  <table class="table table-hover">
    <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
      </tr>
    </thead>
    <tbody>
      <?php 
          while ($p = $result->fetch_assoc())
          {
              ?>
              <tr>
                <td><?= $p['id'] ?></td>
                <td><?= $p['name'] ?></td>
                <td><?= number_format($p['price']) ?> VND</td>
                <td><?= $p['description'] ?></td>
              </tr>
              <?php
          }
      ?>
      
      
    </tbody>
  </table>
</div>

</body>
</html>
