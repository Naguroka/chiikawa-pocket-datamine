package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ul implements com.json.mediationsdk.sdk.SegmentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.mediationsdk.sdk.SegmentListener f3471a;
    private final com.ironsource.ul.b b;
    protected long c;

    private class b extends java.lang.Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.os.Handler f3472a;

        private b() {
        }

        public android.os.Handler a() {
            return this.f3472a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.os.Looper.prepare();
            this.f3472a = new android.os.Handler();
            android.os.Looper.loop();
        }
    }

    public ul() {
        com.ironsource.ul.b bVar = new com.ironsource.ul.b();
        this.b = bVar;
        bVar.start();
        this.c = new java.util.Date().getTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f3471a.onSegmentReceived(str);
    }

    public void a(com.json.mediationsdk.sdk.SegmentListener segmentListener) {
        this.f3471a = segmentListener;
    }

    protected void a(java.lang.Runnable runnable) {
        android.os.Handler handlerA;
        com.ironsource.ul.b bVar = this.b;
        if (bVar == null || (handlerA = bVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }

    protected boolean a(java.lang.Object obj) {
        return (obj == null || this.b == null) ? false : true;
    }

    @Override // com.json.mediationsdk.sdk.SegmentListener
    public void onSegmentReceived(final java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.CALLBACK, "onSegmentReceived(" + str + ")", 1);
        if (a((java.lang.Object) this.f3471a)) {
            a(new java.lang.Runnable() { // from class: com.ironsource.ul$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(str);
                }
            });
        }
    }
}
