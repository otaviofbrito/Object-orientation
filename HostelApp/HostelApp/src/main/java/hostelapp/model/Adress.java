package hostelapp.model;

public class Adress {

    private String adress;
    private String zipCode;
    private String city;
    private String state;

    public Adress(){}
    public Adress(String adress, String state, String zipCode){
        this.adress = adress;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        if(adress.length() > 0){
            this.adress = adress;
        }
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if(adress.length() > 0){
            this.zipCode = zipCode;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city.length() > 0){
            this.city = city;
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if(state.length() > 0){
            this.state = state;
        }
    }
}
