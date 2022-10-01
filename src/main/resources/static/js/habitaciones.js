const guardarHabitacion = () => {
    let reservaHabitacion = {
        fechaIngreso: document.getElementById("chekin-date").value,
        fechaSalida: document.getElementById("chekout-date").value,
        adultos: document.getElementById("adulto").value,
        ninos: document.getElementById("ninos").value,
        

    };

    localStorage.setItem(reserva, JSON.stringify(reservaHabitacion));

}