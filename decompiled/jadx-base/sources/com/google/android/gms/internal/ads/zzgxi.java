package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgxi extends com.google.android.gms.internal.ads.zzgvv implements java.util.RandomAccess, com.google.android.gms.internal.ads.zzgxy, com.google.android.gms.internal.ads.zzgzl {
    private static final float[] zza;
    private static final com.google.android.gms.internal.ads.zzgxi zzb;
    private float[] zzc;
    private int zzd;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        zzb = new com.google.android.gms.internal.ads.zzgxi(fArr, 0, false);
    }

    zzgxi() {
        this(zza, 0, true);
    }

    public static com.google.android.gms.internal.ads.zzgxi zze() {
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
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        zzdG();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzk(i));
        }
        int i3 = i + 1;
        float[] fArr = this.zzc;
        int length = fArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[zzj(length)];
            java.lang.System.arraycopy(this.zzc, 0, fArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, fArr2, i3, this.zzd - i);
            this.zzc = fArr2;
        }
        this.zzc[i] = fFloatValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzdG();
        byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.ads.zzgxi)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.ads.zzgxi zzgxiVar = (com.google.android.gms.internal.ads.zzgxi) collection;
        int i = zzgxiVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.zzc;
        if (i3 > fArr.length) {
            this.zzc = java.util.Arrays.copyOf(fArr, i3);
        }
        java.lang.System.arraycopy(zzgxiVar.zzc, 0, this.zzc, this.zzd, zzgxiVar.zzd);
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
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgxi)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.zzgxi zzgxiVar = (com.google.android.gms.internal.ads.zzgxi) obj;
        if (this.zzd != zzgxiVar.zzd) {
            return false;
        }
        float[] fArr = zzgxiVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (java.lang.Float.floatToIntBits(this.zzc[i]) != java.lang.Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzl(i);
        return java.lang.Float.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.zzd; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + java.lang.Float.floatToIntBits(this.zzc[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return -1;
        }
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzdG();
        zzl(i);
        float[] fArr = this.zzc;
        float f = fArr[i];
        int i2 = this.zzd;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return java.lang.Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdG();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzc;
        java.lang.System.arraycopy(fArr, i2, fArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        zzdG();
        zzl(i);
        float[] fArr = this.zzc;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return java.lang.Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final float zzd(int i) {
        zzl(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzgxy zzf(int i) {
        if (i >= this.zzd) {
            return new com.google.android.gms.internal.ads.zzgxi(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void zzh(float f) {
        zzdG();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            float[] fArr = new float[zzj(length)];
            java.lang.System.arraycopy(this.zzc, 0, fArr, 0, this.zzd);
            this.zzc = fArr;
        }
        float[] fArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        fArr2[i2] = f;
    }

    final void zzi(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new float[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzj(length);
        }
        this.zzc = java.util.Arrays.copyOf(this.zzc, length);
    }

    private zzgxi(float[] fArr, int i, boolean z) {
        super(z);
        this.zzc = fArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzh(((java.lang.Float) obj).floatValue());
        return true;
    }
}
