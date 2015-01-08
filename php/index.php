<?php

require "vendor/autoload.php";

$app = new \Slim\Slim();

$app->get("/", function() use ($app) {
		echo "index";
	});

$app->get("/sms", function() use ($app) {
		$url = "http://nick.gs:6600/sms";
		$headers = array("accept" => "application/json");
		$options = array();
		$results = Requests::get($url, $headers, $options);
		echo "<pre>";
		$body = $results->body;
		print_r($body);
		echo "<hr>";
		print_r( json_decode($body) );
		echo "<hr>";
		print_r($results);
	});

$app->run();
?>