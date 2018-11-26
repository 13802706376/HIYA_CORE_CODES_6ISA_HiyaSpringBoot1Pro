package com.hiya.boot.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HiyaLog
{
    private static final Logger logger = LoggerFactory.getLogger(HiyaLog.class);
    public static void main(String args[])
    {
        logger.debug("日志输出测试 Debug");
        logger.trace("日志输出测试 Trace");
        logger.info("日志输出测试 Info");
    }
}
