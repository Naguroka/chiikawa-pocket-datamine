package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class AbstractIdleService implements com.google.common.util.concurrent.Service {
    private final com.google.common.util.concurrent.Service delegate;
    private final com.google.common.base.Supplier<java.lang.String> threadNameSupplier;

    protected abstract void shutDown() throws java.lang.Exception;

    protected abstract void startUp() throws java.lang.Exception;

    private final class ThreadNameSupplier implements com.google.common.base.Supplier<java.lang.String> {
        private ThreadNameSupplier() {
        }

        @Override // com.google.common.base.Supplier
        public java.lang.String get() {
            return com.google.common.util.concurrent.AbstractIdleService.this.serviceName() + " " + com.google.common.util.concurrent.AbstractIdleService.this.state();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class DelegateService extends com.google.common.util.concurrent.AbstractService {
        private DelegateService() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
            com.google.common.util.concurrent.MoreExecutors.renamingDecorator(com.google.common.util.concurrent.AbstractIdleService.this.executor(), (com.google.common.base.Supplier<java.lang.String>) com.google.common.util.concurrent.AbstractIdleService.this.threadNameSupplier).execute(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AbstractIdleService$DelegateService$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m806x2ed323e8();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$doStart$0$com-google-common-util-concurrent-AbstractIdleService$DelegateService, reason: not valid java name */
        /* synthetic */ void m806x2ed323e8() {
            try {
                com.google.common.util.concurrent.AbstractIdleService.this.startUp();
                notifyStarted();
            } catch (java.lang.Throwable th) {
                com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                notifyFailed(th);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStop() {
            com.google.common.util.concurrent.MoreExecutors.renamingDecorator(com.google.common.util.concurrent.AbstractIdleService.this.executor(), (com.google.common.base.Supplier<java.lang.String>) com.google.common.util.concurrent.AbstractIdleService.this.threadNameSupplier).execute(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AbstractIdleService$DelegateService$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m807xb13e6319();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$doStop$1$com-google-common-util-concurrent-AbstractIdleService$DelegateService, reason: not valid java name */
        /* synthetic */ void m807xb13e6319() {
            try {
                com.google.common.util.concurrent.AbstractIdleService.this.shutDown();
                notifyStopped();
            } catch (java.lang.Throwable th) {
                com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                notifyFailed(th);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public java.lang.String toString() {
            return com.google.common.util.concurrent.AbstractIdleService.this.toString();
        }
    }

    protected AbstractIdleService() {
        this.threadNameSupplier = new com.google.common.util.concurrent.AbstractIdleService.ThreadNameSupplier();
        this.delegate = new com.google.common.util.concurrent.AbstractIdleService.DelegateService();
    }

    protected java.util.concurrent.Executor executor() {
        return new java.util.concurrent.Executor() { // from class: com.google.common.util.concurrent.AbstractIdleService$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                this.f$0.m805xc998c392(runnable);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$executor$0$com-google-common-util-concurrent-AbstractIdleService, reason: not valid java name */
    /* synthetic */ void m805xc998c392(java.lang.Runnable runnable) {
        com.google.common.util.concurrent.MoreExecutors.newThread(this.threadNameSupplier.get(), runnable).start();
    }

    public java.lang.String toString() {
        return serviceName() + " [" + state() + com.ironsource.y8.i.e;
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.delegate.isRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service.State state() {
        return this.delegate.state();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(com.google.common.util.concurrent.Service.Listener listener, java.util.concurrent.Executor executor) {
        this.delegate.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final java.lang.Throwable failureCause() {
        return this.delegate.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service startAsync() {
        this.delegate.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service stopAsync() {
        this.delegate.stopAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.delegate.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.TimeoutException {
        this.delegate.awaitRunning(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.delegate.awaitTerminated();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.TimeoutException {
        this.delegate.awaitTerminated(timeout, unit);
    }

    protected java.lang.String serviceName() {
        return getClass().getSimpleName();
    }
}
