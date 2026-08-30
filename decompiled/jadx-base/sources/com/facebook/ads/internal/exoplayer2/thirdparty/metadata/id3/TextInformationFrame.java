package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TextInformationFrame extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"ASyNg1gGNlWG", "EFqAWZS8F4xLtUMHt9FEUL", "Vx6IBBIU6XaRdOAjHbXqr", "Phy73fqNY2GG", "BL", "Hr5eJHulkK4DitXKqFdG92R02ijGovUO", "UWMtrJKOpWh5LlzFeu6OG", "qBfMcdZL4b2QEWRUyBulqHXnGi8Olt5r"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame> CREATOR;
    public final java.lang.String A00;
    public final java.lang.String A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 68);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-64, -90, -4, -25, -14, -5, -21, -61};
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.C0654Dr();
    }

    public TextInformationFrame(android.os.Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public TextInformationFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
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
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame textInformationFrame = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame) obj;
        if (super.A00.equals(((com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame) textInformationFrame).A00) && com.facebook.ads.redexgen.core.IK.A0g(this.A00, textInformationFrame.A00) && com.facebook.ads.redexgen.core.IK.A0g(this.A01, textInformationFrame.A01)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        int i = ((17 * 31) + result) * 31;
        int result2 = 0;
        int result3 = this.A00 != null ? this.A00.hashCode() : 0;
        int i2 = (i + result3) * 31;
        if (this.A01 != null) {
            java.lang.String str = this.A01;
            java.lang.String[] strArr = A03;
            java.lang.String str2 = strArr[0];
            java.lang.String str3 = strArr[3];
            int length = str2.length();
            int result4 = str3.length();
            if (length != result4) {
                throw new java.lang.RuntimeException();
            }
            A03[7] = "m1qBjb1W4o0FDqjH8SQn0FxInYmbUXEs";
            result2 = str.hashCode();
        }
        return i2 + result2;
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final java.lang.String toString() {
        return super.A00 + A00(0, 8, 66) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
