package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/vd;", "Lcom/ironsource/xd;", "Lcom/ironsource/k2;", "adUnitLoadStrategyListener", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/app/Activity;", "activity", "Lcom/ironsource/w1;", "adUnitDisplayStrategyListener", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/rd;", "Lcom/ironsource/rd;", "strategy", "Lcom/ironsource/md;", "Lcom/ironsource/md;", "adUnit", "c", "Lcom/ironsource/k2;", "loadListener", "d", "Lcom/ironsource/w1;", "showListener", "<init>", "(Lcom/ironsource/rd;Lcom/ironsource/md;Lcom/ironsource/k2;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class vd implements com.json.xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.rd strategy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.md adUnit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.k2 loadListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private com.json.w1 showListener;

    public vd(com.json.rd strategy, com.json.md adUnit, com.json.k2 loadListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.strategy = strategy;
        this.adUnit = adUnit;
        this.loadListener = loadListener;
    }

    @Override // com.json.xd
    public void a() {
        com.json.rd rdVar = this.strategy;
        rdVar.a(new com.json.sd(rdVar, null, true));
        this.loadListener.a();
    }

    @Override // com.json.xd
    public void a(android.app.Activity activity, com.json.w1 adUnitDisplayStrategyListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitDisplayStrategyListener, "adUnitDisplayStrategyListener");
        this.showListener = adUnitDisplayStrategyListener;
        this.adUnit.a(activity, this.strategy);
    }

    @Override // com.json.xd
    public void a(com.json.k2 adUnitLoadStrategyListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitLoadStrategyListener, "adUnitLoadStrategyListener");
        com.json.rd rdVar = this.strategy;
        rdVar.a(new com.json.sd(rdVar, null, false, 4, null));
        this.strategy.a(adUnitLoadStrategyListener);
    }

    @Override // com.json.xd
    public void a(com.json.mediationsdk.logger.IronSourceError error) {
        this.strategy.a("load failed after ad unit is already loaded");
    }

    @Override // com.json.xd
    public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.loadListener.onAdInfoChanged(adInfo);
    }

    @Override // com.json.xd
    public void b() {
        com.json.w1 w1Var = this.showListener;
        if (w1Var != null) {
            w1Var.b();
        }
        com.json.md mdVarA = this.strategy.getFactory().a(false);
        com.json.rd rdVar = this.strategy;
        rdVar.a(new com.json.ud(rdVar, this.adUnit, mdVarA));
        mdVarA.a(this.strategy);
    }

    @Override // com.json.xd
    public void b(com.json.mediationsdk.logger.IronSourceError error) {
        if (!com.json.za.f3610a.a(error)) {
            com.json.rd rdVar = this.strategy;
            rdVar.a(new com.json.sd(rdVar, null, false, 4, null));
        }
        com.json.w1 w1Var = this.showListener;
        if (w1Var != null) {
            w1Var.b(error);
        }
    }

    @Override // com.json.xd
    public void b(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.strategy.a("Ad unit is already loaded");
    }
}
