package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.bean.TestBean;

@Component
public class TestDAO {
	//���� ������ ������ ��
	// ���� ������ ��: JdbcTemplate
	//���⿡ jdbcTemplate�� �־�� �Ѵ�.
	@Autowired
	JdbcTemplate db;
	
	 // insert
	 public void insert_data(TestBean bean) {
	    String sql = "insert into test values(?, ?)";
	    db.update(sql, bean.getData1(), bean.getData2());
	  }
}
