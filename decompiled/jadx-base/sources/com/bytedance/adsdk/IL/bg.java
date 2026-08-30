package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public final class bg<E> implements java.util.Collection<E>, java.util.Set<E> {
    private static int Kg;
    private static final int[] bX = new int[0];
    private static final java.lang.Object[] eqN = new java.lang.Object[0];
    private static java.lang.Object[] iR;
    private static int ldr;
    private static java.lang.Object[] zx;
    int IL;
    private int[] WR;
    java.lang.Object[] bg;
    private com.bytedance.adsdk.IL.Lq<E, E> eo;

    private int bg(java.lang.Object obj, int i) {
        int i2 = this.IL;
        if (i2 == 0) {
            return -1;
        }
        int iBg = com.bytedance.adsdk.IL.IL.bg(this.WR, i2, i);
        if (iBg < 0 || obj.equals(this.bg[iBg])) {
            return iBg;
        }
        int i3 = iBg + 1;
        while (i3 < i2 && this.WR[i3] == i) {
            if (obj.equals(this.bg[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBg - 1; i4 >= 0 && this.WR[i4] == i; i4--) {
            if (obj.equals(this.bg[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private int bg() {
        int i = this.IL;
        if (i == 0) {
            return -1;
        }
        int iBg = com.bytedance.adsdk.IL.IL.bg(this.WR, i, 0);
        if (iBg < 0 || this.bg[iBg] == null) {
            return iBg;
        }
        int i2 = iBg + 1;
        while (i2 < i && this.WR[i2] == 0) {
            if (this.bg[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iBg - 1; i3 >= 0 && this.WR[i3] == 0; i3--) {
            if (this.bg[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    private void eqN(int i) {
        if (i == 8) {
            synchronized (com.bytedance.adsdk.IL.bg.class) {
                java.lang.Object[] objArr = iR;
                if (objArr != null) {
                    this.bg = objArr;
                    iR = (java.lang.Object[]) objArr[0];
                    this.WR = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    Kg--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (com.bytedance.adsdk.IL.bg.class) {
                java.lang.Object[] objArr2 = zx;
                if (objArr2 != null) {
                    this.bg = objArr2;
                    zx = (java.lang.Object[]) objArr2[0];
                    this.WR = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    ldr--;
                    return;
                }
            }
        }
        this.WR = new int[i];
        this.bg = new java.lang.Object[i];
    }

    private static void bg(int[] iArr, java.lang.Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (com.bytedance.adsdk.IL.bg.class) {
                if (Kg < 10) {
                    objArr[0] = iR;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    iR = objArr;
                    Kg++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (com.bytedance.adsdk.IL.bg.class) {
                if (ldr < 10) {
                    objArr[0] = zx;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    zx = objArr;
                    ldr++;
                }
            }
        }
    }

    public bg() {
        this(0);
    }

    public bg(int i) {
        if (i == 0) {
            this.WR = bX;
            this.bg = eqN;
        } else {
            eqN(i);
        }
        this.IL = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.IL;
        if (i != 0) {
            bg(this.WR, this.bg, i);
            this.WR = bX;
            this.bg = eqN;
            this.IL = 0;
        }
    }

    public void bg(int i) {
        int[] iArr = this.WR;
        if (iArr.length < i) {
            java.lang.Object[] objArr = this.bg;
            eqN(i);
            int i2 = this.IL;
            if (i2 > 0) {
                java.lang.System.arraycopy(iArr, 0, this.WR, 0, i2);
                java.lang.System.arraycopy(objArr, 0, this.bg, 0, this.IL);
            }
            bg(iArr, objArr, this.IL);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return bg(obj) >= 0;
    }

    public int bg(java.lang.Object obj) {
        return obj == null ? bg() : bg(obj, obj.hashCode());
    }

    public E IL(int i) {
        return (E) this.bg[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.IL <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iBg;
        if (e == null) {
            iBg = bg();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iBg = bg(e, iHashCode);
        }
        if (iBg >= 0) {
            return false;
        }
        int i2 = ~iBg;
        int i3 = this.IL;
        int[] iArr = this.WR;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            java.lang.Object[] objArr = this.bg;
            eqN(i4);
            int[] iArr2 = this.WR;
            if (iArr2.length > 0) {
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                java.lang.System.arraycopy(objArr, 0, this.bg, 0, objArr.length);
            }
            bg(iArr, objArr, this.IL);
        }
        int i5 = this.IL;
        if (i2 < i5) {
            int[] iArr3 = this.WR;
            int i6 = i2 + 1;
            java.lang.System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            java.lang.Object[] objArr2 = this.bg;
            java.lang.System.arraycopy(objArr2, i2, objArr2, i6, this.IL - i2);
        }
        this.WR[i2] = i;
        this.bg[i2] = e;
        this.IL++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        int iBg = bg(obj);
        if (iBg < 0) {
            return false;
        }
        bX(iBg);
        return true;
    }

    public E bX(int i) {
        java.lang.Object[] objArr = this.bg;
        E e = (E) objArr[i];
        int i2 = this.IL;
        if (i2 <= 1) {
            bg(this.WR, objArr, i2);
            this.WR = bX;
            this.bg = eqN;
            this.IL = 0;
        } else {
            int[] iArr = this.WR;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                eqN(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.IL--;
                if (i > 0) {
                    java.lang.System.arraycopy(iArr, 0, this.WR, 0, i);
                    java.lang.System.arraycopy(objArr, 0, this.bg, 0, i);
                }
                int i3 = this.IL;
                if (i < i3) {
                    int i4 = i + 1;
                    java.lang.System.arraycopy(iArr, i4, this.WR, i, i3 - i);
                    java.lang.System.arraycopy(objArr, i4, this.bg, i, this.IL - i);
                }
            } else {
                int i5 = i2 - 1;
                this.IL = i5;
                if (i < i5) {
                    int i6 = i + 1;
                    java.lang.System.arraycopy(iArr, i6, iArr, i, i5 - i);
                    java.lang.Object[] objArr2 = this.bg;
                    java.lang.System.arraycopy(objArr2, i6, objArr2, i, this.IL - i);
                }
                this.bg[this.IL] = null;
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.IL;
    }

    @Override // java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
        int i = this.IL;
        java.lang.Object[] objArr = new java.lang.Object[i];
        java.lang.System.arraycopy(this.bg, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.IL) {
            tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), this.IL));
        }
        java.lang.System.arraycopy(this.bg, 0, tArr, 0, this.IL);
        int length = tArr.length;
        int i = this.IL;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.IL; i++) {
                try {
                    if (!set.contains(IL(i))) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.WR;
        int i = this.IL;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public java.lang.String toString() {
        if (isEmpty()) {
            return com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.IL * 14);
        sb.append('{');
        for (int i = 0; i < this.IL; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eIL = IL(i);
            if (eIL != this) {
                sb.append(eIL);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    private com.bytedance.adsdk.IL.Lq<E, E> IL() {
        if (this.eo == null) {
            this.eo = new com.bytedance.adsdk.IL.Lq<E, E>() { // from class: com.bytedance.adsdk.IL.bg.1
                @Override // com.bytedance.adsdk.IL.Lq
                protected int bg() {
                    return com.bytedance.adsdk.IL.bg.this.IL;
                }

                @Override // com.bytedance.adsdk.IL.Lq
                protected java.lang.Object bg(int i, int i2) {
                    return com.bytedance.adsdk.IL.bg.this.bg[i];
                }

                @Override // com.bytedance.adsdk.IL.Lq
                protected int bg(java.lang.Object obj) {
                    return com.bytedance.adsdk.IL.bg.this.bg(obj);
                }

                @Override // com.bytedance.adsdk.IL.Lq
                protected java.util.Map<E, E> IL() {
                    throw new java.lang.UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.IL.Lq
                protected void bg(int i) {
                    com.bytedance.adsdk.IL.bg.this.bX(i);
                }

                @Override // com.bytedance.adsdk.IL.Lq
                protected void bX() {
                    com.bytedance.adsdk.IL.bg.this.clear();
                }
            };
        }
        return this.eo;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
        return IL().eqN().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection<? extends E> collection) {
        bg(this.IL + collection.size());
        java.util.Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection<?> collection) {
        boolean z = false;
        for (int i = this.IL - 1; i >= 0; i--) {
            if (!collection.contains(this.bg[i])) {
                bX(i);
                z = true;
            }
        }
        return z;
    }
}
