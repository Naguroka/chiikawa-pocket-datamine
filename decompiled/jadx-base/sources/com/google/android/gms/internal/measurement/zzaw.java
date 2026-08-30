package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaw {
    final java.util.List zza = new java.util.ArrayList();

    protected zzaw() {
    }

    public abstract com.google.android.gms.internal.measurement.zzap zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list);

    final com.google.android.gms.internal.measurement.zzap zzb(java.lang.String str) {
        if (this.zza.contains(com.google.android.gms.internal.measurement.zzh.zze(str))) {
            throw new java.lang.UnsupportedOperationException("Command not implemented: ".concat(java.lang.String.valueOf(str)));
        }
        throw new java.lang.IllegalArgumentException("Command not supported");
    }
}
