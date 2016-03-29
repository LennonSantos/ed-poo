
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
  
    
    
    public Funcionario(String nom, int cp, int ct, String nasc, String civ, int dep, char sex, double sal, String tsal, double horas, String car){
        this.nome = nom;
        this.cpf = cp;
        this.ctps = ct;
        this.data_nascimento = nasc;
        this.estado_civil = civ;
        this.dependentes = dep;
        this.sexo = sex;
        this.salario = sal;
        this.tipo_salario = tsal;
        this.horas_trabalhadas = horas;
        this.cargo = car;
    }
}
