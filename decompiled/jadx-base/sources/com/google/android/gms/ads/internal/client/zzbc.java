package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbc {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.ads.internal.client.zzbc zzb = new com.google.android.gms.ads.internal.client.zzbc();
    private final com.google.android.gms.ads.internal.util.client.zzf zzc;
    private final com.google.android.gms.ads.internal.client.zzba zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final java.util.Random zzg;

    protected zzbc() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        com.google.android.gms.ads.internal.client.zzba zzbaVar = new com.google.android.gms.ads.internal.client.zzba(new com.google.android.gms.ads.internal.client.zzk(), new com.google.android.gms.ads.internal.client.zzi(), new com.google.android.gms.ads.internal.client.zzfe(), new com.google.android.gms.internal.ads.zzbhv(), new com.google.android.gms.internal.ads.zzbxb(), new com.google.android.gms.internal.ads.zzbtb(), new com.google.android.gms.internal.ads.zzbhw(), new com.google.android.gms.ads.internal.client.zzl());
        java.lang.String strZze = com.google.android.gms.ads.internal.util.client.zzf.zze();
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel(0, 244410000, true);
        java.util.Random random = new java.util.Random();
        this.zzc = zzfVar;
        this.zzd = zzbaVar;
        this.zze = strZze;
        this.zzf = versionInfoParcel;
        this.zzg = random;
    }

    public static com.google.android.gms.ads.internal.client.zzba zza() {
        return zzb.zzd;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zzb() {
        return zzb.zzc;
    }

    public static com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc() {
        return zzb.zzf;
    }

    public static java.lang.String zzd() {
        return zzb.zze;
    }

    public static java.util.Random zze() {
        return zzb.zzg;
    }
}
