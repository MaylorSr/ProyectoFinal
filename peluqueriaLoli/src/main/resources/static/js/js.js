document.getElementById("nombre").addEventListener("blur", evaluarNombre);
document.getElementById("telefonoCliente").addEventListener("blur", evaluarNumeroTelefono);
document.getElementById("fecha").addEventListener("blur", evaluarFecha);
document.getElementById("hora").addEventListener("blur", evaluarHora);
document.getElementById("email").addEventListener("blur", evaluarCorreo);
document.getElementById("descripcion").addEventListener("blur", evaluarDescripcion);
document.getElementById("precio").addEventListener("blur", evaluarPrecio);
document.getElementById("imagen").addEventListener("blur", evaluarUrl);
document.getElementById("duracion").addEventListener("blur", evaluarDuracion);
document.getElementById("descripcion2").addEventListener("blur", evaluarDescripcionArea);


function revisarFormularioCitas() {
	let resultado = false;
	resultado = evaluarNombre() &&
		evaluarNumeroTelefono() &&
		evaluarFecha() &&
		evaluarHora();

	formularioCitas.enviar.className = resultado ? "btn btn-success mb-2" : "btn btn-danger mb-2";
	return resultado;
}


function revisarFormularioServicios() {
	let resultado = false;
	resultado = evaluarNombre() &&
		evaluarDescripcion() &&
		evaluarPrecio() &&
		evaluarUrl() &&
		evaluarDuracion();

	formularioServicio.enviar.className = resultado ? "btn btn-success mb-2" : "btn btn-danger mb-2";
	return resultado;
}

function revisarFormularioContacto() {
	let resultado = false;
	resultado = evaluarNombre() &&
		evaluarCorreo() &&
		evaluarDescripcionArea();

	formularioContacto.enviar.className = resultado ? "btn btn-success mb-2" : "btn btn-danger mb-2";
	return resultado;
}

function cambiarApariencia(campo, estado) {
	if (estado) {
		campo.classList.remove("border-danger");
		campo.classList.add("border-success");
		campo.parentNode.nextElementSibling.style.visibility = 'hidden';
	}
	else {
		campo.classList.remove("border-success");
		campo.classList.add("border-danger");
		campo.parentNode.nextElementSibling.style.visibility = 'visible';
	}
}

function evaluarDescripcionArea() {
	let campoDescripcion = formulario.descripcion2;
	let resultado = campoDescripcion.value !== "";
	cambiarApariencia(campoDescripcion, resultado);
	return resultado;
}

function evaluarNombre() {
	let campoNombre = formulario.nombre;
	let resultado = campoNombre.value !== "";
	cambiarApariencia(campoNombre, resultado);
	return resultado;
}

function evaluarNumeroTelefono() {
	let campoTelefono = formulario.telefonoCliente;
	let resultado = campoTelefono.value !== "" && !isNaN(formulario.telefonoCliente.value);

	var regex = new RegExp('^\([0-9]{2}\)((3[0-9]{3}-[0-9]{4})|(9[0-9]{3}-[0-9]{5}))$');

	if (resultado) {
		resultado = campoTelefono.value.length >= 9 || campoTelefono.value.lenght <= 12 && regex.test(campoTelefono);
	}

	cambiarApariencia(campoTelefono, resultado);
	return resultado;

}

function evaluarCorreo() {
	let correo = formulario.email;
	let resultado = correo.value !== "";


	if (resultado) {
		let partesCorreo = correo.value.split('@');
		resultado = partesCorreo.length == 2;
		if (resultado) {
			let partesDominio = partesCorreo[1].split('.');
			resultado = partesDominio.length > 1;
		}
	}

	cambiarApariencia(correo, resultado);

	return resultado;
}


function evaluarFecha() {
	let campoFecha = formulario.fecha;
	let resultado = campoFecha.value != "";


	if (resultado) {
		let fechaDate = campoFecha.valueAsDate;
		let hoy = new Date().toISOString().slice(0, 10);;

		resultado = campoFecha.value > hoy ||
			(campoFecha.value == hoy) ||
			(campoFecha.value == hoy && campoFecha.getMonth().value == hoy.getMonth() && campoFecha.getDate().value >= hoy.getDate());
	}

	cambiarApariencia(campoFecha, resultado);
	return resultado;
}


function evaluarHora() {
	let campoHora = formulario.hora;
	let resultado = campoHora.value != "";
	cambiarApariencia(campoHora, resultado);
	return resultado;
}

function evaluarDescripcion() {
	let campoDescripcion = formulario.descripcion;
	let resultado = campoDescripcion.value != "";

	if (resultado) {
		resultado = campoDescripcion.value.length >= 5 || campoDescripcion.value.lenght <= 250;
	}

	cambiarApariencia(campoDescripcion, resultado);
	return resultado;
}


function evaluarPrecio() {
	let campoPrecio = formulario.precio;
	let resultado = campoPrecio.value != "";
	let min = 1;
	if (resultado) {

		resultado = campoPrecio.value >= min;
	}
	cambiarApariencia(campoPrecio, resultado);

	return resultado;
}


function evaluarUrl() {
	let campoUrl = formulario.imagen;
	var resultado = /(?:https?):\/\/(\w+:?\w*)?(\S+)(:\d+)?(\/|\/([\w#!:.?+=&%!\-\/]))?/.test(campoUrl.value);
	cambiarApariencia(campoUrl, resultado);

	return resultado;
}


function evaluarDuracion() {
	let campoDuracion = formulario.duracion;
	let resultado = campoDuracion.value !== "" && !isNaN(campoDuracion.value);

	if (resultado) {
		resultado = campoDuracion.value >= 0 || campoDuracion.value <= 2.5;
	}

	cambiarApariencia(campoDuracion, resultado);
	return resultado;

}S










