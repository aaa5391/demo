package com.generator.system.core.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ytl on 16/7/7.
 */
public class ErrorCode {
    // 成功
    public static String SUCCESS_CODE = "1";
    //失败
    public static String FAILED_CODE = "0";

    //100-199为系统错误
    public static String INVALID_PARAMS = "100"; //无效的或缺少参数;

    public static String UPLOAD_FILE_IS_ERROR = "101";//上传文件失败

    public static String CLOUND_FILE_ID_IS_ERROR = "102";//云文件Id不正确

    //200-299为User相关错误
    public static String USER_IS_NOT_EXIST = "200";//用户不存在

    public static String USER_PASSWD_IS_ERROR = "201";//用户密码错误

    public static String PHONE_VERIFY_CODE_IS_ERROR = "202";//手机验证码错误

    public static String PASSWD_IS_NOT_ENOUGH_STRONG = "203";//密码过于简单

    public static String PHONE_VERIFY_CODE_IS_EXPIRED = "204";//验证码过期

    public static String REGISTER_USER_IS_EXIST = "205";//手机号已注册

    public static String VERIFY_CODE_OPERATION_IS_ERROR = "206";//手机验证码操作类型错误

    public static String PHONE_NUMBER_IS_ERROR = "207";//手机号码错误

    public static String VERIFY_CODE_SENDER_ERROR = "208";//验证码发送错误

    public static String PHONE_IS_BIND = "209";//手机号已绑定

    public static String DRAW_NUM_IS_EXIST = "210";//用户已完成抽签

    public static String DRAW_NUM_IS_NONE = "211";//抽签号码已用完

    public static String USER_IS_NOT_LOGIN = "212";//用户未登陆

    public static String USER_IS_EXPIRED_LOGIN = "213";//用户登陆过期

    public static String DRAW_SWITCH_IS_OFF = "214";//抽签开关未开启

    public static String DRAW_TIME_IS_NOT_IN = "215";//抽签时间未到

    public static String USER_IS_NOT_MATCH = "216";//用户未报名参赛

    public static String USER_IS_NOT_OPEN_HOMEPAGE = "217";//用户未开启个人主页

    public static String EMAIL_FORMAT_IS_ERROR = "218";//邮箱格式不正确

    public static String USER_ALREADY_BIND_MATCH = "219";//用户已绑定比赛

    public static String MATCH_USER_IS_NOT_EXIST = "220";//比赛选手不存在

    public static String MATCH_USER_INFO_IS_DIFFER = "221";//比赛选手信息不一致

    public static String VISIT_USER_IS_NOT_SELF = "222";//访问的用户不能是自己

    public static String ONLY_COMMON_USER_BIND_MATCH = "223";//只有普通用户才能绑定比赛

    public static String MATCH_INFO_ALREADY_BIND = "224";//参赛信息已被其他用户绑定

    public static String FOLLOWED_USER_IS_NOT_EXIST = "300";//被关注的用户不存在

    public static String FOLLOW_IS_ALREAD_EXIST = "301";//用户已被关注

    public static String FOLLOW_IS_NOT_EXIST = "302";//关注记录不存在

    public static String SHARE_VIDEO_IS_NOT_EXIST = "400";//分享的视频不存在

    public static String VIDEO_IS_NOT_EXIST = "401";//视频不存在

    public static String XIU_VIDEO_CLASS_IS_ERROR = "402";//我秀视频分类错误

    public static String MATCH_VIDEO_MATCH_IS_ERROR = "403";//赛事分类错误

    public static String MATCH_VIDEO_MATCH_AREA_IS_ERROR = "404";//赛区分类错误

    public static String MATCH_VIDEO_MATCH_GROUP_IS_ERROR = "405";//赛组分类错误

    public static String SHARE_VIDEO_IS_MYSELF = "406";//不能分享自己的视频

    public static String VIDEO_IS_ALREADY_FAVOUR = "407";//视频已经被关注

    public static String SHARE_IS_ALREADY_EXIST = "408";//视频已分享

    public static String VIDEO_IN_ADVERT = "409";//视频在广告中

