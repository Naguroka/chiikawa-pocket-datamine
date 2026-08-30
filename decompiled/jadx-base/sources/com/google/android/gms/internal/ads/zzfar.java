package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfar implements com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener, com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzcvt, com.google.android.gms.internal.ads.zzcwj, com.google.android.gms.internal.ads.zzcye, com.google.android.gms.internal.ads.zzezc, com.google.android.gms.internal.ads.zzdds {
    private final com.google.android.gms.internal.ads.zzfds zza;
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zze = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzf = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzg = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzh = new java.util.concurrent.atomic.AtomicReference();
    private com.google.android.gms.internal.ads.zzfar zzi = null;

    public zzfar(com.google.android.gms.internal.ads.zzfds zzfdsVar) {
        this.zza = zzfdsVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        com.google.android.gms.internal.ads.zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.onAdMetadataChanged();
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzb, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfaf
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) {
                    ((com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        com.google.android.gms.internal.ads.zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zza();
            return;
        }
        this.zza.zza();
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfan
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbws) obj).zzg();
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zze, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfao
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbwc) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        com.google.android.gms.internal.ads.zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzdd();
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfag
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbws) obj).zze();
                }
            });
        }
    }

    public final void zzg(com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzh(final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        com.google.android.gms.internal.ads.zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzh(zzuVar);
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzh, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfac
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdr) obj).zze(zzuVar);
                }
            });
        }
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zzh.set(zzdrVar);
    }

    public final void zzj(com.google.android.gms.internal.ads.zzbws zzbwsVar) {
        this.zzd.set(zzbwsVar);
    }

    public final void zzk(com.google.android.gms.internal.ads.zzbww zzbwwVar) {
        this.zzc.set(zzbwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzezc
    public final void zzl(com.google.android.gms.internal.ads.zzezc zzezcVar) {
        this.zzi = (com.google.android.gms.internal.ads.zzfar) zzezcVar;
    }

    @java.lang.Deprecated
    public final void zzm(com.google.android.gms.internal.ads.zzbwc zzbwcVar) {
        this.zze.set(zzbwcVar);
    }

    @java.lang.Deprecated
    public final void zzn(com.google.android.gms.internal.ads.zzbvx zzbvxVar) {
        this.zzg.set(zzbvxVar);
    }

    public final void zzo(com.google.android.gms.internal.ads.zzbwx zzbwxVar) {
        this.zzf.set(zzbwxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzq(zzeVar);
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfah
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbws) obj).zzi(zzeVar);
                }
            });
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfai
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbws) obj).zzh(zzeVar.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
        com.google.android.gms.internal.ads.zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzb();
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zze, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfap
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbwc) obj).zzh();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
        com.google.android.gms.internal.ads.zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zze();
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zze, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfaj
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbwc) obj).zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
        com.google.android.gms.internal.ads.zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzf();
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zze, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzezv
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbwc) obj).zzl();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        com.google.android.gms.internal.ads.zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzs();
        } else {
            com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfad
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbww) obj).zzg();
                }
            });
            com.google.android.gms.internal.ads.zzeyt.zza(this.zze, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfae
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                    ((com.google.android.gms.internal.ads.zzbwc) obj).zzi();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        com.google.android.gms.internal.ads.zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzc();
            return;
        }
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbws) obj).zzj();
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zze, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfaa
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbwc) obj).zzj();
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfab
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbws) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(final com.google.android.gms.internal.ads.zzbvw zzbvwVar, final java.lang.String str, final java.lang.String str2) {
        com.google.android.gms.internal.ads.zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzdq(zzbvwVar, str, str2);
            return;
        }
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzd, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfaq
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                com.google.android.gms.internal.ads.zzbvw zzbvwVar2 = zzbvwVar;
                ((com.google.android.gms.internal.ads.zzbws) obj).zzk(new com.google.android.gms.internal.ads.zzbxg(zzbvwVar2.zzc(), zzbvwVar2.zzb()));
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzf, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzezw
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                com.google.android.gms.internal.ads.zzbvw zzbvwVar2 = zzbvwVar;
                ((com.google.android.gms.internal.ads.zzbwx) obj).zze(new com.google.android.gms.internal.ads.zzbxg(zzbvwVar2.zzc(), zzbvwVar2.zzb()), str, str2);
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zze, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzezx
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbwc) obj).zze(zzbvwVar);
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzg, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbvx) obj).zze(zzbvwVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzdz(zzeVar);
            return;
        }
        final int i = zzeVar.zza;
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfak
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbww) obj).zzf(zzeVar);
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zzc, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfal
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbww) obj).zze(i);
            }
        });
        com.google.android.gms.internal.ads.zzeyt.zza(this.zze, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzfam
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.internal.ads.zzbwc) obj).zzg(i);
            }
        });
    }
}
