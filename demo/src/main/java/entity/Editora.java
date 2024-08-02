package entity;

public class Editora {
	
	private long id;
	private String editora;
	private String endereco;
	
	
	public Editora() {
		
	}
	
	public Editora(long id, String editora, String endereco) {
		this.id = id;
		this.editora = editora;
		this.endereco = endereco;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
