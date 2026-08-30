package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgyr extends com.google.android.gms.internal.ads.zzgvv implements java.util.RandomAccess, com.google.android.gms.internal.ads.zzgyc, com.google.android.gms.internal.ads.zzgzl {
    private static final long[] zza;
    private static final com.google.android.gms.internal.ads.zzgyr zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new com.google.android.gms.internal.ads.zzgyr(jArr, 0, false);
    }

    zzgyr() {
        this(zza, 0, true);
    }

    public static com.google.android.gms.internal.ads.zzgyr zzh() {
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
        long jLongValue = ((java.lang.Long) obj).longValue();
        zzdG();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzk(i));
        }
        int i3 = i + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[zzj(length)];
            java.lang.System.arraycopy(this.zzc, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, jArr2, i3, this.zzd - i);
            this.zzc = jArr2;
        }
        this.zzc[i] = jLongValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzdG();
        byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.ads.zzgyr)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) collection;
        int i = zzgyrVar.zzd;
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
        java.lang.System.arraycopy(zzgyrVar.zzc, 0, this.zzc, this.zzd, zzgyrVar.zzd);
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
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgyr)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) obj;
        if (this.zzd != zzgyrVar.zzd) {
            return false;
        }
        long[] jArr = zzgyrVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzl(i);
        return java.lang.Long.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            long j = this.zzc[i2];
            byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
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

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzdG();
        zzl(i);
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
        zzdG();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        return java.lang.Long.valueOf(zzd(i, ((java.lang.Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final long zza(int i) {
        zzl(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final long zzd(int i, long j) {
        zzdG();
        zzl(i);
        long[] jArr = this.zzc;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzgyc zzf(int i) {
        if (i >= this.zzd) {
            return new com.google.android.gms.internal.ads.zzgyr(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzg(long j) {
        zzdG();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            long[] jArr = new long[zzj(length)];
            java.lang.System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        jArr2[i2] = j;
    }

    final void zzi(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzj(length);
        }
        this.zzc = java.util.Arrays.copyOf(this.zzc, length);
    }

    private zzgyr(long[] jArr, int i, boolean z) {
        super(z);
        this.zzc = jArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzg(((java.lang.Long) obj).longValue());
        return true;
    }
}
