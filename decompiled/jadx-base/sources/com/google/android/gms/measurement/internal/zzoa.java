package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzoa extends com.google.android.gms.measurement.internal.zzpg {
    public final com.google.android.gms.measurement.internal.zzhp zza;
    public final com.google.android.gms.measurement.internal.zzhp zzb;
    public final com.google.android.gms.measurement.internal.zzhp zzc;
    public final com.google.android.gms.measurement.internal.zzhp zzd;
    public final com.google.android.gms.measurement.internal.zzhp zze;
    public final com.google.android.gms.measurement.internal.zzhp zzf;
    private final java.util.Map zzh;

    zzoa(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        super(zzpvVar);
        this.zzh = new java.util.HashMap();
        com.google.android.gms.measurement.internal.zzht zzhtVarZzm = this.zzu.zzm();
        java.util.Objects.requireNonNull(zzhtVarZzm);
        this.zza = new com.google.android.gms.measurement.internal.zzhp(zzhtVarZzm, "last_delete_stale", 0L);
        com.google.android.gms.measurement.internal.zzht zzhtVarZzm2 = this.zzu.zzm();
        java.util.Objects.requireNonNull(zzhtVarZzm2);
        this.zzb = new com.google.android.gms.measurement.internal.zzhp(zzhtVarZzm2, "last_delete_stale_batch", 0L);
        com.google.android.gms.measurement.internal.zzht zzhtVarZzm3 = this.zzu.zzm();
        java.util.Objects.requireNonNull(zzhtVarZzm3);
        this.zzc = new com.google.android.gms.measurement.internal.zzhp(zzhtVarZzm3, "backoff", 0L);
        com.google.android.gms.measurement.internal.zzht zzhtVarZzm4 = this.zzu.zzm();
        java.util.Objects.requireNonNull(zzhtVarZzm4);
        this.zzd = new com.google.android.gms.measurement.internal.zzhp(zzhtVarZzm4, "last_upload", 0L);
        com.google.android.gms.measurement.internal.zzht zzhtVarZzm5 = this.zzu.zzm();
        java.util.Objects.requireNonNull(zzhtVarZzm5);
        this.zze = new com.google.android.gms.measurement.internal.zzhp(zzhtVarZzm5, "last_upload_attempt", 0L);
        com.google.android.gms.measurement.internal.zzht zzhtVarZzm6 = this.zzu.zzm();
        java.util.Objects.requireNonNull(zzhtVarZzm6);
        this.zzf = new com.google.android.gms.measurement.internal.zzhp(zzhtVarZzm6, "midnight_offset", 0L);
    }

    @java.lang.Deprecated
    final android.util.Pair zza(java.lang.String str) {
        com.google.android.gms.measurement.internal.zznz zznzVar;
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo;
        zzg();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        long jElapsedRealtime = zzioVar.zzaU().elapsedRealtime();
        com.google.android.gms.measurement.internal.zznz zznzVar2 = (com.google.android.gms.measurement.internal.zznz) this.zzh.get(str);
        if (zznzVar2 != null && jElapsedRealtime < zznzVar2.zzc) {
            return new android.util.Pair(zznzVar2.zza, java.lang.Boolean.valueOf(zznzVar2.zzb));
        }
        com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jZzk = zzioVar.zzf().zzk(str, com.google.android.gms.measurement.internal.zzgi.zza) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(zzioVar.zzaT());
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                advertisingIdInfo = null;
                if (zznzVar2 != null && jElapsedRealtime < zznzVar2.zzc + this.zzu.zzf().zzk(str, com.google.android.gms.measurement.internal.zzgi.zzb)) {
                    return new android.util.Pair(zznzVar2.zza, java.lang.Boolean.valueOf(zznzVar2.zzb));
                }
            }
            if (advertisingIdInfo == null) {
                return new android.util.Pair("00000000-0000-0000-0000-000000000000", false);
            }
            java.lang.String id = advertisingIdInfo.getId();
            zznzVar = id != null ? new com.google.android.gms.measurement.internal.zznz(id, advertisingIdInfo.isLimitAdTrackingEnabled(), jZzk) : new com.google.android.gms.measurement.internal.zznz("", advertisingIdInfo.isLimitAdTrackingEnabled(), jZzk);
            this.zzh.put(str, zznzVar);
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new android.util.Pair(zznzVar.zza, java.lang.Boolean.valueOf(zznzVar.zzb));
        } catch (java.lang.Exception e) {
            this.zzu.zzaW().zzd().zzb("Unable to get advertising id", e);
            zznzVar = new com.google.android.gms.measurement.internal.zznz("", false, jZzk);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
        return false;
    }

    final android.util.Pair zzd(java.lang.String str, com.google.android.gms.measurement.internal.zzjx zzjxVar) {
        return zzjxVar.zzr(com.google.android.gms.measurement.internal.zzjw.AD_STORAGE) ? zza(str) : new android.util.Pair("", false);
    }

    @java.lang.Deprecated
    final java.lang.String zzf(java.lang.String str, boolean z) {
        zzg();
        java.lang.String str2 = z ? (java.lang.String) zza(str).first : "00000000-0000-0000-0000-000000000000";
        java.security.MessageDigest messageDigestZzI = com.google.android.gms.measurement.internal.zzqf.zzI();
        if (messageDigestZzI == null) {
            return null;
        }
        return java.lang.String.format(java.util.Locale.US, "%032X", new java.math.BigInteger(1, messageDigestZzI.digest(str2.getBytes())));
    }
}
