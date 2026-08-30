package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzkh extends com.google.android.gms.internal.drive.zziw<java.lang.Float> implements com.google.android.gms.internal.drive.zzkp<java.lang.Float>, com.google.android.gms.internal.drive.zzmc, java.util.RandomAccess {
    private static final com.google.android.gms.internal.drive.zzkh zzrm;
    private int size;
    private float[] zzrn;

    zzkh() {
        this(new float[10], 0);
    }

    private zzkh(float[] fArr, int i) {
        this.zzrn = fArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbq();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzrn;
        java.lang.System.arraycopy(fArr, i2, fArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.drive.zzkh)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.drive.zzkh zzkhVar = (com.google.android.gms.internal.drive.zzkh) obj;
        if (this.size != zzkhVar.size) {
            return false;
        }
        float[] fArr = zzkhVar.zzrn;
        for (int i = 0; i < this.size; i++) {
            if (java.lang.Float.floatToIntBits(this.zzrn[i]) != java.lang.Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.size; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + java.lang.Float.floatToIntBits(this.zzrn[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzc(float f) {
        zzc(this.size, f);
    }

    private final void zzc(int i, float f) {
        int i2;
        zzbq();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzq(i));
        }
        float[] fArr = this.zzrn;
        if (i2 < fArr.length) {
            java.lang.System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, i);
            java.lang.System.arraycopy(this.zzrn, i, fArr2, i + 1, this.size - i);
            this.zzrn = fArr2;
        }
        this.zzrn[i] = f;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Float> collection) {
        zzbq();
        com.google.android.gms.internal.drive.zzkm.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.drive.zzkh)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.drive.zzkh zzkhVar = (com.google.android.gms.internal.drive.zzkh) collection;
        int i = zzkhVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.zzrn;
        if (i3 > fArr.length) {
            this.zzrn = java.util.Arrays.copyOf(fArr, i3);
        }
        java.lang.System.arraycopy(zzkhVar.zzrn, 0, this.zzrn, this.size, zzkhVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzbq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Float.valueOf(this.zzrn[i]))) {
                float[] fArr = this.zzrn;
                java.lang.System.arraycopy(fArr, i + 1, fArr, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzp(int i) {
        if (i < 0 || i >= this.size) {
            throw new java.lang.IndexOutOfBoundsException(zzq(i));
        }
    }

    private final java.lang.String zzq(int i) {
        return new java.lang.StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.size).toString();
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        zzbq();
        zzp(i);
        float[] fArr = this.zzrn;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return java.lang.Float.valueOf(f);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzbq();
        zzp(i);
        float[] fArr = this.zzrn;
        float f = fArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Float.valueOf(f);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zzc(i, ((java.lang.Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public final /* synthetic */ com.google.android.gms.internal.drive.zzkp<java.lang.Float> zzr(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.drive.zzkh(java.util.Arrays.copyOf(this.zzrn, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzp(i);
        return java.lang.Float.valueOf(this.zzrn[i]);
    }

    static {
        com.google.android.gms.internal.drive.zzkh zzkhVar = new com.google.android.gms.internal.drive.zzkh(new float[0], 0);
        zzrm = zzkhVar;
        zzkhVar.zzbp();
    }
}
