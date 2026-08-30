package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/c7;", "Lcom/ironsource/am;", "Lcom/ironsource/xl;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/unity3d/ironsourceads/banner/BannerAdRequest;", "Lcom/unity3d/ironsourceads/banner/BannerAdRequest;", "adRequest", "Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;", "b", "Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;", "publisherListener", "Lcom/ironsource/b3;", "c", "Lcom/ironsource/b3;", "adapterConfigProvider", "Lcom/ironsource/m3;", "d", "Lcom/ironsource/m3;", "analyticsFactory", "<init>", "(Lcom/unity3d/ironsourceads/banner/BannerAdRequest;Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;Lcom/ironsource/b3;Lcom/ironsource/m3;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class c7 implements com.json.am {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.unity3d.ironsourceads.banner.BannerAdRequest adRequest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.unity3d.ironsourceads.banner.BannerAdLoaderListener publisherListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.b3 adapterConfigProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.m3 analyticsFactory;

    public c7(com.unity3d.ironsourceads.banner.BannerAdRequest adRequest, com.unity3d.ironsourceads.banner.BannerAdLoaderListener publisherListener, com.json.b3 adapterConfigProvider, com.json.m3 analyticsFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.adRequest = adRequest;
        this.publisherListener = publisherListener;
        this.adapterConfigProvider = adapterConfigProvider;
        this.analyticsFactory = analyticsFactory;
    }

    public /* synthetic */ c7(com.unity3d.ironsourceads.banner.BannerAdRequest bannerAdRequest, com.unity3d.ironsourceads.banner.BannerAdLoaderListener bannerAdLoaderListener, com.json.b3 b3Var, com.json.m3 m3Var, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, bannerAdLoaderListener, b3Var, (i & 8) != 0 ? new com.json.l3(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) : m3Var);
    }

    @Override // com.json.am
    public com.json.xl a() throws java.lang.Exception {
        com.json.mediationsdk.logger.IronSourceError ironSourceErrorA;
        java.lang.String instanceId = this.adRequest.getInstanceId();
        java.lang.String sDKVersion = com.json.sdk.utils.SDKUtils.getSDKVersion();
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        com.json.n3 n3VarA = this.analyticsFactory.a(new com.json.h3(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            com.json.yl ylVarA = new com.json.zl(this.adRequest.getAdm(), this.adRequest.getProviderName(), this.adapterConfigProvider, com.json.gn.INSTANCE.a().getInitialized().get()).a();
            new com.json.a7(ylVarA, this.adRequest.getSize()).a();
            com.json.sn snVar = new com.json.sn();
            com.json.h5 h5Var = new com.json.h5(this.adRequest.getAdm(), this.adRequest.getProviderName());
            com.unity3d.ironsourceads.banner.BannerAdRequest bannerAdRequest = this.adRequest;
            com.unity3d.ironsourceads.AdSize size = bannerAdRequest.getSize();
            kotlin.jvm.internal.Intrinsics.checkNotNull(ylVarA);
            com.json.cg cgVar = com.json.cg.f2559a;
            return new com.json.z6(bannerAdRequest, size, h5Var, ylVarA, snVar, n3VarA, new com.json.b7(cgVar, this.publisherListener), new com.json.b6(n3VarA, cgVar.c()), null, null, 768, null);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            if (e instanceof com.json.kr) {
                ironSourceErrorA = ((com.json.kr) e).getError();
            } else {
                com.json.tb tbVar = com.json.tb.f3430a;
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorA = tbVar.a(message);
            }
            return new com.json.sb(ironSourceErrorA, new com.json.b7(com.json.cg.f2559a, this.publisherListener), n3VarA);
        }
    }
}
