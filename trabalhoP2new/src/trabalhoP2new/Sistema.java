package trabalhoP2new;

import java.util.Scanner;

public class Sistema {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");         
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Turma");
            System.out.println("3. Adicionar Aluno a Turma");
            System.out.println("4. Gerar Certificado");
            System.out.println("5. Mostrar Histórico Acadêmico");            
            System.out.println("6. Emissão de certificados e histórico de cursos");
            System.out.println("7. Suporte e acesso prioritário para VIPs");
            System.out.println("8. Controle de pagamentos e relatórios financeiros");           
            System.out.println("9. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    cadastroAlunos(scanner);
                    break;
                case 2:
                    cadastroTurma(scanner);
                    break;
                case 3:
                	cadastroAlunoTurma(scanner);
                    break;               
                case 4:
                    gerarCertificado(scanner);
                    break;
                case 5:
                    mostrarHistoricoAcademico(scanner);
                    break;
                case 6:
                    emissaodeCertificados(scanner);
                    break;
                case 7:
                    suporteVIP(scanner);
                    break;
                case 8:
                    controlePagamentosERelatorios(scanner);
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
        
        scanner.close(); // Fechar o scanner
    }

    private void cadastroAlunos(Scanner scanner) {
        // Implementação do cadastro de alunos
        System.out.println("Cadastrar alunos");
        
    }

    private void cadastroTurma(Scanner scanner) {
    	// Implementação do cadastro de turmas
        System.out.println("Cadastrar turma");
        
    }

    private void cadastroAlunoTurma(Scanner scanner) {
        
        System.out.println("Cadastrar aluno na turma");
        
    }
    
    
    private void gerarCertificado(Scanner scanner) {
        
        System.out.println("Gerar certificado de conclusão de curso");
        
    }

    private void suporteVIP(Scanner scanner) {
       
        System.out.println("Suporte e acesso prioritário para VIPs.");
        
    }

    private void mostrarHistoricoAcademico(Scanner scanner) {
        
        System.out.println("Retirar historico academico ");
       
    }
    
    private void emissaodeCertificados(Scanner scanner) {
        
        System.out.println("Emitir certificados");
        
    }
    
    private void controlePagamentosERelatorios(Scanner scanner) {
        
        System.out.println("Controle de pagamentos e relatórios financeiros.");
       
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.menu();
    }
}