package utils;

import io.qameta.allure.Step;

public class Logger {

    @Step("{message}")
    public static void logStep(String message) {
        System.out.println("<" + Helper.getCurrentTime("dd-MM-yyyy HH:mm:ss.SSS a") + "> " + message);
        ExtentReport.info(message);
    }
}
