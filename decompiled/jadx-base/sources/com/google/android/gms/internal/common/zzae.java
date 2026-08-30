package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzae extends com.google.android.gms.internal.common.zzaf {
    java.lang.Object[] zza = new java.lang.Object[4];
    int zzb = 0;
    boolean zzc;

    zzae(int i) {
    }

    public final com.google.android.gms.internal.common.zzae zza(java.lang.Object obj) {
        int i;
        obj.getClass();
        int length = this.zza.length;
        int i2 = this.zzb + 1;
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i2 <= length) {
            i = length;
        } else {
            i = (length >> 1) + length + 1;
            if (i < i2) {
                int iHighestOneBit = java.lang.Integer.highestOneBit(i2 - 1);
                i = iHighestOneBit + iHighestOneBit;
            }
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
        }
        if (i > length || this.zzc) {
            this.zza = java.util.Arrays.copyOf(this.zza, i);
            this.zzc = false;
        }
        java.lang.Object[] objArr = this.zza;
        int i3 = this.zzb;
        this.zzb = i3 + 1;
        objArr[i3] = obj;
        return this;
    }
}
