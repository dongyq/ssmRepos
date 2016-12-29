package com.dyq.ssm.service;
import com.dyq.ssm.mapper.UsergitMapper;
import com.dyq.ssm.pojo.Usergit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by 95312 on 2016/12/28.
 */
@Service
public class UsergitServiceImpl implements UsergitService {

    //User接口
    @Autowired
    private UsergitMapper usergitMapper;

    public List<Usergit> findUsergit() throws Exception {
        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<Usergit> usergits = usergitMapper.selectByExample(null);

        return usergits;
    }
}
