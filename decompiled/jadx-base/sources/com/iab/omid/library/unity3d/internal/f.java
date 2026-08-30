package com.iab.omid.library.unity3d.internal;

/* JADX INFO: loaded from: classes5.dex */
public class f {
    private static com.iab.omid.library.unity3d.internal.f b = new com.iab.omid.library.unity3d.internal.f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f2461a;

    private f() {
    }

    public static com.iab.omid.library.unity3d.internal.f b() {
        return b;
    }

    public android.content.Context a() {
        return this.f2461a;
    }

    public void a(android.content.Context context) {
        this.f2461a = context != null ? context.getApplicationContext() : null;
    }
}
