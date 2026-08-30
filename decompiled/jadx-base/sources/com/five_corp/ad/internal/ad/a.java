package com.five_corp.ad.internal.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public final java.util.List A;
    public final com.five_corp.ad.internal.ad.beacon.j B;
    public final com.five_corp.ad.internal.ad.beacon.f C;
    public final com.five_corp.ad.internal.ad.beacon.f D;
    public final java.util.List E;
    public final java.lang.String F;
    public final java.util.List G;
    public final com.five_corp.ad.internal.ad.g H;
    public final int I;
    public final int J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1789a;
    public final com.five_corp.ad.CreativeType b;
    public final java.lang.String c;
    public final java.lang.Long d;
    public final com.five_corp.ad.internal.ad.f e;
    public final java.lang.Long f;
    public final java.lang.Integer g;
    public final com.five_corp.ad.internal.ad.u h;
    public final com.five_corp.ad.internal.ad.q i;
    public final com.five_corp.ad.internal.ad.v j;
    public final java.lang.String k;
    public final java.util.List l;
    public final java.util.List m;
    public final com.five_corp.ad.internal.ad.w n;
    public final java.lang.Long o;
    public final com.five_corp.ad.internal.ad.w p;
    public final com.five_corp.ad.internal.ad.w q;
    public final com.five_corp.ad.internal.ad.w r;
    public final com.five_corp.ad.internal.ad.m s;
    public final java.lang.String t;
    public final java.lang.String u;
    public final java.lang.String v;
    public final java.lang.String w;
    public final java.lang.String x;
    public final java.util.List y;
    public final java.util.List z;

    public a(java.lang.String str, com.five_corp.ad.CreativeType creativeType, java.lang.String str2, java.lang.Long l, com.five_corp.ad.internal.ad.f fVar, java.lang.Long l2, java.lang.Integer num, int i, int i2, com.five_corp.ad.internal.ad.u uVar, com.five_corp.ad.internal.ad.q qVar, com.five_corp.ad.internal.ad.v vVar, java.lang.String str3, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, com.five_corp.ad.internal.ad.w wVar, java.lang.Long l3, com.five_corp.ad.internal.ad.w wVar2, com.five_corp.ad.internal.ad.w wVar3, com.five_corp.ad.internal.ad.w wVar4, com.five_corp.ad.internal.ad.m mVar, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4, java.util.List list, com.five_corp.ad.internal.ad.beacon.j jVar, com.five_corp.ad.internal.ad.beacon.f fVar2, com.five_corp.ad.internal.ad.beacon.f fVar3, java.util.ArrayList arrayList5, java.lang.String str9, java.util.ArrayList arrayList6, com.five_corp.ad.internal.ad.g gVar) {
        this.f1789a = str;
        this.b = creativeType;
        this.c = str2;
        this.d = l;
        this.e = fVar;
        this.f = l2;
        this.g = num;
        this.I = i;
        this.J = i2;
        this.h = uVar;
        this.i = qVar;
        this.j = vVar;
        this.k = str3;
        this.l = arrayList;
        this.m = arrayList2;
        this.n = wVar;
        this.o = l3;
        this.p = wVar2;
        this.q = wVar3;
        this.r = wVar4;
        this.s = mVar;
        this.t = str4;
        this.u = str5;
        this.v = str6;
        this.w = str7;
        this.x = str8;
        this.y = arrayList3;
        this.z = arrayList4;
        this.A = list;
        this.B = jVar;
        this.C = fVar2;
        this.D = fVar3;
        this.E = arrayList5;
        this.F = str9;
        this.G = arrayList6;
        this.H = gVar;
    }

    public static com.five_corp.ad.internal.ad.format_config.a a(com.five_corp.ad.internal.ad.a aVar, java.lang.String str) {
        if (aVar != null && str != null) {
            java.lang.Integer numValueOf = null;
            for (com.five_corp.ad.internal.ad.x xVar : aVar.y) {
                if (str.equals(xVar.f1836a)) {
                    numValueOf = java.lang.Integer.valueOf(xVar.b);
                }
            }
            if (numValueOf == null) {
                return null;
            }
            for (com.five_corp.ad.internal.ad.format_config.a aVar2 : aVar.z) {
                if (numValueOf.equals(java.lang.Integer.valueOf(aVar2.f1811a))) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    public final boolean b() {
        return this.b == com.five_corp.ad.CreativeType.MOVIE && this.I == 2 && this.h != null;
    }

    public final java.util.HashSet a() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.List list = this.E;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.five_corp.ad.internal.ad.beacon.a aVar = ((com.five_corp.ad.internal.ad.beacon.f) it.next()).b;
                if (aVar != null) {
                    hashSet.add(aVar);
                }
            }
        }
        java.util.List list2 = this.A;
        if (list2 != null) {
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                com.five_corp.ad.internal.ad.beacon.a aVar2 = ((com.five_corp.ad.internal.ad.beacon.d) it2.next()).c;
                if (aVar2 != null) {
                    hashSet.add(aVar2);
                }
            }
        }
        return hashSet;
    }
}
