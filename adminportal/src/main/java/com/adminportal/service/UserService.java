package com.adminportal.service;

import com.adminportal.domain.User;
import com.adminportal.domain.security.UserRole;

import java.util.Set;

public interface UserService {
    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);
}
