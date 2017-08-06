package com.peng.web;

import com.peng.framework.dao.BaseDAO;
import com.peng.model.UserInfoEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by KING on 2017/8/6.
 */
@Controller
public class LoginController {

    @Resource
    private BaseDAO<UserInfoEntity> userDao;

    @RequestMapping(value = "/login")
    public String login(UserInfoEntity user, Map map){
        if("admin".equals(user.getName()) && "admin".equals(user.getPass())){
            map.put("name","成功");
        }else{
            map.put("name","失败");
        }
        return "success";
    }

    @RequestMapping(value = "/testjson")
    @ResponseBody
    public List<UserInfoEntity> testjson(){
        return userDao.listAll(UserInfoEntity.class);
    }

}
