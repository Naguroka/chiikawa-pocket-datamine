package com.iab.omid.library.bytedance2.internal;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    private static com.iab.omid.library.bytedance2.internal.c c = new com.iab.omid.library.bytedance2.internal.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList<com.iab.omid.library.bytedance2.adsession.a> f2390a = new java.util.ArrayList<>();
    private final java.util.ArrayList<com.iab.omid.library.bytedance2.adsession.a> b = new java.util.ArrayList<>();

    private c() {
    }

    public static com.iab.omid.library.bytedance2.internal.c c() {
        return c;
    }

    public java.util.Collection<com.iab.omid.library.bytedance2.adsession.a> a() {
        return java.util.Collections.unmodifiableCollection(this.b);
    }

    public void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        this.f2390a.add(aVar);
    }

    public java.util.Collection<com.iab.omid.library.bytedance2.adsession.a> b() {
        return java.util.Collections.unmodifiableCollection(this.f2390a);
    }

    public void b(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean zD = d();
        this.f2390a.remove(aVar);
        this.b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        com.iab.omid.library.bytedance2.internal.i.c().e();
    }

    public void c(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean zD = d();
        this.b.add(aVar);
        if (zD) {
            return;
        }
        com.iab.omid.library.bytedance2.internal.i.c().d();
    }

    public boolean d() {
        return this.b.size() > 0;
    }
}
