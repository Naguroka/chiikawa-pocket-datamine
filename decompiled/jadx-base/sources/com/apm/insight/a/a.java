package com.apm.insight.a;

/* JADX INFO: compiled from: AlogUploadManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class a implements com.apm.insight.ICrashCallback {
    private static volatile com.apm.insight.a.a d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile java.lang.String f358a;
    private volatile com.apm.insight.b.i.a b;
    private volatile com.apm.insight.b.i.a c;
    private volatile boolean e = false;

    private a() {
    }

    public static com.apm.insight.a.a a() {
        if (d == null) {
            synchronized (com.apm.insight.a.a.class) {
                if (d == null) {
                    d = new com.apm.insight.a.a();
                }
            }
        }
        return d;
    }

    public final void a(java.lang.String str, com.apm.insight.b.i.a aVar, com.apm.insight.b.i.a aVar2) {
        this.f358a = str;
        this.b = aVar;
        this.c = aVar2;
        if (this.e) {
            return;
        }
        this.e = true;
        com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(com.apm.insight.CrashType crashType, java.lang.String str, java.lang.Thread thread) {
        crashType.equals(com.apm.insight.CrashType.NATIVE);
    }
}
