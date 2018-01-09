
/**
 * Created by Ameripro-solutions on 1/4/2018.
 */

package com.ameripro.loglibrary;

import android.util.Log;

/**
 * Factory for creating {@link ILog} instances, with discovery.
 */

public class LogFactory implements ILog {

    /**
     * creating {@Link LogFactory} instance.
     */
    private static LogFactory logFactoryObj;

    /**
     * Create private constructor.
     */
    private LogFactory() {

    }

    /**
     * Create a static method to get instance.
     */

    public static LogFactory getInstance() throws LogLibException {
        if (logFactoryObj == null) {
            logFactoryObj = new LogFactory();
        }
        return logFactoryObj;
    }


    /**
     * Logs a message with <code>android.util.log</code>.
     *
     * @param debugMessage to log
     */

    @Override
    public void logDebug(String debugMessage) {
        Log.d("LOGLIBRARY", debugMessage);
    }

    /**
     * Logs a message with <code>android.util.log</code>.
     *
     * @param logError to log
     */
    @Override
    public void logError(String logError)
    {
        Log.e("LOGLIBRARY", logError);
    }


    /**
     * Logs a message with <code>android.util.log</code>.
     *
     * @param logInfo to log
     */

    @Override
    public void logInfo(String logInfo) {

        Log.i("LOGLIBRARY", logInfo);
    }



    /**
     * Logs a message with <code>android.util.log</code>.
     *
     * @param debugLog to log
     * @param exception log this cause

     */
    @Override
    public void logDebug(String debugLog, Throwable exception) {
        Log.d("LOGLIBRARY", debugLog, exception);

    }


    /**
     * Logs a message with <code>android.util.log</code>.
     *
     * @param logError to log
     * @param exception log this cause

     */
    @Override
    public void logError(String logError, Throwable exception) {
        Log.e("LOGLIBRARY", logError, exception);
    }



    /**
     * Logs a message with <code>android.util.log</code>.
     *
     * @param logInfo to log
     * @param exception log this cause

     */
    @Override
    public void logInfo(String logInfo, Throwable exception) {
        Log.i("LOGLIBRARY", logInfo, exception);
    }
}
