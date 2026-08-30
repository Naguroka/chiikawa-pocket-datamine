package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
public class k implements com.ironsource.mediationsdk.demandOnly.i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.oa f2965a;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.demandOnly.l> b;
    private final com.json.hg<com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener> c;

    public k(java.util.List<com.json.mediationsdk.model.NetworkSettings> list, com.json.uq uqVar, com.json.mediationsdk.c cVar, com.json.hg<com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener> hgVar, java.lang.String str, java.lang.String str2, com.json.oa oaVar) {
        java.lang.String sessionId = com.json.mediationsdk.utils.IronSourceUtils.getSessionId();
        boolean zD = uqVar.d();
        com.json.mediationsdk.f fVar = new com.json.mediationsdk.f(uqVar.k(), sessionId);
        this.b = new java.util.concurrent.ConcurrentHashMap<>();
        this.f2965a = oaVar;
        this.c = hgVar;
        for (com.json.mediationsdk.model.NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                com.json.mediationsdk.AbstractAdapter abstractAdapterA = cVar.a(networkSettings, networkSettings.getRewardedVideoSettings(), true);
                if (abstractAdapterA != null) {
                    com.json.mediationsdk.demandOnly.l lVar = new com.json.mediationsdk.demandOnly.l(str, str2, networkSettings, this.c.a(networkSettings.getSubProviderId()), uqVar.i(), abstractAdapterA, new com.json.mediationsdk.e(fVar));
                    lVar.a(zD);
                    this.b.put(networkSettings.getSubProviderId(), lVar);
                }
            } else {
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.demandOnly.l> a() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void a(com.ironsource.mediationsdk.demandOnly.h.d dVar) {
        java.lang.String instanceId = dVar.getInstanceId();
        try {
            com.json.mediationsdk.demandOnly.l lVar = this.b.get(instanceId);
            if (lVar == null) {
                this.f2965a.a(1503, instanceId);
                com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildNonExistentInstanceError = com.json.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError(com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                com.json.mediationsdk.logger.IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.c.a(instanceId).onRewardedVideoAdLoadFailed(instanceId, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (dVar.getBidding()) {
                lVar.b(new com.ironsource.mediationsdk.demandOnly.o.a(com.json.mediationsdk.utils.IronSourceAES.decode(com.json.jb.b().c(), dVar.getAdMarkup())));
            } else {
                lVar.d();
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildLoadFailedError = com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadRewardedVideo exception " + e.getMessage());
            com.json.mediationsdk.logger.IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.c.a(instanceId).onRewardedVideoAdLoadFailed(instanceId, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public boolean a(java.lang.String str) {
        com.json.mediationsdk.demandOnly.l lVar = this.b.get(str);
        if (lVar != null) {
            return lVar.a();
        }
        this.f2965a.a(1500, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void b(java.lang.String str) {
        try {
            com.json.mediationsdk.demandOnly.l lVar = this.b.get(str);
            if (lVar != null) {
                lVar.e();
                return;
            }
            this.f2965a.a(1507, str);
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildNonExistentInstanceError = com.json.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError(com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            com.json.mediationsdk.logger.IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            this.c.a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildShowFailedError = com.json.mediationsdk.utils.ErrorBuilder.buildShowFailedError(com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "showRewardedVideo exception " + e.getMessage());
            com.json.mediationsdk.logger.IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.c.a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }
}
