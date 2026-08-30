package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdValue {
    private final int zza;
    private final java.lang.String zzb;
    private final long zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int i, java.lang.String str, long j) {
        this.zza = i;
        this.zzb = str;
        this.zzc = j;
    }

    public static com.google.android.gms.ads.AdValue zza(int i, java.lang.String str, long j) {
        return new com.google.android.gms.ads.AdValue(i, str, j);
    }

    public java.lang.String getCurrencyCode() {
        return this.zzb;
    }

    public int getPrecisionType() {
        return this.zza;
    }

    public long getValueMicros() {
        return this.zzc;
    }
}
