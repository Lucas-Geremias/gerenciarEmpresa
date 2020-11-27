package br.com.av2.gerenciadorEmpresa.DAO;


public class EmpresaDAO {

	private final static Map<Long, Empresa> EMPRESAS = new HashMap<>();
	static {
		geraIdEAdiciona(new Empresa("lsInformatica"));
		geraIdEAdiciona(new Empresa("Ferragens Docel"));
		geraIdEAdiciona(new Empresa("Rocktseat"));
		geraIdEAdiciona(new Empresa("Google"));
		geraIdEAdiciona(new Empresa("Caelum"));
		geraIdEAdiciona(new Empresa("facebook"));
	}

	public Collection<Empresa> buscaPorSimilaridade(String nome) {
		if (nome == null)
			return EMPRESAS.values();
		
		List<Empresa> similares = new ArrayList<>();
		for (Empresa empresa : EMPRESAS.values()) {
			if (empresa.getNome().toLowerCase().contains(nome.toLowerCase()))
				similares.add(empresa);
		}
		return similares;
	}

	public void adiciona(Empresa empresa) {
		geraIdEAdiciona(empresa);
	}

	private static void geraIdEAdiciona(Empresa empresa) {
		long id = EMPRESAS.size()+1l;
		empresa.setId(id);
		EMPRESAS.put(id, empresa);
	}
}