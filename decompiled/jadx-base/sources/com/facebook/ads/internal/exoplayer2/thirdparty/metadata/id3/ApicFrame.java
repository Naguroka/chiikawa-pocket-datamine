package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ApicFrame extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"5zdrCQzyw7LGBZt2bR", "94h2cHlKu82ON", "UXCdbWakT4UeSWJHYp", "NJCEY3SlLFTG8A3lFBxha6EQ", "5QLBb0RtzLfAnzhUIvcqgNwpwZswqR66", "VBKPr5MCHLkK2A2pExgA1taPOMPGOmlK", "xRDeMM69RKfxJaGWHgM2IgB3dj0CBATA", "r5Ph5bZgG7AgDyEHuQeiaTUpJXkd"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame> CREATOR;
    public final int A00;
    public final java.lang.String A01;
    public final java.lang.String A02;
    public final byte[] A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A05;
            if (strArr[1].length() == strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            A05[5] = "2QrrQ2NqaqUssUV0sturxMM6I2C1oI6u";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 48);
            i4++;
        }
    }

    public static void A01() {
        A04 = new byte[]{68, 72, 12, 13, 27, 11, 26, 1, 24, 28, 1, 7, 6, 85, 106, 112, kotlin.io.encoding.Base64.padSymbol, 57, kotlin.io.encoding.Base64.padSymbol, 53, 4, 41, 32, 53, 109, 13, 28, 5, 15};
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.C0644Dh();
    }

    public ApicFrame(android.os.Parcel parcel) {
        super(A00(25, 4, 124));
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }

    public ApicFrame(java.lang.String str, java.lang.String str2, int i, byte[] bArr) {
        super(A00(25, 4, 124));
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame apicFrame = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame) obj;
        if (this.A00 == apicFrame.A00 && com.facebook.ads.redexgen.core.IK.A0g(this.A02, apicFrame.A02) && com.facebook.ads.redexgen.core.IK.A0g(this.A01, apicFrame.A01) && java.util.Arrays.equals(this.A03, apicFrame.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int result2 = ((17 * 31) + result) * 31;
        int result3 = this.A02 != null ? this.A02.hashCode() : 0;
        return ((((result2 + result3) * 31) + (this.A01 != null ? this.A01.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.A03);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final java.lang.String toString() {
        return super.A00 + A00(14, 11, 96) + this.A02 + A00(0, 14, 88) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
