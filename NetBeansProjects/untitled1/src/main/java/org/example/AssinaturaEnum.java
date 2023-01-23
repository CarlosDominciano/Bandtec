package org.example;

public enum AssinaturaEnum {

     BRONZE("Plano Comum"),
     PRATA("Plano Raro"),
     OURO("Plano Lendário");

     private String descricao;

     AssinaturaEnum(String descricao) {
          this.descricao = descricao;
     }

     public String getDescricao() {
          return descricao;
     }

     public static AssinaturaEnum getPorQtdCursos(Integer qtdCursos){

          if (qtdCursos > 10) {
               return OURO;
          } else if (qtdCursos > 5) {
               return PRATA;
          } else {
               return BRONZE;
          }

     }
}
