public class Customers {
    private String name;
    private String email;
    private String phone;

    public Customers(String name, String email, String phone) {
        this.setName(name);
        this.setEmail(email);
        this.setPhone(phone);
    }

    public Customers(){
        this.name = "Anon";
        this.email = "ychag@example.com";
        this.phone = "1234567890";
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return this.email; }

    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return this.phone; }

    public void setPhone(String phone) { this.phone = phone; }



}
