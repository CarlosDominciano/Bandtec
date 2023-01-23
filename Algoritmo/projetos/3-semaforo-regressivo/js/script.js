window.onload = function() {

    const semaforo = document.querySelector('#semaforo');
    var duration = 60 * 1;
    
    for (let i = 0; i < 3; i++) {

        let sinalizacao = document.createElement("div");
        sinalizacao.classList.add('light');
        sinalizacao.style = "height: 175px; width: 175px; border-radius: 100%; opacity: 0.5; border: 5px solid #000000aa";

        semaforo.appendChild(sinalizacao);
    }

    console.log(semaforo);

    startTimer(duration, semaforo);

}

function startTimer(duration, semaforo) {

    var timer = duration, hours, minutes, seconds;

    setInterval(() => {

        hours = parseInt(timer / (60*60), 10);
        minutes = parseInt(timer / 60, 10);
        seconds = parseInt(timer % 60, 10);
        
        if (minutes > 59) {
            minutes = minutes - 60 * hours;
        }

        semaforo.children.item(0).style.opacity = 0.5
        semaforo.children.item(1).style.opacity = 0.5
        semaforo.children.item(2).style.opacity = 0.5
        semaforo.children.item(0).style.boxShadow = "0 0 0 0"
        semaforo.children.item(1).style.boxShadow = "0 0 0 0"
        semaforo.children.item(2).style.boxShadow = "0 0 0 0"

        // if (!(sinalizacao.style.opacity == 1))
        //     sinalizacao.style.opacity = 1;

        if (seconds % 60 > 40) {
            semaforo.children.item(0).style.shad = 0.5
            semaforo.children.item(1).style.opacity = 0.5
            semaforo.children.item(2).style.boxShadow = "0 0 100px 10px #37e437"
            semaforo.children.item(2).style.opacity = 1;
        }
        else if (seconds % 60 > 35) {
            semaforo.children.item(0).style.opacity = 0.5
            semaforo.children.item(2).style.opacity = 0.5
            semaforo.children.item(1).style.boxShadow = "0 0 100px 10px #e4e437"
            semaforo.children.item(1).style.opacity = 1;
        }
        else if (seconds % 60 >= 0) {
            semaforo.children.item(1).style.opacity = 0.5
            semaforo.children.item(2).style.opacity = 0.5
            semaforo.children.item(0).style.boxShadow = "0 0 100px 10px #e43737"
            semaforo.children.item(0).style.opacity = 1;
        }

        
        if (--timer < 0) {
            timer = duration;
        }
        
    }, 1000);
}