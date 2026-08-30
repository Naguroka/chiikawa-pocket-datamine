package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CommentFrame extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"DUn7", "DRjBJdg6i5DjaqZT9xtKW9OtehwlvUrA", "sLyx3xsvCq1vrvDIOYc9pqL1bJ6C1jBj", "54TYRanHXsZ6kGDBcRIxVBGHBRHjWieI", "PsznUfBovfWVPTPTeXeHOSrkMPYOlziD", "O1tIaafDMGp1i0", "7qjDKaDRQc0Nql42std83YrFyKnWrUw", "hlvVSUP428eV4RdTvjr"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame> CREATOR;
    public final java.lang.String A00;
    public final java.lang.String A01;
    public final java.lang.String A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{73, 69, 1, 0, 22, 6, 23, 12, 21, 17, 12, 10, 11, 88, 86, 76, 0, 13, 2, 11, 25, 13, 11, 9, 81, 8, 4, 6, 6};
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.C0648Dl();
    }

    public CommentFrame(android.os.Parcel parcel) {
        super(A00(25, 4, 125));
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public CommentFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(A00(25, 4, 125));
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame commentFrame = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame) obj;
        if (com.facebook.ads.redexgen.core.IK.A0g(this.A00, commentFrame.A00) && com.facebook.ads.redexgen.core.IK.A0g(this.A01, commentFrame.A01) && com.facebook.ads.redexgen.core.IK.A0g(this.A02, commentFrame.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 17 * 31;
        int result = this.A01 != null ? this.A01.hashCode() : 0;
        int iHashCode = ((i + result) * 31) + (this.A00 != null ? this.A00.hashCode() : 0);
        java.lang.String[] strArr = A04;
        java.lang.String str = strArr[6];
        java.lang.String str2 = strArr[7];
        int result2 = str.length();
        if (result2 == str2.length()) {
            throw new java.lang.RuntimeException();
        }
        A04[0] = "BRvGxta5fbsybelplClSK";
        int result3 = (iHashCode * 31) + (this.A02 != null ? this.A02.hashCode() : 0);
        return result3;
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final java.lang.String toString() {
        return super.A00 + A00(14, 11, 90) + this.A01 + A00(0, 14, 83) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
