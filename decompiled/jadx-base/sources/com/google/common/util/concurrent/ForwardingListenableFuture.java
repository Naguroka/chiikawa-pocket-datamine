package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class ForwardingListenableFuture<V> extends com.google.common.util.concurrent.ForwardingFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
    public abstract com.google.common.util.concurrent.ListenableFuture<? extends V> delegate();

    protected ForwardingListenableFuture() {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable listener, java.util.concurrent.Executor exec) {
        delegate().addListener(listener, exec);
    }

    public static abstract class SimpleForwardingListenableFuture<V> extends com.google.common.util.concurrent.ForwardingListenableFuture<V> {
        private final com.google.common.util.concurrent.ListenableFuture<V> delegate;

        protected SimpleForwardingListenableFuture(com.google.common.util.concurrent.ListenableFuture<V> delegate) {
            this.delegate = (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final com.google.common.util.concurrent.ListenableFuture<V> delegate() {
            return this.delegate;
        }
    }
}
