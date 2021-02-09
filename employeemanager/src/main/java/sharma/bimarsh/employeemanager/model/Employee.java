package sharma.bimarsh.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

/*
 * Why Serializable?
 *  Serializable transforms this Employee class into different types of stream
 */
@Entity // Map to database table
public class Employee implements Serializable {
    /*
     * How Employee is described? What properties does each employee have?
     * Map each employee property to database column
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false) // once this value is set, it cannot be updated and this value cannot be null
    private  Long id;

    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String profileUrl;

    @Column(nullable = false, updatable = false) // once this value is set, it cannot be updated and this value cannot be null
    private String employeeCode;

    //no-args Constructor
    public Employee(){}

    public Employee(String name, String email, String jobTitle, String phone, String profileUrl, String employeeCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.profileUrl = profileUrl;
        this.employeeCode = employeeCode;
    }

    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    //Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    //toString

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", profileUrl='" + profileUrl + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}
