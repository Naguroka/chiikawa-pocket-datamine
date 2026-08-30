package com.iab.omid.library.bytedance2;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2386a;

    private void b(android.content.Context context) {
        com.iab.omid.library.bytedance2.utils.g.a(context, "Application Context cannot be null");
    }

    java.lang.String a() {
        return "1.4.12-Bytedance2";
    }

    void a(android.content.Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        com.iab.omid.library.bytedance2.internal.i.c().a(context);
        com.iab.omid.library.bytedance2.internal.b.g().a(context);
        com.iab.omid.library.bytedance2.utils.a.a(context);
        com.iab.omid.library.bytedance2.utils.c.a(context);
        com.iab.omid.library.bytedance2.utils.e.a(context);
        com.iab.omid.library.bytedance2.internal.g.b().a(context);
        com.iab.omid.library.bytedance2.internal.a.a().a(context);
    }

    void a(boolean z) {
        this.f2386a = z;
    }

    boolean b() {
        return this.f2386a;
    }

    void c() {
        com.iab.omid.library.bytedance2.utils.g.a();
        com.iab.omid.library.bytedance2.internal.a.a().d();
    }
}
