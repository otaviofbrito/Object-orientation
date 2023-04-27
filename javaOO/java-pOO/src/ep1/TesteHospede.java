package ep1;

public class TesteHospede {
    public static void main(String[] args) {
        Hospede novo_hospede = new Hospede();
        novo_hospede.setName("otavio");
        novo_hospede.setSurname("brito");



        System.out.println(novo_hospede.getName());
        System.out.println(novo_hospede.getSurname());
    }
}
