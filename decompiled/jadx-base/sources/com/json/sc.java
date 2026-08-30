package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class sc extends android.os.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.lo> f3270a;

    public sc(android.os.Looper looper) {
        super(looper);
        this.f3270a = new java.util.concurrent.ConcurrentHashMap<>();
    }

    private boolean a(int i) {
        return i == 1016 || i == 1015;
    }

    void a(java.lang.String str, com.json.lo loVar) {
        if (str == null || loVar == null) {
            return;
        }
        this.f3270a.put(str, loVar);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        try {
            com.json.ih ihVar = (com.json.ih) message.obj;
            java.lang.String path = ihVar.getPath();
            com.json.lo loVar = this.f3270a.get(path);
            if (loVar == null) {
                return;
            }
            if (a(message.what)) {
                loVar.a(ihVar);
            } else {
                int i = message.what;
                loVar.a(ihVar, new com.json.ah(i, com.json.fv.a(i)));
            }
            this.f3270a.remove(path);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }
}
