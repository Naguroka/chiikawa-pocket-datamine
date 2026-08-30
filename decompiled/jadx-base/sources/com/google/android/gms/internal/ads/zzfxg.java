package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzfxg extends com.google.android.gms.internal.ads.zzfxh {
    java.lang.Object[] zza;
    int zzb;
    boolean zzc;

    zzfxg(int i) {
        com.google.android.gms.internal.ads.zzfwk.zza(i, "initialCapacity");
        this.zza = new java.lang.Object[i];
        this.zzb = 0;
    }

    private final void zzf(int i) {
        int length = this.zza.length;
        int iZze = zze(length, this.zzb + i);
        if (iZze > length || this.zzc) {
            this.zza = java.util.Arrays.copyOf(this.zza, iZze);
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfxh zzb(java.lang.Object obj) {
        throw null;
    }

    public final com.google.android.gms.internal.ads.zzfxh zzc(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            zzf(collection.size());
            if (collection instanceof com.google.android.gms.internal.ads.zzfxi) {
                this.zzb = ((com.google.android.gms.internal.ads.zzfxi) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }

    final void zzd(java.lang.Object[] objArr, int i) {
        com.google.android.gms.internal.ads.zzfyx.zzb(objArr, 2);
        zzf(2);
        java.lang.System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }

    public final com.google.android.gms.internal.ads.zzfxg zza(java.lang.Object obj) {
        obj.getClass();
        zzf(1);
        java.lang.Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }
}
