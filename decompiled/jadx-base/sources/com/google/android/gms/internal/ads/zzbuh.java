package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbuh implements com.google.android.gms.internal.ads.zzbuj {
    public static com.google.android.gms.internal.ads.zzbuj zza;
    static com.google.android.gms.internal.ads.zzbuj zzb;
    static com.google.android.gms.internal.ads.zzbuj zzc;
    static java.lang.Boolean zzd;
    private static final java.lang.Object zze = new java.lang.Object();
    private final java.lang.Object zzf;
    private final android.content.Context zzg;
    private final java.util.WeakHashMap zzh;
    private final java.util.concurrent.ExecutorService zzi;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzj;
    private final android.content.pm.PackageInfo zzk;
    private final java.lang.String zzl;
    private final java.lang.String zzm;
    private final java.util.concurrent.atomic.AtomicBoolean zzn;
    private boolean zzo;

    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    protected zzbuh(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        android.content.pm.PackageInfo packageInfo;
        this.zzf = new java.lang.Object();
        this.zzh = new java.util.WeakHashMap();
        com.google.android.gms.internal.ads.zzfqv.zza();
        this.zzi = java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool());
        this.zzn = new java.util.concurrent.atomic.AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzg = context;
        this.zzj = versionInfoParcel;
        java.lang.String string = null;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhG)).booleanValue()) {
            android.os.Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            if (context == null || context.getApplicationInfo() == null) {
                packageInfo = null;
            } else {
                try {
                    packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 0);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
            }
        } else {
            packageInfo = null;
        }
        this.zzk = packageInfo;
        this.zzl = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhE)).booleanValue() ? java.util.Locale.getDefault().getCountry() : "unknown";
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhE)).booleanValue()) {
            android.content.Context context2 = this.zzg;
            android.os.Handler handler2 = com.google.android.gms.ads.internal.util.client.zzf.zza;
            if (context2 != null) {
                try {
                    android.content.pm.PackageInfo packageInfo2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(context2).getPackageInfo("com.android.vending", 128);
                    if (packageInfo2 != null) {
                        string = java.lang.Integer.toString(packageInfo2.versionCode);
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                }
            }
        } else {
            string = "unknown";
        }
        this.zzm = string;
    }

    public static com.google.android.gms.internal.ads.zzbuj zza(android.content.Context context) {
        synchronized (zze) {
            if (zza == null) {
                if (zzl(context)) {
                    zza = new com.google.android.gms.internal.ads.zzbuh(context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage());
                } else {
                    zza = new com.google.android.gms.internal.ads.zzbui();
                }
            }
        }
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzbuj zzb(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzc == null) {
                boolean z = false;
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbed.zzc.zze()).booleanValue()) {
                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhz)).booleanValue() || ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbed.zza.zze()).booleanValue()) {
                        z = true;
                    }
                }
                if (zzl(context)) {
                    com.google.android.gms.internal.ads.zzbuh zzbuhVar = new com.google.android.gms.internal.ads.zzbuh(context, versionInfoParcel);
                    zzbuhVar.zzk();
                    zzbuhVar.zzj();
                    zzc = zzbuhVar;
                } else if (!z || context == null) {
                    zzc = new com.google.android.gms.internal.ads.zzbui();
                } else {
                    com.google.android.gms.internal.ads.zzbuh zzbuhVar2 = new com.google.android.gms.internal.ads.zzbuh(context, versionInfoParcel, true);
                    zzbuhVar2.zzk();
                    zzbuhVar2.zzj();
                    zzc = zzbuhVar2;
                }
            }
        }
        return zzc;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:11:0x0037, B:12:0x003e), top: B:18:0x0003 }] */
    public static com.google.android.gms.internal.ads.zzbuj zzc(android.content.Context context) {
        synchronized (zze) {
            if (zzb == null) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhA)).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhz)).booleanValue()) {
                        zzb = new com.google.android.gms.internal.ads.zzbui();
                    } else {
                        zzb = new com.google.android.gms.internal.ads.zzbuh(context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage());
                    }
                } else {
                    zzb = new com.google.android.gms.internal.ads.zzbui();
                }
            }
        }
        return zzb;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:11:0x0033, B:12:0x003a), top: B:18:0x0003 }] */
    public static com.google.android.gms.internal.ads.zzbuj zzd(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzb == null) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhA)).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhz)).booleanValue()) {
                        zzb = new com.google.android.gms.internal.ads.zzbui();
                    } else {
                        zzb = new com.google.android.gms.internal.ads.zzbuh(context, versionInfoParcel);
                    }
                } else {
                    zzb = new com.google.android.gms.internal.ads.zzbui();
                }
            }
        }
        return zzb;
    }

    public static java.lang.String zze(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static java.lang.String zzf(java.lang.Throwable th) {
        return com.google.android.gms.internal.ads.zzfve.zzc(com.google.android.gms.ads.internal.util.client.zzf.zzg(zze(th)));
    }

    private final void zzj() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new com.google.android.gms.internal.ads.zzbuf(this, java.lang.Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzk() {
        java.lang.Thread thread = android.os.Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, true);
        }
        thread.setUncaughtExceptionHandler(new com.google.android.gms.internal.ads.zzbug(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean zzl(android.content.Context context) {
        if (context == null) {
            return false;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmE)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeu.zze.zze()).booleanValue()) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhz)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (zze) {
            if (zzd == null) {
                zzd = java.lang.Boolean.valueOf(com.google.android.gms.ads.internal.client.zzbc.zze().nextInt(100) < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmB)).intValue());
            }
        }
        if (zzd.booleanValue()) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhz)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    protected final void zzg(java.lang.Thread thread, java.lang.Throwable th) {
        if (th != null) {
            boolean zZzo = false;
            boolean zEquals = false;
            for (java.lang.Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (java.lang.StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzo |= com.google.android.gms.ads.internal.util.client.zzf.zzo(stackTraceElement.getClassName());
                    zEquals |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zZzo || zEquals) {
                return;
            }
            if (!this.zzo) {
                zzh(th, "");
            }
            if (this.zzn.getAndSet(true) || !((java.lang.Boolean) com.google.android.gms.internal.ads.zzbed.zzc.zze()).booleanValue()) {
                return;
            }
            com.google.android.gms.internal.ads.zzbbv.zzc(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzh(java.lang.Throwable th, java.lang.String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzi(java.lang.Throwable th, java.lang.String str, float f) {
        java.lang.Throwable th2;
        java.lang.String packageName;
        android.content.pm.PackageInfo packageInfo;
        android.app.ActivityManager.MemoryInfo memoryInfoZzc;
        if (this.zzo) {
            return;
        }
        android.os.Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        boolean zIsCallerInstantApp = false;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeu.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (java.lang.Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                java.lang.Throwable th3 = (java.lang.Throwable) linkedList.pop();
                java.lang.StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcs)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzo(th3.getClass().getName());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new java.lang.StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        java.lang.String className = stackTraceElement.getClassName();
                        if (!android.text.TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new java.lang.StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z) {
                    th2 = th2 == null ? new java.lang.Throwable(th3.getMessage()) : new java.lang.Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((java.lang.StackTraceElement[]) arrayList.toArray(new java.lang.StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            java.lang.String name = th.getClass().getName();
            java.lang.String strZze = zze(th);
            java.lang.String strZzf = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziI)).booleanValue() ? zzf(th) : "";
            double d = f;
            double dRandom = java.lang.Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (dRandom < d) {
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
                try {
                    zIsCallerInstantApp = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzg).isCallerInstantApp();
                } catch (java.lang.Throwable th4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Error fetching instant app info", th4);
                }
                try {
                    packageName = this.zzg.getPackageName();
                } catch (java.lang.Throwable unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                android.net.Uri.Builder builderAppendQueryParameter = new android.net.Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", java.lang.Boolean.toString(zIsCallerInstantApp)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(com.json.ce.y, android.os.Build.VERSION.RELEASE).appendQueryParameter("api", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
                java.lang.String str2 = android.os.Build.MANUFACTURER;
                java.lang.String str3 = android.os.Build.MODEL;
                if (!str3.startsWith(str2)) {
                    str3 = str2 + " " + str3;
                }
                android.net.Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter(com.ironsource.y8.h.G, str3).appendQueryParameter("js", this.zzj.afmaVersion).appendQueryParameter(com.google.ads.mediation.pangle.PangleConstants.APP_ID, packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZze).appendQueryParameter("eids", android.text.TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbe.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "697668803").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", java.lang.Integer.toString(i)).appendQueryParameter("pb_tm", java.lang.String.valueOf(com.google.android.gms.internal.ads.zzbeu.zzc.zze())).appendQueryParameter("gmscv", java.lang.String.valueOf(com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzg))).appendQueryParameter("lite", true != this.zzj.isLiteSdk ? "0" : "1");
                if (!android.text.TextUtils.isEmpty(strZzf)) {
                    builderAppendQueryParameter2.appendQueryParameter("hash", strZzf);
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhF)).booleanValue() && (memoryInfoZzc = com.google.android.gms.ads.internal.util.client.zzf.zzc(this.zzg)) != null) {
                    builderAppendQueryParameter2.appendQueryParameter("available_memory", java.lang.Long.toString(memoryInfoZzc.availMem));
                    builderAppendQueryParameter2.appendQueryParameter("total_memory", java.lang.Long.toString(memoryInfoZzc.totalMem));
                    builderAppendQueryParameter2.appendQueryParameter("is_low_memory", true == memoryInfoZzc.lowMemory ? "1" : "0");
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhE)).booleanValue()) {
                    if (!android.text.TextUtils.isEmpty(this.zzl)) {
                        builderAppendQueryParameter2.appendQueryParameter("countrycode", this.zzl);
                    }
                    if (!android.text.TextUtils.isEmpty(this.zzm)) {
                        builderAppendQueryParameter2.appendQueryParameter("psv", this.zzm);
                    }
                    android.content.Context context = this.zzg;
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        packageInfo = android.webkit.WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo("com.android.webview", 128);
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                            packageInfo = null;
                        }
                    }
                    if (packageInfo != null) {
                        builderAppendQueryParameter2.appendQueryParameter("wvvc", java.lang.Integer.toString(packageInfo.versionCode));
                        builderAppendQueryParameter2.appendQueryParameter("wvvn", packageInfo.versionName);
                        builderAppendQueryParameter2.appendQueryParameter("wvpn", packageInfo.packageName);
                    }
                }
                android.content.pm.PackageInfo packageInfo2 = this.zzk;
                if (packageInfo2 != null) {
                    builderAppendQueryParameter2.appendQueryParameter("appvc", java.lang.String.valueOf(packageInfo2.versionCode));
                    builderAppendQueryParameter2.appendQueryParameter("appvn", this.zzk.versionName);
                }
                arrayList2.add(builderAppendQueryParameter2.toString());
                for (final java.lang.String str4 : arrayList2) {
                    final com.google.android.gms.ads.internal.util.client.zzu zzuVar = new com.google.android.gms.ads.internal.util.client.zzu(null);
                    this.zzi.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbue
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzuVar.zza(str4);
                        }
                    });
                }
            }
        }
    }

    protected zzbuh(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, boolean z) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
