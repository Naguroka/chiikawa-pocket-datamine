package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzchs implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzcha zza;

    public zzchs(com.google.android.gms.internal.ads.zzcha zzchaVar) {
        this.zza = zzchaVar;
    }

    public static com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc(com.google.android.gms.internal.ads.zzcha zzchaVar) {
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcelZze = zzchaVar.zze();
        com.google.android.gms.internal.ads.zzhez.zzb(versionInfoParcelZze);
        return versionInfoParcelZze;
    }

    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ java.lang.Object zzb() {
        return zzc(this.zza);
    }
}
