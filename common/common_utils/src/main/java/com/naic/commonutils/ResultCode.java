package com.naic.commonutils;



import javax.servlet.http.HttpServletResponse;

/**
 * @作者：刘子越（Derrick）
 * @创造日期：2023-01-09-上午10:53
 */
public enum ResultCode implements IResultCode {


    /**
     * 成功
     */
    SUCCESS(HttpServletResponse.SC_OK, "操作成功"),

    /**
     * 业务异常
     */
    FAILURE(HttpServletResponse.SC_BAD_REQUEST, "业务异常"),

    /**
     * 请求未授权
     */
    UN_AUTHORIZED(HttpServletResponse.SC_UNAUTHORIZED, "请求未授权"),

    /**
     * 404 没找到请求
     */
    NOT_FOUND(HttpServletResponse.SC_NOT_FOUND, "404 没找到请求"),

    /**
     * 消息不能读取
     */
    MSG_NOT_READABLE(HttpServletResponse.SC_BAD_REQUEST, "消息不能读取"),

    /**
     * 不支持当前请求方法
     */
    METHOD_NOT_SUPPORTED(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "不支持当前请求方法"),

    /**
     * 不支持当前媒体类型
     */
    MEDIA_TYPE_NOT_SUPPORTED(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, "不支持当前媒体类型"),

    /**
     * 请求被拒绝
     */
    REQ_REJECT(HttpServletResponse.SC_FORBIDDEN, "请求被拒绝"),

    /**
     * 服务器异常
     */
    INTERNAL_SERVER_ERROR(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "服务器异常"),

    /**
     * 缺少必要的请求参数
     */
    PARAM_MISS(HttpServletResponse.SC_BAD_REQUEST, "缺少必要的请求参数"),

    /**
     * 请求参数类型错误
     */
    PARAM_TYPE_ERROR(HttpServletResponse.SC_BAD_REQUEST, "请求参数类型错误"),

    /**
     * 请求参数绑定错误
     */
    PARAM_BIND_ERROR(HttpServletResponse.SC_BAD_REQUEST, "请求参数绑定错误"),

    /**
     * 参数校验失败
     */
    PARAM_VALID_ERROR(HttpServletResponse.SC_BAD_REQUEST, "参数校验失败"),


    UNKNOWN_ERROR(20000, "未知错误"),
    VALIDATION_ERROR(20001,"参数校验错误"),
    DUPLICATED_KEY_ERROR(20002,"重复的主键"),
    NONE_KEY_ERROR(20003,"主键不存在"),
    FOREIGN_KEY_ERROR(20004,"存在外键约束"),
    CONTENT_TYPE_ERROR(20005,"请检查content-type"),
    DUPLICATED_RECORD_ERROR(20006, "该记录已经存在"),
    NONE_RECORD_ERROR(20007, "该记录不存在"),
    CONTENT_ERROR(20008, "提交内容有误"),
    FIlE_NOT_EXIST_ERROR(20009, "文件不存在"),

    DUPLICATED_ACCOUNT(20019, "用户名已存在"),
    DUPLICATED_WORK_NUM(20020, "工号已存在"),


    PAGINATION_ERROR(6015, "分页错误"),
    SCHEDULER_ERROR(6016, "定时器错误"),

    IN_REPOSITORY_ERROR(6002, "只有“已清洗”或“检验合格”状态的治具，可以进行入库操作"),
    OUT_REPOSITORY_ERROR(6003,"只有“在库”状态的治具，可以进行出库操作"),
    ONLINE_ERROR(6004,"只有在产线状态才可以上线"),
    OFFLINE_ERROR(6005,"钢网没有上线"),
    CLEAN_ERROR(6006,"已下线状态才可清洗"),
    DESTORY_ERROR(6007,"只有在库状态，可以进行报废操作"),

    BIND_ERROR(6008,"钢网不能用于当前产品上,或者面别错误,请检查钢网配置的产品"),




