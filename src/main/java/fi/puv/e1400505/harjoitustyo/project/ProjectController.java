package fi.puv.e1400505.harjoitustyo.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectRepository repository;
	private static final Logger log = LoggerFactory.getLogger(ProjectController.class);

	 @RequestMapping(value = "/project", method = RequestMethod.GET)
	    public Project get(@RequestParam(value="id", defaultValue="1") int id){
	    	return repository.findOne(id);
	} 
	 
    @RequestMapping(value = "/project" , method = RequestMethod.POST)
    public @ResponseBody Project addProject(@RequestBody Project jsonProject) {
    	repository.save(jsonProject);
        //do business logic
        return jsonProject;
    }  	
	
    @RequestMapping("/test")
    public String test(@RequestParam(value="name", defaultValue="World") String name) {
        return "{\"id\":\"hello\"}";
    }	     
}