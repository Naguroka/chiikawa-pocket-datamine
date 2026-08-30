package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class Objects {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public static final class ToStringHelper {
        private final java.util.List zza;
        private final java.lang.Object zzb;

        /* synthetic */ ToStringHelper(java.lang.Object obj, com.google.android.gms.common.internal.zzah zzahVar) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
            this.zzb = obj;
            this.zza = new java.util.ArrayList();
        }

        public com.google.android.gms.common.internal.Objects.ToStringHelper add(java.lang.String str, java.lang.Object obj) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            this.zza.add(str + com.ironsource.y8.i.b + java.lang.String.valueOf(obj));
            return this;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
            sb.append(this.zzb.getClass().getSimpleName());
            sb.append('{');
            int size = this.zza.size();
            for (int i = 0; i < size; i++) {
                sb.append((java.lang.String) this.zza.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    public static boolean checkBundlesEquality(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        java.util.Set<java.lang.String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (java.lang.String str : setKeySet) {
            if (!equal(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equal(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hashCode(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    public static com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelper(java.lang.Object obj) {
        return new com.google.android.gms.common.internal.Objects.ToStringHelper(obj, null);
    }
}
