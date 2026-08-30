package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcls implements com.google.android.gms.internal.ads.zzcla {
    private final com.google.android.gms.internal.ads.zzfbn zza;

    public zzcls(com.google.android.gms.internal.ads.zzfbn zzfbnVar) {
        this.zza = zzfbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("render_in_browser");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zzb(java.lang.Boolean.parseBoolean(str));
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException("Invalid render_in_browser state", e);
        }
    }
}
