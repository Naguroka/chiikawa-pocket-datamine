package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeyx implements com.google.android.gms.internal.ads.zzfuc {
    final /* synthetic */ com.google.android.gms.internal.ads.zzezb zza;

    zzeyx(com.google.android.gms.internal.ads.zzezb zzezbVar) {
        this.zza = zzezbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final /* bridge */ /* synthetic */ java.lang.Object apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        com.google.android.gms.ads.internal.util.client.zzo.zzh("", (com.google.android.gms.internal.ads.zzdyh) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        com.google.android.gms.internal.ads.zzezb zzezbVar = this.zza;
        zzezbVar.zzd = new com.google.android.gms.internal.ads.zzeyz(null, zzezbVar.zze(), null);
        return this.zza.zzd;
    }
}
