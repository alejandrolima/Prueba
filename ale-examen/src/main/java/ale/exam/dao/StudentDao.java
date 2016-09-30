package ale.exam.dao;

import java.util.List;

import ale.exam.domain.Student;
import ale.exam.repository.Repository;

public abstract class StudentDao<E extends Student> {

	@SuppressWarnings("unchecked")
	protected List<E> findAll(Class<E> clazz) {
		List<E> list = (List<E>)Repository.repositoryCache.get(clazz.getSimpleName() + "s");	
		return list;
	}

}
