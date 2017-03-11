package es.coritel.codington.festival.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

// TODO: añadir validaciones (si el alumno lo cree conveniente) 
@Entity
@Table(name = "visitors")
public class Visitor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Size(min = 1, max = 30, message = "Invalid First Name")
    @NotEmpty(message = "Please provide First Name")
    private String firstName;

    @Size(min = 1, max = 30, message = "Invalid Last Name")
    @NotEmpty(message = "Please provide Last Name")
    private String lastName;

    @Size(min = 1, max = 50, message = "Invalid Address")
    @NotEmpty(message = "Please provide address")
    private String address;

    @Size(min = 6, max = 12, message = "Invalid username")
    @NotEmpty(message = "Please provide Username")
    private String userName;

    @Size(min = 6, max = 15, message = "Invalid password")
    @NotEmpty(message = "Please provide password")
    private String password;

    @Transient
    @Size(min = 6, max = 15, message = "Invalid password")
    @NotEmpty(message = "Please provide confirm password")
    private String confirmPassword;

    public Visitor() {
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
