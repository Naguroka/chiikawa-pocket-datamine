package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public class MediationNativeAdConfiguration extends com.google.android.gms.ads.mediation.MediationAdConfiguration {
    private final com.google.android.gms.internal.ads.zzbfl zza;

    public MediationNativeAdConfiguration(android.content.Context context, java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, android.location.Location location, int i, int i2, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.zzbfl zzbflVar) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.zza = zzbflVar;
    }

    public com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdOptions() {
        return com.google.android.gms.internal.ads.zzbfl.zza(this.zza);
    }
}
