<?php

$x = "2014-05-06";
$y = -1;

echo "\n";
echo date('Y-m-d', strtotime($x . " $y months"));
echo "\n\n";

$lid = "010000000000098765 drop table junk;";
$flid = filter_var($lid, FILTER_SANITIZE_NUMBER_INT);
var_dump($lid);
var_dump($flid);


