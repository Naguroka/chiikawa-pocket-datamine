package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfd implements com.google.android.gms.internal.play_billing.zzgj {
    private static final com.google.android.gms.internal.play_billing.zzfd zza = new com.google.android.gms.internal.play_billing.zzfd();

    private zzfd() {
    }

    public static com.google.android.gms.internal.play_billing.zzfd zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgj
    public final com.google.android.gms.internal.play_billing.zzgi zzb(java.lang.Class cls) {
        if (!com.google.android.gms.internal.play_billing.zzfi.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        try {
            return (com.google.android.gms.internal.play_billing.zzgi) com.google.android.gms.internal.play_billing.zzfi.zzn(cls.asSubclass(com.google.android.gms.internal.play_billing.zzfi.class)).zzb(3, null, null);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgj
    public final boolean zzc(java.lang.Class cls) {
        return com.google.android.gms.internal.play_billing.zzfi.class.isAssignableFrom(cls);
    }
}
