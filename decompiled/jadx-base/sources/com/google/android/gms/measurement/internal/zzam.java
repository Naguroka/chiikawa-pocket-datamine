package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzam extends com.google.android.gms.measurement.internal.zzjq {
    private java.lang.Boolean zza;
    private java.lang.String zzb;
    private com.google.android.gms.measurement.internal.zzal zzc;
    private java.lang.Boolean zzd;

    zzam(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
        this.zzc = new com.google.android.gms.measurement.internal.zzal() { // from class: com.google.android.gms.measurement.internal.zzak
            @Override // com.google.android.gms.measurement.internal.zzal
            public final java.lang.String zza(java.lang.String str, java.lang.String str2) {
                return null;
            }
        };
    }

    public static final long zzF() {
        return ((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzd.zza(null)).longValue();
    }

    public static final int zzG() {
        return java.lang.Math.max(0, ((java.lang.Integer) com.google.android.gms.measurement.internal.zzgi.zzi.zza(null)).intValue());
    }

    public static final long zzH() {
        return ((java.lang.Integer) com.google.android.gms.measurement.internal.zzgi.zzk.zza(null)).intValue();
    }

    public static final long zzI() {
        return ((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzQ.zza(null)).longValue();
    }

    public static final long zzJ() {
        return ((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzL.zza(null)).longValue();
    }

    private final java.lang.String zzK(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String str3 = (java.lang.String) java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class, java.lang.String.class).invoke(null, str, "");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
            return str3;
        } catch (java.lang.ClassNotFoundException e) {
            this.zzu.zzaW().zze().zzb("Could not find SystemProperties class", e);
            return "";
        } catch (java.lang.IllegalAccessException e2) {
            this.zzu.zzaW().zze().zzb("Could not access SystemProperties.get()", e2);
            return "";
        } catch (java.lang.NoSuchMethodException e3) {
            this.zzu.zzaW().zze().zzb("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (java.lang.reflect.InvocationTargetException e4) {
            this.zzu.zzaW().zze().zzb("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public final boolean zzA() {
        this.zzu.zzaV();
        java.lang.Boolean boolZzn = zzn("firebase_analytics_collection_deactivated");
        return boolZzn != null && boolZzn.booleanValue();
    }

    public final boolean zzB(java.lang.String str) {
        return "1".equals(this.zzc.zza(str, "measurement.event_sampling_enabled"));
    }

    final boolean zzC() {
        if (this.zza == null) {
            java.lang.Boolean boolZzn = zzn("app_measurement_lite");
            this.zza = boolZzn;
            if (boolZzn == null) {
                this.zza = false;
            }
        }
        return this.zza.booleanValue() || !this.zzu.zzN();
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzD() {
        if (this.zzd == null) {
            synchronized (this) {
                if (this.zzd == null) {
                    com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                    android.content.pm.ApplicationInfo applicationInfo = zzioVar.zzaT().getApplicationInfo();
                    java.lang.String myProcessName = com.google.android.gms.common.util.ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        java.lang.String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(myProcessName)) {
                            z = true;
                        }
                        this.zzd = java.lang.Boolean.valueOf(z);
                    }
                    if (this.zzd == null) {
                        this.zzd = java.lang.Boolean.TRUE;
                        zzioVar.zzaW().zze().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzd.booleanValue();
    }

    public final boolean zzE() {
        java.lang.Boolean boolZzn = zzn("google_analytics_sgtm_upload_enabled");
        if (boolZzn == null) {
            return false;
        }
        return boolZzn.booleanValue();
    }

    public final double zza(java.lang.String str, com.google.android.gms.measurement.internal.zzgg zzggVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return ((java.lang.Double) zzggVar.zza(null)).doubleValue();
        }
        java.lang.String strZza = this.zzc.zza(str, zzggVar.zzb());
        if (android.text.TextUtils.isEmpty(strZza)) {
            return ((java.lang.Double) zzggVar.zza(null)).doubleValue();
        }
        try {
            return ((java.lang.Double) zzggVar.zza(java.lang.Double.valueOf(java.lang.Double.parseDouble(strZza)))).doubleValue();
        } catch (java.lang.NumberFormatException unused) {
            return ((java.lang.Double) zzggVar.zza(null)).doubleValue();
        }
    }

    final int zzb(java.lang.String str) {
        return zzi(str, com.google.android.gms.measurement.internal.zzgi.zzV, 500, 2000);
    }

    final int zzc(java.lang.String str, boolean z) {
        if (z) {
            return zzi(str, com.google.android.gms.measurement.internal.zzgi.zzag, 100, 500);
        }
        return 500;
    }

    final int zzd(java.lang.String str, boolean z) {
        return java.lang.Math.max(zzc(str, z), 256);
    }

    public final int zze() {
        return this.zzu.zzw().zzao(201500000, true) ? 100 : 25;
    }

    public final int zzf(java.lang.String str) {
        return zzi(str, com.google.android.gms.measurement.internal.zzgi.zzW, 25, 100);
    }

    public final int zzh(java.lang.String str, com.google.android.gms.measurement.internal.zzgg zzggVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return ((java.lang.Integer) zzggVar.zza(null)).intValue();
        }
        java.lang.String strZza = this.zzc.zza(str, zzggVar.zzb());
        if (android.text.TextUtils.isEmpty(strZza)) {
            return ((java.lang.Integer) zzggVar.zza(null)).intValue();
        }
        try {
            return ((java.lang.Integer) zzggVar.zza(java.lang.Integer.valueOf(java.lang.Integer.parseInt(strZza)))).intValue();
        } catch (java.lang.NumberFormatException unused) {
            return ((java.lang.Integer) zzggVar.zza(null)).intValue();
        }
    }

    public final int zzi(java.lang.String str, com.google.android.gms.measurement.internal.zzgg zzggVar, int i, int i2) {
        return java.lang.Math.max(java.lang.Math.min(zzh(str, zzggVar), i2), i);
    }

    public final long zzj() {
        this.zzu.zzaV();
        return 119002L;
    }

    public final long zzk(java.lang.String str, com.google.android.gms.measurement.internal.zzgg zzggVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return ((java.lang.Long) zzggVar.zza(null)).longValue();
        }
        java.lang.String strZza = this.zzc.zza(str, zzggVar.zzb());
        if (android.text.TextUtils.isEmpty(strZza)) {
            return ((java.lang.Long) zzggVar.zza(null)).longValue();
        }
        try {
            return ((java.lang.Long) zzggVar.zza(java.lang.Long.valueOf(java.lang.Long.parseLong(strZza)))).longValue();
        } catch (java.lang.NumberFormatException unused) {
            return ((java.lang.Long) zzggVar.zza(null)).longValue();
        }
    }

    final android.os.Bundle zzl() {
        try {
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            if (zzioVar.zzaT().getPackageManager() == null) {
                zzioVar.zzaW().zze().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            android.content.pm.ApplicationInfo applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(zzioVar.zzaT()).getApplicationInfo(zzioVar.zzaT().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            zzioVar.zzaW().zze().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            this.zzu.zzaW().zze().zzb("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final com.google.android.gms.measurement.internal.zzju zzm(java.lang.String str, boolean z) {
        java.lang.Object obj;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        android.os.Bundle bundleZzl = zzl();
        if (bundleZzl == null) {
            zzioVar.zzaW().zze().zza("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleZzl.get(str);
        }
        if (obj == null) {
            return com.google.android.gms.measurement.internal.zzju.UNINITIALIZED;
        }
        if (java.lang.Boolean.TRUE.equals(obj)) {
            return com.google.android.gms.measurement.internal.zzju.GRANTED;
        }
        if (java.lang.Boolean.FALSE.equals(obj)) {
            return com.google.android.gms.measurement.internal.zzju.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return com.google.android.gms.measurement.internal.zzju.POLICY;
        }
        zzioVar.zzaW().zzk().zzb("Invalid manifest metadata for", str);
        return com.google.android.gms.measurement.internal.zzju.UNINITIALIZED;
    }

    final java.lang.Boolean zzn(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        android.os.Bundle bundleZzl = zzl();
        if (bundleZzl == null) {
            this.zzu.zzaW().zze().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleZzl.containsKey(str)) {
            return java.lang.Boolean.valueOf(bundleZzl.getBoolean(str));
        }
        return null;
    }

    public final java.lang.String zzo() {
        return zzK("debug.firebase.analytics.app", "");
    }

    public final java.lang.String zzp() {
        return zzK("debug.deferred.deeplink", "");
    }

    final java.lang.String zzq() {
        this.zzu.zzaV();
        return "FA";
    }

    public final java.lang.String zzr(java.lang.String str, com.google.android.gms.measurement.internal.zzgg zzggVar) {
        return android.text.TextUtils.isEmpty(str) ? (java.lang.String) zzggVar.zza(null) : (java.lang.String) zzggVar.zza(this.zzc.zza(str, zzggVar.zzb()));
    }

    public final java.lang.String zzs() {
        return this.zzb;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[Catch: NotFoundException -> 0x0048, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0048, blocks: (B:11:0x002e, B:14:0x0043), top: B:19:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final java.util.List zzt(java.lang.String str) {
        java.lang.Integer numValueOf;
        java.lang.String[] stringArray;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("analytics.safelisted_events");
        android.os.Bundle bundleZzl = zzl();
        if (bundleZzl != null) {
            if (bundleZzl.containsKey("analytics.safelisted_events")) {
                numValueOf = java.lang.Integer.valueOf(bundleZzl.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.zzu.zzaT().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return java.util.Arrays.asList(stringArray);
                } catch (android.content.res.Resources.NotFoundException e) {
                    this.zzu.zzaW().zze().zzb("Failed to load string array from metadata: resource not found", e);
                }
            }
            return null;
        }
        this.zzu.zzaW().zze().zza("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.zzu.zzaT().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return java.util.Arrays.asList(stringArray);
        }
        return null;
    }

    final void zzu(com.google.android.gms.measurement.internal.zzal zzalVar) {
        this.zzc = zzalVar;
    }

    public final void zzv(java.lang.String str) {
        this.zzb = str;
    }

    public final boolean zzw() {
        java.lang.Boolean boolZzn = zzn("google_analytics_adid_collection_enabled");
        return boolZzn == null || boolZzn.booleanValue();
    }

    public final boolean zzx(java.lang.String str, com.google.android.gms.measurement.internal.zzgg zzggVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return ((java.lang.Boolean) zzggVar.zza(null)).booleanValue();
        }
        java.lang.String strZza = this.zzc.zza(str, zzggVar.zzb());
        return android.text.TextUtils.isEmpty(strZza) ? ((java.lang.Boolean) zzggVar.zza(null)).booleanValue() : ((java.lang.Boolean) zzggVar.zza(java.lang.Boolean.valueOf("1".equals(strZza)))).booleanValue();
    }

    public final boolean zzy(java.lang.String str) {
        return "1".equals(this.zzc.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzz() {
        java.lang.Boolean boolZzn = zzn("google_analytics_automatic_screen_reporting_enabled");
        return boolZzn == null || boolZzn.booleanValue();
    }
}
