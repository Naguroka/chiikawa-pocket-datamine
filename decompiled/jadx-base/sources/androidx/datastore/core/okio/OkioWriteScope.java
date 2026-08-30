package androidx.datastore.core.okio;

/* JADX INFO: compiled from: OkioStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", "T", "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioWriteScope<T> extends androidx.datastore.core.okio.OkioReadScope<T> implements androidx.datastore.core.WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioWriteScope$writeData$1, reason: invalid class name */
    /* JADX INFO: compiled from: OkioStorage.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", i = {0, 0, 0}, l = {216}, m = "writeData", n = {"$this$use$iv", "handle", "$this$use$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.okio.OkioWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.datastore.core.okio.OkioWriteScope<T> okioWriteScope, kotlin.coroutines.Continuation<? super androidx.datastore.core.okio.OkioWriteScope.AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = okioWriteScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(okio.FileSystem fileSystem, okio.Path path, androidx.datastore.core.okio.OkioSerializer<T> serializer) {
        super(fileSystem, path, serializer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.datastore.core.WriteScope
    public java.lang.Object writeData(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        androidx.datastore.core.okio.OkioWriteScope.AnonymousClass1 anonymousClass1;
        okio.FileHandle fileHandleOpenReadWrite;
        java.io.Closeable closeable;
        java.lang.Throwable th;
        java.io.Closeable closeable2;
        okio.FileHandle fileHandle;
        kotlin.Unit unit;
        java.lang.Throwable th2;
        kotlin.Unit unit2;
        if (continuation instanceof androidx.datastore.core.okio.OkioWriteScope.AnonymousClass1) {
            anonymousClass1 = (androidx.datastore.core.okio.OkioWriteScope.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new androidx.datastore.core.okio.OkioWriteScope.AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new androidx.datastore.core.okio.OkioWriteScope.AnonymousClass1(this, continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        java.lang.Throwable th3 = null;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            checkClose();
            fileHandleOpenReadWrite = getFileSystem().openReadWrite(getPath());
            try {
                okio.FileHandle fileHandle2 = fileHandleOpenReadWrite;
                okio.BufferedSink bufferedSinkBuffer = okio.Okio.buffer(okio.FileHandle.sink$default(fileHandle2, 0L, 1, null));
                try {
                    androidx.datastore.core.okio.OkioSerializer<T> serializer = getSerializer();
                    anonymousClass1.L$0 = fileHandleOpenReadWrite;
                    anonymousClass1.L$1 = fileHandle2;
                    anonymousClass1.L$2 = bufferedSinkBuffer;
                    anonymousClass1.label = 1;
                    if (serializer.writeTo(t, bufferedSinkBuffer, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    closeable = fileHandleOpenReadWrite;
                    fileHandle = fileHandle2;
                    closeable2 = bufferedSinkBuffer;
                } catch (java.lang.Throwable th4) {
                    closeable = fileHandleOpenReadWrite;
                    th = th4;
                    closeable2 = bufferedSinkBuffer;
                    if (closeable2 != null) {
                        closeable2.close();
                    }
                    th2 = th;
                    unit2 = null;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                if (fileHandleOpenReadWrite != null) {
                    fileHandleOpenReadWrite.close();
                }
                th3 = th;
                unit = null;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable2 = (java.io.Closeable) anonymousClass1.L$2;
            fileHandle = (okio.FileHandle) anonymousClass1.L$1;
            closeable = (java.io.Closeable) anonymousClass1.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (closeable2 != null) {
                    try {
                        try {
                            closeable2.close();
                        } catch (java.lang.Throwable th7) {
                            kotlin.ExceptionsKt.addSuppressed(th, th7);
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        fileHandleOpenReadWrite = closeable;
                        if (fileHandleOpenReadWrite != null) {
                            try {
                                fileHandleOpenReadWrite.close();
                            } catch (java.lang.Throwable th9) {
                                kotlin.ExceptionsKt.addSuppressed(th, th9);
                            }
                        }
                        th3 = th;
                        unit = null;
                    }
                }
                th2 = th;
                unit2 = null;
            }
        }
        fileHandle.flush();
        unit2 = kotlin.Unit.INSTANCE;
        if (closeable2 != null) {
            try {
                closeable2.close();
            } catch (java.lang.Throwable th10) {
                th2 = th10;
            }
        }
        th2 = null;
        if (th2 != null) {
            throw th2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(unit2);
        unit = kotlin.Unit.INSTANCE;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Throwable th11) {
                th3 = th11;
            }
        }
        if (th3 != null) {
            throw th3;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(unit);
        return kotlin.Unit.INSTANCE;
    }
}
