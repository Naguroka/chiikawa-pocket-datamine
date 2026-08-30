package com.facebook.ads.internal.exoplayer2.thirdparty.source;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TrackGroupArray implements android.os.Parcelable {
    public static java.lang.String[] A03 = {"", "Nsz3HOVG8K47", "9B0MFxoFwbiIxNv", "l4kItkL2rgGo3pW1X7LioUN1Ht", "8fyYvbIPnXp9ayPzd2rq2NXGd", "tQKmiB4adr0mBFsiSe1mIorsQq1f29kZ", "yFO4r3Iibj8MWWU2s3y3PrCR5g5ClbcE", "iBPKumYfmLb65bhUzcw7T4vxhwf25kYO"};
    public static final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray A04 = new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray(new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[0]);
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray> CREATOR = new com.facebook.ads.redexgen.core.FQ();
    public int A00;
    public final int A01;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[] A02;

    public TrackGroupArray(android.os.Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A02 = new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[this.A01];
        for (int i = 0; i < i; i++) {
            this.A02[i] = (com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup) parcel.readParcelable(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup.class.getClassLoader());
        }
    }

    public TrackGroupArray(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup... trackGroupArr) {
        this.A02 = trackGroupArr;
        this.A01 = trackGroupArr.length;
    }

    public final int A00(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup) {
        int i = 0;
        while (true) {
            int i2 = this.A01;
            java.lang.String[] strArr = A03;
            java.lang.String str = strArr[3];
            java.lang.String str2 = strArr[4];
            int length = str.length();
            int i3 = str2.length();
            if (length == i3) {
                throw new java.lang.RuntimeException();
            }
            A03[7] = "4PF46ait35IDhLYsteRaFKZRZtm75ANA";
            if (i < i2) {
                if (this.A02[i] == trackGroup) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup A01(int i) {
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
        com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray = (com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray) obj;
        if (this.A01 == trackGroupArray.A01) {
            boolean zEquals = java.util.Arrays.equals(this.A02, trackGroupArray.A02);
            if (A03[7].charAt(28) != '5') {
                throw new java.lang.RuntimeException();
            }
            A03[1] = "3D";
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = java.util.Arrays.hashCode(this.A02);
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
