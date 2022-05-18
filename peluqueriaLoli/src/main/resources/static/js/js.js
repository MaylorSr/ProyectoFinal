/*(function() {
	'use strict';
	window.addEventListener('load', function() {
		let forms = document.getElementsByClassName('needs-validation');
		let validation = Array.prototype.filter.call(forms, function(form) {
			form.addEventListener('submit', function(event) {
				if (form.checkValidity() === false) {
					event.preventDefault();
					event.stopPropagation();
				}
				form.classList.add('was-validated');
			}, false);
		});
	}, false);
})();*/

function validar2() {
	var regex = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	nombre = document.getElementById("nombre");
	email = document.getElementById("email");
	if (nombre.value === '') {
		alert('Escriba el nombre');
		nombre.focus;
		return false;
	}

	if (email.value === '' || !regex.test(email.value)) {
		alert('Email inválido');
		return false;
	}

	return true;
}

function validar1() {
	nombre = document.getElementById("nombre");
	telefono = document.getElementById("telefono");
	fecha = document.getElementById("fecha");
	hora = document.getElementById("hora");

	if (nombre.value === '') {
		alert('Escriba el nombre');
		return false;

	}

	if (telefono.value === '') {
		alert('Escriba el número de teléfono correcto');
		return false;
	}

	if (fecha.value === '') {
		alert('Escriba la fecha');
		return false;
	}

	if (hora.value === null) {
		alert('Escriba la hora');

		return false;
	}


	return true;
}


function validar3() {
	nombre = document.getElementById("nombre");
	duracion = document.getElementById("duracion");
	precio = document.getElementById("precio");
	if (nombre.lenght === null || nombre.value === '') {
		alert('Escriba el nombre');
		return false;

	}

	if (precio.value === null || precio.value < 1) {
		alert('Escriba un precio correcto');
		return false;

	}

	if (duracion.value === null) {
		alert('Escriba una duración razonable')
		return false;
	}


	return true;
}

function validar4() {
	nombre = document.getElementById("nombre");
	telefono = document.getElementById("telefono");
	fecha = document.getElementById("fecha");
	hora = document.getElementById("hora");

	if (nombre.value === '') {
		alert('Escriba el nombre');
		return false;

	}

	if (telefono.value === '') {
		alert('Escriba el número de teléfono correcto');
		return false;
	}

	if (fecha.value === '') {
		alert('Escriba la fecha');
		return false;
	}

	if (hora.value === null) {
		alert('Escriba la hora');

		return false;
	}


	return true;
}