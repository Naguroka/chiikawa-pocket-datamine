package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzok implements java.lang.Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzol zzc;

    zzok(com.google.android.gms.measurement.internal.zzol zzolVar, long j, long j2) {
        this.zzc = zzolVar;
        this.zza = j;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzu.zzaX().zzq(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzoj
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzok zzokVar = this.zza;
                com.google.android.gms.measurement.internal.zzop zzopVar = zzokVar.zzc.zza;
                long j = zzokVar.zza;
                long j2 = zzokVar.zzb;
                zzopVar.zzg();
                com.google.android.gms.measurement.internal.zzio zzioVar = zzopVar.zzu;
                zzioVar.zzaW().zzd().zza("Application going to the background");
                zzioVar.zzm().zzn.zza(true);
                zzopVar.zzm(true);
                if (!zzioVar.zzf().zzz()) {
                    com.google.android.gms.measurement.internal.zzon zzonVar = zzopVar.zzb;
                    zzonVar.zzd(false, false, j2);
                    zzonVar.zzb(j2);
                }
                zzioVar.zzaW().zzi().zzb("Application backgrounded at: timestamp_millis", java.lang.Long.valueOf(j));
                com.google.android.gms.measurement.internal.zzio zzioVar2 = zzopVar.zzu;
                com.google.android.gms.measurement.internal.zzlw zzlwVarZzq = zzioVar2.zzq();
                zzlwVarZzq.zzg();
                com.google.android.gms.measurement.internal.zzio zzioVar3 = zzlwVarZzq.zzu;
                zzlwVarZzq.zza();
                com.google.android.gms.measurement.internal.zzny zznyVarZzu = zzioVar3.zzu();
                zznyVarZzu.zzg();
                zznyVarZzu.zza();
                if (!zznyVarZzu.zzad() || zznyVarZzu.zzu.zzw().zzm() >= 242600) {
                    zzioVar3.zzu().zzz();
                }
                if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaS)) {
                    long jZzk = zzioVar.zzw().zzak(zzioVar.zzaT().getPackageName(), zzioVar.zzf().zzs()) ? 1000L : zzioVar.zzf().zzk(zzioVar.zzaT().getPackageName(), com.google.android.gms.measurement.internal.zzgi.zzD);
                    zzioVar.zzaW().zzj().zzb("[sgtm] Scheduling batch upload with minimum latency in millis", java.lang.Long.valueOf(jZzk));
                    zzioVar2.zzs().zzj(jZzk);
                }
            }
        });
    }
}
