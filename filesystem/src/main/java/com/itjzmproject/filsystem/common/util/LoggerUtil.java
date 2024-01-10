package com.itjzmproject.filsystem.common.util;

import org.apache.commons.lang.StringUtils;

import org.slf4j.Logger;

/**
 * @author fanghui
 */
public final class LoggerUtil {

    /**
     * 线程编号修饰符
     */
    public static final char THREAD_RIGHT_TAG = ']';

    /**
     * 线程编号修饰符
     */
    public static final char THREAD_LEFT_TAG = '[';

    /**
     * 换行符
     */
    public static final char ENTERSTR = '\n';

    /**
     * 逗号
     */
    public static final char COMMA = ',';

    private final static Boolean logDownGradingSwitch = false;

    /**
     * 禁用构造函数
     */
    private LoggerUtil() {
        // 禁用构造函数
    }

    /**
     * 生成<font color="blue">调试级别日志
     *
     * @param logger 日志对象
     * @param obj    输出对象 输出对象
     */
    public static void debug(Logger logger, Object... obj) {
        if (logger.isDebugEnabled() && !logDownGradingSwitch) {
            logger.debug(getLogString(obj));
        }
    }

    /**
     * 生成<font color="blue">通知级别日志
     *
     * @param logger 日志对象
     * @param obj    输出对象
     */
    public static void info(Logger logger, Object... obj) {
        if (logger.isInfoEnabled() && !logDownGradingSwitch) {
            logger.info(getLogString(obj));
        }
    }

    /**
     * 生成<font color="brown">警告级别日志
     *
     * @param logger 日志对象
     * @param obj    输出对象
     */
    public static void warn(Logger logger, Object... obj) {
        logger.warn(getLogString(obj));
    }

    /**
     * 生成<font color="brown">警告级别日志
     *
     * @param logger 日志对象
     * @param obj    输出对象
     * @param t      异常对象
     */
    public static void warn(Logger logger, Throwable t, Object... obj) {
        if (t == null) {
            logger.warn(getLogString(obj));
        } else {
            logger.warn(getLogString(obj), t);
        }
    }

    /**
     * 生成<font color="brown">错误级别日志
     *
     * @param logger 日志对象
     * @param obj    输出对象
     * @param t      可为空
     */
    public static void error(Logger logger, Throwable t, Object... obj) {
        if (t == null) {
            logger.error(getLogString(obj));
        } else {
            logger.error(getLogString(obj), t);
        }

    }

    /**
     * 生成输出到日志的字符串
     *
     * @param obj 任意个要输出到日志的参数
     * @return 生成输出到日志的字符串
     */
    public static String getLogString(Object... obj) {
        String threadId = String.valueOf(Thread.currentThread().getId());
        if (StringUtils.isEmpty(threadId)) {
            threadId = "null";
        }
        StringBuilder log = new StringBuilder();
        log.append(THREAD_LEFT_TAG).append(threadId);
        for (Object o : obj) {
            log.append(COMMA);
            log.append(o);
        }
        log.append(THREAD_RIGHT_TAG);
        return log.toString();
    }

}