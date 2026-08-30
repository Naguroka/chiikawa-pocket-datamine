package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzav extends com.google.android.gms.ads.internal.client.zzdk {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzay zzb;

    zzav(com.google.android.gms.ads.internal.util.zzay zzayVar, android.content.Context context) {
        this.zza = context;
        this.zzb = zzayVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.zzb.zzi(this.zza, zzeVar.zzb, true, true);
    }
}
