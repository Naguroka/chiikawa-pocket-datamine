package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\b\u001a\u00020\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ironsource/ol;", "", "", "b", "Landroid/app/Activity;", "activity", "", com.json.op.d, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAdListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lcom/ironsource/cl;", "Lcom/ironsource/cl;", "fullScreenAdInternal", "adUnitId", "Lcom/ironsource/l1;", "adTools", "Lcom/ironsource/bd;", "adControllerFactory", "Lcom/ironsource/sf;", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Lcom/ironsource/n9;", "currentTimeProvider", "<init>", "(Ljava/lang/String;Lcom/ironsource/l1;Lcom/ironsource/bd;Lcom/ironsource/sf;Lcom/ironsource/n9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ol {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.cl fullScreenAdInternal;

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/ironsource/ol$a", "Lcom/ironsource/u1;", "", "isPublisherLoad", "Lcom/ironsource/c1;", "adProperties", "Lcom/ironsource/t1;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.sf f3123a;

        a(com.json.sf sfVar) {
            this.f3123a = sfVar;
        }

        @Override // com.json.u1
        public com.json.t1 a(boolean isPublisherLoad, com.json.c1 adProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return com.json.oq.INSTANCE.a(adProperties, this.f3123a.t().a(), isPublisherLoad);
        }
    }

    public ol(java.lang.String adUnitId, com.json.l1 adTools, com.json.bd adControllerFactory, com.json.sf provider, com.json.n9 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.fullScreenAdInternal = new com.json.cl(com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, adUnitId, adTools, adControllerFactory, new com.ironsource.ol.a(provider), provider, currentTimeProvider);
    }

    public final void a(android.app.Activity activity, java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.fullScreenAdInternal.a(activity, placementName);
    }

    public final void a(com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener listener) {
        this.fullScreenAdInternal.a(listener != null ? com.json.pl.b(listener) : null);
    }

    public final boolean a() {
        return this.fullScreenAdInternal.k();
    }

    public final void b() {
        this.fullScreenAdInternal.l();
    }
}
