package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgg {
    private static final java.lang.Object zza = new java.lang.Object();
    private final java.lang.String zzb;
    private final com.google.android.gms.measurement.internal.zzge zzc;
    private final java.lang.Object zzd;
    private final java.lang.Object zze = new java.lang.Object();
    private volatile java.lang.Object zzf = null;
    private volatile java.lang.Object zzg = null;

    /* synthetic */ zzgg(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, com.google.android.gms.measurement.internal.zzge zzgeVar, com.google.android.gms.measurement.internal.zzgh zzghVar) {
        this.zzb = str;
        this.zzd = obj;
        this.zzc = zzgeVar;
    }

    public final java.lang.Object zza(java.lang.Object obj) {
        synchronized (this.zze) {
        }
        if (obj != null) {
            return obj;
        }
        if (com.google.android.gms.measurement.internal.zzgf.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (com.google.android.gms.measurement.internal.zzaf.zza()) {
                return this.zzg == null ? this.zzd : this.zzg;
            }
            try {
                for (com.google.android.gms.measurement.internal.zzgg zzggVar : com.google.android.gms.measurement.internal.zzgi.zzbs) {
                    if (com.google.android.gms.measurement.internal.zzaf.zza()) {
                        throw new java.lang.IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    java.lang.Object objZza = null;
                    try {
                        com.google.android.gms.measurement.internal.zzge zzgeVar = zzggVar.zzc;
                        if (zzgeVar != null) {
                            objZza = zzgeVar.zza();
                        }
                    } catch (java.lang.IllegalStateException unused) {
                    }
                    synchronized (zza) {
                        zzggVar.zzg = objZza;
                    }
                }
            } catch (java.lang.SecurityException unused2) {
            }
            com.google.android.gms.measurement.internal.zzge zzgeVar2 = this.zzc;
            if (zzgeVar2 != null) {
                try {
                    return zzgeVar2.zza();
                } catch (java.lang.IllegalStateException | java.lang.SecurityException unused3) {
                }
            }
            return this.zzd;
        }
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }
}
