package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class jn extends com.applovin.impl.yl {
    private final java.lang.Runnable h;

    public jn(com.applovin.impl.sdk.j jVar, java.lang.String str, java.lang.Runnable runnable) {
        this(jVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.h.run();
    }

    public jn(com.applovin.impl.sdk.j jVar, boolean z, java.lang.String str, java.lang.Runnable runnable) {
        super("TaskRunnable:" + str, jVar, z);
        this.h = runnable;
    }
}
