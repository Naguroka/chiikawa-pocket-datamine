package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzah {
    public static java.lang.String zza(int i) {
        if (i == 0) {
            return "DAILY";
        }
        if (i == 1) {
            return "WEEKLY";
        }
        if (i == 2) {
            return "ALL_TIME";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(29);
        sb.append("Unknown time span ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
