package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzd zzb;
    private final long zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final android.content.pm.PackageInfo zze;

    zzb(android.content.Context context, long j, android.content.pm.PackageInfo packageInfo, com.google.android.gms.ads.nonagon.signalgeneration.zzd zzdVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzc = j;
        this.zze = packageInfo;
        this.zzb = zzdVar;
        this.zzd = scheduledExecutorService;
    }

    public static java.lang.String zzb(java.lang.String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i % 555));
        }
        return new java.lang.String(charArray);
    }

    private final boolean zze() {
        return this.zzb.zzf().size() >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhv)).intValue();
    }

    private static final void zzf(android.os.Bundle bundle, com.google.android.gms.internal.ads.zzdre zzdreVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhw)).booleanValue()) {
            bundle.putLong(zzdreVar.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
    }

    private static final void zzg(android.os.Bundle bundle, int i) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    public final com.google.android.gms.ads.nonagon.signalgeneration.zzbk zza(com.google.android.gms.internal.ads.zzbyy zzbyyVar, final com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar, android.os.Bundle bundle) {
        zzf(bundle, com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_VALIDATION_START);
        if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN()) {
            this.zzb.zzg();
            zzg(bundle, 7);
        } else {
            if (this.zze != null) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzd zzdVar = this.zzb;
                android.content.Context context = this.zza;
                java.lang.String strZze = zzdVar.zze();
                int iZzb = zzdVar.zzb();
                java.lang.String strZzd = zzdVar.zzd();
                int iZza = zzdVar.zza();
                if (android.text.TextUtils.equals(context.getApplicationInfo().packageName, strZze) && iZzb == this.zze.versionCode && android.text.TextUtils.equals(android.os.Build.MODEL, strZzd) && iZza == android.os.Build.VERSION.SDK_INT) {
                    for (java.util.Map.Entry entry : this.zzb.zzf().entrySet()) {
                        try {
                            long j = new org.json.JSONObject((java.lang.String) entry.getValue()).getLong("ts_ms");
                            if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - j <= ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhu)).longValue()) {
                                com.google.android.gms.internal.ads.zzfra zzfraVarZzh = com.google.android.gms.internal.ads.zzfre.zzj(this.zza).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdp)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                                com.google.android.gms.internal.ads.zzfra zzfraVarZzh2 = com.google.android.gms.internal.ads.zzfrf.zzi(this.zza).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdq)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                                if ((zzfraVarZzh.zza() == -1 || zzfraVarZzh.zza() <= j) && (zzfraVarZzh2.zza() == -1 || zzfraVarZzh2.zza() <= j)) {
                                }
                            }
                            this.zzb.zzc((java.lang.String) entry.getKey());
                        } catch (java.io.IOException | org.json.JSONException unused) {
                        }
                    }
                } else {
                    this.zzb.zzg();
                    this.zzb.zzi(this.zza.getApplicationInfo().packageName, this.zze.versionCode, android.os.Build.MODEL, android.os.Build.VERSION.SDK_INT);
                }
                zzf(bundle, com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_VALIDATION_END);
                if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zzc > ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhr)).longValue()) {
                    zzg(bundle, 2);
                    return null;
                }
                zzf(bundle, com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_CACHE_KEY_START);
                java.lang.String str = zzbyyVar.zza;
                java.lang.String str2 = zzbyyVar.zzb;
                java.lang.String string = zzbyyVar.zzd.zzn.toString();
                java.lang.String string2 = zzbyyVar.zzd.zzc.toString();
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzbyyVar.zzd;
                final java.lang.String strZzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str + str2 + string + string2 + zzmVar.zzi + zzmVar.zzp + java.lang.String.valueOf(zzmVar.zzo));
                if (android.text.TextUtils.isEmpty(strZzg)) {
                    zzg(bundle, 3);
                    return null;
                }
                zzf(bundle, com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_CACHE_KEY_END);
                zzf(bundle, com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
                java.lang.String strZzc = this.zzb.zzc(strZzg);
                zzf(bundle, com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
                if (!zze()) {
                    final com.google.android.gms.internal.ads.zzbyy zzbyyVar2 = new com.google.android.gms.internal.ads.zzbyy(zzbyyVar.zza, zzbyyVar.zzb, zzbyyVar.zzc, zzbyyVar.zzd, 2, strZzg);
                    this.zzd.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzc(strZzg, zzauVar, zzbyyVar2);
                        }
                    }, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzht)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
                }
                if (android.text.TextUtils.isEmpty(strZzc)) {
                    zzg(bundle, 4);
                    return null;
                }
                zzf(bundle, com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_DECODE_START);
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(strZzc);
                    java.lang.String string3 = jSONObject.getString("sr");
                    if (android.text.TextUtils.isEmpty(string3)) {
                        zzg(bundle, 8);
                        return null;
                    }
                    java.lang.String string4 = jSONObject.getString("rs");
                    if (android.text.TextUtils.isEmpty(string4)) {
                        zzg(bundle, 9);
                        return null;
                    }
                    java.lang.String strZzb = zzb(new java.lang.String(android.util.Base64.decode(string4, 10), java.nio.charset.StandardCharsets.UTF_8));
                    zzf(bundle, com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_DECODE_END);
                    try {
                        com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzbk(new android.util.JsonReader(new java.io.StringReader(string3)), null);
                        zzbkVar.zzc = strZzb;
                        zzbkVar.zze = bundle;
                        bundle.putBoolean("sod_h", true);
                        return zzbkVar;
                    } catch (java.io.IOException e) {
                        zzg(bundle, 6);
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "DiskCachingManager.getSignalResponse");
                        return null;
                    }
                } catch (org.json.JSONException e2) {
                    zzg(bundle, 5);
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "DiskCachingManager.getSignalResponse");
                    return null;
                }
            }
            this.zzb.zzg();
            zzg(bundle, 10);
        }
        return null;
    }

    final /* synthetic */ void zzc(java.lang.String str, com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar, com.google.android.gms.internal.ads.zzbyy zzbyyVar) {
        if (this.zzb.zzj(str) || zze()) {
            return;
        }
        zzauVar.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), zzbyyVar, null);
    }

    public final void zzd(java.lang.String str, com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        java.lang.String string;
        if (android.text.TextUtils.isEmpty(str) || zze()) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("params", zzbkVar.zza);
            jSONObject2.put("signal_dictionary", com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(zzbkVar.zzf));
            jSONObject.put("sr", jSONObject2);
            java.lang.String str2 = zzbkVar.zzc;
            if (android.text.TextUtils.isEmpty(str2)) {
                string = "";
            } else {
                jSONObject.put("rs", android.util.Base64.encodeToString(zzb(str2).getBytes(java.nio.charset.StandardCharsets.UTF_8), 10));
                jSONObject.put("ts_ms", com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
                string = jSONObject.toString();
            }
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "DiskCachingManager.createStringToWrite");
        }
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        this.zzb.zzh(str, string);
    }
}
