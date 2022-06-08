document.getElementById("nombre").addEventListener("blur", evaluarNombre);
document.getElementById("email").addEventListener("blur", evaluarCorreo);
document.getElementById("descripcion").addEventListener("blur", evaluarDescripcion);

function revisarFormularioContacto() {
	let resultado = false;
	resultado = evaluarNombre() &&
		evaluarCorreo() &&
		evaluarDescripcion();

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

function evaluarNombre() {
	let campoNombre = formulario.nombre;
	let resultado = campoNombre.value !== "";
	cambiarApariencia(campoNombre, resultado);
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


function evaluarDescripcion() {
	let campoDescripcion = formulario.descripcion;
	let resultado = campoDescripcion.value != "";

	if (resultado) {
		resultado = campoDescripcion.value.length >= 5 || campoDescripcion.value.lenght <= 250;
	}

	cambiarApariencia(campoDescripcion, resultado);
	return resultado;
}