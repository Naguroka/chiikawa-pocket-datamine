package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
public class f implements com.ironsource.mediationsdk.demandOnly.i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.oa f2957a;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.demandOnly.g> b;
    private final com.json.hg<com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener> c;

    public f(java.util.List<com.json.mediationsdk.model.NetworkSettings> list, com.json.hj hjVar, com.json.mediationsdk.c cVar, com.json.hg<com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener> hgVar, java.lang.String str, java.lang.String str2, com.json.oa oaVar) {
        java.lang.String sessionId = com.json.mediationsdk.utils.IronSourceUtils.getSessionId();
        boolean zJ = hjVar.j();
        com.json.mediationsdk.f fVar = new com.json.mediationsdk.f(hjVar.g(), sessionId);
        this.b = new java.util.concurrent.ConcurrentHashMap<>();
        this.f2957a = oaVar;
        this.c = hgVar;
        for (com.json.mediationsdk.model.NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                com.json.mediationsdk.AbstractAdapter abstractAdapterA = cVar.a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (abstractAdapterA != null) {
                    com.json.mediationsdk.demandOnly.g gVar = new com.json.mediationsdk.demandOnly.g(str, str2, networkSettings, this.c.a(networkSettings.getSubProviderId()), hjVar.e(), abstractAdapterA, new com.json.mediationsdk.e(fVar));
                    gVar.a(zJ);
                    this.b.put(networkSettings.getSubProviderId(), gVar);
                }
            } else {
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.demandOnly.g> a() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(com.ironsource.mediationsdk.demandOnly.h.d dVar) {
        java.lang.String instanceId = dVar.getInstanceId();
        java.lang.String adMarkup = dVar.getAdMarkup();
        try {
            com.json.mediationsdk.demandOnly.g gVar = this.b.get(instanceId);
            if (gVar == null) {
                this.f2957a.a(2503, instanceId);
                com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildNonExistentInstanceError = com.json.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                com.json.mediationsdk.logger.IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.c.a(instanceId).onInterstitialAdLoadFailed(instanceId, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (android.text.TextUtils.isEmpty(adMarkup)) {
                gVar.c();
            } else {
                gVar.a(new com.ironsource.mediationsdk.demandOnly.o.a(com.json.mediationsdk.utils.IronSourceAES.decode(com.json.jb.b().c(), adMarkup)));
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildLoadFailedError = com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e.getMessage());
            com.json.mediationsdk.logger.IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.c.a(instanceId).onInterstitialAdLoadFailed(instanceId, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(java.lang.String str) {
        try {
            com.json.mediationsdk.demandOnly.g gVar = this.b.get(str);
            if (gVar != null) {
                gVar.b();
                return;
            }
            this.f2957a.a(2507, str);
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildNonExistentInstanceError = com.json.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError("Interstitial");
            com.json.mediationsdk.logger.IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            this.c.a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildShowFailedError = com.json.mediationsdk.utils.ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial exception " + e.getMessage());
            com.json.mediationsdk.logger.IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.c.a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public boolean b(java.lang.String str) {
        com.json.mediationsdk.demandOnly.g gVar = this.b.get(str);
        if (gVar != null) {
            return gVar.a();
        }
        this.f2957a.a(2500, str);
        return false;
    }
}
