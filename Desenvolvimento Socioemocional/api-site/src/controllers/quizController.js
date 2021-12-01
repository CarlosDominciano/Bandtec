var quizModel = require("../models/usuarioModel");

var sessoes = [];

function listar_quiz(req, res) {
    quizModel.listar_quiz()
        .then(function (resultado) {
            if (resultado.length > 0) {
                res.status(200).json(resultado);
            } else {
                res.status(204).send("Nenhum resultado encontrado!")
            }
        }).catch(
            function (erro) {
                console.log(erro);
                console.log("Houve um erro ao realizar a consulta! Erro: ", erro.sqlMessage);
                res.status(500).json(erro.sqlMessage);
            }
        );
}

function cadastrar_quiz(req, res) {
    var maxPontos = req.body.maxPontosServer;
    var fkUsuario = req.body.fkUsuarioServer;
        
        quizModel.cadastrar_quiz(maxPontos, fkUsuario)
            .then(
                function (resultado) {
                    res.json(resultado);
                }
            ).catch(
                function (erro) {
                    console.log(erro);
                    console.log(
                        "\nHouve um erro ao realizar o cadastro! Erro: ",
                        erro.sqlMessage
                    );
                    res.status(500).json(erro.sqlMessage);
                }
            );
}

module.exports = {
    cadastrar_quiz,
    listar_quiz
}