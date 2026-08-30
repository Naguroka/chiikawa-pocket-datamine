package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbyn {
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.List zzb = new java.util.ArrayList();
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzbxz zzd;

    zzbyn(android.content.Context context, com.google.android.gms.internal.ads.zzbxz zzbxzVar) {
        this.zzc = context;
        this.zzd = zzbxzVar;
    }

    final /* synthetic */ void zzb(java.util.Map map, android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2) {
        if (map.containsKey(str) && ((java.util.Set) map.get(str)).contains(str2)) {
            this.zzd.zzd();
        }
    }

    final synchronized void zzc(java.lang.String str) {
        if (this.zza.containsKey(str)) {
            return;
        }
        android.content.SharedPreferences defaultSharedPreferences = java.util.Objects.equals(str, "__default__") ? android.preference.PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
        com.google.android.gms.internal.ads.zzbym zzbymVar = new com.google.android.gms.internal.ads.zzbym(this, str);
        this.zza.put(str, zzbymVar);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbymVar);
    }

    final synchronized void zzd(com.google.android.gms.internal.ads.zzbyl zzbylVar) {
        this.zzb.add(zzbylVar);
    }
}
