package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzs {
    public static final com.google.android.gms.internal.ads.zzfqw zza = new com.google.android.gms.ads.internal.util.zzf(android.os.Looper.getMainLooper());
    private java.lang.String zzh;
    private volatile java.lang.String zzi;
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference(new android.os.Bundle());
    private final java.util.concurrent.atomic.AtomicBoolean zze = new java.util.concurrent.atomic.AtomicBoolean();
    private boolean zzf = true;
    private final java.lang.Object zzg = new java.lang.Object();
    private boolean zzj = false;
    private boolean zzk = false;
    private final java.util.concurrent.Executor zzl = java.util.concurrent.Executors.newSingleThreadExecutor();

    public static final com.google.android.gms.ads.internal.util.zzbr zzA(android.content.Context context) {
        try {
            java.lang.Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (!(objNewInstance instanceof android.os.IBinder)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            android.os.IBinder iBinder = (android.os.IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.util.zzbr ? (com.google.android.gms.ads.internal.util.zzbr) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.util.zzbp(iBinder);
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzB(android.content.Context context, java.lang.String str) {
        android.content.Context contextZza = com.google.android.gms.internal.ads.zzbvu.zza(context);
        return com.google.android.gms.common.wrappers.Wrappers.packageManager(contextZza).checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean zzC(android.content.Context context) {
        try {
            return com.google.android.gms.common.util.DeviceProperties.isBstar(context);
        } catch (java.lang.NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzD(java.lang.String str) {
        if (!com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            return false;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeY)).booleanValue()) {
            return false;
        }
        java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfa);
        if (!str2.isEmpty()) {
            for (java.lang.String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        java.lang.String str4 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeZ);
        if (str4.isEmpty()) {
            return true;
        }
        for (java.lang.String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzE(android.content.Context context) {
        android.app.KeyguardManager keyguardManagerZzY;
        return (context == null || (keyguardManagerZzY = zzY(context)) == null || !keyguardManagerZzY.isKeyguardLocked()) ? false : true;
    }

    public static final boolean zzF(android.content.Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (java.lang.ClassNotFoundException unused) {
            return true;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzG() {
        int iMyUid = android.os.Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzH(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.os.PowerManager powerManager;
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (android.os.Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (android.os.PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public static final boolean zzI(android.content.Context context) {
        try {
            android.os.Bundle bundleZzZ = zzZ(context);
            return android.text.TextUtils.isEmpty(zzaa(bundleZzZ)) && !android.text.TextUtils.isEmpty(bundleZzZ.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
        } catch (android.os.RemoteException unused) {
        }
    }

    public static final boolean zzJ(android.content.Context context) {
        android.view.Window window;
        if ((context instanceof android.app.Activity) && (window = ((android.app.Activity) context).getWindow()) != null && window.getDecorView() != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.graphics.Rect rect2 = new android.graphics.Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzK(android.view.View view, int i, android.view.MotionEvent motionEvent) {
        java.lang.String strZza;
        int i2;
        int iHeight;
        int iWidth;
        java.lang.String str;
        com.google.android.gms.internal.ads.zzfbo zzfboVarZzD;
        com.google.android.gms.internal.ads.zzfbr zzfbrVarZzR;
        android.view.View childAt = view;
        int[] iArr = new int[2];
        android.graphics.Rect rect = new android.graphics.Rect();
        try {
            java.lang.String packageName = view.getContext().getPackageName();
            if (childAt instanceof com.google.android.gms.internal.ads.zzdoz) {
                childAt = ((com.google.android.gms.internal.ads.zzdoz) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzj) || (childAt instanceof com.google.android.gms.ads.nativead.NativeAdView)) {
                strZza = "NATIVE";
                i2 = 1;
            } else {
                strZza = "UNKNOWN";
                i2 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            long jZzx = zzx(childAt);
            childAt.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            java.lang.String str2 = "none";
            if (!(childAt instanceof com.google.android.gms.internal.ads.zzcga) || (zzfbrVarZzR = ((com.google.android.gms.internal.ads.zzcga) childAt).zzR()) == null) {
                str = "none";
            } else {
                str = zzfbrVarZzR.zzb;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof com.google.android.gms.internal.ads.zzceo) && (zzfboVarZzD = ((com.google.android.gms.internal.ads.zzceo) childAt).zzD()) != null) {
                strZza = com.google.android.gms.internal.ads.zzfbo.zza(zzfboVarZzD.zzb);
                i2 = zzfboVarZzD.zze;
                str2 = zzfboVarZzD.zzE;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi(java.lang.String.format(java.util.Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", java.lang.Integer.valueOf(childAt.hashCode()), packageName, str2, str, strZza, java.lang.Integer.valueOf(i2), childAt.getClass().getName(), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(childAt.getWidth()), java.lang.Integer.valueOf(childAt.getHeight()), java.lang.Integer.valueOf(iWidth), java.lang.Integer.valueOf(iHeight), java.lang.Long.valueOf(jZzx), java.lang.Integer.toString(i, 2)));
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failure getting view location.", e);
        }
    }

    public static final android.app.AlertDialog.Builder zzL(android.content.Context context) {
        com.google.android.gms.ads.internal.zzv.zzr();
        return new android.app.AlertDialog.Builder(context, android.R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzM(android.content.Context context, java.lang.String str, java.lang.String str2) {
        new com.google.android.gms.ads.internal.util.zzbw(context, str, str2, null, null).zzb();
    }

    public static final void zzN(android.content.Context context, java.lang.Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeu.zzb.zze()).booleanValue()) {
                com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, th);
            }
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public static final int zzO(java.lang.String str) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final java.util.Map zzP(android.net.Uri uri) {
        java.lang.String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzp)).booleanValue()) {
            java.util.HashMap map = new java.util.HashMap();
            for (java.lang.String str : uri.getQueryParameterNames()) {
                if (!android.text.TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        java.util.HashMap map2 = new java.util.HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(android.net.Uri.decode(encodedQuery.substring(i, iIndexOf2)), iIndexOf2 == length ? "" : android.net.Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] zzQ(android.app.Activity activity) {
        android.view.View viewFindViewById;
        android.view.Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? zzv() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzR(android.app.Activity activity) {
        android.view.View viewFindViewById;
        android.view.Window window = activity.getWindow();
        int[] iArrZzv = (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? zzv() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzv[0]), com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzv[1])};
    }

    public static final boolean zzS(android.view.View view, android.os.PowerManager powerManager, android.app.KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzv.zzq().zzf || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzo(view);
        long jZzx = zzx(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbu)).booleanValue() || view.getLocalVisibleRect(new android.graphics.Rect()) || view.getGlobalVisibleRect(new android.graphics.Rect())) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkv)).booleanValue()) {
                    return true;
                }
                if (jZzx >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkx)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzT(android.content.Context context, android.content.Intent intent) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkS)).booleanValue()) {
            zzad(context, intent);
            return;
        }
        try {
            zzad(context, intent);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void zzU(android.content.Context context, android.net.Uri uri) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
            android.os.Bundle bundle = new android.os.Bundle();
            intent.putExtras(bundle);
            zzp(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            com.google.android.gms.ads.internal.util.client.zzo.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (android.content.ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("No browser is found.", e);
        }
    }

    public static final int[] zzV(android.app.Activity activity) {
        int[] iArrZzQ = zzQ(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzQ[0]), com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzQ[1])};
    }

    public static final boolean zzW(android.view.View view, android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        return zzS(view, applicationContext != null ? (android.os.PowerManager) applicationContext.getSystemService("power") : null, zzY(context));
    }

    public static final void zzX(android.content.Context context, android.content.Intent intent, com.google.android.gms.internal.ads.zzdrw zzdrwVar, java.lang.String str) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmU)).booleanValue() || !(context instanceof com.google.android.gms.internal.ads.zzcgq)) {
            zzT(context, intent);
            return;
        }
        try {
            android.net.Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmW))) {
                    ((com.google.android.gms.internal.ads.zzcgq) context).zzc(intent, 236);
                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmV)).booleanValue() || zzdrwVar == null) {
                        return;
                    }
                    com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = zzdrwVar.zza();
                    zzdrvVarZza.zzb("action", "hila");
                    zzdrvVarZza.zzb("gqi", com.google.android.gms.internal.ads.zzfve.zzc(str));
                    zzdrvVarZza.zzf();
                    return;
                }
            }
            zzT(context, intent);
        } catch (android.content.ActivityNotFoundException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.startActivityForResult");
            zzT(context, intent);
        } catch (java.lang.SecurityException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.startActivityForResult");
            zzT(context, intent);
        } catch (java.lang.Exception e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e3);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "AdUtil.startActivityForResult");
            zzT(context, intent);
        }
    }

    private static android.app.KeyguardManager zzY(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof android.app.KeyguardManager)) {
            return null;
        }
        return (android.app.KeyguardManager) systemService;
    }

    private static android.os.Bundle zzZ(android.content.Context context) throws android.os.RemoteException {
        try {
            return com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    private static java.lang.String zzaa(android.os.Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        java.lang.String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (android.text.TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    private static boolean zzab(java.lang.String str, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            java.util.regex.Pattern patternCompile = (java.util.regex.Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = java.util.regex.Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (java.util.regex.PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void zzac(android.content.Context context, android.net.Uri uri) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private static final void zzad(android.content.Context context, android.content.Intent intent) {
        try {
            context.startActivity(intent);
        } catch (java.lang.Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final java.lang.String zzae(final android.content.Context context, java.lang.String str) {
        java.lang.String strZzr;
        java.lang.String str2;
        if (str == null) {
            return zzr();
        }
        try {
            com.google.android.gms.ads.internal.util.zzcg zzcgVarZza = com.google.android.gms.ads.internal.util.zzcg.zza();
            if (android.text.TextUtils.isEmpty(zzcgVarZza.zza)) {
                if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                    str2 = (java.lang.String) com.google.android.gms.ads.internal.util.zzcd.zza(context, new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.internal.util.zzce
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            android.content.Context context2 = context;
                            android.content.SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            java.lang.String string = sharedPreferences.getString("user_agent", "");
                            if (!android.text.TextUtils.isEmpty(string)) {
                                com.google.android.gms.ads.internal.util.zze.zza("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            com.google.android.gms.ads.internal.util.zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                            java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(context2);
                            com.google.android.gms.common.util.SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final android.content.Context remoteContext = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
                    str2 = (java.lang.String) com.google.android.gms.ads.internal.util.zzcd.zza(context, new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.internal.util.zzcf
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            android.content.SharedPreferences sharedPreferences;
                            android.content.Context context2 = remoteContext;
                            android.content.Context context3 = context;
                            boolean z = false;
                            if (context2 != null) {
                                com.google.android.gms.ads.internal.util.zze.zza("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                com.google.android.gms.ads.internal.util.zze.zza("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z = true;
                            }
                            java.lang.String string = sharedPreferences.getString("user_agent", "");
                            if (android.text.TextUtils.isEmpty(string)) {
                                com.google.android.gms.ads.internal.util.zze.zza("Reading user agent from WebSettings");
                                string = android.webkit.WebSettings.getDefaultUserAgent(context3);
                                if (z) {
                                    sharedPreferences.edit().putString("user_agent", string).apply();
                                    com.google.android.gms.ads.internal.util.zze.zza("Persisting user agent.");
                                }
                            }
                            return string;
                        }
                    });
                }
                zzcgVarZza.zza = str2;
            }
            strZzr = zzcgVarZza.zza;
        } catch (java.lang.Exception unused) {
            strZzr = null;
        }
        if (android.text.TextUtils.isEmpty(strZzr)) {
            strZzr = android.webkit.WebSettings.getDefaultUserAgent(context);
        }
        if (android.text.TextUtils.isEmpty(strZzr)) {
            strZzr = zzr();
        }
        java.lang.String str3 = strZzr + " (Mobile; " + str;
        try {
            if (com.google.android.gms.common.wrappers.Wrappers.packageManager(context).isCallerInstantApp()) {
                str3 = str3 + ";aia";
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.getUserAgent");
        }
        return str3.concat(")");
    }

    public static java.util.List zzd() {
        com.google.android.gms.internal.ads.zzbcc zzbccVar = com.google.android.gms.internal.ads.zzbcl.zza;
        java.util.List listZzb = com.google.android.gms.ads.internal.client.zzbe.zza().zzb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listZzb.iterator();
        while (it.hasNext()) {
            java.util.Iterator it2 = com.google.android.gms.internal.ads.zzfvc.zzb(com.google.android.gms.internal.ads.zzfty.zzc(',')).zzd((java.lang.String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(java.lang.Long.valueOf((java.lang.String) it2.next()));
                } catch (java.lang.NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static void zzh(java.lang.Runnable runnable) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            runnable.run();
        } else {
            com.google.android.gms.internal.ads.zzbzw.zza.execute(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static final boolean zzo(android.view.View view) {
        android.app.Activity activity;
        android.view.View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            android.content.Context context = rootView.getContext();
            if (context instanceof android.app.Activity) {
                activity = (android.app.Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        android.view.Window window = activity.getWindow();
        android.view.WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    public static final void zzp(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        android.os.Bundle extras = intent.getExtras() != null ? intent.getExtras() : new android.os.Bundle();
        extras.putBinder(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION, null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final java.lang.String zzq(android.content.Context context) throws android.os.RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzaa(zzZ(context));
    }

    static final java.lang.String zzr() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (android.os.Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(android.os.Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(java.util.Locale.getDefault());
        if (android.os.Build.DEVICE != null) {
            sb.append("; ");
            sb.append(android.os.Build.DEVICE);
            if (android.os.Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(android.os.Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final java.lang.String zzs() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final java.lang.Integer zzt(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("display");
        if (systemService instanceof android.hardware.display.DisplayManager) {
            return java.lang.Integer.valueOf(((android.hardware.display.DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final android.util.DisplayMetrics zzu(android.view.WindowManager windowManager) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzv() {
        return new int[]{0, 0};
    }

    public static final java.util.Map zzw(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.util.HashSet hashSet = new java.util.HashSet();
                org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        java.lang.String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzx(android.view.View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof android.view.View)) {
                break;
            }
            android.view.View view2 = (android.view.View) view;
            fMin = java.lang.Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return java.lang.Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final android.webkit.WebResourceResponse zzy(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            java.util.HashMap map = new java.util.HashMap();
            map.put(com.google.common.net.HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str));
            map.put(com.google.common.net.HttpHeaders.CACHE_CONTROL, "max-stale=3600");
            java.lang.String str3 = (java.lang.String) new com.google.android.gms.ads.internal.util.zzbo(context).zzb(0, str2, map, null).get(60L, java.util.concurrent.TimeUnit.SECONDS);
            if (str3 != null) {
                return new android.webkit.WebResourceResponse("application/javascript", com.adjust.sdk.Constants.ENCODING, new java.io.ByteArrayInputStream(str3.getBytes(com.adjust.sdk.Constants.ENCODING)));
            }
        } catch (java.io.IOException | java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final java.lang.String zzz() {
        android.content.res.Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        return resourcesZze != null ? resourcesZze.getString(com.google.android.gms.ads.impl.R.string.s7) : "Test Ad";
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(final android.net.Uri uri) {
        return com.google.android.gms.internal.ads.zzgch.zzj(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.google.android.gms.internal.ads.zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
                com.google.android.gms.ads.internal.zzv.zzq();
                return com.google.android.gms.ads.internal.util.zzs.zzP(uri);
            }
        }, this.zzl);
    }

    public final java.lang.String zzc(android.content.Context context, java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzle)).booleanValue()) {
            if (this.zzi != null) {
                return this.zzi;
            }
            this.zzi = zzae(context, str);
            return this.zzi;
        }
        synchronized (this.zzg) {
            java.lang.String str2 = this.zzh;
            if (str2 != null) {
                return str2;
            }
            java.lang.String strZzae = zzae(context, str);
            this.zzh = strZzae;
            return strZzae;
        }
    }

    public final void zzf(android.content.Context context, java.lang.String str, boolean z, java.net.HttpURLConnection httpURLConnection, boolean z2, int i) {
        int iZza = zza(i);
        com.google.android.gms.ads.internal.util.client.zzo.zzi("HTTP timeout: " + iZza + " milliseconds.");
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        if (android.text.TextUtils.isEmpty(httpURLConnection.getRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT))) {
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    final /* synthetic */ void zzg(android.content.Context context, java.lang.String str, android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
        this.zzd.set(com.google.android.gms.ads.internal.util.zzad.zzb(context, str));
    }

    public final void zzi(final android.content.Context context, final java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzv.zzq();
        bundle.putString(com.ironsource.y8.h.G, zzs());
        com.google.android.gms.internal.ads.zzbcc zzbccVar = com.google.android.gms.internal.ads.zzbcl.zza;
        bundle.putString("eids", android.text.TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbe.zza().zza()));
        if (bundle.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Empty or null bundle.");
        } else {
            final java.lang.String str3 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkt);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(com.google.android.gms.ads.internal.util.zzad.zza(context, str3, new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str4) {
                        this.zza.zzg(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((android.os.Bundle) this.zzd.get());
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        com.google.android.gms.ads.internal.util.client.zzf.zzw(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final com.google.android.gms.ads.internal.util.client.zzt zza(java.lang.String str4) {
                com.google.android.gms.internal.ads.zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzM(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }

    public final boolean zzj(java.lang.String str) {
        return zzab(str, this.zzb, (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzao));
    }

    public final boolean zzk(java.lang.String str) {
        return zzab(str, this.zzc, (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzap));
    }

    public final boolean zzl(android.content.Context context) {
        if (this.zzk) {
            return false;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        com.google.android.gms.ads.internal.util.zzr zzrVar = null;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkR)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new com.google.android.gms.ads.internal.util.zzp(this, zzrVar), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new com.google.android.gms.ads.internal.util.zzp(this, zzrVar), intentFilter, 4);
        }
        this.zzk = true;
        return true;
    }

    public final boolean zzm(android.content.Context context) {
        if (this.zzj) {
            return false;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        com.google.android.gms.ads.internal.util.zzr zzrVar = null;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkR)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new com.google.android.gms.ads.internal.util.zzq(this, zzrVar), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new com.google.android.gms.ads.internal.util.zzq(this, zzrVar), intentFilter, 4);
        }
        this.zzj = true;
        return true;
    }

    public final int zzn(android.content.Context context, android.net.Uri uri) {
        if (context == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof android.app.Activity)) {
            zzac(context, uri);
            return 2;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeG)).booleanValue()) {
            androidx.browser.customtabs.CustomTabsIntent customTabsIntentBuild = new androidx.browser.customtabs.CustomTabsIntent.Builder(com.google.android.gms.ads.internal.zzv.zzf().zza()).build();
            customTabsIntentBuild.intent.setPackage(com.google.android.gms.internal.ads.zzhfk.zza(context));
            customTabsIntentBuild.launchUrl(context, uri);
            return 5;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeE)).booleanValue()) {
            zzac(context, uri);
            return 9;
        }
        com.google.android.gms.internal.ads.zzbdm zzbdmVar = new com.google.android.gms.internal.ads.zzbdm();
        zzbdmVar.zze(new com.google.android.gms.ads.internal.util.zzo(this, zzbdmVar, context, uri));
        zzbdmVar.zzb((android.app.Activity) context);
        return 5;
    }
}
