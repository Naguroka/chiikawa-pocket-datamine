package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjt {
    public static java.lang.Object zza(android.os.Bundle bundle, java.lang.String str, java.lang.Class cls, java.lang.Object obj) {
        java.lang.Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
    }

    public static void zzb(android.os.Bundle bundle, java.lang.Object obj) {
        if (obj instanceof java.lang.Double) {
            bundle.putDouble("value", ((java.lang.Double) obj).doubleValue());
        } else if (obj instanceof java.lang.Long) {
            bundle.putLong("value", ((java.lang.Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
