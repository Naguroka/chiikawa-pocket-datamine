package com.json;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l7<Smash extends com.json.m7<?>> extends com.json.i7<Smash, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener> implements com.json.s2 {
    public l7(com.json.r0 r0Var, com.json.lk lkVar, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        super(r0Var, lkVar, ironSourceSegment);
    }

    @Override // com.json.s2
    public void a(com.json.m7<?> m7Var, com.json.mediationsdk.model.Placement placement) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(m7Var.k()));
        this.t.b(placement, m7Var.f());
    }
}
