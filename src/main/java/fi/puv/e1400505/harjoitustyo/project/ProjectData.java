package fi.puv.e1400505.harjoitustyo.project;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the project_data database table.
 * 
 */
@Entity
@Table(name="project_data")
@NamedQuery(name="ProjectData.findAll", query="SELECT p FROM ProjectData p")
public class ProjectData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="project_id")
	private int projectId;

	@Column(name="student_id")
	private int studentId;

	@Column(name="tag_id")
	private int tagId;

	public ProjectData() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getTagId() {
		return this.tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

}