package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ironsource/w0;", "Lcom/ironsource/v0;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mj;", com.ironsource.y8.h.p0, "", "loadParams", "", "Lcom/ironsource/rn;", "Lcom/ironsource/rn;", "networkLoadApi", "<init>", "(Lcom/ironsource/rn;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class w0 implements com.json.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.rn networkLoadApi;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ironsource/w0$a;", "", "", "b", "I", "LOAD_EXCEPTION", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.w0.a f3523a = new com.ironsource.w0.a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int LOAD_EXCEPTION = 1000;

        private a() {
        }
    }

    public w0(com.json.rn networkLoadApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        this.networkLoadApi = networkLoadApi;
    }

    @Override // com.json.v0
    public java.lang.String a() {
        return this.networkLoadApi.a();
    }

    @Override // com.json.v0
    public void a(com.json.mj adInstance, java.util.Map<java.lang.String, java.lang.String> loadParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        try {
            this.networkLoadApi.a(adInstance, new com.json.tn(null, false, 3, null));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
            java.lang.String str = "1000: loadAd failed: " + e.getMessage();
            com.json.eo eoVarB = adInstance.b();
            if (eoVarB instanceof com.json.xc) {
                com.json.eo eoVarB2 = adInstance.b();
                kotlin.jvm.internal.Intrinsics.checkNotNull(eoVarB2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((com.json.xc) eoVarB2).onInterstitialLoadFailed(str);
            } else if (eoVarB instanceof com.json.go) {
                com.json.eo eoVarB3 = adInstance.b();
                kotlin.jvm.internal.Intrinsics.checkNotNull(eoVarB3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((com.json.go) eoVarB3).onBannerLoadFail(str);
            }
        }
    }
}
