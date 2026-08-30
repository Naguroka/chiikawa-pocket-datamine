package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1372ci extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C03390w A00;
    public final /* synthetic */ org.json.JSONObject A01;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 97, 118, 98, 102, 118, 125, 112, 106, 76, 112, 114, 99, 99, 122, 125, 116};
    }

    public C1372ci(com.facebook.ads.redexgen.core.C03390w c03390w, org.json.JSONObject jSONObject) {
        this.A00 = c03390w;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        try {
            this.A00.A05.await();
            synchronized (this.A00.A02) {
                try {
                    this.A00.A02.A0B(this.A01);
                    this.A00.A06.countDown();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (java.lang.InterruptedException e) {
            this.A00.A03.A07().AA0(A00(0, 17, 25), com.facebook.ads.redexgen.core.C8E.A1B, new com.facebook.ads.redexgen.core.C8F(e));
        } catch (org.json.JSONException e2) {
            this.A00.A0M();
            this.A00.A03.A07().AA0(A00(0, 17, 25), com.facebook.ads.redexgen.core.C8E.A1A, new com.facebook.ads.redexgen.core.C8F(e2));
        }
    }
}
