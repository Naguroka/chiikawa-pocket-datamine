package com.iab.omid.library.applovin;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2351a;

    private void b(android.content.Context context) {
        com.iab.omid.library.applovin.utils.g.a(context, "Application Context cannot be null");
    }

    java.lang.String a() {
        return "1.4.12-Applovin";
    }

    void c() {
        com.iab.omid.library.applovin.utils.g.a();
        com.iab.omid.library.applovin.internal.a.a().d();
    }

    void a(android.content.Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        com.iab.omid.library.applovin.internal.i.c().a(context);
        com.iab.omid.library.applovin.internal.b.g().a(context);
        com.iab.omid.library.applovin.utils.a.a(context);
        com.iab.omid.library.applovin.utils.c.a(context);
        com.iab.omid.library.applovin.utils.e.a(context);
        com.iab.omid.library.applovin.internal.g.b().a(context);
        com.iab.omid.library.applovin.internal.a.a().a(context);
    }

    boolean b() {
        return this.f2351a;
    }

    void a(boolean z) {
        this.f2351a = z;
    }
}
