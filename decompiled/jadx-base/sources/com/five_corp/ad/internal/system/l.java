package com.five_corp.ad.internal.system;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f2073a;

    public l(java.util.ArrayList arrayList) {
        this.f2073a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f2073a.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.f) ((com.five_corp.ad.internal.system.d) it.next())).p();
        }
    }
}
