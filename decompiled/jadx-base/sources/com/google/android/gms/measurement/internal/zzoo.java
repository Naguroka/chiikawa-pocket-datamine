package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzoo {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzop zza;

    zzoo(com.google.android.gms.measurement.internal.zzop zzopVar) {
        this.zza = zzopVar;
    }

    final void zza() {
        com.google.android.gms.measurement.internal.zzop zzopVar = this.zza;
        zzopVar.zzg();
        com.google.android.gms.measurement.internal.zzio zzioVar = zzopVar.zzu;
        if (zzioVar.zzm().zzp(zzioVar.zzaU().currentTimeMillis())) {
            zzioVar.zzm().zzg.zza(true);
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzioVar.zzaW().zzj().zza("Detected application was in foreground");
                zzc(zzioVar.zzaU().currentTimeMillis(), false);
            }
        }
    }

    final void zzb(long j, boolean z) {
        com.google.android.gms.measurement.internal.zzop zzopVar = this.zza;
        zzopVar.zzg();
        zzopVar.zzq();
        com.google.android.gms.measurement.internal.zzio zzioVar = zzopVar.zzu;
        if (zzioVar.zzm().zzp(j)) {
            zzioVar.zzm().zzg.zza(true);
            zzopVar.zzu.zzh().zzq();
        }
        zzioVar.zzm().zzk.zzb(j);
        if (zzioVar.zzm().zzg.zzb()) {
            zzc(j, z);
        }
    }

    final void zzc(long j, boolean z) {
        com.google.android.gms.measurement.internal.zzop zzopVar = this.zza;
        zzopVar.zzg();
        if (zzopVar.zzu.zzJ()) {
            com.google.android.gms.measurement.internal.zzio zzioVar = zzopVar.zzu;
            zzioVar.zzm().zzk.zzb(j);
            zzioVar.zzaW().zzj().zzb("Session started, time", java.lang.Long.valueOf(zzioVar.zzaU().elapsedRealtime()));
            com.google.android.gms.measurement.internal.zzio zzioVar2 = zzopVar.zzu;
            java.lang.Long lValueOf = java.lang.Long.valueOf(j / 1000);
            zzioVar2.zzq().zzan("auto", "_sid", lValueOf, j);
            zzioVar.zzm().zzl.zzb(lValueOf.longValue());
            zzioVar.zzm().zzg.zza(false);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            zzioVar2.zzq().zzS("auto", "_s", j, bundle);
            java.lang.String strZza = zzioVar.zzm().zzq.zza();
            if (android.text.TextUtils.isEmpty(strZza)) {
                return;
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("_ffr", strZza);
            zzioVar2.zzq().zzS("auto", "_ssr", j, bundle2);
        }
    }
}
