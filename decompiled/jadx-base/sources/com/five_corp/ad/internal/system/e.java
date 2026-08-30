package com.five_corp.ad.internal.system;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f2068a;

    static {
        com.five_corp.ad.internal.system.e.class.toString();
    }

    public e(android.content.Context context) {
        this.f2068a = context;
    }

    public final boolean a() {
        try {
            return ((android.net.ConnectivityManager) this.f2068a.getSystemService("connectivity")).isActiveNetworkMetered();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
