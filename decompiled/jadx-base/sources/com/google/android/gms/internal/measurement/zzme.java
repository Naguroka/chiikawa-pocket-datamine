package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzme extends com.google.android.gms.internal.measurement.zzkq implements java.util.RandomAccess, com.google.android.gms.internal.measurement.zzmh, com.google.android.gms.internal.measurement.zzno {
    private static final int[] zza;
    private static final com.google.android.gms.internal.measurement.zzme zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new com.google.android.gms.internal.measurement.zzme(iArr, 0, false);
    }

    zzme() {
        this(zza, 0, true);
    }

    public static com.google.android.gms.internal.measurement.zzme zzf() {
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

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zzcE();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzk(i));
        }
        int i3 = i + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[zzj(length)];
            java.lang.System.arraycopy(this.zzc, 0, iArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, iArr2, i3, this.zzd - i);
            this.zzc = iArr2;
        }
        this.zzc[i] = iIntValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzcE();
        byte[] bArr = com.google.android.gms.internal.measurement.zzmk.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.measurement.zzme)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) collection;
        int i = zzmeVar.zzd;
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
        java.lang.System.arraycopy(zzmeVar.zzc, 0, this.zzc, this.zzd, zzmeVar.zzd);
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
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzme)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) obj;
        if (this.zzd != zzmeVar.zzd) {
            return false;
        }
        int[] iArr = zzmeVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzl(i);
        return java.lang.Integer.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
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

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzcE();
        zzl(i);
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
        zzcE();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zzcE();
        zzl(i);
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final int zze(int i) {
        zzl(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzmh zzd(int i) {
        if (i >= this.zzd) {
            return new com.google.android.gms.internal.measurement.zzme(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void zzh(int i) {
        zzcE();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            int[] iArr = new int[zzj(length)];
            java.lang.System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        iArr2[i3] = i;
    }

    final void zzi(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzj(length);
        }
        this.zzc = java.util.Arrays.copyOf(this.zzc, length);
    }

    private zzme(int[] iArr, int i, boolean z) {
        super(z);
        this.zzc = iArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzh(((java.lang.Integer) obj).intValue());
        return true;
    }
}
