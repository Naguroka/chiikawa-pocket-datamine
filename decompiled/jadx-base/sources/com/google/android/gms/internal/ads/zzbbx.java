package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbbx extends com.google.android.gms.internal.ads.zzbcc {
    zzbbx(int i, java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
        super(1, str, num, num2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(org.json.JSONObject jSONObject) {
        return java.lang.Integer.valueOf(jSONObject.optInt(zzl(), ((java.lang.Integer) zzk()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl())) ? java.lang.Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(zzl()))) : (java.lang.Integer) zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(android.content.SharedPreferences sharedPreferences) {
        return java.lang.Integer.valueOf(sharedPreferences.getInt(zzl(), ((java.lang.Integer) zzk()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ void zzd(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putInt(zzl(), ((java.lang.Integer) obj).intValue());
    }
}
