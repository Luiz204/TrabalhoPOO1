package trabalhoP2new;

public class Certificado {
    private Aluno aluno;
    private String curso;

    public Certificado(Aluno aluno, String curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

    // Método para exibir informações do certificado
    public void exibirCertificado() {
        System.out.println("Certificado de " + aluno.getNome() + " para o curso " + curso);
    }
}