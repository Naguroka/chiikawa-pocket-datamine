package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1192Zl implements com.facebook.ads.redexgen.core.AnonymousClass80 {
    public static byte[] A04;
    public android.content.Context A00;
    public final com.facebook.ads.redexgen.core.InterfaceC05117z A02;
    public final java.util.concurrent.atomic.AtomicBoolean A03 = new java.util.concurrent.atomic.AtomicBoolean(false);
    public com.facebook.ads.redexgen.core.C05107x A01 = A00();

    static {
        A03();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{113, 101, 122, 106, 102, 112, 97, 97, 124, 123, 114, 102, 106, 126, 112, 108};
    }

    public C1192Zl(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC05117z interfaceC05117z) {
        this.A00 = context;
        this.A02 = interfaceC05117z;
    }

    private com.facebook.ads.redexgen.core.C05107x A00() {
        return com.facebook.ads.redexgen.core.C05107x.A00(com.facebook.ads.redexgen.core.KJ.A00(this.A00).getString(A01(0, 16, 100), null));
    }

    private void A02() {
        this.A02.AAq(new com.facebook.ads.redexgen.core.C1193Zm(this));
    }

    public final void A04(java.lang.String[] strArr, java.lang.Integer num, java.lang.Integer num2) {
        com.facebook.ads.redexgen.core.C05107x c05107x = new com.facebook.ads.redexgen.core.C05107x(strArr, num, num2);
        com.facebook.ads.redexgen.core.C05107x newSettings = this.A01;
        if (c05107x.equals(newSettings)) {
            return;
        }
        this.A01 = c05107x;
        this.A03.set(true);
        android.content.SharedPreferences.Editor editorEdit = com.facebook.ads.redexgen.core.KJ.A00(this.A00).edit();
        com.facebook.ads.redexgen.core.C05107x newSettings2 = this.A01;
        editorEdit.putString(A01(0, 16, 100), newSettings2.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass80
    public final com.facebook.ads.redexgen.core.C05107x A76() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass80
    public final boolean A9e() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        java.util.Set<java.lang.String> setA0Y = com.facebook.ads.redexgen.core.C0762Im.A0Y(this.A00);
        java.lang.String identifier = this.A01.A07();
        java.util.Iterator<java.lang.String> it = setA0Y.iterator();
        while (it.hasNext()) {
            if (identifier.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass80
    public final boolean AGj() {
        A02();
        return this.A03.getAndSet(false);
    }
}
