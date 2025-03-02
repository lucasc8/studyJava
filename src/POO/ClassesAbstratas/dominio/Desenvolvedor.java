package POO.ClassesAbstratas.dominio;

public class Desenvolvedor extends  Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
        calculaBonus();
    }

    public void  calculaBonus(){
        this.salario = salario + salario*0.2;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
