
const inputEle = document.getElementById("input");
const outputEle = document.getElementById("output");

function btn() {
    outputEle.innerHTML += inputEle.value + "<br>";
    outputEle.innerHTML += execute(inputEle.value);
}

function execute(command) {
    const list = command.spilit(" ");
    available = [];
    if (list[0] === "set") {
        if (list.length === 3) {
            const av = list[2].spilit("\"");
            if (av[0] === "" && av[2] === "") {
                
            }
            available.push({type: num, value: list[2], name: list[1]});
        } else {
            return "type error! argument is only " + list.length;
        }
    }
}