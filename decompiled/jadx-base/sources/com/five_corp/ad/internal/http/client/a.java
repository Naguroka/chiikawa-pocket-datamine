package com.five_corp.ad.internal.http.client;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.ad.w f1920a;
    public final com.five_corp.ad.internal.http.client.b b;
    public android.os.HandlerThread c;
    public final android.os.Handler d;
    public final com.five_corp.ad.internal.http.connection.c e;
    public com.five_corp.ad.internal.http.connection.a f;

    public a(com.five_corp.ad.internal.ad.w wVar, com.five_corp.ad.internal.http.client.b bVar, com.five_corp.ad.internal.http.connection.c cVar) {
        this.f1920a = wVar;
        this.b = bVar;
        this.e = cVar;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("HttpDownloadClient for " + wVar.f1835a);
        this.c = handlerThread;
        handlerThread.start();
        this.d = new android.os.Handler(this.c.getLooper());
    }

    public final void a() {
        this.d.postAtFrontOfQueue(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.http.client.a$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        });
    }

    public final void b() {
        this.b.a();
        e();
    }

    public final void c() {
        this.d.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.http.client.a$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        });
    }

    public final void d() {
        byte[] bArr = new byte[8192];
        com.five_corp.ad.internal.util.f fVarA = this.f.a(bArr);
        if (!fVarA.f2085a) {
            this.b.c(fVarA.b);
            e();
            return;
        }
        int iIntValue = ((java.lang.Integer) fVarA.c).intValue();
        if (iIntValue < 0) {
            this.b.c();
            e();
        } else {
            this.b.a(bArr, iIntValue);
            c();
        }
    }

    public final void e() {
        com.five_corp.ad.internal.http.connection.a aVar = this.f;
        if (aVar != null) {
            java.io.InputStream inputStream = aVar.b;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception unused) {
                }
                aVar.b = null;
            }
            java.io.InputStream errorStream = aVar.f1922a.getErrorStream();
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            aVar.f1922a = null;
            this.f = null;
        }
        android.os.HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.c = null;
        }
    }

    public final void f() {
        this.d.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.http.client.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.g();
            }
        });
    }

    public final void g() {
        com.five_corp.ad.internal.s sVar;
        com.five_corp.ad.internal.s sVar2;
        com.five_corp.ad.internal.util.f fVarB = this.f.b();
        if (!fVarB.f2085a) {
            this.b.c(fVarB.b);
            e();
            return;
        }
        int iIntValue = ((java.lang.Integer) fVarB.c).intValue();
        if (iIntValue == 206) {
            java.lang.String headerField = this.f.f1922a.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE);
            java.util.regex.Pattern pattern = com.five_corp.ad.internal.http.client.c.f1921a;
            int iA = com.five_corp.ad.internal.http.client.c.a(headerField, pattern, 1);
            if (iA < 0) {
                sVar2 = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.o2, null, null, null);
            } else {
                int iA2 = com.five_corp.ad.internal.http.client.c.a(headerField, pattern, 2);
                if (iA2 < 0) {
                    sVar2 = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.p2, null, null, null);
                } else {
                    int iA3 = com.five_corp.ad.internal.http.client.c.a(headerField, com.five_corp.ad.internal.http.client.c.b, 1);
                    if (iA3 >= 0) {
                        this.b.a(iA, iA2, iA3);
                        c();
                        return;
                    }
                    sVar2 = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.q2, null, null, null);
                }
            }
            this.b.c(sVar2);
            e();
            return;
        }
        if (iIntValue == 416) {
            int iA4 = com.five_corp.ad.internal.http.client.c.a(this.f.f1922a.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE), com.five_corp.ad.internal.http.client.c.b, 1);
            if (iA4 < 0) {
                this.b.c(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.n2, null, null, null));
                e();
                return;
            } else {
                this.b.a(iA4);
                this.b.c();
                e();
                return;
            }
        }
        int i = iIntValue / 100;
        if (i == 2) {
            this.b.d();
            c();
            return;
        }
        if (i == 3) {
            sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.r2, null, null, null);
        } else if (i == 4) {
            sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.s2, null, null, null);
        } else {
            sVar = i == 5 ? new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.t2, null, null, null) : new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.u2, null, null, null);
        }
        this.b.c(sVar);
        e();
    }

    public final void a(int i, int i2) {
        java.lang.String str;
        java.util.regex.Pattern pattern = com.five_corp.ad.internal.http.client.c.f1921a;
        if (i <= 0 || i2 != 0) {
            str = i2 > 0 ? java.lang.String.format("bytes=%d-%d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf((i + i2) - 1)) : null;
        } else {
            str = java.lang.String.format("bytes=%d-", java.lang.Integer.valueOf(i));
        }
        com.five_corp.ad.internal.util.f fVarA = this.e.a(this.f1920a.f1835a, "GET", null, str, null, null, 60000, 60000);
        if (fVarA.f2085a) {
            com.five_corp.ad.internal.http.connection.a aVar = (com.five_corp.ad.internal.http.connection.a) fVarA.c;
            this.f = aVar;
            fVarA = aVar.a();
            if (fVarA.f2085a) {
                f();
                return;
            }
        }
        this.b.c(fVarA.b);
        e();
    }

    public final void b(final int i, final int i2) {
        this.d.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.http.client.a$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i, i2);
            }
        });
    }
}
