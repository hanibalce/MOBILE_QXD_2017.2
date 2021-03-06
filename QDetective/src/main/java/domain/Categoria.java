package domain;

public enum Categoria {
	
	VIAS_PUBLICAS("Vias públicas de Acesso"),
	EQUIPAMENTOS_COMUNICATARIOS("Equipamentos Comunitários"),
	LIMPEZA_URBANA("Limpeza Urbana e Saneamento");

	private String descricao;

	private Categoria(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
