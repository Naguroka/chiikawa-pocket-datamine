package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzhah {
    private static volatile int zza = 100;

    zzhah() {
    }

    abstract java.lang.Object zza(java.lang.Object obj);

    abstract java.lang.Object zzb();

    abstract java.lang.Object zzc(java.lang.Object obj);

    abstract void zzd(java.lang.Object obj, int i, int i2);

    abstract void zze(java.lang.Object obj, int i, long j);

    abstract void zzf(java.lang.Object obj, int i, java.lang.Object obj2);

    abstract void zzg(java.lang.Object obj, int i, com.google.android.gms.internal.ads.zzgwj zzgwjVar);

    abstract void zzh(java.lang.Object obj, int i, long j);

    abstract void zzi(java.lang.Object obj);

    abstract void zzj(java.lang.Object obj, java.lang.Object obj2);

    final boolean zzk(java.lang.Object obj, com.google.android.gms.internal.ads.zzgzp zzgzpVar, int i) throws java.io.IOException {
        int iZzd = zzgzpVar.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            zzh(obj, i2, zzgzpVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zze(obj, i2, zzgzpVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zzg(obj, i2, zzgzpVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw new com.google.android.gms.internal.ads.zzgyf("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i2, zzgzpVar.zzf());
            return true;
        }
        java.lang.Object objZzb = zzb();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= zza) {
            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzgzpVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzgzpVar, i5)) {
        }
        if ((i4 | 4) != zzgzpVar.zzd()) {
            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i2, zzc(objZzb));
        return true;
    }
}
