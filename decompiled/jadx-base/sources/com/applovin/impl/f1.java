package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class f1 extends com.applovin.impl.d1 {
    private final java.lang.String f;
    private final com.applovin.impl.sdk.ad.b g;
    private final java.util.List h;
    private final boolean i;
    private final com.applovin.impl.u2 j;
    private final com.applovin.impl.sdk.j k;
    private final com.applovin.impl.f1.a l;

    public interface a {
        void a(android.net.Uri uri);
    }

    public f1(java.lang.String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.u2 u2Var, com.applovin.impl.sdk.j jVar, com.applovin.impl.f1.a aVar) {
        this(str, bVar, bVar.Y(), true, u2Var, jVar, aVar);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean call() {
        if (this.e.get()) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String strA = this.k.A().a(a(), this.f, this.g.getCachePrefix(), this.h, this.i, this.j, this.k.A().a(this.f, this.g));
        if (android.text.TextUtils.isEmpty(strA)) {
            a((android.net.Uri) null);
            return java.lang.Boolean.FALSE;
        }
        if (this.e.get()) {
            return java.lang.Boolean.FALSE;
        }
        java.io.File fileA = this.k.A().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((android.net.Uri) null);
            return java.lang.Boolean.FALSE;
        }
        if (this.e.get()) {
            return java.lang.Boolean.FALSE;
        }
        android.net.Uri uriFromFile = android.net.Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Unable to extract Uri from file");
            }
            a((android.net.Uri) null);
            return java.lang.Boolean.FALSE;
        }
        if (this.e.get()) {
            return java.lang.Boolean.FALSE;
        }
        a(uriFromFile);
        return java.lang.Boolean.TRUE;
    }

    public f1(java.lang.String str, com.applovin.impl.sdk.ad.b bVar, java.util.List list, boolean z, com.applovin.impl.u2 u2Var, com.applovin.impl.sdk.j jVar, com.applovin.impl.f1.a aVar) {
        super("AsyncTaskCacheResource", jVar);
        this.f = str;
        this.g = bVar;
        this.h = list;
        this.i = z;
        this.j = u2Var;
        this.k = jVar;
        this.l = aVar;
    }

    private void a(android.net.Uri uri) {
        com.applovin.impl.f1.a aVar;
        if (this.e.get() || (aVar = this.l) == null) {
            return;
        }
        aVar.a(uri);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f.equals(((com.applovin.impl.f1) obj).f);
    }

    public int hashCode() {
        java.lang.String str = this.f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
