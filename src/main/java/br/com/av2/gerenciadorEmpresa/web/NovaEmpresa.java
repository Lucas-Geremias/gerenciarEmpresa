package br.com.av2.gerenciadorEmpresa.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.av2.gerenciadorEmpresa.Empresa;
import br.com.av2.gerenciadorEmpresa.DAO.EmpresaDAO;


@WebServlet(urlPatterns = "/nova")
public class NovaEmpresa implements Tarefa{
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		String nome = req.getParameter("nome");		
		Empresa empresa= new Empresa(nome);
		new EmpresaDAO().adiciona(empresa);
		req.setAttribute("nome", empresa);
		return "WEB-INF/paginas/novaEmpresa.jsp";
	}
}