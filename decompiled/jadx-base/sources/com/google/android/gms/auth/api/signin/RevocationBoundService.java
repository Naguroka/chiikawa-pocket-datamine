package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes4.dex */
public final class RevocationBoundService extends android.app.Service {
    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            java.lang.String strValueOf = java.lang.String.valueOf(intent.getAction());
            android.util.Log.w("RevocationService", strValueOf.length() != 0 ? "Unknown action sent to RevocationBoundService: ".concat(strValueOf) : new java.lang.String("Unknown action sent to RevocationBoundService: "));
            return null;
        }
        if (android.util.Log.isLoggable("RevocationService", 2)) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(intent.getAction());
            android.util.Log.v("RevocationService", strValueOf2.length() != 0 ? "RevocationBoundService handling ".concat(strValueOf2) : new java.lang.String("RevocationBoundService handling "));
        }
        return new com.google.android.gms.auth.api.signin.internal.zzw(this);
    }
}
