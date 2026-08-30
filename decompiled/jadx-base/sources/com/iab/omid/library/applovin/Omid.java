package com.iab.omid.library.applovin;

/* JADX INFO: loaded from: classes5.dex */
public final class Omid {
    private static com.iab.omid.library.applovin.b INSTANCE = new com.iab.omid.library.applovin.b();

    private Omid() {
    }

    public static void activate(android.content.Context context) {
        INSTANCE.a(context.getApplicationContext());
    }

    public static java.lang.String getVersion() {
        return INSTANCE.a();
    }

    public static boolean isActive() {
        return INSTANCE.b();
    }

    public static void updateLastActivity() {
        INSTANCE.c();
    }
}
