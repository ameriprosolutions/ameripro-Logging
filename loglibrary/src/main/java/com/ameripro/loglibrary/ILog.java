
/**
 * Created by Ameripro-solutions on 1/4/2018.
 */

package com.ameripro.loglibrary;

/**
 *  A simple loglibrary interface abstracting loglibrary APIs. In order to be
 * instantiated successfully by {@link LogFactory}, classes that implement
 * this interface must have a constructor that takes a single String
 * parameter representing the "message" of this Log.
 * <p>
 * The three logging levels used by <code>log</code> are (in order):
 * <ol>
 *  <li>Debug</li>
 * <li>Error</li>
 * <li>Info</li>
 * </ol>
 * <p>
 * Performance is often a logging concern.
 * By examining the appropriate property,
 * a component can avoid expensive operations (producing information
 * to be logged).
 * <p>
 * <p>
 * For example,
 * <pre>
 *   LogFactory.getInstance().logDebug(String message)
 *   or
 *   LogFactory.getInstance().logError(String message)
 * </pre>
 * <p>
 *
 */


public interface ILog {

    /**
     * Logs a message with debug log level.
     *
     * @param debugMessage log this message
     */

    public void logDebug(String debugMessage);



    /**
     * Logs a message with error log level.
     *
     * @param logError log this message
     */

    public void logError(String logError);



    /**
     * Logs a message with info log level.
     *
     * @param logInfo log this message
     */

    public void logInfo(String logInfo);



    /**
     * Logs a message with debug log level.
     *
     * @param debugMessage log this message
     * @param exception log this cause
     */
    public void logDebug(String debugMessage,Throwable exception);


    /**
     * Logs a message with error log level.
     *
     * @param logError log this message
     * @param exception log this cause
     */
    public void logError(String logError,Throwable exception);


    /**
     * Logs a message with info log level.
     *
     * @param logInfo log this message
     * @param exception log this cause
     */
    public void logInfo(String logInfo,Throwable exception);

}
