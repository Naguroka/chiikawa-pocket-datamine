package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzbml {
    public static void zza(com.google.android.gms.internal.ads.zzbmm zzbmmVar, java.lang.String str, java.util.Map map) {
        try {
            zzbmmVar.zze(str, com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(map));
        } catch (org.json.JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(com.google.android.gms.internal.ads.zzbmm zzbmmVar, java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String string = jSONObject.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzbmmVar.zza(sb.toString());
    }

    public static void zzc(com.google.android.gms.internal.ads.zzbmm zzbmmVar, java.lang.String str, java.lang.String str2) {
        zzbmmVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(com.google.android.gms.internal.ads.zzbmm zzbmmVar, java.lang.String str, org.json.JSONObject jSONObject) {
        zzbmmVar.zzb(str, jSONObject.toString());
    }
}
