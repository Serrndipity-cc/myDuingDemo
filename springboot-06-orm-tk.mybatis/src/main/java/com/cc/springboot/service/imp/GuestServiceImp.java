package com.cc.springboot.service.imp;

import com.cc.springboot.mapper.GuestMapper;
import com.cc.springboot.model.Guest;
import com.cc.springboot.service.GuestService;
import com.cc.springboot.tk_mapper.TK_GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @authotr chencai
 * @createDate 2021/9/30
 */
@Service
public class GuestServiceImp implements GuestService {

    @Autowired
    TK_GuestMapper  guestMapper;

    @Override
    public List<Guest> getList() {

        return  guestMapper.selectAll();
    }
}
