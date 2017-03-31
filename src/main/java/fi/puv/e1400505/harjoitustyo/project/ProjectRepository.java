package fi.puv.e1400505.harjoitustyo.project;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Integer>{
	List<Project> findById(int id);

	
}
