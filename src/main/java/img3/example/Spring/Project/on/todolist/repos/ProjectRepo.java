package img3.example.Spring.Project.on.todolist.repos;


import img3.example.Spring.Project.on.todolist.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Integer> {
}
