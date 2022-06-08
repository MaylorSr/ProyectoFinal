document.getElementById("nombre").addEventListener("blur", evaluarNombre);
document.getElementById("telefonoCliente").addEventListener("blur", evaluarNumeroTelefono);
document.getElementById("fecha").addEventListener("blur", evaluarFecha);
document.getElementById("hora").addEventListener("blur", evaluarHora);

function revisarFormularioCitas() {
	let resultado = false;
	resultado = evaluarNombre() &&
		evaluarNumeroTelefono() &&
		evaluarFecha() &&
		evaluarHora();

	formularioCitas.enviar.className = resultado ? "btn btn-success mb-2" : "btn btn-danger mb-2";
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
	let comprobante = /^\d{9}$/;
	let resultado = campoTelefono.value !== "" && !isNaN(formulario.telefonoCliente.value) && comprobante.test(campoTelefono.value);

	cambiarApariencia(campoTelefono, resultado);
	return resultado;

}

function evaluarFecha() {
	let campoFecha = formulario.fecha;
	let resultado = campoFecha.value != "";


	if (resultado) {
		campoFecha.valueAsDate;
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










