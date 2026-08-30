package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbby extends com.google.android.gms.internal.ads.zzbcc {
    zzbby(int i, java.lang.String str, java.lang.Long l, java.lang.Long l2) {
        super(1, str, l, l2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(org.json.JSONObject jSONObject) {
        return java.lang.Long.valueOf(jSONObject.optLong(zzl(), ((java.lang.Long) zzk()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl())) ? java.lang.Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zzl()))) : (java.lang.Long) zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(android.content.SharedPreferences sharedPreferences) {
        return java.lang.Long.valueOf(sharedPreferences.getLong(zzl(), ((java.lang.Long) zzk()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ void zzd(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putLong(zzl(), ((java.lang.Long) obj).longValue());
    }
}
