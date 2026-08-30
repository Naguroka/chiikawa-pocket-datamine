package com.json.mediationsdk.logger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class IronSourceLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f2986a;
    private java.lang.String b;

    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    IronSourceLogger(java.lang.String str) {
        this.b = str;
        this.f2986a = 0;
    }

    IronSourceLogger(java.lang.String str, int i) {
        this.b = str;
        this.f2986a = i;
    }

    int a() {
        return this.f2986a;
    }

    java.lang.String b() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.json.mediationsdk.logger.IronSourceLogger)) {
            return false;
        }
        com.json.mediationsdk.logger.IronSourceLogger ironSourceLogger = (com.json.mediationsdk.logger.IronSourceLogger) obj;
        java.lang.String str = this.b;
        return str != null && str.equals(ironSourceLogger.b);
    }

    public abstract void log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, int i);

    public abstract void logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, java.lang.Throwable th);

    public void setDebugLevel(int i) {
        this.f2986a = i;
    }
}
