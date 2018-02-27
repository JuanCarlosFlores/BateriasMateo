$('document').ready(function(){
			$('#nombreAlmacen').text('Nombre: '+$('#nameHidden').val());
			$('#capacidadAlmacen').text('Capacidad: '+$('#cantHidden').val());
			$('#cantidadAlmacen').text('Cantidad Actual: '+$('#countHidden').val());
		})