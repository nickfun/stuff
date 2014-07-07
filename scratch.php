<?php

$x = "2014-05-06";
$y = -1;

echo "\n";
echo date('Y-m-d', strtotime($x . " $y months"));
echo "\n\n";