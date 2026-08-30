package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbod {
    private static final java.nio.charset.Charset zzc = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);
    public static final com.google.android.gms.internal.ads.zzboa zza = new com.google.android.gms.internal.ads.zzboc();
    public static final com.google.android.gms.internal.ads.zzbny zzb = new com.google.android.gms.internal.ads.zzbny() { // from class: com.google.android.gms.internal.ads.zzbob
        @Override // com.google.android.gms.internal.ads.zzbny
        public final java.lang.Object zza(org.json.JSONObject jSONObject) {
            return com.google.android.gms.internal.ads.zzbod.zza(jSONObject);
        }
    };

    static /* synthetic */ java.io.InputStream zza(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return new java.io.ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
