package programmers.coffee.domain.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StockMapper {
    void decreaseStock(@Param("itemId") Long itemId, @Param("cnt") int cnt);
}