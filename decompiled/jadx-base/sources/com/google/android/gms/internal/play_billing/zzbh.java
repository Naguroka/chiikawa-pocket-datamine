package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzbh {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[java.util.concurrent.TimeUnit.values().length];
        zza = iArr;
        try {
            iArr[java.util.concurrent.TimeUnit.NANOSECONDS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            zza[java.util.concurrent.TimeUnit.MICROSECONDS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            zza[java.util.concurrent.TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            zza[java.util.concurrent.TimeUnit.SECONDS.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            zza[java.util.concurrent.TimeUnit.MINUTES.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            zza[java.util.concurrent.TimeUnit.HOURS.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            zza[java.util.concurrent.TimeUnit.DAYS.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
    }
}
