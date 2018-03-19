package user_management;

import user_management.security.Password;

public class User {

    private String email;
    private long id;
    private String name;
    private Password password;

    public User(long id, String name,String email, Password password) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = password;
    }
    public User( long id, String email,String name, String password) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = new Password(password);

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public void setPassword(String password){
        this.password = new Password(password);
    }

    @Override
    public String toString() {
        String formatUser = getName() + " - " + getEmail();
        return formatUser;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
