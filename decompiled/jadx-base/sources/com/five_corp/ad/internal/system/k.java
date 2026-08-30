package com.five_corp.ad.internal.system;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends java.util.TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.system.m f2072a;

    public k(com.five_corp.ad.internal.system.m mVar) {
        this.f2072a = mVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        com.five_corp.ad.internal.system.m mVar = this.f2072a;
        synchronized (mVar.f2074a) {
            com.five_corp.ad.internal.util.h hVar = mVar.d;
            hVar.getClass();
            arrayList = new java.util.ArrayList();
            hVar.a((java.util.AbstractCollection) arrayList);
            if (mVar.e != null && arrayList.isEmpty()) {
                mVar.e.cancel();
                mVar.e = null;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        mVar.b.post(new com.five_corp.ad.internal.system.l(arrayList));
    }
}
