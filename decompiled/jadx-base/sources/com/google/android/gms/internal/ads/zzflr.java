package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzflr {
    private static final com.google.android.gms.internal.ads.zzflr zza = new com.google.android.gms.internal.ads.zzflr();

    private zzflr() {
    }

    public static final com.google.android.gms.internal.ads.zzflr zza() {
        return zza;
    }

    public static final boolean zzk(android.webkit.WebView webView, java.lang.String str) {
        if (webView == null || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (java.lang.IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(java.lang.String.valueOf(str)));
            return true;
        }
    }

    public final void zzc(android.webkit.WebView webView, java.lang.String str) {
        zzb(webView, "finishSession", str);
    }

    public final void zzd(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject) {
        zzb(webView, com.ironsource.y8.a.f, jSONObject, str);
    }

    public final void zze(android.webkit.WebView webView, java.lang.String str, float f) {
        zzb(webView, "setDeviceVolume", java.lang.Float.valueOf(f), str);
    }

    public final void zzf(android.webkit.WebView webView, org.json.JSONObject jSONObject) {
        zzb(webView, "setLastActivity", jSONObject);
    }

    public final void zzg(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        zzb(webView, "setDeviceLockState", str2);
    }

    public final void zzh(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        zzb(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void zzi(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        zzb(webView, "setState", str2, str);
    }

    public final void zzj(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3) {
        zzb(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    final void zzb(android.webkit.WebView webView, java.lang.String str, java.lang.Object... objArr) {
        if (webView == null) {
            com.google.android.gms.internal.ads.zzfkm.zza.booleanValue();
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        for (java.lang.Object obj : objArr) {
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof java.lang.String) {
                java.lang.String string = obj.toString();
                if (string.startsWith("{")) {
                    sb.append(string);
                } else {
                    sb.append(kotlin.text.Typography.quote);
                    sb.append(string);
                    sb.append(kotlin.text.Typography.quote);
                }
            } else {
                sb.append(obj);
            }
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(")}");
        java.lang.String string2 = sb.toString();
        android.os.Handler handler = webView.getHandler();
        if (handler == null || android.os.Looper.myLooper() == handler.getLooper()) {
            zzk(webView, string2);
        } else {
            handler.post(new com.google.android.gms.internal.ads.zzflq(this, webView, string2));
        }
    }
}
