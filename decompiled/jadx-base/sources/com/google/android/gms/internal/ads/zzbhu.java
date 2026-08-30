package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbhu extends com.google.android.gms.ads.formats.UnifiedNativeAd {
    private final com.google.android.gms.internal.ads.zzbht zza;
    private final com.google.android.gms.internal.ads.zzbfx zzc;
    private final java.util.List zzb = new java.util.ArrayList();
    private final com.google.android.gms.ads.VideoController zzd = new com.google.android.gms.ads.VideoController();
    private final java.util.List zze = new java.util.ArrayList();

    public zzbhu(com.google.android.gms.internal.ads.zzbht zzbhtVar) {
        com.google.android.gms.internal.ads.zzbfw zzbfuVar;
        android.os.IBinder iBinder;
        this.zza = zzbhtVar;
        com.google.android.gms.internal.ads.zzbfx zzbfxVar = null;
        try {
            java.util.List listZzu = zzbhtVar.zzu();
            if (listZzu != null) {
                for (java.lang.Object obj : listZzu) {
                    if (!(obj instanceof android.os.IBinder) || (iBinder = (android.os.IBinder) obj) == null) {
                        zzbfuVar = null;
                    } else {
                        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbfuVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbfw ? (com.google.android.gms.internal.ads.zzbfw) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbfu(iBinder);
                    }
                    if (zzbfuVar != null) {
                        this.zzb.add(new com.google.android.gms.internal.ads.zzbfx(zzbfuVar));
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
            if (zzbfwVarZzk != null) {
                zzbfxVar = new com.google.android.gms.internal.ads.zzbfx(zzbfwVarZzk);
            }
        } catch (android.os.RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e3);
        }
        this.zzc = zzbfxVar;
        try {
            if (this.zza.zzi() != null) {
                new com.google.android.gms.internal.ads.zzbfq(this.zza.zzi());
            }
        } catch (android.os.RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(android.os.Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(android.os.Bundle bundle) {
        try {
            return this.zza.zzJ(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(android.os.Bundle bundle) {
        try {
            this.zza.zzC(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final com.google.android.gms.ads.VideoController zza() {
        try {
            if (this.zza.zzh() != null) {
                this.zzd.zzb(this.zza.zzh());
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception occurred while getting video controller", e);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final com.google.android.gms.ads.formats.NativeAd.Image zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.Double zzc() {
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

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.Object zzd() {
        try {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzl = this.zza.zzl();
            if (iObjectWrapperZzl != null) {
                return com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzl);
            }
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zze() {
        try {
            return this.zza.zzn();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzf() {
        try {
            return this.zza.zzo();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzg() {
        try {
            return this.zza.zzp();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzh() {
        try {
            return this.zza.zzq();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzi() {
        try {
            return this.zza.zzs();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzj() {
        try {
            return this.zza.zzt();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.util.List zzk() {
        return this.zzb;
    }
}
