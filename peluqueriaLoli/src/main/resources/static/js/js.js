/*document.getElementById("nombre").addEventListener("blur", comprobarNombre);
document.getElementById("email").addEventListener("blur", comprobarCorreo);
document.getElementById("telefono").addEventListener("blur", comprobarTelefono);
document.getElementById("precio").addEventListener("blur", comprobarPrecio);


function revisarFormulario() {
	let resultado = false;

	//en las siguientes llamadas encadenadas con && hay que tener en cuenta que en el momento 
	//en el que una de las llamadas devuelva false, ya no se realizarán las siguientes
	resultado = comprobarNombre() &&
		comprobarCorreo() &&
		formulario.enviar.className(resultado ? "btn btn-success mb-2" : "btn btn-danger mb-2");
	return false; //lo tengo a false para que nunca envíe el formulario, cuando esto entrara en producción, habría que poner return resultado;
}

function comprobarCorreo() {
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
}*/