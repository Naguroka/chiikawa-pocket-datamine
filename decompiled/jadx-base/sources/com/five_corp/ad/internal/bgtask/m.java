package com.five_corp.ad.internal.bgtask;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1860a;
    public final com.five_corp.ad.internal.m b;

    public m(int i) {
        this(i, null);
    }

    public final void a() {
        com.five_corp.ad.internal.m mVar = this.b;
        if (mVar != null) {
            synchronized (mVar.h) {
                mVar.i = false;
            }
        }
    }

    public abstract boolean b();

    public m(int i, com.five_corp.ad.internal.m mVar) {
        this.f1860a = i;
        this.b = mVar;
    }
}
