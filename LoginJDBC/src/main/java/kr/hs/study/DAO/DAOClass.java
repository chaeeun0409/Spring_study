package kr.hs.study.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;



@Component
public class DAOClass {

	@Autowired
	JdbcTemplate db;
	// insert
		 public void insert_data(TestBean bean) {
		    String sql = "insert into Login values(?,?,?,?)";
		    db.update(sql, bean.getData1(), bean.getData2(), bean.getData3(), bean.getData4());
		  }
}
