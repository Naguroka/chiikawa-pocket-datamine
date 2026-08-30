package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdf extends com.google.android.gms.internal.consent_sdk.zzdb {
    final transient java.lang.Object zza;

    zzdf(java.lang.Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, com.google.android.gms.internal.consent_sdk.zzcx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.consent_sdk.zzdc(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return com.ironsource.y8.i.d + this.zza.toString() + com.ironsource.y8.i.e;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    final int zza(java.lang.Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, com.google.android.gms.internal.consent_sdk.zzcx
    /* JADX INFO: renamed from: zzd */
    public final com.google.android.gms.internal.consent_sdk.zzdg iterator() {
        return new com.google.android.gms.internal.consent_sdk.zzdc(this.zza);
    }
}
