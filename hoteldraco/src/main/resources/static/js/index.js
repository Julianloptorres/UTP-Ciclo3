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
    let reserva = {
        fechaIngreso: document.getElementById("chekin-date").value,
        fechaSalida: document.getElementById("chekout-date").value,
        adultos: document.getElementById("adulto").value,
        ninos: document.getElementById("ninos").value,
        habitaciones: document.getElementById("habitacion").value

    };

    localStorage.setItem("reserva", JSON.stringify(reserva));
}

