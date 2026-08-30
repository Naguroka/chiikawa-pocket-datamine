package com.five_corp.ad.internal.storage;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2063a;
    public final java.lang.String b;
    public final com.five_corp.ad.internal.storage.b c;
    public final android.os.Handler d;
    public final com.five_corp.ad.internal.storage.p e;
    public final com.five_corp.ad.internal.logger.a f;
    public boolean g = false;
    public java.io.FileOutputStream h = null;

    public q(int i, java.lang.String str, com.five_corp.ad.internal.storage.b bVar, android.os.Handler handler, com.five_corp.ad.internal.storage.p pVar, com.five_corp.ad.internal.logger.a aVar) {
        this.f2063a = i;
        this.b = str;
        this.c = bVar;
        this.d = handler;
        this.e = pVar;
        this.f = aVar;
    }

    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        java.io.FileOutputStream fileOutputStream = this.h;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (java.io.IOException e) {
                this.f.a(e);
            }
            this.h = null;
        }
    }
}
