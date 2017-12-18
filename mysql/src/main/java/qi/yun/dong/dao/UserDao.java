package qi.yun.dong.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import qi.yun.dong.entity.User;

/**
 * 
 * @author dongyunqi
 * @date 2017年9月6日上午9:39:36
 * @description
 */
@Repository(value = "userDao")
public interface UserDao extends PagingAndSortingRepository<User, Long>, JpaSpecificationExecutor<User> {

	/**
	 * 注意findByName中的name是User实体的属性，查询的时候会将传入的变量作为该属性进行查询，
	 * 并且findBy后的名字必须是实体的属性，不然会报无该属性的错误
	 * 
	 * @param name
	 * @return
	 */
	User findByName(String name);

	@Query("from User t where name = :name")
	List<User> queryFamilyList(@Param("name") String name, Pageable pageable);

}
