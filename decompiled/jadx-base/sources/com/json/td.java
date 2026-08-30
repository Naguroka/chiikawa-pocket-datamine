package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/ironsource/td;", "Lcom/ironsource/xd;", "Lcom/ironsource/k2;", "adUnitLoadStrategyListener", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/app/Activity;", "activity", "Lcom/ironsource/w1;", "adUnitDisplayStrategyListener", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/rd;", "Lcom/ironsource/rd;", "strategy", "Lcom/ironsource/md;", "Lcom/ironsource/md;", "currentAdUnit", "c", "progressiveAdUnit", "d", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "<init>", "(Lcom/ironsource/rd;Lcom/ironsource/md;Lcom/ironsource/md;Lcom/unity3d/mediation/LevelPlayAdInfo;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class td implements com.json.xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.rd strategy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.md currentAdUnit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.md progressiveAdUnit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private com.unity3d.mediation.LevelPlayAdInfo adInfo;

    public td(com.json.rd strategy, com.json.md currentAdUnit, com.json.md progressiveAdUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.strategy = strategy;
        this.currentAdUnit = currentAdUnit;
        this.progressiveAdUnit = progressiveAdUnit;
        this.adInfo = adInfo;
    }

    @Override // com.json.xd
    public void a() {
        com.json.rd rdVar = this.strategy;
        rdVar.a(new com.json.sd(rdVar, this.currentAdUnit, true));
    }

    @Override // com.json.xd
    public void a(android.app.Activity activity, com.json.w1 adUnitDisplayStrategyListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitDisplayStrategyListener, "adUnitDisplayStrategyListener");
        adUnitDisplayStrategyListener.b(new com.json.mediationsdk.logger.IronSourceError(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.json.xd
    public void a(com.json.k2 adUnitLoadStrategyListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitLoadStrategyListener, "adUnitLoadStrategyListener");
        adUnitLoadStrategyListener.a(this.adInfo);
        com.json.rd rdVar = this.strategy;
        rdVar.a(new com.json.vd(rdVar, this.progressiveAdUnit, adUnitLoadStrategyListener));
    }

    @Override // com.json.xd
    public void a(com.json.mediationsdk.logger.IronSourceError error) {
        this.strategy.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.json.xd
    public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.adInfo = adInfo;
    }

    @Override // com.json.xd
    public void b() {
        this.strategy.a("show success on progressive ad unit that already loaded");
    }

    @Override // com.json.xd
    public void b(com.json.mediationsdk.logger.IronSourceError error) {
        this.strategy.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.json.xd
    public void b(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.strategy.a("load success on progressive ad unit is already loaded");
    }
}
