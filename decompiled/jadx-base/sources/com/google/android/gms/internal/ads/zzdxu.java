package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdxu extends com.google.android.gms.internal.ads.zzdxs {
    private final android.content.Context zzg;
    private final java.util.concurrent.Executor zzh;

    zzdxu(android.content.Context context, java.util.concurrent.Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new com.google.android.gms.internal.ads.zzbup(context, com.google.android.gms.ads.internal.zzv.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmM)).booleanValue() ? new com.google.android.gms.internal.ads.zzdxr(this.zza, this.zze) : new com.google.android.gms.internal.ads.zzdxq(this));
                } catch (android.os.RemoteException | java.lang.IllegalArgumentException unused) {
                    this.zza.zzd(new com.google.android.gms.internal.ads.zzdyh(1));
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new com.google.android.gms.internal.ads.zzdyh(1));
                }
            }
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbvkVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdxt
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            }, com.google.android.gms.internal.ads.zzbzw.zzg);
            zzc(this.zzg, this.zza, this.zzh);
            return this.zza;
        }
    }
}
