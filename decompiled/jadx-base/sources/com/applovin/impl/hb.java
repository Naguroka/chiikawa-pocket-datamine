package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hb extends com.applovin.impl.bb implements java.util.Set {
    private transient com.applovin.impl.db b;

    private static boolean a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static com.applovin.impl.hb h() {
        return com.applovin.impl.oi.i;
    }

    boolean g() {
        return false;
    }

    @Override // com.applovin.impl.bb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract com.applovin.impl.pp iterator();

    hb() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.applovin.impl.hb) && g() && ((com.applovin.impl.hb) obj).g() && hashCode() != obj.hashCode()) {
            return false;
        }
        return com.applovin.impl.rj.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return com.applovin.impl.rj.a(this);
    }

    @Override // com.applovin.impl.bb
    public com.applovin.impl.db a() {
        com.applovin.impl.db dbVar = this.b;
        if (dbVar != null) {
            return dbVar;
        }
        com.applovin.impl.db dbVarF = f();
        this.b = dbVarF;
        return dbVarF;
    }

    com.applovin.impl.db f() {
        return com.applovin.impl.db.a(toArray());
    }

    static int a(int i) {
        int iMax = java.lang.Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        com.applovin.exoplayer2.common.base.Preconditions.checkArgument(iMax < 1073741824, "collection too large");
        return 1073741824;
    }

    private static com.applovin.impl.hb a(int i, java.lang.Object... objArr) {
        if (i == 0) {
            return h();
        }
        if (i != 1) {
            int iA = a(i);
            java.lang.Object[] objArr2 = new java.lang.Object[iA];
            int i2 = iA - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                java.lang.Object objA = com.applovin.impl.fg.a(objArr[i5], i5);
                int iHashCode = objA.hashCode();
                int iA2 = com.applovin.impl.ja.a(iHashCode);
                while (true) {
                    int i6 = iA2 & i2;
                    java.lang.Object obj = objArr2[i6];
                    if (obj == null) {
                        objArr[i4] = objA;
                        objArr2[i6] = objA;
                        i3 += iHashCode;
                        i4++;
                        break;
                    }
                    if (obj.equals(objA)) {
                        break;
                    }
                    iA2++;
                }
            }
            java.util.Arrays.fill(objArr, i4, i, (java.lang.Object) null);
            if (i4 == 1) {
                return new com.applovin.impl.hk(objArr[0], i3);
            }
            if (a(i4) < iA / 2) {
                return a(i4, objArr);
            }
            if (a(i4, objArr.length)) {
                objArr = java.util.Arrays.copyOf(objArr, i4);
            }
            return new com.applovin.impl.oi(objArr, i3, objArr2, i2, i4);
        }
        return a(objArr[0]);
    }

    public static com.applovin.impl.hb a(java.util.Collection collection) {
        if ((collection instanceof com.applovin.impl.hb) && !(collection instanceof java.util.SortedSet)) {
            com.applovin.impl.hb hbVar = (com.applovin.impl.hb) collection;
            if (!hbVar.e()) {
                return hbVar;
            }
        }
        java.lang.Object[] array = collection.toArray();
        return a(array.length, array);
    }

    public static com.applovin.impl.hb a(java.lang.Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return h();
        }
        if (length != 1) {
            return a(objArr.length, (java.lang.Object[]) objArr.clone());
        }
        return a(objArr[0]);
    }

    public static com.applovin.impl.hb a(java.lang.Object obj, java.lang.Object obj2) {
        return a(2, obj, obj2);
    }

    public static com.applovin.impl.hb a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return a(3, obj, obj2, obj3);
    }

    public static com.applovin.impl.hb a(java.lang.Object obj) {
        return new com.applovin.impl.hk(obj);
    }
}
