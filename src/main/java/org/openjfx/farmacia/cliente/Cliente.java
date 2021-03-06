package org.openjfx.farmacia.cliente;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public final class Cliente {
    protected SimpleStringProperty cpf;
    protected SimpleStringProperty nome;
    protected SimpleBooleanProperty ativado;

    @SuppressWarnings("exports")
	public Cliente(SimpleStringProperty cpf, SimpleStringProperty nome, SimpleBooleanProperty ativado) {
        this.cpf = cpf;
        this.nome = nome;
        this.ativado = ativado;
    }

    public String getNome() {
        return nome.get();
    }

    @SuppressWarnings("exports")
	public SimpleStringProperty nomeProperty() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public String getCpf() {
        return cpf.get();
    }

    @SuppressWarnings("exports")
	public SimpleStringProperty cpfProperty() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf.set(cpf);
    }

    public boolean isAtivado() {
        return ativado.get();
    }

    @SuppressWarnings("exports")
	public SimpleBooleanProperty ativadoProperty() {
        return ativado;
    }

    public void setAtivado(boolean ativado) {
        this.ativado.set(ativado);
    }

    @Override
    public String toString() {
        return nome.get() + ";" + cpf.get() + ";" + ativado.get();
    }

}