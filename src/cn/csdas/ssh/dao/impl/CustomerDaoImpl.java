package cn.csdas.ssh.dao.impl;

import cn.csdas.ssh.dao.CustomerDao;
import cn.csdas.ssh.domain.Customer;
import org.apache.commons.io.CopyUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

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

    @Override
    public void delete(Customer customer) {
        this.getHibernateTemplate().delete(customer);
    }

    @Override
    public void update(Customer customer) {
        this.getHibernateTemplate().update(customer);
    }

    @Override
    public Customer findById(int cust_id) {
        Customer customer = this.getHibernateTemplate().get(Customer.class,cust_id);
        return customer;
    }

    @SuppressWarnings("JpaQlInspection")
    @Override
    public List<Customer> findAllByHQL() {
        List<Customer> list = (List<Customer>)this.getHibernateTemplate().find(" from Customer");
        return list;
    }

    @Override
    public List<Customer> findAllByQBC() {
        DetachedCriteria dc = DetachedCriteria.forClass(Customer.class);
        List<Customer> list = (List<Customer>)this.getHibernateTemplate().findByCriteria(dc);
        return list;
    }

    @SuppressWarnings("JpaQueryApiInspection")
    @Override
    public List<Customer> findAllByName() {
        List<Customer> list = (List<Customer>)this.getHibernateTemplate().findByNamedQuery("queryAll");
        return list;
    }

}
