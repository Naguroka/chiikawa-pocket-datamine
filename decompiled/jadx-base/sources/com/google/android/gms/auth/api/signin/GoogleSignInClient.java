package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes4.dex */
public class GoogleSignInClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.auth.api.signin.GoogleSignInOptions> {
    private static final com.google.android.gms.auth.api.signin.GoogleSignInClient.zzc zzar = new com.google.android.gms.auth.api.signin.GoogleSignInClient.zzc(null);
    private static int zzas = com.google.android.gms.auth.api.signin.GoogleSignInClient.zzd.zzau;

    private static class zzc implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter<com.google.android.gms.auth.api.signin.GoogleSignInResult, com.google.android.gms.auth.api.signin.GoogleSignInAccount> {
        private zzc() {
        }

        @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
        public final /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInAccount convert(com.google.android.gms.common.api.Result result) {
            return ((com.google.android.gms.auth.api.signin.GoogleSignInResult) result).getSignInAccount();
        }

        /* synthetic */ zzc(com.google.android.gms.auth.api.signin.zzc zzcVar) {
            this();
        }
    }

    static final enum zzd {
        public static final int zzau = 1;
        public static final int zzav = 2;
        public static final int zzaw = 3;
        public static final int zzax = 4;
        private static final /* synthetic */ int[] zzay = {1, 2, 3, 4};

        public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FC5N68SJFD5I2UPRDECNM2TBKD0NM2S395TPMIPRED5N2UHRFDTJMOPAJD5JMSIBE8DM6IPBEEGI4IRBGDHIMQPBEEHGN8QBFDOTG____0() {
            return (int[]) zzay.clone();
        }
    }

    GoogleSignInClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        super(context, com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    GoogleSignInClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        super(activity, com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    private final synchronized int zze() {
        if (zzas == com.google.android.gms.auth.api.signin.GoogleSignInClient.zzd.zzau) {
            android.content.Context applicationContext = getApplicationContext();
            com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
            int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, 12451000);
            if (iIsGooglePlayServicesAvailable == 0) {
                zzas = com.google.android.gms.auth.api.signin.GoogleSignInClient.zzd.zzax;
            } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, iIsGooglePlayServicesAvailable, null) == null && com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(applicationContext, "com.google.android.gms.auth.api.fallback") != 0) {
                zzas = com.google.android.gms.auth.api.signin.GoogleSignInClient.zzd.zzaw;
            } else {
                zzas = com.google.android.gms.auth.api.signin.GoogleSignInClient.zzd.zzav;
            }
        }
        return zzas;
    }

    public android.content.Intent getSignInIntent() {
        android.content.Context applicationContext = getApplicationContext();
        int i = com.google.android.gms.auth.api.signin.zzc.zzat[zze() - 1];
        if (i == 1) {
            return com.google.android.gms.auth.api.signin.internal.zzh.zzd(applicationContext, getApiOptions());
        }
        if (i == 2) {
            return com.google.android.gms.auth.api.signin.internal.zzh.zzc(applicationContext, getApiOptions());
        }
        return com.google.android.gms.auth.api.signin.internal.zzh.zze(applicationContext, getApiOptions());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> silentSignIn() {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(com.google.android.gms.auth.api.signin.internal.zzh.zzc(asGoogleApiClient(), getApplicationContext(), getApiOptions(), zze() == com.google.android.gms.auth.api.signin.GoogleSignInClient.zzd.zzaw), zzar);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> signOut() {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.signin.internal.zzh.zzc(asGoogleApiClient(), getApplicationContext(), zze() == com.google.android.gms.auth.api.signin.GoogleSignInClient.zzd.zzaw));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> revokeAccess() {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.signin.internal.zzh.zzd(asGoogleApiClient(), getApplicationContext(), zze() == com.google.android.gms.auth.api.signin.GoogleSignInClient.zzd.zzaw));
    }
}
