// sessão
function validarSessao() {
    // aguardar();

    var email = sessionStorage.EMAIL_USUARIO;
    var nome = sessionStorage.NOME_USUARIO;
    var nick = sessionStorage.NICK_USUARIO;

    var h1LoginUsuario = document.getElementById("h1_login_usuario");

    if (email != null && nome != null) {
        // window.alert(`Seja bem-vindo, ${nome}!`);
        if (h1LoginUsuario != undefined) {
            h1LoginUsuario.innerHTML = email;
        }
        b_usuario.innerHTML = `Olá, ${nick}!`;

        // finalizarAguardar();
    } else {
        window.location = "../login.html";
    }
}

function limparSessao() {
    // aguardar();
    sessionStorage.clear();
    // finalizarAguardar();
    window.location = "../login.html";
}

function miniGames() {
    // aguardar();
    // finalizarAguardar();
    window.location = "../games.html";
}


// carregamento (loading)
function aguardar() {
    var divAguardar = document.getElementById("div_aguardar");
    divAguardar.style.display = "flex";
    var divCadastrar = document.getElementById("div_loading");
    divCadastrar.style.display = "none";

}

function finalizarAguardar(texto) {
    var divAguardar = document.getElementById("div_aguardar");
    divAguardar.style.display = "none";
    var divCadastrar = document.getElementById("div_loading");
    divCadastrar.style.display = "flex";
    var alertAudio = document.getElementById('erro_audio')

    var divErrosLogin = document.getElementById("div_erros_login");
    if (texto) {
        divErrosLogin.innerHTML = texto;
        alertAudio.src = "../assets/alertSong.mpeg"
        alertAudio.currentTime = 0;
        alertAudio.play();
    }
}


// modal
function mostrarModal() {
    var divModal = document.getElementById("div_modal");
    divModal.style.display = "flex";
}

function fecharModal() {
    var divModal = document.getElementById("div_modal");
    divModal.style.display = "none";
}

