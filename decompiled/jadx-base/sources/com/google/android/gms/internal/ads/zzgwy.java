package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgwy extends com.google.android.gms.internal.ads.zzgvv implements java.util.RandomAccess, com.google.android.gms.internal.ads.zzgxu, com.google.android.gms.internal.ads.zzgzl {
    private static final double[] zza;
    private static final com.google.android.gms.internal.ads.zzgwy zzb;
    private double[] zzc;
    private int zzd;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        zzb = new com.google.android.gms.internal.ads.zzgwy(dArr, 0, false);
    }

    zzgwy() {
        this(zza, 0, true);
    }

    public static com.google.android.gms.internal.ads.zzgwy zze() {
        return zzb;
    }

    private static int zzj(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final java.lang.String zzk(int i) {
        return "Index:" + i + ", Size:" + this.zzd;
    }

    private final void zzl(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new java.lang.IndexOutOfBoundsException(zzk(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        zzdG();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzk(i));
        }
        int i3 = i + 1;
        double[] dArr = this.zzc;
        int length = dArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[zzj(length)];
            java.lang.System.arraycopy(this.zzc, 0, dArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, dArr2, i3, this.zzd - i);
            this.zzc = dArr2;
        }
        this.zzc[i] = dDoubleValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzdG();
        byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.ads.zzgwy)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.ads.zzgwy zzgwyVar = (com.google.android.gms.internal.ads.zzgwy) collection;
        int i = zzgwyVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.zzc;
        if (i3 > dArr.length) {
            this.zzc = java.util.Arrays.copyOf(dArr, i3);
        }
        java.lang.System.arraycopy(zzgwyVar.zzc, 0, this.zzc, this.zzd, zzgwyVar.zzd);
        this.zzd = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgwy)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.zzgwy zzgwyVar = (com.google.android.gms.internal.ads.zzgwy) obj;
        if (this.zzd != zzgwyVar.zzd) {
            return false;
        }
        double[] dArr = zzgwyVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (java.lang.Double.doubleToLongBits(this.zzc[i]) != java.lang.Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzl(i);
        return java.lang.Double.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.zzc[i2]);
            byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Double)) {
            return -1;
        }
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzdG();
        zzl(i);
        double[] dArr = this.zzc;
        double d = dArr[i];
        int i2 = this.zzd;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdG();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzc;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        zzdG();
        zzl(i);
        double[] dArr = this.zzc;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return java.lang.Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final double zzd(int i) {
        zzl(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzgxu zzf(int i) {
        if (i >= this.zzd) {
            return new com.google.android.gms.internal.ads.zzgwy(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void zzh(double d) {
        zzdG();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            double[] dArr = new double[zzj(length)];
            java.lang.System.arraycopy(this.zzc, 0, dArr, 0, this.zzd);
            this.zzc = dArr;
        }
        double[] dArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        dArr2[i2] = d;
    }

    final void zzi(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new double[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzj(length);
        }
        this.zzc = java.util.Arrays.copyOf(this.zzc, length);
    }

    private zzgwy(double[] dArr, int i, boolean z) {
        super(z);
        this.zzc = dArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzh(((java.lang.Double) obj).doubleValue());
        return true;
    }
}
