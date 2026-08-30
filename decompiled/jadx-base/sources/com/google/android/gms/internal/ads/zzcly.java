package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcly implements com.google.android.gms.internal.ads.zzcla {
    private final com.google.android.gms.internal.ads.zzduv zza;

    zzcly(com.google.android.gms.internal.ads.zzduv zzduvVar) {
        this.zza = zzduvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("test_mode_enabled");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzo(str.equals(com.json.mediationsdk.metadata.a.g));
    }
}
