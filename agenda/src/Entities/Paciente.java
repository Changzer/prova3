package Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa{
    private List<TipoAtendimento> tipoAtendimento = new ArrayList<>();
    private Convenio convenio;
    private String numeroCartaoConvenio;
    private LocalDateTime dataVencimento;

    public Paciente(String nome, String telefone, String celular, String nacionalidade, String cpf, String rg, String email, String login, String senha, ArrayList<Sexo> sexo, List<TipoAtendimento> tipoAtendimento, Convenio convenio, String numeroCartaoConvenio, LocalDateTime dataVencimento) {
        super(nome, telefone, celular, nacionalidade, cpf, rg, email, login, senha, sexo);
        this.tipoAtendimento = tipoAtendimento;
        this.convenio = convenio;
        this.numeroCartaoConvenio = numeroCartaoConvenio;
        this.dataVencimento = dataVencimento;
    }

    public List<TipoAtendimento> getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(List<TipoAtendimento> tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    public String getNumeroCartaoConvenio() {
        return numeroCartaoConvenio;
    }

    public void setNumeroCartaoConvenio(String numeroCartaoConvenio) {
        this.numeroCartaoConvenio = numeroCartaoConvenio;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
