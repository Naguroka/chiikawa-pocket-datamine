package com.five_corp.ad.internal.context;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.system.e f1892a;
    public final com.five_corp.ad.internal.tracking_data.e b;

    public n(com.five_corp.ad.internal.system.e eVar, com.five_corp.ad.internal.tracking_data.e eVar2) {
        this.f1892a = eVar;
        this.b = eVar2;
    }

    public final com.five_corp.ad.internal.context.o a() {
        boolean zA = this.f1892a.a();
        synchronized (this.b.f2079a) {
        }
        return new com.five_corp.ad.internal.context.o(zA);
    }
}
