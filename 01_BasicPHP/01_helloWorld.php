<?php

$message = "";

if ($message) {
  echo $message . "!<br />";
} else {
  echo "You don't say anything!<br />";
}

$student = [
  "name" => "Piscki Pratama",
  "age" => 20,
  "domicile" => "Bandung",
  "major" => "Computer and Network Engineer"
];

print_r($student);
