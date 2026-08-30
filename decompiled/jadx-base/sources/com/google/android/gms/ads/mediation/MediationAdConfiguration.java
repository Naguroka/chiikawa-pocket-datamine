package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    private final java.lang.String zza;
    private final android.os.Bundle zzb;
    private final android.os.Bundle zzc;
    private final android.content.Context zzd;
    private final boolean zze;
    private final int zzf;
    private final int zzg;
    private final java.lang.String zzh;
    private final java.lang.String zzi;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(android.content.Context context, java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, android.location.Location location, int i, int i2, java.lang.String str2, java.lang.String str3) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = bundle2;
        this.zzd = context;
        this.zze = z;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str2;
        this.zzi = str3;
    }

    public java.lang.String getBidResponse() {
        return this.zza;
    }

    public android.content.Context getContext() {
        return this.zzd;
    }

    public java.lang.String getMaxAdContentRating() {
        return this.zzh;
    }

    public android.os.Bundle getMediationExtras() {
        return this.zzc;
    }

    public android.os.Bundle getServerParameters() {
        return this.zzb;
    }

    public java.lang.String getWatermark() {
        return this.zzi;
    }

    public boolean isTestRequest() {
        return this.zze;
    }

    public int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    public int taggedForUnderAgeTreatment() {
        return this.zzg;
    }
}
