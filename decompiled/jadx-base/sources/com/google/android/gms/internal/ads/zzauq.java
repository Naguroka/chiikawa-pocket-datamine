package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzauq implements com.google.android.gms.internal.ads.zzfpd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfnd zza;

    zzauq(com.google.android.gms.internal.ads.zzaus zzausVar, com.google.android.gms.internal.ads.zzfnd zzfndVar) {
        this.zza = zzfndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpd
    public final boolean zza(java.io.File file) {
        try {
            return this.zza.zza(file);
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }
}
