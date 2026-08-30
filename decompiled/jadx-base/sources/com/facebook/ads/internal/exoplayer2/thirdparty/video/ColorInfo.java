package com.facebook.ads.internal.exoplayer2.thirdparty.video;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ColorInfo implements android.os.Parcelable {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"kMwNdleMqzWVqcPvmmjgXOFb90HoR2aS", "JmhbiM", "HIloWDXljlsFtacoHr", "9trVsJZvswrK1Gdw5mQHa3", "KN84cRC", "hFGS8z", "RvezLLiD01uKKJ1jtQX7xEHNj6PkbMyI", "5wEn9ORXAeEptnWlekp2nQL4nWa"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo> CREATOR;
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 7);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{89, 74, 62, -57, -13, -16, -13, -10, -51, -14, -22, -13, -84};
        if (A06[6].charAt(8) == 'i') {
            throw new java.lang.RuntimeException();
        }
        A06[0] = "ZHrEhLiw2K0hjAL5R5GZQHqjxH9E80nU";
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.IN();
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = bArr;
    }

    public ColorInfo(android.os.Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        boolean hasHdrStaticInfo = com.facebook.ads.redexgen.core.IK.A0f(parcel);
        this.A04 = hasHdrStaticInfo ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo colorInfo = (com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo) obj;
        if (this.A02 == colorInfo.A02) {
            int i = this.A01;
            int i2 = colorInfo.A01;
            if (A06[1].length() != 6) {
                throw new java.lang.RuntimeException();
            }
            A06[1] = "x9YRcJ";
            if (i == i2 && this.A03 == colorInfo.A03 && java.util.Arrays.equals(this.A04, colorInfo.A04)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A02;
            int result2 = ((((17 * 31) + result) * 31) + this.A01) * 31;
            int result3 = this.A03;
            this.A00 = ((result2 + result3) * 31) + java.util.Arrays.hashCode(this.A04);
        }
        int result4 = this.A00;
        return result4;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A00(3, 10, 125)).append(this.A02);
        java.lang.String strA00 = A00(1, 2, 23);
        return sbAppend.append(strA00).append(this.A01).append(strA00).append(this.A03).append(strA00).append(this.A04 != null).append(A00(0, 1, 41)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        com.facebook.ads.redexgen.core.IK.A0V(parcel, this.A04 != null);
        if (this.A04 != null) {
            parcel.writeByteArray(this.A04);
        }
    }
}
