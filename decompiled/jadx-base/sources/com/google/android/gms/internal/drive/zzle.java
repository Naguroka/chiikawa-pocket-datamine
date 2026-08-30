package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzle extends com.google.android.gms.internal.drive.zziw<java.lang.Long> implements com.google.android.gms.internal.drive.zzkp<java.lang.Long>, com.google.android.gms.internal.drive.zzmc, java.util.RandomAccess {
    private static final com.google.android.gms.internal.drive.zzle zztp;
    private int size;
    private long[] zztq;

    zzle() {
        this(new long[10], 0);
    }

    private zzle(long[] jArr, int i) {
        this.zztq = jArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbq();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zztq;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.drive.zzle)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.drive.zzle zzleVar = (com.google.android.gms.internal.drive.zzle) obj;
        if (this.size != zzleVar.size) {
            return false;
        }
        long[] jArr = zzleVar.zztq;
        for (int i = 0; i < this.size; i++) {
            if (this.zztq[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzu = 1;
        for (int i = 0; i < this.size; i++) {
            iZzu = (iZzu * 31) + com.google.android.gms.internal.drive.zzkm.zzu(this.zztq[i]);
        }
        return iZzu;
    }

    public final long getLong(int i) {
        zzp(i);
        return this.zztq[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzv(long j) {
        zzk(this.size, j);
    }

    private final void zzk(int i, long j) {
        int i2;
        zzbq();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzq(i));
        }
        long[] jArr = this.zztq;
        if (i2 < jArr.length) {
            java.lang.System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.zztq, i, jArr2, i + 1, this.size - i);
            this.zztq = jArr2;
        }
        this.zztq[i] = j;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Long> collection) {
        zzbq();
        com.google.android.gms.internal.drive.zzkm.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.drive.zzle)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.drive.zzle zzleVar = (com.google.android.gms.internal.drive.zzle) collection;
        int i = zzleVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zztq;
        if (i3 > jArr.length) {
            this.zztq = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(zzleVar.zztq, 0, this.zztq, this.size, zzleVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzbq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Long.valueOf(this.zztq[i]))) {
                long[] jArr = this.zztq;
                java.lang.System.arraycopy(jArr, i + 1, jArr, i, (this.size - i) - 1);
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
        long jLongValue = ((java.lang.Long) obj).longValue();
        zzbq();
        zzp(i);
        long[] jArr = this.zztq;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return java.lang.Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzbq();
        zzp(i);
        long[] jArr = this.zztq;
        long j = jArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zzk(i, ((java.lang.Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public final /* synthetic */ com.google.android.gms.internal.drive.zzkp<java.lang.Long> zzr(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.drive.zzle(java.util.Arrays.copyOf(this.zztq, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Long.valueOf(getLong(i));
    }

    static {
        com.google.android.gms.internal.drive.zzle zzleVar = new com.google.android.gms.internal.drive.zzle(new long[0], 0);
        zztp = zzleVar;
        zzleVar.zzbp();
    }
}
