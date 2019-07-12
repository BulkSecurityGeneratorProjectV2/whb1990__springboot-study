package com.springboot.whb.study.modules.seckill.po;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table success_killed
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SuccessKilledKey {
    /**
     * Database Column Remarks:
     *   秒杀商品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column success_killed.seckill_id
     *
     * @mbg.generated
     */
    private Long seckillId;

    /**
     * Database Column Remarks:
     *   用户Id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column success_killed.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column success_killed.seckill_id
     *
     * @return the value of success_killed.seckill_id
     *
     * @mbg.generated
     */
    public Long getSeckillId() {
        return seckillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column success_killed.seckill_id
     *
     * @param seckillId the value for success_killed.seckill_id
     *
     * @mbg.generated
     */
    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column success_killed.user_id
     *
     * @return the value of success_killed.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column success_killed.user_id
     *
     * @param userId the value for success_killed.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}