package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J$\u0010\b\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0003j\u0002`\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016J$\u0010\u0006\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0003j\u0002`\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/ironsource/dq;", "Lcom/ironsource/zf;", "Lcom/ironsource/zf$a;", "", "placement", "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", "b", "adUnitId", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/services/capping/Identifier;", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME, "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, "", "", "Ljava/util/Map;", "placementConfig", "adUnitIdConfig", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class dq implements com.json.zf, com.ironsource.zf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.Map<java.lang.String, com.unity3d.mediation.rewarded.LevelPlayReward> placementConfig = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.unity3d.mediation.rewarded.LevelPlayReward> adUnitIdConfig = new java.util.LinkedHashMap();

    private final com.unity3d.mediation.rewarded.LevelPlayReward a(java.lang.String adUnitId) {
        return this.adUnitIdConfig.get(adUnitId);
    }

    private final com.unity3d.mediation.rewarded.LevelPlayReward b(java.lang.String placement) {
        if (placement == null || placement.length() == 0) {
            return null;
        }
        return this.placementConfig.get(placement);
    }

    @Override // com.json.zf
    public com.unity3d.mediation.rewarded.LevelPlayReward a(java.lang.String placement, java.lang.String adUnitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        com.unity3d.mediation.rewarded.LevelPlayReward levelPlayRewardB = b(placement);
        return levelPlayRewardB == null ? a(adUnitId) : levelPlayRewardB;
    }

    @Override // com.ironsource.zf.a
    public void a(java.lang.String placement, java.lang.String rewardName, int rewardAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.placementConfig.put(placement, new com.unity3d.mediation.rewarded.LevelPlayReward(rewardName, rewardAmount));
    }

    @Override // com.ironsource.zf.a
    public void b(java.lang.String adUnitId, java.lang.String rewardName, int rewardAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.adUnitIdConfig.put(adUnitId, new com.unity3d.mediation.rewarded.LevelPlayReward(rewardName, rewardAmount));
    }
}
