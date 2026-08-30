package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcnh implements com.google.android.gms.internal.ads.zzayk, com.google.android.gms.internal.ads.zzcwo, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzcwn {
    private final com.google.android.gms.internal.ads.zzcnc zza;
    private final com.google.android.gms.internal.ads.zzcnd zzb;
    private final com.google.android.gms.internal.ads.zzbos zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.common.util.Clock zzf;
    private final java.util.Set zzc = new java.util.HashSet();
    private final java.util.concurrent.atomic.AtomicBoolean zzg = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.google.android.gms.internal.ads.zzcng zzh = new com.google.android.gms.internal.ads.zzcng();
    private boolean zzi = false;
    private java.lang.ref.WeakReference zzj = new java.lang.ref.WeakReference(this);

    public zzcnh(com.google.android.gms.internal.ads.zzbop zzbopVar, com.google.android.gms.internal.ads.zzcnd zzcndVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcnc zzcncVar, com.google.android.gms.common.util.Clock clock) {
        this.zza = zzcncVar;
        this.zzd = zzbopVar.zza("google.afma.activeView.handleUpdate", com.google.android.gms.internal.ads.zzbod.zza, com.google.android.gms.internal.ads.zzbod.zza);
        this.zzb = zzcndVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        java.util.Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((com.google.android.gms.internal.ads.zzcex) it.next());
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdE() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final synchronized void zzdh(android.content.Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdi() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final synchronized void zzdj(android.content.Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final synchronized void zzdk(android.content.Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final synchronized void zzdn(com.google.android.gms.internal.ads.zzayj zzayjVar) {
        com.google.android.gms.internal.ads.zzcng zzcngVar = this.zzh;
        zzcngVar.zza = zzayjVar.zzj;
        zzcngVar.zzf = zzayjVar;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
    }

    public final synchronized void zzg() {
        if (this.zzj.get() == null) {
            zzj();
            return;
        }
        if (this.zzi || !this.zzg.get()) {
            return;
        }
        try {
            this.zzh.zzd = this.zzf.elapsedRealtime();
            final org.json.JSONObject jSONObjectZza = this.zzb.zzb(this.zzh);
            for (final com.google.android.gms.internal.ads.zzcex zzcexVar : this.zzc) {
                this.zze.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcnf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcexVar.zzl("AFMA_updateActiveView", jSONObjectZza);
                    }
                });
            }
            com.google.android.gms.internal.ads.zzbzz.zzb(this.zzd.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
        }
    }

    public final synchronized void zzh(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zzc.add(zzcexVar);
        this.zza.zzd(zzcexVar);
    }

    public final void zzi(java.lang.Object obj) {
        this.zzj = new java.lang.ref.WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final synchronized void zzr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
