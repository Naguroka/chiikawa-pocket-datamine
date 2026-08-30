package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\n\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\rJ\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\n\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/ironsource/pm;", "Lcom/ironsource/n;", "Lcom/ironsource/dn;", "Lcom/ironsource/j2;", "Lcom/ironsource/v1;", "Lcom/ironsource/l1;", "tools", "Lcom/ironsource/zm;", "adProperties", "Lcom/ironsource/bn;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/unity3d/mediation/LevelPlayAdInfo;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "", "k", "Lcom/ironsource/mm;", "nativeAdBinder", "j", "Lcom/ironsource/q1;", "adUnitCallback", "c", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/sm;", "Lcom/ironsource/sm;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/l1;", "adTools", "d", "Lcom/ironsource/zm;", "nativeAdProperties", "e", "Lcom/ironsource/bn;", "nativeAdUnit", "f", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "<init>", "(Lcom/ironsource/sm;Lcom/ironsource/l1;Lcom/ironsource/zm;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pm extends com.json.n implements com.json.dn, com.json.j2, com.json.v1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.sm listener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.l1 adTools;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.zm nativeAdProperties;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private com.json.bn nativeAdUnit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private com.unity3d.mediation.LevelPlayAdInfo adInfo;

    public pm(com.json.sm listener, com.json.l1 adTools, com.json.zm nativeAdProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.listener = listener;
        this.adTools = adTools;
        this.nativeAdProperties = nativeAdProperties;
        this.adInfo = i();
    }

    private final com.json.bn a(com.json.l1 tools, com.json.zm adProperties) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        return new com.json.bn(tools, com.json.cn.INSTANCE.a(adProperties, getSdkConfigService().a()), this);
    }

    private final com.unity3d.mediation.LevelPlayAdInfo i() {
        java.lang.String adUnitId = this.nativeAdProperties.getAdUnitId();
        java.lang.String string = this.nativeAdProperties.getAdFormat().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "nativeAdProperties.adFormat.toString()");
        return new com.unity3d.mediation.LevelPlayAdInfo(adUnitId, string, null, null, null, null, 60, null);
    }

    @Override // com.json.j2
    public void a(com.json.mediationsdk.logger.IronSourceError error) {
        this.listener.onNativeAdLoadFailed(error);
    }

    public final void a(com.json.mm nativeAdBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        com.json.bn bnVar = this.nativeAdUnit;
        if (bnVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            bnVar = null;
        }
        bnVar.a(new com.json.um(nativeAdBinder), this);
    }

    @Override // com.json.v1
    public void b() {
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.json.v1
    public void b(com.json.mediationsdk.logger.IronSourceError error) {
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.json.h2
    public void c() {
        this.listener.f(this.adInfo);
    }

    @Override // com.json.j2
    public void c(com.json.q1 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.adInfo = levelPlayAdInfoC;
            this.listener.b(levelPlayAdInfoC);
        }
    }

    public final void j() {
        this.adInfo = i();
        com.json.bn bnVar = this.nativeAdUnit;
        if (bnVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            bnVar = null;
        }
        bnVar.d();
    }

    public final void k() {
        com.json.bn bnVarA = a(this.adTools, this.nativeAdProperties);
        this.nativeAdUnit = bnVarA;
        if (bnVarA == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            bnVarA = null;
        }
        bnVarA.a((com.json.j2) this);
    }
}
