package com.iab.omid.library.ironsrc;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2421a;

    private void b(android.content.Context context) {
        com.iab.omid.library.ironsrc.utils.g.a(context, "Application Context cannot be null");
    }

    java.lang.String a() {
        return "1.4.2-Ironsrc";
    }

    void a(android.content.Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        com.iab.omid.library.ironsrc.internal.h.c().a(context);
        com.iab.omid.library.ironsrc.internal.b.g().a(context);
        com.iab.omid.library.ironsrc.utils.a.a(context);
        com.iab.omid.library.ironsrc.utils.c.a(context);
        com.iab.omid.library.ironsrc.utils.e.a(context);
        com.iab.omid.library.ironsrc.internal.f.b().a(context);
        com.iab.omid.library.ironsrc.internal.a.a().a(context);
    }

    void a(boolean z) {
        this.f2421a = z;
    }

    boolean b() {
        return this.f2421a;
    }

    void c() {
        com.iab.omid.library.ironsrc.utils.g.a();
        com.iab.omid.library.ironsrc.internal.a.a().d();
    }
}
