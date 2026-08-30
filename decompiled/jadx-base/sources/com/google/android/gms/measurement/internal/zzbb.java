package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbb extends com.google.android.gms.measurement.internal.zzjr {
    private long zza;
    private java.lang.String zzb;

    zzbb(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
    }

    public final long zza() {
        zzv();
        return this.zza;
    }

    public final java.lang.String zzb() {
        zzv();
        return this.zzb;
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final boolean zzc() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.zza = java.util.concurrent.TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), java.util.concurrent.TimeUnit.MILLISECONDS);
        java.util.Locale locale = java.util.Locale.getDefault();
        this.zzb = locale.getLanguage().toLowerCase(java.util.Locale.ENGLISH) + "-" + locale.getCountry().toLowerCase(java.util.Locale.ENGLISH);
        return false;
    }
}
