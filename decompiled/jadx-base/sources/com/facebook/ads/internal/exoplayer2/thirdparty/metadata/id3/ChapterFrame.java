package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ChapterFrame extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"xKlEfosPJh9yMYQbCpjDM6s3zVcpxbP5", "1lFQ4Yh1vie1DVx8Y9IEXTb70qub4TNk", "6NcFsoITlli6jci9nvzmOwHlbJumCDg8", "Ul6ETdKi4sSCw8OfXK8DwBAUtHNMz", "Qw", "1etWMItfpuVaeAJJ6tkaD2MNxiPHvPlN", "9RcPYWx5DIRFaHhOPvn0aLDVj5gcLBHE", "0abnNKrUxL1ELdZKmdvyuLuXX7NQ1wMW"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final java.lang.String A04;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame[] A05;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{0, 11, 2, 19};
        if (A07[2].charAt(31) == 'e') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A07;
        strArr[7] = "Iz4TXcr6fUIHp2VorFlDJLDUzyiLCaPl";
        strArr[6] = "Hjeg8cIGsBVxKCP6C4PLXLTELLPGRiUg";
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.C0646Dj();
    }

    public ChapterFrame(android.os.Parcel parcel) {
        super(A00(0, 4, 18));
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        int i = parcel.readInt();
        this.A05 = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A05[i2] = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame) parcel.readParcelable(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(java.lang.String str, int i, int i2, long j, long j2, com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 18));
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
        this.A05 = id3FrameArr;
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame, android.os.Parcelable
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
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame chapterFrame = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame) obj;
        if (this.A01 == chapterFrame.A01 && this.A00 == chapterFrame.A00 && this.A03 == chapterFrame.A03 && this.A02 == chapterFrame.A02 && com.facebook.ads.redexgen.core.IK.A0g(this.A04, chapterFrame.A04) && java.util.Arrays.equals(this.A05, chapterFrame.A05)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result2 = (int) this.A03;
        int result3 = (((i + result2) * 31) + ((int) this.A02)) * 31;
        int result4 = this.A04 != null ? this.A04.hashCode() : 0;
        return result3 + result4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A05.length);
        for (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame id3Frame : this.A05) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
