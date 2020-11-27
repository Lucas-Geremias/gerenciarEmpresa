package br.com.av2.gerenciadorEmpresa.DAO;

import java.util.HashMap;
import java.util.Map;

import br.com.av2.gerenciadorEmpresa.Usuario;

public class UsuarioDAO {

	private final static Map<String, Usuario> USUARIOS = new HashMap<>();
	static {
		USUARIOS.put("lucas@gmail.com.br", new Usuario("lucas@gmail.com.br","Lucas"));
		USUARIOS.put("luan@gmail.com.br", new Usuario("luan@gmail.com.br","Luan"));
		USUARIOS.put("magda@gmail.com.br", new Usuario("magda@gmail.com.br","Magda"));
	}

	public Usuario buscaPorEmailESenha(String email, String senha) {
		if (!USUARIOS.containsKey(email))
			return null;

		Usuario usuario = USUARIOS.get(email);
		if (usuario.getSenha().equals(senha))
			return usuario;
		
		return null;
	}

}
