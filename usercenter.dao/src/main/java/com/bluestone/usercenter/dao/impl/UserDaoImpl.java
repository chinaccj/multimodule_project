package com.bluestone.usercenter.dao.impl;

import com.bluestone.usercenter.bean.UserInfo;
import com.bluestone.usercenter.dao.intf.UserDaoService;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by yumo on 16/7/29.
 */
public class UserDaoImpl implements UserDaoService {

    private SqlSession sqlSession;

    @Override
    public String getUserName() {
        UserInfo userInfo = sqlSession.selectOne("UserInfo.findUserById","1");

        return userInfo.getName();
    }




    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
}
