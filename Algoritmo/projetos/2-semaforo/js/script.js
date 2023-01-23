window.onload = function() {

    const semaforo = document.querySelector('#semaforo');
    
    for (let i = 0; i < 3; i++) {

        let sinalizacao = document.createElement("div");
        sinalizacao.classList.add('light');
        sinalizacao.style = "height: 175px; width: 175px; border-radius: 100%; opacity: 0.5; border: 5px solid #000000aa";
        sinalizacao.addEventListener('click', () => {

            semaforo.children.item(0).style.opacity = 0.5
            semaforo.children.item(1).style.opacity = 0.5
            semaforo.children.item(2).style.opacity = 0.5
            semaforo.children.item(0).style.boxShadow = "0 0 0 0"
            semaforo.children.item(1).style.boxShadow = "0 0 0 0"
            semaforo.children.item(2).style.boxShadow = "0 0 0 0"

            if (!(sinalizacao.style.opacity == 1))
                sinalizacao.style.opacity = 1;

            if (semaforo.children.item(2).style.opacity == 1) {
                semaforo.children.item(0).style.shad = 0.5
                semaforo.children.item(1).style.opacity = 0.5
                semaforo.children.item(2).style.boxShadow = "0 0 100px 10px #37e437"
            }
            else if (semaforo.children.item(1).style.opacity == 1) {
                semaforo.children.item(0).style.opacity = 0.5
                semaforo.children.item(2).style.opacity = 0.5
                semaforo.children.item(1).style.boxShadow = "0 0 100px 10px #e4e437"
            }
            else if (semaforo.children.item(0).style.opacity == 1) {
                semaforo.children.item(1).style.opacity = 0.5
                semaforo.children.item(2).style.opacity = 0.5
                semaforo.children.item(0).style.boxShadow = "0 0 100px 10px #e43737"
            }

        });

        semaforo.appendChild(sinalizacao);
    
    }

}
