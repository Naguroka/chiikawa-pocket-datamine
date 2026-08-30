package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzon {
    protected long zza;
    protected long zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzop zzc;
    private final com.google.android.gms.measurement.internal.zzaz zzd;

    public zzon(com.google.android.gms.measurement.internal.zzop zzopVar) {
        this.zzc = zzopVar;
        this.zzd = new com.google.android.gms.measurement.internal.zzom(this, zzopVar.zzu);
        long jElapsedRealtime = zzopVar.zzu.zzaU().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    final void zza() {
        this.zzd.zzb();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzc.zzu;
        long jElapsedRealtime = zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbb) ? zzioVar.zzaU().elapsedRealtime() : 0L;
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    final void zzb(long j) {
        this.zzd.zzb();
    }

    final void zzc(long j) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j;
        this.zzb = j;
    }

    public final boolean zzd(boolean z, boolean z2, long j) {
        com.google.android.gms.measurement.internal.zzop zzopVar = this.zzc;
        zzopVar.zzg();
        zzopVar.zza();
        if (zzopVar.zzu.zzJ()) {
            com.google.android.gms.measurement.internal.zzio zzioVar = zzopVar.zzu;
            zzioVar.zzm().zzk.zzb(zzioVar.zzaU().currentTimeMillis());
        }
        long j2 = j - this.zza;
        if (!z && j2 < 1000) {
            zzopVar.zzu.zzaW().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", java.lang.Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.zzb;
            this.zzb = j;
        }
        com.google.android.gms.measurement.internal.zzio zzioVar2 = zzopVar.zzu;
        zzioVar2.zzaW().zzj().zzb("Recording user engagement, ms", java.lang.Long.valueOf(j2));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !zzioVar2.zzf().zzz();
        com.google.android.gms.measurement.internal.zzio zzioVar3 = zzopVar.zzu;
        com.google.android.gms.measurement.internal.zzqf.zzN(zzioVar3.zzt().zzj(z3), bundle, true);
        if (!z2) {
            zzioVar3.zzq().zzR("auto", "_e", bundle);
        }
        this.zza = j;
        com.google.android.gms.measurement.internal.zzaz zzazVar = this.zzd;
        zzazVar.zzb();
        zzazVar.zzd(((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzap.zza(null)).longValue());
        return true;
    }
}
