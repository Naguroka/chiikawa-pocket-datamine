package com.google.android.gms.internal.ads_identifier;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzc {
    private static final java.lang.ClassLoader zza = com.google.android.gms.internal.ads_identifier.zzc.class.getClassLoader();

    private zzc() {
    }

    public static void zza(android.os.Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean zzb(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
