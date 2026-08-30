package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1114Wi implements com.facebook.ads.redexgen.core.InterfaceC0733Hi {
    @Override // com.facebook.ads.redexgen.core.InterfaceC0733Hi
    public final com.facebook.ads.redexgen.core.C1113Wh A4y(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new com.facebook.ads.redexgen.core.C1113Wh(new android.os.Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0733Hi
    public final long A5p() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0733Hi
    public final long AHK() {
        return android.os.SystemClock.uptimeMillis();
    }
}
