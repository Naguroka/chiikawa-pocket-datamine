package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzd extends com.google.android.gms.measurement.internal.zzf {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private long zzc;

    public zzd(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
        this.zzb = new androidx.collection.ArrayMap();
        this.zza = new androidx.collection.ArrayMap();
    }

    static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzd zzdVar, java.lang.String str, long j) {
        zzdVar.zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        java.util.Map map = zzdVar.zzb;
        if (map.isEmpty()) {
            zzdVar.zzc = j;
        }
        java.lang.Integer num = (java.lang.Integer) map.get(str);
        if (num != null) {
            map.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            zzdVar.zzu.zzaW().zzk().zza("Too many ads visible");
        } else {
            map.put(str, 1);
            zzdVar.zza.put(str, java.lang.Long.valueOf(j));
        }
    }

    static /* synthetic */ void zzb(com.google.android.gms.measurement.internal.zzd zzdVar, java.lang.String str, long j) {
        zzdVar.zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        java.util.Map map = zzdVar.zzb;
        java.lang.Integer num = (java.lang.Integer) map.get(str);
        if (num == null) {
            zzdVar.zzu.zzaW().zze().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        com.google.android.gms.measurement.internal.zzmh zzmhVarZzj = zzdVar.zzu.zzt().zzj(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, java.lang.Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        java.util.Map map2 = zzdVar.zza;
        java.lang.Long l = (java.lang.Long) map2.get(str);
        if (l == null) {
            zzdVar.zzu.zzaW().zze().zza("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            map2.remove(str);
            zzdVar.zzi(str, jLongValue, zzmhVarZzj);
        }
        if (map.isEmpty()) {
            long j2 = zzdVar.zzc;
            if (j2 == 0) {
                zzdVar.zzu.zzaW().zze().zza("First ad exposure time was never set");
            } else {
                zzdVar.zzh(j - j2, zzmhVarZzj);
                zzdVar.zzc = 0L;
            }
        }
    }

    private final void zzh(long j, com.google.android.gms.measurement.internal.zzmh zzmhVar) {
        if (zzmhVar == null) {
            this.zzu.zzaW().zzj().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.zzu.zzaW().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", java.lang.Long.valueOf(j));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_xt", j);
        com.google.android.gms.measurement.internal.zzqf.zzN(zzmhVar, bundle, true);
        this.zzu.zzq().zzR("am", "_xa", bundle);
    }

    private final void zzi(java.lang.String str, long j, com.google.android.gms.measurement.internal.zzmh zzmhVar) {
        if (zzmhVar == null) {
            this.zzu.zzaW().zzj().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.zzu.zzaW().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", java.lang.Long.valueOf(j));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        com.google.android.gms.measurement.internal.zzqf.zzN(zzmhVar, bundle, true);
        this.zzu.zzq().zzR("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j) {
        java.util.Map map = this.zza;
        java.util.Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((java.lang.String) it.next(), java.lang.Long.valueOf(j));
        }
        if (map.isEmpty()) {
            return;
        }
        this.zzc = j;
    }

    public final void zzd(java.lang.String str, long j) {
        if (str == null || str.length() == 0) {
            this.zzu.zzaW().zze().zza("Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zza(this, str, j));
        }
    }

    public final void zze(java.lang.String str, long j) {
        if (str == null || str.length() == 0) {
            this.zzu.zzaW().zze().zza("Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zzb(this, str, j));
        }
    }

    public final void zzf(long j) {
        com.google.android.gms.measurement.internal.zzmh zzmhVarZzj = this.zzu.zzt().zzj(false);
        java.util.Map map = this.zza;
        for (java.lang.String str : map.keySet()) {
            zzi(str, j - ((java.lang.Long) map.get(str)).longValue(), zzmhVarZzj);
        }
        if (!map.isEmpty()) {
            zzh(j - this.zzc, zzmhVarZzj);
        }
        zzj(j);
    }
}
