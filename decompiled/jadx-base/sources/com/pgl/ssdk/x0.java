package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class x0 extends com.pgl.ssdk.a1 implements com.pgl.ssdk.y0 {
    private final android.os.HandlerThread b;

    x0(android.os.HandlerThread handlerThread, com.pgl.ssdk.a1.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.b = handlerThread;
    }

    public void a(com.pgl.ssdk.a1.a aVar) {
        this.f3777a = new java.lang.ref.WeakReference<>(aVar);
    }

    public void a(java.lang.String str) {
        android.os.HandlerThread handlerThread = this.b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
