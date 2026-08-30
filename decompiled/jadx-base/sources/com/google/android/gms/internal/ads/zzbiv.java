package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbiv implements com.google.android.gms.internal.ads.zzbjp {
    zzbiv() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        org.json.JSONObject jSONObjectZzb;
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        com.google.android.gms.internal.ads.zzbfk zzbfkVarZzK = zzcexVar.zzK();
        if (zzbfkVarZzK == null || (jSONObjectZzb = zzbfkVarZzK.zzb()) == null) {
            zzcexVar.zze("nativeClickMetaReady", new org.json.JSONObject());
        } else {
            zzcexVar.zze("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
