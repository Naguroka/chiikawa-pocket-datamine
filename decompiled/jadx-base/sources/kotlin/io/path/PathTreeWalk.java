package kotlin.io.path;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0096\u0002JB\u0010\u0018\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0!\u0012\u0004\u0012\u00020\u00190 H\u0082H¢\u0006\u0002\u0010\"R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", androidx.media3.extractor.text.ttml.TtmlNode.START, "options", "", "Lkotlin/io/path/PathWalkOption;", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)V", "followLinks", "", "getFollowLinks", "()Z", "includeDirectories", "getIncludeDirectories", "isBFS", "linkOptions", "Ljava/nio/file/LinkOption;", "getLinkOptions", "()[Ljava/nio/file/LinkOption;", "[Lkotlin/io/path/PathWalkOption;", "bfsIterator", "", "dfsIterator", "iterator", "yieldIfNeeded", "", "Lkotlin/sequences/SequenceScope;", "node", "Lkotlin/io/path/PathNode;", "entriesReader", "Lkotlin/io/path/DirectoryEntriesReader;", "entriesAction", "Lkotlin/Function1;", "", "(Lkotlin/sequences/SequenceScope;Lkotlin/io/path/PathNode;Lkotlin/io/path/DirectoryEntriesReader;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PathTreeWalk implements kotlin.sequences.Sequence<java.nio.file.Path> {
    private final kotlin.io.path.PathWalkOption[] options;
    private final java.nio.file.Path start;

    public PathTreeWalk(java.nio.file.Path start, kotlin.io.path.PathWalkOption[] options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        this.start = start;
        this.options = options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFollowLinks() {
        return kotlin.collections.ArraysKt.contains(this.options, kotlin.io.path.PathWalkOption.FOLLOW_LINKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.nio.file.LinkOption[] getLinkOptions() {
        return kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(getFollowLinks());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getIncludeDirectories() {
        return kotlin.collections.ArraysKt.contains(this.options, kotlin.io.path.PathWalkOption.INCLUDE_DIRECTORIES);
    }

    private final boolean isBFS() {
        return kotlin.collections.ArraysKt.contains(this.options, kotlin.io.path.PathWalkOption.BREADTH_FIRST);
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<java.nio.file.Path> iterator() {
        return isBFS() ? bfsIterator() : dfsIterator();
    }

    private final java.lang.Object yieldIfNeeded(kotlin.sequences.SequenceScope<? super java.nio.file.Path> sequenceScope, kotlin.io.path.PathNode pathNode, kotlin.io.path.DirectoryEntriesReader directoryEntriesReader, kotlin.jvm.functions.Function1<? super java.util.List<kotlin.io.path.PathNode>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.nio.file.FileSystemLoopException {
        java.nio.file.Path path = pathNode.getPath();
        java.nio.file.LinkOption[] linkOptions = getLinkOptions();
        java.nio.file.LinkOption[] linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions, linkOptions.length);
        if (java.nio.file.Files.isDirectory(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            if (!kotlin.io.path.PathTreeWalkKt.createsCycle(pathNode)) {
                if (getIncludeDirectories()) {
                    kotlin.jvm.internal.InlineMarker.mark(0);
                    sequenceScope.yield(path, continuation);
                    kotlin.jvm.internal.InlineMarker.mark(1);
                }
                java.nio.file.LinkOption[] linkOptions2 = getLinkOptions();
                java.nio.file.LinkOption[] linkOptionArr2 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions2, linkOptions2.length);
                if (java.nio.file.Files.isDirectory(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                    function1.invoke(directoryEntriesReader.readEntries(pathNode));
                }
            } else {
                throw new java.nio.file.FileSystemLoopException(path.toString());
            }
        } else if (java.nio.file.Files.exists(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1))) {
            kotlin.jvm.internal.InlineMarker.mark(0);
            sequenceScope.yield(path, continuation);
            kotlin.jvm.internal.InlineMarker.mark(1);
            return kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: kotlin.io.path.PathTreeWalk$dfsIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PathTreeWalk.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {org.objectweb.asm.Opcodes.INVOKESTATIC, org.objectweb.asm.Opcodes.ARRAYLENGTH, org.objectweb.asm.Opcodes.IFNONNULL, com.ironsource.g3.c.b.INSTANCE_AUCTION_SUCCESS}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    static final class C17701 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.nio.file.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;

        C17701(kotlin.coroutines.Continuation<? super kotlin.io.path.PathTreeWalk.C17701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlin.io.path.PathTreeWalk.C17701 c17701 = kotlin.io.path.PathTreeWalk.this.new C17701(continuation);
            c17701.L$0 = obj;
            return c17701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.nio.file.Path> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlin.io.path.PathTreeWalk.C17701) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0150  */
        /* JADX WARN: Code duplicated, block: B:44:0x018d  */
        /* JADX WARN: Code duplicated, block: B:46:0x0193  */
        /* JADX WARN: Code duplicated, block: B:48:0x01aa A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x01ab  */
        /* JADX WARN: Code duplicated, block: B:51:0x01c3 A[PHI: r2 r6 r9 r10 r11 r12 r13
  0x01c3: PHI (r2v14 kotlin.io.path.DirectoryEntriesReader) = (r2v11 kotlin.io.path.DirectoryEntriesReader), (r2v16 kotlin.io.path.DirectoryEntriesReader) binds: [B:45:0x0191, B:50:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r6v21 kotlin.collections.ArrayDeque) = (r6v19 kotlin.collections.ArrayDeque), (r6v23 kotlin.collections.ArrayDeque) binds: [B:45:0x0191, B:50:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r9v10 kotlin.sequences.SequenceScope) = (r9v8 kotlin.sequences.SequenceScope), (r9v12 kotlin.sequences.SequenceScope) binds: [B:45:0x0191, B:50:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r10v6 kotlin.io.path.PathTreeWalk$dfsIterator$1) = (r10v5 kotlin.io.path.PathTreeWalk$dfsIterator$1), (r10v7 kotlin.io.path.PathTreeWalk$dfsIterator$1) binds: [B:45:0x0191, B:50:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r11v30 kotlin.io.path.PathNode) = (r11v21 kotlin.io.path.PathNode), (r11v32 kotlin.io.path.PathNode) binds: [B:45:0x0191, B:50:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r12v14 kotlin.io.path.PathTreeWalk) = (r12v11 kotlin.io.path.PathTreeWalk), (r12v24 kotlin.io.path.PathTreeWalk) binds: [B:45:0x0191, B:50:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r13v8 java.nio.file.Path) = (r13v6 java.nio.file.Path), (r13v10 java.nio.file.Path) binds: [B:45:0x0191, B:50:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:53:0x01db  */
        /* JADX WARN: Code duplicated, block: B:54:0x01eb  */
        /* JADX WARN: Code duplicated, block: B:67:0x0187 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x0163 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01d9 -> B:36:0x0146). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01db -> B:36:0x0146). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 551
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk.C17701.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final java.util.Iterator<java.nio.file.Path> dfsIterator() {
        return kotlin.sequences.SequencesKt.iterator(new kotlin.io.path.PathTreeWalk.C17701(null));
    }

    /* JADX INFO: renamed from: kotlin.io.path.PathTreeWalk$bfsIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: PathTreeWalk.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {org.objectweb.asm.Opcodes.INVOKESTATIC, org.objectweb.asm.Opcodes.ARRAYLENGTH}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.nio.file.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlin.io.path.PathTreeWalk.AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlin.io.path.PathTreeWalk.AnonymousClass1 anonymousClass1 = kotlin.io.path.PathTreeWalk.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.nio.file.Path> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlin.io.path.PathTreeWalk.AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x008a  */
        /* JADX WARN: Code duplicated, block: B:17:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:19:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:21:0x00d1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:24:0x00e2 A[PHI: r1 r5 r6 r7 r8 r9 r15
  0x00e2: PHI (r1v3 kotlin.io.path.DirectoryEntriesReader) = (r1v5 kotlin.io.path.DirectoryEntriesReader), (r1v6 kotlin.io.path.DirectoryEntriesReader) binds: [B:23:0x00da, B:18:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r5v2 kotlin.collections.ArrayDeque) = (r5v4 kotlin.collections.ArrayDeque), (r5v5 kotlin.collections.ArrayDeque) binds: [B:23:0x00da, B:18:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r6v4 kotlin.sequences.SequenceScope) = (r6v6 kotlin.sequences.SequenceScope), (r6v7 kotlin.sequences.SequenceScope) binds: [B:23:0x00da, B:18:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r7v2 kotlin.io.path.PathNode) = (r7v6 kotlin.io.path.PathNode), (r7v12 kotlin.io.path.PathNode) binds: [B:23:0x00da, B:18:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r8v3 kotlin.io.path.PathTreeWalk) = (r8v11 kotlin.io.path.PathTreeWalk), (r8v12 kotlin.io.path.PathTreeWalk) binds: [B:23:0x00da, B:18:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r9v2 java.nio.file.Path) = (r9v4 java.nio.file.Path), (r9v5 java.nio.file.Path) binds: [B:23:0x00da, B:18:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r15v4 kotlin.io.path.PathTreeWalk$bfsIterator$1) = (r15v5 kotlin.io.path.PathTreeWalk$bfsIterator$1), (r15v6 kotlin.io.path.PathTreeWalk$bfsIterator$1) binds: [B:23:0x00da, B:18:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:26:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:27:0x0105  */
        /* JADX WARN: Code duplicated, block: B:29:0x010f  */
        /* JADX WARN: Code duplicated, block: B:37:0x0122 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:38:0x00ae A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:39:0x0139 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x0080 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f8 -> B:11:0x0080). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00fa -> B:11:0x0080). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x00b4
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 317
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final java.util.Iterator<java.nio.file.Path> bfsIterator() {
        return kotlin.sequences.SequencesKt.iterator(new kotlin.io.path.PathTreeWalk.AnonymousClass1(null));
    }
}
