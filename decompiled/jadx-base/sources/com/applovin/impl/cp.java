package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class cp implements com.applovin.impl.j8 {
    public static final com.applovin.impl.n8 t = new com.applovin.impl.n8() { // from class: com.applovin.impl.cp$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.n8
        public final com.applovin.impl.j8[] a() {
            return com.applovin.impl.cp.c();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f690a;
    private final int b;
    private final java.util.List c;
    private final com.applovin.impl.ah d;
    private final android.util.SparseIntArray e;
    private final com.applovin.impl.dp.c f;
    private final android.util.SparseArray g;
    private final android.util.SparseBooleanArray h;
    private final android.util.SparseBooleanArray i;
    private final com.applovin.impl.bp j;
    private com.applovin.impl.ap k;
    private com.applovin.impl.l8 l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private com.applovin.impl.dp q;
    private int r;
    private int s;

    @Override // com.applovin.impl.j8
    public void a() {
    }

    static /* synthetic */ int d(com.applovin.impl.cp cpVar) {
        int i = cpVar.m;
        cpVar.m = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.j8[] c() {
        return new com.applovin.impl.j8[]{new com.applovin.impl.cp()};
    }

    public cp() {
        this(0);
    }

    public cp(int i) {
        this(1, i, androidx.media3.extractor.ts.TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public cp(int i, int i2, int i3) {
        this(i, new com.applovin.impl.ho(0L), new com.applovin.impl.m6(i2), i3);
    }

    @Override // com.applovin.impl.j8
    public void a(com.applovin.impl.l8 l8Var) {
        this.l = l8Var;
    }

    private class a implements com.applovin.impl.gj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.zg f691a = new com.applovin.impl.zg(new byte[4]);

        @Override // com.applovin.impl.gj
        public void a(com.applovin.impl.ho hoVar, com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        }

        public a() {
        }

        @Override // com.applovin.impl.gj
        public void a(com.applovin.impl.ah ahVar) {
            if (ahVar.w() == 0 && (ahVar.w() & 128) != 0) {
                ahVar.g(6);
                int iA = ahVar.a() / 4;
                for (int i = 0; i < iA; i++) {
                    ahVar.a(this.f691a, 4);
                    int iA2 = this.f691a.a(16);
                    this.f691a.d(3);
                    if (iA2 == 0) {
                        this.f691a.d(13);
                    } else {
                        int iA3 = this.f691a.a(13);
                        if (com.applovin.impl.cp.this.g.get(iA3) == null) {
                            com.applovin.impl.cp.this.g.put(iA3, new com.applovin.impl.hj(com.applovin.impl.cp.this.new b(iA3)));
                            com.applovin.impl.cp.d(com.applovin.impl.cp.this);
                        }
                    }
                }
                if (com.applovin.impl.cp.this.f690a != 2) {
                    com.applovin.impl.cp.this.g.remove(0);
                }
            }
        }
    }

    private boolean b(com.applovin.impl.k8 k8Var) {
        byte[] bArrC = this.d.c();
        if (9400 - this.d.d() < 188) {
            int iA = this.d.a();
            if (iA > 0) {
                java.lang.System.arraycopy(bArrC, this.d.d(), bArrC, 0, iA);
            }
            this.d.a(bArrC, iA);
        }
        while (this.d.a() < 188) {
            int iE = this.d.e();
            int iA2 = k8Var.a(bArrC, iE, 9400 - iE);
            if (iA2 == -1) {
                return false;
            }
            this.d.e(iE + iA2);
        }
        return true;
    }

    private void d() {
        this.h.clear();
        this.g.clear();
        android.util.SparseArray sparseArrayA = this.f.a();
        int size = sparseArrayA.size();
        for (int i = 0; i < size; i++) {
            this.g.put(sparseArrayA.keyAt(i), (com.applovin.impl.dp) sparseArrayA.valueAt(i));
        }
        this.g.put(0, new com.applovin.impl.hj(new com.applovin.impl.cp.a()));
        this.q = null;
    }

    private class b implements com.applovin.impl.gj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.zg f692a = new com.applovin.impl.zg(new byte[5]);
        private final android.util.SparseArray b = new android.util.SparseArray();
        private final android.util.SparseIntArray c = new android.util.SparseIntArray();
        private final int d;

        @Override // com.applovin.impl.gj
        public void a(com.applovin.impl.ho hoVar, com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        }

        public b(int i) {
            this.d = i;
        }

        @Override // com.applovin.impl.gj
        public void a(com.applovin.impl.ah ahVar) {
            com.applovin.impl.ho hoVar;
            if (ahVar.w() != 2) {
                return;
            }
            if (com.applovin.impl.cp.this.f690a == 1 || com.applovin.impl.cp.this.f690a == 2 || com.applovin.impl.cp.this.m == 1) {
                hoVar = (com.applovin.impl.ho) com.applovin.impl.cp.this.c.get(0);
            } else {
                hoVar = new com.applovin.impl.ho(((com.applovin.impl.ho) com.applovin.impl.cp.this.c.get(0)).a());
                com.applovin.impl.cp.this.c.add(hoVar);
            }
            if ((ahVar.w() & 128) == 0) {
                return;
            }
            ahVar.g(1);
            int iC = ahVar.C();
            int i = 3;
            ahVar.g(3);
            ahVar.a(this.f692a, 2);
            this.f692a.d(3);
            int i2 = 13;
            com.applovin.impl.cp.this.s = this.f692a.a(13);
            ahVar.a(this.f692a, 2);
            int i3 = 4;
            this.f692a.d(4);
            ahVar.g(this.f692a.a(12));
            if (com.applovin.impl.cp.this.f690a == 2 && com.applovin.impl.cp.this.q == null) {
                com.applovin.impl.dp.b bVar = new com.applovin.impl.dp.b(21, null, null, com.applovin.impl.xp.f);
                com.applovin.impl.cp cpVar = com.applovin.impl.cp.this;
                cpVar.q = cpVar.f.a(21, bVar);
                if (com.applovin.impl.cp.this.q != null) {
                    com.applovin.impl.cp.this.q.a(hoVar, com.applovin.impl.cp.this.l, new com.applovin.impl.dp.d(iC, 21, 8192));
                }
            }
            this.b.clear();
            this.c.clear();
            int iA = ahVar.a();
            while (iA > 0) {
                ahVar.a(this.f692a, 5);
                int iA2 = this.f692a.a(8);
                this.f692a.d(i);
                int iA3 = this.f692a.a(i2);
                this.f692a.d(i3);
                int iA4 = this.f692a.a(12);
                com.applovin.impl.dp.b bVarA = a(ahVar, iA4);
                if (iA2 == 6 || iA2 == 5) {
                    iA2 = bVarA.f737a;
                }
                iA -= iA4 + 5;
                int i4 = com.applovin.impl.cp.this.f690a == 2 ? iA2 : iA3;
                if (!com.applovin.impl.cp.this.h.get(i4)) {
                    com.applovin.impl.dp dpVarA = (com.applovin.impl.cp.this.f690a == 2 && iA2 == 21) ? com.applovin.impl.cp.this.q : com.applovin.impl.cp.this.f.a(iA2, bVarA);
                    if (com.applovin.impl.cp.this.f690a != 2 || iA3 < this.c.get(i4, 8192)) {
                        this.c.put(i4, iA3);
                        this.b.put(i4, dpVarA);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.c.keyAt(i5);
                int iValueAt = this.c.valueAt(i5);
                com.applovin.impl.cp.this.h.put(iKeyAt, true);
                com.applovin.impl.cp.this.i.put(iValueAt, true);
                com.applovin.impl.dp dpVar = (com.applovin.impl.dp) this.b.valueAt(i5);
                if (dpVar != null) {
                    if (dpVar != com.applovin.impl.cp.this.q) {
                        dpVar.a(hoVar, com.applovin.impl.cp.this.l, new com.applovin.impl.dp.d(iC, iKeyAt, 8192));
                    }
                    com.applovin.impl.cp.this.g.put(iValueAt, dpVar);
                }
            }
            if (com.applovin.impl.cp.this.f690a == 2) {
                if (com.applovin.impl.cp.this.n) {
                    return;
                }
                com.applovin.impl.cp.this.l.c();
                com.applovin.impl.cp.this.m = 0;
                com.applovin.impl.cp.this.n = true;
                return;
            }
            com.applovin.impl.cp.this.g.remove(this.d);
            com.applovin.impl.cp cpVar2 = com.applovin.impl.cp.this;
            cpVar2.m = cpVar2.f690a == 1 ? 0 : com.applovin.impl.cp.this.m - 1;
            if (com.applovin.impl.cp.this.m == 0) {
                com.applovin.impl.cp.this.l.c();
                com.applovin.impl.cp.this.n = true;
            }
        }

        /* JADX WARN: Code duplicated, block: B:24:0x004d  */
        /* JADX WARN: Code duplicated, block: B:27:0x0054  */
        /* JADX WARN: Code duplicated, block: B:32:0x0063  */
        private com.applovin.impl.dp.b a(com.applovin.impl.ah ahVar, int i) {
            int iD = ahVar.d();
            int i2 = i + iD;
            int i3 = -1;
            java.lang.String strTrim = null;
            java.util.ArrayList arrayList = null;
            while (ahVar.d() < i2) {
                int iW = ahVar.w();
                int iD2 = ahVar.d() + ahVar.w();
                if (iD2 > i2) {
                    break;
                }
                if (iW == 5) {
                    long jY = ahVar.y();
                    if (jY == 1094921523) {
                        i3 = 129;
                    } else if (jY == 1161904947) {
                        i3 = 135;
                    } else if (jY == 1094921524) {
                        i3 = 172;
                    } else if (jY == 1212503619) {
                        i3 = 36;
                    }
                } else if (iW == 106) {
                    i3 = 129;
                } else if (iW == 122) {
                    i3 = 135;
                } else if (iW == 127) {
                    if (ahVar.w() == 21) {
                        i3 = 172;
                    }
                } else if (iW == 123) {
                    i3 = 138;
                } else if (iW == 10) {
                    strTrim = ahVar.c(3).trim();
                } else if (iW == 89) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (ahVar.d() < iD2) {
                        java.lang.String strTrim2 = ahVar.c(3).trim();
                        int iW2 = ahVar.w();
                        byte[] bArr = new byte[4];
                        ahVar.a(bArr, 0, 4);
                        arrayList2.add(new com.applovin.impl.dp.a(strTrim2, iW2, bArr));
                    }
                    arrayList = arrayList2;
                    i3 = 89;
                } else if (iW == 111) {
                    i3 = 257;
                }
                ahVar.g(iD2 - ahVar.d());
            }
            ahVar.f(i2);
            return new com.applovin.impl.dp.b(i3, strTrim, arrayList, java.util.Arrays.copyOfRange(ahVar.c(), iD, i2));
        }
    }

    public cp(int i, com.applovin.impl.ho hoVar, com.applovin.impl.dp.c cVar, int i2) {
        this.f = (com.applovin.impl.dp.c) com.applovin.impl.b1.a(cVar);
        this.b = i2;
        this.f690a = i;
        if (i != 1 && i != 2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.c = arrayList;
            arrayList.add(hoVar);
        } else {
            this.c = java.util.Collections.singletonList(hoVar);
        }
        this.d = new com.applovin.impl.ah(new byte[9400], 0);
        this.h = new android.util.SparseBooleanArray();
        this.i = new android.util.SparseBooleanArray();
        this.g = new android.util.SparseArray();
        this.e = new android.util.SparseIntArray();
        this.j = new com.applovin.impl.bp(i2);
        this.l = com.applovin.impl.l8.e;
        this.s = -1;
        d();
    }

    private void a(long j) {
        if (this.o) {
            return;
        }
        this.o = true;
        if (this.j.a() != androidx.media3.common.C.TIME_UNSET) {
            com.applovin.impl.ap apVar = new com.applovin.impl.ap(this.j.b(), this.j.a(), j, this.s, this.b);
            this.k = apVar;
            this.l.a(apVar.a());
            return;
        }
        this.l.a(new com.applovin.impl.ij.b(this.j.a()));
    }

    private int b() throws com.applovin.impl.ch {
        int iD = this.d.d();
        int iE = this.d.e();
        int iA = com.applovin.impl.ep.a(this.d.c(), iD, iE);
        this.d.f(iA);
        int i = iA + 188;
        if (i > iE) {
            int i2 = this.r + (iA - iD);
            this.r = i2;
            if (this.f690a == 2 && i2 > 376) {
                throw com.applovin.impl.ch.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.r = 0;
        }
        return i;
    }

    @Override // com.applovin.impl.j8
    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) throws com.applovin.impl.ch {
        long jA = k8Var.a();
        if (this.n) {
            if (jA != -1 && this.f690a != 2 && !this.j.c()) {
                return this.j.a(k8Var, thVar, this.s);
            }
            a(jA);
            if (this.p) {
                this.p = false;
                a(0L, 0L);
                if (k8Var.f() != 0) {
                    thVar.f1364a = 0L;
                    return 1;
                }
            }
            com.applovin.impl.ap apVar = this.k;
            if (apVar != null && apVar.b()) {
                return this.k.a(k8Var, thVar);
            }
        }
        if (!b(k8Var)) {
            return -1;
        }
        int iB = b();
        int iE = this.d.e();
        if (iB > iE) {
            return 0;
        }
        int iJ = this.d.j();
        if ((8388608 & iJ) != 0) {
            this.d.f(iB);
            return 0;
        }
        int i = (4194304 & iJ) != 0 ? 1 : 0;
        int i2 = (2096896 & iJ) >> 8;
        boolean z = (iJ & 32) != 0;
        com.applovin.impl.dp dpVar = (iJ & 16) != 0 ? (com.applovin.impl.dp) this.g.get(i2) : null;
        if (dpVar == null) {
            this.d.f(iB);
            return 0;
        }
        if (this.f690a != 2) {
            int i3 = iJ & 15;
            int i4 = this.e.get(i2, i3 - 1);
            this.e.put(i2, i3);
            if (i4 == i3) {
                this.d.f(iB);
                return 0;
            }
            if (i3 != ((i4 + 1) & 15)) {
                dpVar.a();
            }
        }
        if (z) {
            int iW = this.d.w();
            i |= (this.d.w() & 64) != 0 ? 2 : 0;
            this.d.g(iW - 1);
        }
        boolean z2 = this.n;
        if (a(i2)) {
            this.d.e(iB);
            dpVar.a(this.d, i);
            this.d.e(iE);
        }
        if (this.f690a != 2 && !z2 && this.n && jA != -1) {
            this.p = true;
        }
        this.d.f(iB);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        com.applovin.impl.ap apVar;
        com.applovin.impl.b1.b(this.f690a != 2);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            com.applovin.impl.ho hoVar = (com.applovin.impl.ho) this.c.get(i);
            boolean z = hoVar.c() == androidx.media3.common.C.TIME_UNSET;
            if (!z) {
                long jA = hoVar.a();
                if (jA != androidx.media3.common.C.TIME_UNSET && jA != 0 && jA != j2) {
                    hoVar.d(j2);
                }
            } else if (z) {
                hoVar.d(j2);
            }
        }
        if (j2 != 0 && (apVar = this.k) != null) {
            apVar.b(j2);
        }
        this.d.d(0);
        this.e.clear();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            ((com.applovin.impl.dp) this.g.valueAt(i2)).a();
        }
        this.r = 0;
    }

    private boolean a(int i) {
        return this.f690a == 2 || this.n || !this.i.get(i, false);
    }

    @Override // com.applovin.impl.j8
    public boolean a(com.applovin.impl.k8 k8Var) {
        byte[] bArrC = this.d.c();
        k8Var.c(bArrC, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 < 5) {
                    if (bArrC[(i2 * 188) + i] != 71) {
                        break;
                    }
                    i2++;
                } else {
                    k8Var.a(i);
                    return true;
                }
            }
        }
        return false;
    }
}
