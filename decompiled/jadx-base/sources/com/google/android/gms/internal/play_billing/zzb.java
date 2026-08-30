package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
enum zzb {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    private static final com.google.android.gms.internal.play_billing.zzbw zzp;
    private final int zzr;

    static {
        com.google.android.gms.internal.play_billing.zzbv zzbvVar = new com.google.android.gms.internal.play_billing.zzbv();
        for (com.google.android.gms.internal.play_billing.zzb zzbVar : values()) {
            zzbvVar.zza(java.lang.Integer.valueOf(zzbVar.zzr), zzbVar);
        }
        zzp = zzbvVar.zzb();
    }

    zzb(int i) {
        this.zzr = i;
    }

    static com.google.android.gms.internal.play_billing.zzb zza(int i) {
        com.google.android.gms.internal.play_billing.zzbw zzbwVar = zzp;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        return !zzbwVar.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.zzb) zzbwVar.get(numValueOf);
    }
}
