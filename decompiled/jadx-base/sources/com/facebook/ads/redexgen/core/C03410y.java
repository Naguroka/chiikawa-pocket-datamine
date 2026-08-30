package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03410y extends android.content.BroadcastReceiver {
    public static byte[] A04;
    public com.facebook.ads.redexgen.core.InterfaceC1369cf A00;
    public com.facebook.ads.redexgen.core.InterfaceC03400x A01;
    public com.facebook.ads.redexgen.core.C1199Zs A02;
    public java.lang.String A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 66, 78, 76, 15, 71, 64, 66, 68, 67, 78, 78, 74, 15, 64, 69, 82, 15, 67, 64, 79, 79, 68, 83, 15, 66, 77, 72, 66, 74, 68, 69};
    }

    public C03410y(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, com.facebook.ads.redexgen.core.InterfaceC1369cf interfaceC1369cf, com.facebook.ads.redexgen.core.InterfaceC03400x interfaceC03400x) {
        this.A02 = c1199Zs;
        this.A03 = str;
        this.A01 = interfaceC03400x;
        this.A00 = interfaceC1369cf;
    }

    public final void A02() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        com.facebook.ads.redexgen.core.C03832o.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        com.facebook.ads.redexgen.core.C03832o.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        java.lang.String intentAction = A00(0, 1, 83);
        java.lang.String[] parts = action.split(intentAction);
        java.lang.String str = parts[0];
        if (str == null) {
            return;
        }
        java.lang.String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ABN(this.A00);
        }
    }
}
