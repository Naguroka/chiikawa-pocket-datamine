package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zm extends com.applovin.impl.yl {
    private final com.applovin.sdk.AppLovinAdLoadListener h;
    private final com.applovin.impl.zm.a i;

    zm(com.applovin.impl.eq eqVar, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessVastResponse", jVar);
        if (eqVar != null) {
            this.h = appLovinAdLoadListener;
            this.i = (com.applovin.impl.zm.a) eqVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("No context specified.");
    }

    protected com.applovin.impl.es b(java.lang.String str) {
        try {
            return com.applovin.impl.fs.a(str, this.f1547a);
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Failed to process VAST response", th);
            }
            a(com.applovin.impl.fq.XML_PARSING);
            return null;
        }
    }

    protected void c(java.lang.String str) {
        if (str == null) {
            return;
        }
        java.util.Iterator<java.lang.String> it = com.applovin.impl.sdk.utils.StringUtils.getRegexMatches(com.applovin.impl.sdk.utils.StringUtils.match(str, (java.lang.String) this.f1547a.a(com.applovin.impl.sj.Z4)), 1).iterator();
        while (it.hasNext()) {
            com.applovin.impl.es esVarB = b("<VAST>" + it.next() + "</VAST>");
            if (esVarB != null) {
                this.i.a(esVarB);
            }
        }
    }

    void a(com.applovin.impl.es esVar) {
        int iD = this.i.d();
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Finished parsing XML at depth " + iD);
        }
        this.i.a(esVar);
        if (com.applovin.impl.mq.b(esVar)) {
            int iIntValue = ((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.G4)).intValue();
            if (iD < iIntValue) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "VAST response is wrapper. Resolving...");
                }
                this.f1547a.i0().a(new com.applovin.impl.hn(this.i, this.h, this.f1547a));
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Reached beyond max wrapper depth of " + iIntValue);
            }
            a(com.applovin.impl.fq.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (com.applovin.impl.mq.a(esVar)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "VAST response is inline. Rendering ad...");
            }
            this.f1547a.i0().a(new com.applovin.impl.cn(this.i, this.h, this.f1547a));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "VAST response is an error");
        }
        a(com.applovin.impl.fq.NO_WRAPPER_RESPONSE);
    }

    public static com.applovin.impl.zm a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        return new com.applovin.impl.zm.c(new com.applovin.impl.zm.a(jSONObject, jSONObject2, jVar), appLovinAdLoadListener, jVar);
    }

    public static com.applovin.impl.zm a(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        return new com.applovin.impl.zm.b(str, new com.applovin.impl.zm.a(jSONObject, jSONObject2, jVar), appLovinAdLoadListener, jVar);
    }

    public static com.applovin.impl.zm a(com.applovin.impl.es esVar, com.applovin.impl.eq eqVar, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        return new com.applovin.impl.zm.d(esVar, eqVar, appLovinAdLoadListener, jVar);
    }

    void a(com.applovin.impl.fq fqVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "Failed to process VAST response due to VAST error code " + fqVar);
        }
        com.applovin.impl.mq.a(this.i, this.h, fqVar, -6, this.f1547a);
    }

    private static final class c extends com.applovin.impl.zm {
        private final org.json.JSONObject j;

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Processing SDK JSON response...");
            }
            java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(this.j, "xml", null);
            if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b(this.b, "No VAST response received.");
                }
                a(com.applovin.impl.fq.NO_WRAPPER_RESPONSE);
            } else {
                if (string.length() >= ((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.F4)).intValue()) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.b(this.b, "VAST response is over max length");
                    }
                    a(com.applovin.impl.fq.XML_PARSING);
                    return;
                }
                com.applovin.impl.es esVarB = b(string);
                if (esVarB != null) {
                    a(esVarB);
                    return;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b(this.b, "Unable to process XML: " + string);
                }
                c(string);
                a(com.applovin.impl.fq.XML_PARSING);
            }
        }

        c(com.applovin.impl.eq eqVar, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
            super(eqVar, appLovinAdLoadListener, jVar);
            this.j = eqVar.b();
        }
    }

    private static final class b extends com.applovin.impl.zm {
        private final java.lang.String j;

        b(java.lang.String str, com.applovin.impl.eq eqVar, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
            super(eqVar, appLovinAdLoadListener, jVar);
            this.j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.es esVarB = b(this.j);
            if (esVarB != null) {
                a(esVarB);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Unable to process XML: " + this.j);
            }
            c(this.j);
            a(com.applovin.impl.fq.XML_PARSING);
        }
    }

    private static final class d extends com.applovin.impl.zm {
        private final com.applovin.impl.es j;

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Processing VAST Wrapper response...");
            }
            a(this.j);
        }

        d(com.applovin.impl.es esVar, com.applovin.impl.eq eqVar, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
            super(eqVar, appLovinAdLoadListener, jVar);
            if (esVar == null) {
                throw new java.lang.IllegalArgumentException("No response specified.");
            }
            if (eqVar == null) {
                throw new java.lang.IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener != null) {
                this.j = esVar;
                return;
            }
            throw new java.lang.IllegalArgumentException("No callback specified.");
        }
    }

    private static final class a extends com.applovin.impl.eq {
        a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
            super(jSONObject, jSONObject2, jVar);
        }

        void a(com.applovin.impl.es esVar) {
            if (esVar != null) {
                this.b.add(esVar);
                return;
            }
            throw new java.lang.IllegalArgumentException("No aggregated vast response specified");
        }
    }
}
