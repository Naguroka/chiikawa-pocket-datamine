package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/kd;", "Lcom/ironsource/ld;", "", "loadAd", "Lcom/ironsource/g1;", "c", "Landroid/app/Activity;", "activity", "", com.json.op.d, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/unity3d/mediation/LevelPlayAdInfo;", "b", "Lcom/ironsource/cl;", "Lcom/ironsource/cl;", "adInternal", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "<init>", "(Lcom/ironsource/cl;Lcom/unity3d/mediation/LevelPlayAdInfo;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class kd implements com.json.ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.cl adInternal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.unity3d.mediation.LevelPlayAdInfo adInfo;

    public kd(com.json.cl adInternal, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.adInternal = adInternal;
        this.adInfo = adInfo;
    }

    @Override // com.json.ld
    public void a(android.app.Activity activity, java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.adInternal.b(new com.unity3d.mediation.LevelPlayAdError(this.adInternal.getAdUnitId(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.adInfo);
    }

    @Override // com.json.ld
    /* JADX INFO: renamed from: b, reason: from getter */
    public com.unity3d.mediation.LevelPlayAdInfo getAdInfo() {
        return this.adInfo;
    }

    @Override // com.json.ld
    public com.json.g1 c() {
        return new com.ironsource.g1.a("ad is showing");
    }

    @Override // com.json.ld
    public void loadAd() {
        this.adInternal.b(new com.unity3d.mediation.LevelPlayAdError(this.adInternal.getAdUnitId(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"));
    }
}
