package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeu extends com.google.android.gms.ads.internal.client.zzdk {
    private zzeu() {
        throw null;
    }

    /* synthetic */ zzeu(com.google.android.gms.ads.internal.client.zzew zzewVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.OnAdInspectorClosedListener onAdInspectorClosedListener = com.google.android.gms.ads.internal.client.zzex.zzf().zzj;
        if (onAdInspectorClosedListener != null) {
            onAdInspectorClosedListener.onAdInspectorClosed(zzeVar == null ? null : new com.google.android.gms.ads.AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }
}
