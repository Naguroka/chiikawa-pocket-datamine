package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0588Ba implements android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData createFromParcel(android.os.Parcel parcel) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData[] newArray(int i) {
        return new com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData[i];
    }
}
