package com.five_corp.ad.internal.logger;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.five_corp.ad.internal.G f1946a = null;

    public final void a(int i, java.lang.String str) {
        com.five_corp.ad.internal.G g = this.f1946a;
        if (g != null) {
            g.d.a(new com.five_corp.ad.internal.bgtask.j(new com.five_corp.ad.internal.logger.b(i, str), g.f1785a, g.c));
        }
    }

    public final void a(java.lang.Throwable th) {
        a(6, th + " - " + android.util.Log.getStackTraceString(th));
    }

    public final void a(com.five_corp.ad.internal.G g) {
        this.f1946a = g;
    }
}
