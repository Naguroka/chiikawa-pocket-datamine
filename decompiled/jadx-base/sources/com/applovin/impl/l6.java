package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class l6 extends com.applovin.impl.sc {
    private static final int[] f = new int[0];
    private static final com.applovin.impl.vg g = com.applovin.impl.vg.a(new java.util.Comparator() { // from class: com.applovin.impl.l6$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return com.applovin.impl.l6.a((java.lang.Integer) obj, (java.lang.Integer) obj2);
        }
    });
    private static final com.applovin.impl.vg h = com.applovin.impl.vg.a(new java.util.Comparator() { // from class: com.applovin.impl.l6$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return com.applovin.impl.l6.b((java.lang.Integer) obj, (java.lang.Integer) obj2);
        }
    });
    private final com.applovin.impl.g8.b d;
    private final java.util.concurrent.atomic.AtomicReference e;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(java.lang.Integer num, java.lang.Integer num2) {
        return 0;
    }

    @Override // com.applovin.impl.vo
    public boolean b() {
        return true;
    }

    public static final class e extends com.applovin.impl.uo.a {
        private boolean A;
        private boolean B;
        private boolean C;
        private boolean D;
        private int E;
        private boolean F;
        private boolean G;
        private boolean H;
        private final android.util.SparseArray I;
        private final android.util.SparseBooleanArray J;
        private boolean x;
        private boolean y;
        private boolean z;

        public e() {
            this.I = new android.util.SparseArray();
            this.J = new android.util.SparseBooleanArray();
            c();
        }

        public e(android.content.Context context) {
            super(context);
            this.I = new android.util.SparseArray();
            this.J = new android.util.SparseBooleanArray();
            c();
        }

        public com.applovin.impl.l6.e i(boolean z) {
            this.x = z;
            return this;
        }

        public com.applovin.impl.l6.e e(boolean z) {
            this.y = z;
            return this;
        }

        public com.applovin.impl.l6.e f(boolean z) {
            this.z = z;
            return this;
        }

        public com.applovin.impl.l6.e g(boolean z) {
            this.A = z;
            return this;
        }

        private e(android.os.Bundle bundle) {
            super(bundle);
            com.applovin.impl.l6.d dVar = com.applovin.impl.l6.d.O;
            i(bundle.getBoolean(com.applovin.impl.l6.d.b(1000), dVar.C));
            e(bundle.getBoolean(com.applovin.impl.l6.d.b(1001), dVar.D));
            f(bundle.getBoolean(com.applovin.impl.l6.d.b(1002), dVar.E));
            g(bundle.getBoolean(com.applovin.impl.l6.d.b(1003), dVar.F));
            b(bundle.getBoolean(com.applovin.impl.l6.d.b(1004), dVar.G));
            c(bundle.getBoolean(com.applovin.impl.l6.d.b(1005), dVar.H));
            a(bundle.getBoolean(com.applovin.impl.l6.d.b(1006), dVar.I));
            a(bundle.getInt(com.applovin.impl.l6.d.b(1007), dVar.B));
            h(bundle.getBoolean(com.applovin.impl.l6.d.b(1008), dVar.J));
            j(bundle.getBoolean(com.applovin.impl.l6.d.b(1009), dVar.K));
            d(bundle.getBoolean(com.applovin.impl.l6.d.b(1010), dVar.L));
            this.I = new android.util.SparseArray();
            a(bundle);
            this.J = a(bundle.getIntArray(com.applovin.impl.l6.d.b(1014)));
        }

        public com.applovin.impl.l6.e b(boolean z) {
            this.B = z;
            return this;
        }

        public com.applovin.impl.l6.e h(boolean z) {
            this.F = z;
            return this;
        }

        public com.applovin.impl.l6.e j(boolean z) {
            this.G = z;
            return this;
        }

        public com.applovin.impl.l6.e d(boolean z) {
            this.H = z;
            return this;
        }

        private void c() {
            this.x = true;
            this.y = false;
            this.z = true;
            this.A = true;
            this.B = false;
            this.C = false;
            this.D = false;
            this.E = 0;
            this.F = true;
            this.G = false;
            this.H = true;
        }

        @Override // com.applovin.impl.uo.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.l6.e a(int i, int i2, boolean z) {
            super.a(i, i2, z);
            return this;
        }

        private android.util.SparseBooleanArray a(int[] iArr) {
            if (iArr == null) {
                return new android.util.SparseBooleanArray();
            }
            android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray(iArr.length);
            for (int i : iArr) {
                sparseBooleanArray.append(i, true);
            }
            return sparseBooleanArray;
        }

        public com.applovin.impl.l6.e c(boolean z) {
            this.C = z;
            return this;
        }

        @Override // com.applovin.impl.uo.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.l6.e a(android.content.Context context, boolean z) {
            super.a(context, z);
            return this;
        }

        @Override // com.applovin.impl.uo.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.l6.d a() {
            return new com.applovin.impl.l6.d(this);
        }

        public com.applovin.impl.l6.e a(boolean z) {
            this.D = z;
            return this;
        }

        @Override // com.applovin.impl.uo.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.l6.e a(android.content.Context context) {
            super.a(context);
            return this;
        }

        public com.applovin.impl.l6.e a(int i) {
            this.E = i;
            return this;
        }

        public final com.applovin.impl.l6.e a(int i, com.applovin.impl.po poVar, com.applovin.impl.l6.f fVar) {
            java.util.Map map = (java.util.Map) this.I.get(i);
            if (map == null) {
                map = new java.util.HashMap();
                this.I.put(i, map);
            }
            if (map.containsKey(poVar) && com.applovin.impl.xp.a(map.get(poVar), fVar)) {
                return this;
            }
            map.put(poVar, fVar);
            return this;
        }

        private void a(android.os.Bundle bundle) {
            int[] intArray = bundle.getIntArray(com.applovin.impl.l6.d.b(1011));
            java.util.List listA = com.applovin.impl.p2.a(com.applovin.impl.po.f, bundle.getParcelableArrayList(com.applovin.impl.l6.d.b(1012)), com.applovin.impl.db.h());
            android.util.SparseArray sparseArrayA = com.applovin.impl.p2.a(com.applovin.impl.l6.f.f, bundle.getSparseParcelableArray(com.applovin.impl.l6.d.b(1013)), new android.util.SparseArray());
            if (intArray == null || intArray.length != listA.size()) {
                return;
            }
            for (int i = 0; i < intArray.length; i++) {
                a(intArray[i], (com.applovin.impl.po) listA.get(i), (com.applovin.impl.l6.f) sparseArrayA.get(i));
            }
        }
    }

    public static final class d extends com.applovin.impl.uo implements com.applovin.impl.o2 {
        public static final com.applovin.impl.l6.d O;
        public static final com.applovin.impl.l6.d P;
        public static final com.applovin.impl.o2.a Q;
        public final int B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        private final android.util.SparseArray M;
        private final android.util.SparseBooleanArray N;

        static {
            com.applovin.impl.l6.d dVarA = new com.applovin.impl.l6.e().a();
            O = dVarA;
            P = dVarA;
            Q = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.l6$d$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.o2.a
                public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
                    return com.applovin.impl.l6.d.b(bundle);
                }
            };
        }

        private d(com.applovin.impl.l6.e eVar) {
            super(eVar);
            this.C = eVar.x;
            this.D = eVar.y;
            this.E = eVar.z;
            this.F = eVar.A;
            this.G = eVar.B;
            this.H = eVar.C;
            this.I = eVar.D;
            this.B = eVar.E;
            this.J = eVar.F;
            this.K = eVar.G;
            this.L = eVar.H;
            this.M = eVar.I;
            this.N = eVar.J;
        }

        public final boolean d(int i) {
            return this.N.get(i);
        }

        public final boolean b(int i, com.applovin.impl.po poVar) {
            java.util.Map map = (java.util.Map) this.M.get(i);
            return map != null && map.containsKey(poVar);
        }

        @Override // com.applovin.impl.uo
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || com.applovin.impl.l6.d.class != obj.getClass()) {
                return false;
            }
            com.applovin.impl.l6.d dVar = (com.applovin.impl.l6.d) obj;
            return super.equals(dVar) && this.C == dVar.C && this.D == dVar.D && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G && this.H == dVar.H && this.I == dVar.I && this.B == dVar.B && this.J == dVar.J && this.K == dVar.K && this.L == dVar.L && a(this.N, dVar.N) && a(this.M, dVar.M);
        }

        @Override // com.applovin.impl.uo
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + this.B) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0);
        }

        private static boolean a(android.util.SparseBooleanArray sparseBooleanArray, android.util.SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.lang.String b(int i) {
            return java.lang.Integer.toString(i, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.applovin.impl.l6.d b(android.os.Bundle bundle) {
            return new com.applovin.impl.l6.e(bundle).a();
        }

        private static boolean a(android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !a((java.util.Map) sparseArray.valueAt(i), (java.util.Map) sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(java.util.Map map, java.util.Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (java.util.Map.Entry entry : map.entrySet()) {
                com.applovin.impl.po poVar = (com.applovin.impl.po) entry.getKey();
                if (!map2.containsKey(poVar) || !com.applovin.impl.xp.a(entry.getValue(), map2.get(poVar))) {
                    return false;
                }
            }
            return true;
        }

        public final com.applovin.impl.l6.f a(int i, com.applovin.impl.po poVar) {
            java.util.Map map = (java.util.Map) this.M.get(i);
            if (map != null) {
                return (com.applovin.impl.l6.f) map.get(poVar);
            }
            return null;
        }

        public static com.applovin.impl.l6.d a(android.content.Context context) {
            return new com.applovin.impl.l6.e(context).a();
        }
    }

    public static final class f implements com.applovin.impl.o2 {
        public static final com.applovin.impl.o2.a f = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.l6$f$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.o2.a
            public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
                return com.applovin.impl.l6.f.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f979a;
        public final int[] b;
        public final int c;
        public final int d;

        public f(int i, int[] iArr, int i2) {
            this.f979a = i;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            this.b = iArrCopyOf;
            this.c = iArr.length;
            this.d = i2;
            java.util.Arrays.sort(iArrCopyOf);
        }

        public int hashCode() {
            return (((this.f979a * 31) + java.util.Arrays.hashCode(this.b)) * 31) + this.d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || com.applovin.impl.l6.f.class != obj.getClass()) {
                return false;
            }
            com.applovin.impl.l6.f fVar = (com.applovin.impl.l6.f) obj;
            return this.f979a == fVar.f979a && java.util.Arrays.equals(this.b, fVar.b) && this.d == fVar.d;
        }

        private static java.lang.String a(int i) {
            return java.lang.Integer.toString(i, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.applovin.impl.l6.f a(android.os.Bundle bundle) {
            boolean z = false;
            int i = bundle.getInt(a(0), -1);
            int[] intArray = bundle.getIntArray(a(1));
            int i2 = bundle.getInt(a(2), -1);
            if (i >= 0 && i2 >= 0) {
                z = true;
            }
            com.applovin.impl.b1.a(z);
            com.applovin.impl.b1.a(intArray);
            return new com.applovin.impl.l6.f(i, intArray, i2);
        }
    }

    public l6(android.content.Context context) {
        this(context, new com.applovin.impl.i0.b());
    }

    private static int b(com.applovin.impl.oo ooVar, int[] iArr, int i, java.lang.String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, java.util.List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue = ((java.lang.Integer) list.get(i11)).intValue();
            if (a(ooVar.a(iIntValue), str, iArr[iIntValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                i10++;
            }
        }
        return i10;
    }

    private static void a(com.applovin.impl.oo ooVar, int[] iArr, int i, java.lang.String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, java.util.List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = ((java.lang.Integer) list.get(size)).intValue();
            if (!a(ooVar.a(iIntValue), str, iArr[iIntValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                list.remove(size);
            }
        }
    }

    protected static final class h implements java.lang.Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f981a;
        private final com.applovin.impl.l6.d b;
        private final boolean c;
        private final boolean d;
        private final int f;
        private final int g;
        private final int h;

        /* JADX WARN: Code duplicated, block: B:21:0x0033  */
        /* JADX WARN: Code duplicated, block: B:41:0x005e  */
        public h(com.applovin.impl.e9 e9Var, com.applovin.impl.l6.d dVar, int i, boolean z) {
            boolean z2;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            this.b = dVar;
            boolean z3 = true;
            int i8 = 0;
            if (!z || (((i5 = e9Var.r) != -1 && i5 > dVar.f1411a) || ((i6 = e9Var.s) != -1 && i6 > dVar.b))) {
                z2 = false;
            } else {
                float f = e9Var.t;
                if ((f == -1.0f || f <= dVar.c) && ((i7 = e9Var.i) == -1 || i7 <= dVar.d)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.f981a = z2;
            if (!z || (((i2 = e9Var.r) != -1 && i2 < dVar.f) || ((i3 = e9Var.s) != -1 && i3 < dVar.g))) {
                z3 = false;
            } else {
                float f2 = e9Var.t;
                if ((f2 != -1.0f && f2 < dVar.h) || ((i4 = e9Var.i) != -1 && i4 < dVar.i)) {
                    z3 = false;
                }
            }
            this.c = z3;
            this.d = com.applovin.impl.l6.a(i, false);
            this.f = e9Var.i;
            this.g = e9Var.b();
            while (i8 < dVar.m.size()) {
                java.lang.String str = e9Var.m;
                if (str != null && str.equals(dVar.m.get(i8))) {
                    this.h = i8;
                }
                i8++;
            }
            i8 = Integer.MAX_VALUE;
            this.h = i8;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(com.applovin.impl.l6.h hVar) {
            com.applovin.impl.vg vgVarC = (this.f981a && this.d) ? com.applovin.impl.l6.g : com.applovin.impl.l6.g.c();
            return com.applovin.impl.y3.e().a(this.d, hVar.d).a(this.f981a, hVar.f981a).a(this.c, hVar.c).a(java.lang.Integer.valueOf(this.h), java.lang.Integer.valueOf(hVar.h), com.applovin.impl.vg.a().c()).a(java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(hVar.f), this.b.v ? com.applovin.impl.l6.g.c() : com.applovin.impl.l6.h).a(java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(hVar.g), vgVarC).a(java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(hVar.f), vgVarC).d();
        }
    }

    protected static final class b implements java.lang.Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f977a;
        private final java.lang.String b;
        private final com.applovin.impl.l6.d c;
        private final boolean d;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final int j;
        private final boolean k;
        private final int l;
        private final int m;
        private final int n;
        private final int o;

        public b(com.applovin.impl.e9 e9Var, com.applovin.impl.l6.d dVar, int i) {
            int i2;
            int iA;
            int iA2;
            this.c = dVar;
            this.b = com.applovin.impl.l6.a(e9Var.c);
            this.d = com.applovin.impl.l6.a(i, false);
            int i3 = 0;
            while (true) {
                i2 = Integer.MAX_VALUE;
                if (i3 >= dVar.n.size()) {
                    iA = 0;
                    i3 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA = com.applovin.impl.l6.a(e9Var, (java.lang.String) dVar.n.get(i3), false);
                    if (iA > 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.g = i3;
            this.f = iA;
            this.h = java.lang.Integer.bitCount(e9Var.f & dVar.o);
            boolean z = true;
            this.k = (e9Var.d & 1) != 0;
            int i4 = e9Var.z;
            this.l = i4;
            this.m = e9Var.A;
            int i5 = e9Var.i;
            this.n = i5;
            if ((i5 != -1 && i5 > dVar.q) || (i4 != -1 && i4 > dVar.p)) {
                z = false;
            }
            this.f977a = z;
            java.lang.String[] strArrE = com.applovin.impl.xp.e();
            int i6 = 0;
            while (true) {
                if (i6 >= strArrE.length) {
                    iA2 = 0;
                    i6 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA2 = com.applovin.impl.l6.a(e9Var, strArrE[i6], false);
                    if (iA2 > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.i = i6;
            this.j = iA2;
            for (int i7 = 0; i7 < dVar.r.size(); i7++) {
                java.lang.String str = e9Var.m;
                if (str != null && str.equals(dVar.r.get(i7))) {
                    i2 = i7;
                    break;
                }
            }
            this.o = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(com.applovin.impl.l6.b bVar) {
            com.applovin.impl.vg vgVarC = (this.f977a && this.d) ? com.applovin.impl.l6.g : com.applovin.impl.l6.g.c();
            com.applovin.impl.y3 y3VarA = com.applovin.impl.y3.e().a(this.d, bVar.d).a(java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(bVar.g), com.applovin.impl.vg.a().c()).a(this.f, bVar.f).a(this.h, bVar.h).a(this.f977a, bVar.f977a).a(java.lang.Integer.valueOf(this.o), java.lang.Integer.valueOf(bVar.o), com.applovin.impl.vg.a().c()).a(java.lang.Integer.valueOf(this.n), java.lang.Integer.valueOf(bVar.n), this.c.v ? com.applovin.impl.l6.g.c() : com.applovin.impl.l6.h).a(this.k, bVar.k).a(java.lang.Integer.valueOf(this.i), java.lang.Integer.valueOf(bVar.i), com.applovin.impl.vg.a().c()).a(this.j, bVar.j).a(java.lang.Integer.valueOf(this.l), java.lang.Integer.valueOf(bVar.l), vgVarC).a(java.lang.Integer.valueOf(this.m), java.lang.Integer.valueOf(bVar.m), vgVarC);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.n);
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(bVar.n);
            if (!com.applovin.impl.xp.a((java.lang.Object) this.b, (java.lang.Object) bVar.b)) {
                vgVarC = com.applovin.impl.l6.h;
            }
            return y3VarA.a(numValueOf, numValueOf2, vgVarC).d();
        }
    }

    protected static final class g implements java.lang.Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f980a;
        private final boolean b;
        private final boolean c;
        private final boolean d;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final boolean j;

        public g(com.applovin.impl.e9 e9Var, com.applovin.impl.l6.d dVar, int i, java.lang.String str) {
            com.applovin.impl.db dbVarA;
            int iA;
            boolean z = false;
            this.b = com.applovin.impl.l6.a(i, false);
            int i2 = e9Var.d & (~dVar.B);
            this.c = (i2 & 1) != 0;
            this.d = (i2 & 2) != 0;
            if (dVar.s.isEmpty()) {
                dbVarA = com.applovin.impl.db.a("");
            } else {
                dbVarA = dVar.s;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= dbVarA.size()) {
                    i3 = Integer.MAX_VALUE;
                    iA = 0;
                    break;
                } else {
                    iA = com.applovin.impl.l6.a(e9Var, (java.lang.String) dbVarA.get(i3), dVar.u);
                    if (iA > 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f = i3;
            this.g = iA;
            int iBitCount = java.lang.Integer.bitCount(e9Var.f & dVar.t);
            this.h = iBitCount;
            this.j = (e9Var.f & 1088) != 0;
            int iA2 = com.applovin.impl.l6.a(e9Var, str, com.applovin.impl.l6.a(str) == null);
            this.i = iA2;
            if (iA > 0 || ((dVar.s.isEmpty() && iBitCount > 0) || this.c || (this.d && iA2 > 0))) {
                z = true;
            }
            this.f980a = z;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(com.applovin.impl.l6.g gVar) {
            com.applovin.impl.y3 y3VarA = com.applovin.impl.y3.e().a(this.b, gVar.b).a(java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(gVar.f), com.applovin.impl.vg.a().c()).a(this.g, gVar.g).a(this.h, gVar.h).a(this.c, gVar.c).a(java.lang.Boolean.valueOf(this.d), java.lang.Boolean.valueOf(gVar.d), this.g == 0 ? com.applovin.impl.vg.a() : com.applovin.impl.vg.a().c()).a(this.i, gVar.i);
            if (this.h == 0) {
                y3VarA = y3VarA.b(this.j, gVar.j);
            }
            return y3VarA.d();
        }
    }

    protected static final class c implements java.lang.Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f978a;
        private final boolean b;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(com.applovin.impl.l6.c cVar) {
            return com.applovin.impl.y3.e().a(this.b, cVar.b).a(this.f978a, cVar.f978a).d();
        }

        public c(com.applovin.impl.e9 e9Var, int i) {
            this.f978a = (e9Var.d & 1) != 0;
            this.b = com.applovin.impl.l6.a(i, false);
        }
    }

    public l6(android.content.Context context, com.applovin.impl.g8.b bVar) {
        this(com.applovin.impl.l6.d.a(context), bVar);
    }

    protected com.applovin.impl.g8.a b(com.applovin.impl.po poVar, int[][] iArr, int i, com.applovin.impl.l6.d dVar, boolean z) {
        com.applovin.impl.g8.a aVarA = (dVar.w || dVar.v || !z) ? null : a(poVar, iArr, i, dVar);
        return aVarA == null ? a(poVar, iArr, dVar) : aVarA;
    }

    private static int[] a(com.applovin.impl.oo ooVar, int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3) {
        com.applovin.impl.e9 e9VarA = ooVar.a(i);
        int[] iArr2 = new int[ooVar.f1127a];
        int i3 = 0;
        for (int i4 = 0; i4 < ooVar.f1127a; i4++) {
            if (i4 == i || a(ooVar.a(i4), iArr[i4], e9VarA, i2, z, z2, z3)) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return java.util.Arrays.copyOf(iArr2, i3);
    }

    public l6(com.applovin.impl.l6.d dVar, com.applovin.impl.g8.b bVar) {
        this.d = bVar;
        this.e = new java.util.concurrent.atomic.AtomicReference(dVar);
    }

    private static int[] a(com.applovin.impl.oo ooVar, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2) {
        java.lang.String str;
        int i12;
        int i13;
        java.util.HashSet hashSet;
        if (ooVar.f1127a < 2) {
            return f;
        }
        java.util.List listA = a(ooVar, i10, i11, z2);
        if (listA.size() < 2) {
            return f;
        }
        if (z) {
            str = null;
        } else {
            java.util.HashSet hashSet2 = new java.util.HashSet();
            java.lang.String str2 = null;
            int i14 = 0;
            int i15 = 0;
            while (i15 < listA.size()) {
                java.lang.String str3 = ooVar.a(((java.lang.Integer) listA.get(i15)).intValue()).m;
                if (hashSet2.add(str3)) {
                    i12 = i14;
                    i13 = i15;
                    hashSet = hashSet2;
                    int iB = b(ooVar, iArr, i, str3, i2, i3, i4, i5, i6, i7, i8, i9, listA);
                    if (iB > i12) {
                        i14 = iB;
                        str2 = str3;
                    }
                    i15 = i13 + 1;
                    hashSet2 = hashSet;
                } else {
                    i12 = i14;
                    i13 = i15;
                    hashSet = hashSet2;
                }
                i14 = i12;
                i15 = i13 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        a(ooVar, iArr, i, str, i2, i3, i4, i5, i6, i7, i8, i9, listA);
        return listA.size() < 2 ? f : com.applovin.impl.tb.a(listA);
    }

    protected static int a(com.applovin.impl.e9 e9Var, java.lang.String str, boolean z) {
        if (!android.text.TextUtils.isEmpty(str) && str.equals(e9Var.c)) {
            return 4;
        }
        java.lang.String strA = a(str);
        java.lang.String strA2 = a(e9Var.c);
        if (strA2 == null || strA == null) {
            return (z && strA2 == null) ? 1 : 0;
        }
        if (strA2.startsWith(strA) || strA.startsWith(strA2)) {
            return 3;
        }
        return com.applovin.impl.xp.b(strA2, "-")[0].equals(com.applovin.impl.xp.b(strA, "-")[0]) ? 2 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    private static android.graphics.Point a(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            if ((i3 > i4) == (i > i2)) {
                i2 = i;
                i = i2;
            }
        } else {
            i2 = i;
            i = i2;
        }
        int i5 = i3 * i;
        int i6 = i4 * i2;
        if (i5 >= i6) {
            return new android.graphics.Point(i2, com.applovin.impl.xp.a(i6, i3));
        }
        return new android.graphics.Point(com.applovin.impl.xp.a(i5, i4), i);
    }

    protected static boolean a(int i, boolean z) {
        int iD = com.applovin.impl.ri.d(i);
        return iD == 4 || (z && iD == 3);
    }

    private static boolean a(com.applovin.impl.e9 e9Var, int i, com.applovin.impl.e9 e9Var2, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        java.lang.String str;
        int i5;
        if (!a(i, false) || (i3 = e9Var.i) == -1 || i3 > i2) {
            return false;
        }
        if (!z3 && ((i5 = e9Var.z) == -1 || i5 != e9Var2.z)) {
            return false;
        }
        if (z || ((str = e9Var.m) != null && android.text.TextUtils.equals(str, e9Var2.m))) {
            return z2 || ((i4 = e9Var.A) != -1 && i4 == e9Var2.A);
        }
        return false;
    }

    private static boolean a(com.applovin.impl.e9 e9Var, java.lang.String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        if ((e9Var.f & 16384) != 0 || !a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !com.applovin.impl.xp.a((java.lang.Object) e9Var.m, (java.lang.Object) str)) {
            return false;
        }
        int i12 = e9Var.r;
        if (i12 != -1 && (i7 > i12 || i12 > i3)) {
            return false;
        }
        int i13 = e9Var.s;
        if (i13 != -1 && (i8 > i13 || i13 > i4)) {
            return false;
        }
        float f2 = e9Var.t;
        return (f2 == -1.0f || (((float) i9) <= f2 && f2 <= ((float) i5))) && (i11 = e9Var.i) != -1 && i10 <= i11 && i11 <= i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(java.lang.Integer num, java.lang.Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    private static void a(com.applovin.impl.sc.a aVar, int[][][] iArr, com.applovin.impl.si[] siVarArr, com.applovin.impl.g8[] g8VarArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= aVar.a()) {
                z = true;
                break;
            }
            int iA = aVar.a(i3);
            com.applovin.impl.g8 g8Var = g8VarArr[i3];
            if ((iA == 1 || iA == 2) && g8Var != null && a(iArr[i3], aVar.b(i3), g8Var)) {
                if (iA == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
            i3++;
        }
        if (i2 != -1 && i != -1) {
            z2 = true;
        }
        if (z && z2) {
            com.applovin.impl.si siVar = new com.applovin.impl.si(true);
            siVarArr[i2] = siVar;
            siVarArr[i] = siVar;
        }
    }

    protected static java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.equals(str, androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    private static boolean a(int[][] iArr, com.applovin.impl.po poVar, com.applovin.impl.g8 g8Var) {
        if (g8Var == null) {
            return false;
        }
        int iA = poVar.a(g8Var.a());
        for (int i = 0; i < g8Var.b(); i++) {
            if (com.applovin.impl.ri.c(iArr[iA][g8Var.b(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static com.applovin.impl.g8.a a(com.applovin.impl.po poVar, int[][] iArr, int i, com.applovin.impl.l6.d dVar) {
        com.applovin.impl.l6.d dVar2 = dVar;
        int i2 = dVar2.E ? 24 : 16;
        boolean z = dVar2.D && (i & i2) != 0;
        int i3 = 0;
        while (i3 < poVar.f1153a) {
            com.applovin.impl.oo ooVarA = poVar.a(i3);
            int i4 = i3;
            int[] iArrA = a(ooVarA, iArr[i3], z, i2, dVar2.f1411a, dVar2.b, dVar2.c, dVar2.d, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.j, dVar2.k, dVar2.l);
            if (iArrA.length > 0) {
                return new com.applovin.impl.g8.a(ooVarA, iArrA);
            }
            i3 = i4 + 1;
            dVar2 = dVar;
        }
        return null;
    }

    protected com.applovin.impl.g8.a[] a(com.applovin.impl.sc.a aVar, int[][][] iArr, int[] iArr2, com.applovin.impl.l6.d dVar) {
        boolean z;
        java.lang.String str;
        int i;
        java.lang.String str2;
        com.applovin.impl.l6.b bVar;
        int i2;
        int iA = aVar.a();
        com.applovin.impl.g8.a[] aVarArr = new com.applovin.impl.g8.a[iA];
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        boolean z3 = false;
        while (true) {
            z = true;
            if (i4 >= iA) {
                break;
            }
            if (2 == aVar.a(i4)) {
                if (!z2) {
                    com.applovin.impl.g8.a aVarB = b(aVar.b(i4), iArr[i4], iArr2[i4], dVar, true);
                    aVarArr[i4] = aVarB;
                    z2 = aVarB != null;
                }
                z3 |= aVar.b(i4).f1153a > 0;
            }
            i4++;
        }
        int i5 = 0;
        int i6 = -1;
        java.lang.String str3 = null;
        com.applovin.impl.l6.b bVar2 = null;
        while (i5 < iA) {
            if (z == aVar.a(i5)) {
                boolean z4 = (dVar.L || !z3) ? z : false;
                i = i6;
                str2 = str3;
                bVar = bVar2;
                i2 = i5;
                android.util.Pair pairA = a(aVar.b(i5), iArr[i5], iArr2[i5], dVar, z4);
                if (pairA != null && (bVar == null || ((com.applovin.impl.l6.b) pairA.second).compareTo(bVar) > 0)) {
                    if (i != -1) {
                        aVarArr[i] = null;
                    }
                    com.applovin.impl.g8.a aVar2 = (com.applovin.impl.g8.a) pairA.first;
                    aVarArr[i2] = aVar2;
                    str3 = aVar2.f810a.a(aVar2.b[0]).c;
                    bVar2 = (com.applovin.impl.l6.b) pairA.second;
                    i6 = i2;
                }
                i5 = i2 + 1;
                z = true;
            } else {
                i = i6;
                str2 = str3;
                bVar = bVar2;
                i2 = i5;
            }
            i6 = i;
            bVar2 = bVar;
            str3 = str2;
            i5 = i2 + 1;
            z = true;
        }
        java.lang.String str4 = str3;
        int i7 = -1;
        com.applovin.impl.l6.g gVar = null;
        while (i3 < iA) {
            int iA2 = aVar.a(i3);
            if (iA2 == 1) {
                str = str4;
            } else if (iA2 == 2) {
                str = str4;
            } else if (iA2 != 3) {
                aVarArr[i3] = a(iA2, aVar.b(i3), iArr[i3], dVar);
                str = str4;
            } else {
                str = str4;
                android.util.Pair pairA2 = a(aVar.b(i3), iArr[i3], dVar, str);
                if (pairA2 != null && (gVar == null || ((com.applovin.impl.l6.g) pairA2.second).compareTo(gVar) > 0)) {
                    if (i7 != -1) {
                        aVarArr[i7] = null;
                    }
                    aVarArr[i3] = (com.applovin.impl.g8.a) pairA2.first;
                    gVar = (com.applovin.impl.l6.g) pairA2.second;
                    i7 = i3;
                }
            }
            i3++;
            str4 = str;
        }
        return aVarArr;
    }

    protected android.util.Pair a(com.applovin.impl.po poVar, int[][] iArr, int i, com.applovin.impl.l6.d dVar, boolean z) {
        com.applovin.impl.g8.a aVar = null;
        int i2 = -1;
        int i3 = -1;
        com.applovin.impl.l6.b bVar = null;
        for (int i4 = 0; i4 < poVar.f1153a; i4++) {
            com.applovin.impl.oo ooVarA = poVar.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < ooVarA.f1127a; i5++) {
                if (a(iArr2[i5], dVar.J)) {
                    com.applovin.impl.l6.b bVar2 = new com.applovin.impl.l6.b(ooVarA.a(i5), dVar, iArr2[i5]);
                    if ((bVar2.f977a || dVar.F) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i2 = i4;
                        i3 = i5;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        com.applovin.impl.oo ooVarA2 = poVar.a(i2);
        if (!dVar.w && !dVar.v && z) {
            int[] iArrA = a(ooVarA2, iArr[i2], i3, dVar.q, dVar.G, dVar.H, dVar.I);
            if (iArrA.length > 1) {
                aVar = new com.applovin.impl.g8.a(ooVarA2, iArrA);
            }
        }
        if (aVar == null) {
            aVar = new com.applovin.impl.g8.a(ooVarA2, i3);
        }
        return android.util.Pair.create(aVar, (com.applovin.impl.l6.b) com.applovin.impl.b1.a(bVar));
    }

    private static com.applovin.impl.g8.a a(com.applovin.impl.po poVar, int[][] iArr, com.applovin.impl.l6.d dVar) {
        int i = -1;
        com.applovin.impl.oo ooVar = null;
        com.applovin.impl.l6.h hVar = null;
        for (int i2 = 0; i2 < poVar.f1153a; i2++) {
            com.applovin.impl.oo ooVarA = poVar.a(i2);
            java.util.List listA = a(ooVarA, dVar.j, dVar.k, dVar.l);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < ooVarA.f1127a; i3++) {
                com.applovin.impl.e9 e9VarA = ooVarA.a(i3);
                if ((e9VarA.f & 16384) == 0 && a(iArr2[i3], dVar.J)) {
                    com.applovin.impl.l6.h hVar2 = new com.applovin.impl.l6.h(e9VarA, dVar, iArr2[i3], listA.contains(java.lang.Integer.valueOf(i3)));
                    if ((hVar2.f981a || dVar.C) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        ooVar = ooVarA;
                        i = i3;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (ooVar == null) {
            return null;
        }
        return new com.applovin.impl.g8.a(ooVar, i);
    }

    protected com.applovin.impl.g8.a a(int i, com.applovin.impl.po poVar, int[][] iArr, com.applovin.impl.l6.d dVar) {
        com.applovin.impl.oo ooVar = null;
        com.applovin.impl.l6.c cVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < poVar.f1153a; i3++) {
            com.applovin.impl.oo ooVarA = poVar.a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < ooVarA.f1127a; i4++) {
                if (a(iArr2[i4], dVar.J)) {
                    com.applovin.impl.l6.c cVar2 = new com.applovin.impl.l6.c(ooVarA.a(i4), iArr2[i4]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        ooVar = ooVarA;
                        i2 = i4;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (ooVar == null) {
            return null;
        }
        return new com.applovin.impl.g8.a(ooVar, i2);
    }

    protected android.util.Pair a(com.applovin.impl.po poVar, int[][] iArr, com.applovin.impl.l6.d dVar, java.lang.String str) {
        int i = -1;
        com.applovin.impl.oo ooVar = null;
        com.applovin.impl.l6.g gVar = null;
        for (int i2 = 0; i2 < poVar.f1153a; i2++) {
            com.applovin.impl.oo ooVarA = poVar.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < ooVarA.f1127a; i3++) {
                if (a(iArr2[i3], dVar.J)) {
                    com.applovin.impl.l6.g gVar2 = new com.applovin.impl.l6.g(ooVarA.a(i3), dVar, iArr2[i3], str);
                    if (gVar2.f980a && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        ooVar = ooVarA;
                        i = i3;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (ooVar == null) {
            return null;
        }
        return android.util.Pair.create(new com.applovin.impl.g8.a(ooVar, i), (com.applovin.impl.l6.g) com.applovin.impl.b1.a(gVar));
    }

    @Override // com.applovin.impl.sc
    protected final android.util.Pair a(com.applovin.impl.sc.a aVar, int[][][] iArr, int[] iArr2, com.applovin.impl.ae.a aVar2, com.applovin.impl.fo foVar) {
        com.applovin.impl.l6.d dVar = (com.applovin.impl.l6.d) this.e.get();
        int iA = aVar.a();
        com.applovin.impl.g8.a[] aVarArrA = a(aVar, iArr, iArr2, dVar);
        int i = 0;
        while (true) {
            if (i >= iA) {
                break;
            }
            int iA2 = aVar.a(i);
            if (!dVar.d(i) && !dVar.x.contains(java.lang.Integer.valueOf(iA2))) {
                com.applovin.impl.po poVarB = aVar.b(i);
                if (dVar.b(i, poVarB)) {
                    com.applovin.impl.l6.f fVarA = dVar.a(i, poVarB);
                    aVarArrA[i] = fVarA != null ? new com.applovin.impl.g8.a(poVarB.a(fVarA.f979a), fVarA.b, fVarA.d) : null;
                }
            } else {
                aVarArrA[i] = null;
            }
            i++;
        }
        com.applovin.impl.g8[] g8VarArrA = this.d.a(aVarArrA, a(), aVar2, foVar);
        com.applovin.impl.si[] siVarArr = new com.applovin.impl.si[iA];
        for (int i2 = 0; i2 < iA; i2++) {
            siVarArr[i2] = (dVar.d(i2) || dVar.x.contains(java.lang.Integer.valueOf(aVar.a(i2))) || (aVar.a(i2) != -2 && g8VarArrA[i2] == null)) ? null : com.applovin.impl.si.b;
        }
        if (dVar.K) {
            a(aVar, iArr, siVarArr, g8VarArrA);
        }
        return android.util.Pair.create(siVarArr, g8VarArrA);
    }

    private static java.util.List a(com.applovin.impl.oo ooVar, int i, int i2, boolean z) {
        int i3;
        java.util.ArrayList arrayList = new java.util.ArrayList(ooVar.f1127a);
        for (int i4 = 0; i4 < ooVar.f1127a; i4++) {
            arrayList.add(java.lang.Integer.valueOf(i4));
        }
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < ooVar.f1127a; i6++) {
                com.applovin.impl.e9 e9VarA = ooVar.a(i6);
                int i7 = e9VarA.r;
                if (i7 > 0 && (i3 = e9VarA.s) > 0) {
                    android.graphics.Point pointA = a(z, i, i2, i7, i3);
                    int i8 = e9VarA.r;
                    int i9 = e9VarA.s;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (pointA.x * 0.98f)) && i9 >= ((int) (pointA.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iB = ooVar.a(((java.lang.Integer) arrayList.get(size)).intValue()).b();
                    if (iB == -1 || iB > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }
}
