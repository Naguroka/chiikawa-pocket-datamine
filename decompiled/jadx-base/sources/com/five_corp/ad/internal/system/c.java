package com.five_corp.ad.internal.system;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f2067a = new java.util.ArrayList();
    public int b;

    public c(java.lang.String str) {
        for (int i = 0; i < 3; i++) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("com.five-corp." + str + "-" + i);
            handlerThread.start();
            this.f2067a.add(handlerThread);
        }
        this.b = 0;
    }

    public final android.os.Looper a() {
        android.os.HandlerThread handlerThread;
        if (this.b < this.f2067a.size()) {
            handlerThread = (android.os.HandlerThread) this.f2067a.get(this.b);
            this.b++;
        } else {
            if (this.f2067a.isEmpty()) {
                return null;
            }
            handlerThread = (android.os.HandlerThread) this.f2067a.get(0);
            this.b = 1;
        }
        return handlerThread.getLooper();
    }
}
