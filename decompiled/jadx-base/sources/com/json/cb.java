package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class cb extends android.os.Handler {
    private static final java.lang.String b = "DownloadHandler";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.json.lo f2556a;

    public cb(android.os.Looper looper) {
        super(looper);
    }

    public void a() {
        this.f2556a = null;
    }

    public void a(com.json.lo loVar) {
        if (loVar == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f2556a = loVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.json.lo loVar = this.f2556a;
        if (loVar == null) {
            com.json.sdk.utils.Logger.i(b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                loVar.a((com.json.ih) message.obj);
            } else {
                this.f2556a.a((com.json.ih) message.obj, new com.json.ah(i, com.json.fv.a(i)));
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.sdk.utils.Logger.i(b, "handleMessage | Got exception: " + th.getMessage());
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }
}
