package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FQ implements android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray createFromParcel(android.os.Parcel parcel) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray[] newArray(int i) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray[i];
    }
}
