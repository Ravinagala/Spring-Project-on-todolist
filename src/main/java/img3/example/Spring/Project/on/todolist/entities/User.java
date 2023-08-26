package img3.example.Spring.Project.on.todolist.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<UserOrganization> userorganization;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<UserProject> userproject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<UserOrganization> getUserorganization() {
        return userorganization;
    }

    public void setUserorganization(List<UserOrganization> userorganization) {
        this.userorganization = userorganization;
    }

    public List<UserProject> getUserproject() {
        return userproject;
    }

    public void setUserproject(List<UserProject> userproject) {
        this.userproject = userproject;
    }
}
