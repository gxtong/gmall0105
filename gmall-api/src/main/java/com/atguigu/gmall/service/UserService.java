package com.atguigu.gmall.service;


import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    UmsMember getUserById(Integer id);

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
