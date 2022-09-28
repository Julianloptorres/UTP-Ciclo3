const recuperarDatos = () => {
    let datos = JSON.stringify(localStorage.getItem("reserva"));
    console.log(datos);
    document.getElementById("adultos").innerHTML = datos;
    }



    // datos.array.forEach(element => {
    //     document.getElementById("adultos").innerText 
    // });
//     document.getElementById("adultos").innerText = JSON.parse(localStorage.getItem("adultos"));
//     document.getElementById("ninos").innerText = reserva.getItem("ninos");
//     // document.getElementById("detail-duration").innerText
//     // JSON.parse(localStorage.getItem("storeData"));
//     // document.getElementById("detail-title").innerText = movieInfo.title;
// }

// const imprimirDatos = () => {

//     datos.array.forEach(element => {
        
//     });
// }