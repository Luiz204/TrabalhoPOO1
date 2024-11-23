package trabalhoP2new;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private List<Aluno> alunos;

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome; // Método getNome adicionado
    }

    
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Outros métodos para gerenciar a turma
}