package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class im extends com.applovin.impl.yl {
    private final com.applovin.impl.im.b h;
    private final java.lang.String i;
    private java.lang.String j;

    public interface b {
        void a(com.applovin.impl.y0.b bVar, java.lang.String str);

        void a(java.lang.String str, java.lang.String str2);
    }

    public im(com.applovin.impl.sdk.j jVar, java.lang.String str, com.applovin.impl.im.b bVar) {
        super("TaskFetchAppAdsContent", jVar);
        this.i = str;
        this.h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(android.net.Uri.parse(this.i).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            java.lang.String str = (java.lang.String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        java.lang.String strJoin = android.text.TextUtils.join(".", arrayList);
        android.net.Uri uriBuild = new android.net.Uri.Builder().scheme("https").authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f1547a).c("GET").b(uriBuild.toString()).a(new android.net.Uri.Builder().scheme(androidx.webkit.ProxyConfig.MATCH_HTTP).authority(strJoin).appendPath("app-ads.txt").build().toString()).a((java.lang.Object) "").a(false).a();
        this.j = uriBuild.toString();
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Looking up app-ads.txt at " + this.j);
        }
        this.f1547a.i0().a(new com.applovin.impl.im.a(aVarA, this.f1547a));
    }

    class a extends com.applovin.impl.dn {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, java.lang.String str2, int i) {
            if (android.text.TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b(this.b, "No app-ads.txt found");
                }
                com.applovin.impl.im.this.h.a(com.applovin.impl.y0.b.APPADSTXT_NOT_FOUND, com.applovin.impl.im.this.j);
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "Found app-ads.txt");
                }
                com.applovin.impl.im.this.h.a(str2, com.applovin.impl.im.this.j);
            }
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i);
            }
            com.applovin.impl.im.this.h.a(com.applovin.impl.y0.b.APPADSTXT_NOT_FOUND, com.applovin.impl.im.this.j);
        }
    }
}
