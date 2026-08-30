package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlo {
    private final java.lang.Object zza;
    private final int zzb;

    zzlo(java.lang.Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzlo)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzlo zzloVar = (com.google.android.gms.internal.measurement.zzlo) obj;
        return this.zza == zzloVar.zza && this.zzb == zzloVar.zzb;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
