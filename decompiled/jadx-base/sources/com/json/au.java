package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0007\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/ironsource/au;", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "networkSettings", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "", "Ljava/lang/String;", "()Ljava/lang/String;", "mAdUnitId", "mAdNetworkName", "c", "Z", "mIsBiddingNetwork", "d", "Ljava/lang/Boolean;", "mUseTestAds", "adNetworkName", "isBiddingNetwork", "useTestAds", "adUnitId", "<init>", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class au {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String mAdUnitId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String mAdNetworkName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean mIsBiddingNetwork;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final java.lang.Boolean mUseTestAds;

    public au(java.lang.String str, boolean z, java.lang.Boolean bool, java.lang.String str2) {
        this.mAdUnitId = str2;
        this.mAdNetworkName = str;
        this.mIsBiddingNetwork = z;
        this.mUseTestAds = bool;
    }

    public /* synthetic */ au(java.lang.String str, boolean z, java.lang.Boolean bool, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? java.lang.Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getMAdUnitId() {
        return this.mAdUnitId;
    }

    public final boolean a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        java.lang.String str = this.mAdNetworkName;
        if (str == null || str.length() == 0) {
            return true;
        }
        com.json.hu huVar = com.json.hu.f2727a;
        return kotlin.jvm.internal.Intrinsics.areEqual(huVar.a(networkSettings), this.mAdNetworkName) && huVar.a(networkSettings, adUnit) == this.mIsBiddingNetwork;
    }

    public final boolean b() {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.mUseTestAds, java.lang.Boolean.TRUE);
    }
}
