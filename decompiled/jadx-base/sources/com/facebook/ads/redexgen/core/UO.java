package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class UO extends com.facebook.ads.redexgen.core.AbstractC0907Oi {
    public static byte[] A00;

    static {
        A0D();
    }

    public static java.lang.String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0D() {
        A00 = new byte[]{106, 111, 111, 110, 127, 106, 98, 103, 120};
    }

    public abstract void A14();

    public abstract void A15();

    public abstract void A16();

    public abstract boolean A17();

    public abstract boolean A18();

    public UO(com.facebook.ads.redexgen.core.C0911Om c0911Om, boolean z) {
        super(c0911Om, z);
        if (com.facebook.ads.redexgen.core.C0762Im.A12(c0911Om.A05())) {
            if (c0911Om.A09() != null) {
                c0911Om.A09().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A13() {
        if (com.facebook.ads.redexgen.core.C0762Im.A12(this.A06.A05()) && this.A06.A09() != null) {
            this.A06.A09().setCTAClickListener(getCtaButton());
        }
    }

    public void setAdDetailsClickListener(com.facebook.ads.redexgen.core.OE oe) {
        if (com.facebook.ads.redexgen.core.C0762Im.A12(this.A06.A05()) && oe != null) {
            oe.setOnClickListener(com.facebook.ads.redexgen.core.AbstractC0904Of.A03(getCtaButton(), A0C(0, 9, 29)));
        }
    }

    public void setupNativeCtaExtension(com.facebook.ads.redexgen.core.QK qk) {
    }
}
