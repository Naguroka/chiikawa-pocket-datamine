package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 implements com.five_corp.ad.internal.movie.partialcache.InterfaceC1463d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.logger.a f2023a;
    public final com.five_corp.ad.internal.cache.o b;
    public final com.five_corp.ad.internal.context.l c;
    public final com.five_corp.ad.internal.http.movcache.h d;
    public final com.five_corp.ad.internal.movie.x e;
    public final android.os.Looper f;
    public android.os.Handler g;
    public com.five_corp.ad.internal.movie.partialcache.v1 h;

    public u1(com.five_corp.ad.internal.logger.a aVar, com.five_corp.ad.internal.cache.o oVar, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.http.movcache.h hVar, com.five_corp.ad.internal.movie.x xVar, android.os.Looper looper) {
        this.f2023a = aVar;
        this.b = oVar;
        this.c = lVar;
        this.d = hVar;
        this.e = xVar;
        this.f = looper;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    public static void a(com.five_corp.ad.internal.movie.partialcache.u1 u1Var, com.five_corp.ad.internal.movie.partialcache.v1 v1Var) {
        int iB;
        com.five_corp.ad.internal.util.f fVar;
        boolean z;
        boolean zA;
        u1Var.getClass();
        com.five_corp.ad.internal.movie.partialcache.m1 m1Var = v1Var.c;
        com.five_corp.ad.internal.util.c cVar = v1Var.b;
        m1Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (true) {
            int i = m1Var.d;
            com.five_corp.ad.internal.movie.partialcache.k1 k1Var = m1Var.i;
            int iB2 = i < k1Var.i ? k1Var.b(i) : Integer.MAX_VALUE;
            if (m1Var.h != null) {
                int i2 = m1Var.e;
                com.five_corp.ad.internal.movie.partialcache.k1 k1Var2 = m1Var.j;
                if (i2 < k1Var2.i) {
                    iB = k1Var2.b(i2);
                } else {
                    iB = Integer.MAX_VALUE;
                }
            } else {
                iB = Integer.MAX_VALUE;
            }
            if (iB2 >= java.lang.Math.min(iB, Integer.MAX_VALUE)) {
                if (iB >= java.lang.Math.min(iB2, Integer.MAX_VALUE)) {
                    fVar = new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.movie.partialcache.C1461c(arrayList, arrayList2));
                    break;
                }
                int iB3 = m1Var.j.b(m1Var.e);
                int iC = m1Var.j.c(m1Var.e);
                com.five_corp.ad.internal.movie.partialcache.k1 k1Var3 = m1Var.j;
                int i3 = m1Var.e;
                long[] jArr = k1Var3.f;
                long j = jArr.length <= i3 ? -1L : jArr[i3];
                int iA = k1Var3.a(i3);
                boolean z2 = m1Var.e + 1 >= m1Var.j.i;
                if (iB3 + iC > cVar.g) {
                    fVar = new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.movie.partialcache.C1461c(arrayList, arrayList2));
                    break;
                }
                com.five_corp.ad.internal.util.g gVarB = cVar.b(iB3);
                if (!gVarB.f2085a) {
                    fVar = new com.five_corp.ad.internal.util.f(false, gVarB.b, null);
                    break;
                }
                com.five_corp.ad.internal.util.f fVarA = cVar.a(iC);
                if (!fVarA.f2085a) {
                    fVar = new com.five_corp.ad.internal.util.f(false, fVarA.b, null);
                    break;
                } else {
                    com.five_corp.ad.internal.util.b bVar = (com.five_corp.ad.internal.util.b) fVarA.c;
                    m1Var.e++;
                    arrayList2.add(new com.five_corp.ad.internal.movie.partialcache.x1(bVar.f2081a, bVar.b, iC, j, iA, z2));
                }
            } else {
                int iB4 = m1Var.i.b(m1Var.d);
                int iC2 = m1Var.i.c(m1Var.d);
                com.five_corp.ad.internal.movie.partialcache.k1 k1Var4 = m1Var.i;
                int i4 = m1Var.d;
                long[] jArr2 = k1Var4.f;
                long j2 = jArr2.length <= i4 ? -1L : jArr2[i4];
                int iA2 = k1Var4.a(i4);
                boolean z3 = m1Var.d + 1 >= m1Var.i.i;
                if (iB4 + iC2 > cVar.g) {
                    fVar = new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.movie.partialcache.C1461c(arrayList, arrayList2));
                    break;
                }
                com.five_corp.ad.internal.util.g gVarB2 = cVar.b(iB4);
                if (!gVarB2.f2085a) {
                    fVar = new com.five_corp.ad.internal.util.f(false, gVarB2.b, null);
                    break;
                }
                com.five_corp.ad.internal.util.f fVarA2 = cVar.a(iC2);
                if (!fVarA2.f2085a) {
                    fVar = new com.five_corp.ad.internal.util.f(false, fVarA2.b, null);
                    break;
                } else {
                    com.five_corp.ad.internal.util.b bVar2 = (com.five_corp.ad.internal.util.b) fVarA2.c;
                    m1Var.d++;
                    arrayList.add(new com.five_corp.ad.internal.movie.partialcache.x1(bVar2.f2081a, bVar2.b, iC2, j2, iA2, z3));
                }
            }
        }
        if (!fVar.f2085a) {
            com.five_corp.ad.internal.s sVar = fVar.b;
            if (v1Var.d == 3) {
                return;
            }
            v1Var.d = 3;
            u1Var.e.a(sVar);
            return;
        }
        java.util.List list = ((com.five_corp.ad.internal.movie.partialcache.C1461c) fVar.c).f2002a;
        com.five_corp.ad.internal.movie.partialcache.v1 v1Var2 = u1Var.h;
        synchronized (v1Var2.h) {
            int size = v1Var2.i.size();
            int size2 = list.size() + size;
            z = size < 1 && size2 >= 1;
            zA = size2 > 50;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                v1Var2.i.addLast((com.five_corp.ad.internal.movie.partialcache.x1) it.next());
            }
            if (!v1Var2.i.isEmpty()) {
                boolean z4 = ((com.five_corp.ad.internal.movie.partialcache.x1) v1Var2.i.peekLast()).f;
            }
        }
        if (z) {
            com.five_corp.ad.internal.movie.x xVar = u1Var.e;
            xVar.getClass();
            xVar.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(xVar, new com.five_corp.ad.internal.movie.C1452i(xVar)));
        }
        if (v1Var.e) {
            zA &= u1Var.a(((com.five_corp.ad.internal.movie.partialcache.C1461c) fVar.c).b);
        }
        if (zA) {
            v1Var.f2024a.d();
        }
    }

    public final void b(com.five_corp.ad.internal.movie.partialcache.w1 w1Var) {
        android.os.Handler handler = this.g;
        if (handler == null) {
            return;
        }
        try {
            handler.postAtFrontOfQueue(new com.five_corp.ad.internal.movie.partialcache.o1(this, w1Var));
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public final com.five_corp.ad.internal.movie.partialcache.x1 b() {
        com.five_corp.ad.internal.movie.partialcache.x1 x1Var;
        boolean z;
        com.five_corp.ad.internal.movie.partialcache.v1 v1Var = this.h;
        if (v1Var.d != 2) {
            return null;
        }
        synchronized (v1Var.h) {
            java.util.ArrayDeque arrayDeque = v1Var.i;
            x1Var = arrayDeque.isEmpty() ? null : (com.five_corp.ad.internal.movie.partialcache.x1) arrayDeque.pollFirst();
            z = arrayDeque.size() < 3;
        }
        if (z) {
            v1Var.f2024a.c();
        }
        return x1Var;
    }

    public final boolean a(java.util.List list) {
        boolean z;
        boolean z2;
        com.five_corp.ad.internal.movie.partialcache.v1 v1Var = this.h;
        synchronized (v1Var.f) {
            int size = v1Var.g.size();
            int size2 = list.size() + size;
            z = size < 1 && size2 >= 1;
            z2 = size2 > 50;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                v1Var.g.addLast((com.five_corp.ad.internal.movie.partialcache.x1) it.next());
            }
            if (!v1Var.g.isEmpty()) {
                boolean z3 = ((com.five_corp.ad.internal.movie.partialcache.x1) v1Var.g.peekLast()).f;
            }
        }
        if (z) {
            com.five_corp.ad.internal.movie.x xVar = this.e;
            xVar.getClass();
            xVar.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(xVar, new com.five_corp.ad.internal.movie.C1451h(xVar)));
        }
        return z2;
    }

    public final void a(com.five_corp.ad.internal.movie.partialcache.v1 v1Var, com.five_corp.ad.internal.s sVar) {
        if (v1Var.d == 3) {
            return;
        }
        v1Var.d = 3;
        this.e.a(sVar);
    }

    public final void a(com.five_corp.ad.internal.movie.partialcache.w1 w1Var) {
        android.os.Handler handler = this.g;
        if (handler == null) {
            return;
        }
        try {
            handler.post(new com.five_corp.ad.internal.movie.partialcache.n1(this, w1Var));
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public final com.five_corp.ad.internal.movie.partialcache.x1 a() {
        com.five_corp.ad.internal.movie.partialcache.x1 x1Var;
        boolean z;
        com.five_corp.ad.internal.movie.partialcache.v1 v1Var = this.h;
        if (v1Var.d != 2) {
            return null;
        }
        synchronized (v1Var.f) {
            java.util.ArrayDeque arrayDeque = v1Var.g;
            x1Var = arrayDeque.isEmpty() ? null : (com.five_corp.ad.internal.movie.partialcache.x1) arrayDeque.pollFirst();
            z = arrayDeque.size() < 3;
        }
        if (z) {
            v1Var.f2024a.c();
        }
        return x1Var;
    }
}
