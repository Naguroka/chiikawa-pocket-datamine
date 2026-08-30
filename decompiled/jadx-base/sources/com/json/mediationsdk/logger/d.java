package com.json.mediationsdk.logger;

/* JADX INFO: loaded from: classes5.dex */
public class d implements java.lang.Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "Thread name =" + thread.getName(), th);
    }
}
