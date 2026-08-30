package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzclq implements com.google.android.gms.internal.ads.zzcla {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzv.zzp().zzi();

    public zzclq(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(java.util.Map map) {
        java.lang.String str;
        if (map.isEmpty() || (str = (java.lang.String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean z = java.lang.Boolean.parseBoolean(str);
        zzgVar.zzD(z);
        if (z) {
            com.google.android.gms.ads.internal.util.zzad.zzc(this.zza);
        }
    }
}
