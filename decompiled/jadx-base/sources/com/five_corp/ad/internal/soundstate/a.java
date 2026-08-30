package com.five_corp.ad.internal.soundstate;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2046a;
    public final int b;
    public final int c;
    public final com.five_corp.ad.internal.soundstate.d d;

    public a(int i, int i2, int i3, com.five_corp.ad.internal.soundstate.d dVar) {
        this.f2046a = i;
        this.b = i2;
        this.c = i3;
        this.d = dVar;
    }

    public final boolean a() {
        int i = this.f2046a;
        int i2 = this.b;
        int i3 = this.c;
        com.five_corp.ad.internal.soundstate.d dVar = this.d;
        return com.five_corp.ad.internal.soundstate.f.a(com.five_corp.ad.internal.soundstate.g.a(i, i2, i3, com.five_corp.ad.internal.soundstate.g.a(dVar.f2048a, dVar.b)));
    }

    public a(com.five_corp.ad.internal.soundstate.d dVar) {
        this(1, 1, 1, dVar);
    }
}
