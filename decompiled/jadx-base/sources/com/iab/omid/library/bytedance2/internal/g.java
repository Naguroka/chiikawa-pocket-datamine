package com.iab.omid.library.bytedance2.internal;

/* JADX INFO: loaded from: classes5.dex */
public class g {
    private static com.iab.omid.library.bytedance2.internal.g b = new com.iab.omid.library.bytedance2.internal.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f2394a;

    private g() {
    }

    public static com.iab.omid.library.bytedance2.internal.g b() {
        return b;
    }

    public android.content.Context a() {
        return this.f2394a;
    }

    public void a(android.content.Context context) {
        this.f2394a = context != null ? context.getApplicationContext() : null;
    }
}
