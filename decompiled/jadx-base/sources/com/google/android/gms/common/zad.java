package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zad extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zaa;
    private final android.content.Context zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zad(com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, android.content.Context context) {
        super(android.os.Looper.myLooper() == null ? android.os.Looper.getMainLooper() : android.os.Looper.myLooper());
        this.zaa = googleApiAvailability;
        this.zab = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (message.what != 1) {
            android.util.Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
            return;
        }
        com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = this.zaa;
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(this.zab);
        if (googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            this.zaa.showErrorNotification(this.zab, iIsGooglePlayServicesAvailable);
        }
    }
}
