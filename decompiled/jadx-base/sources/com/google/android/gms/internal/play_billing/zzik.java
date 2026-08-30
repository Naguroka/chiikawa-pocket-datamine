package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzik implements com.google.android.gms.internal.play_billing.zzfl {
    static final com.google.android.gms.internal.play_billing.zzfl zza = new com.google.android.gms.internal.play_billing.zzik();

    private zzik() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfl
    public final boolean zza(int i) {
        com.google.android.gms.internal.play_billing.zzil zzilVar;
        if (i == 0) {
            zzilVar = com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i == 1) {
            zzilVar = com.google.android.gms.internal.play_billing.zzil.PURCHASES_UPDATED_ACTION;
        } else if (i != 2) {
            zzilVar = i != 3 ? null : com.google.android.gms.internal.play_billing.zzil.ALTERNATIVE_BILLING_ACTION;
        } else {
            zzilVar = com.google.android.gms.internal.play_billing.zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        return zzilVar != null;
    }
}
