<?php

require_once 'vendor/autoload.php';

// Database Config
// ===============

ORM::configure("sqlite:./checkboxes.db");

// Define Routes
// =============

$app = new \Slim\Slim();

$app->get("/", function() {
	echo "Hello!";
});

// Exec Application
// ================

$app->run();