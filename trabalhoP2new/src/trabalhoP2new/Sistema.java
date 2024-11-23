package trabalhoP2new;

import java.util.Scanner;

public class Sistema {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastro de alunos, cursos e turmas");          
            System.out.println("2. Cadastrar Aluno");
            System.out.println("3. Cadastrar Turma");
            System.out.println("4. Adicionar Aluno a Turma");
            System.out.println("5. Gerar Certificado");
            System.out.println("6. Mostrar Histórico Acadêmico");            
            System.out.println("7. Emissão de certificados e histórico de cursos");
            System.out.println("8. Suporte e acesso prioritário para VIPs");
            System.out.println("9. Controle de pagamentos e relatórios financeiros");           
            System.out.println("10. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    cadastroAlunosCursosETurmas(scanner);
                    break;
                case 2:
                    emissaoCertificadosEHistorico(scanner);
                    break;
                case 3:
                    suporteVIP(scanner);
                    break;
                case 4:
                    controlePagamentosERelatorios(scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
        
        scanner.close(); // Fechar o scanner
    }

    private void cadastroAlunosCursosETurmas(Scanner scanner) {
        // Implementação do cadastro de alunos, cursos e turmas
        System.out.println("Cadastro de alunos, cursos e turmas.");
        
    }

    private void emissaoCertificadosEHistorico(Scanner scanner) {
        // Implementação da emissão de certificados e histórico de cursos
        System.out.println("Emissão de certificados e histórico de cursos.");
        
    }

    private void suporteVIP(Scanner scanner) {
        // Implementação do suporte e acesso prioritário para VIPs
        System.out.println("Suporte e acesso prioritário para VIPs.");
        // Aqui você pode implementar a lógica de suporte VIP
    }

    private void controlePagamentosERelatorios(Scanner scanner) {
        // Implementação do controle de pagamentos e relatórios financeiros
        System.out.println("Controle de pagamentos e relatórios financeiros.");
        // Aqui você pode implementar a lógica de controle de pagamentos e relatórios
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.menu();
    }
}