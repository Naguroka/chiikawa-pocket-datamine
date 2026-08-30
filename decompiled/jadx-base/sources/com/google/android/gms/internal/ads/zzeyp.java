package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeyp implements com.google.android.gms.internal.ads.zzgcd {
    zzeyp(com.google.android.gms.internal.ads.zzeyr zzeyrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* synthetic */ void zzb(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit successful.");
    }
}
