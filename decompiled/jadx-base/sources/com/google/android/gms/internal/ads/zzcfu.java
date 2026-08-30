package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcfu implements com.google.android.gms.internal.ads.zzbjp {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zza;

    zzcfu(com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zza = zzcfwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        if (map != null) {
            java.lang.String str = (java.lang.String) map.get("height");
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = java.lang.Integer.parseInt(str);
                synchronized (this.zza) {
                    com.google.android.gms.internal.ads.zzcfw zzcfwVar = this.zza;
                    if (zzcfwVar.zzI != i) {
                        zzcfwVar.zzI = i;
                        this.zza.requestLayout();
                    }
                }
            } catch (java.lang.Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
