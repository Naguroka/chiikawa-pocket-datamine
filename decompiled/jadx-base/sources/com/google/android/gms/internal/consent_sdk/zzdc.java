package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdc extends com.google.android.gms.internal.consent_sdk.zzdg {
    private final java.lang.Object zza;
    private boolean zzb;

    zzdc(java.lang.Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.zzb) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
