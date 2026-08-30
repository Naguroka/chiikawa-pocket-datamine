package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class GooglePlayServicesManifestException extends java.lang.IllegalStateException {
    private final int zza;

    public GooglePlayServicesManifestException(int i, java.lang.String str) {
        super(str);
        this.zza = i;
    }

    public int getActualVersion() {
        return this.zza;
    }

    public int getExpectedVersion() {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
