package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzkl extends com.google.android.gms.internal.drive.zziw<java.lang.Integer> implements com.google.android.gms.internal.drive.zzkp<java.lang.Integer>, com.google.android.gms.internal.drive.zzmc, java.util.RandomAccess {
    private static final com.google.android.gms.internal.drive.zzkl zzsl;
    private int size;
    private int[] zzsm;

    zzkl() {
        this(new int[10], 0);
    }

    private zzkl(int[] iArr, int i) {
        this.zzsm = iArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbq();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzsm;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.drive.zzkl)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.drive.zzkl zzklVar = (com.google.android.gms.internal.drive.zzkl) obj;
        if (this.size != zzklVar.size) {
            return false;
        }
        int[] iArr = zzklVar.zzsm;
        for (int i = 0; i < this.size; i++) {
            if (this.zzsm[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzsm[i2];
        }
        return i;
    }

    public final int getInt(int i) {
        zzp(i);
        return this.zzsm[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzam(int i) {
        zzo(this.size, i);
    }

    private final void zzo(int i, int i2) {
        int i3;
        zzbq();
        if (i < 0 || i > (i3 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzq(i));
        }
        int[] iArr = this.zzsm;
        if (i3 < iArr.length) {
            java.lang.System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            java.lang.System.arraycopy(this.zzsm, i, iArr2, i + 1, this.size - i);
            this.zzsm = iArr2;
        }
        this.zzsm[i] = i2;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Integer> collection) {
        zzbq();
        com.google.android.gms.internal.drive.zzkm.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.drive.zzkl)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.drive.zzkl zzklVar = (com.google.android.gms.internal.drive.zzkl) collection;
        int i = zzklVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzsm;
        if (i3 > iArr.length) {
            this.zzsm = java.util.Arrays.copyOf(iArr, i3);
        }
        java.lang.System.arraycopy(zzklVar.zzsm, 0, this.zzsm, this.size, zzklVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzbq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Integer.valueOf(this.zzsm[i]))) {
                int[] iArr = this.zzsm;
                java.lang.System.arraycopy(iArr, i + 1, iArr, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzp(int i) {
        if (i < 0 || i >= this.size) {
            throw new java.lang.IndexOutOfBoundsException(zzq(i));
        }
    }

    private final java.lang.String zzq(int i) {
        return new java.lang.StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.size).toString();
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zzbq();
        zzp(i);
        int[] iArr = this.zzsm;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzbq();
        zzp(i);
        int[] iArr = this.zzsm;
        int i2 = iArr[i];
        int i3 = this.size;
        if (i < i3 - 1) {
            java.lang.System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zzo(i, ((java.lang.Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public final /* synthetic */ com.google.android.gms.internal.drive.zzkp<java.lang.Integer> zzr(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.drive.zzkl(java.util.Arrays.copyOf(this.zzsm, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Integer.valueOf(getInt(i));
    }

    static {
        com.google.android.gms.internal.drive.zzkl zzklVar = new com.google.android.gms.internal.drive.zzkl(new int[0], 0);
        zzsl = zzklVar;
        zzklVar.zzbp();
    }
}
