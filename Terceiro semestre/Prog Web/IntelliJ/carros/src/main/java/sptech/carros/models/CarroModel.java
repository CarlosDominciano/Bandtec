package sptech.carros.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Entity
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarro;
    @Size(min = 2,max = 12, message = "O modelo" +
            " só pode ter entre 2 e 12 caracteres")
    private String modelo;
//    @Size(min = 2,max = 10, message = "O fabricante" +
//            " só pode ter entre 2 e 10 caracteres")
//    private String fabricante;
    @PastOrPresent(message = "Não pode ser um valor futuro")
    private LocalDate dataFabricacao;
    @Min(value = 1960, message = "A data minima é 1960")
    @Max(value = 2021, message = "A data maxima é 2021")
    private Integer anoFabricacao;
    @DecimalMin(value = "0.2", message = "O carro stem que ter " +
            "no minimo 0.2 de potencia")
    @DecimalMax(value = "7.0", message = "O carro só pode ter " +
            "até 7.0 de potencia")
    private Double potenciaMotor;

    @ManyToOne
    private FabricanteVeiculosModel fabricanteVeiculosModel;

    public Integer getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Integer idCarro) {
        this.idCarro = idCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public FabricanteVeiculosModel getFabricanteVeiculosModel() {
        return fabricanteVeiculosModel;
    }

    public void setFabricanteVeiculosModel(FabricanteVeiculosModel fabricanteVeiculosModel) {
        this.fabricanteVeiculosModel = fabricanteVeiculosModel;
    }

    //    public String getFabricante() {
//        return fabricante;
//    }
//
//    public void setFabricante(String fabricante) {
//        this.fabricante = fabricante;
//    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(Double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
}
