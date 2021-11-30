
    var cont = 0;
    var pontos = 0;

function mostrarQuiz() {
    iniciarQuiz.style.display = "none";
    quizJogo.style.display = "flex";  
}   

function voltar() {
    iniciarQuiz.style.display = "flex";
    quizJogo.style.display = "none";
}

function sobre() {
    alert("Você vai jogar um quiz sobre jogos, cada questão tem 4 alternativas, apenas uma está correta! Quando clicar em uma alternativa, a correta ficara verde!")
}

function iniciarQuizFunc() {
    iniciarQuiz.style.display = "none";
    quizJogo.style.display = "none";
    p1.style.display = "flex";
    p1resposta.style.display = "none"
}

function erradop1() {
    p1.style.display = "none";
    p1resposta.style.display = "flex";
    cont++;
}

function certop1() {
    p1.style.display = "none";
    p1resposta.style.display = "flex";
    pontos++;
    cont++;
}

function proximo() {
    if (cont == 1) {
        p1.style.display = "none";
        p1resposta.style.display = "none";
        p2.style.display = "flex";
        p2resposta.style.display = "none";
    }
}