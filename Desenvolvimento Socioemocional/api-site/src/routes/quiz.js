var express = require("express");
var router = express.Router();

var quizController = require("../controllers/quizController");

router.get("/listar_quiz", function (req, res) {
    quizController.listar_quiz(req, res);
});

router.post("/cadastrar_quiz", function (req, res) {
    quizController.cadastrar_quiz(req, res);
})

module.exports = router;