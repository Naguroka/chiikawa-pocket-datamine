package com.iab.omid.library.ironsrc.internal;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    private static com.iab.omid.library.ironsrc.internal.c c = new com.iab.omid.library.ironsrc.internal.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList<com.iab.omid.library.ironsrc.adsession.a> f2425a = new java.util.ArrayList<>();
    private final java.util.ArrayList<com.iab.omid.library.ironsrc.adsession.a> b = new java.util.ArrayList<>();

    private c() {
    }

    public static com.iab.omid.library.ironsrc.internal.c c() {
        return c;
    }

    public java.util.Collection<com.iab.omid.library.ironsrc.adsession.a> a() {
        return java.util.Collections.unmodifiableCollection(this.b);
    }

    public void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        this.f2425a.add(aVar);
    }

    public java.util.Collection<com.iab.omid.library.ironsrc.adsession.a> b() {
        return java.util.Collections.unmodifiableCollection(this.f2425a);
    }

    public void b(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean zD = d();
        this.f2425a.remove(aVar);
        this.b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        com.iab.omid.library.ironsrc.internal.h.c().e();
    }

    public void c(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean zD = d();
        this.b.add(aVar);
        if (zD) {
            return;
        }
        com.iab.omid.library.ironsrc.internal.h.c().d();
    }

    public boolean d() {
        return this.b.size() > 0;
    }
}
