package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1135Xd extends com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction {
    public static byte[] A01;
    public static final com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer A02;
    public final java.lang.String A00;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 52);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{4, 6, 3, -5, 6, -7, 7, 7, -3, 10, -7};
    }

    static {
        A06();
        A02 = new com.facebook.ads.redexgen.core.C1136Xe(A05(0, 11, 96), 0);
    }

    public C1135Xd(android.net.Uri uri, boolean z, byte[] bArr, java.lang.String str) {
        super(A05(0, 11, 96), 0, uri, z, bArr);
        this.A00 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C1134Xc A07(com.facebook.ads.redexgen.core.EQ eq) {
        return new com.facebook.ads.redexgen.core.C1134Xc(this.A01, this.A00, eq);
    }

    private java.lang.String A04() {
        return this.A00 != null ? this.A00 : com.facebook.ads.redexgen.core.HV.A01(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final void A08(java.io.DataOutputStream dataOutputStream) throws java.io.IOException {
        dataOutputStream.writeUTF(this.A01.toString());
        dataOutputStream.writeBoolean(this.A03);
        dataOutputStream.writeInt(this.A04.length);
        dataOutputStream.write(this.A04);
        boolean customCacheKeySet = this.A00 != null;
        dataOutputStream.writeBoolean(customCacheKeySet);
        if (customCacheKeySet) {
            dataOutputStream.writeUTF(this.A00);
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final boolean A09(com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction downloadAction) {
        return (downloadAction instanceof com.facebook.ads.redexgen.core.C1135Xd) && A04().equals(((com.facebook.ads.redexgen.core.C1135Xd) downloadAction).A04());
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return com.facebook.ads.redexgen.core.IK.A0g(this.A00, ((com.facebook.ads.redexgen.core.C1135Xd) obj).A00);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final int hashCode() {
        int result = super.hashCode();
        int i = result * 31;
        int result2 = this.A00 != null ? this.A00.hashCode() : 0;
        return i + result2;
    }
}
