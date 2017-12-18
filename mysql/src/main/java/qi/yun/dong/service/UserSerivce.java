package qi.yun.dong.service;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import qi.yun.dong.entity.User;

/**
 * 
 * @author dongyunqi
 * @date 2017年9月6日上午10:07:23
 * @description
 */
public interface UserSerivce {
	/**
	 * 通过名字获取用户对象
	 * 
	 * @param name
	 * @return
	 */
	public User findByName(String name);

	public void saveUser(User user);

	List<User> queryFamilyList(@Param("name") String name, Pageable pageable);
}
