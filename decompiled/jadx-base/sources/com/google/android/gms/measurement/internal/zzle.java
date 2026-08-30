package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzle implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzle(com.google.android.gms.measurement.internal.zzlw zzlwVar, long j) {
        this.zza = j;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zzb;
        zzlwVar.zzg();
        zzlwVar.zza();
        com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVar.zzu;
        zzioVar.zzaW().zzd().zza("Resetting analytics data (FE)");
        com.google.android.gms.measurement.internal.zzio zzioVar2 = zzlwVar.zzu;
        com.google.android.gms.measurement.internal.zzop zzopVarZzv = zzioVar2.zzv();
        zzopVarZzv.zzg();
        com.google.android.gms.measurement.internal.zzoo zzooVar = zzopVarZzv.zza;
        zzopVarZzv.zzb.zza();
        zzioVar2.zzh().zzq();
        boolean z = !zzlwVar.zzu.zzJ();
        com.google.android.gms.measurement.internal.zzht zzhtVarZzm = zzioVar.zzm();
        zzhtVarZzm.zzc.zzb(this.zza);
        com.google.android.gms.measurement.internal.zzio zzioVar3 = zzhtVarZzm.zzu;
        if (!android.text.TextUtils.isEmpty(zzioVar3.zzm().zzq.zza())) {
            zzhtVarZzm.zzq.zzb(null);
        }
        zzhtVarZzm.zzk.zzb(0L);
        zzhtVarZzm.zzl.zzb(0L);
        if (!zzioVar3.zzf().zzA()) {
            zzhtVarZzm.zzn(z);
        }
        zzhtVarZzm.zzr.zzb(null);
        zzhtVarZzm.zzs.zzb(0L);
        zzhtVarZzm.zzt.zzb(null);
        zzioVar2.zzu().zzO();
        zzioVar2.zzv().zza.zza();
        zzlwVar.zzc = z;
        zzioVar2.zzu().zzE(new java.util.concurrent.atomic.AtomicReference());
    }
}
