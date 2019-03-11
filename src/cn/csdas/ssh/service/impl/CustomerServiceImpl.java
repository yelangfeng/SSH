package cn.csdas.ssh.service.impl;
import cn.csdas.ssh.dao.CustomerDao;
import cn.csdas.ssh.domain.Customer;
import cn.csdas.ssh.service.CustomerService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 客户管理的业务层实现类
 * @author yelf
 */
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
}
