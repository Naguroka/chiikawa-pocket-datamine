package com.facebook.ads.internal.exoplayer2.thirdparty.source;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TrackGroup implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup> CREATOR = new com.facebook.ads.redexgen.core.FO();
    public int A00;
    public final int A01;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format[] A02;

    public TrackGroup(android.os.Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A02 = new com.facebook.ads.internal.exoplayer2.thirdparty.Format[this.A01];
        for (int i = 0; i < i; i++) {
            this.A02[i] = (com.facebook.ads.internal.exoplayer2.thirdparty.Format) parcel.readParcelable(com.facebook.ads.internal.exoplayer2.thirdparty.Format.class.getClassLoader());
        }
    }

    public TrackGroup(com.facebook.ads.internal.exoplayer2.thirdparty.Format... formatArr) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(formatArr.length > 0);
        this.A02 = formatArr;
        this.A01 = formatArr.length;
    }

    public final int A00(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        for (int i = 0; i < i; i++) {
            if (format == this.A02[i]) {
                return i;
            }
        }
        return -1;
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format A01(int i) {
        return this.A02[i];
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
        com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup = (com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup) obj;
        return this.A01 == trackGroup.A01 && java.util.Arrays.equals(this.A02, trackGroup.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = java.util.Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        for (int i2 = 0; i2 < i; i2++) {
            parcel.writeParcelable(this.A02[i2], 0);
        }
    }
}
