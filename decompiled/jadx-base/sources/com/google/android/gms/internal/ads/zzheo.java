package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzheo {
    static java.util.HashSet zza(int i) {
        return new java.util.HashSet(zzd(i));
    }

    public static java.util.LinkedHashMap zzb(int i) {
        return new java.util.LinkedHashMap(zzd(i));
    }

    public static java.util.List zzc(int i) {
        return i == 0 ? java.util.Collections.emptyList() : new java.util.ArrayList(i);
    }

    private static int zzd(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
