package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzju extends com.google.android.gms.internal.drive.zziw<java.lang.Double> implements com.google.android.gms.internal.drive.zzkp<java.lang.Double>, com.google.android.gms.internal.drive.zzmc, java.util.RandomAccess {
    private static final com.google.android.gms.internal.drive.zzju zzoi;
    private int size;
    private double[] zzoj;

    zzju() {
        this(new double[10], 0);
    }

    private zzju(double[] dArr, int i) {
        this.zzoj = dArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbq();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzoj;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.drive.zzju)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.drive.zzju zzjuVar = (com.google.android.gms.internal.drive.zzju) obj;
        if (this.size != zzjuVar.size) {
            return false;
        }
        double[] dArr = zzjuVar.zzoj;
        for (int i = 0; i < this.size; i++) {
            if (java.lang.Double.doubleToLongBits(this.zzoj[i]) != java.lang.Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzu = 1;
        for (int i = 0; i < this.size; i++) {
            iZzu = (iZzu * 31) + com.google.android.gms.internal.drive.zzkm.zzu(java.lang.Double.doubleToLongBits(this.zzoj[i]));
        }
        return iZzu;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzc(double d) {
        zzc(this.size, d);
    }

    private final void zzc(int i, double d) {
        int i2;
        zzbq();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzq(i));
        }
        double[] dArr = this.zzoj;
        if (i2 < dArr.length) {
            java.lang.System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
            java.lang.System.arraycopy(this.zzoj, i, dArr2, i + 1, this.size - i);
            this.zzoj = dArr2;
        }
        this.zzoj[i] = d;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Double> collection) {
        zzbq();
        com.google.android.gms.internal.drive.zzkm.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.drive.zzju)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.drive.zzju zzjuVar = (com.google.android.gms.internal.drive.zzju) collection;
        int i = zzjuVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.zzoj;
        if (i3 > dArr.length) {
            this.zzoj = java.util.Arrays.copyOf(dArr, i3);
        }
        java.lang.System.arraycopy(zzjuVar.zzoj, 0, this.zzoj, this.size, zzjuVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzbq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Double.valueOf(this.zzoj[i]))) {
                double[] dArr = this.zzoj;
                java.lang.System.arraycopy(dArr, i + 1, dArr, i, (this.size - i) - 1);
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
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        zzbq();
        zzp(i);
        double[] dArr = this.zzoj;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return java.lang.Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzbq();
        zzp(i);
        double[] dArr = this.zzoj;
        double d = dArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zzc(i, ((java.lang.Double) obj).doubleValue());
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public final /* synthetic */ com.google.android.gms.internal.drive.zzkp<java.lang.Double> zzr(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.drive.zzju(java.util.Arrays.copyOf(this.zzoj, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzp(i);
        return java.lang.Double.valueOf(this.zzoj[i]);
    }

    static {
        com.google.android.gms.internal.drive.zzju zzjuVar = new com.google.android.gms.internal.drive.zzju(new double[0], 0);
        zzoi = zzjuVar;
        zzjuVar.zzbp();
    }
}
