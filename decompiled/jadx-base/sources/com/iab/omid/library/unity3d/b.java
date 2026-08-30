package com.iab.omid.library.unity3d;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2454a;

    private void b(android.content.Context context) {
        com.iab.omid.library.unity3d.utils.g.a(context, "Application Context cannot be null");
    }

    java.lang.String a() {
        return "1.4.9-Unity3d";
    }

    void a(android.content.Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        com.iab.omid.library.unity3d.internal.h.c().a(context);
        com.iab.omid.library.unity3d.internal.b.g().a(context);
        com.iab.omid.library.unity3d.utils.a.a(context);
        com.iab.omid.library.unity3d.utils.c.a(context);
        com.iab.omid.library.unity3d.utils.e.a(context);
        com.iab.omid.library.unity3d.internal.f.b().a(context);
        com.iab.omid.library.unity3d.internal.a.a().a(context);
    }

    void a(boolean z) {
        this.f2454a = z;
    }

    boolean b() {
        return this.f2454a;
    }

    void c() {
        com.iab.omid.library.unity3d.utils.g.a();
        com.iab.omid.library.unity3d.internal.a.a().d();
    }
}
