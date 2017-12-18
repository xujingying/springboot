package qi.yun.dong.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import qi.yun.dong.dao.UserDao;
import qi.yun.dong.entity.User;

@Service(value = "userSerivce")
public class UserSerivceImpl implements UserSerivce {
	@Resource(name = "userDao")
	private UserDao userDao;

	@Override
	public User findByName(String name) {
		return userDao.findByName(name);
	}

	@Override
	public List<User> queryFamilyList(String name, Pageable pageable) {
		return userDao.queryFamilyList(name, pageable);
	}
 
	@Transactional(rollbackFor = { Exception.class })
	@Override
	public void saveUser(User user) {
		userDao.save(user);
	}
}
