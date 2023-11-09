package com.lti.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.User;

@Repository
public interface IUserRepo  extends CrudRepository<User, String> {

}
