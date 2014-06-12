<?php

require_once 'vendor/autoload.php';

// Application Config
// ==================

$DB_HOST = 'localhost';
$DB_PORT = 3600;
$DB_USER = 'root';
$DB_PASS = 'securedatabase';
$DB_NAME = 'checkbox';

// Database Config
// ===============

ORM::configure("mysql:host=$DB_HOST;dbname=$DB_NAME");
ORM::configure("username", $DB_USER);
ORM::configure("password", $DB_PASS);

// Helper Functions
// ================


// Define Routes
// =============

$app = new \Slim\Slim();

$app->get("/", function() {
	echo "Hello!";
});

$app->get("/group/:id", function($id) {
		$id = (int) $id;
		$group = ORM::for_table("groups")->find_one($id);
		$items = ORM::for_table("items")->where("group_id",$id)->find_many();
		echo "<h1>Group: " . $group->name . "</h1> <ul>";
		foreach ($items as $item) {
			$s = $item->state == 1 ? "CHECKED" : "UN CHEC";
			printf("<li>%s - %s</li>", $s, $item->title);
		}
		echo "</ul>";
	});

$app->get("/groups", function() {
		$groups = ORM::for_table("groups")->find_many();
		foreach ($groups as $g) {
			printf("ID: %d NAME: %s<br>", $g->id, $g->name);
		}
	});	

$app->get("/new-group", function() {
		$group = ORM::for_table("groups")->create();
		$group->name = "Hello " . date('r');
		$group->save();

		for ($i=0; $i<10; $i++) {
			$item = ORM::for_table("items")->create();
			$item->title = "I am item $i";
			$item->group_id = $group->id;
			$item->save();
		}
		echo "Created: " . $group->id;
	});

$app->get("/phpinfo", function() {
		phpinfo();
	});

// Exec Application
// ================


$app->run();