package org.sesisenai;

public class Exercicio16_M01S04 {

    static class AreaVerde {
        private String nome;
        private String localizacao;
        private double tamanho; // em metros quadrados
        private String statusConservacao;
        private String responsavel;

        public AreaVerde(String nome, String localizacao, double tamanho) {
            this.nome = nome;
            this.localizacao = localizacao;
            this.tamanho = tamanho;
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
            // 1 hectare = 10.000 m²
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
        private String tipoResiduo;
        private double quantidade; // em quilogramas
        private String dataColeta;
        private String statusColeta;
        private String responsavelColeta;

        public MonitoramentoResiduos(String tipoResiduo, double quantidade, String dataColeta) {
            this.tipoResiduo = tipoResiduo;
            this.quantidade = quantidade;
            this.dataColeta = dataColeta;
        }

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
            return quantidade * 30; // Multiplica a quantidade diária por 30 dias
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
                40000
        );

        parqueZoobotanico.setStatusConservacao("Bem conservada");
        parqueZoobotanico.setResponsavel("Prefeitura de Joinville");

        AreaVerde jardimSofia = new AreaVerde(
                "Jardim Sofia",
                "Rua XV de Novembro, 1385",
                15000
        );

        jardimSofia.setStatusConservacao("Necessita de manutenção");
        jardimSofia.setResponsavel("Secretaria do Meio Ambiente");

        MonitoramentoResiduos coleta1 = new MonitoramentoResiduos(
                "Orgânico",
                120.5,
                "2023-10-01"
        );

        coleta1.setStatusColeta("Concluída");
        coleta1.setResponsavelColeta("João Silva");

        MonitoramentoResiduos coleta2 = new MonitoramentoResiduos(
                "Plástico",
                75.3,
                "2023-10-02"
        );

        coleta2.setStatusColeta("Pendente");
        coleta2.setResponsavelColeta("Maria Oliveira");

        System.out.println("Informações das Áreas Verdes:");
        parqueZoobotanico.exibirInformacoes();
        System.out.println();
        jardimSofia.exibirInformacoes();
        System.out.println();

        System.out.println("Informações do Monitoramento de Resíduos:");
        coleta1.exibirInformacoes();
        System.out.println();
        coleta2.exibirInformacoes();

        System.out.println("\nAlterando valores...");

        parqueZoobotanico.setTamanho(45000);
        parqueZoobotanico.setStatusConservacao("Em reforma");

        coleta1.setQuantidade(150.0);
        coleta1.setStatusColeta("Em andamento");

        System.out.println("\nInformações atualizadas das Áreas Verdes:");
        parqueZoobotanico.exibirInformacoes();
        System.out.println();

        System.out.println("Informações atualizadas do Monitoramento de Resíduos:");
        coleta1.exibirInformacoes();
    }
}