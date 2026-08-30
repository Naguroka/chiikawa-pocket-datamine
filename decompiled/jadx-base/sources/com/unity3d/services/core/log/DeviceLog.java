package com.unity3d.services.core.log;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceLog {
    private static boolean FORCE_DEBUG_LOG = false;
    public static final int LOGLEVEL_DEBUG = 8;
    private static final int LOGLEVEL_ERROR = 1;
    public static final int LOGLEVEL_INFO = 4;
    private static final int LOGLEVEL_WARNING = 2;
    private static boolean LOG_DEBUG = true;
    private static boolean LOG_ERROR = true;
    private static boolean LOG_INFO = true;
    private static boolean LOG_WARNING = true;
    private static final int MAX_DEBUG_MSG_LENGTH = 3072;
    private static final java.util.HashMap<com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel, com.unity3d.services.core.log.DeviceLogLevel> _deviceLogLevel;

    public enum UnityAdsLogLevel {
        INFO,
        DEBUG,
        WARNING,
        ERROR
    }

    static {
        java.util.HashMap<com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel, com.unity3d.services.core.log.DeviceLogLevel> map = new java.util.HashMap<>();
        _deviceLogLevel = map;
        if (map.size() == 0) {
            map.put(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.INFO, new com.unity3d.services.core.log.DeviceLogLevel(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT));
            map.put(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.DEBUG, new com.unity3d.services.core.log.DeviceLogLevel("d"));
            map.put(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.WARNING, new com.unity3d.services.core.log.DeviceLogLevel("w"));
            map.put(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.ERROR, new com.unity3d.services.core.log.DeviceLogLevel("e"));
        }
        if (new java.io.File("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
            FORCE_DEBUG_LOG = true;
        }
    }

    public static void setLogLevel(int i) {
        if (i >= 8) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = true;
            LOG_DEBUG = true;
            return;
        }
        if (i >= 4) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = true;
            LOG_DEBUG = false;
            return;
        }
        if (i >= 2) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = false;
            LOG_DEBUG = false;
            return;
        }
        if (i >= 1) {
            LOG_ERROR = true;
            LOG_WARNING = false;
            LOG_INFO = false;
            LOG_DEBUG = false;
            return;
        }
        LOG_ERROR = false;
        LOG_WARNING = false;
        LOG_INFO = false;
        LOG_DEBUG = false;
    }

    public static void entered() {
        debug("ENTERED METHOD");
    }

    public static void info(java.lang.String str) {
        write(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.INFO, checkMessage(str));
    }

    public static void info(java.lang.String str, java.lang.Object... objArr) {
        info(java.lang.String.format(str, objArr));
    }

    public static void debug(java.lang.String str) {
        if (isDebugEnabled()) {
            if (str.length() > MAX_DEBUG_MSG_LENGTH) {
                debug(str.substring(0, MAX_DEBUG_MSG_LENGTH));
                if (str.length() < 30720) {
                    debug(str.substring(MAX_DEBUG_MSG_LENGTH));
                    return;
                }
                return;
            }
            write(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.DEBUG, checkMessage(str));
        }
    }

    public static void debug(java.lang.String str, java.lang.Object... objArr) {
        if (isDebugEnabled()) {
            debug(java.lang.String.format(str, objArr));
        }
    }

    private static boolean isDebugEnabled() {
        return LOG_DEBUG || FORCE_DEBUG_LOG;
    }

    public static void warning(java.lang.String str) {
        write(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.WARNING, checkMessage(str));
    }

    public static void warning(java.lang.String str, java.lang.Object... objArr) {
        warning(java.lang.String.format(str, objArr));
    }

    public static void error(java.lang.String str) {
        write(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.ERROR, checkMessage(str));
    }

    public static void exception(java.lang.String str, java.lang.Exception exc) {
        java.lang.String str2 = str != null ? "" + str : "";
        if (exc != null) {
            str2 = str2 + ": " + exc.getMessage();
        }
        if (exc != null && exc.getCause() != null) {
            str2 = str2 + ": " + exc.getCause().getMessage();
        }
        write(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.ERROR, str2);
    }

    public static void error(java.lang.String str, java.lang.Object... objArr) {
        error(java.lang.String.format(str, objArr));
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.log.DeviceLog$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel;

        static {
            int[] iArr = new int[com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.values().length];
            $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel = iArr;
            try {
                iArr[com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.INFO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.DEBUG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.WARNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private static void write(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel unityAdsLogLevel, java.lang.String str) {
        boolean z;
        int i = com.unity3d.services.core.log.DeviceLog.AnonymousClass1.$SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[unityAdsLogLevel.ordinal()];
        if (i == 1) {
            z = LOG_INFO;
        } else if (i == 2) {
            z = LOG_DEBUG;
        } else if (i == 3) {
            z = LOG_WARNING;
        } else {
            z = i != 4 ? true : LOG_ERROR;
        }
        if (FORCE_DEBUG_LOG ? true : z) {
            writeToLog(createLogEntry(unityAdsLogLevel, str));
        }
    }

    private static java.lang.String checkMessage(java.lang.String str) {
        return (str == null || str.length() == 0) ? "DO NOT USE EMPTY MESSAGES, use DeviceLog.entered() instead" : str;
    }

    private static com.unity3d.services.core.log.DeviceLogLevel getLogLevel(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel unityAdsLogLevel) {
        return _deviceLogLevel.get(unityAdsLogLevel);
    }

    private static com.unity3d.services.core.log.DeviceLogEntry createLogEntry(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel unityAdsLogLevel, java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        com.unity3d.services.core.log.DeviceLogLevel logLevel = getLogLevel(unityAdsLogLevel);
        if (logLevel == null) {
            return null;
        }
        int i = 0;
        boolean z = false;
        while (i < stackTrace.length) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i];
            if (stackTraceElement.getClassName().equals(com.unity3d.services.core.log.DeviceLog.class.getName())) {
                z = true;
            }
            if (!stackTraceElement.getClassName().equals(com.unity3d.services.core.log.DeviceLog.class.getName()) && z) {
                break;
            }
            i++;
        }
        java.lang.StackTraceElement stackTraceElement2 = i < stackTrace.length ? stackTrace[i] : null;
        if (stackTraceElement2 != null) {
            return new com.unity3d.services.core.log.DeviceLogEntry(logLevel, str, stackTraceElement2);
        }
        return null;
    }

    private static void writeToLog(com.unity3d.services.core.log.DeviceLogEntry deviceLogEntry) {
        java.lang.reflect.Method method;
        if (deviceLogEntry == null || deviceLogEntry.getLogLevel() == null) {
            return;
        }
        try {
            method = android.util.Log.class.getMethod(deviceLogEntry.getLogLevel().getReceivingMethodName(), java.lang.String.class, java.lang.String.class);
        } catch (java.lang.Exception e) {
            android.util.Log.e("UnityAds", "Writing to log failed!", e);
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(null, deviceLogEntry.getLogLevel().getLogTag(), deviceLogEntry.getParsedMessage());
            } catch (java.lang.Exception e2) {
                android.util.Log.e("UnityAds", "Writing to log failed!", e2);
            }
        }
    }
}
