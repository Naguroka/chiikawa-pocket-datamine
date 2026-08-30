package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlm extends com.google.android.gms.internal.measurement.zzkq implements java.util.RandomAccess, com.google.android.gms.internal.measurement.zzmj, com.google.android.gms.internal.measurement.zzno {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new com.google.android.gms.internal.measurement.zzlm(dArr, 0, false);
    }

    zzlm() {
        this(zza, 0, true);
    }

    private static int zzh(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final java.lang.String zzi(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    private final void zzj(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new java.lang.IndexOutOfBoundsException(zzi(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        zzcE();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzi(i));
        }
        int i3 = i + 1;
        double[] dArr = this.zzb;
        int length = dArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[zzh(length)];
            java.lang.System.arraycopy(this.zzb, 0, dArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, dArr2, i3, this.zzc - i);
            this.zzb = dArr2;
        }
        this.zzb[i] = dDoubleValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzcE();
        byte[] bArr = com.google.android.gms.internal.measurement.zzmk.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.measurement.zzlm)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.measurement.zzlm zzlmVar = (com.google.android.gms.internal.measurement.zzlm) collection;
        int i = zzlmVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.zzb;
        if (i3 > dArr.length) {
            this.zzb = java.util.Arrays.copyOf(dArr, i3);
        }
        java.lang.System.arraycopy(zzlmVar.zzb, 0, this.zzb, this.zzc, zzlmVar.zzc);
        this.zzc = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzlm)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.zzlm zzlmVar = (com.google.android.gms.internal.measurement.zzlm) obj;
        if (this.zzc != zzlmVar.zzc) {
            return false;
        }
        double[] dArr = zzlmVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (java.lang.Double.doubleToLongBits(this.zzb[i]) != java.lang.Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzj(i);
        return java.lang.Double.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.zzb[i2]);
            byte[] bArr = com.google.android.gms.internal.measurement.zzmk.zzb;
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
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzcE();
        zzj(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzcE();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        zzcE();
        zzj(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return java.lang.Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzmj zzd(int i) {
        if (i >= this.zzc) {
            return new com.google.android.gms.internal.measurement.zzlm(i == 0 ? zza : java.util.Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final double zze(int i) {
        zzj(i);
        return this.zzb[i];
    }

    public final void zzf(double d) {
        zzcE();
        int i = this.zzc;
        int length = this.zzb.length;
        if (i == length) {
            double[] dArr = new double[zzh(length)];
            java.lang.System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
            this.zzb = dArr;
        }
        double[] dArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        dArr2[i2] = d;
    }

    final void zzg(int i) {
        int length = this.zzb.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new double[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzh(length);
        }
        this.zzb = java.util.Arrays.copyOf(this.zzb, length);
    }

    private zzlm(double[] dArr, int i, boolean z) {
        super(z);
        this.zzb = dArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzf(((java.lang.Double) obj).doubleValue());
        return true;
    }
}
