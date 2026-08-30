package com.five_corp.ad.internal.http.auxcache;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.http.a f1917a;
    public final java.lang.String b;
    public final com.five_corp.ad.internal.logger.a c;
    public final com.five_corp.ad.internal.storage.e d;
    public final java.util.ArrayDeque e;
    public java.util.ArrayList f;
    public final java.util.ArrayList g;
    public java.util.HashMap h;
    public int i;
    public boolean j;

    public k(java.lang.String str, com.five_corp.ad.internal.http.a aVar, com.five_corp.ad.internal.storage.e eVar, java.util.ArrayList arrayList, com.five_corp.ad.internal.logger.a aVar2) {
        this.f1917a = aVar;
        this.d = eVar;
        this.c = aVar2;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.e = arrayDeque;
        arrayDeque.addAll(arrayList);
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.h = null;
        this.i = 0;
        this.j = false;
        this.b = str;
    }
}
