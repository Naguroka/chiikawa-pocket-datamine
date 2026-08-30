package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhx<T> extends com.google.android.gms.internal.nearby.zzhy<T> {
    static final com.google.android.gms.internal.nearby.zzhx<java.lang.Object> zza = new com.google.android.gms.internal.nearby.zzhx<>();

    private zzhx() {
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final java.lang.String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.nearby.zzhy
    public final boolean zza() {
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zzhy
    public final T zzb() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
