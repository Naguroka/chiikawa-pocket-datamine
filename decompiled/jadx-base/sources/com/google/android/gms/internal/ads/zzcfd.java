package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcfd implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ java.util.List zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ android.net.Uri zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcff zzd;

    zzcfd(com.google.android.gms.internal.ads.zzcff zzcffVar, java.util.List list, java.lang.String str, android.net.Uri uri) {
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
        this.zzd = zzcffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to parse gmsg params for: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zzc))));
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.util.List list = this.zza;
        java.lang.String str = this.zzb;
        this.zzd.zzY((java.util.Map) obj, list, str);
    }
}
