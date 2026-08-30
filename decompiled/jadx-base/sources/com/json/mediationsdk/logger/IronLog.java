package com.json.mediationsdk.logger;

/* JADX INFO: loaded from: classes5.dex */
public enum IronLog {
    API(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API),
    CALLBACK(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.EVENT);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag f2984a;

    IronLog(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f2984a = ironSourceTag;
    }

    public void error() {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f2984a, new com.json.gl("", 3));
    }

    public void error(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f2984a, new com.json.gl(str, 3));
    }

    public void info() {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f2984a, new com.json.gl("", 1));
    }

    public void info(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f2984a, new com.json.gl(str, 1));
    }

    public void verbose() {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f2984a, new com.json.gl("", 0));
    }

    public void verbose(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f2984a, new com.json.gl(str, 0));
    }

    public void warning() {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f2984a, new com.json.gl("", 2));
    }

    public void warning(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f2984a, new com.json.gl(str, 2));
    }
}
