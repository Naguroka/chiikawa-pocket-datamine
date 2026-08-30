package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VB implements com.facebook.ads.redexgen.core.QT {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.VA A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 58);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    public VB(com.facebook.ads.redexgen.core.VA va) {
        this.A00 = va;
    }

    public /* synthetic */ VB(com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.VH vh) {
        this(va);
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void ABe() {
        this.A00.A0U(true, A00(0, 9, 106));
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void ACA() {
        if (!this.A00.A0Z) {
            if (!android.text.TextUtils.isEmpty(this.A00.A0I.A1U())) {
                this.A00.A0M.AA6(this.A00.A0I.A1U(), new com.facebook.ads.redexgen.core.O8().A03(this.A00.A07.getViewabilityChecker()).A02(this.A00.A07.getTouchDataRecorder()).A05());
                com.facebook.ads.redexgen.core.C0805Kh.A00(this.A00.A0L).A0E(this.A00.A0R.A83(), this.A00.A0I.A1U());
                com.facebook.ads.redexgen.core.C1T.A07(this.A00.A0I.A1Q(), this.A00.A0L);
                com.facebook.ads.redexgen.core.C2M.A02(this.A00.A0I.A0a(), com.facebook.ads.redexgen.core.AbstractC0825Le.A00(this.A00.A0I.A0c()));
                this.A00.A0L.A0E().A36();
            }
            this.A00.A0Q.A4P(this.A00.A0R.A7Z());
        }
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void ACV() {
        this.A00.A0Q.A4P(this.A00.A0R.A7M());
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void AEC() {
        this.A00.A0Q.ABR(15);
    }
}
