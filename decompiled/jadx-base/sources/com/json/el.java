package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/ironsource/el;", "", "Lcom/ironsource/u1;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "c", "Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAdListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/app/Activity;", "activity", "", com.json.op.d, "", "b", "Lcom/ironsource/sf;", "Lcom/ironsource/sf;", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Lcom/ironsource/cl;", "Lcom/ironsource/cl;", "fullScreenAdInternal", "adUnitId", "Lcom/ironsource/l1;", "adTools", "Lcom/ironsource/bd;", "adControllerFactory", "Lcom/ironsource/n9;", "currentTimeProvider", "<init>", "(Ljava/lang/String;Lcom/ironsource/l1;Lcom/ironsource/bd;Lcom/ironsource/sf;Lcom/ironsource/n9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class el {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.sf provider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.cl fullScreenAdInternal;

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/ironsource/el$a", "Lcom/ironsource/u1;", "", "isPublisherLoad", "Lcom/ironsource/c1;", "adProperties", "Lcom/ironsource/t1;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.u1 {
        a() {
        }

        @Override // com.json.u1
        public com.json.t1 a(boolean isPublisherLoad, com.json.c1 adProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return com.json.fj.INSTANCE.a(adProperties, com.json.el.this.provider.t().a(), isPublisherLoad);
        }
    }

    public el(java.lang.String adUnitId, com.json.l1 adTools, com.json.bd adControllerFactory, com.json.sf provider, com.json.n9 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.provider = provider;
        this.fullScreenAdInternal = new com.json.cl(com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, adUnitId, adTools, adControllerFactory, a(), provider, currentTimeProvider);
    }

    private final com.json.u1 a() {
        return new com.ironsource.el.a();
    }

    public final void a(android.app.Activity activity, java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.fullScreenAdInternal.a(activity, placementName);
    }

    public final void a(com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener listener) {
        this.fullScreenAdInternal.a(listener != null ? com.json.fl.b(listener) : null);
    }

    public final boolean b() {
        return this.fullScreenAdInternal.k();
    }

    public final void c() {
        this.fullScreenAdInternal.l();
    }
}
