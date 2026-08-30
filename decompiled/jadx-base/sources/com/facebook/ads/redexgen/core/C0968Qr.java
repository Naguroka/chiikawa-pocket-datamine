package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0968Qr extends android.database.ContentObserver {
    public final com.facebook.ads.redexgen.core.C1017So A00;

    public C0968Qr(android.os.Handler handler, com.facebook.ads.redexgen.core.C1017So c1017So) {
        super(handler);
        this.A00 = c1017So;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0e();
    }
}
