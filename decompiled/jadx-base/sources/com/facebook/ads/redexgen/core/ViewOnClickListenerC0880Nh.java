package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0880Nh implements android.view.View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0882Nj A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 124);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -22, -9, -3, -4, -62, -22, -12, -23, -10, -13, -32, -19, -34, -32, -30, -13, -24, -11, -24, -13, -8, 16, 29, 19, 33, 30, 24, 19, -35, 24, 29, 35, 20, 29, 35, -35, 16, 18, 35, 24, 30, 29, -35, 5, -8, -12, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (!android.text.TextUtils.isEmpty(this.A00.A07) && !A00(0, 11, 12).equals(this.A00.A07)) {
                android.content.Intent intent = new android.content.Intent(A00(22, 26, 51), com.facebook.ads.redexgen.core.L5.A00(this.A00.A07));
                intent.addFlags(268435456);
                this.A00.A0B.A0E().A95();
                try {
                    com.facebook.ads.redexgen.core.C0813Kq.A0C(this.A00.A0B, intent);
                    this.A00.A05.ACs();
                } catch (com.facebook.ads.redexgen.core.C0811Ko e) {
                    java.lang.Throwable cause = e.getCause();
                    com.facebook.ads.redexgen.core.C0811Ko cause2 = e;
                    if (cause != null) {
                        cause2 = e.getCause();
                    }
                    this.A00.A0B.A07().AA0(A00(11, 11, 3), com.facebook.ads.redexgen.core.C8E.A00, new com.facebook.ads.redexgen.core.C8F(cause2));
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }

    public ViewOnClickListenerC0880Nh(com.facebook.ads.redexgen.core.C0882Nj c0882Nj) {
        this.A00 = c0882Nj;
    }
}
