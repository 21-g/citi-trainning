package edu.hnu.trainning.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hnu.trainning.demo.common.Result;
import edu.hnu.trainning.demo.entity.User;
import edu.hnu.trainning.demo.mapper.UserMapper;
import edu.hnu.trainning.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result addUser(User user) {
        save(user);
        return Result.success();
    }

    @Override
    public Result showUsers() {
        return Result.success(list());
    }
}