    public static String VIDEO_IN_RECOMMEND = "410";//视频在推荐中

    public static String UPLOAD_MATCH_VIDEO_PERMISSION_DENIED = "411";//没有权限上传比赛视频

    public static String SHARE_IS_NOT_EXIST = "412";// 分享不存在

    public static String STAR_IS_NOT_EXIST = "501";//明星数据不存在

    public static String EMAIL_VERIFY_CODE_IS_NOT_EXIST = "600";//邮箱验证码不存在

    public static String EMAIL_VERIFY_CODE_IS_EXPIRED = "601";//邮箱验证码过期

    public static String EMAIL_VERIFY_CODE_IS_ERROR = "602";//邮箱验证码无效

    public static String EMAIL_IS_ALREADY_BIND = "603";//邮箱已验证

    public static String USER_TAG_IS_NOT_EXIST = "700";//用户标签不存在

    public static String USER_TAG_STATUS_IS_ERROR = "701";//用户标签状态错误

    public static String USER_TAG_WORDS_OVER_LIMIT = "702";//用户标签超过20个字

    public static String USER_COMMENT_WORDS_OVER_LIMIT = "800";//用户评论超过字数限制

    public static String USER_COMMENT_IS_NOT_EXIST = "801";//用户评论不存在

    public static String USER_COMMENT_NOT_REPLY_SELF = "802";//用户评论不能回复自己

    public static String SHARE_COMMENT_WORDS_OVER_LIMIT = "803";//分享评论超过20个字

    public static String VIDEO_COMMENT_IS_NOT_OPENED = "804";//视频评论没有开启

    public static String MESSAGE_IS_ALREDY_EXIST ="811";//消息已查看
    
    public static String MESSAGE_FAILED_INSERT ="812";//消息没有全部插入
    
    public static String MESSAGE_IS_NOT_EXIST = "813";//消息不存在
    
    public static String DYNAMIC_IS_NOT_EXTST = "814";//暂无动态
    
    public static String FOLLOW_USER_IS_NOT_SELF = "303";//不能关注自己
    
    public static String USERNAME_IS_NULL = "304";//用户名不能为空
    
    public static String ENOUNCE_IS_NULL="305";//个性宣言不能为空
    
    public static String USERNAM_OR_ENOUNCE_LENGTH="306";//用户名或个性宣言长度超出
    
    public static String NOT_FIND_LICESE_CODE="307";//找不到的参赛编码
    
    public static String FILE_IS_TOO_LARGE="308";//文件过大
    
    public static String ID_NUMBER_IS_EXIS="309";//证件号码已被他人绑定
    
    public static String GENDER_ERROR="310";//性别错误
    
    public static String PHONE_HAS_BIND="311";//手机号已被绑定过
    
    public static String CODE_NOT_NULL="312";//验证码不能为空
    
    public static String CODE_ERROR="313";//验证码错误
    
    //900-999为后端管理相关错误
    public static String ADMIN_USER_IS_NOT_EXIST = "900";//用户不存在
    public static String ADMIN_USER_PASSWD_IS_ERROR = "901";//用户密码错误
    public static String ADMIN_USER_IMPORT_IS_ERROR = "902";//用户导入错误
    public static String ADMIN_VIDEO_IN_ADVERT = "903";//视频在广告中
    public static String ADMIN_VIDEO_IN_RECOMMEND = "904";//视频在推荐中
    public static String ADMIN_VIDEO_IMPORT_IS_ERROR = "905";//视频导入错误
    public static String ADMIN_MATCH_USER_IMPORT_MISMATCH_ERROR = "906";//赛区不匹
    public static String VERSION_FOR_THE_lATEST = "99";//当前为最新版本

    static public Map<String, String> MSG;


    // 后端严重错误,主要供调试使用
    public static String INTERNAL_SERVER_ERROR = "10000"; // 服务器内部错误
    public static String DB_INSERT_ERROR = "10001"; // DB 插入错误
    public static String DB_UPDATE_ERROR = "10002"; // DB 更新错误

