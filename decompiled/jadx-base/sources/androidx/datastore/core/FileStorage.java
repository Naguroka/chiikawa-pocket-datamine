package androidx.datastore.core;

/* JADX INFO: compiled from: FileStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000eB7\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/FileStorage;", "T", "Landroidx/datastore/core/Storage;", "serializer", "Landroidx/datastore/core/Serializer;", "coordinatorProducer", "Lkotlin/Function1;", "Ljava/io/File;", "Landroidx/datastore/core/InterProcessCoordinator;", "produceFile", "Lkotlin/Function0;", "(Landroidx/datastore/core/Serializer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "createConnection", "Landroidx/datastore/core/StorageConnection;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileStorage<T> implements androidx.datastore.core.Storage<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.datastore.core.FileStorage.Companion INSTANCE = new androidx.datastore.core.FileStorage.Companion(null);
    private static final java.util.Set<java.lang.String> activeFiles = new java.util.LinkedHashSet();
    private static final java.lang.Object activeFilesLock = new java.lang.Object();
    private final kotlin.jvm.functions.Function1<java.io.File, androidx.datastore.core.InterProcessCoordinator> coordinatorProducer;
    private final kotlin.jvm.functions.Function0<java.io.File> produceFile;
    private final androidx.datastore.core.Serializer<T> serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public FileStorage(androidx.datastore.core.Serializer<T> serializer, kotlin.jvm.functions.Function1<? super java.io.File, ? extends androidx.datastore.core.InterProcessCoordinator> coordinatorProducer, kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.produceFile = produceFile;
    }

    public /* synthetic */ FileStorage(androidx.datastore.core.Serializer serializer, androidx.datastore.core.FileStorage.AnonymousClass1 anonymousClass1, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(serializer, (i & 2) != 0 ? new kotlin.jvm.functions.Function1<java.io.File, androidx.datastore.core.InterProcessCoordinator>() { // from class: androidx.datastore.core.FileStorage.1
            @Override // kotlin.jvm.functions.Function1
            public final androidx.datastore.core.InterProcessCoordinator invoke(java.io.File it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return androidx.datastore.core.InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(it);
            }
        } : anonymousClass1, function0);
    }

    @Override // androidx.datastore.core.Storage
    public androidx.datastore.core.StorageConnection<T> createConnection() throws java.io.IOException {
        final java.io.File file = this.produceFile.invoke().getCanonicalFile();
        synchronized (activeFilesLock) {
            java.lang.String path = file.getAbsolutePath();
            java.util.Set<java.lang.String> set = activeFiles;
            if (!(!set.contains(path))) {
                throw new java.lang.IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "path");
            set.add(path);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(file, "file");
        return new androidx.datastore.core.FileStorageConnection(file, this.serializer, this.coordinatorProducer.invoke(file), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.datastore.core.FileStorage.createConnection.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                java.lang.Object activeFilesLock$datastore_core_release = androidx.datastore.core.FileStorage.INSTANCE.getActiveFilesLock$datastore_core_release();
                java.io.File file2 = file;
                synchronized (activeFilesLock$datastore_core_release) {
                    androidx.datastore.core.FileStorage.INSTANCE.getActiveFiles$datastore_core_release().remove(file2.getAbsolutePath());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        });
    }

    /* JADX INFO: compiled from: FileStorage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/datastore/core/FileStorage$Companion;", "", "()V", "activeFiles", "", "", "getActiveFiles$datastore_core_release", "()Ljava/util/Set;", "activeFilesLock", "getActiveFilesLock$datastore_core_release", "()Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.Set<java.lang.String> getActiveFiles$datastore_core_release() {
            return androidx.datastore.core.FileStorage.activeFiles;
        }

        public final java.lang.Object getActiveFilesLock$datastore_core_release() {
            return androidx.datastore.core.FileStorage.activeFilesLock;
        }
    }
}
