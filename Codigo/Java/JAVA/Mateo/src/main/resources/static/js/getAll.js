$( document ).ready(function() {
	
	var url = window.location;
	
	// PETISION
	$("#getBateriasBtn").click(function(event){
		event.preventDefault();
		ajaxGet();
	});
	
	// Implementacion
	function ajaxGet(){
		$.ajax({
			type : "GET",
			url :"http://localhost:9999/baterias/rest/all",
			success: function(result){
				if(result.status == "Done"){
					$('#getResultDiv .list-group li').remove();
					var custList = "";
					$.each(result.data, function(i, bateria){
						var bateria = "Bateria " + i + ": Nombre=" + bateria.descripcion + " ,bateriaTipo=" + bateria.bateriaTipo.nombre + "<br\>";
						$('#getResultDiv .list-group').append('<li><h4 class="list-group-item">'+customer+'</h4></li>')
			        });
					console.log("Success: ", result);
				}else{
					$("#getResultDiv").html("<strong>Error</strong>");
					console.log("Fail: ", result);
				}
			},
			error : function(e) {
				$("#getResultDiv").html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});	
	}
})