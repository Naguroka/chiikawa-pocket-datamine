package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgku {
    private static final java.lang.String[] zza = {com.google.android.gms.security.ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt"};

    @javax.annotation.Nullable
    public static java.security.Provider zza() {
        java.lang.String[] strArr = zza;
        for (int i = 0; i < 3; i++) {
            java.security.Provider provider = java.security.Security.getProvider(strArr[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
