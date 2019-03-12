package cn.csdas.ssh.service;

import cn.csdas.ssh.domain.Customer;

import java.util.List;

/**
 * 客户管理的业务层接口
 * @author yelf
 */
public interface CustomerService {
    void save(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
    Customer findById(int cust_id);
    List<Customer> findByHQL();
    List<Customer> findByQBC();
    List<Customer> findAllByName();
}
