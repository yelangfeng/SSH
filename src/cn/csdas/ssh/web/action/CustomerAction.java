package cn.csdas.ssh.web.action;

import cn.csdas.ssh.domain.Customer;
import cn.csdas.ssh.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * 客户管理的Action类
 * @author yelf
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    //模型驱动使用的对象
    private Customer customer = new Customer();

    @Override
    public Customer getModel() {
        return customer;
    }

    //注入CustomerService
    private CustomerService customerService;
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public String save(){
        //web层未使用Struts2，获取业务层的类必须如下进行编写
        /*WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
        CustomerService customerService = (CustomerService)wac.getBean("customerService");
        customerService.save(customer);*/

        customerService.save(customer);
        System.out.println("Action的save方法执行了");
        return NONE;
    }
}
