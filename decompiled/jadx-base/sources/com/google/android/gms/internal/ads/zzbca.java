package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbca extends com.google.android.gms.internal.ads.zzbcc {
    zzbca(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(1, str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(org.json.JSONObject jSONObject) {
        return jSONObject.optString(zzl(), (java.lang.String) zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(zzl())) : (java.lang.String) zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(android.content.SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zzl(), (java.lang.String) zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ void zzd(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putString(zzl(), (java.lang.String) obj);
    }
}
