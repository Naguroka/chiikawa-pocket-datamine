package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgyp {
    zzgyp() {
    }

    public static final java.util.List zza(java.lang.Object obj, long j) {
        com.google.android.gms.internal.ads.zzgyd zzgydVar = (com.google.android.gms.internal.ads.zzgyd) com.google.android.gms.internal.ads.zzhao.zzh(obj, j);
        if (zzgydVar.zzc()) {
            return zzgydVar;
        }
        int size = zzgydVar.size();
        com.google.android.gms.internal.ads.zzgyd zzgydVarZzf = zzgydVar.zzf(size == 0 ? 10 : size + size);
        com.google.android.gms.internal.ads.zzhao.zzv(obj, j, zzgydVarZzf);
        return zzgydVarZzf;
    }
}
