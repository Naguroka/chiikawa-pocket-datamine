package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzil implements com.google.android.gms.internal.play_billing.zzfk {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);

    private final int zzf;

    zzil(int i) {
        this.zzf = i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfk
    public final int zza() {
        return this.zzf;
    }
}
