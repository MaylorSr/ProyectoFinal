document.getElementById("nombre").addEventListener("blur", evaluarNombre);
document.getElementById("descripcion").addEventListener("blur", evaluarDescripcion);
document.getElementById("precio").addEventListener("blur", evaluarPrecio);
document.getElementById("imagen").addEventListener("blur", evaluarUrl);
document.getElementById("duracion").addEventListener("blur", evaluarDuracion);

function revisarFormularioServicios() {
	let resultado = false;
	resultado = evaluarNombre() &&
		evaluarDescripcion() &&
		evaluarUrl() &&
		evaluarDuracion() &&
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
	let resultado = campoDuracion.value !== '' && !isNaN(campoDuracion.value) && (campoDuracion.value >= 0.25 && campoDuracion.value <= 2.5) ;
	cambiarApariencia(campoDuracion, resultado);
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