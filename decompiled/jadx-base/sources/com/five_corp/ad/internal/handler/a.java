package com.five_corp.ad.internal.handler;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f1905a;
    public final com.five_corp.ad.internal.B b;
    public final com.five_corp.ad.internal.ad.v c;
    public final com.five_corp.ad.internal.logger.a d;

    public a(android.content.Context context, com.five_corp.ad.internal.B b, com.five_corp.ad.internal.ad.v vVar, com.five_corp.ad.internal.logger.a aVar) {
        this.f1905a = context;
        this.b = b;
        this.c = vVar;
        this.d = aVar;
    }

    public final void a(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        intent.setFlags(268435456);
        this.f1905a.startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b0  */
    public final void a(int i, double d) {
        java.lang.String strA;
        this.b.d();
        int iA = com.five_corp.ad.e.a(this.c.f1834a);
        if (iA != 0) {
            if (iA == 1) {
                this.d.a(4, "REDIRECT_IN_WEBVIEW feature is no more supported.");
                com.five_corp.ad.internal.B b = this.b;
                a(b.d.a(b.a(i, d, false)));
            } else if (iA == 2) {
                com.five_corp.ad.internal.B b2 = this.b;
                b2.c.a(b2.a(i, d, true));
            } else if (iA == 3) {
                java.lang.String str = this.c.d;
                if (str == null) {
                    com.five_corp.ad.internal.B b3 = this.b;
                    strA = b3.d.a(b3.a(i, d, false));
                } else {
                    com.five_corp.ad.internal.B b4 = this.b;
                    long j = i;
                    b4.c.a(b4.a(j, d, true));
                    try {
                        this.f1905a.startActivity(android.content.Intent.parseUri(str, 1));
                    } catch (java.lang.Exception e) {
                        this.d.a(5, "DetailedErrorCode: " + com.five_corp.ad.internal.t.W3.name() + ", information: " + java.lang.String.valueOf("failed to open appUrl: " + str + ", fallback to redirect in browser...") + ", exception: " + android.util.Log.getStackTraceString(e) + ", cause: null");
                        com.five_corp.ad.internal.B b5 = this.b;
                        strA = b5.d.a(b5.a(j, d, false));
                        a(strA);
                    }
                }
                a(strA);
            } else if (iA == 4) {
                com.five_corp.ad.internal.B b6 = this.b;
                b6.c.a(b6.a(i, d, true));
            }
        } else if (this.c.b != null) {
            com.five_corp.ad.internal.B b7 = this.b;
            long j2 = i;
            b7.c.a(b7.a(j2, d, true));
            try {
                a(this.c.b);
            } catch (android.content.ActivityNotFoundException e2) {
                if (this.c.c == null) {
                    throw e2;
                }
                this.b.a(21, j2, d, null, null);
                a(this.c.c);
            }
        } else {
            com.five_corp.ad.internal.B b8 = this.b;
            a(b8.d.a(b8.a(i, d, false)));
        }
        this.b.c();
    }
}
