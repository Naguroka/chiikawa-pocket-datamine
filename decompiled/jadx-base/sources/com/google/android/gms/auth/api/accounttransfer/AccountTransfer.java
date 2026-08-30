package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
public final class AccountTransfer {
    public static final java.lang.String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    public static final java.lang.String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    public static final java.lang.String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    public static final java.lang.String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzu> zzaj;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzu, com.google.android.gms.auth.api.accounttransfer.zzn> zzak;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.accounttransfer.zzn> zzal;

    @java.lang.Deprecated
    private static final com.google.android.gms.auth.api.accounttransfer.zzb zzam;
    private static final com.google.android.gms.auth.api.accounttransfer.zzq zzan;

    public static com.google.android.gms.auth.api.accounttransfer.AccountTransferClient getAccountTransferClient(android.app.Activity activity) {
        return new com.google.android.gms.auth.api.accounttransfer.AccountTransferClient(activity);
    }

    public static com.google.android.gms.auth.api.accounttransfer.AccountTransferClient getAccountTransferClient(android.content.Context context) {
        return new com.google.android.gms.auth.api.accounttransfer.AccountTransferClient(context);
    }

    private AccountTransfer() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.auth.api.accounttransfer.zzb, com.google.android.gms.internal.auth.zzt] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.auth.api.accounttransfer.zzq, com.google.android.gms.internal.auth.zzt] */
    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzu> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzaj = clientKey;
        com.google.android.gms.auth.api.accounttransfer.zza zzaVar = new com.google.android.gms.auth.api.accounttransfer.zza();
        zzak = zzaVar;
        zzal = new com.google.android.gms.common.api.Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzaVar, clientKey);
        zzam = new com.google.android.gms.internal.auth.zzt();
        zzan = new com.google.android.gms.internal.auth.zzt();
    }
}
