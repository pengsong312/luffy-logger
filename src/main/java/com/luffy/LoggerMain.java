package com.luffy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Luffy
 * @date 2017/11/21
 * @description todo
 */
public class LoggerMain {

    private static final Logger logger = LoggerFactory.getLogger(LoggerMain.class);

    private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");



    public static void main(String[] args) {

        for (int i = 0; i < 10000000; i++) {
            logger.info("LoggerMain main test ... " + i);
            debugLogger.info("LoggerMain main test 1111111111111111111111111 ... " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
