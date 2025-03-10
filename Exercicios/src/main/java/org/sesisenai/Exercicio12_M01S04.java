package org.sesisenai;

public class Exercicio12_M01S04 {

    static class AreaVerde {
        String nome;
        String localizacao;
        double tamanho;

        public AreaVerde(String nome, String localizacao, double tamanho) {
            this.nome = nome;
            this.localizacao = localizacao;
            this.tamanho = tamanho;
        }

        void exibirInformacoes() {
            System.out.println("Área Verde: " + nome);
            System.out.println("Localização: " + localizacao);
            System.out.println("Tamanho: " + tamanho + " m²");
        }
    }

    static class MonitoramentoResiduos {
        String tipoResiduo;
        double quantidade; // em quilogramas
        String dataColeta;

        public MonitoramentoResiduos(String tipoResiduo, double quantidade, String dataColeta) {
            this.tipoResiduo = tipoResiduo;
            this.quantidade = quantidade;
            this.dataColeta = dataColeta;
        }

        void exibirInformacoes() {
            System.out.println("Tipo de Resíduo: " + tipoResiduo);
            System.out.println("Quantidade: " + quantidade + " kg");
            System.out.println("Data de Coleta: " + dataColeta);
        }
    }

    public static void main(String[] args) {

        AreaVerde parqueZoobotanico = new AreaVerde("Parque Zoobotânico", "Rua Pastor Guilherme Ráu, 462", 40000);
        AreaVerde jardimSofia = new AreaVerde("Jardim Sofia", "Rua XV de Novembro, 1385", 15000);

        MonitoramentoResiduos coleta1 = new MonitoramentoResiduos("Orgânico", 120.5, "2023-10-01");
        MonitoramentoResiduos coleta2 = new MonitoramentoResiduos("Plástico", 75.3, "2023-10-02");

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