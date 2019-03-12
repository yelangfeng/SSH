package cn.csdas.ssh.demo;

import cn.csdas.ssh.domain.Customer;
import cn.csdas.ssh.service.CustomerService;
import cn.csdas.ssh.service.impl.CustomerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * ssh项目测试类
 * @author yelf
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_1.xml")
public class SSHDemo {
    @Resource(name = "customerService")
    private CustomerService customerService;

    @Test
    //保存
    public void demo1(){
        Customer customer = new Customer();
        customer.setCust_name("吴建");
        customerService.save(customer);
    }

    @Test
    //更新
    public void demo2(){
        Customer customer = customerService.findById(3);
        customer.setCust_id(3);
        customer.setCust_name("张健");
        customerService.update(customer);
    }

    @Test
    //删除
    public void demo3(){
        Customer customer = customerService.findById(2);
        customerService.delete(customer);
    }

    @Test
    //查询全部(QBC)
    public void demo4(){
        List<Customer> list = customerService.findByQBC();
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    @Test
    //按查询语句名称查询
    public void demo5(){
        List<Customer> list = customerService.findAllByName();
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    @Test
    //查询全部(HQL)
    public void demo6(){
        List<Customer> list = customerService.findByHQL();
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }
}
