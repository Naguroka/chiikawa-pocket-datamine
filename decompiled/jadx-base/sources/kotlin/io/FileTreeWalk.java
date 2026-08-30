package kotlin.io;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0089\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bJ \u0010\f\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", androidx.media3.extractor.text.ttml.TtmlNode.START, "direction", "Lkotlin/io/FileWalkDirection;", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "maxDepth", "", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "iterator", "", "depth", "function", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FileTreeWalk implements kotlin.sequences.Sequence<java.io.File> {
    private final kotlin.io.FileWalkDirection direction;
    private final int maxDepth;
    private final kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> onEnter;
    private final kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.Unit> onFail;
    private final kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> onLeave;
    private final java.io.File start;

    /* JADX WARN: Multi-variable type inference failed */
    private FileTreeWalk(java.io.File file, kotlin.io.FileWalkDirection fileWalkDirection, kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, kotlin.Unit> function3, int i) {
        this.start = file;
        this.direction = fileWalkDirection;
        this.onEnter = function1;
        this.onLeave = function2;
        this.onFail = function3;
        this.maxDepth = i;
    }

    /* synthetic */ FileTreeWalk(java.io.File file, kotlin.io.FileWalkDirection fileWalkDirection, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function2, kotlin.jvm.functions.Function2 function3, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? kotlin.io.FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function2, function3, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileTreeWalk(java.io.File start, kotlin.io.FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(direction, "direction");
    }

    public /* synthetic */ FileTreeWalk(java.io.File file, kotlin.io.FileWalkDirection fileWalkDirection, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? kotlin.io.FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<java.io.File> iterator() {
        return new kotlin.io.FileTreeWalk.FileTreeWalkIterator();
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "root", "Ljava/io/File;", "(Ljava/io/File;)V", "getRoot", "()Ljava/io/File;", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static abstract class WalkState {
        private final java.io.File root;

        public abstract java.io.File step();

        public WalkState(java.io.File root) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(root, "root");
            this.root = root;
        }

        public final java.io.File getRoot() {
            return this.root;
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootDir", "Ljava/io/File;", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static abstract class DirectoryState extends kotlin.io.FileTreeWalk.WalkState {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectoryState(java.io.File rootDir) {
            super(rootDir);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0082\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk;)V", "state", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class FileTreeWalkIterator extends kotlin.collections.AbstractIterator<java.io.File> {
        private final java.util.ArrayDeque<kotlin.io.FileTreeWalk.WalkState> state;

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[kotlin.io.FileWalkDirection.values().length];
                try {
                    iArr[kotlin.io.FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlin.io.FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public FileTreeWalkIterator() {
            java.util.ArrayDeque<kotlin.io.FileTreeWalk.WalkState> arrayDeque = new java.util.ArrayDeque<>();
            this.state = arrayDeque;
            if (kotlin.io.FileTreeWalk.this.start.isDirectory()) {
                arrayDeque.push(directoryState(kotlin.io.FileTreeWalk.this.start));
            } else if (kotlin.io.FileTreeWalk.this.start.isFile()) {
                arrayDeque.push(new kotlin.io.FileTreeWalk.FileTreeWalkIterator.SingleFileState(this, kotlin.io.FileTreeWalk.this.start));
            } else {
                done();
            }
        }

        @Override // kotlin.collections.AbstractIterator
        protected void computeNext() {
            java.io.File fileGotoNext = gotoNext();
            if (fileGotoNext != null) {
                setNext(fileGotoNext);
            } else {
                done();
            }
        }

        private final kotlin.io.FileTreeWalk.DirectoryState directoryState(java.io.File root) {
            int i = kotlin.io.FileTreeWalk.FileTreeWalkIterator.WhenMappings.$EnumSwitchMapping$0[kotlin.io.FileTreeWalk.this.direction.ordinal()];
            if (i == 1) {
                return new kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState(this, root);
            }
            if (i == 2) {
                return new kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState(this, root);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        private final java.io.File gotoNext() {
            while (true) {
                kotlin.io.FileTreeWalk.WalkState walkStatePeek = this.state.peek();
                if (walkStatePeek == null) {
                    return null;
                }
                java.io.File fileStep = walkStatePeek.step();
                if (fileStep == null) {
                    this.state.pop();
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(fileStep, walkStatePeek.getRoot()) || !fileStep.isDirectory() || this.state.size() >= kotlin.io.FileTreeWalk.this.maxDepth) {
                        return fileStep;
                    }
                    this.state.push(directoryState(fileStep));
                }
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", com.ironsource.y8.h.t, "", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private final class BottomUpDirectoryState extends kotlin.io.FileTreeWalk.DirectoryState {
            private boolean failed;
            private int fileIndex;
            private java.io.File[] fileList;
            private boolean rootVisited;
            final /* synthetic */ kotlin.io.FileTreeWalk.FileTreeWalkIterator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BottomUpDirectoryState(kotlin.io.FileTreeWalk.FileTreeWalkIterator fileTreeWalkIterator, java.io.File rootDir) {
                super(rootDir);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public java.io.File step() {
                if (!this.failed && this.fileList == null) {
                    kotlin.jvm.functions.Function1 function1 = kotlin.io.FileTreeWalk.this.onEnter;
                    boolean z = false;
                    if (function1 != null && !((java.lang.Boolean) function1.invoke(getRoot())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    java.io.File[] fileArrListFiles = getRoot().listFiles();
                    this.fileList = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        kotlin.jvm.functions.Function2 function2 = kotlin.io.FileTreeWalk.this.onFail;
                        if (function2 != null) {
                            function2.invoke(getRoot(), new kotlin.io.AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.failed = true;
                    }
                }
                java.io.File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i = this.fileIndex;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(fileArr);
                    if (i < fileArr.length) {
                        java.io.File[] fileArr2 = this.fileList;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(fileArr2);
                        int i2 = this.fileIndex;
                        this.fileIndex = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (this.rootVisited) {
                    kotlin.jvm.functions.Function1 function3 = kotlin.io.FileTreeWalk.this.onLeave;
                    if (function3 != null) {
                        function3.invoke(getRoot());
                    }
                    return null;
                }
                this.rootVisited = true;
                return getRoot();
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private final class TopDownDirectoryState extends kotlin.io.FileTreeWalk.DirectoryState {
            private int fileIndex;
            private java.io.File[] fileList;
            private boolean rootVisited;
            final /* synthetic */ kotlin.io.FileTreeWalk.FileTreeWalkIterator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TopDownDirectoryState(kotlin.io.FileTreeWalk.FileTreeWalkIterator fileTreeWalkIterator, java.io.File rootDir) {
                super(rootDir);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = fileTreeWalkIterator;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // kotlin.io.FileTreeWalk.WalkState
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public java.io.File step() {
                kotlin.jvm.functions.Function2 function2;
                if (!this.rootVisited) {
                    kotlin.jvm.functions.Function1 function1 = kotlin.io.FileTreeWalk.this.onEnter;
                    boolean z = false;
                    if (function1 != null && !((java.lang.Boolean) function1.invoke(getRoot())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    this.rootVisited = true;
                    return getRoot();
                }
                java.io.File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i = this.fileIndex;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(fileArr);
                    if (i >= fileArr.length) {
                        kotlin.jvm.functions.Function1 function3 = kotlin.io.FileTreeWalk.this.onLeave;
                        if (function3 != null) {
                            function3.invoke(getRoot());
                        }
                        return null;
                    }
                }
                if (this.fileList == null) {
                    java.io.File[] fileArrListFiles = getRoot().listFiles();
                    this.fileList = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = kotlin.io.FileTreeWalk.this.onFail) != null) {
                        function2.invoke(getRoot(), new kotlin.io.AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                    }
                    java.io.File[] fileArr2 = this.fileList;
                    if (fileArr2 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(fileArr2);
                    }
                    kotlin.jvm.functions.Function1 function4 = kotlin.io.FileTreeWalk.this.onLeave;
                    if (function4 != null) {
                        function4.invoke(getRoot());
                    }
                    return null;
                }
                java.io.File[] fileArr3 = this.fileList;
                kotlin.jvm.internal.Intrinsics.checkNotNull(fileArr3);
                int i2 = this.fileIndex;
                this.fileIndex = i2 + 1;
                return fileArr3[i2];
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootFile", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "visited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private final class SingleFileState extends kotlin.io.FileTreeWalk.WalkState {
            final /* synthetic */ kotlin.io.FileTreeWalk.FileTreeWalkIterator this$0;
            private boolean visited;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleFileState(kotlin.io.FileTreeWalk.FileTreeWalkIterator fileTreeWalkIterator, java.io.File rootFile) {
                super(rootFile);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.this$0 = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public java.io.File step() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return getRoot();
            }
        }
    }

    public final kotlin.io.FileTreeWalk onEnter(kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "function");
        return new kotlin.io.FileTreeWalk(this.start, this.direction, function, this.onLeave, this.onFail, this.maxDepth);
    }

    public final kotlin.io.FileTreeWalk onLeave(kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "function");
        return new kotlin.io.FileTreeWalk(this.start, this.direction, this.onEnter, function, this.onFail, this.maxDepth);
    }

    public final kotlin.io.FileTreeWalk onFail(kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, kotlin.Unit> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "function");
        return new kotlin.io.FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, function, this.maxDepth);
    }

    public final kotlin.io.FileTreeWalk maxDepth(int depth) {
        if (depth <= 0) {
            throw new java.lang.IllegalArgumentException("depth must be positive, but was " + depth + '.');
        }
        return new kotlin.io.FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, this.onFail, depth);
    }
}
