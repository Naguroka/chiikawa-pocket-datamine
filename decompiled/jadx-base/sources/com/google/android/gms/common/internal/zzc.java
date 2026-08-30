package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzc {
    private java.lang.Object zza;
    private boolean zzb = false;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzd;

    public zzc(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, java.lang.Object obj) {
        this.zzd = baseGmsClient;
        this.zza = obj;
    }

    protected abstract void zza(java.lang.Object obj);

    protected abstract void zzc();

    public final void zze() {
        java.lang.Object obj;
        synchronized (this) {
            obj = this.zza;
            if (this.zzb) {
                android.util.Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                zza(obj);
            } catch (java.lang.RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.zzb = true;
        }
        zzg();
    }

    public final void zzf() {
        synchronized (this) {
            this.zza = null;
        }
    }

    public final void zzg() {
        zzf();
        synchronized (this.zzd.zzt) {
            this.zzd.zzt.remove(this);
        }
    }
}
