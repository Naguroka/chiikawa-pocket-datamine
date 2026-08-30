package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzp {
    public static boolean zza(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (java.lang.String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                java.lang.Object obj = bundle.get(str);
                java.lang.Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof android.os.Bundle) {
                    if (!(obj2 instanceof android.os.Bundle) || !zza((android.os.Bundle) obj, (android.os.Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = java.lang.reflect.Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != java.lang.reflect.Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i = 0; i < length; i++) {
                        if (!com.google.android.gms.common.internal.Objects.equal(java.lang.reflect.Array.get(obj, i), java.lang.reflect.Array.get(obj2, i))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }
}
