package com.hope.remains.common.exception.auth;


import com.hope.remains.common.constant.CommonConstants;
import com.hope.remains.common.exception.BaseException;

/**
 * @Description:
 * @Author: tr
 * @CreateDate: 2020/8/2
 */
public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
