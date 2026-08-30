package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements com.five_corp.ad.internal.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.FiveAdVideoRewardEventListener f2118a;
    public final /* synthetic */ com.five_corp.ad.FiveAdVideoReward b;

    public y(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward, com.five_corp.ad.FiveAdVideoRewardEventListener fiveAdVideoRewardEventListener) {
        this.f2118a = fiveAdVideoRewardEventListener;
        this.b = fiveAdVideoReward;
    }

    @Override // com.five_corp.ad.internal.z
    public final void a() {
        this.f2118a.onReward(this.b);
    }

    @Override // com.five_corp.ad.internal.z
    public final void b() {
        this.f2118a.onFullScreenOpen(this.b);
    }

    @Override // com.five_corp.ad.internal.z
    public final void c() {
        this.f2118a.onFullScreenClose(this.b);
    }
}
