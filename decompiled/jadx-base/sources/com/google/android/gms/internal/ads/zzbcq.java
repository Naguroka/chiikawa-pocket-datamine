package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
@java.lang.Deprecated
public final class zzbcq {
    java.lang.String zzd;
    android.content.Context zze;
    java.lang.String zzf;
    private java.util.concurrent.atomic.AtomicBoolean zzh;
    private java.io.File zzi;
    final java.util.concurrent.BlockingQueue zza = new java.util.concurrent.ArrayBlockingQueue(100);
    final java.util.LinkedHashMap zzb = new java.util.LinkedHashMap();
    final java.util.Map zzc = new java.util.HashMap();
    private final java.util.HashSet zzg = new java.util.HashSet(java.util.Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzbcq zzbcqVar) throws java.lang.Throwable {
        while (true) {
            try {
                com.google.android.gms.internal.ads.zzbda zzbdaVar = (com.google.android.gms.internal.ads.zzbda) zzbcqVar.zza.take();
                com.google.android.gms.internal.ads.zzbcz zzbczVarZza = zzbdaVar.zza();
                if (!android.text.TextUtils.isEmpty(zzbczVarZza.zzb())) {
                    zzbcqVar.zzg(zzbcqVar.zzb(zzbcqVar.zzb, zzbdaVar.zzb()), zzbczVarZza);
                }
            } catch (java.lang.InterruptedException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private final void zzg(java.util.Map map, com.google.android.gms.internal.ads.zzbcz zzbczVar) throws java.lang.Throwable {
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(this.zzd).buildUpon();
        for (java.util.Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.lang.String string = builderBuildUpon.build().toString();
        if (zzbczVar != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(string);
            if (!android.text.TextUtils.isEmpty(zzbczVar.zzb())) {
                sb.append("&it=");
                sb.append(zzbczVar.zzb());
            }
            if (!android.text.TextUtils.isEmpty(zzbczVar.zza())) {
                sb.append("&blat=");
                sb.append(zzbczVar.zza());
            }
            string = sb.toString();
        }
        if (!this.zzh.get()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzM(this.zze, this.zzf, string);
            return;
        }
        java.io.File file = this.zzi;
        if (file == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        java.io.FileOutputStream fileOutputStream = null;
        try {
            try {
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (java.io.IOException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e3) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e4) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException e5) {
                e = e5;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public final com.google.android.gms.internal.ads.zzbcw zza(java.lang.String str) {
        com.google.android.gms.internal.ads.zzbcw zzbcwVar = (com.google.android.gms.internal.ads.zzbcw) this.zzc.get(str);
        return zzbcwVar != null ? zzbcwVar : com.google.android.gms.internal.ads.zzbcw.zza;
    }

    final java.util.Map zzb(java.util.Map map, java.util.Map map2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        for (java.util.Map.Entry entry : map2.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            linkedHashMap.put(str, zza(str).zza((java.lang.String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void zzd(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.io.File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeg.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = android.os.Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new java.io.File(com.google.android.gms.internal.ads.zzfpv.zza(com.google.android.gms.internal.ads.zzfpu.zza(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            this.zzb.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbcp
            @Override // java.lang.Runnable
            public final void run() throws java.lang.Throwable {
                com.google.android.gms.internal.ads.zzbcq.zzc(this.zza);
            }
        });
        this.zzc.put("action", com.google.android.gms.internal.ads.zzbcw.zzb);
        this.zzc.put(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.internal.ads.zzbcw.zzb);
        this.zzc.put("e", com.google.android.gms.internal.ads.zzbcw.zzc);
    }

    public final void zze(java.lang.String str) throws java.lang.Throwable {
        if (this.zzg.contains(str)) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(com.google.android.gms.internal.ads.zzbda zzbdaVar) {
        return this.zza.offer(zzbdaVar);
    }
}
