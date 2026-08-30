package com.five_corp.ad.internal.beacon;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.context.i f1845a;
    public final com.five_corp.ad.internal.context.h b;
    public final com.five_corp.ad.internal.ad.a c;
    public final com.five_corp.ad.internal.tracking_data.a d;
    public final int e;
    public final com.five_corp.ad.internal.soundstate.a f;
    public final com.five_corp.ad.internal.beacon.e g;
    public final long h;
    public final long i;
    public final double j;
    public com.five_corp.ad.internal.ad.beacon.a k;
    public java.util.Map l;
    public boolean m;

    public a(com.five_corp.ad.internal.ad.a aVar, com.five_corp.ad.internal.tracking_data.a aVar2, com.five_corp.ad.internal.context.i iVar, com.five_corp.ad.internal.context.h hVar, int i, com.five_corp.ad.internal.soundstate.a aVar3, com.five_corp.ad.internal.beacon.e eVar, long j, long j2, double d) {
        this.d = aVar2;
        this.f1845a = iVar;
        this.b = hVar;
        this.c = aVar;
        this.e = i;
        this.f = aVar3;
        this.g = eVar;
        this.h = j;
        this.i = j2;
        this.j = d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(com.five_corp.ad.internal.context.l lVar, int i, com.five_corp.ad.internal.soundstate.a aVar, long j, double d) {
        com.five_corp.ad.internal.ad.a aVar2 = lVar.b;
        com.five_corp.ad.internal.context.t tVar = lVar.d;
        this(aVar2, tVar.d, tVar.f1896a, lVar.f, i, aVar, lVar.i, j, lVar.a(), d);
    }
}
