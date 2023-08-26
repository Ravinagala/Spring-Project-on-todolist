package img3.example.Spring.Project.on.todolist.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="userorganization")
public class UserOrganization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="user_id")
    private int userid;

    @Column(name="org_id")
    private int orgid;

    @Column(name="status")
    private String status;

    @Column(name="joined_on")
    private Date joinedon;

    @Column(name="joined-by")
    private String joinedby;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="org_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Organization organization;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getOrgid() {
        return orgid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getJoinedon() {
        return joinedon;
    }

    public void setJoinedon(Date joinedon) {
        this.joinedon = joinedon;
    }

    public String getJoinedby() {
        return joinedby;
    }

    public void setJoinedby(String joinedby) {
        this.joinedby = joinedby;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
