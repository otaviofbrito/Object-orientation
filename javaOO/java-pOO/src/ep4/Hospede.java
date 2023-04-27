package ep4;

public class Hospede {
    private String name;
    private String surname;

    //construtor
    public Hospede(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    /**
     * TESTING JAVADOC
     * @param bignumber FLOAT NUMBER
     */
    public void metodoHard(double bignumber){

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

}
