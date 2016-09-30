package ale.exam.main;

import java.util.ArrayList;
import java.util.List;

import ale.exam.domain.ElementaryStudent;
import ale.exam.domain.Student;
import ale.exam.repository.Repository;

public class MainConsole {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub

	}
	
	public void initLoad(){
		
		List<Student>  listStudents= new ArrayList<Student>();
		ElementaryStudent elementaryStudent= new ElementaryStudent('F',"Jane","20151231145934");
		listStudents.add(elementaryStudent);
		/* Guardando al repositorio*/
		Repository.repositoryCache.put(ElementaryStudent.class.getSimpleName()+"s", elementaryStudent);
		
	/*	Repository.repositoryCache.put("kinders", elementaryStudent);
		Repository.repositoryCache.put("highs", elementaryStudent);
		Repository.repositoryCache.put("universitys", elementaryStudent);
		*/
		
		
		
		
		
	}

}
