package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class MaxRewardImpl implements com.applovin.mediation.MaxReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1029a;
    private final int b;

    private MaxRewardImpl(int i, java.lang.String str) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f1029a = str;
        this.b = i;
    }

    public static com.applovin.mediation.MaxReward create(int i, java.lang.String str) {
        return new com.applovin.impl.mediation.MaxRewardImpl(i, str);
    }

    public static com.applovin.mediation.MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final java.lang.String getLabel() {
        return this.f1029a;
    }

    public java.lang.String toString() {
        return "MaxReward{amount=" + this.b + ", label=" + this.f1029a + "}";
    }
}
