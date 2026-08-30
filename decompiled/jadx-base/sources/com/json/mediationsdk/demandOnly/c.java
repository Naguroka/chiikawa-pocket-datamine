package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
public class c implements com.ironsource.mediationsdk.demandOnly.i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.demandOnly.d> f2951a = new java.util.concurrent.ConcurrentHashMap<>();
    private com.json.oa b;

    public c(java.util.List<com.json.mediationsdk.model.NetworkSettings> list, com.json.r6 r6Var, java.lang.String str, java.lang.String str2, com.json.oa oaVar) {
        java.lang.String sessionId = com.json.mediationsdk.utils.IronSourceUtils.getSessionId();
        boolean zK = r6Var.k();
        this.b = oaVar;
        com.json.mediationsdk.e eVar = new com.json.mediationsdk.e(new com.json.mediationsdk.f(r6Var.d(), sessionId));
        for (com.json.mediationsdk.model.NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                com.json.mediationsdk.AbstractAdapter abstractAdapterA = com.json.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), true);
                if (abstractAdapterA != null) {
                    com.json.mediationsdk.demandOnly.d dVar = new com.json.mediationsdk.demandOnly.d(str, str2, networkSettings, r6Var.b(), abstractAdapterA, eVar);
                    dVar.a(zK);
                    this.f2951a.put(dVar.l(), dVar);
                }
            } else {
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str) {
        com.json.mediationsdk.demandOnly.d dVar = this.f2951a.get(str);
        if (dVar != null) {
            dVar.a(iSDemandOnlyBannerLayout);
            return;
        }
        this.b.a(3503, str);
        com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildNonExistentInstanceError = com.json.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError("Banner");
        com.json.mediationsdk.logger.IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorBuildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str, java.lang.String str2) {
        com.json.mediationsdk.demandOnly.d dVar = this.f2951a.get(str);
        if (dVar != null) {
            dVar.a(iSDemandOnlyBannerLayout, new com.ironsource.mediationsdk.demandOnly.o.a(com.json.mediationsdk.utils.IronSourceAES.decode(com.json.jb.b().c(), str2)));
            return;
        }
        this.b.a(3503, str);
        com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildNonExistentInstanceError = com.json.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError("Banner");
        com.json.mediationsdk.logger.IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorBuildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public synchronized void a(java.lang.String str) {
        com.json.mediationsdk.demandOnly.d dVar = this.f2951a.get(str);
        if (dVar != null) {
            dVar.r();
            return;
        }
        this.b.a(com.json.mediationsdk.utils.IronSourceConstants.BN_DO_INSTANCE_NOT_FOUND_IN_DESTROY, str);
        com.json.mediationsdk.logger.IronLog.API.error(com.json.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
    }
}
