package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcnr implements com.google.android.gms.internal.ads.zzayk {
    private com.google.android.gms.internal.ads.zzcex zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzcnd zzc;
    private final com.google.android.gms.common.util.Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final com.google.android.gms.internal.ads.zzcng zzg = new com.google.android.gms.internal.ads.zzcng();

    public zzcnr(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcnd zzcndVar, com.google.android.gms.common.util.Clock clock) {
        this.zzb = executor;
        this.zzc = zzcndVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final org.json.JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcnq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzd(jSONObjectZzb);
                    }
                });
            }
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    final /* synthetic */ void zzd(org.json.JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(com.google.android.gms.internal.ads.zzayj zzayjVar) {
        boolean z = this.zzf ? false : zzayjVar.zzj;
        com.google.android.gms.internal.ads.zzcng zzcngVar = this.zzg;
        zzcngVar.zza = z;
        zzcngVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzayjVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zza = zzcexVar;
    }
}
