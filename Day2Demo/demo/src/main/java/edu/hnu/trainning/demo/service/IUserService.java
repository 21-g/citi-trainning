package edu.hnu.trainning.demo.service;

import edu.hnu.trainning.demo.common.Result;
import edu.hnu.trainning.demo.entity.User;

public interface IUserService {

    Result addUser(User user);

    Result showUsers();
}
