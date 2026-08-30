package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgur implements com.google.android.gms.internal.ads.zzguu {
    private final com.google.android.gms.internal.ads.zzgve zza;

    /* synthetic */ zzgur(com.google.android.gms.internal.ads.zzgve zzgveVar, com.google.android.gms.internal.ads.zzguv zzguvVar) {
        this.zza = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguu
    public final java.lang.Object zza(java.lang.String str) throws java.security.GeneralSecurityException {
        java.util.Iterator it = com.google.android.gms.internal.ads.zzguw.zzb(com.google.android.gms.security.ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (java.security.Provider) it.next());
            } catch (java.lang.Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
