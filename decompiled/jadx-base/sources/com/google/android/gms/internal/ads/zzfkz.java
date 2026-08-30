package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfkz implements androidx.webkit.WebViewCompat.WebMessageListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfla zza;

    zzfkz(com.google.android.gms.internal.ads.zzfla zzflaVar) {
        this.zza = zzflaVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(android.webkit.WebView webView, androidx.webkit.WebMessageCompat webMessageCompat, android.net.Uri uri, boolean z, androidx.webkit.JavaScriptReplyProxy javaScriptReplyProxy) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(webMessageCompat.getData());
            java.lang.String string = jSONObject.getString("method");
            java.lang.String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                com.google.android.gms.internal.ads.zzfla.zze(this.zza, string2);
            } else if (string.equals("finishSession")) {
                com.google.android.gms.internal.ads.zzfla.zzc(this.zza, string2);
            } else {
                com.google.android.gms.internal.ads.zzfkm.zza.booleanValue();
            }
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.ads.zzfmh.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
