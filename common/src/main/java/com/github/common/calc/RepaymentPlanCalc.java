package com.github.common.calc;

import com.github.common.base.AbstractBean;
import com.github.common.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RepaymentPlanCalc extends AbstractBean {

    /**
     * 起息日
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date beginDate;
    /**
     * 还款日
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    /**
     * 本金
     */
    private Double captial;
    /**
     * 利息
     */
    private Double interest;
    /**
     * 当期还款总额
     */
    private Double totalMoney;
    /**
     * 期数
     */
    private Integer period;

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getCaptial() {
        return captial;
    }

    public void setCaptial(Double captial) {
        this.captial = captial;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        try {
            return "RepaymentPlanCalc{" +
                    "beginDate=" + DateUtils.format(beginDate, "yyyy-MM-dd") +
                    ", endDate=" + DateUtils.format(endDate, "yyyy-MM-dd") +
                    ", captial=" + captial +
                    ", interest=" + interest +
                    ", totalMoney=" + totalMoney +
                    ", period=" + period +
                    '}';
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
