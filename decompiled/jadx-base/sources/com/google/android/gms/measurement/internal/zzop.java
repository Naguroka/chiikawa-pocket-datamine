package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzop extends com.google.android.gms.measurement.internal.zzg {
    protected final com.google.android.gms.measurement.internal.zzoo zza;
    protected final com.google.android.gms.measurement.internal.zzon zzb;
    protected final com.google.android.gms.measurement.internal.zzol zzc;
    private android.os.Handler zzd;
    private boolean zze;

    zzop(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
        this.zze = true;
        this.zza = new com.google.android.gms.measurement.internal.zzoo(this);
        this.zzb = new com.google.android.gms.measurement.internal.zzon(this);
        this.zzc = new com.google.android.gms.measurement.internal.zzol(this);
    }

    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.measurement.internal.zzop zzopVar, long j) {
        zzopVar.zzg();
        zzopVar.zzq();
        com.google.android.gms.measurement.internal.zzio zzioVar = zzopVar.zzu;
        zzioVar.zzaW().zzj().zzb("Activity paused, time", java.lang.Long.valueOf(j));
        zzopVar.zzc.zza(j);
        if (zzioVar.zzf().zzz()) {
            zzopVar.zzb.zzb(j);
        }
    }

    static /* bridge */ /* synthetic */ void zzl(com.google.android.gms.measurement.internal.zzop zzopVar, long j) {
        zzopVar.zzg();
        zzopVar.zzq();
        com.google.android.gms.measurement.internal.zzio zzioVar = zzopVar.zzu;
        zzioVar.zzaW().zzj().zzb("Activity resumed, time", java.lang.Long.valueOf(j));
        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzba)) {
            if (zzioVar.zzf().zzz() || zzopVar.zze) {
                zzopVar.zzb.zzc(j);
            }
        } else if (zzioVar.zzf().zzz() || zzioVar.zzm().zzn.zzb()) {
            zzopVar.zzb.zzc(j);
        }
        zzopVar.zzc.zzb();
        com.google.android.gms.measurement.internal.zzoo zzooVar = zzopVar.zza;
        com.google.android.gms.measurement.internal.zzop zzopVar2 = zzooVar.zza;
        zzopVar2.zzg();
        if (zzopVar2.zzu.zzJ()) {
            zzooVar.zzb(zzopVar2.zzu.zzaU().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzcr(android.os.Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
        return false;
    }

    final void zzm(boolean z) {
        zzg();
        this.zze = z;
    }

    final boolean zzp() {
        zzg();
        return this.zze;
    }
}
