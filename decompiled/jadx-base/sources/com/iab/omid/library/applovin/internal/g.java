package com.iab.omid.library.applovin.internal;

/* JADX INFO: loaded from: classes5.dex */
public class g {
    private static com.iab.omid.library.applovin.internal.g b = new com.iab.omid.library.applovin.internal.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f2359a;

    private g() {
    }

    public static com.iab.omid.library.applovin.internal.g b() {
        return b;
    }

    public android.content.Context a() {
        return this.f2359a;
    }

    public void a(android.content.Context context) {
        this.f2359a = context != null ? context.getApplicationContext() : null;
    }
}
