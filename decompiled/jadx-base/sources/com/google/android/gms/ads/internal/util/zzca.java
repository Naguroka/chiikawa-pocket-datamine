package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzca implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzcb zza;
    private final java.lang.String zzb;

    public zzca(com.google.android.gms.ads.internal.util.zzcb zzcbVar, java.lang.String str) {
        this.zza = zzcbVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        synchronized (this.zza) {
            for (com.google.android.gms.ads.internal.util.zzbz zzbzVar : this.zza.zzb) {
                java.lang.String str2 = this.zzb;
                java.util.Map map = zzbzVar.zza;
                if (map.containsKey(str2) && ((java.util.Set) map.get(str2)).contains(str)) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzi().zzE(false);
                }
            }
        }
    }
}
