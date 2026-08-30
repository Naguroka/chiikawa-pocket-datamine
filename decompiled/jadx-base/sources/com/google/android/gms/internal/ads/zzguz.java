package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzguz implements com.google.android.gms.internal.ads.zzgve {
    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ java.lang.Object zza(java.lang.String str, java.security.Provider provider) throws java.security.GeneralSecurityException {
        return provider == null ? java.security.KeyFactory.getInstance(str) : java.security.KeyFactory.getInstance(str, provider);
    }
}
