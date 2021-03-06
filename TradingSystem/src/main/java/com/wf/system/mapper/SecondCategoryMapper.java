package com.wf.system.mapper;

import com.wf.system.model.entity.SecondCategory;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SecondCategoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_category
	 * @mbg.generated
	 */
	@Delete({ "delete from second_category", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_category
	 * @mbg.generated
	 */
	@Insert({ "insert into second_category (id, name, ", "descript, parent_category_id)",
			"values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
			"#{descript,jdbcType=VARCHAR}, #{parentCategoryId,jdbcType=INTEGER})" })
	int insert(SecondCategory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_category
	 * @mbg.generated
	 */
	@InsertProvider(type = SecondCategorySqlProvider.class, method = "insertSelective")
	int insertSelective(SecondCategory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_category
	 * @mbg.generated
	 */
	@Select({ "select", "id, name, descript, parent_category_id", "from second_category",
			"where id = #{id,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "descript", property = "descript", jdbcType = JdbcType.VARCHAR),
			@Result(column = "parent_category_id", property = "parentCategoryId", jdbcType = JdbcType.INTEGER) })
	SecondCategory selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_category
	 * @mbg.generated
	 */
	@UpdateProvider(type = SecondCategorySqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(SecondCategory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_category
	 * @mbg.generated
	 */
	@Update({ "update second_category", "set name = #{name,jdbcType=VARCHAR},",
			"descript = #{descript,jdbcType=VARCHAR},", "parent_category_id = #{parentCategoryId,jdbcType=INTEGER}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(SecondCategory record);
}