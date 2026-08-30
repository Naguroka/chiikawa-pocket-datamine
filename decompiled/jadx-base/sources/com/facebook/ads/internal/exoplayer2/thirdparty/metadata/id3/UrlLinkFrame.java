package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UrlLinkFrame extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"c8NCicdTZLmJ2inXNQ3toHzjPVonMpXv", "aSFF6gCbWZYo0gLtpjiRDBRud", "sZ2yfR3DpzNh9v", "y92XvuK2sC", "N8ai6xP5Od7TVPMs8Jay0FHFPRYirWFh", "HDzkZih2lrYPKcmzm9KSPoyEojuK7yog", "DDwCgFPJHFvA5diTm92X28ohtWZRLkNX", "hxFm1PcRgye5xp5wgZFxUZFURn"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame> CREATOR;
    public final java.lang.String A00;
    public final java.lang.String A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 120);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-56, -82, 3, 0, -6, -53};
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.C0655Ds();
    }

    public UrlLinkFrame(android.os.Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public UrlLinkFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame urlLinkFrame = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame) obj;
        if (super.A00.equals(((com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame) urlLinkFrame).A00)) {
            boolean zA0g = com.facebook.ads.redexgen.core.IK.A0g(this.A00, urlLinkFrame.A00);
            java.lang.String[] strArr = A03;
            if (strArr[2].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A03[4] = "96TNA6xbUpDgxS3VY7GPr8bnLD9hElYA";
            if (zA0g && com.facebook.ads.redexgen.core.IK.A0g(this.A01, urlLinkFrame.A01)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        int iHashCode = ((((17 * 31) + result) * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31;
        java.lang.String str = this.A01;
        if (A03[0].charAt(15) != '5') {
            java.lang.String[] strArr = A03;
            strArr[6] = "R0KoAZWGaaNUWbKBmgSqKMf6V9pQtd6g";
            strArr[5] = "3J85XNytcsZ3pYJamIMiFyJCjuH41ABd";
            int iHashCode2 = iHashCode + (str != null ? this.A01.hashCode() : 0);
            if (A03[7].length() != 9) {
                A03[7] = "Kz";
                return iHashCode2;
            }
        }
        throw new java.lang.RuntimeException();
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final java.lang.String toString() {
        return super.A00 + A00(0, 6, 22) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
