package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgvz extends com.google.android.gms.internal.ads.zzgvv implements java.util.RandomAccess, com.google.android.gms.internal.ads.zzgxt, com.google.android.gms.internal.ads.zzgzl {
    private static final boolean[] zza;
    private static final com.google.android.gms.internal.ads.zzgvz zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        zzb = new com.google.android.gms.internal.ads.zzgvz(zArr, 0, false);
    }

    zzgvz() {
        this(zza, 0, true);
    }

    public static com.google.android.gms.internal.ads.zzgvz zzd() {
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

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzdG();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzj(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.zzc;
        int length = zArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[zzi(length)];
            java.lang.System.arraycopy(this.zzc, 0, zArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, zArr2, i3, this.zzd - i);
            this.zzc = zArr2;
        }
        this.zzc[i] = zBooleanValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzdG();
        byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.ads.zzgvz)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.ads.zzgvz zzgvzVar = (com.google.android.gms.internal.ads.zzgvz) collection;
        int i = zzgvzVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.zzc;
        if (i3 > zArr.length) {
            this.zzc = java.util.Arrays.copyOf(zArr, i3);
        }
        java.lang.System.arraycopy(zzgvzVar.zzc, 0, this.zzc, this.zzd, zzgvzVar.zzd);
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
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgvz)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.zzgvz zzgvzVar = (com.google.android.gms.internal.ads.zzgvz) obj;
        if (this.zzd != zzgvzVar.zzd) {
            return false;
        }
        boolean[] zArr = zzgvzVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzk(i);
        return java.lang.Boolean.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.zzd; i++) {
            iZza = (iZza * 31) + com.google.android.gms.internal.ads.zzgye.zza(this.zzc[i]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzdG();
        zzk(i);
        boolean[] zArr = this.zzc;
        boolean z = zArr[i];
        int i2 = this.zzd;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdG();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzc;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzdG();
        zzk(i);
        boolean[] zArr = this.zzc;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzgxt zzf(int i) {
        if (i >= this.zzd) {
            return new com.google.android.gms.internal.ads.zzgvz(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void zzg(boolean z) {
        zzdG();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            boolean[] zArr = new boolean[zzi(length)];
            java.lang.System.arraycopy(this.zzc, 0, zArr, 0, this.zzd);
            this.zzc = zArr;
        }
        boolean[] zArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        zArr2[i2] = z;
    }

    public final boolean zzh(int i) {
        zzk(i);
        return this.zzc[i];
    }

    private zzgvz(boolean[] zArr, int i, boolean z) {
        super(z);
        this.zzc = zArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzg(((java.lang.Boolean) obj).booleanValue());
        return true;
    }
}
