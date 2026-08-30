package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbr extends com.google.android.gms.internal.play_billing.zzbn {
    private final com.google.android.gms.internal.play_billing.zzbt zza;

    zzbr(com.google.android.gms.internal.play_billing.zzbt zzbtVar, int i) {
        super(zzbtVar.size(), i);
        this.zza = zzbtVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
