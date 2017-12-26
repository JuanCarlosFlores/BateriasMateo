$('document').ready(function(){
			$('#nombreAlmacen').text($('#nameHidden').val());
			$('#capacidadAlmacen').text('Capacidad: '+$('#cantHidden').val());
		})