package androidx.datastore.core.okio;

/* JADX INFO: compiled from: OkioStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0004J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", "T", "Landroidx/datastore/core/ReadScope;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "getFileSystem", "()Lokio/FileSystem;", "getPath", "()Lokio/Path;", "getSerializer", "()Landroidx/datastore/core/okio/OkioSerializer;", "checkClose", "", "close", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class OkioReadScope<T> implements androidx.datastore.core.ReadScope<T> {
    private final androidx.datastore.core.okio.AtomicBoolean closed;
    private final okio.FileSystem fileSystem;
    private final okio.Path path;
    private final androidx.datastore.core.okio.OkioSerializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioReadScope$readData$1, reason: invalid class name */
    /* JADX INFO: compiled from: OkioStorage.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", i = {0, 0, 1}, l = {org.objectweb.asm.Opcodes.GETFIELD, org.objectweb.asm.Opcodes.NEW}, m = "readData$suspendImpl", n = {"$this", "$this$use$iv$iv", "$this$use$iv$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.okio.OkioReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.datastore.core.okio.OkioReadScope<T> okioReadScope, kotlin.coroutines.Continuation<? super androidx.datastore.core.okio.OkioReadScope.AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = okioReadScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return androidx.datastore.core.okio.OkioReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    @Override // androidx.datastore.core.ReadScope
    public java.lang.Object readData(kotlin.coroutines.Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }

    public OkioReadScope(okio.FileSystem fileSystem, okio.Path path, androidx.datastore.core.okio.OkioSerializer<T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.closed = new androidx.datastore.core.okio.AtomicBoolean(false);
    }

    protected final okio.FileSystem getFileSystem() {
        return this.fileSystem;
    }

    protected final okio.Path getPath() {
        return this.path;
    }

    protected final androidx.datastore.core.okio.OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.datastore.core.okio.OkioReadScope] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v27 */
    static /* synthetic */ <T> java.lang.Object readData$suspendImpl(androidx.datastore.core.okio.OkioReadScope<T> okioReadScope, kotlin.coroutines.Continuation<? super T> continuation) throws java.lang.Throwable {
        androidx.datastore.core.okio.OkioReadScope.AnonymousClass1 anonymousClass1;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        java.io.Closeable closeable2;
        java.lang.Throwable th2;
        java.lang.Throwable th3;
        if (continuation instanceof androidx.datastore.core.okio.OkioReadScope.AnonymousClass1) {
            anonymousClass1 = (androidx.datastore.core.okio.OkioReadScope.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new androidx.datastore.core.okio.OkioReadScope.AnonymousClass1(okioReadScope, continuation);
            }
        } else {
            anonymousClass1 = new androidx.datastore.core.okio.OkioReadScope.AnonymousClass1(okioReadScope, continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = anonymousClass1.label;
        java.lang.Throwable th4 = null;
        try {
            if (r2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                okioReadScope.checkClose();
                try {
                    okio.BufferedSource bufferedSourceBuffer = okio.Okio.buffer(((androidx.datastore.core.okio.OkioReadScope) okioReadScope).fileSystem.source(((androidx.datastore.core.okio.OkioReadScope) okioReadScope).path));
                    try {
                        androidx.datastore.core.okio.OkioSerializer<T> okioSerializer = ((androidx.datastore.core.okio.OkioReadScope) okioReadScope).serializer;
                        anonymousClass1.L$0 = okioReadScope;
                        anonymousClass1.L$1 = bufferedSourceBuffer;
                        anonymousClass1.label = 1;
                        java.lang.Object from = okioSerializer.readFrom(bufferedSourceBuffer, anonymousClass1);
                        if (from == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        closeable2 = bufferedSourceBuffer;
                        obj = from;
                        if (closeable2 != null) {
                            closeable2.close();
                        }
                        th3 = null;
                    } catch (java.lang.Throwable th5) {
                        r2 = okioReadScope;
                        closeable2 = bufferedSourceBuffer;
                        th2 = th5;
                        if (closeable2 != null) {
                            closeable2.close();
                        }
                        th3 = th2;
                        obj = null;
                    }
                } catch (java.io.FileNotFoundException unused) {
                    if (!((androidx.datastore.core.okio.OkioReadScope) okioReadScope).fileSystem.exists(((androidx.datastore.core.okio.OkioReadScope) okioReadScope).path)) {
                        return ((androidx.datastore.core.okio.OkioReadScope) okioReadScope).serializer.getDefaultValue();
                    }
                    okio.BufferedSource bufferedSourceBuffer2 = okio.Okio.buffer(((androidx.datastore.core.okio.OkioReadScope) okioReadScope).fileSystem.source(((androidx.datastore.core.okio.OkioReadScope) okioReadScope).path));
                    try {
                        androidx.datastore.core.okio.OkioSerializer<T> okioSerializer2 = ((androidx.datastore.core.okio.OkioReadScope) okioReadScope).serializer;
                        anonymousClass1.L$0 = bufferedSourceBuffer2;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 2;
                        java.lang.Object from2 = okioSerializer2.readFrom(bufferedSourceBuffer2, anonymousClass1);
                        if (from2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = from2;
                        closeable = bufferedSourceBuffer2;
                        if (closeable != null) {
                            closeable.close();
                        }
                        if (th4 == null) {
                            throw th4;
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                        return obj;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        closeable = bufferedSourceBuffer2;
                        if (closeable != null) {
                            closeable.close();
                        }
                        th4 = th;
                        obj = null;
                    }
                }
            } else {
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (java.io.Closeable) anonymousClass1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (java.lang.Throwable th7) {
                                th4 = th7;
                            }
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (java.lang.Throwable th9) {
                                kotlin.ExceptionsKt.addSuppressed(th, th9);
                            }
                        }
                        th4 = th;
                        obj = null;
                    }
                    if (th4 == null) {
                        throw th4;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                    return obj;
                }
                closeable2 = (java.io.Closeable) anonymousClass1.L$1;
                r2 = (androidx.datastore.core.okio.OkioReadScope) anonymousClass1.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (closeable2 != null) {
                        try {
                            closeable2.close();
                        } catch (java.lang.Throwable th10) {
                            th3 = th10;
                        }
                    }
                    th3 = null;
                } catch (java.lang.Throwable th11) {
                    th2 = th11;
                    if (closeable2 != null) {
                        try {
                            closeable2.close();
                        } catch (java.lang.Throwable th12) {
                            kotlin.ExceptionsKt.addSuppressed(th2, th12);
                        }
                    }
                    th3 = th2;
                    obj = null;
                }
            }
            if (th3 != null) {
                throw th3;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
            return obj;
        } catch (java.io.FileNotFoundException unused2) {
            okioReadScope = (androidx.datastore.core.okio.OkioReadScope<T>) r2;
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    protected final void checkClose() {
        if (!(!this.closed.get())) {
            throw new java.lang.IllegalStateException("This scope has already been closed.".toString());
        }
    }
}
