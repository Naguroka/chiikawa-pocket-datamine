package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzg {
    public final com.google.android.gms.internal.measurement.zzg zza;
    final com.google.android.gms.internal.measurement.zzax zzb;
    final java.util.Map zzc = new java.util.HashMap();
    final java.util.Map zzd = new java.util.HashMap();

    public zzg(com.google.android.gms.internal.measurement.zzg zzgVar, com.google.android.gms.internal.measurement.zzax zzaxVar) {
        this.zza = zzgVar;
        this.zzb = zzaxVar;
    }

    public final com.google.android.gms.internal.measurement.zzg zza() {
        return new com.google.android.gms.internal.measurement.zzg(this, this.zzb);
    }

    public final com.google.android.gms.internal.measurement.zzap zzb(com.google.android.gms.internal.measurement.zzap zzapVar) {
        return this.zzb.zza(this, zzapVar);
    }

    public final com.google.android.gms.internal.measurement.zzap zzc(com.google.android.gms.internal.measurement.zzae zzaeVar) {
        com.google.android.gms.internal.measurement.zzap zzapVarZza = com.google.android.gms.internal.measurement.zzap.zzf;
        java.util.Iterator itZzk = zzaeVar.zzk();
        while (itZzk.hasNext()) {
            zzapVarZza = this.zzb.zza(this, zzaeVar.zze(((java.lang.Integer) itZzk.next()).intValue()));
            if (zzapVarZza instanceof com.google.android.gms.internal.measurement.zzag) {
                break;
            }
        }
        return zzapVarZza;
    }

    public final com.google.android.gms.internal.measurement.zzap zzd(java.lang.String str) {
        java.util.Map map = this.zzc;
        if (map.containsKey(str)) {
            return (com.google.android.gms.internal.measurement.zzap) map.get(str);
        }
        com.google.android.gms.internal.measurement.zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzd(str);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%s is not defined", str));
    }

    public final void zze(java.lang.String str, com.google.android.gms.internal.measurement.zzap zzapVar) {
        if (this.zzd.containsKey(str)) {
            return;
        }
        if (zzapVar == null) {
            this.zzc.remove(str);
        } else {
            this.zzc.put(str, zzapVar);
        }
    }

    public final void zzf(java.lang.String str, com.google.android.gms.internal.measurement.zzap zzapVar) {
        zze(str, zzapVar);
        this.zzd.put(str, true);
    }

    public final void zzg(java.lang.String str, com.google.android.gms.internal.measurement.zzap zzapVar) {
        com.google.android.gms.internal.measurement.zzg zzgVar;
        java.util.Map map = this.zzc;
        if (!map.containsKey(str) && (zzgVar = this.zza) != null && zzgVar.zzh(str)) {
            zzgVar.zzg(str, zzapVar);
        } else {
            if (this.zzd.containsKey(str)) {
                return;
            }
            if (zzapVar == null) {
                map.remove(str);
            } else {
                map.put(str, zzapVar);
            }
        }
    }

    public final boolean zzh(java.lang.String str) {
        if (this.zzc.containsKey(str)) {
            return true;
        }
        com.google.android.gms.internal.measurement.zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzh(str);
        }
        return false;
    }
}
