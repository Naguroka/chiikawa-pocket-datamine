package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbkc implements com.google.android.gms.internal.ads.zzbjp {
    private final com.google.android.gms.internal.ads.zzdvs zza;

    public zzbkc(com.google.android.gms.internal.ads.zzdvs zzdvsVar) {
        this.zza = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjl)).booleanValue()) {
            java.lang.String str = (java.lang.String) map.get("action");
            java.lang.String str2 = (java.lang.String) map.get("adUnitId");
            java.lang.String str3 = (java.lang.String) map.get("redirectUrl");
            if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
                return;
            }
            java.lang.String str4 = (java.lang.String) map.get("format");
            if (str.equals("load") && !android.text.TextUtils.isEmpty(str4)) {
                this.zza.zzh(str2, str4, str3);
            } else if (str.equals(com.json.j5.v)) {
                this.zza.zzi(str2, str3);
            }
        }
    }
}
