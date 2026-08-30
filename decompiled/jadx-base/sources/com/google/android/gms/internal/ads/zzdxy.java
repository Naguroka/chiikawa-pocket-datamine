package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdxy extends com.google.android.gms.internal.ads.zzdxs {
    private java.lang.String zzg;
    private int zzh = 1;

    zzdxy(android.content.Context context) {
        this.zzf = new com.google.android.gms.internal.ads.zzbup(context, com.google.android.gms.ads.internal.zzv.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdxs, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new com.google.android.gms.internal.ads.zzdyh(1));
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzdyh(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzbvkVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdxw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            }, com.google.android.gms.internal.ads.zzbzw.zzg);
            return this.zza;
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzdyh(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = str;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdxx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            }, com.google.android.gms.internal.ads.zzbzw.zzg);
            return this.zza;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i = this.zzh;
                    if (i == 2) {
                        this.zzf.zzp().zze(this.zze, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmM)).booleanValue() ? new com.google.android.gms.internal.ads.zzdxr(this.zza, this.zze) : new com.google.android.gms.internal.ads.zzdxq(this));
                    } else if (i == 3) {
                        this.zzf.zzp().zzh(this.zzg, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmM)).booleanValue() ? new com.google.android.gms.internal.ads.zzdxr(this.zza, this.zze) : new com.google.android.gms.internal.ads.zzdxq(this));
                    } else {
                        this.zza.zzd(new com.google.android.gms.internal.ads.zzdyh(1));
                    }
                } catch (android.os.RemoteException | java.lang.IllegalArgumentException unused) {
                    this.zza.zzd(new com.google.android.gms.internal.ads.zzdyh(1));
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new com.google.android.gms.internal.ads.zzdyh(1));
                }
            }
        }
    }
}
