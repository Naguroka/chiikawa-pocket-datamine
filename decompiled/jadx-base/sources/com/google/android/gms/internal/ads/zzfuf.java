package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfuf {
    static final java.lang.CharSequence zza(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof java.lang.CharSequence ? (java.lang.CharSequence) obj : obj.toString();
    }

    public static final java.lang.StringBuilder zzb(java.lang.StringBuilder sb, java.lang.Iterable iterable, java.lang.String str) {
        zzc(sb, iterable.iterator(), str);
        return sb;
    }

    public static final java.lang.StringBuilder zzc(java.lang.StringBuilder sb, java.util.Iterator it, java.lang.String str) {
        try {
            if (it.hasNext()) {
                sb.append(zza(it.next()));
                while (it.hasNext()) {
                    sb.append((java.lang.CharSequence) str);
                    sb.append(zza(it.next()));
                }
            }
            return sb;
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
