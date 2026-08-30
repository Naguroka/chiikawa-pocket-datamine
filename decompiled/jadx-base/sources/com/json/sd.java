package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/ironsource/sd;", "Lcom/ironsource/xd;", "Lcom/ironsource/k2;", "adUnitLoadStrategyListener", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/app/Activity;", "activity", "Lcom/ironsource/w1;", "adUnitDisplayStrategyListener", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/rd;", "Lcom/ironsource/rd;", "strategy", "Lcom/ironsource/md;", "Lcom/ironsource/md;", "currentAdUnit", "", "c", "Z", "isExpired", "<init>", "(Lcom/ironsource/rd;Lcom/ironsource/md;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class sd implements com.json.xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.rd strategy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.md currentAdUnit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isExpired;

    public sd(com.json.rd strategy, com.json.md mdVar, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.strategy = strategy;
        this.currentAdUnit = mdVar;
        this.isExpired = z;
    }

    public /* synthetic */ sd(com.json.rd rdVar, com.json.md mdVar, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(rdVar, mdVar, (i & 4) != 0 ? false : z);
    }

    @Override // com.json.xd
    public void a() {
        this.strategy.a(this.isExpired ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.json.xd
    public void a(android.app.Activity activity, com.json.w1 adUnitDisplayStrategyListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitDisplayStrategyListener, "adUnitDisplayStrategyListener");
        adUnitDisplayStrategyListener.b(new com.json.mediationsdk.logger.IronSourceError(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.isExpired ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.json.xd
    public void a(com.json.k2 adUnitLoadStrategyListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitLoadStrategyListener, "adUnitLoadStrategyListener");
        com.json.md mdVarA = this.strategy.getFactory().a(true);
        com.json.rd rdVar = this.strategy;
        rdVar.a(new com.json.wd(rdVar, mdVarA, adUnitLoadStrategyListener));
        mdVarA.a(this.strategy);
    }

    @Override // com.json.xd
    public void a(com.json.mediationsdk.logger.IronSourceError error) {
        this.strategy.a(this.isExpired ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.json.xd
    public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.strategy.a(this.isExpired ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.json.xd
    public void b() {
        this.strategy.a(this.isExpired ? "show success on expired ad" : "show success before load called");
    }

    @Override // com.json.xd
    public void b(com.json.mediationsdk.logger.IronSourceError error) {
        this.strategy.a(this.isExpired ? "show failed on expired ad" : "show failed before load called");
    }

    @Override // com.json.xd
    public void b(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.strategy.a(this.isExpired ? "load success on expired ad" : "load success before load called");
    }
}
