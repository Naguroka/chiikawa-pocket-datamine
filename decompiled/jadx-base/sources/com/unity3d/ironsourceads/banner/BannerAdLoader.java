package com.unity3d.ironsourceads.banner;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ironsourceads/banner/BannerAdLoader;", "", "Lcom/unity3d/ironsourceads/banner/BannerAdRequest;", "adRequest", "Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "loadAd", "Ljava/util/concurrent/Executor;", "executor", "Lcom/ironsource/am;", "loadTaskProvider", "internalLoadAd$mediationsdk_release", "(Ljava/util/concurrent/Executor;Lcom/ironsource/am;)V", "internalLoadAd", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/concurrent/Executor;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class BannerAdLoader {
    public static final com.unity3d.ironsourceads.banner.BannerAdLoader INSTANCE = new com.unity3d.ironsourceads.banner.BannerAdLoader();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final java.util.concurrent.Executor executor = com.json.cg.f2559a.c();

    private BannerAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.xl loadTask) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    @kotlin.jvm.JvmStatic
    public static final void loadAd(com.unity3d.ironsourceads.banner.BannerAdRequest adRequest, com.unity3d.ironsourceads.banner.BannerAdLoaderListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        INSTANCE.internalLoadAd$mediationsdk_release(executor, new com.json.c7(adRequest, listener, com.json.gn.INSTANCE.a(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(java.util.concurrent.Executor executor2, com.json.am loadTaskProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "executor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final com.json.xl xlVarA = loadTaskProvider.a();
        executor2.execute(new java.lang.Runnable() { // from class: com.unity3d.ironsourceads.banner.BannerAdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.ironsourceads.banner.BannerAdLoader.a(xlVarA);
            }
        });
    }
}
