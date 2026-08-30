package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhg extends java.lang.RuntimeException {
    public zzhg(com.google.android.gms.internal.play_billing.zzgl zzglVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final com.google.android.gms.internal.play_billing.zzfq zza() {
        return new com.google.android.gms.internal.play_billing.zzfq(getMessage());
    }
}
