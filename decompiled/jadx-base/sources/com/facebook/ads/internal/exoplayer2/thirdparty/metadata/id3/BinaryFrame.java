package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BinaryFrame extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame {
    public static java.lang.String[] A01 = {"v6RK6OSzPJ8ssi8MAkPxeSHb", "5iaWNhSEWXdQGqHhJWYkL3vAUnXTRhmq", "Lc2NFYXsFUM95", "ywPZ8", "moGnTq2WWr5ZsvpzbyzmCADJMv", "L7s4SUBCChL0YzkanmLdnighm5pk1EfG", "ewYMn9GjFuSxFQofwWKCBh7wdb0h2l2L", "1KoOvrfbG7PQp"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame> CREATOR = new com.facebook.ads.redexgen.core.C0645Di();
    public final byte[] A00;

    public BinaryFrame(android.os.Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.createByteArray();
    }

    public BinaryFrame(java.lang.String str, byte[] bArr) {
        super(str);
        this.A00 = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame binaryFrame = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame) obj;
        if (super.A00.equals(((com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame) binaryFrame).A00)) {
            boolean zEquals = java.util.Arrays.equals(this.A00, binaryFrame.A00);
            if (A01[0].length() != 24) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[3] = "axoUf";
            strArr[4] = "0lWAINa21gVDBVCzmQ6kppciAl";
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        return (((17 * 31) + result) * 31) + java.util.Arrays.hashCode(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeByteArray(this.A00);
    }
}
