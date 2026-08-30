package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcb {
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.List zzb = new java.util.ArrayList();
    private final android.content.Context zzc;

    zzcb(android.content.Context context) {
        this.zzc = context;
    }

    final synchronized void zzb(java.lang.String str) {
        if (this.zza.containsKey(str)) {
            return;
        }
        android.content.SharedPreferences defaultSharedPreferences = java.util.Objects.equals(str, "__default__") ? android.preference.PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
        com.google.android.gms.ads.internal.util.zzca zzcaVar = new com.google.android.gms.ads.internal.util.zzca(this, str);
        this.zza.put(str, zzcaVar);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcaVar);
    }

    public final void zzc() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkm)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            java.util.Map mapZzw = com.google.android.gms.ads.internal.util.zzs.zzw((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkr));
            java.util.Iterator it = mapZzw.keySet().iterator();
            while (it.hasNext()) {
                zzb((java.lang.String) it.next());
            }
            zzd(new com.google.android.gms.ads.internal.util.zzbz(mapZzw));
        }
    }

    final synchronized void zzd(com.google.android.gms.ads.internal.util.zzbz zzbzVar) {
        this.zzb.add(zzbzVar);
    }
}
