package trabalhoP2new;

public class Aluno {
    private String nome;
    private String matricula;
    private boolean isVIP;

    public Aluno(String nome, String matricula, boolean isVIP) {
        this.nome = nome;
        this.matricula = matricula;
        this.isVIP = isVIP;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
	}

	public String getMatricula() {
        return matricula;
    }

    public boolean isVIP() {
        return isVIP;
    }
}