    static {
        MSG = new HashMap<String, String>();
        MSG.put(SUCCESS_CODE, "操作成功");
        MSG.put(INVALID_PARAMS, "无效的参数");
        MSG.put(UPLOAD_FILE_IS_ERROR, "文件上传失败");
        MSG.put(CLOUND_FILE_ID_IS_ERROR, "云文件Id不正确");
        MSG.put(USER_IS_NOT_EXIST, "用户不存在");
        MSG.put(USER_PASSWD_IS_ERROR, "用户密码错误");
        MSG.put(PHONE_VERIFY_CODE_IS_ERROR, "手机验证码错误");
        MSG.put(PASSWD_IS_NOT_ENOUGH_STRONG, "用户密码强度不够");
        MSG.put(PHONE_VERIFY_CODE_IS_EXPIRED, "手机验证码过期");
        MSG.put(REGISTER_USER_IS_EXIST, "手机号已注册");
        MSG.put(VERIFY_CODE_OPERATION_IS_ERROR, "手机验证码操作类型错误");
        MSG.put(PHONE_NUMBER_IS_ERROR, "手机号码错误");
        MSG.put(VERIFY_CODE_SENDER_ERROR, "验证码发送失败");
        MSG.put(PHONE_IS_BIND, "手机号已绑定");
        MSG.put(DRAW_NUM_IS_EXIST, "用户已完成抽签");
        MSG.put(DRAW_NUM_IS_NONE, "抽签号码已用完");
        MSG.put(USER_IS_NOT_LOGIN, "用户未登陆");
        MSG.put(USER_IS_EXPIRED_LOGIN, "用户登陆过期");
        MSG.put(DRAW_SWITCH_IS_OFF, "抽签开关未开启");
        MSG.put(DRAW_TIME_IS_NOT_IN, "抽签时间未到");
        MSG.put(USER_IS_NOT_MATCH, "用户未报名参赛");
        MSG.put(USER_IS_NOT_OPEN_HOMEPAGE, "用户未开启主页");
        MSG.put(EMAIL_FORMAT_IS_ERROR, "邮箱格式不正确");
        MSG.put(USER_ALREADY_BIND_MATCH, "用户已绑定比赛");
        MSG.put(MATCH_USER_IS_NOT_EXIST, "比赛选手不存在");
        MSG.put(MATCH_USER_INFO_IS_DIFFER, "比赛选手信息不一致");
        MSG.put(VISIT_USER_IS_NOT_SELF, "访问的用户不能是自己");
        MSG.put(ONLY_COMMON_USER_BIND_MATCH, "只有普通用户才能绑定比赛");
        MSG.put(MATCH_INFO_ALREADY_BIND, "参赛信息已被其他用户绑定");
        MSG.put(FOLLOWED_USER_IS_NOT_EXIST, "被关注的用户不存在");
        MSG.put(FOLLOW_IS_ALREAD_EXIST, "用户已被关注");
        MSG.put(SHARE_VIDEO_IS_NOT_EXIST, "分享的视频不存在");
        MSG.put(FOLLOW_IS_NOT_EXIST, "关注记录不存在");
        MSG.put(VIDEO_IS_NOT_EXIST, "视频不存在");
        MSG.put(XIU_VIDEO_CLASS_IS_ERROR, "我秀视频分类参数错误");
        MSG.put(MATCH_VIDEO_MATCH_IS_ERROR, "赛事分类错误");
        MSG.put(MATCH_VIDEO_MATCH_AREA_IS_ERROR, "赛区分类错误");
        MSG.put(MATCH_VIDEO_MATCH_GROUP_IS_ERROR, "赛组分类错误");
        MSG.put(SHARE_VIDEO_IS_MYSELF, "不能分享自己的视频");
        MSG.put(SHARE_COMMENT_WORDS_OVER_LIMIT, "分享评论超过20个字");
        MSG.put(VIDEO_COMMENT_IS_NOT_OPENED, "视频评论没有开启");
        MSG.put(VIDEO_IS_ALREADY_FAVOUR, "视频已经被关注");
        MSG.put(SHARE_IS_ALREADY_EXIST, "分享已存在");
        MSG.put(VERSION_FOR_THE_lATEST, "当前为最新版本");
        MSG.put(STAR_IS_NOT_EXIST, "明星数据不存在");
        MSG.put(EMAIL_VERIFY_CODE_IS_NOT_EXIST, "邮箱验证码不存在");
        MSG.put(EMAIL_VERIFY_CODE_IS_EXPIRED, "邮箱验证码过期");
        MSG.put(EMAIL_VERIFY_CODE_IS_ERROR, "邮箱验证码无效");
        MSG.put(EMAIL_IS_ALREADY_BIND, "邮箱已验证");
        MSG.put(USER_TAG_IS_NOT_EXIST, "用户标签不存在");
        MSG.put(USER_TAG_STATUS_IS_ERROR, "用户标签状态错误");
        MSG.put(USER_TAG_WORDS_OVER_LIMIT, "用户标签超过20个字");
        MSG.put(USER_COMMENT_WORDS_OVER_LIMIT, "用户评论超过字数限制");
        MSG.put(USER_COMMENT_IS_NOT_EXIST, "用户评论不存在");
        MSG.put(USER_COMMENT_NOT_REPLY_SELF, "用户评论不能回复自己");
        MSG.put(UPLOAD_MATCH_VIDEO_PERMISSION_DENIED, "没有权限上传比赛视频");
        MSG.put(SHARE_IS_NOT_EXIST, "分享不存在");
        MSG.put(MESSAGE_IS_ALREDY_EXIST,"消息已查看");
        MSG.put(MESSAGE_FAILED_INSERT, "消息没有全部插入");
        MSG.put(MESSAGE_IS_NOT_EXIST,"消息不存在");
        MSG.put(DYNAMIC_IS_NOT_EXTST, "暂无动态");
        MSG.put(FOLLOW_USER_IS_NOT_SELF, "不能关注自己");
        MSG.put(USERNAME_IS_NULL,"用户名不能为空");
        MSG.put(VIDEO_IN_RECOMMEND, "视频在推荐中");
        MSG.put(VIDEO_IN_ADVERT, "视频已经展示在广告位中，请联系管理员！");
        MSG.put(ENOUNCE_IS_NULL, "更新宣言不能为空");
        MSG.put(USERNAM_OR_ENOUNCE_LENGTH, "用户名或宣言长度超出");
        MSG.put(NOT_FIND_LICESE_CODE, "参赛码不存在");
        MSG.put(FILE_IS_TOO_LARGE, "文件过大");
        MSG.put(ID_NUMBER_IS_EXIS, "证件号码已被他人绑定");
        MSG.put(GENDER_ERROR, "性别错误");
        MSG.put(PHONE_HAS_BIND, "手机号已被他人绑定");
        MSG.put(CODE_NOT_NULL, "验证码不能为空");
        MSG.put(CODE_ERROR, "验证码错误");
        /*
         * 后端分割线
         */
        MSG.put(ADMIN_USER_IS_NOT_EXIST, "用户不存在");
        MSG.put(ADMIN_USER_PASSWD_IS_ERROR, "密码错误");

        MSG.put(ADMIN_USER_IMPORT_IS_ERROR, "用户导入错误");

        MSG.put(ADMIN_VIDEO_IN_ADVERT, "视频已经展示在广告位中，请修改关联的视频！");
        MSG.put(ADMIN_VIDEO_IN_RECOMMEND, "视频已经展示在发现推荐中，请在发现推荐列表中将其推荐位设置下线！");
        MSG.put(ADMIN_VIDEO_IMPORT_IS_ERROR, "视频导入过程中出现错误！");
        MSG.put(ADMIN_MATCH_USER_IMPORT_MISMATCH_ERROR, "选手上传时请选择对应的赛区！");
        MSG.put(INTERNAL_SERVER_ERROR, "系统内部错误");
        MSG.put(DB_INSERT_ERROR, "数据库插入数据错误!");
        MSG.put(DB_UPDATE_ERROR, "数据库更新数据错误!");
    }
}
