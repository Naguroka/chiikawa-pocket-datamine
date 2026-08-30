package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzaze {
    private final java.lang.Object zza = new java.lang.Object();
    private com.google.android.gms.internal.ads.zzazc zzb = null;
    private boolean zzc = false;

    public final android.app.Activity zza() {
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzazc zzazcVar = this.zzb;
            if (zzazcVar == null) {
                return null;
            }
            return zzazcVar.zza();
        }
    }

    public final android.content.Context zzb() {
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzazc zzazcVar = this.zzb;
            if (zzazcVar == null) {
                return null;
            }
            return zzazcVar.zzb();
        }
    }

    public final void zzc(com.google.android.gms.internal.ads.zzazd zzazdVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new com.google.android.gms.internal.ads.zzazc();
            }
            this.zzb.zzf(zzazdVar);
        }
    }

    public final void zzd(android.content.Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                android.content.Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
                if (application == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new com.google.android.gms.internal.ads.zzazc();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(com.google.android.gms.internal.ads.zzazd zzazdVar) {
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzazc zzazcVar = this.zzb;
            if (zzazcVar == null) {
                return;
            }
            zzazcVar.zzh(zzazdVar);
        }
    }
}
