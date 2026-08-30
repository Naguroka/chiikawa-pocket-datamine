package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfb extends com.google.android.gms.internal.play_billing.zzdu implements java.util.RandomAccess, com.google.android.gms.internal.play_billing.zzfn {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new com.google.android.gms.internal.play_billing.zzfb(fArr, 0, false);
    }

    zzfb() {
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
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzi(i));
        }
        int i3 = i + 1;
        float[] fArr = this.zzb;
        int length = fArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[zzh(length)];
            java.lang.System.arraycopy(this.zzb, 0, fArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, fArr2, i3, this.zzc - i);
            this.zzb = fArr2;
        }
        this.zzb[i] = fFloatValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zza();
        byte[] bArr = com.google.android.gms.internal.play_billing.zzfo.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.play_billing.zzfb)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.play_billing.zzfb zzfbVar = (com.google.android.gms.internal.play_billing.zzfb) collection;
        int i = zzfbVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.zzb;
        if (i3 > fArr.length) {
            this.zzb = java.util.Arrays.copyOf(fArr, i3);
        }
        java.lang.System.arraycopy(zzfbVar.zzb, 0, this.zzb, this.zzc, zzfbVar.zzc);
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
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzfb)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.play_billing.zzfb zzfbVar = (com.google.android.gms.internal.play_billing.zzfb) obj;
        if (this.zzc != zzfbVar.zzc) {
            return false;
        }
        float[] fArr = zzfbVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (java.lang.Float.floatToIntBits(this.zzb[i]) != java.lang.Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzj(i);
        return java.lang.Float.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.zzc; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + java.lang.Float.floatToIntBits(this.zzb[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return -1;
        }
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zza();
        zzj(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        java.lang.System.arraycopy(fArr, i2, fArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        zza();
        zzj(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return java.lang.Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfn
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.zzfn zzd(int i) {
        if (i >= this.zzc) {
            return new com.google.android.gms.internal.play_billing.zzfb(i == 0 ? zza : java.util.Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final float zze(int i) {
        zzj(i);
        return this.zzb[i];
    }

    public final void zzf(float f) {
        zza();
        int i = this.zzc;
        int length = this.zzb.length;
        if (i == length) {
            float[] fArr = new float[zzh(length)];
            java.lang.System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
            this.zzb = fArr;
        }
        float[] fArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        fArr2[i2] = f;
    }

    final void zzg(int i) {
        int length = this.zzb.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new float[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzh(length);
        }
        this.zzb = java.util.Arrays.copyOf(this.zzb, length);
    }

    private zzfb(float[] fArr, int i, boolean z) {
        super(z);
        this.zzb = fArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzf(((java.lang.Float) obj).floatValue());
        return true;
    }
}
