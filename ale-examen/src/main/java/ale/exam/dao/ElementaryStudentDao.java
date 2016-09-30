package ale.exam.dao;

import ale.exam.domain.ElementaryStudent;

public class ElementaryStudentDao extends StudentDao<ElementaryStudent>{
	
	static private ElementaryStudentDao instance = new ElementaryStudentDao(); 
	
	public static ElementaryStudentDao getInstance(){
		return instance;   
	} 
	  
}
