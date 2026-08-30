package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class a1 extends android.os.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected java.lang.ref.WeakReference<com.pgl.ssdk.a1.a> f3777a;

    public interface a {
        void a(android.os.Message message);
    }

    public a1(android.os.Looper looper, com.pgl.ssdk.a1.a aVar) {
        super(looper);
        if (aVar != null) {
            this.f3777a = new java.lang.ref.WeakReference<>(aVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.pgl.ssdk.a1.a aVar;
        java.lang.ref.WeakReference<com.pgl.ssdk.a1.a> weakReference = this.f3777a;
        if (weakReference == null || (aVar = weakReference.get()) == null || message == null) {
            return;
        }
        aVar.a(message);
    }
}
