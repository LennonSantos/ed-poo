
package empresatransporte;

public class Funcionario {
    String nome;
    int cpf;
    int ctps;
    String data_nascimento;
    String estado_civil;
    int dependentes;
    char sexo;
    double salario;
    String tipo_salario;
    double horas_trabalhadas;
    String cargo;
  
    
    
    public Funcionario(String n, double s){
        this.nome = n;
        this.salario = s;
        
    }
}
