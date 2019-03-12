package cn.csdas.ssh.dao;

import cn.csdas.ssh.domain.Customer;

import java.util.List;

/**
 * 客户管理的dao层接口
 * @author yelf
 */
public interface CustomerDao {
    void save(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
    Customer findById(int cust_id);
    List<Customer> findAllByHQL();
    List<Customer> findAllByQBC();
    List<Customer> findAllByName();
}
