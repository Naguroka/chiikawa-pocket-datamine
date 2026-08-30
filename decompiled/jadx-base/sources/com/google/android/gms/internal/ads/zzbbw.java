package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbbw extends com.google.android.gms.internal.ads.zzbcc {
    zzbbw(int i, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        super(i, str, bool, bool2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(org.json.JSONObject jSONObject) {
        return java.lang.Boolean.valueOf(jSONObject.optBoolean(zzl(), ((java.lang.Boolean) zzk()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl())) ? java.lang.Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(zzl()))) : (java.lang.Boolean) zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(android.content.SharedPreferences sharedPreferences) {
        return java.lang.Boolean.valueOf(sharedPreferences.getBoolean(zzl(), ((java.lang.Boolean) zzk()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ void zzd(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putBoolean(zzl(), ((java.lang.Boolean) obj).booleanValue());
    }
}
