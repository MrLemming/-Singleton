package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    protected int num = 1;

    public void log(String msg) {
        String dateAndTime = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
                .format(Calendar.getInstance().getTime());
        System.out.println("[" + dateAndTime + " " + num++ + "] " + msg);
    }

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public int getNum() {
        return num;
    }
}

