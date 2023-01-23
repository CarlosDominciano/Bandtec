/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bandtec.heranca.aluno;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class AlunoPos extends Aluno{
    
    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    public AlunoPos(Double nota1, Double nota2, Double notaMonografia,
            Integer ra, String nome) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    public AlunoPos(Double nota1, Double nota2, Double notaMonografia,
            Integer ra, String nome, String email) {
        super(ra, nome, email);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calcularMedia() {
        return (nota1 + nota2 + notaMonografia) / 3; 
    }
    
    
}
