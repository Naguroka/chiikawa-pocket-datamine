package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbsn extends com.google.android.gms.ads.nativead.NativeAd {
    private final com.google.android.gms.internal.ads.zzbht zza;
    private final com.google.android.gms.internal.ads.zzbsm zzc;
    private final com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo zzd;
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.List zze = new java.util.ArrayList();

    public zzbsn(com.google.android.gms.internal.ads.zzbht zzbhtVar) {
        com.google.android.gms.internal.ads.zzbsm zzbsmVar;
        this.zza = zzbhtVar;
        com.google.android.gms.internal.ads.zzbsk zzbskVar = null;
        try {
            java.util.List listZzu = zzbhtVar.zzu();
            if (listZzu != null) {
                for (java.lang.Object obj : listZzu) {
                    com.google.android.gms.internal.ads.zzbfw zzbfwVarZzg = obj instanceof android.os.IBinder ? com.google.android.gms.internal.ads.zzbfv.zzg((android.os.IBinder) obj) : null;
                    if (zzbfwVarZzg != null) {
                        this.zzb.add(new com.google.android.gms.internal.ads.zzbsm(zzbfwVarZzg));
                    }
                }
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
        try {
            java.util.List listZzv = this.zza.zzv();
            if (listZzv != null) {
                for (java.lang.Object obj2 : listZzv) {
                    com.google.android.gms.ads.internal.client.zzdh zzdhVarZzb = obj2 instanceof android.os.IBinder ? com.google.android.gms.ads.internal.client.zzdg.zzb((android.os.IBinder) obj2) : null;
                    if (zzdhVarZzb != null) {
                        this.zze.add(new com.google.android.gms.ads.internal.client.zzdi(zzdhVarZzb));
                    }
                }
            }
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
        }
        try {
            com.google.android.gms.internal.ads.zzbfw zzbfwVarZzk = this.zza.zzk();
            zzbsmVar = zzbfwVarZzk != null ? new com.google.android.gms.internal.ads.zzbsm(zzbfwVarZzk) : null;
        } catch (android.os.RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e3);
        }
        this.zzc = zzbsmVar;
        try {
            if (this.zza.zzi() != null) {
                zzbskVar = new com.google.android.gms.internal.ads.zzbsk(this.zza.zzi());
            }
        } catch (android.os.RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
        }
        this.zzd = zzbskVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzw();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.zza.zzx();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zza.zzD();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getAdvertiser() {
        try {
            return this.zza.zzn();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getBody() {
        try {
            return this.zza.zzo();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getCallToAction() {
        try {
            return this.zza.zzp();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final android.os.Bundle getExtras() {
        try {
            android.os.Bundle bundleZzf = this.zza.zzf();
            if (bundleZzf != null) {
                return bundleZzf;
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getHeadline() {
        try {
            return this.zza.zzq();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.nativead.NativeAd.Image getIcon() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.MediaContent getMediaContent() {
        try {
            if (this.zza.zzj() != null) {
                return new com.google.android.gms.ads.internal.client.zzfd(this.zza.zzj(), null);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.util.List<com.google.android.gms.ads.MuteThisAdReason> getMuteThisAdReasons() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getPrice() {
        try {
            return this.zza.zzs();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzg;
        try {
            zzdyVarZzg = this.zza.zzg();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            zzdyVarZzg = null;
        }
        return com.google.android.gms.ads.ResponseInfo.zza(zzdyVarZzg);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.Double getStarRating() {
        try {
            double dZze = this.zza.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return java.lang.Double.valueOf(dZze);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getStore() {
        try {
            return this.zza.zzt();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzH();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzI();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(com.google.android.gms.ads.MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.zza.zzI()) {
                    if (muteThisAdReason == null) {
                        this.zza.zzy(null);
                        return;
                    } else if (muteThisAdReason instanceof com.google.android.gms.ads.internal.client.zzdi) {
                        this.zza.zzy(((com.google.android.gms.ads.internal.client.zzdi) muteThisAdReason).zza());
                        return;
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad is not custom mute enabled");
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(android.os.Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zza.zzA();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final void recordEvent(android.os.Bundle bundle) {
        try {
            this.zza.zzB(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to record native event", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(android.os.Bundle bundle) {
        try {
            return this.zza.zzJ(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(android.os.Bundle bundle) {
        try {
            this.zza.zzC(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(com.google.android.gms.ads.MuteThisAdListener muteThisAdListener) {
        try {
            this.zza.zzE(new com.google.android.gms.ads.internal.client.zzde(muteThisAdListener));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        try {
            this.zza.zzF(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zza.zzG(new com.google.android.gms.internal.ads.zzbsu(unconfirmedClickListener));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        try {
            return this.zza.zzm();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }
}
