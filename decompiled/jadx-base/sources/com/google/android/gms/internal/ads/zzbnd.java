package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbnd implements com.google.android.gms.internal.ads.zzbjp {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnr zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbmn zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbns zzd;

    zzbnd(com.google.android.gms.internal.ads.zzbns zzbnsVar, long j, com.google.android.gms.internal.ads.zzbnr zzbnrVar, com.google.android.gms.internal.ads.zzbmn zzbmnVar) {
        this.zza = j;
        this.zzb = zzbnrVar;
        this.zzc = zzbmnVar;
        this.zzd = zzbnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zza) + " ms.");
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.zzd.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                com.google.android.gms.internal.ads.zzbmn zzbmnVar = this.zzc;
                zzbmnVar.zzq("/log", com.google.android.gms.internal.ads.zzbjo.zzg);
                zzbmnVar.zzq("/result", com.google.android.gms.internal.ads.zzbjo.zzo);
                this.zzb.zzi(this.zzc);
                this.zzd.zzh = this.zzb;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
