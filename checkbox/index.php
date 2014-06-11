<?php

require_once 'vendor/autoload.php';

// Application Config
// ==================

$SQL_DATABASE = "./checkboxes.sqlite";
error_reporting(E_ALL);

// Database Config
// ===============

ORM::configure("sqlite:$SQL_DATABASE");

// Helper Functions
// ================

function initDatabase() {
	echo "Begin init database";
	$createItems = "
		CREATE TABLE IF NOT EXISTS items (
			id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
			title VARCHAR NOT NULL UNIQUE,
			status INTEGER NOT NULL,
			collection_id INTEGER NOT NULL
		);
	";
	$createCollections = "
		CREATE TABLE IF NOT EXISTS collections (
			id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
			name VARCHAR NOT NULL UNIQUE
		);
	";
	echo $createItems;
	$db = ORM::get_db();
	print_r($db);
	$r = $db->exec($createItems);
	echo "create 1: $r<hr>";
	$r = $db->exec($createCollections);
	echo "create 2: $r<hr>";	
}

// Define Routes
// =============

$app = new \Slim\Slim();

$app->get("/", function() {
	echo "Hello!";
});

$app->get("/phpinfo", function() {
		phpinfo();
	});

// Exec Application
// ================

if (!file_exists($SQL_DATABASE)) {
	echo "No Database";
	initDatabase();
}

$app->run();