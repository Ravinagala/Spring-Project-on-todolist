package img3.example.Spring.Project.on.todolist.repos;

import img3.example.Spring.Project.on.todolist.entities.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization,Integer> {
}
