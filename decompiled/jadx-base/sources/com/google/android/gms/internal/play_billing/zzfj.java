package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfj extends com.google.android.gms.internal.play_billing.zzdu implements java.util.RandomAccess, com.google.android.gms.internal.play_billing.zzfm {
    private static final int[] zza;
    private static final com.google.android.gms.internal.play_billing.zzfj zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new com.google.android.gms.internal.play_billing.zzfj(iArr, 0, false);
    }

    zzfj() {
        this(zza, 0, true);
    }

    public static com.google.android.gms.internal.play_billing.zzfj zzf() {
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

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zza();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzj(i));
        }
        int i3 = i + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[zzi(length)];
            java.lang.System.arraycopy(this.zzc, 0, iArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, iArr2, i3, this.zzd - i);
            this.zzc = iArr2;
        }
        this.zzc[i] = iIntValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zza();
        byte[] bArr = com.google.android.gms.internal.play_billing.zzfo.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) collection;
        int i = zzfjVar.zzd;
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
        java.lang.System.arraycopy(zzfjVar.zzc, 0, this.zzc, this.zzd, zzfjVar.zzd);
        this.zzd = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) obj;
        if (this.zzd != zzfjVar.zzd) {
            return false;
        }
        int[] iArr = zzfjVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzk(i);
        return java.lang.Integer.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
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

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zza();
        zzk(i);
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
        zza();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zza();
        zzk(i);
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfn
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.zzfn zzd(int i) {
        if (i >= this.zzd) {
            return new com.google.android.gms.internal.play_billing.zzfj(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final int zze(int i) {
        zzk(i);
        return this.zzc[i];
    }

    public final void zzg(int i) {
        zza();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            int[] iArr = new int[zzi(length)];
            java.lang.System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        iArr2[i3] = i;
    }

    final void zzh(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzi(length);
        }
        this.zzc = java.util.Arrays.copyOf(this.zzc, length);
    }

    private zzfj(int[] iArr, int i, boolean z) {
        super(z);
        this.zzc = iArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzg(((java.lang.Integer) obj).intValue());
        return true;
    }
}
