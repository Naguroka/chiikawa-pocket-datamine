package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbng implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnr zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbmn zzb;
    final /* synthetic */ java.util.ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbns zze;

    zzbng(com.google.android.gms.internal.ads.zzbns zzbnsVar, com.google.android.gms.internal.ads.zzbnr zzbnrVar, com.google.android.gms.internal.ads.zzbmn zzbmnVar, java.util.ArrayList arrayList, long j) {
        this.zza = zzbnrVar;
        this.zzb = zzbmnVar;
        this.zzc = arrayList;
        this.zzd = j;
        this.zze = zzbnsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        synchronized (this.zze.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhB)).booleanValue()) {
                    this.zza.zzh(new java.util.concurrent.TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                } else {
                    this.zza.zzg();
                }
                com.google.android.gms.internal.ads.zzgcs zzgcsVar = com.google.android.gms.internal.ads.zzbzw.zzf;
                final com.google.android.gms.internal.ads.zzbmn zzbmnVar = this.zzb;
                java.util.Objects.requireNonNull(zzbmnVar);
                zzgcsVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbnf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmnVar.zzc();
                    }
                });
                java.lang.String strValueOf = java.lang.String.valueOf(com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzc));
                int iZze = this.zza.zze();
                int i = this.zze.zzi;
                if (this.zzc.isEmpty()) {
                    str = ". Still waiting for the engine to be loaded";
                } else {
                    str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + java.lang.String.valueOf(this.zzc.get(0));
                }
                com.google.android.gms.ads.internal.util.zze.zza("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iZze + ". Update status(fullLoadTimeout) is " + i + str + " ms. Total latency(fullLoadTimeout) is " + (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
        }
    }
}
