package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgzn extends com.google.android.gms.internal.ads.zzgvv implements java.util.RandomAccess {
    private static final java.lang.Object[] zza;
    private static final com.google.android.gms.internal.ads.zzgzn zzb;
    private java.lang.Object[] zzc;
    private int zzd;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        zza = objArr;
        zzb = new com.google.android.gms.internal.ads.zzgzn(objArr, 0, false);
    }

    zzgzn() {
        this(zza, 0, true);
    }

    public static com.google.android.gms.internal.ads.zzgzn zzd() {
        return zzb;
    }

    private static int zzg(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final java.lang.String zzh(int i) {
        return "Index:" + i + ", Size:" + this.zzd;
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new java.lang.IndexOutOfBoundsException(zzh(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        zzdG();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzh(i));
        }
        int i3 = i + 1;
        java.lang.Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[zzg(length)];
            java.lang.System.arraycopy(this.zzc, 0, objArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, objArr2, i3, this.zzd - i);
            this.zzc = objArr2;
        }
        this.zzc[i] = obj;
        this.zzd++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        zzi(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i) {
        zzdG();
        zzi(i);
        java.lang.Object[] objArr = this.zzc;
        java.lang.Object obj = objArr[i];
        int i2 = this.zzd;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        zzdG();
        zzi(i);
        java.lang.Object[] objArr = this.zzc;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    final void zze(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new java.lang.Object[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzg(length);
        }
        this.zzc = java.util.Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgyd zzf(int i) {
        if (i >= this.zzd) {
            return new com.google.android.gms.internal.ads.zzgzn(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    private zzgzn(java.lang.Object[] objArr, int i, boolean z) {
        super(z);
        this.zzc = objArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        zzdG();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            this.zzc = java.util.Arrays.copyOf(this.zzc, zzg(length));
        }
        java.lang.Object[] objArr = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
