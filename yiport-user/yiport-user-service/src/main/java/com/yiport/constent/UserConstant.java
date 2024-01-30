package com.yiport.constent;

/**
 * 用户常量
 */
public interface UserConstant {

    /**
     * 用户登录成功
     */
    String LOGIN_SUCCESS = "登录成功";

    /**
     * 用户登录失败
     */
    String LOGIN_FAIL = "登录失败";

    /**
     * 用户注册成功
     */
    String REGISTER_SUCCESS = "注册成功";

    /**
     * 用户注册失败
     */
    String REGISTER_FAIL = "注册失败";

    /**
     * 成功
     */
    String SUCCESS = "0";

    /**
     * 失败
     */
    String FAIL = "1";


    /**
     * Content-Type
     */
    String JPG = "image/jpg";
    String JPEG = "image/jpeg";
    String PNG = "image/png";

    /**
     * 邮箱校验
     */
    String EMAIL_REGEX = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9]+)+";

    /**
     * 空字符校验
     */
    String NULL_REGEX = "[\\s]";

    /**
     * 特殊字符校验
     */
    String SPECIAL_REGEX = "[\\s`!@#$%^&*_\\-~()+=|{}':;,\\[\\].<>/\\\\?！￥…（）—【】‘；：”“’。，、？]";

    /**
     * 账号校验（只含有汉字、数字、字母、下划线并且长度在4-9之间）
     */
    String ACCOUNT_REGEX = "^[a-zA-Z0-9_\\u4e00-\\u9fa5]{4,9}$";

    /**
     * 密码校验（必须包含数字和英文字母和特殊字符（!@#$%^&*）并且长度在8-16之间）
     */
    String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$\\%\\^\\&\\*])[0-9a-zA-Z!@#$\\%\\^\\&\\*]{8,16}";

    /**
     * 验证码-结果分隔符
     */
    String CAPTCHA_RESULT_SPLIT = "@";

    /**
     * 管理员权限
     */
    String ADMIN_ROLE = "1";

    /**
     * 账号正常启用
     */
    String NORMAL_STATUS = "0";

    /**
     * Token过期时间
     */
    long EXPIRATION = 48 * 60 * 60 * 1000L;
    /**
     * 强制重新登录时间（10天）
     */
    Long LIMIT_TIME = 10 * 24 * 60 * 60 * 1000L;

    /**
     * Token刷新时间（12小时）
     */
    Long RELOAD_TIME = 12 * 60 * 60 * 1000L;

    /**
     * 系统自动分配昵称前缀
     */
    String NICKNAME_PREFIX = "用户";

    /**
     * UID区间标识（common）
     */
    String SECTION_MARK = "common";

    /**
     * token-header-key
     */
    String TOKEN_HEADER_KEY = "token";

    /**
     * 博客验证码
     */
    String CAPTCHA_CODES = "ypblog:user:captcha_codes:";

    /**
     * userInfo
     */
    String USER_INFO = "userInfo";

    /**
     * mail-subject
     */
    String VALIDATION_MESSAGE = "验证消息";

    /**
     * verify-mail-captcha-key
     */
    String VERIFY_MAIL_CAPTCHA = "verify_mail_captcha:";

    /**
     * get_account_mail_captcha-key
     */
    String GET_ACCOUNT_MAIL_CAPTCHA = "get_account_mail_captcha:";

    /**
     * update-password-mail-captcha-key
     */
    String UPDATE_PASSWORD_MAIL_CAPTCHA = "update_password_mail_captcha:";

    /**
     * 邮箱验证码过期时间（分钟）
     */
    Integer MAIL_CAPTCHA_TIME = 3;

}
