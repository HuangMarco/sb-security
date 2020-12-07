package com.huangshi.security.demo.dao;

import com.huangshi.security.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {
}
