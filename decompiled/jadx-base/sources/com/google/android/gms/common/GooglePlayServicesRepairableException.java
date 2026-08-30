package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class GooglePlayServicesRepairableException extends com.google.android.gms.common.UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i, java.lang.String str, android.content.Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
