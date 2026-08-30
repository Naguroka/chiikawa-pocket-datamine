package com.json.mediationsdk.logger;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceLoggerManager extends com.json.mediationsdk.logger.IronSourceLogger implements com.json.mediationsdk.logger.LogListener {
    private static com.json.mediationsdk.logger.IronSourceLoggerManager d;
    private java.util.ArrayList<com.json.mediationsdk.logger.IronSourceLogger> c;

    private IronSourceLoggerManager(java.lang.String str) {
        super(str);
        this.c = new java.util.ArrayList<>();
        c();
    }

    private IronSourceLoggerManager(java.lang.String str, int i) {
        super(str, i);
        this.c = new java.util.ArrayList<>();
        c();
    }

    private com.json.mediationsdk.logger.IronSourceLogger a(java.lang.String str) {
        for (com.json.mediationsdk.logger.IronSourceLogger ironSourceLogger : this.c) {
            if (ironSourceLogger.b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }

    private void a(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, int i) {
        for (com.json.mediationsdk.logger.IronSourceLogger ironSourceLogger : this.c) {
            if (ironSourceLogger.a() <= i) {
                ironSourceLogger.log(ironSourceTag, str, i);
            }
        }
    }

    private boolean a(int i) {
        return i < this.f2986a;
    }

    private void c() {
        this.c.add(new com.json.mediationsdk.logger.a(0));
    }

    public static synchronized com.json.mediationsdk.logger.IronSourceLoggerManager getLogger() {
        if (d == null) {
            d = new com.json.mediationsdk.logger.IronSourceLoggerManager("IronSourceLoggerManager");
        }
        return d;
    }

    public static synchronized com.json.mediationsdk.logger.IronSourceLoggerManager getLogger(int i) {
        com.json.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = d;
        if (ironSourceLoggerManager == null) {
            d = new com.json.mediationsdk.logger.IronSourceLoggerManager("IronSourceLoggerManager");
        } else {
            ironSourceLoggerManager.f2986a = i;
        }
        return d;
    }

    synchronized void a(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, com.json.gl glVar) {
        if (a(glVar.getLogLevel())) {
            return;
        }
        a(ironSourceTag, glVar.c(), glVar.getLogLevel());
    }

    public void addLogger(com.json.mediationsdk.logger.IronSourceLogger ironSourceLogger) {
        this.c.add(ironSourceLogger);
    }

    @Override // com.json.mediationsdk.logger.IronSourceLogger
    @java.lang.Deprecated(forRemoval = true, since = "8.3.0")
    public synchronized void log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, int i) {
        if (a(i)) {
            return;
        }
        a(ironSourceTag, str, i);
    }

    @Override // com.json.mediationsdk.logger.IronSourceLogger
    public synchronized void logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, java.lang.Throwable th) {
        try {
            if (th == null) {
                java.util.Iterator<com.json.mediationsdk.logger.IronSourceLogger> it = this.c.iterator();
                while (it.hasNext()) {
                    it.next().log(ironSourceTag, str, 3);
                }
            } else {
                java.util.Iterator<com.json.mediationsdk.logger.IronSourceLogger> it2 = this.c.iterator();
                while (it2.hasNext()) {
                    it2.next().logException(ironSourceTag, str, th);
                }
            }
        } catch (java.lang.Throwable th2) {
            throw th2;
        }
    }

    @Override // com.json.mediationsdk.logger.LogListener
    public synchronized void onLog(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, int i) {
        log(ironSourceTag, str, i);
    }

    public void setLoggerDebugLevel(java.lang.String str, int i) {
        if (str == null) {
            return;
        }
        com.json.mediationsdk.logger.IronSourceLogger ironSourceLoggerA = a(str);
        if (ironSourceLoggerA == null) {
            log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
        } else if (i < 0 || i > 3) {
            this.c.remove(ironSourceLoggerA);
        } else {
            log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
            ironSourceLoggerA.setDebugLevel(i);
        }
    }
}
