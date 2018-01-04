package com.ameripro.loglibrary;

import android.util.Log;

/**
 * Created by Rajshekhar on 1/4/2018.
 */

public class LogFactory implements ILog {

    private static LogFactory logFactoryObj;
    /**
     * Create private constructor
     */
    private LogFactory(){

    }
    /**
     * Create a static method to get instance.
     */
    public static LogFactory getInstance() throws LogLibException{
        if(logFactoryObj == null){
            logFactoryObj = new LogFactory();
        }
        return logFactoryObj;
    }
    @Override
    public void logDebug(String debugMessage) {
        Log.d("LOGLIBRARY",debugMessage);
    }

    @Override
    public void logError(String deubError) {
        Log.d("LOGLIBRARY",deubError);
    }

    @Override
    public void logInfo(String debugInfo) {
        Log.d("LOGLIBRARY",debugInfo);
    }
}
