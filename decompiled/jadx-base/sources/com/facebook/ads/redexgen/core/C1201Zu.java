package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1201Zu implements com.facebook.ads.redexgen.core.RV {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"5xwnqBcSwQdKZIKpCxhEhIB1ehz5rbXz", "SVnny4sMHrVxDT0mCWgznsGyNwA0K29Q", "WSedDxIDZVsWQqxlis9Ww20KqcWIyEnI", "k4ruqDXMLqmQWww9EukWiXBxmglEjOwQ", "qeuUn3ZO1g9cCLbTYKy8rfCeNqsjP", "lwrAvEwGJvKZaAaN19YZU8UxJCWRUSKU", "KAMWqSOuX5oAD", "9nA6fjXGqk7Q6o3drz3rA7fb0omaCvC"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.CallableC04716a A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04726b A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
            if (A05[5].charAt(12) == 'F') {
                throw new java.lang.RuntimeException();
            }
            A05[5] = "k7DX94ZUmS6mjbqg2Uqpnt5MM6ksEeAZ";
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A05[5].charAt(12) == 'F') {
            throw new java.lang.RuntimeException();
        }
        A05[4] = "84A19LE3N5skcLW3UxwckiEcHwoNq";
        A04 = new byte[]{18, 11, 8, 11, 12, 20, 11, -9, -22, -27, -26, -16};
    }

    static {
        A01();
    }

    public C1201Zu(com.facebook.ads.redexgen.core.CallableC04716a callableC04716a, com.facebook.ads.redexgen.core.C04726b c04726b, long j, long j2) {
        this.A02 = callableC04716a;
        this.A03 = c04726b;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.RV
    public final void ABm(boolean z) {
        if (com.facebook.ads.redexgen.core.C04796i.A06(this.A02.A01.A04)) {
            com.facebook.ads.redexgen.core.C04786h c04786h = new com.facebook.ads.redexgen.core.C04786h(this.A03.A06, this.A03.A07, A00(7, 5, 81), this.A03.A02, this.A03.A08);
            com.facebook.ads.redexgen.core.C04796i.A04(this.A02.A01.A04, c04786h, z);
            if (!z) {
                com.facebook.ads.redexgen.core.C04796i.A05(this.A02.A01.A04, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 81), this.A03.A02, com.json.mediationsdk.utils.IronSourceConstants.IS_CALLBACK_AD_DISPLAYED, null, java.lang.Long.valueOf(this.A00), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.A01), null);
            }
            com.facebook.ads.redexgen.core.C04766f.A0A().put(c04786h.A04, c04786h);
        }
        try {
            this.A02.A00.put(true);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.core.RV
    public final void ABu(java.lang.Throwable th) {
        if (com.facebook.ads.redexgen.core.C04796i.A06(this.A02.A01.A04)) {
            com.facebook.ads.redexgen.core.C04796i.A05(this.A02.A01.A04, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 81), this.A03.A02, 2119, th != null ? th.toString() : A00(0, 7, 109), null, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.A01), null);
        }
        try {
            this.A02.A00.put(false);
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
