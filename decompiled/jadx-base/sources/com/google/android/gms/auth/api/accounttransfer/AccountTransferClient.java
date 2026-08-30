package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
public class AccountTransferClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.auth.api.accounttransfer.zzn> {
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzu> zzaj;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzu, com.google.android.gms.auth.api.accounttransfer.zzn> zzak;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.accounttransfer.zzn> zzal;

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class zzb<T> extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.auth.zzu, T> {
        private com.google.android.gms.tasks.TaskCompletionSource<T> zzaw;

        private zzb() {
        }

        protected abstract void zza(com.google.android.gms.internal.auth.zzz zzzVar) throws android.os.RemoteException;

        protected final void setResult(T t) {
            this.zzaw.setResult(t);
        }

        protected final void zza(com.google.android.gms.common.api.Status status) {
            com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zza(this.zzaw, status);
        }

        @Override // com.google.android.gms.common.api.internal.TaskApiCall
        protected /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
            this.zzaw = taskCompletionSource;
            zza((com.google.android.gms.internal.auth.zzz) ((com.google.android.gms.internal.auth.zzu) anyClient).getService());
        }

        /* synthetic */ zzb(com.google.android.gms.auth.api.accounttransfer.zzc zzcVar) {
            this();
        }
    }

    AccountTransferClient(android.content.Context context) {
        super(context, zzal, (com.google.android.gms.common.api.Api.ApiOptions) null, new com.google.android.gms.common.api.GoogleApi.Settings.Builder().setMapper(new com.google.android.gms.common.api.internal.ApiExceptionMapper()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class zzc extends com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb<java.lang.Void> {
        com.google.android.gms.internal.auth.zzy zzax;

        private zzc() {
            super(null);
            this.zzax = new com.google.android.gms.auth.api.accounttransfer.zzk(this);
        }

        /* synthetic */ zzc(com.google.android.gms.auth.api.accounttransfer.zzc zzcVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class zza<T> extends com.google.android.gms.internal.auth.zzs {
        private com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb<T> zzav;

        public zza(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb<T> zzbVar) {
            this.zzav = zzbVar;
        }

        @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
        public final void onFailure(com.google.android.gms.common.api.Status status) {
            this.zzav.zza(status);
        }
    }

    AccountTransferClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) zzal, (com.google.android.gms.common.api.Api.ApiOptions) null, new com.google.android.gms.common.api.GoogleApi.Settings.Builder().setMapper(new com.google.android.gms.common.api.internal.ApiExceptionMapper()).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> sendData(java.lang.String str, byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        return doWrite(new com.google.android.gms.auth.api.accounttransfer.zzd(this, new com.google.android.gms.internal.auth.zzaf(str, bArr)));
    }

    public com.google.android.gms.tasks.Task<byte[]> retrieveData(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return doRead(new com.google.android.gms.auth.api.accounttransfer.zze(this, new com.google.android.gms.internal.auth.zzad(str)));
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> getDeviceMetaData(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return doRead(new com.google.android.gms.auth.api.accounttransfer.zzg(this, new com.google.android.gms.internal.auth.zzv(str)));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> showUserChallenge(java.lang.String str, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        return doWrite(new com.google.android.gms.auth.api.accounttransfer.zzi(this, new com.google.android.gms.internal.auth.zzah(str, pendingIntent)));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> notifyCompletion(java.lang.String str, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return doWrite(new com.google.android.gms.auth.api.accounttransfer.zzj(this, new com.google.android.gms.internal.auth.zzab(str, i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.common.api.Status status) {
        taskCompletionSource.setException(new com.google.android.gms.auth.api.accounttransfer.AccountTransferException(status));
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzu> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzaj = clientKey;
        com.google.android.gms.auth.api.accounttransfer.zzc zzcVar = new com.google.android.gms.auth.api.accounttransfer.zzc();
        zzak = zzcVar;
        zzal = new com.google.android.gms.common.api.Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzcVar, clientKey);
    }
}
