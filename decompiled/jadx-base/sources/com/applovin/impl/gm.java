package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class gm extends com.applovin.impl.yl {
    private final com.applovin.impl.sdk.network.e h;
    private final com.applovin.sdk.AppLovinPostbackListener i;
    private final com.applovin.impl.tm.b j;

    public gm(com.applovin.impl.sdk.network.e eVar, com.applovin.impl.tm.b bVar, com.applovin.impl.sdk.j jVar, com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", jVar);
        if (eVar != null) {
            this.h = eVar;
            this.i = appLovinPostbackListener;
            this.j = bVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("No request specified");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(this.h.f())) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.d(this.b, "Requested URL is not valid; nothing to do...");
            }
            com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener = this.i;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.h.f(), com.applovin.sdk.AppLovinErrorCodes.INVALID_URL);
                return;
            }
            return;
        }
        if (this.h.u()) {
            b().p0().a(this.h, new com.applovin.impl.gm.a());
        } else {
            e();
        }
    }

    class a implements com.applovin.sdk.AppLovinPostbackListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(java.lang.String str) {
            if (com.applovin.impl.gm.this.i != null) {
                com.applovin.impl.gm.this.i.onPostbackSuccess(com.applovin.impl.gm.this.h.f());
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(java.lang.String str, int i) {
            com.applovin.impl.gm.this.e();
        }
    }

    class b extends com.applovin.impl.dn {
        final java.lang.String n;

        b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
            this.n = com.applovin.impl.gm.this.h.f();
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, java.lang.Object obj, int i) {
            if (obj instanceof java.lang.String) {
                for (java.lang.String str2 : this.f1547a.c(com.applovin.impl.sj.o0)) {
                    if (str2.startsWith(str2)) {
                        java.lang.String str3 = (java.lang.String) obj;
                        if (android.text.TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
                                com.applovin.impl.e4.c(jSONObject, this.f1547a);
                                com.applovin.impl.e4.b(jSONObject, this.f1547a);
                                com.applovin.impl.e4.a(jSONObject, this.f1547a);
                                break;
                            } catch (org.json.JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (com.applovin.impl.gm.this.i != null) {
                com.applovin.impl.gm.this.i.onPostbackSuccess(this.n);
            }
            if (com.applovin.impl.gm.this.h.t()) {
                this.f1547a.q().a(com.applovin.impl.gm.this.h.s(), this.n, i, obj, null, true);
            }
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, java.lang.Object obj) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Failed to dispatch postback. Error code: " + i + " URL: " + this.n);
            }
            if (com.applovin.impl.gm.this.i != null) {
                com.applovin.impl.gm.this.i.onPostbackFailure(this.n, i);
            }
            if (com.applovin.impl.gm.this.h.t()) {
                this.f1547a.q().a(com.applovin.impl.gm.this.h.s(), this.n, i, obj, str2, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        com.applovin.impl.gm.b bVar = new com.applovin.impl.gm.b(this.h, b());
        bVar.a(this.j);
        b().i0().a(bVar);
    }
}
