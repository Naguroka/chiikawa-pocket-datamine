package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbq<E> extends com.google.android.gms.internal.location.zzbo<E> {
    private final com.google.android.gms.internal.location.zzbs<E> zza;

    zzbq(com.google.android.gms.internal.location.zzbs<E> zzbsVar, int i) {
        super(zzbsVar.size(), i);
        this.zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.location.zzbo
    protected final E zza(int i) {
        return this.zza.get(i);
    }
}
