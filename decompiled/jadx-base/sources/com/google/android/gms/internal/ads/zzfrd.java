package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzfrd {
    static final java.lang.String zza = new java.util.UUID(0, 0).toString();
    final com.google.android.gms.internal.ads.zzfrc zzb;
    final com.google.android.gms.internal.ads.zzfrb zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;
    private final java.lang.String zzh;

    zzfrd(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zzb = com.google.android.gms.internal.ads.zzfrc.zzb(context);
        this.zzc = com.google.android.gms.internal.ads.zzfrb.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final java.lang.String zzh(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str2 != null && str3 != null) {
            return java.util.UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(java.nio.charset.StandardCharsets.UTF_8)).toString();
        }
        java.lang.String str4 = this.zzh;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str4);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 != null ? "not null" : "null");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    final long zza(boolean z) {
        return this.zzb.zza(z ? this.zzg : this.zzf, -1L);
    }

    final com.google.android.gms.internal.ads.zzfra zzb(java.lang.String str, java.lang.String str2, long j, boolean z) throws java.io.IOException {
        if (str != null) {
            try {
                java.util.UUID.fromString(str);
                if (!str.equals(zza)) {
                    java.lang.String strZze = zze(true);
                    java.lang.String strZzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (strZze != null && strZzc != null && !strZze.equals(zzh(str, str2, strZzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
            return new com.google.android.gms.internal.ads.zzfra();
        }
        boolean z2 = str != null;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new java.lang.IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jZza = zza(z2);
        if (jZza != -1) {
            if (jCurrentTimeMillis < jZza) {
                this.zzb.zzd(z2 ? this.zzg : this.zzf, java.lang.Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jZza + j) {
                return zzc(str, str2);
            }
        }
        java.lang.String strZze2 = zze(z2);
        return (strZze2 != null || z) ? new com.google.android.gms.internal.ads.zzfra(strZze2, zza(z2)) : zzc(str, str2);
    }

    final com.google.android.gms.internal.ads.zzfra zzc(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        if (str == null) {
            return zzd(java.util.UUID.randomUUID().toString(), false);
        }
        java.lang.String string = java.util.UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", string);
        return zzd(zzh(str, str2, string), true);
    }

    final com.google.android.gms.internal.ads.zzfra zzd(java.lang.String str, boolean z) throws java.io.IOException {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new java.lang.IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.zzb.zzd(z ? this.zzg : this.zzf, java.lang.Long.valueOf(jCurrentTimeMillis));
        this.zzb.zzd(z ? this.zze : this.zzd, str);
        return new com.google.android.gms.internal.ads.zzfra(str, jCurrentTimeMillis);
    }

    final java.lang.String zze(boolean z) {
        return this.zzb.zzc(z ? this.zze : this.zzd, null);
    }

    final void zzf(boolean z) throws java.io.IOException {
        this.zzb.zze(z ? this.zzg : this.zzf);
        this.zzb.zze(z ? this.zze : this.zzd);
    }

    final boolean zzg(boolean z) {
        return this.zzb.zzg(this.zzd);
    }
}
