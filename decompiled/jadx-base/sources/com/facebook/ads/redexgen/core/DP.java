package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class DP extends com.facebook.ads.redexgen.core.AbstractC1175Yu<com.facebook.ads.redexgen.core.DO, com.facebook.ads.redexgen.core.DM, com.facebook.ads.redexgen.core.C0695Fu> implements com.facebook.ads.redexgen.core.XQ {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"Y6iEYcT7zry5i7Oc3Z", "04pEmQzwcYeUfpdk9PqlLIcwm62m4", "Bed18TpTKJb5sLpTCdiGUSxVMjXfmE9e", "4Xs", "", "zUuia8YnRm0GUNbZhXhhg7iUMyzv7XkB", "vFzU3JWXjm0ZZYoWpiZ", "DhOBPQIIWrNpSVq3fDHAHYKNMWYv2IOx"};
    public final java.lang.String A00;

    public static java.lang.String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 73);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{60, 7, 12, 17, 25, 12, 10, 29, 12, 13, 73, 13, 12, 10, 6, 13, 12, 73, 12, 27, 27, 6, 27};
        java.lang.String[] strArr = A02;
        if (strArr[3].length() == strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[3] = "1AT";
        strArr2[1] = "mPu6QXTRp9h4XliHh3A308dhTdRxx";
    }

    public abstract com.facebook.ads.redexgen.core.InterfaceC0694Ft A0b(byte[] bArr, int i, boolean z) throws com.facebook.ads.redexgen.core.C0695Fu;

    static {
        A0J();
    }

    public DP(java.lang.String str) {
        super(new com.facebook.ads.redexgen.core.DO[2], new com.facebook.ads.redexgen.core.DM[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6T] */
    @Override // com.facebook.ads.redexgen.core.AbstractC1175Yu
    /* JADX INFO: renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C6T A0V() {
        return new com.facebook.ads.redexgen.core.DM(this) { // from class: com.facebook.ads.redexgen.X.6T
            public final com.facebook.ads.redexgen.core.DP A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.core.DM
            public final void A08() {
                this.A00.A0c(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1175Yu
    /* JADX INFO: renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C0695Fu A0W(com.facebook.ads.redexgen.core.DO r8, com.facebook.ads.redexgen.core.DM dm, boolean z) {
        try {
            java.nio.ByteBuffer inputData = r8.A01;
            dm.A09(((com.facebook.ads.redexgen.core.C1177Yw) r8).A00, A0b(inputData.array(), inputData.limit(), z), r8.A00);
            dm.A01(Integer.MIN_VALUE);
            return null;
        } catch (com.facebook.ads.redexgen.core.C0695Fu e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1175Yu
    /* JADX INFO: renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C0695Fu A0X(java.lang.Throwable th) {
        return new com.facebook.ads.redexgen.core.C0695Fu(A0I(0, 23, 32), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1175Yu
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.DO A0T() {
        return new com.facebook.ads.redexgen.core.DO();
    }

    public final void A0c(com.facebook.ads.redexgen.core.DM dm) {
        super.A0a(dm);
    }

    @Override // com.facebook.ads.redexgen.core.XQ
    public final void AGb(long j) {
    }
}
