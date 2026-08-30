package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcho implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;

    public zzcho(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        try {
            return com.google.android.gms.common.wrappers.Wrappers.packageManager(((com.google.android.gms.internal.ads.zzche) this.zza).zza()).getPackageInfo(((android.content.pm.ApplicationInfo) this.zzb.zzb()).packageName, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
