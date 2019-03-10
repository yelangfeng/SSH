package cn.csdas.ssh.service.impl;
import cn.csdas.ssh.domain.Customer;
import cn.csdas.ssh.service.CustomerService;

/**
 * 客户管理的业务层实现类
 * @author yelf
 */
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void save(Customer customer) {
        System.out.println("service的save方法执行了");
    }
}
