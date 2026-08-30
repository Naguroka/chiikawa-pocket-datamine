package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbx implements com.google.android.gms.internal.consent_sdk.zzd {
    private final android.app.Application zza;
    private final com.google.android.gms.internal.consent_sdk.zzbt zzb;
    private final android.os.Handler zzc;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.gms.internal.consent_sdk.zze zze;
    private final com.google.android.gms.internal.consent_sdk.zzak zzf;
    private final com.google.android.gms.internal.consent_sdk.zzay zzg;
    private final com.google.android.gms.internal.consent_sdk.zzam zzh;

    zzbx(android.app.Application application, com.google.android.gms.internal.consent_sdk.zzbt zzbtVar, android.os.Handler handler, java.util.concurrent.Executor executor, com.google.android.gms.internal.consent_sdk.zze zzeVar, com.google.android.gms.internal.consent_sdk.zzak zzakVar, com.google.android.gms.internal.consent_sdk.zzay zzayVar, com.google.android.gms.internal.consent_sdk.zzam zzamVar) {
        this.zza = application;
        this.zzb = zzbtVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzakVar;
        this.zzg = zzayVar;
        this.zzh = zzamVar;
    }

    private final void zzg(org.json.JSONObject jSONObject) {
        java.lang.String strOptString = jSONObject.optString("url");
        if (android.text.TextUtils.isEmpty(strOptString)) {
            android.util.Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        android.net.Uri uri = android.net.Uri.parse(strOptString);
        if (uri.getScheme() == null) {
            android.util.Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(java.lang.String.valueOf(strOptString)));
        }
        try {
            this.zzb.startActivity(new android.content.Intent("android.intent.action.VIEW", uri));
        } catch (android.content.ActivityNotFoundException e) {
            android.util.Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(java.lang.String.valueOf(strOptString)), e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final java.util.concurrent.Executor zza() {
        final android.os.Handler handler = this.zzc;
        java.util.Objects.requireNonNull(handler);
        return new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzbv
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(java.lang.String str, org.json.JSONObject jSONObject) {
        byte b;
        byte b2 = -1;
        switch (str) {
            case "load_complete":
                b = 0;
                break;
            case "configure_app_assets":
                b = 3;
                break;
            case "browser":
                b = 2;
                break;
            case "dismiss":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            this.zzg.zzi();
            return true;
        }
        if (b != 1) {
            if (b == 2) {
                zzg(jSONObject);
                return true;
            }
            if (b != 3) {
                return false;
            }
            zzc();
            return true;
        }
        java.lang.String strOptString = jSONObject.optString("status");
        switch (strOptString.hashCode()) {
            case -954325659:
                if (strOptString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                    b2 = 3;
                }
                break;
            case -258041904:
                if (strOptString.equals("personalized")) {
                    b2 = 0;
                }
                break;
            case 429411856:
                if (strOptString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                    b2 = 4;
                }
                break;
            case 467888915:
                if (strOptString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                    b2 = 1;
                }
                break;
            case 1666911234:
                if (strOptString.equals("non_personalized")) {
                    b2 = 2;
                }
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4) {
            this.zzg.zzg(3);
        } else {
            this.zzg.zzh(new com.google.android.gms.internal.consent_sdk.zzg(1, "We are getting something wrong with the webview."));
        }
        return true;
    }

    public final void zzc() {
        this.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }

    final /* synthetic */ void zzd() {
        java.lang.String strConcat;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        android.app.Application application = this.zza;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            android.graphics.drawable.Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                strConcat = null;
            } else {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmapCreateBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strConcat = "data:image/png;base64,".concat(java.lang.String.valueOf(android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", strConcat);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            for (java.lang.String str : this.zzh.zzc().keySet()) {
                jSONObject2.put(str, this.zzh.zzc().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (org.json.JSONException unused) {
        }
        this.zzg.zzc().zzd("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    final void zze(java.lang.String str) {
        android.util.Log.d("UserMessagingPlatform", "Receive consent action: ".concat(java.lang.String.valueOf(str)));
        android.net.Uri uri = android.net.Uri.parse(str);
        this.zze.zzb(uri.getQueryParameter("action"), uri.getQueryParameter("args"), this, this.zzf);
    }

    final void zzf(int i, java.lang.String str, java.lang.String str2) {
        this.zzg.zzj(new com.google.android.gms.internal.consent_sdk.zzg(2, java.lang.String.format(java.util.Locale.US, "WebResourceError(%d, %s): %s", java.lang.Integer.valueOf(i), str2, str)));
    }
}
