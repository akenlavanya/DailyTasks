package in.co.hsbc.foodapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PreDestroy;
import javax.sql.DataSource;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.co.hsbc.foodapp.dao.FoodDao;
import in.co.hsbc.foodapp.model.FoodItem;

@Repository("dao")
public class FoodJdbcDaoImpl implements FoodDao{

	@Autowired
	private JdbcTemplate jt;
	
	@Value("${food.selectAll.query}")
	private String selectAllQuery;
	
	@Value("${food.selectById.query}")
	private String selectByIdQuery;
	
	@Value("${food.deleteById.query}")
	private String deleteQuery;
	
	@Value("${food.update.query}")
	private String updateQuery;
	
	@Value("${food.insert.query}")
	private String insertQuery;
	
	class FoodItemRowMapper implements RowMapper<FoodItem>{

		@Override
		public FoodItem mapRow(ResultSet rs, int rowNum) throws SQLException {
					FoodItem f = new FoodItem(rs.getInt(1),rs.getString(2),rs.getDouble(3));
					return f;
				}
		}
	
	@Override
	public List<FoodItem> findAll()
	{
				List<FoodItem> foods = jt.query(selectAllQuery, new FoodItemRowMapper());
				return foods;
	}

	@PreDestroy
	public void close(){}
	
	@Override
	 public void updateItem(FoodItem f) {
		jt.update(updateQuery,f.getPrice(),f.getId());
	}

	@Override
	public FoodItem save(FoodItem f) {
		jt.update(insertQuery,f.getId(),f.getItem(),f.getPrice());
		return f;
	}

	@Override
	public void deleteItem(int id) {
		
		jt.update(deleteQuery,id);
		
	}

}

