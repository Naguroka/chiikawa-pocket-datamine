package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rH\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/ironsource/id;", "Lcom/ironsource/ld;", "", "d", "", "loadAd", "Landroid/app/Activity;", "activity", "", com.json.op.d, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/g1;", "c", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "b", "adInfo", "onAdInfoChanged", "Lcom/ironsource/cl;", "Lcom/ironsource/cl;", "adInternal", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "Lcom/ironsource/n9;", "Lcom/ironsource/n9;", "currentTimeProvider", "J", "loadSuccessTimestamp", "<init>", "(Lcom/ironsource/cl;Lcom/unity3d/mediation/LevelPlayAdInfo;Lcom/ironsource/n9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class id implements com.json.ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.cl adInternal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private com.unity3d.mediation.LevelPlayAdInfo adInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.n9 currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long loadSuccessTimestamp;

    public id(com.json.cl adInternal, com.unity3d.mediation.LevelPlayAdInfo adInfo, com.json.n9 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.adInternal = adInternal;
        this.adInfo = adInfo;
        this.currentTimeProvider = currentTimeProvider;
        this.loadSuccessTimestamp = currentTimeProvider.a();
    }

    private final long d() {
        return this.currentTimeProvider.a() - this.loadSuccessTimestamp;
    }

    @Override // com.json.ld
    public void a() {
        com.json.cl clVar = this.adInternal;
        clVar.a(new com.json.ed(clVar, true));
    }

    @Override // com.json.ld
    public void a(android.app.Activity activity, java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.json.mediationsdk.model.Placement placementA = this.adInternal.getAdTools().a(this.adInternal.getAdFormat(), placementName);
        com.json.ad adVarC = this.adInternal.getAdController();
        if (adVarC == null) {
            this.adInternal.b(new com.unity3d.mediation.LevelPlayAdError(this.adInternal.getAdUnitId(), com.json.mediationsdk.logger.IronSourceError.ERROR_IS_SHOW_EXCEPTION, "Internal Error, Illegal state"), this.adInfo);
            return;
        }
        com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo = new com.unity3d.mediation.LevelPlayAdInfo(this.adInfo, placementName);
        this.adInfo = levelPlayAdInfo;
        com.json.cl clVar = this.adInternal;
        clVar.a(new com.json.kd(clVar, levelPlayAdInfo));
        adVarC.a(activity, placementA);
    }

    @Override // com.json.ld
    /* JADX INFO: renamed from: b, reason: from getter */
    public com.unity3d.mediation.LevelPlayAdInfo getAdInfo() {
        return this.adInfo;
    }

    @Override // com.json.ld
    public com.json.g1 c() {
        com.json.i8 i8VarA = this.adInternal.getMediationServicesProvider().u().a(this.adInternal.getAdUnitId());
        return i8VarA.d() ? com.ironsource.g1.a.INSTANCE.a(i8VarA.e()) : com.ironsource.g1.b.f2669a;
    }

    @Override // com.json.ld
    public void loadAd() {
        this.adInternal.getAdTools().getEventSender().getTroubleshoot().a(java.lang.Long.valueOf(d()));
        this.adInternal.a(this.adInfo);
    }

    @Override // com.json.ld
    public void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.adInfo = adInfo;
    }
}
