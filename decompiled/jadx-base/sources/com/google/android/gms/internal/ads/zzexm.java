package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzexm implements com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzcxs, com.google.android.gms.internal.ads.zzezc, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzcye, com.google.android.gms.internal.ads.zzcwj, com.google.android.gms.internal.ads.zzdds {
    private final com.google.android.gms.internal.ads.zzfds zza;
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zze = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzf = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzg = new java.util.concurrent.atomic.AtomicReference();
    private com.google.android.gms.internal.ads.zzexm zzh = null;

    public zzexm(com.google.android.gms.internal.ads.zzfds zzfdsVar) {
        this.zza = zzfdsVar;
    }

    public static com.google.android.gms.internal.ads.zzexm zzi(com.google.android.gms.internal.ads.zzexm zzexmVar) {
        com.google.android.gms.internal.ads.zzexm zzexmVar2 = new com.google.android.gms.internal.ads.zzexm(zzexmVar.zza);
        zzexmVar2.zzh = zzexmVar;
        return zzexmVar2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        com.google.android.gms.internal.ads.zzexm zzexmVar = this.zzh;
        if (zzexmVar != null) {
            zzexmVar.zzdd();
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzexd
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbak) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        com.google.android.gms.internal.ads.zzexm zzexmVar = this.zzh;
        if (zzexmVar != null) {
            zzexmVar.zzdo();
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzf, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzexa
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdo();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        com.google.android.gms.internal.ads.zzexm zzexmVar = this.zzh;
        if (zzexmVar != null) {
            zzexmVar.zzdp();
            return;
        }
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzf, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzexl
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdp();
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzewy
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbak) obj).zzf();
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzewz
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbak) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        com.google.android.gms.internal.ads.zzexm zzexmVar = this.zzh;
        if (zzexmVar != null) {
            zzexmVar.zzdr();
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzf, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzexk
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdr();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(final int i) {
        com.google.android.gms.internal.ads.zzexm zzexmVar = this.zzh;
        if (zzexmVar != null) {
            zzexmVar.zzds(i);
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzf, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzexg
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzds(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxs
    public final void zzg() {
        com.google.android.gms.internal.ads.zzexm zzexmVar = this.zzh;
        if (zzexmVar != null) {
            zzexmVar.zzg();
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zze, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzexj
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.zzcxs) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzh(final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        com.google.android.gms.internal.ads.zzexm zzexmVar = this.zzh;
        if (zzexmVar != null) {
            zzexmVar.zzh(zzuVar);
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzg, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzewx
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdr) obj).zze(zzuVar);
                }
            });
        }
    }

    public final void zzj() {
        com.google.android.gms.internal.ads.zzexm zzexmVar = this.zzh;
        if (zzexmVar != null) {
            zzexmVar.zzj();
            return;
        }
        this.zza.zza();
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbah) obj).zza();
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzexf
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbak) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezc
    public final void zzl(com.google.android.gms.internal.ads.zzezc zzezcVar) {
        this.zzh = (com.google.android.gms.internal.ads.zzexm) zzezcVar;
    }

    public final void zzm(com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zzf.set(zzrVar);
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zzg.set(zzdrVar);
    }

    public final void zzo(com.google.android.gms.internal.ads.zzbag zzbagVar) {
        this.zzb.set(zzbagVar);
    }

    public final void zzp(com.google.android.gms.internal.ads.zzbak zzbakVar) {
        this.zzd.set(zzbakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzexm zzexmVar = this.zzh;
        if (zzexmVar != null) {
            zzexmVar.zzq(zzeVar);
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzexb
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbak) obj).zzd(zzeVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
    }

    public final void zzk(final com.google.android.gms.internal.ads.zzbad zzbadVar) {
        com.google.android.gms.internal.ads.zzexm zzexmVar = this.zzh;
        if (zzexmVar != null) {
            zzexmVar.zzk(zzbadVar);
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzb, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzexc
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbag) obj).zzd(zzbadVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzexm zzexmVar = this.zzh;
        if (zzexmVar != null) {
            zzexmVar.zzdz(zzeVar);
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzb, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzexh
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbag) obj).zzc(zzeVar);
                }
            });
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzb, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzexi
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbag) obj).zzb(zzeVar.zza);
                }
            });
        }
    }
}
