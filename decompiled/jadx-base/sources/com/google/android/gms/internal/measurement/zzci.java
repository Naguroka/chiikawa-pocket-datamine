package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzci {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.measurement.zzch();

    public static android.content.SharedPreferences zza(android.content.Context context, java.lang.String str, int i, com.google.android.gms.internal.measurement.zzcc zzccVar) {
        com.google.android.gms.internal.measurement.zzbx.zza();
        com.google.android.gms.internal.measurement.zzcg zzcgVar = str.equals("") ? new com.google.android.gms.internal.measurement.zzcg() : null;
        if (zzcgVar != null) {
            return zzcgVar;
        }
        java.lang.ThreadLocal threadLocal = zza;
        com.google.common.base.Preconditions.checkArgument(((java.lang.Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(java.lang.Boolean.FALSE);
        try {
            return context.getSharedPreferences(str, 0);
        } finally {
            zza.set(java.lang.Boolean.TRUE);
        }
    }
}
