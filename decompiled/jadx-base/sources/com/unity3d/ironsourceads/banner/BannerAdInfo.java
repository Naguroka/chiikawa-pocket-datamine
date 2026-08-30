package com.unity3d.ironsourceads.banner;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ironsourceads/banner/BannerAdInfo;", "", "", "toString", "component1", "component2", "instanceId", com.ironsource.sdk.controller.f.b.c, "copy", "", "hashCode", "other", "", "equals", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getInstanceId", "()Ljava/lang/String;", "b", "getAdId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BannerAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String instanceId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String adId;

    public BannerAdInfo(java.lang.String instanceId, java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        this.instanceId = instanceId;
        this.adId = adId;
    }

    public static /* synthetic */ com.unity3d.ironsourceads.banner.BannerAdInfo copy$default(com.unity3d.ironsourceads.banner.BannerAdInfo bannerAdInfo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bannerAdInfo.instanceId;
        }
        if ((i & 2) != 0) {
            str2 = bannerAdInfo.adId;
        }
        return bannerAdInfo.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getAdId() {
        return this.adId;
    }

    public final com.unity3d.ironsourceads.banner.BannerAdInfo copy(java.lang.String instanceId, java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        return new com.unity3d.ironsourceads.banner.BannerAdInfo(instanceId, adId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.ironsourceads.banner.BannerAdInfo)) {
            return false;
        }
        com.unity3d.ironsourceads.banner.BannerAdInfo bannerAdInfo = (com.unity3d.ironsourceads.banner.BannerAdInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instanceId, bannerAdInfo.instanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.adId, bannerAdInfo.adId);
    }

    public final java.lang.String getAdId() {
        return this.adId;
    }

    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    public int hashCode() {
        return (this.instanceId.hashCode() * 31) + this.adId.hashCode();
    }

    public java.lang.String toString() {
        return "[instanceId: '" + this.instanceId + "', adId: '" + this.adId + "']";
    }
}
