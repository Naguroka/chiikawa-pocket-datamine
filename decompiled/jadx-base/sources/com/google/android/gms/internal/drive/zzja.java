package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzja extends com.google.android.gms.internal.drive.zziw<java.lang.Boolean> implements com.google.android.gms.internal.drive.zzkp<java.lang.Boolean>, com.google.android.gms.internal.drive.zzmc, java.util.RandomAccess {
    private static final com.google.android.gms.internal.drive.zzja zzno;
    private int size;
    private boolean[] zznp;

    zzja() {
        this(new boolean[10], 0);
    }

    private zzja(boolean[] zArr, int i) {
        this.zznp = zArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbq();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zznp;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.drive.zzja)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.drive.zzja zzjaVar = (com.google.android.gms.internal.drive.zzja) obj;
        if (this.size != zzjaVar.size) {
            return false;
        }
        boolean[] zArr = zzjaVar.zznp;
        for (int i = 0; i < this.size; i++) {
            if (this.zznp[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZze = 1;
        for (int i = 0; i < this.size; i++) {
            iZze = (iZze * 31) + com.google.android.gms.internal.drive.zzkm.zze(this.zznp[i]);
        }
        return iZze;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void addBoolean(boolean z) {
        zza(this.size, z);
    }

    private final void zza(int i, boolean z) {
        int i2;
        zzbq();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzq(i));
        }
        boolean[] zArr = this.zznp;
        if (i2 < zArr.length) {
            java.lang.System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            java.lang.System.arraycopy(this.zznp, i, zArr2, i + 1, this.size - i);
            this.zznp = zArr2;
        }
        this.zznp[i] = z;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Boolean> collection) {
        zzbq();
        com.google.android.gms.internal.drive.zzkm.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.drive.zzja)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.drive.zzja zzjaVar = (com.google.android.gms.internal.drive.zzja) collection;
        int i = zzjaVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.zznp;
        if (i3 > zArr.length) {
            this.zznp = java.util.Arrays.copyOf(zArr, i3);
        }
        java.lang.System.arraycopy(zzjaVar.zznp, 0, this.zznp, this.size, zzjaVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzbq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Boolean.valueOf(this.zznp[i]))) {
                boolean[] zArr = this.zznp;
                java.lang.System.arraycopy(zArr, i + 1, zArr, i, (this.size - i) - 1);
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
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzbq();
        zzp(i);
        boolean[] zArr = this.zznp;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzbq();
        zzp(i);
        boolean[] zArr = this.zznp;
        boolean z = zArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zza(i, ((java.lang.Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public final /* synthetic */ com.google.android.gms.internal.drive.zzkp<java.lang.Boolean> zzr(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.drive.zzja(java.util.Arrays.copyOf(this.zznp, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzp(i);
        return java.lang.Boolean.valueOf(this.zznp[i]);
    }

    static {
        com.google.android.gms.internal.drive.zzja zzjaVar = new com.google.android.gms.internal.drive.zzja(new boolean[0], 0);
        zzno = zzjaVar;
        zzjaVar.zzbp();
    }
}
