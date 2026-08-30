package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbym implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbyn zza;
    private final java.lang.String zzb;

    public zzbym(com.google.android.gms.internal.ads.zzbyn zzbynVar, java.lang.String str) {
        this.zza = zzbynVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        synchronized (this.zza) {
            for (com.google.android.gms.internal.ads.zzbyl zzbylVar : this.zza.zzb) {
                zzbylVar.zza.zzb(zzbylVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
