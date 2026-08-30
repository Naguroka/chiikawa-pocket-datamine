package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class TaskApiCall<A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> {
    private final com.google.android.gms.common.Feature[] zaa;
    private final boolean zab;
    private final int zac;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public static class Builder<A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> {
        private com.google.android.gms.common.api.internal.RemoteCall zaa;
        private com.google.android.gms.common.Feature[] zac;
        private boolean zab = true;
        private int zad = 0;

        private Builder() {
        }

        /* synthetic */ Builder(com.google.android.gms.common.api.internal.zact zactVar) {
        }

        public com.google.android.gms.common.api.internal.TaskApiCall<A, ResultT> build() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zaa != null, "execute parameter required");
            return new com.google.android.gms.common.api.internal.zacs(this, this.zac, this.zab, this.zad);
        }

        @java.lang.Deprecated
        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> execute(final com.google.android.gms.common.util.BiConsumer<A, com.google.android.gms.tasks.TaskCompletionSource<ResultT>> biConsumer) {
            this.zaa = new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.common.api.internal.zacr
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    biConsumer.accept((com.google.android.gms.common.api.Api.AnyClient) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
                }
            };
            return this;
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> run(com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<ResultT>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.zab = z;
            return this;
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> setFeatures(com.google.android.gms.common.Feature... featureArr) {
            this.zac = featureArr;
            return this;
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> setMethodKey(int i) {
            this.zad = i;
            return this;
        }
    }

    @java.lang.Deprecated
    public TaskApiCall() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    protected TaskApiCall(com.google.android.gms.common.Feature[] featureArr, boolean z, int i) {
        this.zaa = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.zab = z2;
        this.zac = i;
    }

    public static <A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> builder() {
        return new com.google.android.gms.common.api.internal.TaskApiCall.Builder<>(null);
    }

    protected abstract void doExecute(A a2, com.google.android.gms.tasks.TaskCompletionSource<ResultT> taskCompletionSource) throws android.os.RemoteException;

    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    public final int zaa() {
        return this.zac;
    }

    public final com.google.android.gms.common.Feature[] zab() {
        return this.zaa;
    }
}
