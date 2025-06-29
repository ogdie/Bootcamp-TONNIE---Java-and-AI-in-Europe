package subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        // Simula uma chamada a uma API externa de CEP
        // Retorno mock para demonstração
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        // Simula uma chamada a uma API externa de CEP
        // Retorno mock para demonstração
        return "SP";
    }
}