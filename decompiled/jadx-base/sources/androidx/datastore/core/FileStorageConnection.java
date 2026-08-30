package androidx.datastore.core;

/* JADX INFO: compiled from: FileStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0016JX\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0001\u0010\u00162B\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0018¢\u0006\u0002\b H\u0096@¢\u0006\u0002\u0010!J=\u0010\"\u001a\u00020\u000b2-\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0#¢\u0006\u0002\b H\u0096@¢\u0006\u0002\u0010%J\f\u0010&\u001a\u00020\u000b*\u00020\u0004H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", "T", "Landroidx/datastore/core/StorageConnection;", com.ironsource.y8.h.b, "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "coordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "onClose", "Lkotlin/Function0;", "", "(Ljava/io/File;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "transactionMutex", "Lkotlinx/coroutines/sync/Mutex;", "checkNotClosed", "close", "readScope", "R", "block", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeScope", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createParentDirectories", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileStorageConnection<T> implements androidx.datastore.core.StorageConnection<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final androidx.datastore.core.InterProcessCoordinator coordinator;
    private final java.io.File file;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClose;
    private final androidx.datastore.core.Serializer<T> serializer;
    private final kotlinx.coroutines.sync.Mutex transactionMutex;

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorageConnection$readScope$1, reason: invalid class name */
    /* JADX INFO: compiled from: FileStorage.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", i = {0, 0, 0}, l = {101}, m = "readScope", n = {"this", "$this$use$iv", "lock"}, s = {"L$0", "L$1", "Z$0"})
    static final class AnonymousClass1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.FileStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.datastore.core.FileStorageConnection<T> fileStorageConnection, kotlin.coroutines.Continuation<? super androidx.datastore.core.FileStorageConnection.AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = fileStorageConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorageConnection$writeScope$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileStorage.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {214, 118}, m = "writeScope", n = {"this", "block", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "scratchFile", "$this$use$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class C02961 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.FileStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02961(androidx.datastore.core.FileStorageConnection<T> fileStorageConnection, kotlin.coroutines.Continuation<? super androidx.datastore.core.FileStorageConnection.C02961> continuation) {
            super(continuation);
            this.this$0 = fileStorageConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public FileStorageConnection(java.io.File file, androidx.datastore.core.Serializer<T> serializer, androidx.datastore.core.InterProcessCoordinator coordinator, kotlin.jvm.functions.Function0<kotlin.Unit> onClose) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    @Override // androidx.datastore.core.StorageConnection
    public androidx.datastore.core.InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: all -> 0x0096, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0096, blocks: (B:35:0x0086, B:42:0x0095, B:41:0x0092, B:38:0x008d), top: B:54:0x0023, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.FileStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.datastore.core.StorageConnection
    public <R> java.lang.Object readScope(kotlin.jvm.functions.Function3<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super R> continuation) throws java.lang.Throwable {
        ?? anonymousClass1;
        androidx.datastore.core.Closeable closeable;
        java.lang.Throwable th;
        ?? r0;
        ?? r9;
        if (continuation instanceof androidx.datastore.core.FileStorageConnection.AnonymousClass1) {
            androidx.datastore.core.FileStorageConnection.AnonymousClass1 anonymousClass2 = (androidx.datastore.core.FileStorageConnection.AnonymousClass1) continuation;
            if ((anonymousClass2.label & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label -= Integer.MIN_VALUE;
                anonymousClass1 = anonymousClass2;
            } else {
                anonymousClass1 = new androidx.datastore.core.FileStorageConnection.AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new androidx.datastore.core.FileStorageConnection.AnonymousClass1(this, continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function3 = (kotlin.jvm.functions.Function3<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object>) anonymousClass1.Z$0;
                closeable = (androidx.datastore.core.Closeable) anonymousClass1.L$1;
                anonymousClass1 = (androidx.datastore.core.FileStorageConnection) anonymousClass1.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    r0 = anonymousClass1;
                    r9 = function3;
                    try {
                        closeable.close();
                        th = null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r0.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    try {
                        closeable.close();
                    } catch (java.lang.Throwable th4) {
                        kotlin.ExceptionsKt.addSuppressed(th, th4);
                    }
                    throw th;
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            checkNotClosed();
            boolean zTryLock$default = kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(this.transactionMutex, null, 1, null);
            try {
                androidx.datastore.core.FileReadScope fileReadScope = new androidx.datastore.core.FileReadScope(this.file, this.serializer);
                try {
                    androidx.datastore.core.FileReadScope fileReadScope2 = fileReadScope;
                    java.lang.Boolean boolBoxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(zTryLock$default);
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = fileReadScope;
                    anonymousClass1.Z$0 = zTryLock$default;
                    anonymousClass1.label = 1;
                    java.lang.Object objInvoke = function3.invoke(fileReadScope2, boolBoxBoolean, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r0 = this;
                    closeable = fileReadScope;
                    obj = objInvoke;
                    r9 = zTryLock$default;
                    closeable.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r0.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (java.lang.Throwable th5) {
                    anonymousClass1 = this;
                    closeable = fileReadScope;
                    th = th5;
                    function3 = zTryLock$default;
                    closeable.close();
                    throw th;
                }
            } catch (java.lang.Throwable th6) {
                anonymousClass1 = this;
                th = th6;
                function3 = zTryLock$default;
                if (function3 != 0) {
                    kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(anonymousClass1.transactionMutex, null, 1, null);
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (function3 != 0) {
                kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(anonymousClass1.transactionMutex, null, 1, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c5 A[Catch: IOException -> 0x010f, all -> 0x011d, TRY_ENTER, TryCatch #5 {IOException -> 0x010f, blocks: (B:35:0x00c5, B:37:0x00cb, B:40:0x00d4, B:41:0x00f8, B:45:0x0101, B:52:0x010e, B:51:0x010b), top: B:73:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0101 A[Catch: IOException -> 0x010f, all -> 0x011d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x010f, blocks: (B:35:0x00c5, B:37:0x00cb, B:40:0x00d4, B:41:0x00f8, B:45:0x0101, B:52:0x010e, B:51:0x010b), top: B:73:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.core.StorageConnection
    public java.lang.Object writeScope(kotlin.jvm.functions.Function2<? super androidx.datastore.core.WriteScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.io.IOException {
        androidx.datastore.core.FileStorageConnection.C02961 c02961;
        java.io.File file;
        androidx.datastore.core.FileStorageConnection<T> fileStorageConnection;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.datastore.core.FileWriteScope fileWriteScope;
        java.lang.Throwable th;
        androidx.datastore.core.Closeable closeable;
        java.io.File file2;
        androidx.datastore.core.FileStorageConnection<T> fileStorageConnection2;
        if (continuation instanceof androidx.datastore.core.FileStorageConnection.C02961) {
            c02961 = (androidx.datastore.core.FileStorageConnection.C02961) continuation;
            if ((c02961.label & Integer.MIN_VALUE) != 0) {
                c02961.label -= Integer.MIN_VALUE;
            } else {
                c02961 = new androidx.datastore.core.FileStorageConnection.C02961(this, continuation);
            }
        } else {
            c02961 = new androidx.datastore.core.FileStorageConnection.C02961(this, continuation);
        }
        java.lang.Object obj = c02961.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c02961.label;
        try {
            try {
                try {
                    try {
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            checkNotClosed();
                            createParentDirectories(this.file);
                            kotlinx.coroutines.sync.Mutex mutex2 = this.transactionMutex;
                            c02961.L$0 = this;
                            c02961.L$1 = function2;
                            c02961.L$2 = mutex2;
                            c02961.label = 1;
                            if (mutex2.lock(null, c02961) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            fileStorageConnection = this;
                            mutex = mutex2;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                closeable = (androidx.datastore.core.Closeable) c02961.L$3;
                                java.io.File file3 = (java.io.File) c02961.L$2;
                                mutex = (kotlinx.coroutines.sync.Mutex) c02961.L$1;
                                fileStorageConnection2 = (androidx.datastore.core.FileStorageConnection) c02961.L$0;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    file2 = file3;
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    try {
                                        closeable.close();
                                        th = null;
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        if (file2.exists() && !androidx.datastore.core.FileMoves_androidKt.atomicMoveTo(file2, fileStorageConnection2.file)) {
                                            throw new java.io.IOException("Unable to rename " + file2 + " to " + fileStorageConnection2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                        mutex.unlock(null);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                    throw th;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    try {
                                        closeable.close();
                                    } catch (java.lang.Throwable th4) {
                                        kotlin.ExceptionsKt.addSuppressed(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) c02961.L$2;
                            kotlin.jvm.functions.Function2<? super androidx.datastore.core.WriteScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3 = (kotlin.jvm.functions.Function2) c02961.L$1;
                            fileStorageConnection = (androidx.datastore.core.FileStorageConnection) c02961.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex = mutex3;
                            function2 = function3;
                        }
                        c02961.L$0 = fileStorageConnection;
                        c02961.L$1 = mutex;
                        c02961.L$2 = file;
                        c02961.L$3 = fileWriteScope;
                        c02961.label = 2;
                        if (function2.invoke(fileWriteScope, c02961) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        file2 = file;
                        fileStorageConnection2 = fileStorageConnection;
                        closeable = fileWriteScope;
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        closeable.close();
                        th = null;
                        if (th == null) {
                            if (file2.exists()) {
                                throw new java.io.IOException("Unable to rename " + file2 + " to " + fileStorageConnection2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                            mutex.unlock(null);
                            return kotlin.Unit.INSTANCE;
                        }
                        throw th;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        closeable = fileWriteScope;
                        closeable.close();
                        throw th;
                    }
                    fileWriteScope = new androidx.datastore.core.FileWriteScope(file, fileStorageConnection.serializer);
                } catch (java.io.IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new java.io.File(fileStorageConnection.file.getAbsolutePath() + ".tmp");
            } catch (java.lang.Throwable th6) {
                mutex.unlock(null);
                throw th6;
            }
        } catch (java.io.IOException e2) {
            e = e2;
            file = coroutine_suspended;
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    private final void checkNotClosed() {
        if (!(!this.closed.get())) {
            throw new java.lang.IllegalStateException("StorageConnection has already been disposed.".toString());
        }
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
}
