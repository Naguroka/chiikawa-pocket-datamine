package com.applovin.impl.sdk.network;

/* JADX INFO: loaded from: classes3.dex */
public class e extends com.applovin.impl.sdk.network.a {
    private java.lang.String s;
    private boolean t;

    public static class a extends com.applovin.impl.sdk.network.a.C0055a {
        private java.lang.String r;
        private boolean s;

        public a(com.applovin.impl.sdk.j jVar) {
            super(jVar);
            this.h = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.K2)).intValue();
            this.i = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.J2)).intValue();
            this.j = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.T2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a a(java.lang.String str) {
            this.c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a b(int i) {
            this.j = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a b(java.lang.String str) {
            this.b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a c(java.lang.String str) {
            this.f1317a = str;
            return this;
        }

        public com.applovin.impl.sdk.network.e.a h(boolean z) {
            this.s = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a b(boolean z) {
            this.p = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a b(java.util.Map map) {
            this.d = map;
            return this;
        }

        public com.applovin.impl.sdk.network.e.a e(java.lang.String str) {
            this.r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a c(int i) {
            this.i = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a a(boolean z) {
            this.n = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a a(java.util.Map map) {
            this.e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a a(int i) {
            this.h = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a a(com.applovin.impl.vi.a aVar) {
            this.q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a a(org.json.JSONObject jSONObject) {
            this.f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e.a a(java.lang.Object obj) {
            this.g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0055a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.sdk.network.e a() {
            return new com.applovin.impl.sdk.network.e(this);
        }
    }

    protected e(com.applovin.impl.sdk.network.e.a aVar) {
        super(aVar);
        this.s = aVar.r;
        this.t = aVar.s;
    }

    public static com.applovin.impl.sdk.network.e.a b(com.applovin.impl.sdk.j jVar) {
        return new com.applovin.impl.sdk.network.e.a(jVar);
    }

    public java.lang.String s() {
        return this.s;
    }

    public boolean t() {
        return this.s != null;
    }

    public boolean u() {
        return this.t;
    }
}
