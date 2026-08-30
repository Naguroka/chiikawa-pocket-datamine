package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class v3 extends com.applovin.impl.yl {
    private final java.lang.String h;
    private final com.applovin.impl.sdk.network.a i;

    public v3(java.lang.String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
        super("CommunicatorRequestTask", jVar, str);
        this.h = str;
        this.i = aVar;
    }

    class a extends com.applovin.impl.dn {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, boolean z) {
            super(aVar, jVar, z);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, org.json.JSONObject jSONObject) {
            this.f1547a.q().a(com.applovin.impl.v3.this.h, com.applovin.impl.v3.this.i.f(), i, jSONObject, str2, false);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, org.json.JSONObject jSONObject, int i) {
            this.f1547a.q().a(com.applovin.impl.v3.this.h, com.applovin.impl.v3.this.i.f(), i, jSONObject, null, true);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1547a.i0().a(new com.applovin.impl.v3.a(this.i, this.f1547a, d()));
    }
}
