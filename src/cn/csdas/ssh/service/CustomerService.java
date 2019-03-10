package cn.csdas.ssh.service;

import cn.csdas.ssh.domain.Customer;

/**
 * 客户管理的业务层接口
 * @author yelf
 */
public interface CustomerService {
    void save(Customer customer);
}
