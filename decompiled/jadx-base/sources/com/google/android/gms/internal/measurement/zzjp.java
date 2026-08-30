package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzjp {
    public static java.lang.Object zza(com.google.android.gms.internal.measurement.zzjq zzjqVar) {
        try {
            return zzjqVar.zza();
        } catch (java.lang.SecurityException unused) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return zzjqVar.zza();
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
