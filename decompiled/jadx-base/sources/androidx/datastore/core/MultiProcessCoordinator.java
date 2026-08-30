package androidx.datastore.core;

/* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\bH\u0002J\u000e\u0010\"\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J2\u0010&\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u001c\u0010(\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0)H\u0096@¢\u0006\u0002\u0010,J8\u0010-\u001a\u0002H'\"\u0004\b\u0000\u0010'2\"\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0.H\u0096@¢\u0006\u0002\u00100J:\u00101\u001a\u0002H'\"\u0004\b\u0000\u0010'2$\b\u0004\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0.H\u0082H¢\u0006\u0002\u00100J\f\u00102\u001a\u00020\u001d*\u00020\u0005H\u0002J\f\u00103\u001a\u00020\u001d*\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a*\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "context", "Lkotlin/coroutines/CoroutineContext;", com.ironsource.y8.h.b, "Ljava/io/File;", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V", "LOCK_ERROR_MESSAGE", "", "LOCK_SUFFIX", "VERSION_SUFFIX", "getFile", "()Ljava/io/File;", "inMemoryMutex", "Lkotlinx/coroutines/sync/Mutex;", "lazySharedCounter", "Lkotlin/Lazy;", "Landroidx/datastore/core/SharedCounter;", "lockFile", "getLockFile", "lockFile$delegate", "Lkotlin/Lazy;", "sharedCounter", "getSharedCounter$delegate", "(Landroidx/datastore/core/MultiProcessCoordinator;)Ljava/lang/Object;", "getSharedCounter", "()Landroidx/datastore/core/SharedCounter;", "updateNotifications", "Lkotlinx/coroutines/flow/Flow;", "", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/Flow;", "fileWithSuffix", "suffix", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "lock", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withLazyCounter", "createIfNotExists", "createParentDirectories", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiProcessCoordinator implements androidx.datastore.core.InterProcessCoordinator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.datastore.core.MultiProcessCoordinator.Companion INSTANCE = new androidx.datastore.core.MultiProcessCoordinator.Companion(null);
    private static final java.lang.String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;
    private final java.lang.String LOCK_ERROR_MESSAGE;
    private final java.lang.String LOCK_SUFFIX;
    private final java.lang.String VERSION_SUFFIX;
    private final kotlin.coroutines.CoroutineContext context;
    private final java.io.File file;
    private final kotlinx.coroutines.sync.Mutex inMemoryMutex;
    private final kotlin.Lazy<androidx.datastore.core.SharedCounter> lazySharedCounter;

    /* JADX INFO: renamed from: lockFile$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy lockFile;
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> updateNotifications;

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$lock$1, reason: invalid class name */
    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {211, 47, 48}, m = "lock", n = {"this", "block", "$this$withLock_u24default$iv", "block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "lock"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$2"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.datastore.core.MultiProcessCoordinator.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return androidx.datastore.core.MultiProcessCoordinator.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$tryLock$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 1, 1, 1}, l = {62, 87}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv", "$this$withTryLock_u24default$iv", "lock", "locked$iv"}, s = {"L$0", "Z$0", "L$0", "L$2", "Z$0"})
    static final class C02971<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C02971(kotlin.coroutines.Continuation<? super androidx.datastore.core.MultiProcessCoordinator.C02971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return androidx.datastore.core.MultiProcessCoordinator.this.tryLock(null, this);
        }
    }

    public MultiProcessCoordinator(kotlin.coroutines.CoroutineContext context, java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = androidx.datastore.core.MulticastFileObserver.INSTANCE.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.lockFile = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.io.File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lockFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.io.File invoke() throws java.io.IOException {
                androidx.datastore.core.MultiProcessCoordinator multiProcessCoordinator = this.this$0;
                java.io.File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.LOCK_SUFFIX);
                this.this$0.createIfNotExists(fileFileWithSuffix);
                return fileFileWithSuffix;
            }
        });
        this.lazySharedCounter = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.SharedCounter>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.datastore.core.SharedCounter invoke() {
                androidx.datastore.core.SharedCounter.INSTANCE.loadLib();
                androidx.datastore.core.SharedCounter.Companion companion = androidx.datastore.core.SharedCounter.INSTANCE;
                final androidx.datastore.core.MultiProcessCoordinator multiProcessCoordinator = this.this$0;
                return companion.create$datastore_core_release(new kotlin.jvm.functions.Function0<java.io.File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.io.File invoke() throws java.io.IOException {
                        androidx.datastore.core.MultiProcessCoordinator multiProcessCoordinator2 = multiProcessCoordinator;
                        java.io.File fileFileWithSuffix = multiProcessCoordinator2.fileWithSuffix(multiProcessCoordinator2.VERSION_SUFFIX);
                        multiProcessCoordinator.createIfNotExists(fileFileWithSuffix);
                        return fileFileWithSuffix;
                    }
                });
            }
        });
    }

    protected final java.io.File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[Catch: all -> 0x00df, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00df, blocks: (B:43:0x00c1, B:54:0x00db, B:57:0x00e3), top: B:82:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00db A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #8 {all -> 0x00df, blocks: (B:43:0x00c1, B:54:0x00db, B:57:0x00e3), top: B:82:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public <T> java.lang.Object lock(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) throws java.lang.Throwable {
        androidx.datastore.core.MultiProcessCoordinator.AnonymousClass1 anonymousClass1;
        ?? r11;
        java.io.FileOutputStream fileOutputStream;
        androidx.datastore.core.MultiProcessCoordinator multiProcessCoordinator;
        java.io.FileOutputStream fileOutputStream2;
        java.lang.Throwable th;
        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2;
        ?? r10;
        ?? r2;
        java.nio.channels.FileLock fileLock;
        java.nio.channels.FileLock fileLock2;
        java.lang.Object objInvoke;
        ?? r1;
        ?? r0;
        if (continuation instanceof androidx.datastore.core.MultiProcessCoordinator.AnonymousClass1) {
            anonymousClass1 = (androidx.datastore.core.MultiProcessCoordinator.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new androidx.datastore.core.MultiProcessCoordinator.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new androidx.datastore.core.MultiProcessCoordinator.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            try {
                try {
                    try {
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.sync.Mutex mutex = this.inMemoryMutex;
                            anonymousClass1.L$0 = this;
                            anonymousClass1.L$1 = function1;
                            anonymousClass1.L$2 = mutex;
                            anonymousClass1.label = 1;
                            if (mutex.lock(null, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            multiProcessCoordinator = this;
                            r11 = mutex;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    fileLock = (java.nio.channels.FileLock) anonymousClass1.L$2;
                                    java.io.Closeable closeable = (java.io.Closeable) anonymousClass1.L$1;
                                    kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$0;
                                    try {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        r0 = mutex2;
                                        r1 = closeable;
                                        if (fileLock != null) {
                                            fileLock.release();
                                        }
                                        try {
                                            kotlin.io.CloseableKt.closeFinally(r1, null);
                                            r0.unlock(null);
                                            return obj;
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            r11 = r0;
                                            r11.unlock(null);
                                            throw th;
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        if (fileLock != null) {
                                            fileLock.release();
                                        }
                                        throw th;
                                    }
                                }
                                r10 = (java.io.Closeable) anonymousClass1.L$2;
                                r2 = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$1;
                                function2 = (kotlin.jvm.functions.Function1) anonymousClass1.L$0;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    r2 = r2;
                                    r10 = r10;
                                    fileLock2 = (java.nio.channels.FileLock) obj;
                                    try {
                                        anonymousClass1.L$0 = r2;
                                        anonymousClass1.L$1 = r10;
                                        anonymousClass1.L$2 = fileLock2;
                                        anonymousClass1.label = 3;
                                        objInvoke = function2.invoke(anonymousClass1);
                                        if (objInvoke == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        r1 = r10;
                                        fileLock = fileLock2;
                                        obj = objInvoke;
                                        r0 = r2;
                                        if (fileLock != null) {
                                            fileLock.release();
                                        }
                                        kotlin.io.CloseableKt.closeFinally(r1, null);
                                        r0.unlock(null);
                                        return obj;
                                    } catch (java.lang.Throwable th4) {
                                        fileLock = fileLock2;
                                        th = th4;
                                        if (fileLock != null) {
                                            fileLock.release();
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    fileLock = null;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    throw th;
                                }
                            }
                            kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$2;
                            kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3 = (kotlin.jvm.functions.Function1) anonymousClass1.L$1;
                            multiProcessCoordinator = (androidx.datastore.core.MultiProcessCoordinator) anonymousClass1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            r11 = mutex3;
                            function1 = function3;
                        }
                        androidx.datastore.core.MultiProcessCoordinator.Companion companion = INSTANCE;
                        anonymousClass1.L$0 = function1;
                        anonymousClass1.L$1 = r11;
                        anonymousClass1.L$2 = fileOutputStream;
                        anonymousClass1.label = 2;
                        java.lang.Object exclusiveFileLockWithRetryIfDeadlock = companion.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream2, anonymousClass1);
                        if (exclusiveFileLockWithRetryIfDeadlock == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function2 = function1;
                        r10 = fileOutputStream;
                        r2 = r11;
                        obj = exclusiveFileLockWithRetryIfDeadlock;
                        fileLock2 = (java.nio.channels.FileLock) obj;
                        anonymousClass1.L$0 = r2;
                        anonymousClass1.L$1 = r10;
                        anonymousClass1.L$2 = fileLock2;
                        anonymousClass1.label = 3;
                        objInvoke = function2.invoke(anonymousClass1);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r1 = r10;
                        fileLock = fileLock2;
                        obj = objInvoke;
                        r0 = r2;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        kotlin.io.CloseableKt.closeFinally(r1, null);
                        r0.unlock(null);
                        return obj;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        fileLock = null;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                    fileOutputStream2 = fileOutputStream;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th8) {
                        kotlin.io.CloseableKt.closeFinally(fileOutputStream, th);
                        throw th8;
                    }
                }
                fileOutputStream = new java.io.FileOutputStream(multiProcessCoordinator.getLockFile());
            } catch (java.lang.Throwable th9) {
                th = th9;
                r11.unlock(null);
                throw th;
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
            r11 = anonymousClass1;
            fileOutputStream = coroutine_suspended;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f2 A[Catch: all -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x0109, blocks: (B:65:0x00f2, B:73:0x0105, B:76:0x010d), top: B:96:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:73:0x0105 A[Catch: all -> 0x0109, TRY_ENTER, TryCatch #6 {all -> 0x0109, blocks: (B:65:0x00f2, B:73:0x0105, B:76:0x010d), top: B:96:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:87:0x011e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public <T> java.lang.Object tryLock(kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) throws java.lang.Throwable {
        ?? c02971;
        java.lang.Throwable th;
        ?? r11;
        java.nio.channels.FileLock fileLock;
        java.nio.channels.FileLock fileLockTryLock;
        kotlinx.coroutines.sync.Mutex mutex;
        boolean z;
        java.io.Closeable closeable;
        kotlinx.coroutines.sync.Mutex mutex2;
        boolean z2;
        ?? r2 = function2;
        if (continuation instanceof androidx.datastore.core.MultiProcessCoordinator.C02971) {
            androidx.datastore.core.MultiProcessCoordinator.C02971 c02972 = (androidx.datastore.core.MultiProcessCoordinator.C02971) continuation;
            if ((c02972.label & Integer.MIN_VALUE) != 0) {
                c02972.label -= Integer.MIN_VALUE;
                c02971 = c02972;
            } else {
                c02971 = new androidx.datastore.core.MultiProcessCoordinator.C02971(continuation);
            }
        } else {
            c02971 = new androidx.datastore.core.MultiProcessCoordinator.C02971(continuation);
        }
        java.lang.Object objInvoke = c02971.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r5 = c02971.label;
        try {
            try {
                if (r5 != 0) {
                    if (r5 == 1) {
                        z2 = c02971.Z$0;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) c02971.L$0;
                        kotlin.ResultKt.throwOnFailure(objInvoke);
                        if (z2) {
                            mutex2.unlock(null);
                        }
                        return objInvoke;
                    }
                    if (r5 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = c02971.Z$0;
                    fileLock = (java.nio.channels.FileLock) c02971.L$2;
                    java.io.Closeable closeable2 = (java.io.Closeable) c02971.L$1;
                    mutex = (kotlinx.coroutines.sync.Mutex) c02971.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(objInvoke);
                        closeable = closeable2;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        kotlin.io.CloseableKt.closeFinally(closeable, null);
                        if (z) {
                            mutex.unlock(null);
                        }
                        return objInvoke;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                kotlin.ResultKt.throwOnFailure(objInvoke);
                kotlinx.coroutines.sync.Mutex mutex3 = this.inMemoryMutex;
                boolean zTryLock = mutex3.tryLock(null);
                try {
                    if (!zTryLock) {
                        java.lang.Boolean boolBoxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                        c02971.L$0 = mutex3;
                        c02971.Z$0 = zTryLock;
                        c02971.label = 1;
                        objInvoke = r2.invoke(boolBoxBoolean, c02971);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex2 = mutex3;
                        z2 = zTryLock;
                        if (z2) {
                            mutex2.unlock(null);
                        }
                        return objInvoke;
                    }
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(getLockFile());
                    try {
                        try {
                            try {
                                fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (java.io.IOException e) {
                                java.lang.String message = e.getMessage();
                                if (!(message != null && kotlin.text.StringsKt.startsWith$default(message, this.LOCK_ERROR_MESSAGE, false, 2, (java.lang.Object) null))) {
                                    java.lang.String message2 = e.getMessage();
                                    if (!(message2 != null && kotlin.text.StringsKt.startsWith$default(message2, DEADLOCK_ERROR_MESSAGE, false, 2, (java.lang.Object) null))) {
                                        throw e;
                                    }
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    throw th;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                java.lang.Boolean boolBoxBoolean2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(fileLockTryLock != null);
                                c02971.L$0 = mutex3;
                                c02971.L$1 = fileInputStream;
                                c02971.L$2 = fileLockTryLock;
                                c02971.Z$0 = zTryLock;
                                c02971.label = 2;
                                objInvoke = r2.invoke(boolBoxBoolean2, c02971);
                                if (objInvoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex = mutex3;
                                z = zTryLock;
                                closeable = fileInputStream;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                kotlin.io.CloseableKt.closeFinally(closeable, null);
                                if (z) {
                                    mutex.unlock(null);
                                }
                                return objInvoke;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        c02971 = mutex3;
                        r2 = zTryLock;
                        r11 = fileInputStream;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th6) {
                            kotlin.io.CloseableKt.closeFinally(r11, th);
                            throw th6;
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    c02971 = mutex3;
                    r2 = zTryLock;
                    if (r2 != 0) {
                        c02971.unlock(null);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                if (r2 != 0) {
                    c02971.unlock(null);
                }
                throw th;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            r11 = r5;
            r2 = r2;
            c02971 = c02971;
        }
    }

    private final java.io.File getLockFile() {
        return (java.io.File) this.lockFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.datastore.core.SharedCounter getSharedCounter() {
        return this.lazySharedCounter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.io.File fileWithSuffix(java.lang.String suffix) {
        return new java.io.File(this.file.getAbsolutePath() + suffix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createIfNotExists(java.io.File file) throws java.io.IOException {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    private final void createParentDirectories(java.io.File file) throws java.io.IOException {
        java.io.File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new java.io.IOException("Unable to create parent directories of " + file);
            }
        }
    }

    private final <T> java.lang.Object withLazyCounter(kotlin.jvm.functions.Function2<? super androidx.datastore.core.SharedCounter, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) throws java.lang.Throwable {
        if (this.lazySharedCounter.isInitialized()) {
            return function2.invoke(getSharedCounter(), continuation);
        }
        kotlin.coroutines.CoroutineContext coroutineContext = this.context;
        androidx.datastore.core.MultiProcessCoordinator.AnonymousClass2 anonymousClass2 = new androidx.datastore.core.MultiProcessCoordinator.AnonymousClass2(function2, this, null);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object objWithContext = kotlinx.coroutines.BuildersKt.withContext(coroutineContext, anonymousClass2, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return objWithContext;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2, reason: invalid class name */
    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", f = "MultiProcessCoordinator.android.kt", i = {}, l = {org.objectweb.asm.Opcodes.IF_ICMPGT}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<androidx.datastore.core.SharedCounter, kotlin.coroutines.Continuation<? super T>, java.lang.Object> $block;
        int label;
        final /* synthetic */ androidx.datastore.core.MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(kotlin.jvm.functions.Function2<? super androidx.datastore.core.SharedCounter, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, androidx.datastore.core.MultiProcessCoordinator multiProcessCoordinator, kotlin.coroutines.Continuation<? super androidx.datastore.core.MultiProcessCoordinator.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.this$0 = multiProcessCoordinator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.datastore.core.MultiProcessCoordinator.AnonymousClass2(this.$block, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super T> continuation) {
            return ((androidx.datastore.core.MultiProcessCoordinator.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.jvm.functions.Function2<androidx.datastore.core.SharedCounter, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function2 = this.$block;
                androidx.datastore.core.SharedCounter sharedCounter = this.this$0.getSharedCounter();
                this.label = 1;
                obj = function2.invoke(sharedCounter, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
            return this.$block.invoke(this.this$0.getSharedCounter(), this);
        }
    }

    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "()V", "DEADLOCK_ERROR_MESSAGE", "", "INITIAL_WAIT_MILLIS", "", "MAX_WAIT_MILLIS", "getExclusiveFileLockWithRetryIfDeadlock", "Ljava/nio/channels/FileLock;", "lockFileStream", "Ljava/io/FileOutputStream;", "(Ljava/io/FileOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(3:33|17|18) */
        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        
            r15 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        
            r2 = r15.getMessage();
            r7 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            if (r2 != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        
            r7 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        
            if (r7 != false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        
            r0.L$0 = r14;
            r0.J$0 = r5;
            r0.label = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(r5, r0) == r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
        
            throw r15;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0082 -> B:29:0x0085). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream fileOutputStream, kotlin.coroutines.Continuation<? super java.nio.channels.FileLock> continuation) throws java.io.IOException {
            androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
            long j;
            if (continuation instanceof androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) {
                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = (androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) continuation;
                if ((multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label & Integer.MIN_VALUE) != 0) {
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label -= Integer.MIN_VALUE;
                } else {
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = new androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(this, continuation);
                }
            } else {
                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = new androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(this, continuation);
            }
            java.lang.Object obj = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                j = androidx.datastore.core.MultiProcessCoordinator.INITIAL_WAIT_MILLIS;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.J$0;
                fileOutputStream = (java.io.FileOutputStream) multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                j *= (long) 2;
            }
            if (j <= androidx.datastore.core.MultiProcessCoordinator.MAX_WAIT_MILLIS) {
                java.nio.channels.FileLock fileLockLock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileLockLock, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                return fileLockLock;
            }
            java.nio.channels.FileLock fileLockLock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileLockLock2, "lockFileStream.getChanne…LUE, /* shared= */ false)");
            return fileLockLock2;
        }
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public java.lang.Object getVersion(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return kotlin.coroutines.jvm.internal.Boxing.boxInt(getSharedCounter().getValue());
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.context, new androidx.datastore.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public java.lang.Object incrementAndGetVersion(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return kotlin.coroutines.jvm.internal.Boxing.boxInt(getSharedCounter().incrementAndGetValue());
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.context, new androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }
}
