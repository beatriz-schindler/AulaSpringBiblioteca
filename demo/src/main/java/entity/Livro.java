package entity;

public class Livro {
	
	private long id;
	private String nome;
	private String anoPublicacao;
	private String autor;
	
	
	public Livro() {
		
	}
	
	public Livro(long id, String nome, String anoPublicacao, String autor) {
		this.id = id;
		this.nome = nome;
		this.anoPublicacao = anoPublicacao;
		this.autor = autor;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
}
