import org.example.t2.Veiculo;

public class TesteVeiculo2
{
    public static void main(String[] args){
        System.out.println("Criando um veiculo com a carga maxima de 10000kg");
        Veiculo veiculo = new Veiculo(10000);
        System.out.println("Add caixa numero 1: " + veiculo.adicionarCaixa(500));

        System.out.println("Add caixa numero 2: " + veiculo.adicionarCaixa(250));

        System.out.println("Add caixa numero 3: " +   veiculo.adicionarCaixa(5000));

        System.out.println("Add caixa numero 4: " +   veiculo.adicionarCaixa(4000));

        System.out.println("Add caixa numero 5: " + veiculo.adicionarCaixa(300));


        System.out.println("Carga final: " +  veiculo.getCarga());

    }
}
