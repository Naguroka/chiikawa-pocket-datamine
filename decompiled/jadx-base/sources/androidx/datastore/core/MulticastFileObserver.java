package androidx.datastore.core;

/* JADX INFO: compiled from: MulticastFileObserver.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016R&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver;", "Landroid/os/FileObserver;", "path", "", "(Ljava/lang/String;)V", "delegates", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "", "Landroidx/datastore/core/FileMoveObserver;", "getPath", "()Ljava/lang/String;", "onEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MulticastFileObserver extends android.os.FileObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.datastore.core.MulticastFileObserver.Companion INSTANCE = new androidx.datastore.core.MulticastFileObserver.Companion(null);
    private static final java.lang.Object LOCK = new java.lang.Object();
    private static final java.util.Map<java.lang.String, androidx.datastore.core.MulticastFileObserver> fileObservers = new java.util.LinkedHashMap();
    private final java.util.concurrent.CopyOnWriteArrayList<kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>> delegates;
    private final java.lang.String path;

    public /* synthetic */ MulticastFileObserver(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    private MulticastFileObserver(java.lang.String str) {
        super(str, 128);
        this.path = str;
        this.delegates = new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    @Override // android.os.FileObserver
    public void onEvent(int event, java.lang.String path) {
        java.util.Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((kotlin.jvm.functions.Function1) it.next()).invoke(path);
        }
    }

    /* JADX INFO: compiled from: MulticastFileObserver.android.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J*\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\r0\u0013j\u0002`\u0014H\u0003J\r\u0010\u0015\u001a\u00020\rH\u0001¢\u0006\u0002\b\u0016R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver$Companion;", "", "()V", "LOCK", "fileObservers", "", "", "Landroidx/datastore/core/MulticastFileObserver;", "getFileObservers$datastore_core_release$annotations", "getFileObservers$datastore_core_release", "()Ljava/util/Map;", "observe", "Lkotlinx/coroutines/flow/Flow;", "", com.ironsource.y8.h.b, "Ljava/io/File;", "Lkotlinx/coroutines/DisposableHandle;", "parent", "observer", "Lkotlin/Function1;", "Landroidx/datastore/core/FileMoveObserver;", "removeAllObservers", "removeAllObservers$datastore_core_release", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getFileObservers$datastore_core_release$annotations() {
        }

        private Companion() {
        }

        public final java.util.Map<java.lang.String, androidx.datastore.core.MulticastFileObserver> getFileObservers$datastore_core_release() {
            return androidx.datastore.core.MulticastFileObserver.fileObservers;
        }

        public final kotlinx.coroutines.flow.Flow<kotlin.Unit> observe(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            return kotlinx.coroutines.flow.FlowKt.channelFlow(new androidx.datastore.core.MulticastFileObserver$Companion$observe$1(file, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final kotlinx.coroutines.DisposableHandle observe(java.io.File parent, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> observer) {
            final java.lang.String key = parent.getCanonicalFile().getPath();
            synchronized (androidx.datastore.core.MulticastFileObserver.LOCK) {
                java.util.Map<java.lang.String, androidx.datastore.core.MulticastFileObserver> fileObservers$datastore_core_release = androidx.datastore.core.MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                androidx.datastore.core.MulticastFileObserver multicastFileObserver = fileObservers$datastore_core_release.get(key);
                if (multicastFileObserver == null) {
                    multicastFileObserver = new androidx.datastore.core.MulticastFileObserver(key, null);
                    fileObservers$datastore_core_release.put(key, multicastFileObserver);
                }
                androidx.datastore.core.MulticastFileObserver multicastFileObserver2 = multicastFileObserver;
                multicastFileObserver2.delegates.add(observer);
                if (multicastFileObserver2.delegates.size() == 1) {
                    multicastFileObserver2.startWatching();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return new kotlinx.coroutines.DisposableHandle() { // from class: androidx.datastore.core.MulticastFileObserver$Companion$$ExternalSyntheticLambda0
                @Override // kotlinx.coroutines.DisposableHandle
                public final void dispose() {
                    androidx.datastore.core.MulticastFileObserver.Companion.observe$lambda$4(key, observer);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void observe$lambda$4(java.lang.String str, kotlin.jvm.functions.Function1 observer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "$observer");
            synchronized (androidx.datastore.core.MulticastFileObserver.LOCK) {
                androidx.datastore.core.MulticastFileObserver multicastFileObserver = androidx.datastore.core.MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release().get(str);
                if (multicastFileObserver != null) {
                    multicastFileObserver.delegates.remove(observer);
                    if (multicastFileObserver.delegates.isEmpty()) {
                        androidx.datastore.core.MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release().remove(str);
                        multicastFileObserver.stopWatching();
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        public final void removeAllObservers$datastore_core_release() {
            synchronized (androidx.datastore.core.MulticastFileObserver.LOCK) {
                java.util.Iterator<T> it = androidx.datastore.core.MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release().values().iterator();
                while (it.hasNext()) {
                    ((androidx.datastore.core.MulticastFileObserver) it.next()).stopWatching();
                }
                androidx.datastore.core.MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release().clear();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }
}
