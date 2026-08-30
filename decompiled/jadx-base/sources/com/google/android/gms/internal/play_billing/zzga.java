package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzga extends com.google.android.gms.internal.play_billing.zzdu implements java.util.RandomAccess, com.google.android.gms.internal.play_billing.zzfn {
    private static final long[] zza;
    private long[] zzb;
    private int zzc;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        new com.google.android.gms.internal.play_billing.zzga(jArr, 0, false);
    }

    zzga() {
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

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        long jLongValue = ((java.lang.Long) obj).longValue();
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzi(i));
        }
        int i3 = i + 1;
        long[] jArr = this.zzb;
        int length = jArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[zzh(length)];
            java.lang.System.arraycopy(this.zzb, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, jArr2, i3, this.zzc - i);
            this.zzb = jArr2;
        }
        this.zzb[i] = jLongValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zza();
        byte[] bArr = com.google.android.gms.internal.play_billing.zzfo.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.play_billing.zzga)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.play_billing.zzga zzgaVar = (com.google.android.gms.internal.play_billing.zzga) collection;
        int i = zzgaVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzb;
        if (i3 > jArr.length) {
            this.zzb = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(zzgaVar.zzb, 0, this.zzb, this.zzc, zzgaVar.zzc);
        this.zzc = i3;
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
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzga)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.play_billing.zzga zzgaVar = (com.google.android.gms.internal.play_billing.zzga) obj;
        if (this.zzc != zzgaVar.zzc) {
            return false;
        }
        long[] jArr = zzgaVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzj(i);
        return java.lang.Long.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            long j = this.zzb[i2];
            byte[] bArr = com.google.android.gms.internal.play_billing.zzfo.zzb;
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
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zza();
        zzj(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        zza();
        zzj(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfn
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.zzfn zzd(int i) {
        if (i >= this.zzc) {
            return new com.google.android.gms.internal.play_billing.zzga(i == 0 ? zza : java.util.Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final long zze(int i) {
        zzj(i);
        return this.zzb[i];
    }

    public final void zzf(long j) {
        zza();
        int i = this.zzc;
        int length = this.zzb.length;
        if (i == length) {
            long[] jArr = new long[zzh(length)];
            java.lang.System.arraycopy(this.zzb, 0, jArr, 0, this.zzc);
            this.zzb = jArr;
        }
        long[] jArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        jArr2[i2] = j;
    }

    final void zzg(int i) {
        int length = this.zzb.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new long[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzh(length);
        }
        this.zzb = java.util.Arrays.copyOf(this.zzb, length);
    }

    private zzga(long[] jArr, int i, boolean z) {
        super(z);
        this.zzb = jArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzf(((java.lang.Long) obj).longValue());
        return true;
    }
}
