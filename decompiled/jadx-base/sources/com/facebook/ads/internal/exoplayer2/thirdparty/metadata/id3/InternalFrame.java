package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class InternalFrame extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"bYWrKv2GqG46pc3oh7WJWN46QVo1oXjE", "iMtWz5PmlDMWlWLOW0nxkOwK6tGFgXEC", "FAfgOs6oiEmG6wZbyRFeweQVagOJo3Y4", "OmyOn3Pn44e00I5SfZ7OYsne5yED7850", "OIOjzXQARMJ5yq3xnxWQ3lUWWFQfwIYZ", "DhDG4ysBCK9h1euDhOnTPnGquZLH8fbl", "Jc8KeWjQ33ib42rkyOBdn23kLiSJEQrD", "qgBIpvIKDT954te75MG3NzqCWR"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame> CREATOR;
    public final java.lang.String A00;
    public final java.lang.String A01;
    public final java.lang.String A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 108);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-2, -14, 54, 55, 69, 53, 68, 59, 66, 70, 59, 65, 64, 15, -9, -9, -9, -9, -75, -101, -33, -22, -24, -36, -28, -23, -72};
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.C0652Dp();
    }

    public InternalFrame(android.os.Parcel parcel) {
        super(A00(14, 4, 94));
        this.A01 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(parcel.readString());
        this.A00 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(parcel.readString());
        this.A02 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(parcel.readString());
    }

    public InternalFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(A00(14, 4, 94));
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
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame internalFrame = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame) obj;
        if (com.facebook.ads.redexgen.core.IK.A0g(this.A00, internalFrame.A00) && com.facebook.ads.redexgen.core.IK.A0g(this.A01, internalFrame.A01) && com.facebook.ads.redexgen.core.IK.A0g(this.A02, internalFrame.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 17 * 31;
        int result = this.A01 != null ? this.A01.hashCode() : 0;
        int result2 = (i + result) * 31;
        int result3 = this.A00 != null ? this.A00.hashCode() : 0;
        int i2 = (result2 + result3) * 31;
        if (A04[4].charAt(7) != 'A') {
            throw new java.lang.RuntimeException();
        }
        A04[7] = "L";
        return i2 + (this.A02 != null ? this.A02.hashCode() : 0);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final java.lang.String toString() {
        return super.A00 + A00(18, 9, 15) + this.A01 + A00(0, 14, 102) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
