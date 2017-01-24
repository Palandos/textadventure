package data.service;

import data.api.UserService;

/**
 * Created by daniel on 24.01.17.
 */
public class UserServiceImpl implements UserService{

    public boolean loginAccept(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }

}
