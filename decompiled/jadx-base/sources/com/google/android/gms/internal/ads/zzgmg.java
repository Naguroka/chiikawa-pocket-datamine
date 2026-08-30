package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgmg {
    private static final com.google.android.gms.internal.ads.zzgmg zza = new com.google.android.gms.internal.ads.zzgmg();
    private final java.util.Map zzb = new java.util.HashMap();

    zzgmg() {
    }

    public static com.google.android.gms.internal.ads.zzgmg zzb() {
        return zza;
    }

    public final synchronized com.google.android.gms.internal.ads.zzgek zza(java.lang.String str) throws java.security.GeneralSecurityException {
        if (!this.zzb.containsKey("AES128_GCM")) {
            throw new java.security.GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (com.google.android.gms.internal.ads.zzgek) this.zzb.get("AES128_GCM");
    }

    public final synchronized void zzc(java.lang.String str, com.google.android.gms.internal.ads.zzgek zzgekVar) throws java.security.GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, zzgekVar);
            return;
        }
        if (((com.google.android.gms.internal.ads.zzgek) this.zzb.get(str)).equals(zzgekVar)) {
            return;
        }
        throw new java.security.GeneralSecurityException("Parameters object with name " + str + " already exists (" + java.lang.String.valueOf(this.zzb.get(str)) + "), cannot insert " + java.lang.String.valueOf(zzgekVar));
    }

    public final synchronized void zzd(java.util.Map map) throws java.security.GeneralSecurityException {
        for (java.util.Map.Entry entry : map.entrySet()) {
            zzc((java.lang.String) entry.getKey(), (com.google.android.gms.internal.ads.zzgek) entry.getValue());
        }
    }
}
