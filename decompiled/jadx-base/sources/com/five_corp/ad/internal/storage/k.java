package com.five_corp.ad.internal.storage;

/* JADX INFO: loaded from: classes4.dex */
public final class k {
    public static final byte[] i = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2058a;
    public final java.lang.String b;
    public final com.five_corp.ad.internal.storage.b c;
    public final android.os.Handler d;
    public final com.five_corp.ad.internal.storage.j e;
    public boolean f = false;
    public int g = 0;
    public java.io.InputStream h = null;

    public k(int i2, java.lang.String str, com.five_corp.ad.internal.storage.b bVar, android.os.Handler handler, com.five_corp.ad.internal.movie.partialcache.C1467f c1467f) {
        this.f2058a = i2;
        this.b = str;
        this.c = bVar;
        this.d = handler;
        this.e = c1467f;
    }

    public static void a(com.five_corp.ad.internal.storage.k kVar, int i2) {
        com.five_corp.ad.internal.util.f fVar;
        long j;
        com.five_corp.ad.internal.util.f fVar2;
        int i3;
        if (i2 < 0) {
            kVar.getClass();
            com.five_corp.ad.internal.s sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.B2, "Request length: " + i2, null, null);
            com.five_corp.ad.internal.movie.partialcache.u1 u1Var = (com.five_corp.ad.internal.movie.partialcache.u1) ((com.five_corp.ad.internal.movie.partialcache.C1467f) kVar.e).d;
            u1Var.getClass();
            u1Var.b(new com.five_corp.ad.internal.movie.partialcache.s1(u1Var, sVar));
        } else {
            java.io.InputStream inputStream = kVar.h;
            if (inputStream != null) {
                fVar2 = new com.five_corp.ad.internal.util.f(true, null, inputStream);
            } else if (kVar.f) {
                fVar2 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.C2, null, null, null), null);
            } else {
                com.five_corp.ad.internal.storage.b bVar = kVar.c;
                java.lang.String str = kVar.b;
                com.five_corp.ad.internal.storage.c cVar = (com.five_corp.ad.internal.storage.c) bVar;
                cVar.getClass();
                try {
                    fVar = new com.five_corp.ad.internal.util.f(true, null, new java.io.FileInputStream(new java.io.File(cVar.f2051a, str)));
                } catch (java.io.FileNotFoundException e) {
                    fVar = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.l3, null, e, null), null);
                }
                if (fVar.f2085a) {
                    kVar.h = (java.io.InputStream) fVar.c;
                    long jSkip = 0;
                    int i4 = 0;
                    while (true) {
                        j = kVar.f2058a;
                        if (jSkip >= j || i4 >= 16) {
                            break;
                        }
                        try {
                            jSkip += kVar.h.skip(j - jSkip);
                            i4++;
                        } catch (java.io.IOException e2) {
                            fVar2 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.w2, null, e2, null), null);
                        }
                    }
                    fVar2 = jSkip < j ? new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.x2, null, null, null), null) : new com.five_corp.ad.internal.util.f(true, null, kVar.h);
                } else {
                    fVar2 = new com.five_corp.ad.internal.util.f(false, fVar.b, null);
                }
            }
            if (fVar2.f2085a) {
                byte[] bArr = new byte[i2];
                try {
                    int i5 = ((java.io.InputStream) fVar2.c).read(bArr);
                    if (i5 > 0) {
                        ((com.five_corp.ad.internal.movie.partialcache.C1467f) kVar.e).a(kVar, bArr, i5);
                    } else {
                        ((com.five_corp.ad.internal.movie.partialcache.C1467f) kVar.e).a(kVar, i, 0);
                    }
                    return;
                } catch (java.io.IOException unused) {
                    com.five_corp.ad.internal.s sVar2 = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.y2, null, null, null);
                    com.five_corp.ad.internal.movie.partialcache.u1 u1Var2 = (com.five_corp.ad.internal.movie.partialcache.u1) ((com.five_corp.ad.internal.movie.partialcache.C1467f) kVar.e).d;
                    u1Var2.getClass();
                    u1Var2.b(new com.five_corp.ad.internal.movie.partialcache.s1(u1Var2, sVar2));
                }
            } else {
                com.five_corp.ad.internal.s sVar3 = fVar2.b;
                if (sVar3.f2045a == com.five_corp.ad.internal.t.l3 && (i3 = kVar.g) < 3) {
                    kVar.g = i3 + 1;
                    kVar.d.postDelayed(new com.five_corp.ad.internal.storage.h(kVar, i2), 50 << i3);
                    return;
                } else {
                    com.five_corp.ad.internal.movie.partialcache.u1 u1Var3 = (com.five_corp.ad.internal.movie.partialcache.u1) ((com.five_corp.ad.internal.movie.partialcache.C1467f) kVar.e).d;
                    u1Var3.getClass();
                    u1Var3.b(new com.five_corp.ad.internal.movie.partialcache.s1(u1Var3, sVar3));
                }
            }
        }
        kVar.a();
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        java.io.InputStream inputStream = this.h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e) {
                com.five_corp.ad.internal.storage.j jVar = this.e;
                com.five_corp.ad.internal.s sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.A2, "fail to close file input stream", e, null);
                com.five_corp.ad.internal.movie.partialcache.u1 u1Var = (com.five_corp.ad.internal.movie.partialcache.u1) ((com.five_corp.ad.internal.movie.partialcache.C1467f) jVar).d;
                u1Var.getClass();
                u1Var.b(new com.five_corp.ad.internal.movie.partialcache.s1(u1Var, sVar));
            }
            this.h = null;
        }
    }
}
