package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbbz extends com.google.android.gms.internal.ads.zzbcc {
    zzbbz(int i, java.lang.String str, java.lang.Float f, java.lang.Float f2) {
        super(1, str, f, f2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(org.json.JSONObject jSONObject) {
        return java.lang.Float.valueOf((float) jSONObject.optDouble(zzl(), ((java.lang.Float) zzk()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl())) ? java.lang.Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(zzl()))) : (java.lang.Float) zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(android.content.SharedPreferences sharedPreferences) {
        return java.lang.Float.valueOf(sharedPreferences.getFloat(zzl(), ((java.lang.Float) zzk()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ void zzd(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putFloat(zzl(), ((java.lang.Float) obj).floatValue());
    }
}
