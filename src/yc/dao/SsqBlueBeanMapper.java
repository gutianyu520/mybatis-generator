package yc.dao;

import java.math.BigDecimal;
import yc.bean.SsqBlueBean;

public interface SsqBlueBeanMapper {
    int deleteByPrimaryKey(BigDecimal expect);

    int insert(SsqBlueBean record);

    int insertSelective(SsqBlueBean record);

    SsqBlueBean selectByPrimaryKey(BigDecimal expect);

    int updateByPrimaryKeySelective(SsqBlueBean record);

    int updateByPrimaryKey(SsqBlueBean record);
}