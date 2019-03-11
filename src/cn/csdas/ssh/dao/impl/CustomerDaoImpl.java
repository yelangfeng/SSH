package cn.csdas.ssh.dao.impl;

import cn.csdas.ssh.dao.CustomerDao;
import cn.csdas.ssh.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * 客户管理的dao层实现类
 * @author yelf
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    @Override
    public void save(Customer customer){
        System.out.println("DAO中的save方法执行了...");
        //使用Hibernate模板完成保存操作
        this.getHibernateTemplate().save(customer);
    }
}
