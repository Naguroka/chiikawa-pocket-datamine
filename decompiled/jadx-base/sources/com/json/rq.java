package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class rq extends com.json.l7<com.json.sq> {
    public rq(java.util.List<com.json.mediationsdk.model.NetworkSettings> list, com.json.uq uqVar, java.lang.String str, boolean z, com.json.lk lkVar, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        super(new com.json.pq(str, list, uqVar, z), lkVar, ironSourceSegment);
    }

    @Override // com.json.k7
    protected com.json.mediationsdk.LoadWhileShowSupportState a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        return ((com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface) adapterBaseInterface).getLoadWhileShowSupportedState(networkSettings);
    }

    @Override // com.json.k7
    protected /* bridge */ /* synthetic */ com.json.n7 a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter baseAdAdapter, int i, java.lang.String str, com.json.j5 j5Var) {
        return b(networkSettings, (com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener>) baseAdAdapter, i, str, j5Var);
    }

    @Override // com.json.k7
    protected void a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.l2.a aVarA = this.o.getLoadingData().a();
        if (aVarA == com.ironsource.l2.a.AUTOMATIC_LOAD_AFTER_CLOSE || aVarA == com.ironsource.l2.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.t.a(false, (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
        } else {
            super.a(ironSourceError);
        }
    }

    protected com.json.sq b(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener> baseAdAdapter, int i, java.lang.String str, com.json.j5 j5Var) {
        return new com.json.sq(this, new com.json.j1(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, this.o.getUserId(), i, this.g, str, this.e, this.f, networkSettings, this.o.getSmashLoadTimeout()), baseAdAdapter, j5Var, this);
    }

    @Override // com.json.k7
    protected org.json.JSONObject b(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }

    @Override // com.json.k7
    protected com.json.i2 g() {
        return new com.json.xq();
    }

    @Override // com.json.k7
    protected java.lang.String l() {
        return com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    @Override // com.json.k7
    protected java.lang.String o() {
        return com.json.mediationsdk.utils.IronSourceConstants.OPW_RV_MANAGER_NAME;
    }

    @Override // com.json.k7
    protected boolean q() {
        return this.o.getLoadingData().a() == com.ironsource.l2.a.MANUAL;
    }

    @Override // com.json.k7
    protected boolean t() {
        return this.o.getLoadingData().a() == com.ironsource.l2.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}
