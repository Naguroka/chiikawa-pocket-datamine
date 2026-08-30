package com.five_corp.ad.internal.storage;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.storage.q f2061a;

    public n(com.five_corp.ad.internal.storage.q qVar) {
        this.f2061a = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.io.FileOutputStream fileOutputStream;
        com.five_corp.ad.internal.storage.q qVar = this.f2061a;
        if (qVar.g || (fileOutputStream = qVar.h) == null) {
            return;
        }
        try {
            fileOutputStream.flush();
            qVar.h.getFD().sync();
        } catch (java.io.IOException e) {
            qVar.f.a(e);
        }
    }
}
