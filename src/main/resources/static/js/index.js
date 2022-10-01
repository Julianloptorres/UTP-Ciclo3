const loadFechas = () => {
    let date = new Date();

        var day = date.getDate();
        var month = date.getMonth() + 1;
        var year = date.getFullYear();

        if (month < 10) month = "0" + month;
        if (day < 10) day = "0" + day;

        const init_date = year + "-" + month + "-" + day;

        document.getElementById("chekin-date").value = init_date
        document.getElementById("chekout-date").value = init_date
}

const guardarReserva = () => {
    
        let fechaIngreso= document.getElementById("chekin-date").value;
        let fechaSalida= document.getElementById("chekout-date").value;
        let adultos= document.getElementById("adulto").value;
        let ninos= document.getElementById("ninos").value;
        

    

    localStorage.setItem("fechaIngreso", JSON.stringify(fechaIngreso));
    localStorage.setItem("fechaSalida", JSON.stringify(fechaSalida));
    localStorage.setItem("adultos", JSON.stringify(adultos));
    localStorage.setItem("ninos", JSON.stringify(ninos));
   
}

