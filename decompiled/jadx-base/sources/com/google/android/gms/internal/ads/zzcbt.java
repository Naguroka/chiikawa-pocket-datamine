package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcbt {
    private static final boolean zza;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.internal.ads.zzbcx zze;
    private final com.google.android.gms.internal.ads.zzbda zzf;
    private final com.google.android.gms.ads.internal.util.zzbh zzg;
    private final long[] zzh;
    private final java.lang.String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private com.google.android.gms.internal.ads.zzcay zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zza = com.google.android.gms.ads.internal.client.zzbc.zze().nextInt(100) < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmA)).intValue();
    }

    public zzcbt(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, com.google.android.gms.internal.ads.zzbda zzbdaVar, com.google.android.gms.internal.ads.zzbcx zzbcxVar) {
        com.google.android.gms.ads.internal.util.zzbf zzbfVar = new com.google.android.gms.ads.internal.util.zzbf();
        zzbfVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbfVar.zza("1_5", 1.0d, 5.0d);
        zzbfVar.zza("5_10", 5.0d, 10.0d);
        zzbfVar.zza("10_20", 10.0d, 20.0d);
        zzbfVar.zza("20_30", 20.0d, 30.0d);
        zzbfVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = zzbfVar.zzb();
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zzc = str;
        this.zzf = zzbdaVar;
        this.zze = zzbcxVar;
        java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzN);
        if (str2 == null) {
            this.zzi = new java.lang.String[0];
            this.zzh = new long[0];
            return;
        }
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.zzi = new java.lang.String[length];
        this.zzh = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.zzh[i] = java.lang.Long.parseLong(strArrSplit[i]);
            } catch (java.lang.NumberFormatException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to parse frame hash target time number.", e);
                this.zzh[i] = -1;
            }
        }
    }

    public final void zza(com.google.android.gms.internal.ads.zzcay zzcayVar) {
        com.google.android.gms.internal.ads.zzbcs.zza(this.zzf, this.zze, "vpc2");
        this.zzj = true;
        this.zzf.zzd("vpn", zzcayVar.zzj());
        this.zzo = zzcayVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        com.google.android.gms.internal.ads.zzbcs.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        com.google.android.gms.internal.ads.zzbcs.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzd() {
        if (!zza || this.zzp) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzc);
        bundle.putString("player", this.zzo.zzj());
        for (com.google.android.gms.ads.internal.util.zzbe zzbeVar : this.zzg.zza()) {
            java.lang.String strValueOf = java.lang.String.valueOf(zzbeVar.zza);
            bundle.putString("fps_c_".concat(strValueOf), java.lang.Integer.toString(zzbeVar.zze));
            java.lang.String strValueOf2 = java.lang.String.valueOf(zzbeVar.zza);
            bundle.putString("fps_p_".concat(strValueOf2), java.lang.Double.toString(zzbeVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.zzh;
            if (i >= jArr.length) {
                com.google.android.gms.ads.internal.zzv.zzq().zzi(this.zzb, this.zzd.afmaVersion, "gmob-apps", bundle, true);
                this.zzp = true;
                return;
            }
            java.lang.String str = this.zzi[i];
            if (str != null) {
                java.lang.Long lValueOf = java.lang.Long.valueOf(jArr[i]);
                new java.lang.StringBuilder("fh_").append(lValueOf);
                bundle.putString("fh_".concat(lValueOf.toString()), str);
            }
            i++;
        }
    }

    public final void zze() {
        this.zzn = false;
    }

    public final void zzf(com.google.android.gms.internal.ads.zzcay zzcayVar) {
        if (this.zzl && !this.zzm) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzm) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            com.google.android.gms.internal.ads.zzbcs.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        long jNanoTime = com.google.android.gms.ads.internal.zzv.zzC().nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            this.zzg.zzb(java.util.concurrent.TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.zzr));
        }
        this.zzq = this.zzn;
        this.zzr = jNanoTime;
        long jLongValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzO)).longValue();
        long jZza = zzcayVar.zza();
        int i = 0;
        while (true) {
            java.lang.String[] strArr = this.zzi;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && jLongValue > java.lang.Math.abs(jZza - this.zzh[i])) {
                java.lang.String[] strArr2 = this.zzi;
                int i2 = 8;
                android.graphics.Bitmap bitmap = zzcayVar.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((android.graphics.Color.blue(pixel) + android.graphics.Color.red(pixel)) + android.graphics.Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i4++;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = java.lang.String.format("%016X", java.lang.Long.valueOf(j2));
                return;
            }
            i++;
        }
    }
}
