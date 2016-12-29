package com.dyq.ssm.service;
import com.dyq.ssm.pojo.Usergit;

import java.util.List;
/**
 * Created by 95312 on 2016/12/28.
 */
public interface UsergitService {

    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<Usergit> findUsergit()throws Exception;
}
