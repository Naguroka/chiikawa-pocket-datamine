package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzac extends com.google.android.gms.measurement.internal.zzab {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzae zza;
    private final com.google.android.gms.internal.measurement.zzfr zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(com.google.android.gms.measurement.internal.zzae zzaeVar, java.lang.String str, int i, com.google.android.gms.internal.measurement.zzfr zzfrVar) {
        super(str, i);
        this.zza = zzaeVar;
        this.zzh = zzfrVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final int zza() {
        return this.zzh.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzc() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean zzd(java.lang.Long l, java.lang.Long l2, com.google.android.gms.internal.measurement.zzio zzioVar, boolean z) {
        com.google.android.gms.internal.measurement.zzpq.zzb();
        com.google.android.gms.measurement.internal.zzio zzioVar2 = this.zza.zzu;
        boolean zZzx = zzioVar2.zzf().zzx(this.zzb, com.google.android.gms.measurement.internal.zzgi.zzaC);
        com.google.android.gms.internal.measurement.zzfr zzfrVar = this.zzh;
        boolean zZzg = zzfrVar.zzg();
        boolean zZzh = zzfrVar.zzh();
        boolean zZzi = zzfrVar.zzi();
        java.lang.Object[] objArr = zZzg || zZzh || zZzi;
        java.lang.Boolean boolZzj = null;
        boolZzj = null;
        boolZzj = null;
        boolZzj = null;
        boolZzj = null;
        if (z && objArr != true) {
            zzioVar2.zzaW().zzj().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", java.lang.Integer.valueOf(this.zzc), zzfrVar.zzj() ? java.lang.Integer.valueOf(zzfrVar.zza()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzfl zzflVarZzb = zzfrVar.zzb();
        boolean zZzg2 = zzflVarZzb.zzg();
        if (zzioVar.zzt()) {
            if (zzflVarZzb.zzi()) {
                boolZzj = zzj(zzh(zzioVar.zzc(), zzflVarZzb.zzc()), zZzg2);
            } else {
                zzioVar2.zzaW().zzk().zzb("No number filter for long property. property", zzioVar2.zzj().zzf(zzioVar.zzg()));
            }
        } else if (zzioVar.zzr()) {
            if (zzflVarZzb.zzi()) {
                boolZzj = zzj(zzg(zzioVar.zza(), zzflVarZzb.zzc()), zZzg2);
            } else {
                zzioVar2.zzaW().zzk().zzb("No number filter for double property. property", zzioVar2.zzj().zzf(zzioVar.zzg()));
            }
        } else if (!zzioVar.zzv()) {
            zzioVar2.zzaW().zzk().zzb("User property has no value, property", zzioVar2.zzj().zzf(zzioVar.zzg()));
        } else if (zzflVarZzb.zzk()) {
            boolZzj = zzj(zzf(zzioVar.zzh(), zzflVarZzb.zzd(), zzioVar2.zzaW()), zZzg2);
        } else if (!zzflVarZzb.zzi()) {
            zzioVar2.zzaW().zzk().zzb("No string or number filter defined. property", zzioVar2.zzj().zzf(zzioVar.zzg()));
        } else if (com.google.android.gms.measurement.internal.zzqa.zzA(zzioVar.zzh())) {
            boolZzj = zzj(zzi(zzioVar.zzh(), zzflVarZzb.zzc()), zZzg2);
        } else {
            zzioVar2.zzaW().zzk().zzc("Invalid user property value for Numeric number filter. property, value", zzioVar2.zzj().zzf(zzioVar.zzg()), zzioVar.zzh());
        }
        zzioVar2.zzaW().zzj().zzb("Property filter result", boolZzj == null ? "null" : boolZzj);
        if (boolZzj == null) {
            return false;
        }
        this.zzd = true;
        if (zZzi && !boolZzj.booleanValue()) {
            return true;
        }
        if (!z || zzfrVar.zzg()) {
            this.zze = boolZzj;
        }
        if (boolZzj.booleanValue() && objArr != false && zzioVar.zzu()) {
            long jZzd = zzioVar.zzd();
            if (l != null) {
                jZzd = l.longValue();
            }
            if (zZzx && zzfrVar.zzg() && !zzfrVar.zzh() && l2 != null) {
                jZzd = l2.longValue();
            }
            if (zzfrVar.zzh()) {
                this.zzg = java.lang.Long.valueOf(jZzd);
            } else {
                this.zzf = java.lang.Long.valueOf(jZzd);
            }
        }
        return true;
    }
}
