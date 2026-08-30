package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhez {
    public static java.lang.Object zza(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static java.lang.Object zzb(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void zzc(java.lang.Object obj, java.lang.Class cls) {
        if (obj == null) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
