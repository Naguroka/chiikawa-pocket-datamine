package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class em extends com.applovin.impl.yl {
    private final com.applovin.impl.em.a h;

    public interface a {
        void a(com.applovin.impl.l0.a aVar);
    }

    public em(com.applovin.impl.sdk.j jVar, com.applovin.impl.em.a aVar) {
        super("TaskCollectAdvertisingId", jVar, true);
        this.h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.h.a(this.f1547a.x().f());
    }
}
