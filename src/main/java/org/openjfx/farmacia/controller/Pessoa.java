package org.openjfx.farmacia.controller;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public abstract class Pessoa {
	protected SimpleStringProperty nome;
	protected SimpleStringProperty cpf;
	protected SimpleBooleanProperty cadastrado;

	public String getNome() {
		return nome.get();
	}

	public SimpleStringProperty nomeProperty() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}

	public String getCpf() {
		return cpf.get();
	}

	public SimpleStringProperty cpfProperty() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf.set(cpf);
	}

	public boolean isCadastrado() {
		return cadastrado.get();
	}

	public SimpleBooleanProperty cadastradoProperty() {
		return cadastrado;
	}

	public void setCadastrado(boolean cadastrado) {
		this.cadastrado.set(cadastrado);
	}
}
