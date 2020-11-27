package br.com.av2.gerenciadorEmpresa.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/logout")
public class Logout implements Tarefa{
	

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		session.removeAttribute("usuarioLogado");
		return "/WEB-INF/paginas/logout.html";
	}

}