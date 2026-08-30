package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PrivFrame extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame {
    public static byte[] A02;
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame> CREATOR;
    public final java.lang.String A00;
    public final byte[] A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 35);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{42, 48, 127, 103, 126, 117, 98, 45, 59, 57, 34, kotlin.io.encoding.Base64.padSymbol};
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.C0653Dq();
    }

    public PrivFrame(android.os.Parcel parcel) {
        super(A00(8, 4, 72));
        this.A00 = parcel.readString();
        this.A01 = parcel.createByteArray();
    }

    public PrivFrame(java.lang.String str, byte[] bArr) {
        super(A00(8, 4, 72));
        this.A00 = str;
        this.A01 = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame privFrame = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame) obj;
        return com.facebook.ads.redexgen.core.IK.A0g(this.A00, privFrame.A00) && java.util.Arrays.equals(this.A01, privFrame.A01);
    }

    public final int hashCode() {
        int i = 17 * 31;
        int result = this.A00 != null ? this.A00.hashCode() : 0;
        return ((i + result) * 31) + java.util.Arrays.hashCode(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final java.lang.String toString() {
        return super.A00 + A00(0, 8, 51) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A01);
    }
}
