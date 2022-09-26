const addToBooking = (movie) => {
    let items = localStorage.getItem("booking");
    if (items == undefined) {
        items = new Map();
    } else {
        items = new Map(Object.entries(JSON.parse(items)));
    }

    let value = 1;
    console.log(items);
    if (items.get(movie) != undefined) {
        value = items.get(movie) + 1;
        console.log("Value", value);
    }
    items.set(movie, value);

    localStorage.setItem("booking", JSON.stringify(Object.fromEntries(items)));
    updateCart();
}