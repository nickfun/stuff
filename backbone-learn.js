var Character = Backbone.Model.extend();

var Cast = Backbone.Collection.extend({
    url: "/characters.json"
});

var cast = new Cast();

cast.fetch({
    success: function() {
	console.log("CAST was loaded from the server");
    }
});

