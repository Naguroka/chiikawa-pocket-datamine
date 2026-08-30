package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class cj extends com.json.i7<com.json.ej, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener> {
    cj(com.json.sf sfVar, com.json.rf rfVar, java.util.List<com.json.mediationsdk.model.NetworkSettings> list, com.json.hj hjVar, java.lang.String str, com.json.lk lkVar, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        super(sfVar, rfVar, new com.json.dj(str, list, hjVar), lkVar, ironSourceSegment);
    }

    public cj(java.util.List<com.json.mediationsdk.model.NetworkSettings> list, com.json.hj hjVar, java.lang.String str, com.json.lk lkVar, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        super(new com.json.dj(str, list, hjVar), lkVar, ironSourceSegment);
    }

    @Override // com.json.k7
    protected /* bridge */ /* synthetic */ com.json.n7 a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter baseAdAdapter, int i, java.lang.String str, com.json.j5 j5Var) {
        return b(networkSettings, (com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener>) baseAdAdapter, i, str, j5Var);
    }

    protected com.json.ej b(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener> baseAdAdapter, int i, java.lang.String str, com.json.j5 j5Var) {
        return new com.json.ej(this, new com.json.j1(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, this.o.getUserId(), i, this.g, str, this.e, this.f, networkSettings, this.o.getSmashLoadTimeout()), baseAdAdapter, j5Var, this);
    }

    @Override // com.json.k7
    protected org.json.JSONObject b(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }

    @Override // com.json.k7
    protected com.json.i2 g() {
        return new com.json.lj();
    }

    @Override // com.json.k7
    protected java.lang.String l() {
        return com.json.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    @Override // com.json.k7
    protected java.lang.String o() {
        return com.json.mediationsdk.utils.IronSourceConstants.OPW_IS_MANAGER_NAME;
    }
}
