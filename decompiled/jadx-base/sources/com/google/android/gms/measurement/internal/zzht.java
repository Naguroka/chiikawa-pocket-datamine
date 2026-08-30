package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzht extends com.google.android.gms.measurement.internal.zzjr {
    static final android.util.Pair zza = new android.util.Pair("", 0L);
    private long zzA;
    public com.google.android.gms.measurement.internal.zzhq zzb;
    public final com.google.android.gms.measurement.internal.zzhp zzc;
    public final com.google.android.gms.measurement.internal.zzhp zzd;
    public final com.google.android.gms.measurement.internal.zzhr zze;
    public final com.google.android.gms.measurement.internal.zzhp zzf;
    public final com.google.android.gms.measurement.internal.zzhn zzg;
    public final com.google.android.gms.measurement.internal.zzhr zzh;
    public final com.google.android.gms.measurement.internal.zzho zzi;
    public final com.google.android.gms.measurement.internal.zzhn zzj;
    public final com.google.android.gms.measurement.internal.zzhp zzk;
    public final com.google.android.gms.measurement.internal.zzhp zzl;
    public boolean zzm;
    public final com.google.android.gms.measurement.internal.zzhn zzn;
    public final com.google.android.gms.measurement.internal.zzhn zzo;
    public final com.google.android.gms.measurement.internal.zzhp zzp;
    public final com.google.android.gms.measurement.internal.zzhr zzq;
    public final com.google.android.gms.measurement.internal.zzhr zzr;
    public final com.google.android.gms.measurement.internal.zzhp zzs;
    public final com.google.android.gms.measurement.internal.zzho zzt;
    private android.content.SharedPreferences zzv;
    private final java.lang.Object zzw;
    private android.content.SharedPreferences zzx;
    private java.lang.String zzy;
    private boolean zzz;

    zzht(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
        this.zzw = new java.lang.Object();
        this.zzf = new com.google.android.gms.measurement.internal.zzhp(this, "session_timeout", 1800000L);
        this.zzg = new com.google.android.gms.measurement.internal.zzhn(this, "start_new_session", true);
        this.zzk = new com.google.android.gms.measurement.internal.zzhp(this, "last_pause_time", 0L);
        this.zzl = new com.google.android.gms.measurement.internal.zzhp(this, "session_id", 0L);
        this.zzh = new com.google.android.gms.measurement.internal.zzhr(this, "non_personalized_ads", null);
        this.zzi = new com.google.android.gms.measurement.internal.zzho(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new com.google.android.gms.measurement.internal.zzhn(this, "allow_remote_dynamite", false);
        this.zzc = new com.google.android.gms.measurement.internal.zzhp(this, "first_open_time", 0L);
        this.zzd = new com.google.android.gms.measurement.internal.zzhp(this, "app_install_time", 0L);
        this.zze = new com.google.android.gms.measurement.internal.zzhr(this, "app_instance_id", null);
        this.zzn = new com.google.android.gms.measurement.internal.zzhn(this, "app_backgrounded", false);
        this.zzo = new com.google.android.gms.measurement.internal.zzhn(this, "deep_link_retrieval_complete", false);
        this.zzp = new com.google.android.gms.measurement.internal.zzhp(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new com.google.android.gms.measurement.internal.zzhr(this, "firebase_feature_rollouts", null);
        this.zzr = new com.google.android.gms.measurement.internal.zzhr(this, "deferred_attribution_cache", null);
        this.zzs = new com.google.android.gms.measurement.internal.zzhp(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new com.google.android.gms.measurement.internal.zzho(this, "default_event_parameters", null);
    }

    protected final android.content.SharedPreferences zza() {
        zzg();
        zzv();
        if (this.zzx == null) {
            synchronized (this.zzw) {
                if (this.zzx == null) {
                    com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                    java.lang.String str = zzioVar.zzaT().getPackageName() + "_preferences";
                    zzioVar.zzaW().zzj().zzb("Default prefs file", str);
                    this.zzx = zzioVar.zzaT().getSharedPreferences(str, 0);
                }
            }
        }
        return this.zzx;
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull.List({@org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.preferences"}), @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.monitoringSample"})})
    protected final void zzaZ() {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        android.content.SharedPreferences sharedPreferences = zzioVar.zzaT().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzm = z;
        if (!z) {
            android.content.SharedPreferences.Editor editorEdit = this.zzv.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        zzioVar.zzf();
        this.zzb = new com.google.android.gms.measurement.internal.zzhq(this, "health_monitor", java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzc.zza(null)).longValue()), null);
    }

    protected final android.content.SharedPreferences zzb() {
        zzg();
        zzv();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final boolean zzc() {
        return true;
    }

    final android.util.Pair zzd(java.lang.String str) {
        zzg();
        if (!zzh().zzr(com.google.android.gms.measurement.internal.zzjw.AD_STORAGE)) {
            return new android.util.Pair("", false);
        }
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        long jElapsedRealtime = zzioVar.zzaU().elapsedRealtime();
        java.lang.String str2 = this.zzy;
        if (str2 != null && jElapsedRealtime < this.zzA) {
            return new android.util.Pair(str2, java.lang.Boolean.valueOf(this.zzz));
        }
        this.zzA = jElapsedRealtime + zzioVar.zzf().zzk(str, com.google.android.gms.measurement.internal.zzgi.zza);
        com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(zzioVar.zzaT());
            this.zzy = "";
            java.lang.String id = advertisingIdInfo.getId();
            if (id != null) {
                this.zzy = id;
            }
            this.zzz = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (java.lang.Exception e) {
            this.zzu.zzaW().zzd().zzb("Unable to get advertising id", e);
            this.zzy = "";
        }
        com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new android.util.Pair(this.zzy, java.lang.Boolean.valueOf(this.zzz));
    }

    final android.util.SparseArray zze() {
        android.os.Bundle bundleZza = this.zzi.zza();
        int[] intArray = bundleZza.getIntArray("uriSources");
        long[] longArray = bundleZza.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new android.util.SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.zzu.zzaW().zze().zza("Trigger URI source and timestamp array lengths do not match");
            return new android.util.SparseArray();
        }
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], java.lang.Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    final com.google.android.gms.measurement.internal.zzba zzf() {
        zzg();
        return com.google.android.gms.measurement.internal.zzba.zze(zzb().getString("dma_consent_settings", null));
    }

    final com.google.android.gms.measurement.internal.zzjx zzh() {
        zzg();
        return com.google.android.gms.measurement.internal.zzjx.zzk(zzb().getString("consent_settings", "G1"), zzb().getInt("consent_source", 100));
    }

    final java.lang.Boolean zzi() {
        zzg();
        if (zzb().contains("measurement_enabled")) {
            return java.lang.Boolean.valueOf(zzb().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final java.lang.String zzj() {
        zzg();
        return zzb().getString("gmp_app_id", null);
    }

    final void zzl(java.lang.String str) {
        zzg();
        android.content.SharedPreferences.Editor editorEdit = zzb().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    final void zzm(java.lang.Boolean bool) {
        zzg();
        android.content.SharedPreferences.Editor editorEdit = zzb().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final void zzn(boolean z) {
        zzg();
        this.zzu.zzaW().zzj().zzb("App measurement setting deferred collection", java.lang.Boolean.valueOf(z));
        android.content.SharedPreferences.Editor editorEdit = zzb().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    final boolean zzo() {
        android.content.SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final boolean zzp(long j) {
        return j - this.zzf.zza() > this.zzk.zza();
    }

    final boolean zzq(int i) {
        return com.google.android.gms.measurement.internal.zzjx.zzs(i, zzb().getInt("consent_source", 100));
    }

    protected final boolean zzr(com.google.android.gms.measurement.internal.zzoq zzoqVar) {
        zzg();
        java.lang.String string = zzb().getString("stored_tcf_param", "");
        java.lang.String strZze = zzoqVar.zze();
        if (strZze.equals(string)) {
            return false;
        }
        android.content.SharedPreferences.Editor editorEdit = zzb().edit();
        editorEdit.putString("stored_tcf_param", strZze);
        editorEdit.apply();
        return true;
    }
}
