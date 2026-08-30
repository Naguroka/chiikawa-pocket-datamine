package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class SpliceCommand implements com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry {
    public static byte[] A00;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 35);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-77, -93, -76, -91, -115, -109, -107, -128, -45, -48, -52, -55, -61, -59, -128, -61, -49, -51, -51, -63, -50, -60, -102, -128, -44, -39, -48, -59, -99};
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return A02(0, 29, 61) + getClass().getSimpleName();
    }
}
