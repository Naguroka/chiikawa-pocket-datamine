package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface Distance extends java.lang.Comparable<com.google.android.gms.nearby.messages.Distance> {
    public static final com.google.android.gms.nearby.messages.Distance UNKNOWN = new com.google.android.gms.nearby.messages.internal.zze(1, Double.NaN);

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Accuracy {
        public static final int LOW = 1;
    }

    int compareTo(com.google.android.gms.nearby.messages.Distance distance);

    int getAccuracy();

    double getMeters();
}
