package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
final class LazyLogger {
    private volatile java.util.logging.Logger logger;
    private final java.lang.String loggerName;

    LazyLogger(java.lang.Class<?> ownerOfLogger) {
        this.loggerName = ownerOfLogger.getName();
    }

    java.util.logging.Logger get() {
        java.util.logging.Logger logger = this.logger;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            java.util.logging.Logger logger2 = this.logger;
            if (logger2 != null) {
                return logger2;
            }
            java.util.logging.Logger logger3 = java.util.logging.Logger.getLogger(this.loggerName);
            this.logger = logger3;
            return logger3;
        }
    }
}
