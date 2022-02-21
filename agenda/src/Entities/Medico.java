package Entities;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Medico extends Pessoa {
    private String CRM;
    private BigDecimal porcentParticip;
    private String consultorio;
    private Especialidade especialidade;

    public Medico() {
    }

    public Medico(String nome, String telefone, String celular, String nacionalidade, String cpf, String rg, String email, String login, String senha, ArrayList<Sexo> sexo, String CRM, BigDecimal porcentParticip, String consultorio, Especialidade especialidade) {
        super(nome, telefone, celular, nacionalidade, cpf, rg, email, login, senha, sexo);
        this.CRM = CRM;
        this.porcentParticip = porcentParticip;
        this.consultorio = consultorio;
        this.especialidade = especialidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public BigDecimal getPorcentParticip() {
        return porcentParticip;
    }

    public void setPorcentParticip(BigDecimal porcentParticip) {
        this.porcentParticip = porcentParticip;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
}
