package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class e1 extends com.applovin.impl.d1 {
    private final java.lang.String f;
    private final com.applovin.impl.sdk.ad.b g;
    private final java.util.List h;
    private final com.applovin.impl.u2 i;
    private final com.applovin.impl.e1.c j;
    private java.lang.StringBuffer k;
    private final java.lang.Object l;
    private final java.util.concurrent.ExecutorService m;
    private java.util.List n;

    public interface c {
        void a(java.lang.String str, boolean z);
    }

    public e1(java.lang.String str, com.applovin.impl.sdk.ad.b bVar, java.util.List list, com.applovin.impl.u2 u2Var, java.util.concurrent.ExecutorService executorService, com.applovin.impl.sdk.j jVar, com.applovin.impl.e1.c cVar) {
        super("AsyncTaskCacheHTMLResources", jVar);
        this.f = str;
        this.g = bVar;
        this.h = list;
        this.i = u2Var;
        this.m = executorService;
        this.j = cVar;
        this.k = new java.lang.StringBuffer(str);
        this.l = new java.lang.Object();
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean call() throws java.lang.InterruptedException {
        java.util.HashSet hashSetD;
        if (this.e.get()) {
            return java.lang.Boolean.FALSE;
        }
        if (android.text.TextUtils.isEmpty(this.f)) {
            a(this.f);
            return java.lang.Boolean.FALSE;
        }
        if (!((java.lang.Boolean) this.f700a.a(com.applovin.impl.sj.E0)).booleanValue()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f);
            return java.lang.Boolean.FALSE;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSetC = c();
        if (hashSetC != null) {
            hashSet.addAll(hashSetC);
        }
        if (((java.lang.Boolean) this.f700a.a(com.applovin.impl.sj.W4)).booleanValue() && (hashSetD = d()) != null) {
            hashSet.addAll(hashSetD);
        }
        this.n = new java.util.ArrayList(hashSet);
        if (this.e.get()) {
            return java.lang.Boolean.FALSE;
        }
        java.util.List list = this.n;
        if (list != null && !list.isEmpty()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Executing " + this.n.size() + " caching operations...");
            }
            this.m.invokeAll(this.n);
            if (((java.lang.Boolean) this.f700a.a(com.applovin.impl.sj.V0)).booleanValue()) {
                synchronized (this.l) {
                    a(this.k.toString());
                }
            } else {
                a(this.k.toString());
            }
            return java.lang.Boolean.TRUE;
        }
        a(this.f);
        return java.lang.Boolean.FALSE;
    }

    private void a(java.lang.String str) {
        com.applovin.impl.e1.c cVar;
        if (this.e.get() || (cVar = this.j) == null) {
            return;
        }
        cVar.a(str, false);
    }

    class a implements com.applovin.impl.f1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f742a;

        a(java.lang.String str) {
            this.f742a = str;
        }

        @Override // com.applovin.impl.f1.a
        public void a(android.net.Uri uri) {
            if (uri != null) {
                if (((java.lang.Boolean) com.applovin.impl.e1.this.f700a.a(com.applovin.impl.sj.V0)).booleanValue()) {
                    synchronized (com.applovin.impl.e1.this.l) {
                        com.applovin.impl.sdk.utils.StringUtils.replaceAll(com.applovin.impl.e1.this.k, this.f742a, uri.toString());
                    }
                } else {
                    com.applovin.impl.sdk.utils.StringUtils.replaceAll(com.applovin.impl.e1.this.k, this.f742a, uri.toString());
                }
                com.applovin.impl.e1.this.g.a(uri);
                com.applovin.impl.e1.this.i.d();
                return;
            }
            com.applovin.impl.sdk.n nVar = com.applovin.impl.e1.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.e1 e1Var = com.applovin.impl.e1.this;
                e1Var.c.a(e1Var.b, "Failed to cache JavaScript resource " + this.f742a);
            }
            if (com.applovin.impl.e1.this.j != null) {
                com.applovin.impl.e1.this.j.a(com.applovin.impl.e1.this.f, true);
            }
            com.applovin.impl.e1.this.i.c();
        }
    }

    private java.util.HashSet d() {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : com.applovin.impl.sdk.utils.StringUtils.getRegexMatches(com.applovin.impl.sdk.utils.StringUtils.match(this.f, (java.lang.String) this.f700a.a(com.applovin.impl.sj.Y4)), 1)) {
            if (this.e.get()) {
                return null;
            }
            if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "Skip caching of non-resource " + str);
                }
            } else {
                hashSet.add(new com.applovin.impl.f1(str, this.g, java.util.Collections.emptyList(), false, this.i, this.f700a, new com.applovin.impl.e1.a(str)));
            }
        }
        return hashSet;
    }

    private java.util.HashSet c() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Collection collectionE = e();
        for (java.lang.String str : this.h) {
            int iIndexOf = 0;
            int i = 0;
            while (iIndexOf < this.f.length()) {
                if (this.e.get()) {
                    return null;
                }
                iIndexOf = this.f.indexOf(str, i);
                if (iIndexOf == -1) {
                    break;
                }
                int length = this.f.length();
                int i2 = iIndexOf;
                while (!collectionE.contains(java.lang.Character.valueOf(this.f.charAt(i2))) && i2 < length) {
                    i2++;
                }
                if (i2 > iIndexOf && i2 != length) {
                    java.lang.String strSubstring = this.f.substring(str.length() + iIndexOf, i2);
                    if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strSubstring)) {
                        if (this.g.M0() && this.g.Q().equals(str + strSubstring)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.c.a(this.b, "Postponing caching for \"" + strSubstring + "\" video resource");
                            }
                        } else {
                            java.lang.String str2 = str + strSubstring;
                            hashSet.add(new com.applovin.impl.f1(str2, this.g, java.util.Arrays.asList(str), true, this.i, this.f700a, new com.applovin.impl.e1.b(str2, str, strSubstring)));
                        }
                    } else if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Skip caching of non-resource " + strSubstring);
                    }
                    i = i2;
                } else {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.b(this.b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
            }
        }
        return hashSet;
    }

    class b implements com.applovin.impl.f1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f743a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.lang.String c;

        b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f743a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // com.applovin.impl.f1.a
        public void a(android.net.Uri uri) {
            if (uri == null) {
                if (com.applovin.impl.e1.this.g.X().contains(this.b + this.c) && com.applovin.impl.e1.this.j != null) {
                    com.applovin.impl.e1.this.j.a(com.applovin.impl.e1.this.f, true);
                }
                com.applovin.impl.e1.this.i.c();
                return;
            }
            if (((java.lang.Boolean) com.applovin.impl.e1.this.f700a.a(com.applovin.impl.sj.V0)).booleanValue()) {
                synchronized (com.applovin.impl.e1.this.l) {
                    com.applovin.impl.sdk.utils.StringUtils.replaceAll(com.applovin.impl.e1.this.k, this.f743a, uri.toString());
                }
            } else {
                com.applovin.impl.sdk.utils.StringUtils.replaceAll(com.applovin.impl.e1.this.k, this.f743a, uri.toString());
            }
            com.applovin.impl.e1.this.g.a(uri);
            com.applovin.impl.e1.this.i.d();
        }
    }

    private java.util.Collection e() {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (char c2 : ((java.lang.String) this.f700a.a(com.applovin.impl.sj.D0)).toCharArray()) {
            hashSet.add(java.lang.Character.valueOf(c2));
        }
        hashSet.add(java.lang.Character.valueOf(kotlin.text.Typography.quote));
        return hashSet;
    }
}
