package com.iab.omid.library.applovin.internal;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    private static com.iab.omid.library.applovin.internal.c c = new com.iab.omid.library.applovin.internal.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList<com.iab.omid.library.applovin.adsession.a> f2355a = new java.util.ArrayList<>();
    private final java.util.ArrayList<com.iab.omid.library.applovin.adsession.a> b = new java.util.ArrayList<>();

    private c() {
    }

    public static com.iab.omid.library.applovin.internal.c c() {
        return c;
    }

    public java.util.Collection<com.iab.omid.library.applovin.adsession.a> a() {
        return java.util.Collections.unmodifiableCollection(this.b);
    }

    public java.util.Collection<com.iab.omid.library.applovin.adsession.a> b() {
        return java.util.Collections.unmodifiableCollection(this.f2355a);
    }

    public boolean d() {
        return this.b.size() > 0;
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.f2355a.add(aVar);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean zD = d();
        this.f2355a.remove(aVar);
        this.b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        com.iab.omid.library.applovin.internal.i.c().e();
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean zD = d();
        this.b.add(aVar);
        if (zD) {
            return;
        }
        com.iab.omid.library.applovin.internal.i.c().d();
    }
}
