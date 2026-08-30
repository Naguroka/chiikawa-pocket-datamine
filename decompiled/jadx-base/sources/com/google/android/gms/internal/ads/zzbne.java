package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbne implements com.google.android.gms.internal.ads.zzbjp {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbmn zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzby zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbns zzc;

    zzbne(com.google.android.gms.internal.ads.zzbns zzbnsVar, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.internal.ads.zzbmn zzbmnVar, com.google.android.gms.ads.internal.util.zzby zzbyVar) {
        this.zza = zzbmnVar;
        this.zzb = zzbyVar;
        this.zzc = zzbnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.zzc.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
            com.google.android.gms.ads.internal.util.client.zzo.zzi("JS Engine is requesting an update");
            if (this.zzc.zzi == 0) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", (com.google.android.gms.internal.ads.zzbjp) this.zzb.zza());
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
