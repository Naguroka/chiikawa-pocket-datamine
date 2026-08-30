package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgut implements com.google.android.gms.internal.ads.zzguu {
    private final com.google.android.gms.internal.ads.zzgve zza;

    /* synthetic */ zzgut(com.google.android.gms.internal.ads.zzgve zzgveVar, com.google.android.gms.internal.ads.zzguv zzguvVar) {
        this.zza = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguu
    public final java.lang.Object zza(java.lang.String str) throws java.security.GeneralSecurityException {
        java.util.Iterator it = com.google.android.gms.internal.ads.zzguw.zzb(com.google.android.gms.security.ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt").iterator();
        java.lang.Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (java.security.Provider) it.next());
            } catch (java.lang.Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new java.security.GeneralSecurityException("No good Provider found.", exc);
    }
}
