package org.sesisenai;

public class Exercicio14_M01S04 {


    static class AreaVerde {
        String nome;
        String localizacao;
        double tamanho;
        String statusConservacao;
        String responsavel;

        public AreaVerde(String nome, String localizacao, double tamanho, String statusConservacao, String responsavel) {
            this.nome = nome;
            this.localizacao = localizacao;
            this.tamanho = tamanho;
            this.statusConservacao = statusConservacao;
            this.responsavel = responsavel;
        }

        double calcularTamanhoEmHectares() {

            return tamanho / 10000;
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
        String tipoResiduo;
        double quantidade;
        String dataColeta;
        String statusColeta;
        String responsavelColeta;

        public MonitoramentoResiduos(String tipoResiduo, double quantidade, String dataColeta, String statusColeta, String responsavelColeta) {
            this.tipoResiduo = tipoResiduo;
            this.quantidade = quantidade;
            this.dataColeta = dataColeta;
            this.statusColeta = statusColeta;
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

    public static void main(String[] args) {

        AreaVerde parqueZoobotanico = new AreaVerde(
                "Parque Zoobotânico",
                "Rua Pastor Guilherme Ráu, 462",
                40000,
                "Bem conservada",
                "Prefeitura de Joinville"
        );

        AreaVerde jardimSofia = new AreaVerde(
                "Jardim Sofia",
                "Rua XV de Novembro, 1385",
                15000,
                "Necessita de manutenção",
                "Secretaria do Meio Ambiente"
        );

        // Instanciando objetos da classe MonitoramentoResiduos
        MonitoramentoResiduos coleta1 = new MonitoramentoResiduos(
                "Orgânico",
                120.5,
                "2023-10-01",
                "Concluída",
                "João Silva"
        );

        MonitoramentoResiduos coleta2 = new MonitoramentoResiduos(
                "Plástico",
                75.3,
                "2023-10-02",
                "Pendente",
                "Maria Oliveira"
        );

        System.out.println("Informações das Áreas Verdes:");
        parqueZoobotanico.exibirInformacoes();
        System.out.println();
        jardimSofia.exibirInformacoes();
        System.out.println();

        System.out.println("Informações do Monitoramento de Resíduos:");
        coleta1.exibirInformacoes();
        System.out.println();
        coleta2.exibirInformacoes();
    }
}