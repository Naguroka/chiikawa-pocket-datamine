package androidx.datastore.core.okio;

/* JADX INFO: compiled from: OkioStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0016JX\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0001\u0010\u00182B\u0010\u0019\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001a¢\u0006\u0002\b\"H\u0096@¢\u0006\u0002\u0010#J=\u0010$\u001a\u00020\r2-\u0010\u0019\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0 \u0012\u0006\u0012\u0004\u0018\u00010!0%¢\u0006\u0002\b\"H\u0096@¢\u0006\u0002\u0010'R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", "T", "Landroidx/datastore/core/StorageConnection;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "coordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "onClose", "Lkotlin/Function0;", "", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "transactionMutex", "Lkotlinx/coroutines/sync/Mutex;", "checkNotClosed", "close", "readScope", "R", "block", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeScope", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioStorageConnection<T> implements androidx.datastore.core.StorageConnection<T> {
    private final androidx.datastore.core.okio.AtomicBoolean closed;
    private final androidx.datastore.core.InterProcessCoordinator coordinator;
    private final okio.FileSystem fileSystem;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClose;
    private final okio.Path path;
    private final androidx.datastore.core.okio.OkioSerializer<T> serializer;
    private final kotlinx.coroutines.sync.Mutex transactionMutex;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorageConnection$readScope$1, reason: invalid class name */
    /* JADX INFO: compiled from: OkioStorage.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", i = {0, 0, 0}, l = {113}, m = "readScope", n = {"this", "$this$use$iv", "lock"}, s = {"L$0", "L$1", "Z$0"})
    static final class AnonymousClass1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.okio.OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.datastore.core.okio.OkioStorageConnection<T> okioStorageConnection, kotlin.coroutines.Continuation<? super androidx.datastore.core.okio.OkioStorageConnection.AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = okioStorageConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorageConnection$writeScope$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: OkioStorage.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {236, org.objectweb.asm.Opcodes.L2F}, m = "writeScope", n = {"this", "block", "parentDir", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "scratchPath", "$this$use$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class C03001 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.okio.OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03001(androidx.datastore.core.okio.OkioStorageConnection<T> okioStorageConnection, kotlin.coroutines.Continuation<? super androidx.datastore.core.okio.OkioStorageConnection.C03001> continuation) {
            super(continuation);
            this.this$0 = okioStorageConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public OkioStorageConnection(okio.FileSystem fileSystem, okio.Path path, androidx.datastore.core.okio.OkioSerializer<T> serializer, androidx.datastore.core.InterProcessCoordinator coordinator, kotlin.jvm.functions.Function0<kotlin.Unit> onClose) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new androidx.datastore.core.okio.AtomicBoolean(false);
        this.transactionMutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    @Override // androidx.datastore.core.StorageConnection
    public androidx.datastore.core.InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[Catch: all -> 0x0098, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0098, blocks: (B:35:0x0088, B:42:0x0097, B:41:0x0094, B:38:0x008f), top: B:54:0x0023, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // androidx.datastore.core.StorageConnection
    public <R> java.lang.Object readScope(kotlin.jvm.functions.Function3<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super R> continuation) throws java.lang.Throwable {
        ?? anonymousClass1;
        androidx.datastore.core.Closeable closeable;
        java.lang.Throwable th;
        ?? r0;
        ?? r10;
        if (continuation instanceof androidx.datastore.core.okio.OkioStorageConnection.AnonymousClass1) {
            androidx.datastore.core.okio.OkioStorageConnection.AnonymousClass1 anonymousClass2 = (androidx.datastore.core.okio.OkioStorageConnection.AnonymousClass1) continuation;
            if ((anonymousClass2.label & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label -= Integer.MIN_VALUE;
                anonymousClass1 = anonymousClass2;
            } else {
                anonymousClass1 = new androidx.datastore.core.okio.OkioStorageConnection.AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new androidx.datastore.core.okio.OkioStorageConnection.AnonymousClass1(this, continuation);
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
                anonymousClass1 = (androidx.datastore.core.okio.OkioStorageConnection) anonymousClass1.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    r0 = anonymousClass1;
                    r10 = function3;
                    try {
                        closeable.close();
                        th = null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
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
                androidx.datastore.core.okio.OkioReadScope okioReadScope = new androidx.datastore.core.okio.OkioReadScope(this.fileSystem, this.path, this.serializer);
                try {
                    androidx.datastore.core.okio.OkioReadScope okioReadScope2 = okioReadScope;
                    java.lang.Boolean boolBoxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(zTryLock$default);
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = okioReadScope;
                    anonymousClass1.Z$0 = zTryLock$default;
                    anonymousClass1.label = 1;
                    java.lang.Object objInvoke = function3.invoke(okioReadScope2, boolBoxBoolean, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r0 = this;
                    closeable = okioReadScope;
                    obj = objInvoke;
                    r10 = zTryLock$default;
                    closeable.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r0.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (java.lang.Throwable th5) {
                    anonymousClass1 = this;
                    closeable = okioReadScope;
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

    /* JADX WARN: Code duplicated, block: B:37:0x00d7 A[Catch: all -> 0x00fe, IOException -> 0x0101, TRY_ENTER, TryCatch #5 {IOException -> 0x0101, blocks: (B:37:0x00d7, B:39:0x00df, B:43:0x00ee, B:50:0x00fd, B:49:0x00fa), top: B:76:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00df A[Catch: all -> 0x00fe, IOException -> 0x0101, TRY_LEAVE, TryCatch #5 {IOException -> 0x0101, blocks: (B:37:0x00d7, B:39:0x00df, B:43:0x00ee, B:50:0x00fd, B:49:0x00fa), top: B:76:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee A[Catch: all -> 0x00fe, IOException -> 0x0101, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x0101, blocks: (B:37:0x00d7, B:39:0x00df, B:43:0x00ee, B:50:0x00fd, B:49:0x00fa), top: B:76:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r0v5, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r10v19, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r10v23, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, okio.Path] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v6, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.datastore.core.okio.OkioStorageConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
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
    @Override // androidx.datastore.core.StorageConnection
    public java.lang.Object writeScope(kotlin.jvm.functions.Function2<? super androidx.datastore.core.WriteScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        androidx.datastore.core.okio.OkioStorageConnection.C03001 c03001;
        ?? r11;
        ?? r7;
        ?? Resolve;
        okio.Path pathParent;
        androidx.datastore.core.okio.OkioWriteScope okioWriteScope;
        java.lang.Throwable th;
        androidx.datastore.core.Closeable closeable;
        ?? r1;
        ?? r0;
        ?? r2;
        if (continuation instanceof androidx.datastore.core.okio.OkioStorageConnection.C03001) {
            c03001 = (androidx.datastore.core.okio.OkioStorageConnection.C03001) continuation;
            if ((c03001.label & Integer.MIN_VALUE) != 0) {
                c03001.label -= Integer.MIN_VALUE;
            } else {
                c03001 = new androidx.datastore.core.okio.OkioStorageConnection.C03001(this, continuation);
            }
        } else {
            c03001 = new androidx.datastore.core.okio.OkioStorageConnection.C03001(this, continuation);
        }
        java.lang.Object obj = c03001.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r3 = c03001.label;
        try {
            try {
                try {
                    try {
                        try {
                            if (r3 == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                checkNotClosed();
                                pathParent = this.path.parent();
                                if (pathParent == null) {
                                    throw new java.lang.IllegalStateException("must have a parent path".toString());
                                }
                                this.fileSystem.createDirectories(pathParent, false);
                                kotlinx.coroutines.sync.Mutex mutex = this.transactionMutex;
                                c03001.L$0 = this;
                                c03001.L$1 = function2;
                                c03001.L$2 = pathParent;
                                c03001.L$3 = mutex;
                                c03001.label = 1;
                                if (mutex.lock(null, c03001) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r7 = this;
                                r11 = mutex;
                            } else {
                                if (r3 != 1) {
                                    if (r3 != 2) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    closeable = (androidx.datastore.core.Closeable) c03001.L$3;
                                    okio.Path path = (okio.Path) c03001.L$2;
                                    kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) c03001.L$1;
                                    androidx.datastore.core.okio.OkioStorageConnection okioStorageConnection = (androidx.datastore.core.okio.OkioStorageConnection) c03001.L$0;
                                    try {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        r0 = okioStorageConnection;
                                        r1 = path;
                                        r2 = mutex2;
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        try {
                                            closeable.close();
                                            th = null;
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            if (r0.fileSystem.exists(r1)) {
                                                r0.fileSystem.atomicMove(r1, r0.path);
                                            }
                                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                            r2.unlock(null);
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
                                kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) c03001.L$3;
                                pathParent = (okio.Path) c03001.L$2;
                                kotlin.jvm.functions.Function2<? super androidx.datastore.core.WriteScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3 = (kotlin.jvm.functions.Function2) c03001.L$1;
                                androidx.datastore.core.okio.OkioStorageConnection okioStorageConnection2 = (androidx.datastore.core.okio.OkioStorageConnection) c03001.L$0;
                                kotlin.ResultKt.throwOnFailure(obj);
                                r11 = mutex3;
                                function2 = function3;
                                r7 = okioStorageConnection2;
                            }
                            c03001.L$0 = r7;
                            c03001.L$1 = r11;
                            c03001.L$2 = Resolve;
                            c03001.L$3 = okioWriteScope;
                            c03001.label = 2;
                            if (function2.invoke(okioWriteScope, c03001) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r1 = Resolve;
                            closeable = okioWriteScope;
                            r0 = r7;
                            r2 = r11;
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            closeable.close();
                            th = null;
                            if (th == null) {
                                if (r0.fileSystem.exists(r1)) {
                                    r0.fileSystem.atomicMove(r1, r0.path);
                                }
                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                r2.unlock(null);
                                return kotlin.Unit.INSTANCE;
                            }
                            throw th;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            closeable = okioWriteScope;
                            closeable.close();
                            throw th;
                        }
                        r7.fileSystem.delete(Resolve, false);
                        okioWriteScope = new androidx.datastore.core.okio.OkioWriteScope(r7.fileSystem, Resolve, r7.serializer);
                    } catch (java.io.IOException e) {
                        e = e;
                        if (r7.fileSystem.exists(Resolve)) {
                            try {
                                r7.fileSystem.delete(Resolve);
                            } catch (java.io.IOException unused) {
                            }
                        }
                        throw e;
                    }
                    Resolve = pathParent.resolve(r7.path.name() + ".tmp");
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    r11.unlock(null);
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
                r7 = c03001;
                r11 = r3;
                Resolve = coroutine_suspended;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            r11 = r3;
            r11.unlock(null);
            throw th;
        }
    }

    private final void checkNotClosed() {
        if (!(!this.closed.get())) {
            throw new java.lang.IllegalStateException("StorageConnection has already been disposed.".toString());
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }
}
