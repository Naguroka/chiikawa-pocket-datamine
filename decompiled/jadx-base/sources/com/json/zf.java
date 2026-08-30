package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/ironsource/zf;", "", "", "placement", "adUnitId", "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface zf {

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J$\u0010\u000b\u001a\u00020\b2\n\u0010\n\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/zf$a;", "", "", "Lcom/ironsource/services/capping/Identifier;", "placement", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME, "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "adUnitId", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(java.lang.String placement, java.lang.String rewardName, int rewardAmount);

        void b(java.lang.String adUnitId, java.lang.String rewardName, int rewardAmount);
    }

    com.unity3d.mediation.rewarded.LevelPlayReward a(java.lang.String placement, java.lang.String adUnitId);
}
