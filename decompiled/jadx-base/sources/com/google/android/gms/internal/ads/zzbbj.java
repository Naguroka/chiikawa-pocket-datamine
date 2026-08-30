package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbbj {
    private final com.google.android.gms.internal.ads.zzbbp zza;
    private final com.google.android.gms.internal.ads.zzbbq.zzt.zza zzb;
    private final boolean zzc;

    private zzbbj() {
        this.zzb = com.google.android.gms.internal.ads.zzbbq.zzt.zzj();
        this.zzc = false;
        this.zza = new com.google.android.gms.internal.ads.zzbbp();
    }

    public static com.google.android.gms.internal.ads.zzbbj zza() {
        return new com.google.android.gms.internal.ads.zzbbj();
    }

    private final synchronized java.lang.String zzd(int i) {
        return java.lang.String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzah(), java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime()), java.lang.Integer.valueOf(i - 1), android.util.Base64.encodeToString(this.zzb.zzbr().zzaV(), 3));
    }

    private final synchronized void zze(int i) {
        java.io.File externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(com.google.android.gms.internal.ads.zzfpv.zza(com.google.android.gms.internal.ads.zzfpu.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                fileOutputStream.write(zzd(i).getBytes());
            } catch (java.io.IOException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (java.io.IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (java.io.FileNotFoundException unused3) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i) {
        com.google.android.gms.internal.ads.zzbbq.zzt.zza zzaVar = this.zzb;
        zzaVar.zzq();
        zzaVar.zzj(com.google.android.gms.ads.internal.util.zzs.zzd());
        com.google.android.gms.internal.ads.zzbbn zzbbnVar = new com.google.android.gms.internal.ads.zzbbn(this.zza, this.zzb.zzbr().zzaV(), null);
        int i2 = i - 1;
        zzbbnVar.zza(i2);
        zzbbnVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(java.lang.String.valueOf(java.lang.Integer.toString(i2, 10))));
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzbbi zzbbiVar) {
        if (this.zzc) {
            try {
                zzbbiVar.zza(this.zzb);
            } catch (java.lang.NullPointerException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeX)).booleanValue()) {
                zze(i);
            } else {
                zzf(i);
            }
        }
    }

    public zzbbj(com.google.android.gms.internal.ads.zzbbp zzbbpVar) {
        this.zzb = com.google.android.gms.internal.ads.zzbbq.zzt.zzj();
        this.zza = zzbbpVar;
        this.zzc = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeW)).booleanValue();
    }
}
