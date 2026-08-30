package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
class cn extends com.applovin.impl.yl {
    private final com.applovin.impl.eq h;
    private final com.applovin.sdk.AppLovinAdLoadListener i;

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Rendering VAST ad...");
        }
        int size = this.h.a().size();
        java.util.HashSet hashSet = new java.util.HashSet(size);
        java.util.HashSet hashSet2 = new java.util.HashSet(size);
        java.lang.String strA = "";
        com.applovin.impl.jq jqVarA = null;
        com.applovin.impl.nq nqVarA = null;
        com.applovin.impl.dq dqVarA = null;
        com.applovin.impl.cq cqVarA = null;
        java.lang.String strA2 = "";
        for (com.applovin.impl.es esVar : this.h.a()) {
            com.applovin.impl.es esVarB = esVar.b(com.applovin.impl.mq.b(esVar) ? "Wrapper" : "InLine");
            if (esVarB != null) {
                com.applovin.impl.es esVarB2 = esVarB.b("AdSystem");
                if (esVarB2 != null) {
                    jqVarA = com.applovin.impl.jq.a(esVarB2, jqVarA, this.f1547a);
                }
                strA = com.applovin.impl.mq.a(esVarB, "AdTitle", strA);
                strA2 = com.applovin.impl.mq.a(esVarB, "Description", strA2);
                com.applovin.impl.mq.a(esVarB.a("Impression"), hashSet, this.h, this.f1547a);
                com.applovin.impl.es esVarC = esVarB.c("ViewableImpression");
                if (esVarC != null) {
                    com.applovin.impl.mq.a(esVarC.a("Viewable"), hashSet, this.h, this.f1547a);
                }
                com.applovin.impl.es esVarB3 = esVarB.b("AdVerifications");
                if (esVarB3 != null) {
                    cqVarA = com.applovin.impl.cq.a(esVarB3, cqVarA, this.h, this.f1547a);
                }
                com.applovin.impl.mq.a(esVarB.a("Error"), hashSet2, this.h, this.f1547a);
                com.applovin.impl.es esVarC2 = esVarB.c("Creatives");
                if (esVarC2 != null) {
                    for (com.applovin.impl.es esVar2 : esVarC2.b()) {
                        com.applovin.impl.es esVarC3 = esVar2.c("Linear");
                        if (esVarC3 != null) {
                            nqVarA = com.applovin.impl.nq.a(esVarC3, nqVarA, this.h, this.f1547a);
                        } else {
                            com.applovin.impl.es esVarB4 = esVar2.b("CompanionAds");
                            if (esVarB4 != null) {
                                com.applovin.impl.es esVarB5 = esVarB4.b("Companion");
                                if (esVarB5 != null) {
                                    dqVarA = com.applovin.impl.dq.a(esVarB5, dqVarA, this.h, this.f1547a);
                                }
                            } else if (com.applovin.impl.sdk.n.a()) {
                                this.c.b(this.b, "Received and will skip rendering for an unidentified creative: " + esVar2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Did not find wrapper or inline response for node: " + esVar);
            }
        }
        com.applovin.impl.aq aqVarA = new com.applovin.impl.aq.b().a(this.f1547a).a(this.h.b()).b(this.h.e()).a(this.h.c()).b(strA).a(strA2).a(jqVarA).a(nqVarA).a(dqVarA).a(cqVarA).b(hashSet).a(cqVarA).a(hashSet2).a();
        com.applovin.impl.fq fqVarC = com.applovin.impl.mq.c(aqVarA);
        if (fqVarC != null) {
            com.applovin.impl.mq.a(this.h, this.i, fqVarC, -6, this.f1547a);
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Finished rendering VAST ad: " + aqVarA);
        }
        aqVarA.getAdEventTracker().e();
        this.f1547a.i0().a((com.applovin.impl.yl) new com.applovin.impl.dm(aqVarA, this.f1547a, this.i), com.applovin.impl.tm.b.CACHING);
    }

    cn(com.applovin.impl.eq eqVar, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskRenderVastAd", jVar);
        this.i = appLovinAdLoadListener;
        this.h = eqVar;
    }
}
