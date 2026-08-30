package okio.internal;

/* JADX INFO: renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"collectRecursively", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "stack", "Lkotlin/collections/ArrayDeque;", "path", "followSymlinks", "", "postorder", "(Lkotlin/sequences/SequenceScope;Lokio/FileSystem;Lkotlin/collections/ArrayDeque;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commonCopy", "source", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "commonCreateDirectories", "dir", "mustCreate", "commonDeleteRecursively", "fileOrDirectory", "mustExist", "commonExists", "commonListRecursively", "Lkotlin/sequences/Sequence;", "commonMetadata", "Lokio/FileMetadata;", "symlinkTarget", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FileSystem {

    /* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    /* JADX INFO: compiled from: FileSystem.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {116, 135, org.objectweb.asm.Opcodes.I2B}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super okio.internal.FileSystem.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return okio.internal.FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    public static final okio.FileMetadata commonMetadata(okio.FileSystem fileSystem, okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        okio.FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new java.io.FileNotFoundException("no such file: " + path);
    }

    public static final boolean commonExists(okio.FileSystem fileSystem, okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final void commonCreateDirectories(okio.FileSystem fileSystem, okio.Path dir, boolean z) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        kotlin.collections.ArrayDeque arrayDeque = new kotlin.collections.ArrayDeque();
        for (okio.Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            arrayDeque.addFirst(pathParent);
        }
        if (z && arrayDeque.isEmpty()) {
            throw new java.io.IOException(dir + " already exists.");
        }
        java.util.Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((okio.Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(okio.FileSystem fileSystem, okio.Path fileOrDirectory, boolean z) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        java.util.Iterator it = kotlin.sequences.SequencesKt.sequence(new okio.internal.FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((okio.Path) it.next(), z && !it.hasNext());
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileSystem.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
    static final class C18731 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super okio.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ okio.Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C18731(okio.Path path, okio.FileSystem fileSystem, boolean z, kotlin.coroutines.Continuation<? super okio.internal.FileSystem.C18731> continuation) {
            super(2, continuation);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            okio.internal.FileSystem.C18731 c18731 = new okio.internal.FileSystem.C18731(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, continuation);
            c18731.L$0 = obj;
            return c18731;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super okio.Path> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((okio.internal.FileSystem.C18731) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.sequences.SequenceScope sequenceScope;
            kotlin.collections.ArrayDeque arrayDeque;
            java.util.Iterator<okio.Path> it;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.L$0;
                kotlin.collections.ArrayDeque arrayDeque2 = new kotlin.collections.ArrayDeque();
                arrayDeque2.addLast(this.$dir);
                sequenceScope = sequenceScope2;
                arrayDeque = arrayDeque2;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) this.L$2;
                kotlin.collections.ArrayDeque arrayDeque3 = (kotlin.collections.ArrayDeque) this.L$1;
                kotlin.sequences.SequenceScope sequenceScope3 = (kotlin.sequences.SequenceScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                arrayDeque = arrayDeque3;
                sequenceScope = sequenceScope3;
            }
            while (it.hasNext()) {
                okio.Path next = it.next();
                this.L$0 = sequenceScope;
                this.L$1 = arrayDeque;
                this.L$2 = it;
                this.label = 1;
                if (okio.internal.FileSystem.collectRecursively(sequenceScope, this.$this_commonListRecursively, arrayDeque, next, this.$followSymlinks, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final kotlin.sequences.Sequence<okio.Path> commonListRecursively(okio.FileSystem fileSystem, okio.Path dir, boolean z) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        return kotlin.sequences.SequencesKt.sequence(new okio.internal.FileSystem.C18731(dir, fileSystem, z, null));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00fb A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:17:0x005a, B:48:0x00f5, B:50:0x00fb, B:54:0x0106), top: B:73:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0151 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:76:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:48:0x00f5->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [kotlin.sequences.SequenceScope] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, kotlin.sequences.SequenceScope, kotlin.sequences.SequenceScope<? super okio.Path>] */
    /* JADX WARN: Type inference failed for: r17v1, types: [kotlin.sequences.SequenceScope] */
    public static final java.lang.Object collectRecursively(kotlin.sequences.SequenceScope<? super okio.Path> sequenceScope, okio.FileSystem fileSystem, kotlin.collections.ArrayDeque<okio.Path> arrayDeque, okio.Path path, boolean z, boolean z2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        okio.internal.FileSystem.AnonymousClass1 anonymousClass1;
        okio.FileSystem fileSystem2;
        kotlin.collections.ArrayDeque<okio.Path> arrayDeque2;
        boolean z3;
        ?? r12;
        boolean z4;
        okio.FileSystem fileSystem3;
        kotlin.collections.ArrayDeque<okio.Path> arrayDeque3;
        ?? r13;
        okio.FileSystem fileSystem4;
        okio.Path path2;
        boolean z5;
        boolean z6;
        java.util.Iterator<okio.Path> it;
        okio.Path next;
        boolean z7;
        okio.Path path3 = path;
        boolean z8 = z2;
        if (continuation instanceof okio.internal.FileSystem.AnonymousClass1) {
            anonymousClass1 = (okio.internal.FileSystem.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new okio.internal.FileSystem.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new okio.internal.FileSystem.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (z8) {
                fileSystem2 = fileSystem;
                arrayDeque2 = arrayDeque;
                z3 = z;
            } else {
                anonymousClass1.L$0 = sequenceScope;
                fileSystem2 = fileSystem;
                anonymousClass1.L$1 = fileSystem2;
                arrayDeque2 = arrayDeque;
                anonymousClass1.L$2 = arrayDeque2;
                anonymousClass1.L$3 = path3;
                z3 = z;
                anonymousClass1.Z$0 = z3;
                anonymousClass1.Z$1 = z8;
                anonymousClass1.label = 1;
                if (sequenceScope.yield(path3, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            r12 = sequenceScope;
            z4 = z3;
            fileSystem3 = fileSystem2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    z6 = anonymousClass1.Z$1;
                    z5 = anonymousClass1.Z$0;
                    it = (java.util.Iterator) anonymousClass1.L$4;
                    path2 = (okio.Path) anonymousClass1.L$3;
                    arrayDeque3 = (kotlin.collections.ArrayDeque) anonymousClass1.L$2;
                    fileSystem4 = (okio.FileSystem) anonymousClass1.L$1;
                    kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) anonymousClass1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        r13 = sequenceScope2;
                        while (it.hasNext()) {
                            next = it.next();
                            if (z6) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            anonymousClass1.L$0 = r13;
                            anonymousClass1.L$1 = fileSystem4;
                            anonymousClass1.L$2 = arrayDeque3;
                            anonymousClass1.L$3 = path2;
                            anonymousClass1.L$4 = it;
                            anonymousClass1.Z$0 = z5;
                            anonymousClass1.Z$1 = z6;
                            anonymousClass1.label = 2;
                            if (collectRecursively(r13, fileSystem4, arrayDeque3, next, z5, z7, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        arrayDeque3.removeLast();
                        z8 = z6;
                        path3 = path2;
                        r12 = r13;
                        if (z8) {
                            return kotlin.Unit.INSTANCE;
                        }
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.label = 3;
                        if (r12.yield(path3, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        arrayDeque3.removeLast();
                        throw th;
                    }
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
            boolean z9 = anonymousClass1.Z$1;
            boolean z10 = anonymousClass1.Z$0;
            okio.Path path4 = (okio.Path) anonymousClass1.L$3;
            arrayDeque2 = (kotlin.collections.ArrayDeque) anonymousClass1.L$2;
            fileSystem3 = (okio.FileSystem) anonymousClass1.L$1;
            kotlin.sequences.SequenceScope sequenceScope3 = (kotlin.sequences.SequenceScope) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            z8 = z9;
            z4 = z10;
            path3 = path4;
            r12 = sequenceScope3;
        }
        java.util.List<okio.Path> listListOrNull = fileSystem3.listOrNull(path3);
        if (listListOrNull == null) {
            listListOrNull = kotlin.collections.CollectionsKt.emptyList();
        }
        if (!listListOrNull.isEmpty()) {
            okio.Path path5 = path3;
            int i2 = 0;
            while (true) {
                if (z4 && arrayDeque2.contains(path5)) {
                    throw new java.io.IOException("symlink cycle at " + path3);
                }
                okio.Path pathSymlinkTarget = symlinkTarget(fileSystem3, path5);
                if (pathSymlinkTarget != null) {
                    i2++;
                    path5 = pathSymlinkTarget;
                } else if (z4 || i2 == 0) {
                    arrayDeque2.addLast(path5);
                    try {
                        r13 = r12;
                        fileSystem4 = fileSystem3;
                        arrayDeque3 = arrayDeque2;
                        path2 = path3;
                        z5 = z4;
                        z6 = z8;
                        it = listListOrNull.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            if (z6) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            anonymousClass1.L$0 = r13;
                            anonymousClass1.L$1 = fileSystem4;
                            anonymousClass1.L$2 = arrayDeque3;
                            anonymousClass1.L$3 = path2;
                            anonymousClass1.L$4 = it;
                            anonymousClass1.Z$0 = z5;
                            anonymousClass1.Z$1 = z6;
                            anonymousClass1.label = 2;
                            if (collectRecursively(r13, fileSystem4, arrayDeque3, next, z5, z7, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        arrayDeque3.removeLast();
                        z8 = z6;
                        path3 = path2;
                        r12 = r13;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        arrayDeque3 = arrayDeque2;
                        arrayDeque3.removeLast();
                        throw th;
                    }
                }
            }
        }
        if (z8) {
            return kotlin.Unit.INSTANCE;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.label = 3;
        if (r12.yield(path3, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final okio.Path symlinkTarget(okio.FileSystem fileSystem, okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        okio.Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        okio.Path pathParent = path.parent();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pathParent);
        return pathParent.resolve(symlinkTarget);
    }

    public static final void commonCopy(okio.FileSystem fileSystem, okio.Path source, okio.Path target) throws java.io.IOException {
        java.lang.Long lValueOf;
        java.lang.Throwable th;
        java.lang.Long lValueOf2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        okio.Source source2 = fileSystem.source(source);
        java.lang.Throwable th2 = null;
        try {
            okio.Source source3 = source2;
            okio.BufferedSink bufferedSinkBuffer = okio.Okio.buffer(fileSystem.sink(target));
            try {
                lValueOf2 = java.lang.Long.valueOf(bufferedSinkBuffer.writeAll(source3));
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                }
                th = null;
            } catch (java.lang.Throwable th4) {
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (java.lang.Throwable th5) {
                        kotlin.ExceptionsKt.addSuppressed(th4, th5);
                    }
                }
                th = th4;
                lValueOf2 = null;
            }
            if (th != null) {
                throw th;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(lValueOf2);
            lValueOf = java.lang.Long.valueOf(lValueOf2.longValue());
            if (source2 != null) {
                try {
                    source2.close();
                } catch (java.lang.Throwable th6) {
                    th2 = th6;
                }
            }
            if (th2 != null) {
                throw th2;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(lValueOf);
        } catch (java.lang.Throwable th7) {
            if (source2 != null) {
                try {
                    source2.close();
                } catch (java.lang.Throwable th8) {
                    kotlin.ExceptionsKt.addSuppressed(th7, th8);
                }
            }
            th2 = th7;
            lValueOf = null;
        }
    }
}
