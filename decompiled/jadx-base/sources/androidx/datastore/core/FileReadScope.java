package androidx.datastore.core;

/* JADX INFO: compiled from: FileStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0004J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0011\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/FileReadScope;", "T", "Landroidx/datastore/core/ReadScope;", com.ironsource.y8.h.b, "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getFile", "()Ljava/io/File;", "getSerializer", "()Landroidx/datastore/core/Serializer;", "checkNotClosed", "", "close", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FileReadScope<T> implements androidx.datastore.core.ReadScope<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final java.io.File file;
    private final androidx.datastore.core.Serializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.FileReadScope$readData$1, reason: invalid class name */
    /* JADX INFO: compiled from: FileStorage.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", i = {0}, l = {org.objectweb.asm.Opcodes.RET, org.objectweb.asm.Opcodes.GETSTATIC}, m = "readData$suspendImpl", n = {"$this"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.FileReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.datastore.core.FileReadScope<T> fileReadScope, kotlin.coroutines.Continuation<? super androidx.datastore.core.FileReadScope.AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = fileReadScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return androidx.datastore.core.FileReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    @Override // androidx.datastore.core.ReadScope
    public java.lang.Object readData(kotlin.coroutines.Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }

    public FileReadScope(java.io.File file, androidx.datastore.core.Serializer<T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    protected final java.io.File getFile() {
        return this.file;
    }

    protected final androidx.datastore.core.Serializer<T> getSerializer() {
        return this.serializer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.datastore.core.FileReadScope] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v20 */
    static /* synthetic */ <T> java.lang.Object readData$suspendImpl(androidx.datastore.core.FileReadScope<T> fileReadScope, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.datastore.core.FileReadScope.AnonymousClass1 anonymousClass1;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        java.io.Closeable closeable2;
        java.lang.Throwable th2;
        if (continuation instanceof androidx.datastore.core.FileReadScope.AnonymousClass1) {
            anonymousClass1 = (androidx.datastore.core.FileReadScope.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new androidx.datastore.core.FileReadScope.AnonymousClass1(fileReadScope, continuation);
            }
        } else {
            anonymousClass1 = new androidx.datastore.core.FileReadScope.AnonymousClass1(fileReadScope, continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = anonymousClass1.label;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    closeable2 = (java.io.Closeable) anonymousClass1.L$1;
                    r2 = (androidx.datastore.core.FileReadScope) anonymousClass1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.io.CloseableKt.closeFinally(closeable2, null);
                        return obj;
                    } catch (java.lang.Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (java.lang.Throwable th4) {
                            kotlin.io.CloseableKt.closeFinally(closeable2, th2);
                            throw th4;
                        }
                    }
                }
                if (r2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (java.io.Closeable) anonymousClass1.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.io.CloseableKt.closeFinally(closeable, null);
                    return obj;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th6) {
                        kotlin.io.CloseableKt.closeFinally(closeable, th);
                        throw th6;
                    }
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            fileReadScope.checkNotClosed();
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(((androidx.datastore.core.FileReadScope) fileReadScope).file);
                try {
                    anonymousClass1.L$0 = fileReadScope;
                    anonymousClass1.L$1 = fileInputStream;
                    anonymousClass1.label = 1;
                    java.lang.Object from = ((androidx.datastore.core.FileReadScope) fileReadScope).serializer.readFrom(fileInputStream, anonymousClass1);
                    if (from == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    closeable2 = fileInputStream;
                    obj = from;
                    kotlin.io.CloseableKt.closeFinally(closeable2, null);
                    return obj;
                } catch (java.lang.Throwable th7) {
                    r2 = fileReadScope;
                    closeable2 = fileInputStream;
                    th2 = th7;
                    throw th2;
                }
            } catch (java.io.FileNotFoundException unused) {
                if (((androidx.datastore.core.FileReadScope) fileReadScope).file.exists()) {
                    java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(((androidx.datastore.core.FileReadScope) fileReadScope).file);
                    try {
                        anonymousClass1.L$0 = fileInputStream2;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 2;
                        java.lang.Object from2 = ((androidx.datastore.core.FileReadScope) fileReadScope).serializer.readFrom(fileInputStream2, anonymousClass1);
                        if (from2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = from2;
                        closeable = fileInputStream2;
                        kotlin.io.CloseableKt.closeFinally(closeable, null);
                        return obj;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        closeable = fileInputStream2;
                        throw th;
                    }
                }
                return ((androidx.datastore.core.FileReadScope) fileReadScope).serializer.getDefaultValue();
            }
        } catch (java.io.FileNotFoundException unused2) {
            fileReadScope = (androidx.datastore.core.FileReadScope<T>) r2;
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    protected final void checkNotClosed() {
        if (!(!this.closed.get())) {
            throw new java.lang.IllegalStateException("This scope has already been closed.".toString());
        }
    }
}
