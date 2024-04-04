import classes.CalculoDiaria;
import classes.ContaEstacionamento;

public class Main {
    public static void main(String[] args) {
        ContaEstacionamento conta = new ContaEstacionamento();
        conta.setCalculo(new CalculoDiaria());
        conta.valorConta();
    }
}
