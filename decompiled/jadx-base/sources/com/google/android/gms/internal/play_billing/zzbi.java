package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbi {
    private final com.google.android.gms.internal.play_billing.zzbl zza;
    private boolean zzb;
    private long zzc;
    private long zzd;

    zzbi() {
        this.zza = com.google.android.gms.internal.play_billing.zzbl.zzb();
    }

    public static com.google.android.gms.internal.play_billing.zzbi zzb(com.google.android.gms.internal.play_billing.zzbl zzblVar) {
        com.google.android.gms.internal.play_billing.zzbi zzbiVar = new com.google.android.gms.internal.play_billing.zzbi(zzblVar);
        zzbiVar.zze();
        return zzbiVar;
    }

    public static com.google.android.gms.internal.play_billing.zzbi zzc(com.google.android.gms.internal.play_billing.zzbl zzblVar) {
        return new com.google.android.gms.internal.play_billing.zzbi(zzblVar);
    }

    private final long zzh() {
        return this.zzb ? (this.zza.zza() - this.zzd) + this.zzc : this.zzc;
    }

    public final java.lang.String toString() {
        java.util.concurrent.TimeUnit timeUnit;
        java.lang.String str;
        long jZzh = zzh();
        if (java.util.concurrent.TimeUnit.DAYS.convert(jZzh, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            timeUnit = java.util.concurrent.TimeUnit.DAYS;
        } else if (java.util.concurrent.TimeUnit.HOURS.convert(jZzh, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            timeUnit = java.util.concurrent.TimeUnit.HOURS;
        } else if (java.util.concurrent.TimeUnit.MINUTES.convert(jZzh, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        } else if (java.util.concurrent.TimeUnit.SECONDS.convert(jZzh, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        } else if (java.util.concurrent.TimeUnit.MILLISECONDS.convert(jZzh, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        } else {
            timeUnit = java.util.concurrent.TimeUnit.MICROSECONDS.convert(jZzh, java.util.concurrent.TimeUnit.NANOSECONDS) > 0 ? java.util.concurrent.TimeUnit.MICROSECONDS : java.util.concurrent.TimeUnit.NANOSECONDS;
        }
        java.lang.String str2 = java.lang.String.format(java.util.Locale.ROOT, "%.4g", java.lang.Double.valueOf(jZzh / java.util.concurrent.TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (com.google.android.gms.internal.play_billing.zzbh.zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS;
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS;
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new java.lang.AssertionError();
        }
        return str2 + " " + str;
    }

    public final long zza(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(zzh(), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final com.google.android.gms.internal.play_billing.zzbi zzd() {
        this.zzc = 0L;
        this.zzb = false;
        return this;
    }

    public final com.google.android.gms.internal.play_billing.zzbi zze() {
        com.google.android.gms.internal.play_billing.zzbg.zze(!this.zzb, "This stopwatch is already running.");
        this.zzb = true;
        this.zzd = this.zza.zza();
        return this;
    }

    public final com.google.android.gms.internal.play_billing.zzbi zzf() {
        long jZza = this.zza.zza();
        com.google.android.gms.internal.play_billing.zzbg.zze(this.zzb, "This stopwatch is already stopped.");
        this.zzb = false;
        this.zzc += jZza - this.zzd;
        return this;
    }

    public final boolean zzg() {
        return this.zzb;
    }

    zzbi(com.google.android.gms.internal.play_billing.zzbl zzblVar) {
        com.google.android.gms.internal.play_billing.zzbg.zzc(zzblVar, "ticker");
        this.zza = zzblVar;
    }
}
