package androidx.datastore.core.okio;

/* JADX INFO: compiled from: OkioStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0015BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage;", "T", "Landroidx/datastore/core/Storage;", "fileSystem", "Lokio/FileSystem;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "coordinatorProducer", "Lkotlin/Function2;", "Lokio/Path;", "Landroidx/datastore/core/InterProcessCoordinator;", "producePath", "Lkotlin/Function0;", "(Lokio/FileSystem;Landroidx/datastore/core/okio/OkioSerializer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "canonicalPath", "getCanonicalPath", "()Lokio/Path;", "canonicalPath$delegate", "Lkotlin/Lazy;", "createConnection", "Landroidx/datastore/core/StorageConnection;", "Companion", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioStorage<T> implements androidx.datastore.core.Storage<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.datastore.core.okio.OkioStorage.Companion INSTANCE = new androidx.datastore.core.okio.OkioStorage.Companion(null);
    private static final java.util.Set<java.lang.String> activeFiles = new java.util.LinkedHashSet();
    private static final androidx.datastore.core.okio.Synchronizer activeFilesLock = new androidx.datastore.core.okio.Synchronizer();

    /* JADX INFO: renamed from: canonicalPath$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy canonicalPath;
    private final kotlin.jvm.functions.Function2<okio.Path, okio.FileSystem, androidx.datastore.core.InterProcessCoordinator> coordinatorProducer;
    private final okio.FileSystem fileSystem;
    private final kotlin.jvm.functions.Function0<okio.Path> producePath;
    private final androidx.datastore.core.okio.OkioSerializer<T> serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public OkioStorage(okio.FileSystem fileSystem, androidx.datastore.core.okio.OkioSerializer<T> serializer, kotlin.jvm.functions.Function2<? super okio.Path, ? super okio.FileSystem, ? extends androidx.datastore.core.InterProcessCoordinator> coordinatorProducer, kotlin.jvm.functions.Function0<okio.Path> producePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(producePath, "producePath");
        this.fileSystem = fileSystem;
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.producePath = producePath;
        this.canonicalPath = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<okio.Path>(this) { // from class: androidx.datastore.core.okio.OkioStorage$canonicalPath$2
            final /* synthetic */ androidx.datastore.core.okio.OkioStorage<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final okio.Path invoke() {
                okio.Path path = (okio.Path) ((androidx.datastore.core.okio.OkioStorage) this.this$0).producePath.invoke();
                boolean zIsAbsolute = path.isAbsolute();
                androidx.datastore.core.okio.OkioStorage<T> okioStorage = this.this$0;
                if (!zIsAbsolute) {
                    throw new java.lang.IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + ((androidx.datastore.core.okio.OkioStorage) okioStorage).producePath + ", instead got " + path).toString());
                }
                return path.normalized();
            }
        });
    }

    public /* synthetic */ OkioStorage(okio.FileSystem fileSystem, androidx.datastore.core.okio.OkioSerializer okioSerializer, androidx.datastore.core.okio.OkioStorage.AnonymousClass1 anonymousClass1, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fileSystem, okioSerializer, (i & 4) != 0 ? new kotlin.jvm.functions.Function2<okio.Path, okio.FileSystem, androidx.datastore.core.InterProcessCoordinator>() { // from class: androidx.datastore.core.okio.OkioStorage.1
            @Override // kotlin.jvm.functions.Function2
            public final androidx.datastore.core.InterProcessCoordinator invoke(okio.Path path, okio.FileSystem fileSystem2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem2, "<anonymous parameter 1>");
                return androidx.datastore.core.okio.OkioStorageKt.createSingleProcessCoordinator(path);
            }
        } : anonymousClass1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final okio.Path getCanonicalPath() {
        return (okio.Path) this.canonicalPath.getValue();
    }

    @Override // androidx.datastore.core.Storage
    public androidx.datastore.core.StorageConnection<T> createConnection() {
        java.lang.String string = getCanonicalPath().toString();
        synchronized (activeFilesLock) {
            java.util.Set<java.lang.String> set = activeFiles;
            if (!(!set.contains(string))) {
                throw new java.lang.IllegalStateException(("There are multiple DataStores active for the same file: " + string + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(string);
        }
        return new androidx.datastore.core.okio.OkioStorageConnection(this.fileSystem, getCanonicalPath(), this.serializer, this.coordinatorProducer.invoke(getCanonicalPath(), this.fileSystem), new kotlin.jvm.functions.Function0<kotlin.Unit>(this) { // from class: androidx.datastore.core.okio.OkioStorage.createConnection.2
            final /* synthetic */ androidx.datastore.core.okio.OkioStorage<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.datastore.core.okio.Synchronizer activeFilesLock2 = androidx.datastore.core.okio.OkioStorage.INSTANCE.getActiveFilesLock();
                androidx.datastore.core.okio.OkioStorage<T> okioStorage = this.this$0;
                synchronized (activeFilesLock2) {
                    androidx.datastore.core.okio.OkioStorage.INSTANCE.getActiveFiles$datastore_core_okio().remove(okioStorage.getCanonicalPath().toString());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        });
    }

    /* JADX INFO: compiled from: OkioStorage.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage$Companion;", "", "()V", "activeFiles", "", "", "getActiveFiles$datastore_core_okio", "()Ljava/util/Set;", "activeFilesLock", "Landroidx/datastore/core/okio/Synchronizer;", "getActiveFilesLock", "()Landroidx/datastore/core/okio/Synchronizer;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.Set<java.lang.String> getActiveFiles$datastore_core_okio() {
            return androidx.datastore.core.okio.OkioStorage.activeFiles;
        }

        public final androidx.datastore.core.okio.Synchronizer getActiveFilesLock() {
            return androidx.datastore.core.okio.OkioStorage.activeFilesLock;
        }
    }
}
