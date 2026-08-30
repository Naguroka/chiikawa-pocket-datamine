package com.five_corp.ad.internal.storage;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f2060a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ com.five_corp.ad.internal.storage.q d;

    public m(com.five_corp.ad.internal.storage.q qVar, byte[] bArr, int i, int i2) {
        this.d = qVar;
        this.f2060a = bArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.util.f fVar;
        com.five_corp.ad.internal.util.f fVar2;
        com.five_corp.ad.internal.util.f fVar3;
        com.five_corp.ad.internal.storage.q qVar = this.d;
        java.io.FileOutputStream fileOutputStream = qVar.h;
        if (fileOutputStream != null) {
            fVar2 = new com.five_corp.ad.internal.util.f(true, null, fileOutputStream);
        } else {
            if (qVar.g) {
                fVar3 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.I2, null, null, null), null);
            } else {
                com.five_corp.ad.internal.storage.b bVar = qVar.c;
                java.lang.String str = qVar.b;
                com.five_corp.ad.internal.storage.c cVar = (com.five_corp.ad.internal.storage.c) bVar;
                cVar.getClass();
                try {
                    fVar = new com.five_corp.ad.internal.util.f(true, null, new java.io.FileOutputStream(new java.io.File(cVar.f2051a, str), true));
                } catch (java.io.FileNotFoundException e) {
                    fVar = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.m3, null, e, null), null);
                }
                if (fVar.f2085a) {
                    java.io.FileOutputStream fileOutputStream2 = (java.io.FileOutputStream) fVar.c;
                    qVar.h = fileOutputStream2;
                    try {
                        fileOutputStream2.getChannel().truncate(qVar.f2063a);
                        fVar3 = new com.five_corp.ad.internal.util.f(true, null, qVar.h);
                    } catch (java.io.IOException e2) {
                        fVar2 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.F2, null, e2, null), null);
                    }
                } else {
                    fVar3 = new com.five_corp.ad.internal.util.f(false, fVar.b, null);
                }
            }
            fVar2 = fVar3;
        }
        if (!fVar2.f2085a) {
            com.five_corp.ad.internal.storage.q qVar2 = this.d;
            qVar2.e.b(fVar2.b);
            qVar2.a();
            return;
        }
        try {
            ((java.io.FileOutputStream) fVar2.c).write(this.f2060a, this.b, this.c);
            this.d.e.getClass();
        } catch (java.io.IOException unused) {
            com.five_corp.ad.internal.storage.q qVar3 = this.d;
            qVar3.e.b(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.G2, null, null, null));
            qVar3.a();
        }
    }
}
