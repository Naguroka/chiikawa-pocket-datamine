package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzekn implements com.google.android.gms.ads.admanager.AppEventListener, com.google.android.gms.internal.ads.zzcyq, com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzcwn, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzcvt, com.google.android.gms.internal.ads.zzcye, com.google.android.gms.internal.ads.zzcwj, com.google.android.gms.internal.ads.zzdds {
    final com.google.android.gms.internal.ads.zzdrw zza;
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zze = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzf = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzg = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicBoolean zzh = new java.util.concurrent.atomic.AtomicBoolean(true);
    private final java.util.concurrent.atomic.AtomicBoolean zzi = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean zzj = new java.util.concurrent.atomic.AtomicBoolean(false);
    final java.util.concurrent.BlockingQueue zzb = new java.util.concurrent.ArrayBlockingQueue(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziK)).intValue());

    public zzekn(com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = zzdrwVar;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            for (final android.util.Pair pair : this.zzb) {
                com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzejy
                    @Override // com.google.android.gms.internal.ads.zzeys
                    public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                        android.util.Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcm) obj).zzc((java.lang.String) pair2.first, (java.lang.String) pair2.second);
                    }
                });
            }
            this.zzb.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkE)).booleanValue()) {
            return;
        }
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzekl());
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final java.lang.String str, final java.lang.String str2) {
        if (!this.zzh.get()) {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzekf
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzcm) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new android.util.Pair(str, str2))) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("The queue for app events is full, dropping the new event.");
            com.google.android.gms.internal.ads.zzdrw zzdrwVar = this.zza;
            if (zzdrwVar != null) {
                com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = zzdrwVar.zza();
                zzdrvVarZza.zzb("action", "dae_action");
                zzdrvVarZza.zzb("dae_name", str);
                zzdrvVarZza.zzb("dae_data", str2);
                zzdrvVarZza.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzejv
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzd();
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzg, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzejw
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzekg
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzeki
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzj();
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzg, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzekj
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zzf();
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzg, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzekk
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkE)).booleanValue()) {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzekl());
        }
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzg, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzejx
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(com.google.android.gms.internal.ads.zzbvw zzbvwVar, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzejz
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzf(zzeVar);
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zze(zzeVar.zza);
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzf, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzekb
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbo) obj).zzb(zzeVar);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbl zzg() {
        return (com.google.android.gms.ads.internal.client.zzbl) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzh(final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        com.google.android.gms.internal.ads.zzeyt.zza(this.zze, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzekm
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdr) obj).zze(zzuVar);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcm zzi() {
        return (com.google.android.gms.ads.internal.client.zzcm) this.zzd.get();
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        this.zzc.set(zzblVar);
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzbo zzboVar) {
        this.zzf.set(zzboVar);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zze.set(zzdrVar);
    }

    public final void zzm(com.google.android.gms.ads.internal.client.zzcm zzcmVar) {
        this.zzd.set(zzcmVar);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzct zzctVar) {
        this.zzg.set(zzctVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzg, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zzd(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzeju
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzs() {
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzekc
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzi();
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzf, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzekd
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbo) obj).zzc();
            }
        });
        this.zzj.set(true);
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzekh
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzk();
            }
        });
    }
}
