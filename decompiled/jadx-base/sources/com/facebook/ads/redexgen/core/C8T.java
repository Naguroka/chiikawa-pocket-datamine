package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C8T extends com.facebook.ads.redexgen.core.AbstractC0990Rn {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C8S A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 25);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-63, -43, -60, -55, -49};
    }

    public C8T(com.facebook.ads.redexgen.core.C8S c8s) {
        this.A00 = c8s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.SZ sz) {
        if (this.A00.A00 == null || this.A00.A00.get() == null) {
            this.A00.A00 = new java.lang.ref.WeakReference(new com.facebook.ads.redexgen.core.R2(this));
        }
        ((android.media.AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 71))).requestAudioFocus((android.media.AudioManager.OnAudioFocusChangeListener) this.A00.A00.get(), 3, 1);
    }
}
