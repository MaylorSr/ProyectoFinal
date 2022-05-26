document.getElementById("nombre").addEventListener("blur", evaluarNombre);
document.getElementById("telefonoCliente").addEventListener("blur", evaluarNumeroTelefono);
document.getElementById("correo").addEventListener("blur", evaluarCorreo);
document.getElementById("fecha").addEventListener("blur", evaluarFecha);
document.getElementById("hora").addEventListener("blur", evaluarHora);
document.getElementById("descripcion").addEventListener("blur", evaluarDescripcion);
document.getElementById("precio").addEventListener("blur", evaluarPrecio);



function revisarFormulario() {
	let resultado = false;

	resultado = evaluarNombre() &&
		evaluarNumeroTelefono() &&
		evaluarCorreo() &&
		evaluarFecha() &&
		evaluarHora() &&
		evaluarDescripcion() &&
		evaluarPrecio();


	formulario.enviar.className = resultado ? "btn btn-success mb-2" : "btn btn-danger mb-2";

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



function evaluarNombre() {
	let campoNombre = formulario.nombre;
	let resultado = campoNombre.value !== "";

	cambiarApariencia(campoNombre, resultado);
	return resultado;
}

function evaluarNumeroTelefono() {
	let campoTelefono = formulario.telefonoCliente;
	let resultado = campoTelefono.value !== "";
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
		hoy = new Date();
		let fechaDate = fecha.valueAsDate;
		resultado = (hoy.getMonth() > fechaDate.getMonth()) || (hoy.getMonth() == fechaDate.getMonth() && hoy.getDate() >= fechaDate.getDate())
	}
	cambiarApariencia(campoFecha, resultado);

	return resultado;
}

function evaluarHora() {
	let campoHora = formulario.hora;
	let resultado = campoHora.value != "";

	var horaApetura = new Time('16:30');
	var horaCierre = new Time('19:30');

	if (resultado) {
		resultado = horaApetura.value > campoHora && campoHora < horaCierre.value;
	}
	cambiarApariencia(campoHora, resultado);

	return resultado;
}


function evaluarDescripcion() {
	let campoDescripcion = formulario.descripcion;
	let resultado = campoDescripcion.value !== "";

	cambiarApariencia(campoDescripcion, resultado);
	return resultado;
}


function evaluarPrecio() {
	let campoPrecio = formulario.precio;
	let resultado = campoPrecio.value != "";

	if (resultado) {

		resultado = campoPrecio > 0;
	}
	cambiarApariencia(campoPrecio, resultado);

	return resultado;
}









