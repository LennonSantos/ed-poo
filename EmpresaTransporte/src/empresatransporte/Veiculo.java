package empresatransporte;

public class Veiculo {
    
    String modelo;
    String motor;
    int anoFab;
    int anoModelo;
    String cor;
    String combustivel;
    double valor;
    
    public Veiculo(String mod, String mot, int anoF, int anoM, String cor, String com, double val){
        this.modelo = mod;
        this.motor = mot;
        this.anoFab = anoF;
        this.anoModelo = anoM;
        this.cor = cor;
        this.combustivel = com;
        this.valor = val;
    }
    
}
