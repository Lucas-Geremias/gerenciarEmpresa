package br.com.av2.gerenciadorEmpresa.web;

import java.util.Collection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.av2.gerenciadorEmpresa.Empresa;
import br.com.av2.gerenciadorEmpresa.DAO.EmpresaDAO;

@WebServlet(urlPatterns="/busca")
public class BuscaEmpresa implements Tarefa{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		
		String filtro = req.getParameter("filtro");		
		Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		req.setAttribute("empresas", empresas);
		return "WEB-INF/paginas/buscaEmpresa.jsp";

	}
	
}
