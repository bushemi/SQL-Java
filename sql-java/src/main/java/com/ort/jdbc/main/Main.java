package com.ort.jdbc.main;

import java.util.Collection;

import com.ort.jdbc.db.connection.ConnectionManager;
import com.ort.jdbc.db.dao.TeacherDAO;
import com.ort.jdbc.db.dao.impl.mysql.MysqlTeacherDAO;
import com.ort.jdbc.entities.Teacher;

public class Main {

	public static void main(String[] args) {
		ConnectionManager mgr = ConnectionManager.getInstance();
		mgr.openConnection();
		
//		PassportDAO passportDAO = new MysqlPassportDAO(mgr);
//		System.out.println("Passports");
//     	Collection<Passport> passports = passportDAO.getAll(); 
//     	passports.stream().forEach(System.out::println);
		
//		FormDAO formDAO = new MysqlFormDAO(mgr);
//		System.out.println("Forms");
//     	Collection<Form> forms = formDAO.getAll(); 
//     	forms.stream().forEach(System.out::println);
     	
//		GroupDAO groupDAO = new MysqlGroupDAO(mgr);
//		System.out.println("Groups");
//     	Collection<Group> groups = groupDAO.getAll(); 
//     	groups.stream().forEach(System.out::println);
		
//		MarkDAO markDAO = new MysqlMarkDAO(mgr);
//		System.out.println("Marks");
//     	Collection<Mark> marks = markDAO.getAll(); 
//     	marks.stream().forEach(System.out::println);
     	
//		MarkRepresentationDAO markRepresentationDAO = new MysqlMarkRepresentationDAO(mgr);
//		System.out.println("MarkRepresentations");
//     	Collection<MarkRepresentation> markRepresentations = markRepresentationDAO.getAll(); 
//     	markRepresentations.stream().forEach(System.out::println);

     	
//		StudentDAO studentDAO = new MysqlStudentDAO(mgr);
//		System.out.println("Students");
//     	Collection<Student> students = studentDAO.getAll(); 
//     	students.stream().forEach(System.out::println);

     	
//		StudentGroupDAO studentGroupDAO = new MysqlStudentGroupDAO(mgr);
//		System.out.println("StudentGroups");
//     	Collection<StudentGroup> studentGroups = studentGroupDAO.getAll(); 
//     	studentGroup.stream().forEach(System.out::println);
     	
//		SubjectDAO subjectDAO = new MysqlSubjectDAO(mgr);
//		System.out.println("Subjects");
//     	Collection<Subject> subjects = subjectDAO.getAll(); 
//     	subject.stream().forEach(System.out::println);
     	
//		SubjectTeacherDAO subjectTeacherDAO = new MysqlSubjectTeacherDAO(mgr);
//		System.out.println("SubjectTeachers");
//     	Collection<SubjectTeacher> subjectTeachers = subjectTeacherDAO.getAll(); 
//     	subjectTeacher.stream().forEach(System.out::println);
     	
		TeacherDAO teacherDAO = new MysqlTeacherDAO(mgr);
		System.out.println("Teachers");
     	Collection<Teacher> teachers = teacherDAO.getAll(); 
     	teachers.stream().forEach(System.out::println);


     	
     	mgr.closeConnection();
	}

}
