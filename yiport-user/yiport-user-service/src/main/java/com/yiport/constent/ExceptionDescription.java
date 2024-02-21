package com.yiport.constent;

/**
 * 异常详细描述
 */
public interface ExceptionDescription
{
    // ------ user ------

    String ACCOUNT_PASSWORD_ERROR = "账号或密码错误";

    String ACCOUNT_EXIST = "账号已存在";

    String ACCOUNT_NOT_EXIST = "用户不存在";

    String NICKNAME_EXIST = "昵称已存在";

    String CAPTCHA_EXPIRE = "验证码过期请刷新重试";

    String CAPTCHA_ERROR = "验证码错误请重试";

    String PASSWORD_DIFFERENT = "两次输入的密码不一致";

    // ------ token ------

    String TOKEN_ILLEGAL = "Token非法！";

    String TOKEN_EXPIRE = "认证过期，请重新登录";

    String NOT_LOGIN = "用户未登录";

    // ------ mail ------

    String MAIL_BINDING_ACCOUNT = "该邮箱已绑定账号";

    String MAIL_NOT_BINDING = "该邮箱没有与账号绑定";

}
