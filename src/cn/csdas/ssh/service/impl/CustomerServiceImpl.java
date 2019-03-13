package cn.csdas.ssh.service.impl;
import cn.csdas.ssh.dao.CustomerDao;
import cn.csdas.ssh.domain.Customer;
import cn.csdas.ssh.service.CustomerService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 客户管理的业务层实现类
 * @author yelf
 */
//业务层开启事物
@Transactional
public class CustomerServiceImpl implements CustomerService {
    //注入dao
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        System.out.println("service的save方法执行了");
        customerDao.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerDao.delete(customer);
    }

    @Override
    public void update(Customer customer) {
        customerDao.update(customer);
    }

    @Override
    public Customer findById(int cust_id) {
        Customer customer = customerDao.findById(cust_id);
        return customer;
    }

    @Override
    public List<Customer> findByHQL() {
        return customerDao.findAllByHQL();
    }

    @Override
    public List<Customer> findByQBC() {
        return customerDao.findAllByQBC();
    }

    @Override
    public List<Customer> findAllByName() {
        return customerDao.findAllByName();
    }

}
