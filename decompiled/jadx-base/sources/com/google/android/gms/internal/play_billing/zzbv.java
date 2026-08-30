package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbv {
    java.lang.Object[] zza = new java.lang.Object[8];
    int zzb = 0;
    com.google.android.gms.internal.play_billing.zzbu zzc;

    public final com.google.android.gms.internal.play_billing.zzbv zza(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.zzb + 1;
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 > length) {
                length = length + (length >> 1) + 1;
                if (length < i2) {
                    int iHighestOneBit = java.lang.Integer.highestOneBit(i2 - 1);
                    length = iHighestOneBit + iHighestOneBit;
                }
                if (length < 0) {
                    length = Integer.MAX_VALUE;
                }
            }
            this.zza = java.util.Arrays.copyOf(objArr, length);
        }
        com.google.android.gms.internal.play_billing.zzbo.zza(obj, obj2);
        java.lang.Object[] objArr2 = this.zza;
        int i3 = this.zzb;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.zzb = i3 + 1;
        return this;
    }

    public final com.google.android.gms.internal.play_billing.zzbw zzb() {
        com.google.android.gms.internal.play_billing.zzbu zzbuVar = this.zzc;
        if (zzbuVar != null) {
            throw zzbuVar.zza();
        }
        com.google.android.gms.internal.play_billing.zzcf zzcfVarZzg = com.google.android.gms.internal.play_billing.zzcf.zzg(this.zzb, this.zza, this);
        com.google.android.gms.internal.play_billing.zzbu zzbuVar2 = this.zzc;
        if (zzbuVar2 == null) {
            return zzcfVarZzg;
        }
        throw zzbuVar2.zza();
    }
}
