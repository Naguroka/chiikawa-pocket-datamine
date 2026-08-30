package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
class OptionalProvider<T> implements com.google.firebase.inject.Provider<T>, com.google.firebase.inject.Deferred<T> {
    private volatile com.google.firebase.inject.Provider<T> delegate;
    private com.google.firebase.inject.Deferred.DeferredHandler<T> handler;
    private static final com.google.firebase.inject.Deferred.DeferredHandler<java.lang.Object> NOOP_HANDLER = new com.google.firebase.inject.Deferred.DeferredHandler() { // from class: com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0
        @Override // com.google.firebase.inject.Deferred.DeferredHandler
        public final void handle(com.google.firebase.inject.Provider provider) {
            com.google.firebase.components.OptionalProvider.lambda$static$0(provider);
        }
    };
    private static final com.google.firebase.inject.Provider<java.lang.Object> EMPTY_PROVIDER = new com.google.firebase.inject.Provider() { // from class: com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda1
        @Override // com.google.firebase.inject.Provider
        public final java.lang.Object get() {
            return com.google.firebase.components.OptionalProvider.lambda$static$1();
        }
    };

    static /* synthetic */ void lambda$static$0(com.google.firebase.inject.Provider provider) {
    }

    static /* synthetic */ java.lang.Object lambda$static$1() {
        return null;
    }

    private OptionalProvider(com.google.firebase.inject.Deferred.DeferredHandler<T> deferredHandler, com.google.firebase.inject.Provider<T> provider) {
        this.handler = deferredHandler;
        this.delegate = provider;
    }

    static <T> com.google.firebase.components.OptionalProvider<T> empty() {
        return new com.google.firebase.components.OptionalProvider<>(NOOP_HANDLER, EMPTY_PROVIDER);
    }

    static <T> com.google.firebase.components.OptionalProvider<T> of(com.google.firebase.inject.Provider<T> provider) {
        return new com.google.firebase.components.OptionalProvider<>(null, provider);
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.delegate.get();
    }

    void set(com.google.firebase.inject.Provider<T> provider) {
        com.google.firebase.inject.Deferred.DeferredHandler<T> deferredHandler;
        if (this.delegate != EMPTY_PROVIDER) {
            throw new java.lang.IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            deferredHandler = this.handler;
            this.handler = null;
            this.delegate = provider;
        }
        deferredHandler.handle(provider);
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(final com.google.firebase.inject.Deferred.DeferredHandler<T> deferredHandler) {
        com.google.firebase.inject.Provider<T> provider;
        com.google.firebase.inject.Provider<T> provider2;
        com.google.firebase.inject.Provider<T> provider3 = this.delegate;
        com.google.firebase.inject.Provider<java.lang.Object> provider4 = EMPTY_PROVIDER;
        if (provider3 != provider4) {
            deferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.delegate;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                final com.google.firebase.inject.Deferred.DeferredHandler<T> deferredHandler2 = this.handler;
                this.handler = new com.google.firebase.inject.Deferred.DeferredHandler() { // from class: com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda2
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void handle(com.google.firebase.inject.Provider provider5) {
                        com.google.firebase.components.OptionalProvider.lambda$whenAvailable$2(deferredHandler2, deferredHandler, provider5);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.handle(provider);
        }
    }

    static /* synthetic */ void lambda$whenAvailable$2(com.google.firebase.inject.Deferred.DeferredHandler deferredHandler, com.google.firebase.inject.Deferred.DeferredHandler deferredHandler2, com.google.firebase.inject.Provider provider) {
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }
}
