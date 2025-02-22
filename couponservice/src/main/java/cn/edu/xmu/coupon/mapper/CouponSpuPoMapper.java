package cn.edu.xmu.coupon.mapper;

import cn.edu.xmu.coupon.model.po.CouponSpuPo;
import cn.edu.xmu.coupon.model.po.CouponSpuPoExample;
import java.util.List;

public interface CouponSpuPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_spu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_spu
     *
     * @mbg.generated
     */
    int insert(CouponSpuPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_spu
     *
     * @mbg.generated
     */
    int insertSelective(CouponSpuPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_spu
     *
     * @mbg.generated
     */
    List<CouponSpuPo> selectByExample(CouponSpuPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_spu
     *
     * @mbg.generated
     */
    CouponSpuPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_spu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CouponSpuPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_spu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CouponSpuPo record);
}