package com.iab.omid.library.ironsrc.internal;

/* JADX INFO: loaded from: classes5.dex */
public class f {
    private static com.iab.omid.library.ironsrc.internal.f b = new com.iab.omid.library.ironsrc.internal.f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f2428a;

    private f() {
    }

    public static com.iab.omid.library.ironsrc.internal.f b() {
        return b;
    }

    public android.content.Context a() {
        return this.f2428a;
    }

    public void a(android.content.Context context) {
        this.f2428a = context != null ? context.getApplicationContext() : null;
    }
}
