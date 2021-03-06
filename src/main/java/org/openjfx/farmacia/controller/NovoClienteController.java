package org.openjfx.farmacia.controller;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.TextField;
import org.openjfx.farmacia.cliente.*;

public class NovoClienteController {
	public ObservableList<Cliente> clientes;

	@SuppressWarnings("exports")
	public TextField nomeClienteField;
	@SuppressWarnings("exports")
	public TextField cpfClienteField;

	public void salvarNovoCliente() throws InvalidCustomerException {
		if (!cpfClienteField.getText().isEmpty() || cpfClienteField.getText() != null
				|| !nomeClienteField.getText().isEmpty() || nomeClienteField.getText() != null) {
			boolean isValid = false;

			try {
				isValid = validarCPF(cpfClienteField.getText());
				System.out.println("isValid = " + isValid);

				clientes.add(new Cliente(new SimpleStringProperty(cpfClienteField.getText()),
						new SimpleStringProperty(nomeClienteField.getText()), new SimpleBooleanProperty(true)));
			} catch (InvalidCPFException exception) {
				System.out.println("isValid = " + isValid);
				throw new InvalidCustomerException(exception);
			}
		}
	}

	public static boolean validarCPF(String CPF) throws InvalidCPFException {
		if (CPF.length() != 11) {
			throw new InvalidCPFException("CPF must be 11 characters long");
		}

		else if (!CPF.toLowerCase().equals(CPF.toUpperCase())) {
			throw new InvalidCPFException("CPF must have digits only");
		}

		else {
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	public void setClientes(FilteredList<Cliente> clientes) {
		this.clientes = (ObservableList<Cliente>) clientes.getSource();
	}
}