    /**
     * 批次条码规则不存在
     */
    LOT_CODE_NOT_EXIST(30083,"批次条码规则不存在"),
    /**
     * 序列号已绑定
     */
    SERIAL_NUMBER_IS_BINDING(30084,"序列号已绑定"),
    /**
     * 辅料回温已达2次
     */
    REWARM_TO_LIMIT_ERROR(30020, "辅料回温已达2次"),
    /**
     * 回温小于规定时长，不能搅拌
     */
    REWARM_LESS_REQUIRE_ERROR(30021, "回温小于规定时长，不能搅拌"),
    /**
     * 回温大于于规定时长，不能搅拌
     */
    REWARM_MORE_REQUIRE_ERROR(30022, "回温大于于规定时长，不能搅拌"),
    /**
     * 辅料不是在库状态不能解冻
     */
    REWARM_STATE_ERROR(30023, "辅料不是在库状态不能解冻"),
    /**
     * 辅料状态不能进行搅拌操作
     */
    STIRRING_STATE_ERROR(30024, "辅料状态不能进行搅拌操作"),
    /**
     * 搅拌小于规定时长，不能上料
     */
    STIRRING_LESS_REQUIRE_ERROR(30025, "搅拌小于规定时长，不能上料"),
    /**
     * 搅拌大于规定时长，不能上料
     */
    STIRRING_MORE_REQUIRE_ERROR(30026, "搅拌大于规定时长，不能上料"),
    /**
     * 辅料状态不能进行上料操作
     */
    MATERIAL_STATE_ERROR(30027, "辅料状态不能进行上料操作"),
    /**
     * GRN对应的辅料不在该工单产品维护的辅料明细中
     */
    MATERIAL_CHECK_ERROR(30028, "GRN对应的辅料不在该工单产品维护的辅料明细中"),
    /**
     * 上料大于使用时长，不能退回
     */
    MATERIAL_MORE_REQUIRE_ERROR(30029, "上料大于使用时长，不能退回"),
    /**
     * 辅料在库状态不能退回
     */
    RETURN_REPOSITORY_STATE_ERROR(30030, "辅料在库状态不能退回"),
    /**
     * 辅料报废状态不能退回
     */
    RETURN_DISCARD_STATE_ERROR(30031, "辅料报废状态不能退回"),
    /**
     * 辅料状态不能进行报废操作
     */
    DISCARD_STATE_ERROR(30032, "辅料状态不能进行报废操作"),
    /**
     * 辅料不是使用中状态,不能进行此操作
     */
    RECYCLE_STATE_ERROR(30033, "辅料不是使用中状态,不能进行此操作"),
    /**
     * 辅料已过期
     */
    EXPIRED_ERROR(30034, "辅料已过期"),
    /**
     * GRN不存在
     */
    GRN_NON_EXIST_ERROR(30035, "GRN不存在"),

    /**
     * 排程工单状态不为备料完成/可上料
     */
    SCHEDULE_CHECK_STATE_ERROR(30050, "排程工单状态不为备料完成/可上料"),
    /**
     * 排程工单状态不为上料验证
     */
    SCHEDULE_FEED_STATE_ERROR(30051, "排程工单状态不为上料验证"),


    /**
     * 此料站无需上料
     */
    FEED_STATION_ERROR(30054, "此料站无需上料"),
    /**
     * 此料站已经上料
     */
    FEED_STATION_FED_ERROR(30055, "此料站已经上料"),
    /**
     * 飞达类型不匹配
     */
    FEEDER_NOT_MATCH_ERROR(30056, "飞达类型不匹配"),

    /**
     * 该插槽已经上料完成
     */
    MATERIAL_AMOUNT_DEEDING_COMPLETED(30057, "该插槽已经上料完成"),

    /**
     * 物料不匹配
     */
    MATERIAL_NOT_MATCH_ERROR(30058, "物料不匹配"),
    /**
     * 上料清单该站位用量为0
     */
    USAGE_AMOUNT_ZERO_ERROR(30059, "上料清单该站位用量为0"),
    /**
     * 料盘可用量为0
     */
    MATERIAL_AMOUNT_ZERO_ERROR(30060, "料盘可用量为0"),
    /**
     * 还未开始上料
     */
    CHECK_NOT_BEGIN_ERROR(30061, "还未开始上料"),
    /**
     * 物料未全部校验
     */
    CHECK_NOT_FINISH_ERROR(30062, "物料未全部校验"),

    /**
     * 输入GRN为空
     */
    GRN_NULL_ERROR(30064, "输入GRN为空"),
    /**
     * 工单已经完成
     */
    ORDER_FINISHED_ERROR(30065, "工单已经完成"),
    /**
     * 创建目录失败
     */
    CREATE_DIR_ERROR(30066, "创建目录失败");


    private final int code;

    private final String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }



    @Override
    public String getMessage() {
        return message;
    }
}
