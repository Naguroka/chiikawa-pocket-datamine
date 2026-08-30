package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcew extends android.webkit.WebChromeClient {
    private final com.google.android.gms.internal.ads.zzcex zza;

    public zzcew(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zza = zzcexVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final android.content.Context zzb(android.webkit.WebView webView) {
        if (!(webView instanceof com.google.android.gms.internal.ads.zzcex)) {
            return webView.getContext();
        }
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) webView;
        android.app.Activity activityZzi = zzcexVar.zzi();
        return activityZzi != null ? activityZzi : zzcexVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(android.webkit.WebView webView) {
        if (!(webView instanceof com.google.android.gms.internal.ads.zzcex)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = ((com.google.android.gms.internal.ads.zzcex) webView).zzL();
        if (zzmVarZzL == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzmVarZzL.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        java.lang.String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = com.google.android.gms.internal.ads.zzcev.zza[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(str);
        } else if (i == 2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(str);
        } else if (i == 3 || i == 4 || i != 5) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi(str);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zze(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
        android.webkit.WebView.WebViewTransport webViewTransport = (android.webkit.WebView.WebViewTransport) message.obj;
        android.webkit.WebView webView2 = new android.webkit.WebView(webView.getContext());
        if (this.zza.zzH() != null) {
            webView2.setWebViewClient(this.zza.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(java.lang.String str, java.lang.String str2, long j, long j2, long j3, android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = java.lang.Math.min(j + java.lang.Math.min(131072L, j4), 1048576L);
        } else {
            if (j2 <= java.lang.Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzB(zzcexVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                z = true;
            } else {
                com.google.android.gms.internal.ads.zzcex zzcexVar2 = this.zza;
                com.google.android.gms.ads.internal.zzv.zzq();
                if (com.google.android.gms.ads.internal.util.zzs.zzB(zzcexVar2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = true;
                } else {
                    z = false;
                }
            }
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = this.zza.zzL();
        if (zzmVarZzL == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzmVarZzL.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @java.lang.Deprecated
    public final void onShowCustomView(android.view.View view, int i, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = this.zza.zzL();
        if (zzmVarZzL == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzmVarZzL.zzC(view, customViewCallback);
            zzmVarZzL.zzA(i);
        }
    }

    protected final boolean zza(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.webkit.JsResult jsResult, android.webkit.JsPromptResult jsPromptResult, boolean z) {
        com.google.android.gms.ads.internal.zzb zzbVarZzd;
        try {
            com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
            if (zzcexVar != null && zzcexVar.zzN() != null && this.zza.zzN().zzd() != null && (zzbVarZzd = this.zza.zzN().zzd()) != null && !zzbVarZzd.zzc()) {
                zzbVarZzd.zzb("window." + str + "('" + str3 + "')");
                return false;
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            android.app.AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(context);
            builderZzL.setTitle(str2);
            if (z) {
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
                linearLayout.setOrientation(1);
                android.widget.TextView textView = new android.widget.TextView(context);
                textView.setText(str3);
                android.widget.EditText editText = new android.widget.EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builderZzL.setView(linearLayout).setPositiveButton(android.R.string.ok, new com.google.android.gms.internal.ads.zzceu(jsPromptResult, editText)).setNegativeButton(android.R.string.cancel, new com.google.android.gms.internal.ads.zzcet(jsPromptResult)).setOnCancelListener(new com.google.android.gms.internal.ads.zzces(jsPromptResult)).create().show();
            } else {
                builderZzL.setMessage(str3).setPositiveButton(android.R.string.ok, new com.google.android.gms.internal.ads.zzcer(jsResult)).setNegativeButton(android.R.string.cancel, new com.google.android.gms.internal.ads.zzceq(jsResult)).setOnCancelListener(new com.google.android.gms.internal.ads.zzcep(jsResult)).create().show();
            }
            return true;
        } catch (android.view.WindowManager.BadTokenException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to display Dialog.", e);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
