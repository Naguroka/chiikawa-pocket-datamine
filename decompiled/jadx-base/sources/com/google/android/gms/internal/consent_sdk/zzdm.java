package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdm {
    public static java.lang.Object zza(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void zzb(java.lang.Object obj, java.lang.Class cls) {
        if (obj == null) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
