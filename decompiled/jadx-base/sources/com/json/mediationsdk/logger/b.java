package com.json.mediationsdk.logger;

/* JADX INFO: loaded from: classes5.dex */
public class b extends com.json.mediationsdk.logger.IronSourceLogger {
    private static final java.lang.String e = "publisher";
    private com.json.mediationsdk.logger.LogListener c;
    private boolean d;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2989a;
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag b;
        final /* synthetic */ int c;

        a(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, int i) {
            this.f2989a = str;
            this.b = ironSourceTag;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.mediationsdk.logger.b.this.c == null || this.f2989a == null) {
                return;
            }
            com.json.mediationsdk.logger.b.this.c.onLog(this.b, this.f2989a, this.c);
        }
    }

    private b() {
        super("publisher");
    }

    public b(com.json.mediationsdk.logger.LogListener logListener, int i) {
        super("publisher", i);
        this.c = logListener;
        this.d = false;
    }

    public void a(com.json.mediationsdk.logger.LogListener logListener) {
        this.c = logListener;
    }

    public void a(boolean z) {
        this.d = z;
    }

    @Override // com.json.mediationsdk.logger.IronSourceLogger
    public void log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, int i) {
        com.ironsource.mediationsdk.logger.b.a aVar = new com.ironsource.mediationsdk.logger.b.a(str, ironSourceTag, i);
        if (this.d) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(aVar);
        } else {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postPublisherCallback(aVar);
        }
    }

    @Override // com.json.mediationsdk.logger.IronSourceLogger
    public void logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, java.lang.Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}
