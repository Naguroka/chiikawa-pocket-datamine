package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class BaseImplementation {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public interface ResultHolder<R> {
        void setFailedResult(com.google.android.gms.common.api.Status status);

        void setResult(R r);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public static abstract class ApiMethodImpl<R extends com.google.android.gms.common.api.Result, A extends com.google.android.gms.common.api.Api.AnyClient> extends com.google.android.gms.common.api.internal.BasePendingResult<R> implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<R> {
        private final com.google.android.gms.common.api.Api<?> api;
        private final com.google.android.gms.common.api.Api.AnyClientKey<A> clientKey;

        @java.lang.Deprecated
        protected ApiMethodImpl(com.google.android.gms.common.api.Api.AnyClientKey<A> anyClientKey, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
            super((com.google.android.gms.common.api.GoogleApiClient) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            this.clientKey = (com.google.android.gms.common.api.Api.AnyClientKey) com.google.android.gms.common.internal.Preconditions.checkNotNull(anyClientKey);
            this.api = null;
        }

        private void setFailedResult(android.os.RemoteException remoteException) {
            setFailedResult(new com.google.android.gms.common.api.Status(8, remoteException.getLocalizedMessage(), (android.app.PendingIntent) null));
        }

        protected abstract void doExecute(A a2) throws android.os.RemoteException;

        public final com.google.android.gms.common.api.Api<?> getApi() {
            return this.api;
        }

        public final com.google.android.gms.common.api.Api.AnyClientKey<A> getClientKey() {
            return this.clientKey;
        }

        protected void onSetFailedResult(R r) {
        }

        public final void run(A a2) throws android.os.DeadObjectException {
            try {
                doExecute(a2);
            } catch (android.os.DeadObjectException e) {
                setFailedResult(e);
                throw e;
            } catch (android.os.RemoteException e2) {
                setFailedResult(e2);
            }
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        public /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
            super.setResult((com.google.android.gms.common.api.Result) obj);
        }

        protected ApiMethodImpl(com.google.android.gms.common.api.Api<?> api, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
            super((com.google.android.gms.common.api.GoogleApiClient) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null");
            this.clientKey = api.zab();
            this.api = api;
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        public final void setFailedResult(com.google.android.gms.common.api.Status status) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!status.isSuccess(), "Failed result must not be success");
            R rCreateFailedResult = createFailedResult(status);
            setResult((com.google.android.gms.common.api.Result) rCreateFailedResult);
            onSetFailedResult(rCreateFailedResult);
        }

        protected ApiMethodImpl(com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<R> callbackHandler) {
            super(callbackHandler);
            this.clientKey = new com.google.android.gms.common.api.Api.AnyClientKey<>();
            this.api = null;
        }
    }
}
