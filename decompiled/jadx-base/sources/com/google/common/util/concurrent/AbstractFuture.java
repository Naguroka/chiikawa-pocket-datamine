package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class AbstractFuture<V> extends com.google.common.util.concurrent.internal.InternalFutureFailureAccess implements com.google.common.util.concurrent.ListenableFuture<V> {
    private static final com.google.common.util.concurrent.AbstractFuture.AtomicHelper ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final java.lang.Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    static final com.google.common.util.concurrent.LazyLogger log;

    @javax.annotation.CheckForNull
    private volatile com.google.common.util.concurrent.AbstractFuture.Listener listeners;

    @javax.annotation.CheckForNull
    private volatile java.lang.Object value;

    @javax.annotation.CheckForNull
    private volatile com.google.common.util.concurrent.AbstractFuture.Waiter waiters;

    interface Trusted<V> extends com.google.common.util.concurrent.ListenableFuture<V> {
    }

    protected void afterDone() {
    }

    protected void interruptTask() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.common.util.concurrent.AbstractFuture$1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.logging.Logger] */
    static {
        boolean z;
        com.google.common.util.concurrent.AbstractFuture.AtomicHelper synchronizedHelper;
        try {
            z = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z = false;
        }
        GENERATE_CANCELLATION_CAUSES = z;
        log = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.AbstractFuture.class);
        ?? r0 = 0;
        r0 = 0;
        try {
            synchronizedHelper = new com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper();
            e = null;
        } catch (java.lang.Error | java.lang.Exception e) {
            e = e;
            try {
                synchronizedHelper = new com.google.common.util.concurrent.AbstractFuture.SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractFuture.Waiter.class, java.lang.Thread.class, "thread"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractFuture.Waiter.class, com.google.common.util.concurrent.AbstractFuture.Waiter.class, "next"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractFuture.class, com.google.common.util.concurrent.AbstractFuture.Waiter.class, "waiters"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractFuture.class, com.google.common.util.concurrent.AbstractFuture.Listener.class, "listeners"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractFuture.class, java.lang.Object.class, "value"));
            } catch (java.lang.Error | java.lang.Exception e2) {
                synchronizedHelper = new com.google.common.util.concurrent.AbstractFuture.SynchronizedHelper();
                r0 = e2;
            }
        }
        ATOMIC_HELPER = synchronizedHelper;
        if (r0 != 0) {
            com.google.common.util.concurrent.LazyLogger lazyLogger = log;
            lazyLogger.get().log(java.util.logging.Level.SEVERE, "UnsafeAtomicHelper is broken!", e);
            lazyLogger.get().log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", r0);
        }
        NULL = new java.lang.Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static abstract class TrustedFuture<V> extends com.google.common.util.concurrent.AbstractFuture<V> implements com.google.common.util.concurrent.AbstractFuture.Trusted<V> {
        TrustedFuture() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.common.util.concurrent.ParametricNullness
        public final V get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.common.util.concurrent.ParametricNullness
        public final V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            return (V) super.get(j, timeUnit);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(java.lang.Runnable listener, java.util.concurrent.Executor executor) {
            super.addListener(listener, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean mayInterruptIfRunning) {
            return super.cancel(mayInterruptIfRunning);
        }
    }

    private static final class Waiter {
        static final com.google.common.util.concurrent.AbstractFuture.Waiter TOMBSTONE = new com.google.common.util.concurrent.AbstractFuture.Waiter(false);

        @javax.annotation.CheckForNull
        volatile com.google.common.util.concurrent.AbstractFuture.Waiter next;

        @javax.annotation.CheckForNull
        volatile java.lang.Thread thread;

        Waiter(boolean unused) {
        }

        Waiter() {
            com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER.putThread(this, java.lang.Thread.currentThread());
        }

        void setNext(@javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter next) {
            com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER.putNext(this, next);
        }

        void unpark() {
            java.lang.Thread thread = this.thread;
            if (thread != null) {
                this.thread = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
        }
    }

    private void removeWaiter(com.google.common.util.concurrent.AbstractFuture.Waiter node) {
        node.thread = null;
        while (true) {
            com.google.common.util.concurrent.AbstractFuture.Waiter waiter = this.waiters;
            if (waiter == com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE) {
                return;
            }
            com.google.common.util.concurrent.AbstractFuture.Waiter waiter2 = null;
            while (waiter != null) {
                com.google.common.util.concurrent.AbstractFuture.Waiter waiter3 = waiter.next;
                if (waiter.thread != null) {
                    waiter2 = waiter;
                } else if (waiter2 != null) {
                    waiter2.next = waiter3;
                    if (waiter2.thread == null) {
                    }
                } else if (!ATOMIC_HELPER.casWaiters(this, waiter, waiter3)) {
                }
                waiter = waiter3;
            }
            return;
        }
    }

    private static final class Listener {
        static final com.google.common.util.concurrent.AbstractFuture.Listener TOMBSTONE = new com.google.common.util.concurrent.AbstractFuture.Listener();

        @javax.annotation.CheckForNull
        final java.util.concurrent.Executor executor;

        @javax.annotation.CheckForNull
        com.google.common.util.concurrent.AbstractFuture.Listener next;

        @javax.annotation.CheckForNull
        final java.lang.Runnable task;

        Listener(java.lang.Runnable task, java.util.concurrent.Executor executor) {
            this.task = task;
            this.executor = executor;
        }

        Listener() {
            this.task = null;
            this.executor = null;
        }
    }

    private static final class Failure {
        static final com.google.common.util.concurrent.AbstractFuture.Failure FALLBACK_INSTANCE = new com.google.common.util.concurrent.AbstractFuture.Failure(new java.lang.Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized java.lang.Throwable fillInStackTrace() {
                return this;
            }
        });
        final java.lang.Throwable exception;

        Failure(java.lang.Throwable exception) {
            this.exception = (java.lang.Throwable) com.google.common.base.Preconditions.checkNotNull(exception);
        }
    }

    private static final class Cancellation {

        @javax.annotation.CheckForNull
        static final com.google.common.util.concurrent.AbstractFuture.Cancellation CAUSELESS_CANCELLED;

        @javax.annotation.CheckForNull
        static final com.google.common.util.concurrent.AbstractFuture.Cancellation CAUSELESS_INTERRUPTED;

        @javax.annotation.CheckForNull
        final java.lang.Throwable cause;
        final boolean wasInterrupted;

        static {
            if (com.google.common.util.concurrent.AbstractFuture.GENERATE_CANCELLATION_CAUSES) {
                CAUSELESS_CANCELLED = null;
                CAUSELESS_INTERRUPTED = null;
            } else {
                CAUSELESS_CANCELLED = new com.google.common.util.concurrent.AbstractFuture.Cancellation(false, null);
                CAUSELESS_INTERRUPTED = new com.google.common.util.concurrent.AbstractFuture.Cancellation(true, null);
            }
        }

        Cancellation(boolean wasInterrupted, @javax.annotation.CheckForNull java.lang.Throwable cause) {
            this.wasInterrupted = wasInterrupted;
            this.cause = cause;
        }
    }

    private static final class SetFuture<V> implements java.lang.Runnable {
        final com.google.common.util.concurrent.ListenableFuture<? extends V> future;
        final com.google.common.util.concurrent.AbstractFuture<V> owner;

        SetFuture(com.google.common.util.concurrent.AbstractFuture<V> owner, com.google.common.util.concurrent.ListenableFuture<? extends V> future) {
            this.owner = owner;
            this.future = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((com.google.common.util.concurrent.AbstractFuture) this.owner).value != this) {
                return;
            }
            if (com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER.casValue(this.owner, this, com.google.common.util.concurrent.AbstractFuture.getFutureValue(this.future))) {
                com.google.common.util.concurrent.AbstractFuture.complete(this.owner, false);
            }
        }
    }

    protected AbstractFuture() {
    }

    @Override // java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = unit.toNanos(timeout);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.value;
        if ((obj != null) & (!(obj instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture))) {
            return getDoneValue(obj);
        }
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            com.google.common.util.concurrent.AbstractFuture.Waiter waiter = this.waiters;
            if (waiter != com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE) {
                com.google.common.util.concurrent.AbstractFuture.Waiter waiter2 = new com.google.common.util.concurrent.AbstractFuture.Waiter();
                while (true) {
                    waiter2.setNext(waiter);
                    if (ATOMIC_HELPER.casWaiters(this, waiter, waiter2)) {
                        do {
                            com.google.common.util.concurrent.OverflowAvoidingLockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                removeWaiter(waiter2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.value;
                            if ((obj2 != null) & (!(obj2 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture))) {
                                return getDoneValue(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(waiter2);
                        break;
                    }
                    waiter = this.waiters;
                    if (waiter == com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE) {
                    }
                }
            }
            return getDoneValue(java.util.Objects.requireNonNull(this.value));
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.value;
            if ((obj3 != null) & (!(obj3 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture))) {
                return getDoneValue(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = jNanoTime - java.lang.System.nanoTime();
        }
        java.lang.String string = toString();
        java.lang.String lowerCase = unit.toString().toLowerCase(java.util.Locale.ROOT);
        java.lang.String str = "Waited " + timeout + " " + unit.toString().toLowerCase(java.util.Locale.ROOT);
        if (nanos + 1000 < 0) {
            java.lang.String str2 = str + " (plus ";
            long j = -nanos;
            long jConvert = unit.convert(j, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j - unit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                java.lang.String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new java.util.concurrent.TimeoutException(str + " but future completed as timeout expired");
        }
        throw new java.util.concurrent.TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.value;
        if ((obj2 != null) & (!(obj2 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture))) {
            return getDoneValue(obj2);
        }
        com.google.common.util.concurrent.AbstractFuture.Waiter waiter = this.waiters;
        if (waiter != com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE) {
            com.google.common.util.concurrent.AbstractFuture.Waiter waiter2 = new com.google.common.util.concurrent.AbstractFuture.Waiter();
            do {
                waiter2.setNext(waiter);
                if (ATOMIC_HELPER.casWaiters(this, waiter, waiter2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            removeWaiter(waiter2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture))));
                    return getDoneValue(obj);
                }
                waiter = this.waiters;
            } while (waiter != com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE);
        }
        return getDoneValue(java.util.Objects.requireNonNull(this.value));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.util.concurrent.ParametricNullness
    private V getDoneValue(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((com.google.common.util.concurrent.AbstractFuture.Cancellation) obj).cause);
        }
        if (obj instanceof com.google.common.util.concurrent.AbstractFuture.Failure) {
            throw new java.util.concurrent.ExecutionException(((com.google.common.util.concurrent.AbstractFuture.Failure) obj).exception);
        }
        return obj == NULL ? (V) com.google.common.util.concurrent.NullnessCasts.uncheckedNull() : obj;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        java.lang.Object obj = this.value;
        return (!(obj instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture)) & (obj != null);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        com.google.common.util.concurrent.AbstractFuture.Cancellation cancellation;
        java.lang.Object objRequireNonNull;
        java.lang.Object obj = this.value;
        if (!(obj == null) && !(obj instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            objRequireNonNull = new com.google.common.util.concurrent.AbstractFuture.Cancellation(mayInterruptIfRunning, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            if (mayInterruptIfRunning) {
                cancellation = com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED;
            } else {
                cancellation = com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED;
            }
            objRequireNonNull = java.util.Objects.requireNonNull(cancellation);
        }
        com.google.common.util.concurrent.AbstractFuture<V> abstractFuture = this;
        boolean z = false;
        while (true) {
            if (ATOMIC_HELPER.casValue(abstractFuture, obj, objRequireNonNull)) {
                complete(abstractFuture, mayInterruptIfRunning);
                if (!(obj instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture)) {
                    return true;
                }
                com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = ((com.google.common.util.concurrent.AbstractFuture.SetFuture) obj).future;
                if (listenableFuture instanceof com.google.common.util.concurrent.AbstractFuture.Trusted) {
                    abstractFuture = (com.google.common.util.concurrent.AbstractFuture) listenableFuture;
                    obj = abstractFuture.value;
                    if (!(obj == null) && !(obj instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture)) {
                        return true;
                    }
                    z = true;
                } else {
                    listenableFuture.cancel(mayInterruptIfRunning);
                    return true;
                }
            } else {
                obj = abstractFuture.value;
                if (!(obj instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture)) {
                    return z;
                }
            }
        }
    }

    protected final boolean wasInterrupted() {
        java.lang.Object obj = this.value;
        return (obj instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation) && ((com.google.common.util.concurrent.AbstractFuture.Cancellation) obj).wasInterrupted;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable listener, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.AbstractFuture.Listener listener2;
        com.google.common.base.Preconditions.checkNotNull(listener, "Runnable was null.");
        com.google.common.base.Preconditions.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (listener2 = this.listeners) != com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE) {
            com.google.common.util.concurrent.AbstractFuture.Listener listener3 = new com.google.common.util.concurrent.AbstractFuture.Listener(listener, executor);
            do {
                listener3.next = listener2;
                if (ATOMIC_HELPER.casListeners(this, listener2, listener3)) {
                    return;
                } else {
                    listener2 = this.listeners;
                }
            } while (listener2 != com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE);
        }
        executeListener(listener, executor);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected boolean set(@com.google.common.util.concurrent.ParametricNullness V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (!ATOMIC_HELPER.casValue(this, null, v)) {
            return false;
        }
        complete(this, false);
        return true;
    }

    protected boolean setException(java.lang.Throwable throwable) {
        if (!ATOMIC_HELPER.casValue(this, null, new com.google.common.util.concurrent.AbstractFuture.Failure((java.lang.Throwable) com.google.common.base.Preconditions.checkNotNull(throwable)))) {
            return false;
        }
        complete(this, false);
        return true;
    }

    protected boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> future) {
        com.google.common.util.concurrent.AbstractFuture.Failure failure;
        com.google.common.base.Preconditions.checkNotNull(future);
        java.lang.Object obj = this.value;
        if (obj == null) {
            if (future.isDone()) {
                if (!ATOMIC_HELPER.casValue(this, null, getFutureValue(future))) {
                    return false;
                }
                complete(this, false);
                return true;
            }
            com.google.common.util.concurrent.AbstractFuture.SetFuture setFuture = new com.google.common.util.concurrent.AbstractFuture.SetFuture(this, future);
            if (ATOMIC_HELPER.casValue(this, null, setFuture)) {
                try {
                    future.addListener(setFuture, com.google.common.util.concurrent.DirectExecutor.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        failure = new com.google.common.util.concurrent.AbstractFuture.Failure(th);
                    } catch (java.lang.Error | java.lang.Exception unused) {
                        failure = com.google.common.util.concurrent.AbstractFuture.Failure.FALLBACK_INSTANCE;
                    }
                    ATOMIC_HELPER.casValue(this, setFuture, failure);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation) {
            future.cancel(((com.google.common.util.concurrent.AbstractFuture.Cancellation) obj).wasInterrupted);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object getFutureValue(com.google.common.util.concurrent.ListenableFuture<?> future) {
        java.lang.Throwable thTryInternalFastPathGetFailure;
        if (future instanceof com.google.common.util.concurrent.AbstractFuture.Trusted) {
            java.lang.Object cancellation = ((com.google.common.util.concurrent.AbstractFuture) future).value;
            if (cancellation instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation) {
                com.google.common.util.concurrent.AbstractFuture.Cancellation cancellation2 = (com.google.common.util.concurrent.AbstractFuture.Cancellation) cancellation;
                if (cancellation2.wasInterrupted) {
                    cancellation = cancellation2.cause != null ? new com.google.common.util.concurrent.AbstractFuture.Cancellation(false, cancellation2.cause) : com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED;
                }
            }
            return java.util.Objects.requireNonNull(cancellation);
        }
        if ((future instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess) && (thTryInternalFastPathGetFailure = com.google.common.util.concurrent.internal.InternalFutures.tryInternalFastPathGetFailure((com.google.common.util.concurrent.internal.InternalFutureFailureAccess) future)) != null) {
            return new com.google.common.util.concurrent.AbstractFuture.Failure(thTryInternalFastPathGetFailure);
        }
        boolean zIsCancelled = future.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) & zIsCancelled) {
            return java.util.Objects.requireNonNull(com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED);
        }
        try {
            java.lang.Object uninterruptibly = getUninterruptibly(future);
            if (zIsCancelled) {
                return new com.google.common.util.concurrent.AbstractFuture.Cancellation(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + future));
            }
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (java.lang.Error e) {
            e = e;
            return new com.google.common.util.concurrent.AbstractFuture.Failure(e);
        } catch (java.util.concurrent.CancellationException e2) {
            if (!zIsCancelled) {
                return new com.google.common.util.concurrent.AbstractFuture.Failure(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e2));
            }
            return new com.google.common.util.concurrent.AbstractFuture.Cancellation(false, e2);
        } catch (java.util.concurrent.ExecutionException e3) {
            if (zIsCancelled) {
                return new com.google.common.util.concurrent.AbstractFuture.Cancellation(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + future, e3));
            }
            return new com.google.common.util.concurrent.AbstractFuture.Failure(e3.getCause());
        } catch (java.lang.Exception e4) {
            e = e4;
            return new com.google.common.util.concurrent.AbstractFuture.Failure(e);
        }
    }

    @com.google.common.util.concurrent.ParametricNullness
    private static <V> V getUninterruptibly(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void complete(com.google.common.util.concurrent.AbstractFuture<?> abstractFuture, boolean z) {
        com.google.common.util.concurrent.AbstractFuture.Listener listener = null;
        while (true) {
            abstractFuture.releaseWaiters();
            if (z) {
                abstractFuture.interruptTask();
                z = false;
            }
            abstractFuture.afterDone();
            com.google.common.util.concurrent.AbstractFuture.Listener listenerClearListeners = abstractFuture.clearListeners(listener);
            while (listenerClearListeners != null) {
                listener = listenerClearListeners.next;
                java.lang.Runnable runnable = (java.lang.Runnable) java.util.Objects.requireNonNull(listenerClearListeners.task);
                if (runnable instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture) {
                    com.google.common.util.concurrent.AbstractFuture.SetFuture setFuture = (com.google.common.util.concurrent.AbstractFuture.SetFuture) runnable;
                    abstractFuture = setFuture.owner;
                    if (((com.google.common.util.concurrent.AbstractFuture) abstractFuture).value == setFuture) {
                        if (ATOMIC_HELPER.casValue(abstractFuture, setFuture, getFutureValue(setFuture.future))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, (java.util.concurrent.Executor) java.util.Objects.requireNonNull(listenerClearListeners.executor));
                }
                listenerClearListeners = listener;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    @javax.annotation.CheckForNull
    protected final java.lang.Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof com.google.common.util.concurrent.AbstractFuture.Trusted)) {
            return null;
        }
        java.lang.Object obj = this.value;
        if (obj instanceof com.google.common.util.concurrent.AbstractFuture.Failure) {
            return ((com.google.common.util.concurrent.AbstractFuture.Failure) obj).exception;
        }
        return null;
    }

    final void maybePropagateCancellationTo(@javax.annotation.CheckForNull java.util.concurrent.Future<?> related) {
        if ((related != null) && isCancelled()) {
            related.cancel(wasInterrupted());
        }
    }

    private void releaseWaiters() {
        for (com.google.common.util.concurrent.AbstractFuture.Waiter waiterGasWaiters = ATOMIC_HELPER.gasWaiters(this, com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE); waiterGasWaiters != null; waiterGasWaiters = waiterGasWaiters.next) {
            waiterGasWaiters.unpark();
        }
    }

    @javax.annotation.CheckForNull
    private com.google.common.util.concurrent.AbstractFuture.Listener clearListeners(@javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Listener onto) {
        com.google.common.util.concurrent.AbstractFuture.Listener listener = onto;
        com.google.common.util.concurrent.AbstractFuture.Listener listenerGasListeners = ATOMIC_HELPER.gasListeners(this, com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE);
        while (listenerGasListeners != null) {
            com.google.common.util.concurrent.AbstractFuture.Listener listener2 = listenerGasListeners.next;
            listenerGasListeners.next = listener;
            listener = listenerGasListeners;
            listenerGasListeners = listener2;
        }
        return listener;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@').append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this))).append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            addPendingString(sb);
        }
        return sb.append(com.ironsource.y8.i.e).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @javax.annotation.CheckForNull
    protected java.lang.String pendingToString() {
        if (this instanceof java.util.concurrent.ScheduledFuture) {
            return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    private void addPendingString(java.lang.StringBuilder builder) {
        java.lang.String strEmptyToNull;
        int length = builder.length();
        builder.append("PENDING");
        java.lang.Object obj = this.value;
        if (obj instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture) {
            builder.append(", setFuture=[");
            appendUserObject(builder, ((com.google.common.util.concurrent.AbstractFuture.SetFuture) obj).future);
            builder.append(com.ironsource.y8.i.e);
        } else {
            try {
                strEmptyToNull = com.google.common.base.Strings.emptyToNull(pendingToString());
            } catch (java.lang.Exception | java.lang.StackOverflowError e) {
                strEmptyToNull = "Exception thrown from implementation: " + e.getClass();
            }
            if (strEmptyToNull != null) {
                builder.append(", info=[").append(strEmptyToNull).append(com.ironsource.y8.i.e);
            }
        }
        if (isDone()) {
            builder.delete(length, builder.length());
            addDoneString(builder);
        }
    }

    private void addDoneString(java.lang.StringBuilder builder) {
        try {
            java.lang.Object uninterruptibly = getUninterruptibly(this);
            builder.append("SUCCESS, result=[");
            appendResultObject(builder, uninterruptibly);
            builder.append(com.ironsource.y8.i.e);
        } catch (java.util.concurrent.CancellationException unused) {
            builder.append("CANCELLED");
        } catch (java.util.concurrent.ExecutionException e) {
            builder.append("FAILURE, cause=[").append(e.getCause()).append(com.ironsource.y8.i.e);
        } catch (java.lang.Exception e2) {
            builder.append("UNKNOWN, cause=[").append(e2.getClass()).append(" thrown from get()]");
        }
    }

    private void appendResultObject(java.lang.StringBuilder builder, @javax.annotation.CheckForNull java.lang.Object o) {
        if (o == null) {
            builder.append("null");
        } else if (o == this) {
            builder.append("this future");
        } else {
            builder.append(o.getClass().getName()).append("@").append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(o)));
        }
    }

    private void appendUserObject(java.lang.StringBuilder builder, @javax.annotation.CheckForNull java.lang.Object o) {
        try {
            if (o == this) {
                builder.append("this future");
            } else {
                builder.append(o);
            }
        } catch (java.lang.Exception | java.lang.StackOverflowError e) {
            builder.append("Exception thrown from implementation: ").append(e.getClass());
        }
    }

    private static void executeListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            log.get().log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (java.lang.Throwable) e);
        }
    }

    private static abstract class AtomicHelper {
        abstract boolean casListeners(com.google.common.util.concurrent.AbstractFuture<?> future, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Listener expect, com.google.common.util.concurrent.AbstractFuture.Listener update);

        abstract boolean casValue(com.google.common.util.concurrent.AbstractFuture<?> future, @javax.annotation.CheckForNull java.lang.Object expect, java.lang.Object update);

        abstract boolean casWaiters(com.google.common.util.concurrent.AbstractFuture<?> future, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter expect, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter update);

        abstract com.google.common.util.concurrent.AbstractFuture.Listener gasListeners(com.google.common.util.concurrent.AbstractFuture<?> future, com.google.common.util.concurrent.AbstractFuture.Listener update);

        abstract com.google.common.util.concurrent.AbstractFuture.Waiter gasWaiters(com.google.common.util.concurrent.AbstractFuture<?> future, com.google.common.util.concurrent.AbstractFuture.Waiter update);

        abstract void putNext(com.google.common.util.concurrent.AbstractFuture.Waiter waiter, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter newValue);

        abstract void putThread(com.google.common.util.concurrent.AbstractFuture.Waiter waiter, java.lang.Thread newValue);

        private AtomicHelper() {
        }
    }

    private static final class UnsafeAtomicHelper extends com.google.common.util.concurrent.AbstractFuture.AtomicHelper {
        static final long LISTENERS_OFFSET;
        static final sun.misc.Unsafe UNSAFE;
        static final long VALUE_OFFSET;
        static final long WAITERS_OFFSET;
        static final long WAITER_NEXT_OFFSET;
        static final long WAITER_THREAD_OFFSET;

        private UnsafeAtomicHelper() {
            super();
        }

        static {
            sun.misc.Unsafe unsafe;
            try {
                try {
                    unsafe = sun.misc.Unsafe.getUnsafe();
                } catch (java.security.PrivilegedActionException e) {
                    throw new java.lang.RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (java.lang.SecurityException unused) {
                unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() { // from class: com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.1
                    @Override // java.security.PrivilegedExceptionAction
                    public sun.misc.Unsafe run() throws java.lang.Exception {
                        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            java.lang.Object obj = field.get(null);
                            if (sun.misc.Unsafe.class.isInstance(obj)) {
                                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                            }
                        }
                        throw new java.lang.NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                WAITERS_OFFSET = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractFuture.class.getDeclaredField("waiters"));
                LISTENERS_OFFSET = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractFuture.class.getDeclaredField("listeners"));
                VALUE_OFFSET = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractFuture.class.getDeclaredField("value"));
                WAITER_THREAD_OFFSET = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractFuture.Waiter.class.getDeclaredField("thread"));
                WAITER_NEXT_OFFSET = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractFuture.Waiter.class.getDeclaredField("next"));
                UNSAFE = unsafe;
            } catch (java.lang.NoSuchFieldException e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putThread(com.google.common.util.concurrent.AbstractFuture.Waiter waiter, java.lang.Thread newValue) {
            UNSAFE.putObject(waiter, WAITER_THREAD_OFFSET, newValue);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putNext(com.google.common.util.concurrent.AbstractFuture.Waiter waiter, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter newValue) {
            UNSAFE.putObject(waiter, WAITER_NEXT_OFFSET, newValue);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casWaiters(com.google.common.util.concurrent.AbstractFuture<?> future, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter expect, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter update) {
            return kotlin.UByte$$ExternalSyntheticBackport0.m(UNSAFE, future, WAITERS_OFFSET, expect, update);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casListeners(com.google.common.util.concurrent.AbstractFuture<?> future, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Listener expect, com.google.common.util.concurrent.AbstractFuture.Listener update) {
            return kotlin.UByte$$ExternalSyntheticBackport0.m(UNSAFE, future, LISTENERS_OFFSET, expect, update);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        com.google.common.util.concurrent.AbstractFuture.Listener gasListeners(com.google.common.util.concurrent.AbstractFuture<?> future, com.google.common.util.concurrent.AbstractFuture.Listener update) {
            com.google.common.util.concurrent.AbstractFuture.Listener listener;
            do {
                listener = ((com.google.common.util.concurrent.AbstractFuture) future).listeners;
                if (update == listener) {
                    return listener;
                }
            } while (!casListeners(future, listener, update));
            return listener;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        com.google.common.util.concurrent.AbstractFuture.Waiter gasWaiters(com.google.common.util.concurrent.AbstractFuture<?> future, com.google.common.util.concurrent.AbstractFuture.Waiter update) {
            com.google.common.util.concurrent.AbstractFuture.Waiter waiter;
            do {
                waiter = ((com.google.common.util.concurrent.AbstractFuture) future).waiters;
                if (update == waiter) {
                    return waiter;
                }
            } while (!casWaiters(future, waiter, update));
            return waiter;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casValue(com.google.common.util.concurrent.AbstractFuture<?> future, @javax.annotation.CheckForNull java.lang.Object expect, java.lang.Object update) {
            return kotlin.UByte$$ExternalSyntheticBackport0.m(UNSAFE, future, VALUE_OFFSET, expect, update);
        }
    }

    private static final class SafeAtomicHelper extends com.google.common.util.concurrent.AbstractFuture.AtomicHelper {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture.Listener> listenersUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, java.lang.Object> valueUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture.Waiter, com.google.common.util.concurrent.AbstractFuture.Waiter> waiterNextUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture.Waiter, java.lang.Thread> waiterThreadUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture.Waiter> waitersUpdater;

        SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture.Waiter, java.lang.Thread> waiterThreadUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture.Waiter, com.google.common.util.concurrent.AbstractFuture.Waiter> waiterNextUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture.Waiter> waitersUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture.Listener> listenersUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, java.lang.Object> valueUpdater) {
            super();
            this.waiterThreadUpdater = waiterThreadUpdater;
            this.waiterNextUpdater = waiterNextUpdater;
            this.waitersUpdater = waitersUpdater;
            this.listenersUpdater = listenersUpdater;
            this.valueUpdater = valueUpdater;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putThread(com.google.common.util.concurrent.AbstractFuture.Waiter waiter, java.lang.Thread newValue) {
            this.waiterThreadUpdater.lazySet(waiter, newValue);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putNext(com.google.common.util.concurrent.AbstractFuture.Waiter waiter, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter newValue) {
            this.waiterNextUpdater.lazySet(waiter, newValue);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casWaiters(com.google.common.util.concurrent.AbstractFuture<?> future, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter expect, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter update) {
            return kotlin.UByte$$ExternalSyntheticBackport0.m(this.waitersUpdater, future, expect, update);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casListeners(com.google.common.util.concurrent.AbstractFuture<?> future, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Listener expect, com.google.common.util.concurrent.AbstractFuture.Listener update) {
            return kotlin.UByte$$ExternalSyntheticBackport0.m(this.listenersUpdater, future, expect, update);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        com.google.common.util.concurrent.AbstractFuture.Listener gasListeners(com.google.common.util.concurrent.AbstractFuture<?> future, com.google.common.util.concurrent.AbstractFuture.Listener update) {
            return this.listenersUpdater.getAndSet(future, update);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        com.google.common.util.concurrent.AbstractFuture.Waiter gasWaiters(com.google.common.util.concurrent.AbstractFuture<?> future, com.google.common.util.concurrent.AbstractFuture.Waiter update) {
            return this.waitersUpdater.getAndSet(future, update);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casValue(com.google.common.util.concurrent.AbstractFuture<?> future, @javax.annotation.CheckForNull java.lang.Object expect, java.lang.Object update) {
            return kotlin.UByte$$ExternalSyntheticBackport0.m(this.valueUpdater, future, expect, update);
        }
    }

    private static final class SynchronizedHelper extends com.google.common.util.concurrent.AbstractFuture.AtomicHelper {
        private SynchronizedHelper() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putThread(com.google.common.util.concurrent.AbstractFuture.Waiter waiter, java.lang.Thread newValue) {
            waiter.thread = newValue;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putNext(com.google.common.util.concurrent.AbstractFuture.Waiter waiter, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter newValue) {
            waiter.next = newValue;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casWaiters(com.google.common.util.concurrent.AbstractFuture<?> future, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter expect, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Waiter update) {
            synchronized (future) {
                if (((com.google.common.util.concurrent.AbstractFuture) future).waiters != expect) {
                    return false;
                }
                ((com.google.common.util.concurrent.AbstractFuture) future).waiters = update;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casListeners(com.google.common.util.concurrent.AbstractFuture<?> future, @javax.annotation.CheckForNull com.google.common.util.concurrent.AbstractFuture.Listener expect, com.google.common.util.concurrent.AbstractFuture.Listener update) {
            synchronized (future) {
                if (((com.google.common.util.concurrent.AbstractFuture) future).listeners != expect) {
                    return false;
                }
                ((com.google.common.util.concurrent.AbstractFuture) future).listeners = update;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        com.google.common.util.concurrent.AbstractFuture.Listener gasListeners(com.google.common.util.concurrent.AbstractFuture<?> future, com.google.common.util.concurrent.AbstractFuture.Listener update) {
            com.google.common.util.concurrent.AbstractFuture.Listener listener;
            synchronized (future) {
                listener = ((com.google.common.util.concurrent.AbstractFuture) future).listeners;
                if (listener != update) {
                    ((com.google.common.util.concurrent.AbstractFuture) future).listeners = update;
                }
            }
            return listener;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        com.google.common.util.concurrent.AbstractFuture.Waiter gasWaiters(com.google.common.util.concurrent.AbstractFuture<?> future, com.google.common.util.concurrent.AbstractFuture.Waiter update) {
            com.google.common.util.concurrent.AbstractFuture.Waiter waiter;
            synchronized (future) {
                waiter = ((com.google.common.util.concurrent.AbstractFuture) future).waiters;
                if (waiter != update) {
                    ((com.google.common.util.concurrent.AbstractFuture) future).waiters = update;
                }
            }
            return waiter;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casValue(com.google.common.util.concurrent.AbstractFuture<?> future, @javax.annotation.CheckForNull java.lang.Object expect, java.lang.Object update) {
            synchronized (future) {
                if (((com.google.common.util.concurrent.AbstractFuture) future).value != expect) {
                    return false;
                }
                ((com.google.common.util.concurrent.AbstractFuture) future).value = update;
                return true;
            }
        }
    }

    private static java.util.concurrent.CancellationException cancellationExceptionWithCause(java.lang.String message, @javax.annotation.CheckForNull java.lang.Throwable cause) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }
}
