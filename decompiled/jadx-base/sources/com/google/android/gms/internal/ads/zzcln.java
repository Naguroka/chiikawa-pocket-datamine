package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcln implements com.google.android.gms.internal.ads.zzcla {
    zzcln() {
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(java.util.Map map) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkm)).booleanValue() || map.isEmpty()) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get("is_topics_ad_personalization_allowed");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzE(java.lang.Boolean.parseBoolean(str));
    }
}
