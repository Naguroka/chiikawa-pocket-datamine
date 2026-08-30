package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfrc {
    private static com.google.android.gms.internal.ads.zzfrc zza;
    private final java.lang.String zzb;
    private final android.content.SharedPreferences zzc;

    private zzfrc(android.content.Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static com.google.android.gms.internal.ads.zzfrc zzb(android.content.Context context) {
        if (zza == null) {
            zza = new com.google.android.gms.internal.ads.zzfrc(context);
        }
        return zza;
    }

    final long zza(java.lang.String str, long j) {
        return this.zzc.getLong(str, -1L);
    }

    @javax.annotation.Nullable
    final java.lang.String zzc(java.lang.String str, java.lang.String str2) {
        return this.zzc.getString(str, null);
    }

    final void zzd(java.lang.String str, java.lang.Object obj) throws java.io.IOException {
        boolean zCommit;
        if (obj instanceof java.lang.String) {
            zCommit = this.zzc.edit().putString(str, (java.lang.String) obj).commit();
        } else if (obj instanceof java.lang.Long) {
            zCommit = this.zzc.edit().putLong(str, ((java.lang.Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof java.lang.Boolean)) {
                if (obj instanceof java.lang.Integer) {
                    zCommit = this.zzc.edit().putInt(str, ((java.lang.Integer) obj).intValue()).commit();
                } else {
                    android.util.Log.e("GpidLifecycleSPHandler", "Unexpected object class " + java.lang.String.valueOf(obj.getClass()) + " for app " + this.zzb);
                }
                throw new java.io.IOException("Failed to store " + str + " for app " + this.zzb);
            }
            zCommit = this.zzc.edit().putBoolean(str, ((java.lang.Boolean) obj).booleanValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new java.io.IOException("Failed to store " + str + " for app " + this.zzb);
    }

    final void zze(java.lang.String str) throws java.io.IOException {
        if (this.zzc.edit().remove(str).commit()) {
            return;
        }
        throw new java.io.IOException("Failed to remove " + str + " for app " + this.zzb);
    }

    final boolean zzf(java.lang.String str, boolean z) {
        return this.zzc.getBoolean(str, true);
    }

    final boolean zzg(java.lang.String str) {
        return this.zzc.contains(str);
    }
}
