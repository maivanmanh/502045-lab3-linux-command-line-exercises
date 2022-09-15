<?php 

    require_once('connection.php');

    $conn = new mysqli(HOST, USER, PASS, null, DB_PORT);

    if ($conn->connect_error) {
        die('Can not connect to server: ' . $conn->connect_error);
    }

    echo 'Connected to database server';

?>

