package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgea {
    public static final com.google.android.gms.internal.ads.zzgek zza(com.google.android.gms.internal.ads.zzgek zzgekVar) throws java.security.GeneralSecurityException {
        return zzgekVar != null ? zzgekVar : com.google.android.gms.internal.ads.zzgeq.zza(zzb(null).zzaV());
    }

    static final com.google.android.gms.internal.ads.zzgsp zzb(com.google.android.gms.internal.ads.zzgek zzgekVar) {
        try {
            return ((com.google.android.gms.internal.ads.zzgni) com.google.android.gms.internal.ads.zzgmk.zzc().zze(null, com.google.android.gms.internal.ads.zzgni.class)).zzc();
        } catch (java.security.GeneralSecurityException e) {
            throw new com.google.android.gms.internal.ads.zzgnt("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }
}
