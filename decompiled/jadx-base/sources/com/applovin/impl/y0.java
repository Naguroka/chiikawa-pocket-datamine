package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class y0 implements com.applovin.impl.km.b, com.applovin.impl.im.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1523a;
    private final com.applovin.impl.y0.a b;
    private com.applovin.impl.w0 c;
    private java.lang.String d;

    public interface a {
        void a(com.applovin.impl.w0 w0Var, java.lang.String str);

        void a(com.applovin.impl.y0.b bVar, java.lang.String str);
    }

    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public y0(com.applovin.impl.sdk.j jVar, com.applovin.impl.y0.a aVar) {
        this.f1523a = jVar;
        this.b = aVar;
    }

    @Override // com.applovin.impl.im.b
    public void a(com.applovin.impl.y0.b bVar, java.lang.String str) {
        this.b.a(bVar, str);
    }

    @Override // com.applovin.impl.im.b
    public void a(java.lang.String str, java.lang.String str2) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArrSplit = str.split("\n");
        int length = strArrSplit.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            com.applovin.impl.x0 x0Var = new com.applovin.impl.x0(strArrSplit[i2], i);
            if (x0Var.h()) {
                java.lang.String strB = x0Var.b();
                java.util.List arrayList2 = map.containsKey(strB) ? (java.util.List) map.get(strB) : new java.util.ArrayList();
                if (arrayList2 != null) {
                    arrayList2.add(x0Var);
                    map.put(strB, arrayList2);
                }
            } else {
                arrayList.add(x0Var);
            }
            i2++;
            i = i3;
        }
        this.c = new com.applovin.impl.w0(map, arrayList);
        this.d = str2;
        this.f1523a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1523a.I().a("AppAdsTxtService", "app-ads.txt fetched: " + this.c);
        }
        this.b.a(this.c, str2);
    }

    @Override // com.applovin.impl.km.b
    public void a(com.applovin.impl.y0.b bVar) {
        this.b.a(bVar, (java.lang.String) null);
    }

    @Override // com.applovin.impl.km.b
    public void a(java.lang.String str) {
        this.f1523a.i0().a(new com.applovin.impl.im(this.f1523a, str, this));
    }

    public void a() {
        com.applovin.impl.w0 w0Var = this.c;
        if (w0Var != null) {
            this.b.a(w0Var, this.d);
        } else {
            this.f1523a.i0().a(new com.applovin.impl.km(this.f1523a, this));
        }
    }
}
