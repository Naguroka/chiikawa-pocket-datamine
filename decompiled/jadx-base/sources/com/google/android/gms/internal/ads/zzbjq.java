package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbjq implements com.google.android.gms.internal.ads.zzbjp {
    private final com.google.android.gms.internal.ads.zzduv zza;

    public zzbjq(com.google.android.gms.internal.ads.zzduv zzduvVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzduvVar, "The Inspector Manager must not be null");
        this.zza = zzduvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        if (map == null || !map.containsKey("persistentData") || android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("persistentData"))) {
            return;
        }
        this.zza.zzj((java.lang.String) map.get("persistentData"));
    }
}
