package com.json;

/* JADX INFO: loaded from: classes5.dex */
public final class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2533a;
    private boolean b;
    private java.lang.String c;
    private com.json.qf d;
    private boolean e;
    private java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f2534a;
        private com.json.qf d;
        private boolean b = false;
        private java.lang.String c = "POST";
        private boolean e = false;
        private java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> f = new java.util.ArrayList<>();

        public a(java.lang.String str) {
            this.f2534a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f2534a = str;
        }

        public com.ironsource.bc.a a(android.util.Pair<java.lang.String, java.lang.String> pair) {
            this.f.add(pair);
            return this;
        }

        public com.ironsource.bc.a a(com.json.qf qfVar) {
            this.d = qfVar;
            return this;
        }

        public com.ironsource.bc.a a(java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) {
            this.f.addAll(list);
            return this;
        }

        public com.ironsource.bc.a a(boolean z) {
            this.e = z;
            return this;
        }

        public com.json.bc a() {
            return new com.json.bc(this);
        }

        public com.ironsource.bc.a b() {
            this.c = "GET";
            return this;
        }

        public com.ironsource.bc.a b(boolean z) {
            this.b = z;
            return this;
        }

        public com.ironsource.bc.a c() {
            this.c = "POST";
            return this;
        }
    }

    bc(com.ironsource.bc.a aVar) {
        this.e = false;
        this.f2533a = aVar.f2534a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        if (aVar.f != null) {
            this.f = new java.util.ArrayList<>(aVar.f);
        }
    }

    public boolean a() {
        return this.b;
    }

    public java.lang.String b() {
        return this.f2533a;
    }

    public com.json.qf c() {
        return this.d;
    }

    public java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> d() {
        return new java.util.ArrayList<>(this.f);
    }

    public java.lang.String e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }
}
