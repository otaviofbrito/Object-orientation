package ep4;

import java.util.Date;

public class TesteHospede {
    public static void main(String[] args) {
        Hospede novo_hospede = new Hospede("Otavsio", "Brito");
        System.out.println(novo_hospede.getName());
        System.out.println(novo_hospede.getSurname());
    }
}
