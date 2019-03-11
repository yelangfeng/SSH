package cn.csdas.ssh.dao;

import cn.csdas.ssh.domain.Customer;

/**
 * 客户管理的dao层接口
 * @author yelf
 */
public interface CustomerDao {
    void save(Customer customer);
}
