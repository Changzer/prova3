package Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private Paciente paciente;
    private Medico medico;
    private List<StatusAgenda> statusAgenda = new ArrayList<>();
    private LocalDateTime dataAgendamento;
    private Boolean encaixe;

    public Agenda() {
    }

    public Agenda(Paciente paciente, Medico medico, List<StatusAgenda> statusAgenda, LocalDateTime dataAgendamento, Boolean encaixe) {
        this.paciente = paciente;
        this.medico = medico;
        this.statusAgenda = statusAgenda;
        this.dataAgendamento = dataAgendamento;
        this.encaixe = encaixe;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<StatusAgenda> getStatusAgenda() {
        return statusAgenda;
    }

    public void setStatusAgenda(List<StatusAgenda> statusAgenda) {
        this.statusAgenda = statusAgenda;
    }

    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDateTime dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Boolean getEncaixe() {
        return encaixe;
    }

    public void setEncaixe(Boolean encaixe) {
        this.encaixe = encaixe;
    }
}
