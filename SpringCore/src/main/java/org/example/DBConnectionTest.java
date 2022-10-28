package org.example;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DBConnectionTest {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        //
        //xml file name
        BeanFactory factory = new XmlBeanFactory(resource);
        //bean factory
        //
        //Address address = (Address) factory.getBean("address");
        //System.out.println("Addresss::::"+address.getPinCode());

        Employee employee = (Employee) factory.getBean("employee");
        System.out.printf("Employeee ::"+employee.getAddress().getPinCode());
        //DBConnection dbConnection = (DBConnection) factory.getBean("DBConnectionID");
        //dbConnection.getAllInfo();
        //System.out.println("DB details :::");
    }
}
