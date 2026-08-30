package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ChapterTocFrame extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"q", "nX4cEFX5rZNLgK66Zbr2M0LDj0xf4fJp", "fegio6ElLuca0kBWCpMXWgqLCFyhIORL", "RYIhd0rxGxSYfBpuDsCOXE9retMVZXKX", "5xJmLiJ3E3nNk4Qe2ivdSjFOtE", "q3jgB5DsBzWTh9ofyuUcyllX5SyVXG4i", "gt3ESKlhtS4Kk", "m"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame> CREATOR;
    public final java.lang.String A00;
    public final boolean A01;
    public final boolean A02;
    public final java.lang.String[] A03;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame[] A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            if (A06[1].charAt(12) != 'g') {
                throw new java.lang.RuntimeException();
            }
            A06[2] = "eTFhtvXuO96go1LxaU568guL4Hk8KVyX";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 77);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{78, 89, 66, 78};
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.C0647Dk();
    }

    public ChapterTocFrame(android.os.Parcel parcel) {
        super(A00(0, 4, 64));
        this.A00 = parcel.readString();
        this.A02 = parcel.readByte() != 0;
        this.A01 = parcel.readByte() != 0;
        this.A03 = parcel.createStringArray();
        int i = parcel.readInt();
        this.A04 = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A04[i2] = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame) parcel.readParcelable(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(java.lang.String str, boolean z, boolean z2, java.lang.String[] strArr, com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 64));
        this.A00 = str;
        this.A02 = z;
        this.A01 = z2;
        this.A03 = strArr;
        this.A04 = id3FrameArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame chapterTocFrame = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame) obj;
        if (this.A02 == chapterTocFrame.A02 && this.A01 == chapterTocFrame.A01 && com.facebook.ads.redexgen.core.IK.A0g(this.A00, chapterTocFrame.A00) && java.util.Arrays.equals(this.A03, chapterTocFrame.A03) && java.util.Arrays.equals(this.A04, chapterTocFrame.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((17 * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A00 != null ? this.A00.hashCode() : 0);
        if (A06[1].charAt(12) != 'g') {
            throw new java.lang.RuntimeException();
        }
        A06[2] = "b81cAW5lkkuLKoB2DrgmzF0LBXDk4R48";
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.A03);
        parcel.writeInt(this.A04.length);
        for (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame id3Frame : this.A04) {
            parcel.writeParcelable(id3Frame, 0);
            java.lang.String[] strArr = A06;
            if (strArr[7].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            A06[4] = "yIH6RTQSPR7uBoQIRLxBqA3R3f";
        }
    }
}
