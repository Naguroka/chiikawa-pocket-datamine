package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/ed;", "Lcom/ironsource/ld;", "", "e", "Lcom/ironsource/ad;", "d", "", "loadAd", "Landroid/app/Activity;", "activity", "", com.json.op.d, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/g1;", "c", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "b", "Lcom/ironsource/cl;", "Lcom/ironsource/cl;", "adInternal", "Z", "isExpired", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "Lcom/ironsource/ai;", "Lcom/ironsource/ai;", "testSuiteLoadConfigService", "<init>", "(Lcom/ironsource/cl;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ed implements com.json.ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.cl adInternal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isExpired;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.unity3d.mediation.LevelPlayAdInfo adInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.ai testSuiteLoadConfigService;

    public ed(com.json.cl adInternal, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        this.adInternal = adInternal;
        this.isExpired = z;
        this.adInfo = new com.unity3d.mediation.LevelPlayAdInfo(adInternal.getAdUnitId(), adInternal.getAdFormat().toString(), null, null, null, null, 60, null);
        this.testSuiteLoadConfigService = adInternal.getMediationServicesProvider().o();
    }

    public /* synthetic */ ed(com.json.cl clVar, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(clVar, (i & 2) != 0 ? false : z);
    }

    private final com.json.ad d() {
        com.json.ad adVarC = this.adInternal.getAdController();
        if (adVarC != null) {
            return adVarC;
        }
        com.json.c1 c1Var = new com.json.c1(com.unity3d.mediation.a.a(this.adInternal.getAdFormat()), this.adInternal.getAdUnitId(), null, this.testSuiteLoadConfigService.getTestSuiteLoadAdConfigInternal(), 4, null);
        this.adInternal.getAdTools().getEventSender().a(new com.json.z1(this.adInternal.getAdTools(), c1Var, this.adInternal.getAdTools().b(this.adInternal.getAdFormat(), this.adInternal.getAdUnitId()).b().getDescription()));
        com.json.bd bdVarH = this.adInternal.getFullscreenAdControllerFactory();
        com.json.cl clVar = this.adInternal;
        return bdVarH.a(clVar, clVar.getAdTools(), c1Var, this.adInternal.getAdUnitDataFactory());
    }

    private final boolean e() {
        if (this.adInternal.getAdUnitId().length() == 0) {
            this.adInternal.onAdLoadFailed(new com.unity3d.mediation.LevelPlayAdError(this.adInternal.getAdUnitId(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        if (!this.adInternal.getAdTools().g()) {
            this.adInternal.onAdLoadFailed(new com.unity3d.mediation.LevelPlayAdError(this.adInternal.getAdUnitId(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"));
            return false;
        }
        com.json.al alVarA = this.adInternal.getMediationServicesProvider().t().a();
        if (alVarA != null && alVarA.a(this.adInternal.getAdUnitId(), this.adInternal.getAdFormat())) {
            return true;
        }
        this.adInternal.b(new com.unity3d.mediation.LevelPlayAdError(this.adInternal.getAdUnitId(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        return false;
    }

    @Override // com.json.ld
    public void a(android.app.Activity activity, java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.adInternal.a(new com.unity3d.mediation.LevelPlayAdError(this.adInternal.getAdUnitId(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.isExpired ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.json.ld
    /* JADX INFO: renamed from: b, reason: from getter */
    public com.unity3d.mediation.LevelPlayAdInfo getAdInfo() {
        return this.adInfo;
    }

    @Override // com.json.ld
    public com.json.g1 c() {
        return new com.ironsource.g1.a(this.isExpired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.json.ld
    public void loadAd() {
        if (e()) {
            this.adInternal.a(d());
            this.adInternal.m();
        }
    }
}
