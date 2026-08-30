package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgxs extends com.google.android.gms.internal.ads.zzgvv implements java.util.RandomAccess, com.google.android.gms.internal.ads.zzgxz, com.google.android.gms.internal.ads.zzgzl {
    private static final int[] zza;
    private static final com.google.android.gms.internal.ads.zzgxs zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new com.google.android.gms.internal.ads.zzgxs(iArr, 0, false);
    }

    zzgxs() {
        this(zza, 0, true);
    }

    public static com.google.android.gms.internal.ads.zzgxs zzg() {
        return zzb;
    }

    private static int zzk(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final java.lang.String zzl(int i) {
        return "Index:" + i + ", Size:" + this.zzd;
    }

    private final void zzm(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new java.lang.IndexOutOfBoundsException(zzl(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zzdG();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzl(i));
        }
        int i3 = i + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[zzk(length)];
            java.lang.System.arraycopy(this.zzc, 0, iArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, iArr2, i3, this.zzd - i);
            this.zzc = iArr2;
        }
        this.zzc[i] = iIntValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzdG();
        byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.ads.zzgxs)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) collection;
        int i = zzgxsVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzc;
        if (i3 > iArr.length) {
            this.zzc = java.util.Arrays.copyOf(iArr, i3);
        }
        java.lang.System.arraycopy(zzgxsVar.zzc, 0, this.zzc, this.zzd, zzgxsVar.zzd);
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
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgxs)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) obj;
        if (this.zzd != zzgxsVar.zzd) {
            return false;
        }
        int[] iArr = zzgxsVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzm(i);
        return java.lang.Integer.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            i = (i * 31) + this.zzc[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzdG();
        zzm(i);
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        int i3 = this.zzd;
        if (i < i3 - 1) {
            java.lang.System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdG();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        return java.lang.Integer.valueOf(zze(i, ((java.lang.Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxz
    public final int zzd(int i) {
        zzm(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxz
    public final int zze(int i, int i2) {
        zzdG();
        zzm(i);
        int[] iArr = this.zzc;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzgxz zzf(int i) {
        if (i >= this.zzd) {
            return new com.google.android.gms.internal.ads.zzgxs(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgxz
    public final void zzi(int i) {
        zzdG();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            int[] iArr = new int[zzk(length)];
            java.lang.System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        iArr2[i3] = i;
    }

    final void zzj(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzk(length);
        }
        this.zzc = java.util.Arrays.copyOf(this.zzc, length);
    }

    private zzgxs(int[] iArr, int i, boolean z) {
        super(z);
        this.zzc = iArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzi(((java.lang.Integer) obj).intValue());
        return true;
    }
}
