package trabalhoP2new;

import java.util.List;

public class RelatorioDesempenho {
    private Aluno aluno;
    private List<Avaliacao> avaliacoes;

    public RelatorioDesempenho(Aluno aluno, List<Avaliacao> avaliacoes) {
        this.aluno = aluno;
        this.avaliacoes = avaliacoes;
    }

    public void gerarRelatorio() {
        System.out.println("Relatório de Desempenho de " + aluno.getNome());
        for (Avaliacao avaliacao : avaliacoes) {
            System.out.println(avaliacao.getNome() + ": " + avaliacao.getNota());
        }
    }
}