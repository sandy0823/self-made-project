package com.wf.system.mapper;

import com.wf.system.model.entity.SecondCategory;
import org.apache.ibatis.jdbc.SQL;

public class SecondCategorySqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_category
	 * @mbg.generated
	 */
	public String insertSelective(SecondCategory record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("second_category");
		if (record.getId() != null) {
			sql.VALUES("id", "#{id,jdbcType=INTEGER}");
		}
		if (record.getName() != null) {
			sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
		}
		if (record.getDescript() != null) {
			sql.VALUES("descript", "#{descript,jdbcType=VARCHAR}");
		}
		if (record.getParentCategoryId() != null) {
			sql.VALUES("parent_category_id", "#{parentCategoryId,jdbcType=INTEGER}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_category
	 * @mbg.generated
	 */
	public String updateByPrimaryKeySelective(SecondCategory record) {
		SQL sql = new SQL();
		sql.UPDATE("second_category");
		if (record.getName() != null) {
			sql.SET("name = #{name,jdbcType=VARCHAR}");
		}
		if (record.getDescript() != null) {
			sql.SET("descript = #{descript,jdbcType=VARCHAR}");
		}
		if (record.getParentCategoryId() != null) {
			sql.SET("parent_category_id = #{parentCategoryId,jdbcType=INTEGER}");
		}
		sql.WHERE("id = #{id,jdbcType=INTEGER}");
		return sql.toString();
	}
}