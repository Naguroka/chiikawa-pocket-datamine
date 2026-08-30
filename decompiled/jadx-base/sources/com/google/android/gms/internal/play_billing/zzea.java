package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzea extends com.google.android.gms.internal.play_billing.zzeb {
    final /* synthetic */ com.google.android.gms.internal.play_billing.zzei zza;
    private int zzb;
    private final int zzc;

    zzea(com.google.android.gms.internal.play_billing.zzei zzeiVar) {
        java.util.Objects.requireNonNull(zzeiVar);
        this.zza = zzeiVar;
        this.zzb = 0;
        this.zzc = zzeiVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
