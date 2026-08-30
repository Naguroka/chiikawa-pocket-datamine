package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class AbstractExecutionThreadService implements com.google.common.util.concurrent.Service {
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.AbstractExecutionThreadService.class);
    private final com.google.common.util.concurrent.Service delegate = new com.google.common.util.concurrent.AbstractExecutionThreadService.AnonymousClass1();

    protected abstract void run() throws java.lang.Exception;

    protected void shutDown() throws java.lang.Exception {
    }

    protected void startUp() throws java.lang.Exception {
    }

    protected void triggerShutdown() {
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1, reason: invalid class name */
    class AnonymousClass1 extends com.google.common.util.concurrent.AbstractService {
        AnonymousClass1() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
            com.google.common.util.concurrent.MoreExecutors.renamingDecorator(com.google.common.util.concurrent.AbstractExecutionThreadService.this.executor(), (com.google.common.base.Supplier<java.lang.String>) new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.AbstractExecutionThreadService$1$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return this.f$0.m803xa0f821c5();
                }
            }).execute(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AbstractExecutionThreadService$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m804x3d661e24();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$doStart$0$com-google-common-util-concurrent-AbstractExecutionThreadService$1, reason: not valid java name */
        /* synthetic */ java.lang.String m803xa0f821c5() {
            return com.google.common.util.concurrent.AbstractExecutionThreadService.this.serviceName();
        }

        /* JADX INFO: renamed from: lambda$doStart$1$com-google-common-util-concurrent-AbstractExecutionThreadService$1, reason: not valid java name */
        /* synthetic */ void m804x3d661e24() {
            try {
                com.google.common.util.concurrent.AbstractExecutionThreadService.this.startUp();
                notifyStarted();
                if (isRunning()) {
                    try {
                        com.google.common.util.concurrent.AbstractExecutionThreadService.this.run();
                    } catch (java.lang.Throwable th) {
                        com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                        try {
                            com.google.common.util.concurrent.AbstractExecutionThreadService.this.shutDown();
                        } catch (java.lang.Exception e) {
                            com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(e);
                            com.google.common.util.concurrent.AbstractExecutionThreadService.logger.get().log(java.util.logging.Level.WARNING, "Error while attempting to shut down the service after failure.", (java.lang.Throwable) e);
                        }
                        notifyFailed(th);
                        return;
                    }
                }
                com.google.common.util.concurrent.AbstractExecutionThreadService.this.shutDown();
                notifyStopped();
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th2);
                notifyFailed(th2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void doStop() {
            com.google.common.util.concurrent.AbstractExecutionThreadService.this.triggerShutdown();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public java.lang.String toString() {
            return com.google.common.util.concurrent.AbstractExecutionThreadService.this.toString();
        }
    }

    protected AbstractExecutionThreadService() {
    }

    protected java.util.concurrent.Executor executor() {
        return new java.util.concurrent.Executor() { // from class: com.google.common.util.concurrent.AbstractExecutionThreadService$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                this.f$0.m802xafeb5522(runnable);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$executor$0$com-google-common-util-concurrent-AbstractExecutionThreadService, reason: not valid java name */
    /* synthetic */ void m802xafeb5522(java.lang.Runnable runnable) {
        com.google.common.util.concurrent.MoreExecutors.newThread(serviceName(), runnable).start();
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
