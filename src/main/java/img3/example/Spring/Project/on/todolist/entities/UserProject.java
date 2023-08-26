package img3.example.Spring.Project.on.todolist.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="userproject")
public class UserProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="project_id")
    private int projectid;

    @Column(name="user_id")
    private int userid;

    @Column(name="status")
    private String status;

    @Column(name="assigned_by")
    private String assignedby;

    @Column(name="assigned_on")
    private Date assignedon;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="project_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Project project;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedby() {
        return assignedby;
    }

    public void setAssignedby(String assignedby) {
        this.assignedby = assignedby;
    }

    public Date getAssignedon() {
        return assignedon;
    }

    public void setAssignedon(Date assignedon) {
        this.assignedon = assignedon;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
