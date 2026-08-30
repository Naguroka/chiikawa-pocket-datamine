package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbyi {
    private final java.lang.Object zzi;
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.lang.Object zzc = new java.lang.Object();
    private java.lang.String zzd = null;
    final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicInteger zze = new java.util.concurrent.atomic.AtomicInteger(-1);
    private final java.util.concurrent.atomic.AtomicReference zzf = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.util.concurrent.atomic.AtomicReference zzg = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.util.concurrent.ConcurrentMap zzh = new java.util.concurrent.ConcurrentHashMap(9);

    public zzbyi() {
        new java.util.concurrent.atomic.AtomicReference(null);
        new java.util.concurrent.ArrayBlockingQueue(20);
        this.zzi = new java.lang.Object();
    }

    public static final android.os.Bundle zzq(java.util.Map map) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                try {
                    if (java.util.Objects.equals(str, "value")) {
                        bundle.putDouble(str, java.lang.Double.parseDouble((java.lang.String) map.get(str)));
                    } else {
                        bundle.putString(str, (java.lang.String) map.get(str));
                    }
                } catch (java.lang.NullPointerException | java.lang.NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    static final boolean zzr(android.content.Context context) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzav)).booleanValue()) {
            return false;
        }
        if (com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID) < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaw)).intValue()) {
            return false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzax)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final java.lang.Object zzs(java.lang.String str, android.content.Context context) {
        if (!zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return null;
        }
        try {
            return zzt(context, str).invoke(this.zzf.get(), new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzw(str, true);
            return null;
        }
    }

    private final java.lang.reflect.Method zzt(android.content.Context context, java.lang.String str) {
        java.lang.reflect.Method method = (java.lang.reflect.Method) this.zzh.get(str);
        if (method != null) {
            return method;
        }
        try {
            java.lang.reflect.Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new java.lang.Class[0]);
            this.zzh.put(str, declaredMethod);
            return declaredMethod;
        } catch (java.lang.Exception unused) {
            zzw(str, false);
            return null;
        }
    }

    private final void zzu(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            java.lang.reflect.Method declaredMethod = (java.lang.reflect.Method) this.zzh.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, java.lang.String.class);
                    this.zzh.put(str2, declaredMethod);
                } catch (java.lang.Exception unused) {
                    zzw(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzf.get(), str);
                com.google.android.gms.ads.internal.util.zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (java.lang.Exception unused2) {
                zzw(str2, false);
            }
        }
    }

    private final void zzv(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (zzp(context)) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            try {
                bundle2.putLong("_aeid", java.lang.Long.parseLong(str2));
            } catch (java.lang.NullPointerException | java.lang.NumberFormatException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Invalid event ID: ".concat(java.lang.String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                java.lang.reflect.Method declaredMethod = (java.lang.reflect.Method) this.zzh.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", java.lang.String.class, java.lang.String.class, android.os.Bundle.class);
                        this.zzh.put("logEventInternal", declaredMethod);
                    } catch (java.lang.Exception unused) {
                        zzw("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.zzf.get(), "am", str, bundle2);
                } catch (java.lang.Exception unused2) {
                    zzw("logEventInternal", true);
                }
            }
        }
    }

    private final void zzw(java.lang.String str, boolean z) {
        if (this.zza.get()) {
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Invoke Firebase method " + str + " error.");
        if (z) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.zza.set(true);
        }
    }

    private final boolean zzx(android.content.Context context, java.lang.String str, java.util.concurrent.atomic.AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                com.google.android.gms.internal.ads.zzbyf.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", android.content.Context.class).invoke(null, context));
            } catch (java.lang.Exception unused) {
                zzw("getInstance", z);
                return false;
            }
        }
        return true;
    }

    public final java.lang.String zza(android.content.Context context) {
        java.lang.Object objZzs;
        if (zzp(context) && (objZzs = zzs("generateEventId", context)) != null) {
            return objZzs.toString();
        }
        return null;
    }

    public final java.lang.String zzb(final android.content.Context context) {
        java.util.concurrent.ExecutorService threadPoolExecutor;
        if (!zzp(context)) {
            return null;
        }
        long jLongValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzat)).longValue();
        if (jLongValue < 0) {
            return (java.lang.String) zzs("getAppInstanceId", context);
        }
        if (this.zzb.get() == null) {
            if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = com.google.android.gms.internal.ads.zzfqv.zza().zzc(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzau)).intValue(), new com.google.android.gms.internal.ads.zzbyh(this), 2);
            } else {
                threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzau)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzau)).intValue(), 1L, java.util.concurrent.TimeUnit.MINUTES, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.ads.zzbyh(this));
            }
            com.google.android.gms.internal.ads.zzbyf.zza(this.zzb, null, threadPoolExecutor);
        }
        try {
            return (java.lang.String) ((java.util.concurrent.ExecutorService) this.zzb.get()).submit(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzbyg
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.zza.zze(context);
                }
            }).get(jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.util.concurrent.TimeoutException unused) {
            return "TIME_OUT";
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    public final java.lang.String zzc(android.content.Context context) {
        if (zzp(context) && zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            try {
                java.lang.String str = (java.lang.String) zzt(context, "getCurrentScreenName").invoke(this.zzf.get(), new java.lang.Object[0]);
                if (str == null) {
                    str = (java.lang.String) zzt(context, "getCurrentScreenClass").invoke(this.zzf.get(), new java.lang.Object[0]);
                }
                return str == null ? "" : str;
            } catch (java.lang.Exception unused) {
                zzw("getCurrentScreenName", false);
            }
        }
        return "";
    }

    public final java.lang.String zzd(android.content.Context context) {
        if (!zzp(context)) {
            return null;
        }
        synchronized (this.zzc) {
            java.lang.String str = this.zzd;
            if (str != null) {
                return str;
            }
            java.lang.String str2 = (java.lang.String) zzs("getGmpAppId", context);
            this.zzd = str2;
            return str2;
        }
    }

    final /* synthetic */ java.lang.String zze(android.content.Context context) throws java.lang.Exception {
        return (java.lang.String) zzs("getAppInstanceId", context);
    }

    public final void zzf(android.content.Context context, java.lang.String str) {
        if (zzp(context)) {
            zzu(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzg(android.content.Context context, java.lang.String str) {
        if (zzp(context)) {
            zzu(context, str, "endAdUnitExposure");
        }
    }

    public final void zzh(android.content.Context context, java.lang.String str) {
        zzv(context, "_aa", str, null);
    }

    public final void zzi(android.content.Context context, java.lang.String str) {
        zzv(context, "_aq", str, null);
    }

    public final void zzj(android.content.Context context, java.lang.String str, java.util.Map map) {
        zzv(context, "_ac", str, zzq(map));
    }

    public final void zzk(android.content.Context context, java.lang.String str, java.util.Map map) {
        zzv(context, "_ai", str, zzq(map));
    }

    public final void zzl(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        if (zzp(context)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zzv(context, "_ar", str, bundle);
            com.google.android.gms.ads.internal.util.zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final void zzm(android.content.Context context, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaA)).booleanValue() && zzp(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzn(android.content.Context context, com.google.android.gms.ads.internal.client.zzfv zzfvVar) {
        com.google.android.gms.internal.ads.zzbyj.zzd(context).zzb().zzc(zzfvVar);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaA)).booleanValue() && zzp(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    @java.lang.Deprecated
    public final void zzo(android.content.Context context, java.lang.String str) {
        if (zzp(context) && (context instanceof android.app.Activity) && zzx(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            java.lang.reflect.Method declaredMethod = (java.lang.reflect.Method) this.zzh.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", android.app.Activity.class, java.lang.String.class, java.lang.String.class);
                    this.zzh.put("setCurrentScreen", declaredMethod);
                } catch (java.lang.Exception unused) {
                    zzw("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzg.get(), (android.app.Activity) context, str, context.getPackageName());
            } catch (java.lang.Exception unused2) {
                zzw("setCurrentScreen", false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    public final boolean zzp(android.content.Context context) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzan)).booleanValue() && !this.zza.get()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzay)).booleanValue()) {
                return true;
            }
            if (this.zze.get() == -1) {
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzs(context, 12451000)) {
                    this.zze.set(1);
                } else {
                    com.google.android.gms.ads.internal.client.zzbc.zzb();
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzt(context)) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zze.set(0);
                    } else {
                        this.zze.set(1);
                    }
                }
            }
            if (this.zze.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
