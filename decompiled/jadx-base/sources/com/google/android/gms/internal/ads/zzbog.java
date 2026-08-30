package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbog {
    static final com.google.android.gms.ads.internal.util.zzbd zza = new com.google.android.gms.internal.ads.zzboe();
    static final com.google.android.gms.ads.internal.util.zzbd zzb = new com.google.android.gms.internal.ads.zzbof();
    private final com.google.android.gms.internal.ads.zzbns zzc;

    public zzbog(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzfhk zzfhkVar) {
        this.zzc = new com.google.android.gms.internal.ads.zzbns(context, versionInfoParcel, str, zza, zzb, zzfhkVar);
    }

    public final com.google.android.gms.internal.ads.zzbnw zza(java.lang.String str, com.google.android.gms.internal.ads.zzbnz zzbnzVar, com.google.android.gms.internal.ads.zzbny zzbnyVar) {
        return new com.google.android.gms.internal.ads.zzbok(this.zzc, str, zzbnzVar, zzbnyVar);
    }

    public final com.google.android.gms.internal.ads.zzbop zzb() {
        return new com.google.android.gms.internal.ads.zzbop(this.zzc);
    }
}
