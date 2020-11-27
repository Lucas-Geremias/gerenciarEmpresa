package br.com.av2.gerenciadorEmpresa.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Tarefa {

	public String executa(HttpServletRequest req, HttpServletResponse resp);
	
}
