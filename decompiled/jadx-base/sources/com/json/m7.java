package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class m7<Listener extends com.json.s2> extends com.json.j7<Listener> implements com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener {
    private com.json.fb r;

    class a extends com.json.dr {
        a() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.m7.this.U();
        }
    }

    public m7(com.json.pp ppVar, com.json.j1 j1Var, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener> baseAdAdapter, com.json.z2 z2Var, com.json.j5 j5Var, Listener listener) {
        super(ppVar, j1Var, baseAdAdapter, z2Var, j5Var, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.g == null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a("placement is null "));
            com.json.b2 b2Var = this.d;
            if (b2Var != null) {
                b2Var.k.g("mCurrentPlacement is null state = " + this.e);
                return;
            }
            return;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a("placement name = " + j()));
        if (this.d != null) {
            java.util.HashMap map = new java.util.HashMap();
            if (com.json.mediationsdk.p.m().s() != null) {
                for (java.lang.String str : com.json.mediationsdk.p.m().s().keySet()) {
                    map.put(androidx.media3.datasource.cache.ContentMetadata.KEY_CUSTOM_PREFIX + str, com.json.mediationsdk.p.m().s().get(str));
                }
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            this.d.j.a(j(), this.g.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME java.lang.String(), this.g.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT java.lang.String(), jCurrentTimeMillis, com.json.mediationsdk.utils.IronSourceUtils.getTransId(jCurrentTimeMillis, c()), com.json.fb.a(this.r), map, com.json.mediationsdk.p.m().l());
        }
        ((com.json.s2) this.b).a((com.json.m7<?>) this, this.g);
    }

    @Override // com.json.j7, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.r = new com.json.fb();
        super.onAdClosed();
    }

    @Override // com.json.n7, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.r = null;
        super.onAdOpened();
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (u().c()) {
            u().a(new com.ironsource.m7.a());
        } else {
            U();
        }
    }
}
