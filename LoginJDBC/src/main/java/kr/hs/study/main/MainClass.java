package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.DAO.DAOClass;
import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		//TestDAO ������ ����
		DAOClass dao = ctx.getBean(DAOClass.class);
		
		TestBean bean1 = new TestBean();
		bean1.setData1("3217");
		bean1.setData2("0000");
		bean1.setData3("�谡��");
		bean1.setData4(19);
		
		//insert_data ȣ��
		dao.insert_data(bean1);
		System.out.println("Inserted!!!!");
		ctx.close();
	}

}
