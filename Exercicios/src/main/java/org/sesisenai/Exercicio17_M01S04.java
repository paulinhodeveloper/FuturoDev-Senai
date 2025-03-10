package org.sesisenai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio17_M01S04 {

    static class AreaVerde {
        private String nome;
        private String localizacao;
        private double tamanho; // em metros quadrados
        private String statusConservacao;
        private String responsavel;

        static List<AreaVerde> areasVerdes = new ArrayList<>();

        public AreaVerde(String nome, String localizacao, double tamanho) {
            this.nome = nome;
            this.localizacao = localizacao;
            this.tamanho = tamanho;
            areasVerdes.add(this);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getLocalizacao() {
            return localizacao;
        }

        public void setLocalizacao(String localizacao) {
            this.localizacao = localizacao;
        }

        public double getTamanho() {
            return tamanho;
        }

        public void setTamanho(double tamanho) {
            this.tamanho = tamanho;
        }

        public String getStatusConservacao() {
            return statusConservacao;
        }

        public void setStatusConservacao(String statusConservacao) {
            this.statusConservacao = statusConservacao;
        }

        public String getResponsavel() {
            return responsavel;
        }

        public void setResponsavel(String responsavel) {
            this.responsavel = responsavel;
        }

        double calcularTamanhoEmHectares() {
            return tamanho / 10000; // 1 hectare = 10.000 m²
        }

        void exibirInformacoes() {
            System.out.println("Área Verde: " + nome);
            System.out.println("Localização: " + localizacao);
            System.out.println("Tamanho: " + tamanho + " m² (" + calcularTamanhoEmHectares() + " hectares)");
            System.out.println("Status de Conservação: " + statusConservacao);
            System.out.println("Responsável: " + responsavel);
        }
    }

    static class MonitoramentoResiduos {
        private String tipoResiduo;
        private double quantidade;
        private String dataColeta;
        private String statusColeta;
        private String responsavelColeta;

        static List<MonitoramentoResiduos> monitoramentos = new ArrayList<>();

        public MonitoramentoResiduos(String tipoResiduo, double quantidade, String dataColeta) {
            this.tipoResiduo = tipoResiduo;
            this.quantidade = quantidade;
            this.dataColeta = dataColeta;
            monitoramentos.add(this);
        }

        // Getters e Setters
        public String getTipoResiduo() {
            return tipoResiduo;
        }

        public void setTipoResiduo(String tipoResiduo) {
            this.tipoResiduo = tipoResiduo;
        }

        public double getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(double quantidade) {
            this.quantidade = quantidade;
        }

        public String getDataColeta() {
            return dataColeta;
        }

        public void setDataColeta(String dataColeta) {
            this.dataColeta = dataColeta;
        }

        public String getStatusColeta() {
            return statusColeta;
        }

        public void setStatusColeta(String statusColeta) {
            this.statusColeta = statusColeta;
        }

        public String getResponsavelColeta() {
            return responsavelColeta;
        }

        public void setResponsavelColeta(String responsavelColeta) {
            this.responsavelColeta = responsavelColeta;
        }

        double calcularResiduosPorMes() {
            return quantidade * 30;
        }

        void exibirInformacoes() {
            System.out.println("Tipo de Resíduo: " + tipoResiduo);
            System.out.println("Quantidade: " + quantidade + " kg/dia");
            System.out.println("Quantidade estimada por mês: " + calcularResiduosPorMes() + " kg");
            System.out.println("Data de Coleta: " + dataColeta);
            System.out.println("Status da Coleta: " + statusColeta);
            System.out.println("Responsável pela Coleta: " + responsavelColeta);
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- App Sustentabilidade ---");
            System.out.println("1. Cadastrar Área Verde");
            System.out.println("2. Cadastrar Monitoramento de Resíduos");
            System.out.println("3. Exibir Informações das Áreas Verdes");
            System.out.println("4. Exibir Informações do Monitoramento de Resíduos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAreaVerde(scanner);
                    break;
                case 2:
                    cadastrarMonitoramentoResiduos(scanner);
                    break;
                case 3:
                    exibirAreasVerdes();
                    break;
                case 4:
                    exibirMonitoramentoResiduos();
                    break;
                case 5:
                    System.out.println("Saindo do App Sustentabilidade...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarAreaVerde(Scanner scanner) {
        System.out.println("\n--- Cadastro de Área Verde ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Localização: ");
        String localizacao = scanner.nextLine();
        System.out.print("Tamanho (m²): ");
        double tamanho = scanner.nextDouble();
        scanner.nextLine();

        AreaVerde areaVerde = new AreaVerde(nome, localizacao, tamanho);

        System.out.print("Status de Conservação: ");
        areaVerde.setStatusConservacao(scanner.nextLine());
        System.out.print("Responsável: ");
        areaVerde.setResponsavel(scanner.nextLine());

        System.out.println("Área verde cadastrada com sucesso!");
    }

    private static void cadastrarMonitoramentoResiduos(Scanner scanner) {
        System.out.println("\n--- Cadastro de Monitoramento de Resíduos ---");
        System.out.print("Tipo de Resíduo: ");
        String tipoResiduo = scanner.nextLine();
        System.out.print("Quantidade (kg/dia): ");
        double quantidade = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Data de Coleta (AAAA-MM-DD): ");
        String dataColeta = scanner.nextLine();

        MonitoramentoResiduos monitoramento = new MonitoramentoResiduos(tipoResiduo, quantidade, dataColeta);

        System.out.print("Status da Coleta: ");
        monitoramento.setStatusColeta(scanner.nextLine());
        System.out.print("Responsável pela Coleta: ");
        monitoramento.setResponsavelColeta(scanner.nextLine());

        System.out.println("Monitoramento de resíduos cadastrado com sucesso!");
    }

    private static void exibirAreasVerdes() {
        System.out.println("\n--- Informações das Áreas Verdes ---");
        if (AreaVerde.areasVerdes.isEmpty()) {
            System.out.println("Nenhuma área verde cadastrada.");
        } else {
            for (AreaVerde area : AreaVerde.areasVerdes) {
                area.exibirInformacoes();
                System.out.println();
            }
        }
    }

    private static void exibirMonitoramentoResiduos() {
        System.out.println("\n--- Informações do Monitoramento de Resíduos ---");
        if (MonitoramentoResiduos.monitoramentos.isEmpty()) {
            System.out.println("Nenhum monitoramento de resíduos cadastrado.");
        } else {
            for (MonitoramentoResiduos monitoramento : MonitoramentoResiduos.monitoramentos) {
                monitoramento.exibirInformacoes();
                System.out.println();
            }
        }
    }
}