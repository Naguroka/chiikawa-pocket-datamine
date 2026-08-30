package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbc {
    final java.lang.String zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final long zzd;
    final long zze;
    final com.google.android.gms.measurement.internal.zzbf zzf;

    zzbc(com.google.android.gms.measurement.internal.zzio zzioVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, long j2, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzbf zzbfVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == android.text.TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzioVar.zzaW().zzk().zzb("Event created with reverse previous/current timestamps. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbfVar = new com.google.android.gms.measurement.internal.zzbf(new android.os.Bundle());
        } else {
            android.os.Bundle bundle2 = new android.os.Bundle(bundle);
            java.util.Iterator<java.lang.String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (next == null) {
                    zzioVar.zzaW().zze().zza("Param name can't be null");
                    it.remove();
                } else {
                    java.lang.Object objZzD = zzioVar.zzw().zzD(next, bundle2.get(next));
                    if (objZzD == null) {
                        zzioVar.zzaW().zzk().zzb("Param value can't be null", zzioVar.zzj().zze(next));
                        it.remove();
                    } else {
                        zzioVar.zzw().zzS(bundle2, next, objZzD);
                    }
                }
            }
            zzbfVar = new com.google.android.gms.measurement.internal.zzbf(bundle2);
        }
        this.zzf = zzbfVar;
    }

    public final java.lang.String toString() {
        return "Event{appId='" + this.zza + "', name='" + this.zzb + "', params=" + this.zzf.toString() + "}";
    }

    final com.google.android.gms.measurement.internal.zzbc zza(com.google.android.gms.measurement.internal.zzio zzioVar, long j) {
        return new com.google.android.gms.measurement.internal.zzbc(zzioVar, this.zzc, this.zza, this.zzb, this.zzd, j, this.zzf);
    }

    private zzbc(com.google.android.gms.measurement.internal.zzio zzioVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, long j2, com.google.android.gms.measurement.internal.zzbf zzbfVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbfVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == android.text.TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzioVar.zzaW().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", com.google.android.gms.measurement.internal.zzhe.zzn(str2), com.google.android.gms.measurement.internal.zzhe.zzn(str3));
        }
        this.zzf = zzbfVar;
    }
}
