package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzg extends java.lang.Exception {
    private final int zza;

    public zzg(int i, java.lang.String str) {
        super(str);
        this.zza = i;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return super.getMessage();
    }

    public final com.google.android.ump.FormError zza() {
        if (getCause() == null) {
            android.util.Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            android.util.Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new com.google.android.ump.FormError(this.zza, super.getMessage());
    }

    public zzg(int i, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.zza = i;
    }
}
