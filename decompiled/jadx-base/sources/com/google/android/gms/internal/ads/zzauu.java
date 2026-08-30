package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzauu {
    protected volatile java.lang.Boolean zzb;
    private final com.google.android.gms.internal.ads.zzawd zze;
    private static final android.os.ConditionVariable zzc = new android.os.ConditionVariable();
    protected static volatile com.google.android.gms.internal.ads.zzfpk zza = null;
    private static volatile java.util.Random zzd = null;

    public zzauu(com.google.android.gms.internal.ads.zzawd zzawdVar) {
        this.zze = zzawdVar;
        zzawdVar.zzk().execute(new com.google.android.gms.internal.ads.zzaut(this));
    }

    public static final int zzd() {
        try {
            return java.util.concurrent.ThreadLocalRandom.current().nextInt();
        } catch (java.lang.RuntimeException unused) {
            if (zzd == null) {
                synchronized (com.google.android.gms.internal.ads.zzauu.class) {
                    if (zzd == null) {
                        zzd = new java.util.Random();
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i, int i2, long j, java.lang.String str, java.lang.Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            com.google.android.gms.internal.ads.zzari zzariVarZza = com.google.android.gms.internal.ads.zzarm.zza();
            zzariVarZza.zza(this.zze.zza.getPackageName());
            zzariVarZza.zze(j);
            if (str != null) {
                zzariVarZza.zzb(str);
            }
            if (exc != null) {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                exc.printStackTrace(new java.io.PrintWriter(stringWriter));
                zzariVarZza.zzf(stringWriter.toString());
                zzariVarZza.zzd(exc.getClass().getName());
            }
            com.google.android.gms.internal.ads.zzfpi zzfpiVarZza = zza.zza(((com.google.android.gms.internal.ads.zzarm) zzariVarZza.zzbr()).zzaV());
            zzfpiVarZza.zza(i);
            if (i2 != -1) {
                zzfpiVarZza.zzb(i2);
            }
            zzfpiVarZza.zzc();
        } catch (java.lang.Exception unused) {
        }
    }
}
