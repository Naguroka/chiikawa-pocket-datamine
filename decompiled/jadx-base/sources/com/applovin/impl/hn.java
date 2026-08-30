package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
class hn extends com.applovin.impl.yl {
    private final com.applovin.impl.eq h;
    private final com.applovin.sdk.AppLovinAdLoadListener i;

    hn(com.applovin.impl.eq eqVar, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskResolveVastWrapper", jVar);
        this.i = appLovinAdLoadListener;
        this.h = eqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String strA = com.applovin.impl.mq.a(this.h);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Resolving VAST ad with depth " + this.h.d() + " at " + strA);
            }
            try {
                this.f1547a.i0().a(new com.applovin.impl.hn.a(com.applovin.impl.sdk.network.a.a(this.f1547a).b(strA).c("GET").a(com.applovin.impl.es.f).a(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.K4)).intValue()).c(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.L4)).intValue()).a(false).a(), this.f1547a));
                return;
            } catch (java.lang.Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "Unable to resolve VAST wrapper", th);
                }
                a(-1);
                return;
            }
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "Resolving VAST failed. Could not find resolution URL");
        }
        a(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener = this.i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        com.applovin.impl.mq.a(this.h, this.i, i == -1001 ? com.applovin.impl.fq.TIMED_OUT : com.applovin.impl.fq.GENERAL_WRAPPER_ERROR, i, this.f1547a);
    }

    class a extends com.applovin.impl.dn {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, com.applovin.impl.es esVar, int i) {
            this.f1547a.i0().a(com.applovin.impl.zm.a(esVar, com.applovin.impl.hn.this.h, com.applovin.impl.hn.this.i, com.applovin.impl.hn.this.f1547a));
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, com.applovin.impl.es esVar) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Unable to resolve VAST wrapper. Server returned " + i);
            }
            com.applovin.impl.hn.this.a(i);
        }
    }
}
