package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzku extends com.google.android.gms.internal.measurement.zzkq implements java.util.RandomAccess, com.google.android.gms.internal.measurement.zzmj, com.google.android.gms.internal.measurement.zzno {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new com.google.android.gms.internal.measurement.zzku(zArr, 0, false);
    }

    zzku() {
        this(zza, 0, true);
    }

    private static int zzg(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final java.lang.String zzh(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new java.lang.IndexOutOfBoundsException(zzh(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzcE();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzh(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[zzg(length)];
            java.lang.System.arraycopy(this.zzb, 0, zArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, zArr2, i3, this.zzc - i);
            this.zzb = zArr2;
        }
        this.zzb[i] = zBooleanValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzcE();
        byte[] bArr = com.google.android.gms.internal.measurement.zzmk.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.measurement.zzku)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.measurement.zzku zzkuVar = (com.google.android.gms.internal.measurement.zzku) collection;
        int i = zzkuVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.zzb;
        if (i3 > zArr.length) {
            this.zzb = java.util.Arrays.copyOf(zArr, i3);
        }
        java.lang.System.arraycopy(zzkuVar.zzb, 0, this.zzb, this.zzc, zzkuVar.zzc);
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
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzku)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.zzku zzkuVar = (com.google.android.gms.internal.measurement.zzku) obj;
        if (this.zzc != zzkuVar.zzc) {
            return false;
        }
        boolean[] zArr = zzkuVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzi(i);
        return java.lang.Boolean.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.zzc; i++) {
            iZza = (iZza * 31) + com.google.android.gms.internal.measurement.zzmk.zza(this.zzb[i]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzcE();
        zzi(i);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzcE();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzcE();
        zzi(i);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzmj zzd(int i) {
        if (i >= this.zzc) {
            return new com.google.android.gms.internal.measurement.zzku(i == 0 ? zza : java.util.Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void zze(boolean z) {
        zzcE();
        int i = this.zzc;
        int length = this.zzb.length;
        if (i == length) {
            boolean[] zArr = new boolean[zzg(length)];
            java.lang.System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        zArr2[i2] = z;
    }

    public final boolean zzf(int i) {
        zzi(i);
        return this.zzb[i];
    }

    private zzku(boolean[] zArr, int i, boolean z) {
        super(z);
        this.zzb = zArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zze(((java.lang.Boolean) obj).booleanValue());
        return true;
    }
}
