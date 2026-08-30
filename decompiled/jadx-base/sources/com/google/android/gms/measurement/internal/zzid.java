package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzid implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzif zza;

    zzid(com.google.android.gms.measurement.internal.zzif zzifVar) {
        this.zza = zzifVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, java.lang.String str, java.util.List list, boolean z, boolean z2) {
        com.google.android.gms.measurement.internal.zzhc zzhcVarZzd;
        int i2 = i - 1;
        if (i2 == 0) {
            zzhcVarZzd = this.zza.zzu.zzaW().zzd();
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzhcVarZzd = this.zza.zzu.zzaW().zzj();
            } else if (i2 != 4) {
                zzhcVarZzd = this.zza.zzu.zzaW().zzi();
            } else if (z) {
                zzhcVarZzd = this.zza.zzu.zzaW().zzm();
            } else {
                zzhcVarZzd = !z2 ? this.zza.zzu.zzaW().zzl() : this.zza.zzu.zzaW().zzk();
            }
        } else if (z) {
            zzhcVarZzd = this.zza.zzu.zzaW().zzh();
        } else {
            zzhcVarZzd = !z2 ? this.zza.zzu.zzaW().zzf() : this.zza.zzu.zzaW().zze();
        }
        int size = list.size();
        if (size == 1) {
            zzhcVarZzd.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzhcVarZzd.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzhcVarZzd.zza(str);
        } else {
            zzhcVarZzd.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
