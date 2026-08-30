package com.google.ads.mediation.applovin;

/* JADX INFO: loaded from: classes4.dex */
public final class AppLovinRewardItem implements com.google.android.gms.ads.rewarded.RewardItem {
    public static final java.lang.String KEY_AMOUNT = "amount";
    public static final java.lang.String KEY_CURRENCY = "currency";
    private final int amount;
    private final java.lang.String type;

    public AppLovinRewardItem(int i, java.lang.String str) {
        this.amount = i;
        this.type = str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public java.lang.String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return this.amount;
    }
}
