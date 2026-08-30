package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzia<T> extends com.google.android.gms.internal.nearby.zzhy<T> {
    private final T zza;

    zzia(T t) {
        this.zza = t;
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.nearby.zzia) {
            return this.zza.equals(((com.google.android.gms.internal.nearby.zzia) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zza);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.nearby.zzhy
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.nearby.zzhy
    public final T zzb() {
        return this.zza;
    }
}
