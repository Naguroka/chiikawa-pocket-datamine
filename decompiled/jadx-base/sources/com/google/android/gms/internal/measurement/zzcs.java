package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcs extends com.google.android.gms.internal.measurement.zzcx {
    private final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    private boolean zzb;

    public static final java.lang.Object zzf(android.os.Bundle bundle, java.lang.Class cls) {
        java.lang.Object obj;
        if (bundle == null || (obj = bundle.get(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ)) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (java.lang.ClassCastException e) {
            android.util.Log.w("AM", java.lang.String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    public final android.os.Bundle zzb(long j) {
        android.os.Bundle bundle;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            if (!this.zzb) {
                try {
                    atomicReference.wait(j);
                } catch (java.lang.InterruptedException unused) {
                    return null;
                }
            }
            bundle = (android.os.Bundle) this.zza.get();
        }
        return bundle;
    }

    public final java.lang.Long zzc(long j) {
        return (java.lang.Long) zzf(zzb(j), java.lang.Long.class);
    }

    public final java.lang.String zzd(long j) {
        return (java.lang.String) zzf(zzb(j), java.lang.String.class);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void zze(android.os.Bundle bundle) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.zzb = true;
                    this.zza.notify();
                } catch (java.lang.Throwable th) {
                    this.zza.notify();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }
}
