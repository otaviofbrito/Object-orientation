package hostelapp.model;

public class Guest {

    private String name;
    private String lastname;
    private Adress adress;

    private String email;
    public Guest(){
        this(null);
    }
    public Guest (String name){
        this(name, null);
    }
    public Guest(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 2){
            this.name = name;
        }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        if(lastname.length() > 0){
            this.lastname = lastname;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.length() > 0){
            this.email = email;
        }
    }

    public Adress getAdress(){
        return adress;
    }

    public void setAdress(Adress adress){
        this.adress = adress;
    }
}
