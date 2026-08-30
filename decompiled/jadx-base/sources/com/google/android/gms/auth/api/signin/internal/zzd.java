package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzd implements java.lang.Runnable {
    private static final com.google.android.gms.common.logging.Logger zzbd = new com.google.android.gms.common.logging.Logger("RevokeAccessOperation", new java.lang.String[0]);
    private final java.lang.String zzbe;
    private final com.google.android.gms.common.api.internal.StatusPendingResult zzbf;

    private zzd(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzbe = str;
        this.zzbf = new com.google.android.gms.common.api.internal.StatusPendingResult((com.google.android.gms.common.api.GoogleApiClient) null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.Status status = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR;
        try {
            java.lang.String strValueOf = java.lang.String.valueOf(this.zzbe);
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(strValueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(strValueOf) : new java.lang.String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", androidx.browser.trusted.sharing.ShareTarget.ENCODING_TYPE_URL_ENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
            } else {
                zzbd.e("Unable to revoke access!", new java.lang.Object[0]);
            }
            zzbd.d(new java.lang.StringBuilder(26).append("Response Code: ").append(responseCode).toString(), new java.lang.Object[0]);
        } catch (java.io.IOException e) {
            com.google.android.gms.common.logging.Logger logger = zzbd;
            java.lang.String strValueOf2 = java.lang.String.valueOf(e.toString());
            logger.e(strValueOf2.length() != 0 ? "IOException when revoking access: ".concat(strValueOf2) : new java.lang.String("IOException when revoking access: "), new java.lang.Object[0]);
        } catch (java.lang.Exception e2) {
            com.google.android.gms.common.logging.Logger logger2 = zzbd;
            java.lang.String strValueOf3 = java.lang.String.valueOf(e2.toString());
            logger2.e(strValueOf3.length() != 0 ? "Exception when revoking access: ".concat(strValueOf3) : new java.lang.String("Exception when revoking access: "), new java.lang.Object[0]);
        }
        this.zzbf.setResult(status);
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zzc(java.lang.String str) {
        if (str == null) {
            return com.google.android.gms.common.api.PendingResults.immediateFailedResult(new com.google.android.gms.common.api.Status(4), null);
        }
        com.google.android.gms.auth.api.signin.internal.zzd zzdVar = new com.google.android.gms.auth.api.signin.internal.zzd(str);
        new java.lang.Thread(zzdVar).start();
        return zzdVar.zzbf;
    }
}
