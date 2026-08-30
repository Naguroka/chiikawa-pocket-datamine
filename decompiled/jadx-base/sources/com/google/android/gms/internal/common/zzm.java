package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzm implements java.util.Iterator {
    private java.lang.Object zza;
    private int zzb = 2;

    protected zzm() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.android.gms.internal.common.zzv.zzd(this.zzb != 4);
        int i = this.zzb;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.zzb = 4;
            this.zza = zza();
            if (this.zzb != 3) {
                this.zzb = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = 2;
        java.lang.Object obj = this.zza;
        this.zza = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    protected abstract java.lang.Object zza();

    protected final java.lang.Object zzb() {
        this.zzb = 3;
        return null;
    }
}
