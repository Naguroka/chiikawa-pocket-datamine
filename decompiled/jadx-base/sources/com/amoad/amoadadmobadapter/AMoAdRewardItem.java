package com.amoad.amoadadmobadapter;

/* JADX INFO: renamed from: com.amoad.amoadadmobadapter.c, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/amoad/amoadadmobadapter/AMoAdRewardItem;", "Lcom/google/android/gms/ads/rewarded/RewardItem;", "()V", "getAmount", "", "getType", "", "AMoAdAdMobAdapter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AMoAdRewardItem implements com.google.android.gms.ads.rewarded.RewardItem {
    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final java.lang.String getType() {
        return "AMoAdReward";
    }
}
