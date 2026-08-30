package com.json;

/* JADX INFO: loaded from: classes5.dex */
class d7 extends com.json.n2 {
    d7(com.json.l2 l2Var, com.json.bm bmVar) {
        super(l2Var, bmVar);
    }

    private boolean n() {
        return b().b() > 0;
    }

    private boolean p() {
        return b().d() >= 0;
    }

    void l() {
        if (o()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
            i();
        }
    }

    void m() {
        if (o()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
            i();
        }
    }

    boolean o() {
        return b().a() == com.ironsource.l2.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    void q() {
        if (o() && d()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
            a(b().c());
        }
    }

    void r() {
        if (!n()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else if (o() && p()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
            a(b().d());
        }
    }
}
