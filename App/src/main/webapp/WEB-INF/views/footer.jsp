	  
	  </div>

      <!-- Site footer -->
      <footer class="footer">
        <p>&copy; SGC - SGC - Syst&egrave;me de gestion des cours 2015</p>
      </footer>

    </div> <!-- /container -->
    
	
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>	
	
	<script>

	function demo_create() {
		var ref = $('#jstree').jstree(true),
			sel = ref.get_selected();
		if(!sel.length) { return false; }
		sel = sel[0];
		sel = ref.create_node(sel, {"type":"file"});
		if(sel) {
			ref.edit(sel);
		}
	};
	function demo_rename() {
		var ref = $('#jstree').jstree(true),
			sel = ref.get_selected();
		if(!sel.length) { return false; }
		sel = sel[0];
		ref.edit(sel);
	};
	function demo_delete() {
		var ref = $('#jstree').jstree(true),
			sel = ref.get_selected();
		if(!sel.length) { return false; }
		ref.delete_node(sel);
	};

	  $(function () {	
			var to = false;
			$('#demo_q').keyup(function () {
				if(to) { clearTimeout(to); }
				to = setTimeout(function () {
					var v = $('#demo_q').val();
					$('#jstree').jstree(true).search(v);
				}, 250);
			});
 
		  
	    // 6 create an instance when the DOM is ready
	    $('#jstree').jstree();
	    // 7 bind to events triggered on the tree
	    $('#jstree').on("changed.jstree", function (e, data) {
	      console.log(data.selected);
	    });
	    // 8 interact with the tree - either way is OK
	    $('button').on('click', function () {
	      $('#jstree').jstree(true).select_node('child_node_1');
	      $('#jstree').jstree('select_node', 'child_node_1');
	      $.jstree.reference('#jstree').select_node('child_node_1');
	    });
	  });
	  
	  
	</script>
	
</body>
</html>



