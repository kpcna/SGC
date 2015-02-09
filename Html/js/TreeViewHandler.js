$(document).ready(function () {
	$.ajax({
		url : "http://localhost:8080/objectloadercontroller"
	}).then(function (data, status, jqxhr) {

		//$.each(data.elements, function(i, item)
		/*$.each(data, function(i, item)
	{
		alert(item);
		//$('.navigation-elements').append(item);

		});*/

		$(function () {
			$('#container').jstree({
				'core' : {
					'data' : data,
					animation : 0,
					strings : {
						new_node : 'The text you want', //this text will change the label when you create a new node
					}
				},
				"contextmenu" : {
					"items" : function ($node) {
						var tree = $("#container").jstree(true);
						return {
							"Create" : {
								"label" : "Create",
								"action" : function (obj) {
									$node = tree.create_node($node);
									tree.edit($node);
								},
							},
							"Rename" : {
								"separator_before" : false,
								"separator_after" : false,
								"label" : "Rename",
								"action" : function (obj) {
									tree.edit($node);
								}
							},
							"Remove" : {
								"separator_before" : false,
								"separator_after" : false,
								"label" : "Remove",
								"action" : function (obj) {
									tree.delete_node($node);
								}
							}
						};
					}
				},
				"plugins" : ["themes", 'crrm', "json_data", "ui", "contextmenu"]
			});

			$('#container').on("changed.jstree", function (e, data) {
				console.log(data.selected);
				$('#business').text(data.instance.get_node(data.selected).text);
			});
		});

	});
});