package com.unity3d.ironsourceads.rewarded;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ironsourceads/rewarded/RewardedAdInfo;", "", "", "toString", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getInstanceId", "()Ljava/lang/String;", "instanceId", "b", "getAdId", com.ironsource.sdk.controller.f.b.c, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class RewardedAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String instanceId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String adId;

    public RewardedAdInfo(java.lang.String instanceId, java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        this.instanceId = instanceId;
        this.adId = adId;
    }

    public final java.lang.String getAdId() {
        return this.adId;
    }

    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    public java.lang.String toString() {
        return "[instanceId: '" + this.instanceId + "', adId: '" + this.adId + "']";
    }
}
