package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GeobFrame extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"y6OzAPeSPf3ee7TzPORpB7Bf5APB3S1", "bT", "nmoLNEgpJzlygAWMz61JvwnNXURrvdZm", "gZwWTlO5ujx", "dfSXnSphWSbSkA9E1qvUuQDXnNV6bDm2", "4eRrIz7", "1K0raUp", "bvAgnfJmo0WzPc7U"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame> CREATOR;
    public final java.lang.String A00;
    public final java.lang.String A01;
    public final java.lang.String A02;
    public final byte[] A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 115);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{36, 40, 108, 109, 123, 107, 122, 97, 120, 124, 97, 103, 102, 53, 16, 28, 90, 85, 80, 89, 82, 93, 81, 89, 1, 75, 81, 28, 24, 28, 20, 37, 8, 1, 20, 76, 54, 52, 62, 51};
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.C0649Dm();
    }

    public GeobFrame(android.os.Parcel parcel) {
        super(A00(36, 4, 2));
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.createByteArray();
    }

    public GeobFrame(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        super(A00(36, 4, 2));
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame geobFrame = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame) obj;
        if (com.facebook.ads.redexgen.core.IK.A0g(this.A02, geobFrame.A02)) {
            java.lang.String str = this.A01;
            java.lang.String str2 = geobFrame.A01;
            if (A05[2].charAt(31) == 'B') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[6] = "a9pLgNB";
            strArr[5] = "CzZ6eht";
            if (com.facebook.ads.redexgen.core.IK.A0g(str, str2) && com.facebook.ads.redexgen.core.IK.A0g(this.A00, geobFrame.A00) && java.util.Arrays.equals(this.A03, geobFrame.A03)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result;
        int i = 17 * 31;
        int iHashCode = 0;
        if (this.A02 != null) {
            java.lang.String str = this.A02;
            java.lang.String[] strArr = A05;
            java.lang.String str2 = strArr[6];
            java.lang.String str3 = strArr[5];
            int length = str2.length();
            int result2 = str3.length();
            if (length != result2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[0] = "I7fOo4JalOo0WGey3tlmi8nSFYyfGBZ";
            strArr2[3] = "6S0ZiFCNHMZ";
            result = str.hashCode();
        } else {
            result = 0;
        }
        int result3 = (i + result) * 31;
        int result4 = this.A01 != null ? this.A01.hashCode() : 0;
        int i2 = (result3 + result4) * 31;
        if (this.A00 != null) {
            java.lang.String str4 = this.A00;
            java.lang.String[] strArr3 = A05;
            java.lang.String str5 = strArr3[6];
            java.lang.String str6 = strArr3[5];
            int length2 = str5.length();
            int result5 = str6.length();
            if (length2 != result5) {
                throw new java.lang.RuntimeException();
            }
            A05[2] = "XOLeb9Yz2wj8Kp6a21le7nVhqJT2mzr6";
            iHashCode = str4.hashCode();
        }
        int result6 = (i2 + iHashCode) * 31;
        return result6 + java.util.Arrays.hashCode(this.A03);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final java.lang.String toString() {
        return super.A00 + A00(25, 11, 2) + this.A02 + A00(14, 11, 79) + this.A01 + A00(0, 14, 123) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
