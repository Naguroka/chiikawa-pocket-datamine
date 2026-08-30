package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzkt implements com.google.common.util.concurrent.FutureCallback {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzov zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzkt(com.google.android.gms.measurement.internal.zzlw zzlwVar, com.google.android.gms.measurement.internal.zzov zzovVar) {
        this.zza = zzovVar;
        this.zzb = zzlwVar;
    }

    private final void zza() {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzb.zzu;
        android.util.SparseArray sparseArrayZze = zzioVar.zzm().zze();
        com.google.android.gms.measurement.internal.zzov zzovVar = this.zza;
        sparseArrayZze.put(zzovVar.zzc, java.lang.Long.valueOf(zzovVar.zzb));
        com.google.android.gms.measurement.internal.zzht zzhtVarZzm = zzioVar.zzm();
        int[] iArr = new int[sparseArrayZze.size()];
        long[] jArr = new long[sparseArrayZze.size()];
        for (int i = 0; i < sparseArrayZze.size(); i++) {
            iArr[i] = sparseArrayZze.keyAt(i);
            jArr[i] = ((java.lang.Long) sparseArrayZze.valueAt(i)).longValue();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        zzhtVarZzm.zzi.zzb(bundle);
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(java.lang.Throwable th) {
        com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zzb;
        zzlwVar.zzg();
        zzlwVar.zzi = false;
        com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVar.zzu;
        int iZzaq = (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaZ) ? com.google.android.gms.measurement.internal.zzlw.zzaq(zzlwVar, th) : 2) - 1;
        if (iZzaq == 0) {
            zzioVar.zzaW().zzk().zzc("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", com.google.android.gms.measurement.internal.zzhe.zzn(zzlwVar.zzu.zzh().zzm()), com.google.android.gms.measurement.internal.zzhe.zzn(th.toString()));
            zzlwVar.zzj = 1;
            zzlwVar.zzy().add(this.zza);
            return;
        }
        if (iZzaq != 1) {
            zzioVar.zzaW().zze().zzc("registerTriggerAsync failed. Dropping URI. App ID, Throwable", com.google.android.gms.measurement.internal.zzhe.zzn(zzlwVar.zzu.zzh().zzm()), th);
            zza();
            zzlwVar.zzj = 1;
            zzlwVar.zzU();
            return;
        }
        zzlwVar.zzy().add(this.zza);
        if (zzlwVar.zzj > ((java.lang.Integer) com.google.android.gms.measurement.internal.zzgi.zzav.zza(null)).intValue()) {
            zzlwVar.zzj = 1;
            zzioVar.zzaW().zzk().zzc("registerTriggerAsync failed. May try later. App ID, throwable", com.google.android.gms.measurement.internal.zzhe.zzn(zzlwVar.zzu.zzh().zzm()), com.google.android.gms.measurement.internal.zzhe.zzn(th.toString()));
        } else {
            zzioVar.zzaW().zzk().zzd("registerTriggerAsync failed. App ID, delay in seconds, throwable", com.google.android.gms.measurement.internal.zzhe.zzn(zzlwVar.zzu.zzh().zzm()), com.google.android.gms.measurement.internal.zzhe.zzn(java.lang.String.valueOf(zzlwVar.zzj)), com.google.android.gms.measurement.internal.zzhe.zzn(th.toString()));
            com.google.android.gms.measurement.internal.zzlw.zzF(zzlwVar, zzlwVar.zzj);
            int i = zzlwVar.zzj;
            zzlwVar.zzj = i + i;
        }
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(java.lang.Object obj) {
        com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zzb;
        zzlwVar.zzg();
        zza();
        zzlwVar.zzi = false;
        zzlwVar.zzj = 1;
        zzlwVar.zzu.zzaW().zzd().zzb("Successfully registered trigger URI", this.zza.zza);
        zzlwVar.zzU();
    }
}
