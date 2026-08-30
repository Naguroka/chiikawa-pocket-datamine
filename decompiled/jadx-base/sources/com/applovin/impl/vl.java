package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class vl implements com.applovin.impl.l3 {
    protected vl() {
    }

    @Override // com.applovin.impl.l3
    public long a() {
        return android.os.SystemClock.uptimeMillis();
    }

    @Override // com.applovin.impl.l3
    public void b() {
    }

    @Override // com.applovin.impl.l3
    public long c() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.l3
    public com.applovin.impl.ia a(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new com.applovin.impl.wl(new android.os.Handler(looper, callback));
    }
}
