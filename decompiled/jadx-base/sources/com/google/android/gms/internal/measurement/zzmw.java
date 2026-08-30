package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmw extends com.google.android.gms.internal.measurement.zzkq implements java.util.RandomAccess, com.google.android.gms.internal.measurement.zzmi, com.google.android.gms.internal.measurement.zzno {
    private static final long[] zza;
    private static final com.google.android.gms.internal.measurement.zzmw zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new com.google.android.gms.internal.measurement.zzmw(jArr, 0, false);
    }

    zzmw() {
        this(zza, 0, true);
    }

    public static com.google.android.gms.internal.measurement.zzmw zzf() {
        return zzb;
    }

    private static int zzi(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final java.lang.String zzj(int i) {
        return "Index:" + i + ", Size:" + this.zzd;
    }

    private final void zzk(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new java.lang.IndexOutOfBoundsException(zzj(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        long jLongValue = ((java.lang.Long) obj).longValue();
        zzcE();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzj(i));
        }
        int i3 = i + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[zzi(length)];
            java.lang.System.arraycopy(this.zzc, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, jArr2, i3, this.zzd - i);
            this.zzc = jArr2;
        }
        this.zzc[i] = jLongValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzcE();
        byte[] bArr = com.google.android.gms.internal.measurement.zzmk.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.measurement.zzmw)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) collection;
        int i = zzmwVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzc;
        if (i3 > jArr.length) {
            this.zzc = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(zzmwVar.zzc, 0, this.zzc, this.zzd, zzmwVar.zzd);
        this.zzd = i3;
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
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzmw)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) obj;
        if (this.zzd != zzmwVar.zzd) {
            return false;
        }
        long[] jArr = zzmwVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzk(i);
        return java.lang.Long.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            long j = this.zzc[i2];
            byte[] bArr = com.google.android.gms.internal.measurement.zzmk.zzb;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzcE();
        zzk(i);
        long[] jArr = this.zzc;
        long j = jArr[i];
        int i2 = this.zzd;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzcE();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        zzcE();
        zzk(i);
        long[] jArr = this.zzc;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final long zza(int i) {
        zzk(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzmi zzd(int i) {
        if (i >= this.zzd) {
            return new com.google.android.gms.internal.measurement.zzmw(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void zzg(long j) {
        zzcE();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            long[] jArr = new long[zzi(length)];
            java.lang.System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        jArr2[i2] = j;
    }

    final void zzh(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzi(length);
        }
        this.zzc = java.util.Arrays.copyOf(this.zzc, length);
    }

    private zzmw(long[] jArr, int i, boolean z) {
        super(z);
        this.zzc = jArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzg(((java.lang.Long) obj).longValue());
        return true;
    }
}
