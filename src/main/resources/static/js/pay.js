const recuperarDatos = () => {
    
    document.getElementById("chekin-date").innerText = JSON.parse(localStorage.getItem("fechaIngreso"));
    
    document.getElementById("chekout-date").innerText = JSON.parse(localStorage.getItem("fechaSalida"));
    
    document.getElementById("adultos").innerText = JSON.parse(localStorage.getItem("adultos"));
    document.getElementById("ninos").innerText = JSON.parse(localStorage.getItem("ninos"));

      
}




