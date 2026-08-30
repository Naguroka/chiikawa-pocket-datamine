package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfxp {
    java.lang.Object[] zza;
    int zzb;
    com.google.android.gms.internal.ads.zzfxo zzc;

    public zzfxp() {
        this(4);
    }

    private final void zzd(int i) {
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = java.util.Arrays.copyOf(objArr, com.google.android.gms.internal.ads.zzfxh.zze(length, i2));
        }
    }

    public final com.google.android.gms.internal.ads.zzfxp zza(java.lang.Object obj, java.lang.Object obj2) {
        zzd(this.zzb + 1);
        com.google.android.gms.internal.ads.zzfwk.zzb(obj, obj2);
        java.lang.Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfxp zzb(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            zzd(this.zzb + ((java.util.Collection) iterable).size());
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfxq zzc() {
        com.google.android.gms.internal.ads.zzfxo zzfxoVar = this.zzc;
        if (zzfxoVar != null) {
            throw zzfxoVar.zza();
        }
        com.google.android.gms.internal.ads.zzfze zzfzeVarZzj = com.google.android.gms.internal.ads.zzfze.zzj(this.zzb, this.zza, this);
        com.google.android.gms.internal.ads.zzfxo zzfxoVar2 = this.zzc;
        if (zzfxoVar2 == null) {
            return zzfzeVarZzj;
        }
        throw zzfxoVar2.zza();
    }

    zzfxp(int i) {
        this.zza = new java.lang.Object[i + i];
        this.zzb = 0;
    }
}
