package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzf {
    public static final android.os.Handler zza = new com.google.android.gms.internal.ads.zzfqw(android.os.Looper.getMainLooper());
    private static final java.lang.String zzb = com.google.android.gms.ads.AdView.class.getName();
    private static final java.lang.String zzc = com.google.android.gms.ads.interstitial.InterstitialAd.class.getName();
    private static final java.lang.String zzd = com.google.android.gms.ads.admanager.AdManagerAdView.class.getName();
    private static final java.lang.String zze = com.google.android.gms.ads.admanager.AdManagerInterstitialAd.class.getName();
    private static final java.lang.String zzf = com.google.android.gms.ads.search.SearchAdView.class.getName();
    private static final java.lang.String zzg = com.google.android.gms.ads.AdLoader.class.getName();
    private float zzh = -1.0f;

    private final org.json.JSONArray zzA(java.util.Collection collection) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzB(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void zzB(org.json.JSONArray jSONArray, java.lang.Object obj) throws org.json.JSONException {
        if (obj instanceof android.os.Bundle) {
            jSONArray.put(zzi((android.os.Bundle) obj));
            return;
        }
        if (obj instanceof java.util.Map) {
            jSONArray.put(zzj((java.util.Map) obj));
            return;
        }
        if (obj instanceof java.util.Collection) {
            jSONArray.put(zzA((java.util.Collection) obj));
        } else if (obj instanceof java.lang.Object[]) {
            jSONArray.put(zzh((java.lang.Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void zzC(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) throws org.json.JSONException {
        java.lang.Boolean[] boolArr;
        java.lang.Long[] lArr;
        java.lang.Double[] dArr;
        java.lang.Integer[] numArr;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzo)).booleanValue()) {
            str = java.lang.String.valueOf(str);
        }
        if (obj instanceof android.os.Bundle) {
            jSONObject.put(str, zzi((android.os.Bundle) obj));
            return;
        }
        if (obj instanceof java.util.Map) {
            jSONObject.put(str, zzj((java.util.Map) obj));
            return;
        }
        if (obj instanceof java.util.Collection) {
            jSONObject.put(java.lang.String.valueOf(str), zzA((java.util.Collection) obj));
            return;
        }
        if (obj instanceof java.lang.Object[]) {
            jSONObject.put(str, zzA(java.util.Arrays.asList((java.lang.Object[]) obj)));
            return;
        }
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new java.lang.Integer[0];
            } else {
                int length = iArr.length;
                java.lang.Integer[] numArr2 = new java.lang.Integer[length];
                while (i < length) {
                    numArr2[i] = java.lang.Integer.valueOf(iArr[i]);
                    i++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, zzh(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new java.lang.Double[0];
            } else {
                int length2 = dArr2.length;
                java.lang.Double[] dArr3 = new java.lang.Double[length2];
                while (i < length2) {
                    dArr3[i] = java.lang.Double.valueOf(dArr2[i]);
                    i++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, zzh(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new java.lang.Long[0];
            } else {
                int length3 = jArr.length;
                java.lang.Long[] lArr2 = new java.lang.Long[length3];
                while (i < length3) {
                    lArr2[i] = java.lang.Long.valueOf(jArr[i]);
                    i++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, zzh(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new java.lang.Boolean[0];
        } else {
            int length4 = zArr.length;
            java.lang.Boolean[] boolArr2 = new java.lang.Boolean[length4];
            while (i < length4) {
                boolArr2[i] = java.lang.Boolean.valueOf(zArr[i]);
                i++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, zzh(boolArr));
    }

    private static final void zzD(android.view.ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        android.content.Context context = viewGroup.getContext();
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int iZzx = zzx(context, 3);
        frameLayout.addView(textView, new android.widget.FrameLayout.LayoutParams(zzsVar.zzf - iZzx, zzsVar.zzc - iZzx, 17));
        viewGroup.addView(frameLayout, zzsVar.zzf, zzsVar.zzc);
    }

    public static int zza(android.content.Context context, int i) {
        android.util.DisplayMetrics displayMetrics;
        android.content.res.Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        android.content.res.Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        return i == i2 ? java.lang.Math.round(displayMetrics.heightPixels / displayMetrics.density) : java.lang.Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static android.app.ActivityManager.MemoryInfo zzc(android.content.Context context) {
        android.app.ActivityManager activityManager;
        if (context == null || (activityManager = (android.app.ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
        } catch (java.lang.NullPointerException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Error retrieving the memory information.");
        }
        return memoryInfo;
    }

    public static com.google.android.gms.ads.AdSize zzd(android.content.Context context, int i, int i2, int i3) {
        int iRound;
        int iZza = zza(context, i3);
        if (iZza == -1) {
            return com.google.android.gms.ads.AdSize.INVALID;
        }
        int iMin = java.lang.Math.min(90, java.lang.Math.round(iZza * 0.15f));
        if (i > 655) {
            iRound = java.lang.Math.round((i / 728.0f) * 90.0f);
        } else if (i > 632) {
            iRound = 81;
        } else if (i > 526) {
            iRound = java.lang.Math.round((i / 468.0f) * 60.0f);
        } else {
            iRound = i > 432 ? 68 : java.lang.Math.round((i / 320.0f) * 50.0f);
        }
        return new com.google.android.gms.ads.AdSize(i, java.lang.Math.max(java.lang.Math.min(iRound, iMin), 50));
    }

    public static java.lang.String zze() {
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        byte[] byteArray = java.math.BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = java.math.BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        java.lang.String string = new java.math.BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                java.lang.System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new java.math.BigInteger(1, bArr).toString();
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public static java.lang.String zzf(java.lang.String str) {
        return zzz(str, "MD5");
    }

    public static java.lang.String zzg(java.lang.String str) {
        return zzz(str, "SHA-256");
    }

    public static boolean zzo(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((java.lang.String) com.google.android.gms.internal.ads.zzbeu.zzd.zze());
    }

    public static final int zzp(android.util.DisplayMetrics displayMetrics, int i) {
        return (int) android.util.TypedValue.applyDimension(1, i, displayMetrics);
    }

    public static final java.lang.String zzq(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.String str) {
        java.lang.String className;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[i];
            java.lang.String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (zzb.equalsIgnoreCase(className2) || zzc.equalsIgnoreCase(className2) || zzd.equalsIgnoreCase(className2) || zze.equalsIgnoreCase(className2) || zzf.equalsIgnoreCase(className2) || zzg.equalsIgnoreCase(className2))) {
                className = stackTraceElementArr[i2].getClassName();
                break;
            }
            i = i2;
        }
        if (str != null) {
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ".");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i3 = 2; i3 > 0 && stringTokenizer.hasMoreElements(); i3--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static final boolean zzr() {
        boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlm)).booleanValue();
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return android.os.Build.DEVICE.startsWith("generic");
        }
        if (android.os.Build.FINGERPRINT.contains("generic") || android.os.Build.FINGERPRINT.contains("emulator")) {
            return true;
        }
        return zBooleanValue && android.os.Build.HARDWARE.contains("ranchu");
    }

    public static final boolean zzs(android.content.Context context, int i) {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i) == 0;
    }

    public static final boolean zzt(android.content.Context context) {
        int iIsGooglePlayServicesAvailable = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
        return iIsGooglePlayServicesAvailable == 0 || iIsGooglePlayServicesAvailable == 2;
    }

    public static final boolean zzu() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static final int zzv(android.util.DisplayMetrics displayMetrics, int i) {
        return java.lang.Math.round(i / displayMetrics.density);
    }

    public static final void zzw(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, com.google.android.gms.ads.internal.util.client.zze zzeVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString(com.json.ce.y, android.os.Build.VERSION.RELEASE);
        bundle.putString("api", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
        bundle.putString(com.google.ads.mediation.pangle.PangleConstants.APP_ID, applicationContext.getPackageName());
        if (str == null) {
            str = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(context) + ".244410000";
        }
        bundle.putString("js", str);
        android.net.Uri.Builder builderAppendQueryParameter = new android.net.Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (java.lang.String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzeVar.zza(builderAppendQueryParameter.toString());
    }

    public static final int zzx(android.content.Context context, int i) {
        return zzp(context.getResources().getDisplayMetrics(), i);
    }

    public static final java.lang.String zzy(android.content.Context context) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        java.lang.String string = contentResolver == null ? null : android.provider.Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || zzr()) {
            string = "emulator";
        }
        return zzz(string, "MD5");
    }

    private static java.lang.String zzz(java.lang.String str, java.lang.String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return java.lang.String.format(java.util.Locale.US, "%032X", new java.math.BigInteger(1, messageDigest.digest()));
            } catch (java.lang.ArithmeticException unused) {
                return null;
            } catch (java.security.NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public final int zzb(android.content.Context context, int i) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                if (this.zzh < 0.0f) {
                    android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                    android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.zzh = displayMetrics.density;
                }
            }
        }
        return java.lang.Math.round(i / this.zzh);
    }

    final org.json.JSONArray zzh(java.lang.Object[] objArr) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (java.lang.Object obj : objArr) {
            zzB(jSONArray, obj);
        }
        return jSONArray;
    }

    public final org.json.JSONObject zzi(android.os.Bundle bundle) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.lang.String str : bundle.keySet()) {
            zzC(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final org.json.JSONObject zzj(java.util.Map map) throws org.json.JSONException {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.lang.String str : map.keySet()) {
                zzC(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (java.lang.ClassCastException e) {
            throw new org.json.JSONException("Could not convert map to JSON: ".concat(java.lang.String.valueOf(e.getMessage())));
        }
    }

    public final org.json.JSONObject zzk(android.os.Bundle bundle, org.json.JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return zzi(bundle);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error converting Bundle to JSON", e);
            return null;
        }
    }

    public final void zzl(android.view.ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(str2);
        }
        zzD(viewGroup, zzsVar, str, -65536, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
    }

    public final void zzm(android.view.ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str) {
        zzD(viewGroup, zzsVar, "Ads by Google", androidx.core.view.ViewCompat.MEASURED_STATE_MASK, -1);
    }

    public final void zzn(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z) {
        zzw(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.client.zzc
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final com.google.android.gms.ads.internal.util.client.zzt zza(java.lang.String str3) {
                new com.google.android.gms.ads.internal.util.client.zzd(this.zza, str3).start();
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }
}
