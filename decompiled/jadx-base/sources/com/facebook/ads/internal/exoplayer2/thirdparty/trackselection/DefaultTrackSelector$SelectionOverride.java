package com.facebook.ads.internal.exoplayer2.thirdparty.trackselection;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DefaultTrackSelector$SelectionOverride implements android.os.Parcelable {
    public static java.lang.String[] A03 = {"JDxg7tKUhtdUIhfIwWVDLdP283uC1zvF", "2iFGc0pCeEUmxWBYpAycAp3qF9I3P3Ut", "CY6jT2dpX", "Exq6DKTWLIzC5PVLQAd8YA2GF4DsQGTp", "Q4", "7IwF3iXkl0b", "WRMecujAG", "ZI"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride> CREATOR = new com.facebook.ads.redexgen.core.C0706Gg();
    public final int A00;
    public final int A01;
    public final int[] A02;

    public DefaultTrackSelector$SelectionOverride(android.os.Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readByte();
        this.A02 = new int[this.A01];
        parcel.readIntArray(this.A02);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        java.lang.String[] strArr = A03;
        if (strArr[6].length() != strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        A03[1] = "XHK065n3VHEeOH2YPoqOuBkTW3Rzvopo";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverride = (com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride) obj;
        return this.A00 == defaultTrackSelector$SelectionOverride.A00 && java.util.Arrays.equals(this.A02, defaultTrackSelector$SelectionOverride.A02);
    }

    public final int hashCode() {
        return (this.A00 * 31) + java.util.Arrays.hashCode(this.A02);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeIntArray(this.A02);
    }
}
