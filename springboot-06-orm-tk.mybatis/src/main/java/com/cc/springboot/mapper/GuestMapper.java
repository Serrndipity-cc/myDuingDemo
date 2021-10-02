package com.cc.springboot.mapper;

import com.cc.springboot.model.Guest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @authotr chencai
 * @createDate 2021/9/30
 */

// 必须要用@Mapper注解，不然会报错， 不能用spring的注解
@Mapper
public interface GuestMapper {

    //@Select(" select * from guest")
    List<Guest>   getGuestList();

}
