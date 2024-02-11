package Dto;
public class Customer {
    // ======================Attributes=========================
    String name;
    String mobile;
    String email;
    String city;
    int age;
    // ======================End of Attributes==================


   //=========================No-argument Constructor=========================
    public Customer() {
    }
    //=========================End of No-argument Constructor==================

    // =========================== Initialize Customer object==========================
    public Customer(String name, String mobile, String email, String city, int age) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.city = city;
        this.age = age;
    }
    // ===========================End of Initialize Customer object=======================

    // =========================Getter methods=========================
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
    //============================End of Getter methods==================

    // =========================Setter methods=========================
    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // =========================End of Setter methods==================

    // =========================toString method=========================
    @Override
    public String toString() {
        return "Name: " + name + "\nMobile: " + mobile + "\nEmail: " + email + "\nCity: " + city + "\nAge: " + age;
    }
    // =========================End of toString method==================
}
