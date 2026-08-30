package androidx.datastore.core;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 V*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002VWBn\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012?\b\u0002\u0010\u0005\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00070\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u000e\u00103\u001a\u00020\rH\u0082@¢\u0006\u0002\u00104JG\u00105\u001a\u0002H6\"\u0004\b\u0001\u001062\u0006\u00107\u001a\u0002082\u001c\u00109\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H60\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0:H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010;J\u001c\u0010<\u001a\u00020\r2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0082@¢\u0006\u0002\u0010>J\u000e\u0010?\u001a\u00020\rH\u0082@¢\u0006\u0002\u00104J\u000e\u0010@\u001a\u00020\rH\u0082@¢\u0006\u0002\u00104J\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000B2\u0006\u0010C\u001a\u000208H\u0082@¢\u0006\u0002\u0010DJ\u000e\u0010E\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u00104J\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000G2\u0006\u00107\u001a\u000208H\u0082@¢\u0006\u0002\u0010DJ\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000B2\u0006\u0010C\u001a\u000208H\u0082@¢\u0006\u0002\u0010DJI\u0010I\u001a\u00028\u000021\u0010J\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(K\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00072\u0006\u0010L\u001a\u00020MH\u0082@¢\u0006\u0002\u0010NJA\u0010O\u001a\u00028\u000021\u0010J\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(K\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007H\u0096@¢\u0006\u0002\u0010PJ \u0010Q\u001a\u00020\u00152\u0006\u0010R\u001a\u00028\u00002\u0006\u0010S\u001a\u000208H\u0080@¢\u0006\u0004\bT\u0010UR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010&\u001a\f0'R\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b,\u0010-*\u0004\b*\u0010+R\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)0/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000201X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Landroidx/datastore/core/DataStoreImpl;", "T", "Landroidx/datastore/core/DataStore;", com.ironsource.y8.a.k, "Landroidx/datastore/core/Storage;", "initTasksList", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "corruptionHandler", "Landroidx/datastore/core/CorruptionHandler;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/datastore/core/Storage;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;)V", "collectorCounter", "", "collectorJob", "Lkotlinx/coroutines/Job;", "collectorMutex", "Lkotlinx/coroutines/sync/Mutex;", "coordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "coordinator$delegate", "Lkotlin/Lazy;", "data", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "inMemoryCache", "Landroidx/datastore/core/DataStoreInMemoryCache;", "readAndInit", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "storageConnection", "Landroidx/datastore/core/StorageConnection;", "getStorageConnection$datastore_core_release$delegate", "(Landroidx/datastore/core/DataStoreImpl;)Ljava/lang/Object;", "getStorageConnection$datastore_core_release", "()Landroidx/datastore/core/StorageConnection;", "storageConnectionDelegate", "Lkotlin/Lazy;", "writeActor", "Landroidx/datastore/core/SimpleActor;", "Landroidx/datastore/core/Message$Update;", "decrementCollector", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doWithWriteFileLock", "R", "hasWriteFileLock", "", "block", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUpdate", "update", "(Landroidx/datastore/core/Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementCollector", "readAndInitOrPropagateAndThrowFailure", "readDataAndUpdateCache", "Landroidx/datastore/core/State;", "requireLock", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readDataFromFileOrDefault", "readDataOrHandleCorruption", "Landroidx/datastore/core/Data;", "readState", "transformAndWrite", "transform", "t", "callerContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "newData", "updateCache", "writeData$datastore_core_release", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "InitDataStore", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl<T> implements androidx.datastore.core.DataStore<T> {
    private static final java.lang.String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    private int collectorCounter;
    private kotlinx.coroutines.Job collectorJob;
    private final kotlinx.coroutines.sync.Mutex collectorMutex;

    /* JADX INFO: renamed from: coordinator$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy coordinator;
    private final androidx.datastore.core.CorruptionHandler<T> corruptionHandler;
    private final kotlinx.coroutines.flow.Flow<T> data;
    private final androidx.datastore.core.DataStoreInMemoryCache<T> inMemoryCache;
    private final androidx.datastore.core.DataStoreImpl<T>.InitDataStore readAndInit;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final androidx.datastore.core.Storage<T> storage;
    private final kotlin.Lazy<androidx.datastore.core.StorageConnection<T>> storageConnectionDelegate;
    private final androidx.datastore.core.SimpleActor<androidx.datastore.core.Message.Update<T>> writeActor;

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$decrementCollector$1, reason: invalid class name */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0}, l = {544}, m = "decrementCollector", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.decrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$handleUpdate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {1, 1}, l = {237, 243, 246}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u242"}, s = {"L$0", "L$1"})
    static final class C02861 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02861(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C02861> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0}, l = {544}, m = "incrementCollector", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class C02871 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02871(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C02871> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.incrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 1, 1}, l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure", n = {"this", "this", "preReadVersion"}, s = {"L$0", "L$0", "I$0"})
    static final class C02881 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02881(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C02881> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 2}, l = {287, 296, 304}, m = "readDataAndUpdateCache", n = {"this", "currentState", "requireLock", "this", "this"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$0"})
    static final class C02891 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02891(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C02891> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataAndUpdateCache(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5}, l = {365, 366, 368, 369, 380, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK}, m = "readDataOrHandleCorruption", n = {"this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "ex", "newData", "hasWriteFileLock", "ex", "newData", "version"}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2"})
    static final class C02911 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02911(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C02911> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(false, this);
        }
    }

    public DataStoreImpl(androidx.datastore.core.Storage<T> storage, java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> initTasksList, androidx.datastore.core.CorruptionHandler<T> corruptionHandler, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = kotlinx.coroutines.flow.FlowKt.flow(new androidx.datastore.core.DataStoreImpl$data$1(this, null));
        this.collectorMutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.inMemoryCache = new androidx.datastore.core.DataStoreInMemoryCache<>();
        this.readAndInit = new androidx.datastore.core.DataStoreImpl.InitDataStore(this, initTasksList);
        this.storageConnectionDelegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.StorageConnection<T>>(this) { // from class: androidx.datastore.core.DataStoreImpl$storageConnectionDelegate$1
            final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final androidx.datastore.core.StorageConnection<T> invoke() {
                return ((androidx.datastore.core.DataStoreImpl) this.this$0).storage.createConnection();
            }
        });
        this.coordinator = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.InterProcessCoordinator>(this) { // from class: androidx.datastore.core.DataStoreImpl$coordinator$2
            final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.datastore.core.InterProcessCoordinator invoke() {
                return this.this$0.getStorageConnection$datastore_core_release().getCoordinator();
            }
        });
        this.writeActor = new androidx.datastore.core.SimpleActor<>(scope, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>(this) { // from class: androidx.datastore.core.DataStoreImpl$writeActor$1
            final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                if (th != null) {
                    ((androidx.datastore.core.DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(new androidx.datastore.core.Final(th));
                }
                if (((androidx.datastore.core.DataStoreImpl) this.this$0).storageConnectionDelegate.isInitialized()) {
                    this.this$0.getStorageConnection$datastore_core_release().close();
                }
            }
        }, new kotlin.jvm.functions.Function2<androidx.datastore.core.Message.Update<T>, java.lang.Throwable, kotlin.Unit>() { // from class: androidx.datastore.core.DataStoreImpl$writeActor$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Throwable th) {
                invoke((androidx.datastore.core.Message.Update) obj, th);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.datastore.core.Message.Update<T> msg, java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                kotlinx.coroutines.CompletableDeferred<T> ack = msg.getAck();
                if (th == null) {
                    th = new java.util.concurrent.CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ack.completeExceptionally(th);
            }
        }, new androidx.datastore.core.DataStoreImpl$writeActor$3(this, null));
    }

    public /* synthetic */ DataStoreImpl(androidx.datastore.core.Storage storage, java.util.List list, androidx.datastore.core.handlers.NoOpCorruptionHandler noOpCorruptionHandler, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(storage, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? new androidx.datastore.core.handlers.NoOpCorruptionHandler() : noOpCorruptionHandler, (i & 8) != 0 ? kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(androidx.datastore.core.Actual_jvmKt.ioDispatcher().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null))) : coroutineScope);
    }

    @Override // androidx.datastore.core.DataStore
    public kotlinx.coroutines.flow.Flow<T> getData() {
        return this.data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object incrementCollector(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.datastore.core.DataStoreImpl.C02871 c02871;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl;
        kotlinx.coroutines.sync.Mutex mutex;
        if (continuation instanceof androidx.datastore.core.DataStoreImpl.C02871) {
            c02871 = (androidx.datastore.core.DataStoreImpl.C02871) continuation;
            if ((c02871.label & Integer.MIN_VALUE) != 0) {
                c02871.label -= Integer.MIN_VALUE;
            } else {
                c02871 = new androidx.datastore.core.DataStoreImpl.C02871(this, continuation);
            }
        } else {
            c02871 = new androidx.datastore.core.DataStoreImpl.C02871(this, continuation);
        }
        java.lang.Object obj = c02871.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c02871.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.sync.Mutex mutex2 = this.collectorMutex;
            c02871.L$0 = this;
            c02871.L$1 = mutex2;
            c02871.label = 1;
            if (mutex2.lock(null, c02871) == coroutine_suspended) {
                return coroutine_suspended;
            }
            dataStoreImpl = this;
            mutex = mutex2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (kotlinx.coroutines.sync.Mutex) c02871.L$1;
            dataStoreImpl = (androidx.datastore.core.DataStoreImpl) c02871.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            int i2 = dataStoreImpl.collectorCounter + 1;
            dataStoreImpl.collectorCounter = i2;
            if (i2 == 1) {
                dataStoreImpl.collectorJob = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(dataStoreImpl.scope, null, null, new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1(dataStoreImpl, null), 3, null);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object decrementCollector(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.datastore.core.DataStoreImpl.AnonymousClass1 anonymousClass1;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl;
        kotlinx.coroutines.sync.Mutex mutex;
        if (continuation instanceof androidx.datastore.core.DataStoreImpl.AnonymousClass1) {
            anonymousClass1 = (androidx.datastore.core.DataStoreImpl.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new androidx.datastore.core.DataStoreImpl.AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new androidx.datastore.core.DataStoreImpl.AnonymousClass1(this, continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.sync.Mutex mutex2 = this.collectorMutex;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = mutex2;
            anonymousClass1.label = 1;
            if (mutex2.lock(null, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            dataStoreImpl = this;
            mutex = mutex2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$1;
            dataStoreImpl = (androidx.datastore.core.DataStoreImpl) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            int i2 = dataStoreImpl.collectorCounter - 1;
            dataStoreImpl.collectorCounter = i2;
            if (i2 == 0) {
                kotlinx.coroutines.Job job = dataStoreImpl.collectorJob;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                dataStoreImpl.collectorJob = null;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    @Override // androidx.datastore.core.DataStore
    public java.lang.Object updateData(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.datastore.core.UpdatingDataContextElement updatingDataContextElement = (androidx.datastore.core.UpdatingDataContextElement) continuation.getContext().get(androidx.datastore.core.UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return kotlinx.coroutines.BuildersKt.withContext(new androidx.datastore.core.UpdatingDataContextElement(updatingDataContextElement, this), new androidx.datastore.core.DataStoreImpl.C02952(this, function2, null), continuation);
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$updateData$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", i = {}, l = {org.objectweb.asm.Opcodes.RET}, m = "invokeSuspend", n = {}, s = {})
    static final class C02952 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02952(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C02952> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.datastore.core.DataStoreImpl.C02952 c02952 = new androidx.datastore.core.DataStoreImpl.C02952(this.this$0, this.$transform, continuation);
            c02952.L$0 = obj;
            return c02952;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super T> continuation) {
            return ((androidx.datastore.core.DataStoreImpl.C02952) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlinx.coroutines.CompletableDeferred completableDeferredCompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                ((androidx.datastore.core.DataStoreImpl) this.this$0).writeActor.offer(new androidx.datastore.core.Message.Update(this.$transform, completableDeferredCompletableDeferred$default, ((androidx.datastore.core.DataStoreImpl) this.this$0).inMemoryCache.getCurrentState(), coroutineScope.getCoroutineContext()));
                this.label = 1;
                obj = completableDeferredCompletableDeferred$default.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public final androidx.datastore.core.StorageConnection<T> getStorageConnection$datastore_core_release() {
        return this.storageConnectionDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.datastore.core.InterProcessCoordinator getCoordinator() {
        return (androidx.datastore.core.InterProcessCoordinator) this.coordinator.getValue();
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readState$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/State;", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", i = {}, l = {218, 226}, m = "invokeSuspend", n = {}, s = {})
    static final class C02932 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.datastore.core.State<T>>, java.lang.Object> {
        final /* synthetic */ boolean $requireLock;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02932(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, boolean z, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C02932> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$requireLock = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.datastore.core.DataStoreImpl.C02932(this.this$0, this.$requireLock, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.datastore.core.State<T>> continuation) {
            return ((androidx.datastore.core.DataStoreImpl.C02932) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((androidx.datastore.core.DataStoreImpl) this.this$0).inMemoryCache.getCurrentState() instanceof androidx.datastore.core.Final) {
                        return ((androidx.datastore.core.DataStoreImpl) this.this$0).inMemoryCache.getCurrentState();
                    }
                    this.label = 1;
                    if (this.this$0.readAndInitOrPropagateAndThrowFailure(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (androidx.datastore.core.State) obj;
                }
                this.label = 2;
                obj = this.this$0.readDataAndUpdateCache(this.$requireLock, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (androidx.datastore.core.State) obj;
            } catch (java.lang.Throwable th) {
                return new androidx.datastore.core.ReadException(th, -1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object readState(boolean z, kotlin.coroutines.Continuation<? super androidx.datastore.core.State<T>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.scope.getCoroutineContext(), new androidx.datastore.core.DataStoreImpl.C02932(this, z, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.datastore.core.DataStoreImpl] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.DataStoreImpl, androidx.datastore.core.DataStoreImpl<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.Message$Update, androidx.datastore.core.Message$Update<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.datastore.core.Message$Update] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final java.lang.Object handleUpdate(androidx.datastore.core.Message.Update<T> update, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.datastore.core.DataStoreImpl.C02861 c02861;
        java.lang.Object objM1301constructorimpl;
        ?? r9;
        kotlinx.coroutines.CompletableDeferred ack;
        ?? r2;
        java.lang.Object objTransformAndWrite;
        ?? r10;
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        if (continuation instanceof androidx.datastore.core.DataStoreImpl.C02861) {
            c02861 = (androidx.datastore.core.DataStoreImpl.C02861) continuation;
            if ((c02861.label & Integer.MIN_VALUE) != 0) {
                c02861.label -= Integer.MIN_VALUE;
            } else {
                c02861 = new androidx.datastore.core.DataStoreImpl.C02861(this, continuation);
            }
        } else {
            c02861 = new androidx.datastore.core.DataStoreImpl.C02861(this, continuation);
        }
        java.lang.Object obj = c02861.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c02861.label;
        boolean z = true;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                ack = update.getAck();
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    androidx.datastore.core.State<T> currentState = this.inMemoryCache.getCurrentState();
                    if (currentState instanceof androidx.datastore.core.Data) {
                        kotlin.jvm.functions.Function2 transform = update.getTransform();
                        kotlin.coroutines.CoroutineContext callerContext = update.getCallerContext();
                        c02861.L$0 = ack;
                        c02861.label = 1;
                        objTransformAndWrite = transformAndWrite(transform, callerContext, c02861);
                        if (objTransformAndWrite == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (!(currentState instanceof androidx.datastore.core.ReadException)) {
                            z = currentState instanceof androidx.datastore.core.UnInitialized;
                        }
                        if (z) {
                            if (currentState == update.getLastState()) {
                                c02861.L$0 = update;
                                c02861.L$1 = this;
                                c02861.L$2 = ack;
                                c02861.label = 2;
                                if (readAndInitOrPropagateAndThrowFailure(c02861) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r2 = this;
                                r10 = update;
                            } else {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(currentState, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                                throw ((androidx.datastore.core.ReadException) currentState).getReadException();
                            }
                        } else {
                            if (currentState instanceof androidx.datastore.core.Final) {
                                throw ((androidx.datastore.core.Final) currentState).getFinalException();
                            }
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    kotlinx.coroutines.CompletableDeferred completableDeferred2 = ack;
                    obj = objTransformAndWrite;
                    update = completableDeferred2;
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(obj);
                    r9 = update;
                } catch (java.lang.Throwable th) {
                    th = th;
                    update = ack;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
                    r9 = update;
                }
                kotlinx.coroutines.CompletableDeferredKt.completeWith(r9, objM1301constructorimpl);
                return kotlin.Unit.INSTANCE;
            }
            if (i == 1) {
                completableDeferred = (kotlinx.coroutines.CompletableDeferred) c02861.L$0;
            } else if (i == 2) {
                kotlinx.coroutines.CompletableDeferred completableDeferred3 = (kotlinx.coroutines.CompletableDeferred) c02861.L$2;
                androidx.datastore.core.DataStoreImpl dataStoreImpl = (androidx.datastore.core.DataStoreImpl) c02861.L$1;
                androidx.datastore.core.Message.Update update2 = (androidx.datastore.core.Message.Update) c02861.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                ack = completableDeferred3;
                r2 = dataStoreImpl;
                r10 = (androidx.datastore.core.Message.Update<T>) update2;
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                completableDeferred = (androidx.datastore.core.Message.Update<T>) ((kotlinx.coroutines.CompletableDeferred) c02861.L$0);
            }
            kotlin.ResultKt.throwOnFailure(obj);
            update = completableDeferred;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(obj);
            r9 = update;
            kotlinx.coroutines.CompletableDeferredKt.completeWith(r9, objM1301constructorimpl);
            return kotlin.Unit.INSTANCE;
            kotlin.jvm.functions.Function2 transform2 = r10.getTransform();
            kotlin.coroutines.CoroutineContext callerContext2 = r10.getCallerContext();
            c02861.L$0 = ack;
            c02861.L$1 = null;
            c02861.L$2 = null;
            c02861.label = 3;
            objTransformAndWrite = r2.transformAndWrite(transform2, callerContext2, c02861);
            if (objTransformAndWrite == coroutine_suspended) {
                return coroutine_suspended;
            }
            kotlinx.coroutines.CompletableDeferred completableDeferred4 = ack;
            obj = objTransformAndWrite;
            update = completableDeferred4;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(obj);
            r9 = update;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        kotlinx.coroutines.CompletableDeferredKt.completeWith(r9, objM1301constructorimpl);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        androidx.datastore.core.DataStoreImpl.C02881 c02881;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl;
        int iIntValue;
        int i;
        java.lang.Throwable th;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl2;
        if (continuation instanceof androidx.datastore.core.DataStoreImpl.C02881) {
            c02881 = (androidx.datastore.core.DataStoreImpl.C02881) continuation;
            if ((c02881.label & Integer.MIN_VALUE) != 0) {
                c02881.label -= Integer.MIN_VALUE;
            } else {
                c02881 = new androidx.datastore.core.DataStoreImpl.C02881(this, continuation);
            }
        } else {
            c02881 = new androidx.datastore.core.DataStoreImpl.C02881(this, continuation);
        }
        java.lang.Object version = c02881.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c02881.label;
        try {
            if (i2 == 0) {
                kotlin.ResultKt.throwOnFailure(version);
                androidx.datastore.core.InterProcessCoordinator coordinator = getCoordinator();
                c02881.L$0 = this;
                c02881.label = 1;
                version = coordinator.getVersion(c02881);
                if (version == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dataStoreImpl = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = c02881.I$0;
                    dataStoreImpl2 = (androidx.datastore.core.DataStoreImpl) c02881.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(version);
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        dataStoreImpl2.inMemoryCache.tryUpdate(new androidx.datastore.core.ReadException(th, i));
                        throw th;
                    }
                }
                dataStoreImpl = (androidx.datastore.core.DataStoreImpl) c02881.L$0;
                kotlin.ResultKt.throwOnFailure(version);
            }
            androidx.datastore.core.DataStoreImpl<T>.InitDataStore initDataStore = dataStoreImpl.readAndInit;
            c02881.L$0 = dataStoreImpl;
            c02881.I$0 = iIntValue;
            c02881.label = 2;
            if (initDataStore.runIfNeeded(c02881) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th3) {
            i = iIntValue;
            th = th3;
            dataStoreImpl2 = dataStoreImpl;
            dataStoreImpl2.inMemoryCache.tryUpdate(new androidx.datastore.core.ReadException(th, i));
            throw th;
        }
        iIntValue = ((java.lang.Number) version).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object readDataAndUpdateCache(boolean z, kotlin.coroutines.Continuation<? super androidx.datastore.core.State<T>> continuation) {
        androidx.datastore.core.DataStoreImpl.C02891 c02891;
        androidx.datastore.core.State<T> state;
        java.lang.Object obj;
        boolean z2;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl;
        kotlin.Pair pair;
        androidx.datastore.core.State<T> state2;
        if (continuation instanceof androidx.datastore.core.DataStoreImpl.C02891) {
            c02891 = (androidx.datastore.core.DataStoreImpl.C02891) continuation;
            if ((c02891.label & Integer.MIN_VALUE) != 0) {
                c02891.label -= Integer.MIN_VALUE;
            } else {
                c02891 = new androidx.datastore.core.DataStoreImpl.C02891(this, continuation);
            }
        } else {
            c02891 = new androidx.datastore.core.DataStoreImpl.C02891(this, continuation);
        }
        java.lang.Object objTryLock = c02891.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c02891.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objTryLock);
            androidx.datastore.core.State<T> currentState = this.inMemoryCache.getCurrentState();
            if (!(!(currentState instanceof androidx.datastore.core.UnInitialized))) {
                throw new java.lang.IllegalStateException(BUG_MESSAGE.toString());
            }
            androidx.datastore.core.InterProcessCoordinator coordinator = getCoordinator();
            c02891.L$0 = this;
            c02891.L$1 = currentState;
            c02891.Z$0 = z;
            c02891.label = 1;
            java.lang.Object version = coordinator.getVersion(c02891);
            if (version == coroutine_suspended) {
                return coroutine_suspended;
            }
            state = currentState;
            obj = version;
            z2 = z;
            dataStoreImpl = this;
        } else {
            if (i != 1) {
                if (i == 2) {
                    dataStoreImpl = (androidx.datastore.core.DataStoreImpl) c02891.L$0;
                    kotlin.ResultKt.throwOnFailure(objTryLock);
                    pair = (kotlin.Pair) objTryLock;
                    state2 = (androidx.datastore.core.State) pair.component1();
                    if (((java.lang.Boolean) pair.component2()).booleanValue()) {
                        dataStoreImpl.inMemoryCache.tryUpdate(state2);
                    }
                    return state2;
                }
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dataStoreImpl = (androidx.datastore.core.DataStoreImpl) c02891.L$0;
                kotlin.ResultKt.throwOnFailure(objTryLock);
                pair = (kotlin.Pair) objTryLock;
                state2 = (androidx.datastore.core.State) pair.component1();
                if (((java.lang.Boolean) pair.component2()).booleanValue()) {
                    dataStoreImpl.inMemoryCache.tryUpdate(state2);
                }
                return state2;
            }
            boolean z3 = c02891.Z$0;
            androidx.datastore.core.State<T> state3 = (androidx.datastore.core.State) c02891.L$1;
            androidx.datastore.core.DataStoreImpl<T> dataStoreImpl2 = (androidx.datastore.core.DataStoreImpl) c02891.L$0;
            kotlin.ResultKt.throwOnFailure(objTryLock);
            z2 = z3;
            dataStoreImpl = dataStoreImpl2;
            state = state3;
            obj = objTryLock;
        }
        int iIntValue = ((java.lang.Number) obj).intValue();
        boolean z4 = state instanceof androidx.datastore.core.Data;
        int version2 = z4 ? state.getVersion() : -1;
        if (z4 && iIntValue == version2) {
            return state;
        }
        if (z2) {
            androidx.datastore.core.InterProcessCoordinator coordinator2 = dataStoreImpl.getCoordinator();
            androidx.datastore.core.DataStoreImpl.C02903 c02903 = new androidx.datastore.core.DataStoreImpl.C02903(dataStoreImpl, null);
            c02891.L$0 = dataStoreImpl;
            c02891.L$1 = null;
            c02891.label = 2;
            objTryLock = coordinator2.lock(c02903, c02891);
            if (objTryLock == coroutine_suspended) {
                return coroutine_suspended;
            }
            pair = (kotlin.Pair) objTryLock;
            state2 = (androidx.datastore.core.State) pair.component1();
            if (((java.lang.Boolean) pair.component2()).booleanValue()) {
                dataStoreImpl.inMemoryCache.tryUpdate(state2);
            }
            return state2;
        }
        androidx.datastore.core.InterProcessCoordinator coordinator3 = dataStoreImpl.getCoordinator();
        androidx.datastore.core.DataStoreImpl.AnonymousClass4 anonymousClass4 = new androidx.datastore.core.DataStoreImpl.AnonymousClass4(dataStoreImpl, version2, null);
        c02891.L$0 = dataStoreImpl;
        c02891.L$1 = null;
        c02891.label = 3;
        objTryLock = coordinator3.tryLock(anonymousClass4, c02891);
        if (objTryLock == coroutine_suspended) {
            return coroutine_suspended;
        }
        pair = (kotlin.Pair) objTryLock;
        state2 = (androidx.datastore.core.State) pair.component1();
        if (((java.lang.Boolean) pair.component2()).booleanValue()) {
            dataStoreImpl.inMemoryCache.tryUpdate(state2);
        }
        return state2;
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", "T", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", i = {}, l = {298, com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT}, m = "invokeSuspend", n = {}, s = {})
    static final class C02903 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.datastore.core.State<T>, ? extends java.lang.Boolean>>, java.lang.Object> {
        java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02903(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C02903> continuation) {
            super(1, continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.datastore.core.DataStoreImpl.C02903(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.datastore.core.State<T>, java.lang.Boolean>> continuation) {
            return ((androidx.datastore.core.DataStoreImpl.C02903) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Throwable th;
            androidx.datastore.core.ReadException readException;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = this.this$0.readDataOrHandleCorruption(true, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (java.lang.Throwable) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        readException = new androidx.datastore.core.ReadException(th, ((java.lang.Number) obj).intValue());
                        return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                readException = (androidx.datastore.core.State) obj;
            } catch (java.lang.Throwable th2) {
                this.L$0 = th2;
                this.label = 2;
                java.lang.Object version = this.this$0.getCoordinator().getVersion(this);
                if (version == coroutine_suspended) {
                    return coroutine_suspended;
                }
                th = th2;
                obj = version;
            }
            return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4, reason: invalid class name */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", "T", "", "locked"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", i = {0, 1}, l = {306, 309}, m = "invokeSuspend", n = {"locked", "locked"}, s = {"Z$0", "Z$0"})
    static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.datastore.core.State<T>, ? extends java.lang.Boolean>>, java.lang.Object> {
        final /* synthetic */ int $cachedVersion;
        java.lang.Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, int i, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$cachedVersion = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.datastore.core.DataStoreImpl.AnonymousClass4 anonymousClass4 = new androidx.datastore.core.DataStoreImpl.AnonymousClass4(this.this$0, this.$cachedVersion, continuation);
            anonymousClass4.Z$0 = ((java.lang.Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, java.lang.Object obj) {
            return invoke(bool.booleanValue(), (kotlin.coroutines.Continuation) obj);
        }

        public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.datastore.core.State<T>, java.lang.Boolean>> continuation) {
            return ((androidx.datastore.core.DataStoreImpl.AnonymousClass4) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r6v0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Throwable th;
            int iIntValue;
            ?? r0;
            ?? r1;
            androidx.datastore.core.ReadException readException;
            ?? r2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r3 = this.label;
            try {
                if (r3 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    boolean z = this.Z$0;
                    androidx.datastore.core.DataStoreImpl<T> dataStoreImpl = this.this$0;
                    boolean z2 = z;
                    this.Z$0 = z;
                    this.label = 1;
                    obj = dataStoreImpl.readDataOrHandleCorruption(z2, this);
                    r3 = z;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r3 != 1) {
                        if (r3 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z3 = this.Z$0;
                        th = (java.lang.Throwable) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        r1 = z3;
                        iIntValue = ((java.lang.Number) obj).intValue();
                        r0 = r1;
                        readException = new androidx.datastore.core.ReadException(th, iIntValue);
                        r2 = r0;
                        return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2));
                    }
                    boolean z4 = this.Z$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r3 = z4;
                }
                readException = (androidx.datastore.core.State) obj;
                r2 = r3;
            } catch (java.lang.Throwable th2) {
                if (r3 != 0) {
                    this.L$0 = th2;
                    this.Z$0 = r3;
                    this.label = 2;
                    java.lang.Object version = this.this$0.getCoordinator().getVersion(this);
                    if (version == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r1 = r3;
                    th = th2;
                    obj = version;
                } else {
                    ?? r6 = r3;
                    th = th2;
                    iIntValue = this.$cachedVersion;
                    r0 = r6 == true ? 1 : 0;
                }
                readException = new androidx.datastore.core.ReadException(th, iIntValue);
                r2 = r0;
                return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2));
            }
            return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object readDataFromFileOrDefault(kotlin.coroutines.Continuation<? super T> continuation) {
        return androidx.datastore.core.StorageConnectionKt.readData(getStorageConnection$datastore_core_release(), continuation);
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", i = {1, 2}, l = {330, 331, 337}, m = "invokeSuspend", n = {"curData", "newData"}, s = {"L$0", "L$0"})
    static final class C02942 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        final /* synthetic */ kotlin.coroutines.CoroutineContext $callerContext;
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> $transform;
        java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02942(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C02942> continuation) {
            super(1, continuation);
            this.this$0 = dataStoreImpl;
            this.$callerContext = coroutineContext;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.datastore.core.DataStoreImpl.C02942(this.this$0, this.$callerContext, this.$transform, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super T> continuation) {
            return ((androidx.datastore.core.DataStoreImpl.C02942) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0066  */
        /* JADX WARN: Code duplicated, block: B:22:0x0075 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0076  */
        /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            androidx.datastore.core.Data data;
            androidx.datastore.core.DataStoreImpl<T> dataStoreImpl;
            java.lang.Object obj2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    data = (androidx.datastore.core.Data) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    data.checkHashCode();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(data.getValue(), obj)) {
                        return obj;
                    }
                    dataStoreImpl = this.this$0;
                    this.L$0 = obj;
                    this.label = 3;
                    if (dataStoreImpl.writeData$datastore_core_release((T) obj, true, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = obj;
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return obj2;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.readDataOrHandleCorruption(true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            data = (androidx.datastore.core.Data) obj;
            this.L$0 = data;
            this.label = 2;
            obj = kotlinx.coroutines.BuildersKt.withContext(this.$callerContext, new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, data, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            data.checkHashCode();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(data.getValue(), obj)) {
                return obj;
            }
            dataStoreImpl = this.this$0;
            this.L$0 = obj;
            this.label = 3;
            if (dataStoreImpl.writeData$datastore_core_release((T) obj, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = obj;
            return obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object transformAndWrite(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super T> continuation) {
        return getCoordinator().lock(new androidx.datastore.core.DataStoreImpl.C02942(this, coroutineContext, function2, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object writeData$datastore_core_release(T t, boolean z, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        androidx.datastore.core.DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        kotlin.jvm.internal.Ref.IntRef intRef;
        if (continuation instanceof androidx.datastore.core.DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (androidx.datastore.core.DataStoreImpl$writeData$1) continuation;
            if ((dataStoreImpl$writeData$1.label & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$writeData$1.label -= Integer.MIN_VALUE;
            } else {
                dataStoreImpl$writeData$1 = new androidx.datastore.core.DataStoreImpl$writeData$1(this, continuation);
            }
        } else {
            dataStoreImpl$writeData$1 = new androidx.datastore.core.DataStoreImpl$writeData$1(this, continuation);
        }
        java.lang.Object obj = dataStoreImpl$writeData$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = dataStoreImpl$writeData$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
            androidx.datastore.core.StorageConnection<T> storageConnection$datastore_core_release = getStorageConnection$datastore_core_release();
            androidx.datastore.core.DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new androidx.datastore.core.DataStoreImpl$writeData$2(intRef2, this, t, z, null);
            dataStoreImpl$writeData$1.L$0 = intRef2;
            dataStoreImpl$writeData$1.label = 1;
            if (storageConnection$datastore_core_release.writeScope(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            intRef = intRef2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (kotlin.jvm.internal.Ref.IntRef) dataStoreImpl$writeData$1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x012c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d  */
    /* JADX WARN: Code duplicated, block: B:70:0x013a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x0154  */
    /* JADX WARN: Code duplicated, block: B:77:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code duplicated, block: B:91:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.datastore.core.DataStoreImpl, androidx.datastore.core.DataStoreImpl<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.datastore.core.DataStoreImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v10, types: [androidx.datastore.core.DataStoreImpl] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.datastore.core.DataStoreImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.datastore.core.DataStoreImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.datastore.core.DataStoreImpl] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final java.lang.Object readDataOrHandleCorruption(boolean z, kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>> continuation) throws androidx.datastore.core.CorruptionException {
        androidx.datastore.core.DataStoreImpl.C02911 c02911;
        ?? r8;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Object objHandleCorruption;
        androidx.datastore.core.CorruptionException corruptionException;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        ?? r9;
        kotlin.jvm.internal.Ref.IntRef intRef;
        boolean z2;
        androidx.datastore.core.CorruptionException corruptionException2;
        androidx.datastore.core.DataStoreImpl.C02923 c02923;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        ?? r2;
        ?? r7;
        int iHashCode;
        java.lang.Object version;
        boolean z3;
        int i;
        java.lang.Object obj;
        ?? r10;
        ?? r11;
        if (continuation instanceof androidx.datastore.core.DataStoreImpl.C02911) {
            c02911 = (androidx.datastore.core.DataStoreImpl.C02911) continuation;
            if ((c02911.label & Integer.MIN_VALUE) != 0) {
                c02911.label -= Integer.MIN_VALUE;
            } else {
                c02911 = new androidx.datastore.core.DataStoreImpl.C02911(this, continuation);
            }
        } else {
            c02911 = new androidx.datastore.core.DataStoreImpl.C02911(this, continuation);
        }
        java.lang.Object obj2 = (T) c02911.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r3 = c02911.label;
        try {
            switch (r3) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj2);
                    try {
                        if (z) {
                            c02911.L$0 = this;
                            c02911.Z$0 = z;
                            c02911.label = 1;
                            obj2 = (T) readDataFromFileOrDefault(c02911);
                            if (obj2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r7 = this;
                            if (obj2 != null) {
                                try {
                                    iHashCode = obj2.hashCode();
                                } catch (androidx.datastore.core.CorruptionException e) {
                                    e = e;
                                    r10 = r7;
                                    r8 = r10;
                                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                                    androidx.datastore.core.CorruptionHandler<T> corruptionHandler = r8.corruptionHandler;
                                    c02911.L$0 = r8;
                                    c02911.L$1 = e;
                                    c02911.L$2 = objectRef;
                                    c02911.L$3 = objectRef;
                                    c02911.Z$0 = z;
                                    c02911.label = 5;
                                    objHandleCorruption = corruptionHandler.handleCorruption(e, c02911);
                                    if (objHandleCorruption == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    corruptionException = e;
                                    obj2 = (T) objHandleCorruption;
                                    objectRef2 = objectRef;
                                    r9 = r8;
                                    objectRef2.element = (T) obj2;
                                    intRef = new kotlin.jvm.internal.Ref.IntRef();
                                    z2 = z;
                                    try {
                                        c02923 = new androidx.datastore.core.DataStoreImpl.C02923(objectRef, r9, intRef, null);
                                        c02911.L$0 = corruptionException;
                                        c02911.L$1 = objectRef;
                                        c02911.L$2 = intRef;
                                        c02911.L$3 = null;
                                        c02911.label = 6;
                                        if (r9.doWithWriteFileLock(z2, c02923, c02911) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        intRef2 = intRef;
                                        objectRef3 = objectRef;
                                        T t = objectRef3.element;
                                        T t2 = objectRef3.element;
                                        return new androidx.datastore.core.Data(t, t2 != null ? t2.hashCode() : 0, intRef2.element);
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        corruptionException2 = corruptionException;
                                        kotlin.ExceptionsKt.addSuppressed(corruptionException2, th);
                                        throw corruptionException2;
                                    }
                                }
                            } else {
                                iHashCode = 0;
                            }
                            androidx.datastore.core.InterProcessCoordinator coordinator = r7.getCoordinator();
                            c02911.L$0 = r7;
                            c02911.L$1 = obj2;
                            c02911.Z$0 = z;
                            c02911.I$0 = iHashCode;
                            c02911.label = 2;
                            version = coordinator.getVersion(c02911);
                            if (version == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            int i2 = iHashCode;
                            z3 = z;
                            i = i2;
                            obj = obj2;
                            obj2 = (T) version;
                            r11 = r7;
                            return new androidx.datastore.core.Data(obj, i, ((java.lang.Number) obj2).intValue());
                        }
                        androidx.datastore.core.InterProcessCoordinator coordinator2 = getCoordinator();
                        c02911.L$0 = this;
                        c02911.Z$0 = z;
                        c02911.label = 3;
                        obj2 = (T) coordinator2.getVersion(c02911);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r2 = this;
                        int iIntValue = ((java.lang.Number) obj2).intValue();
                        androidx.datastore.core.InterProcessCoordinator coordinator3 = r2.getCoordinator();
                        androidx.datastore.core.DataStoreImpl.AnonymousClass2 anonymousClass2 = new androidx.datastore.core.DataStoreImpl.AnonymousClass2(r2, iIntValue, null);
                        c02911.L$0 = r2;
                        c02911.Z$0 = z;
                        c02911.label = 4;
                        obj2 = (T) coordinator3.tryLock(anonymousClass2, c02911);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return (androidx.datastore.core.Data) obj2;
                    } catch (androidx.datastore.core.CorruptionException e2) {
                        e = e2;
                        r8 = this;
                        objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                        androidx.datastore.core.CorruptionHandler<T> corruptionHandler2 = r8.corruptionHandler;
                        c02911.L$0 = r8;
                        c02911.L$1 = e;
                        c02911.L$2 = objectRef;
                        c02911.L$3 = objectRef;
                        c02911.Z$0 = z;
                        c02911.label = 5;
                        objHandleCorruption = corruptionHandler2.handleCorruption(e, c02911);
                        if (objHandleCorruption == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        corruptionException = e;
                        obj2 = (T) objHandleCorruption;
                        objectRef2 = objectRef;
                        r9 = r8;
                        objectRef2.element = (T) obj2;
                        intRef = new kotlin.jvm.internal.Ref.IntRef();
                        if (z) {
                        }
                        c02923 = new androidx.datastore.core.DataStoreImpl.C02923(objectRef, r9, intRef, null);
                        c02911.L$0 = corruptionException;
                        c02911.L$1 = objectRef;
                        c02911.L$2 = intRef;
                        c02911.L$3 = null;
                        c02911.label = 6;
                        if (r9.doWithWriteFileLock(z2, c02923, c02911) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        intRef2 = intRef;
                        objectRef3 = objectRef;
                        T t3 = objectRef3.element;
                        T t4 = objectRef3.element;
                        return new androidx.datastore.core.Data(t3, t4 != null ? t4.hashCode() : 0, intRef2.element);
                    }
                case 1:
                    z = c02911.Z$0;
                    androidx.datastore.core.DataStoreImpl dataStoreImpl = (androidx.datastore.core.DataStoreImpl) c02911.L$0;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    r7 = dataStoreImpl;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    androidx.datastore.core.InterProcessCoordinator coordinator4 = r7.getCoordinator();
                    c02911.L$0 = r7;
                    c02911.L$1 = obj2;
                    c02911.Z$0 = z;
                    c02911.I$0 = iHashCode;
                    c02911.label = 2;
                    version = coordinator4.getVersion(c02911);
                    if (version == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i3 = iHashCode;
                    z3 = z;
                    i = i3;
                    obj = obj2;
                    obj2 = (T) version;
                    r11 = r7;
                    return new androidx.datastore.core.Data(obj, i, ((java.lang.Number) obj2).intValue());
                case 2:
                    i = c02911.I$0;
                    z3 = c02911.Z$0;
                    obj = c02911.L$1;
                    r11 = (androidx.datastore.core.DataStoreImpl) c02911.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        r11 = r11;
                        return new androidx.datastore.core.Data(obj, i, ((java.lang.Number) obj2).intValue());
                    } catch (androidx.datastore.core.CorruptionException e3) {
                        e = e3;
                        z = z3;
                        r10 = r11;
                        r8 = r10;
                        objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                        androidx.datastore.core.CorruptionHandler<T> corruptionHandler3 = r8.corruptionHandler;
                        c02911.L$0 = r8;
                        c02911.L$1 = e;
                        c02911.L$2 = objectRef;
                        c02911.L$3 = objectRef;
                        c02911.Z$0 = z;
                        c02911.label = 5;
                        objHandleCorruption = corruptionHandler3.handleCorruption(e, c02911);
                        if (objHandleCorruption == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        corruptionException = e;
                        obj2 = (T) objHandleCorruption;
                        objectRef2 = objectRef;
                        r9 = r8;
                        objectRef2.element = (T) obj2;
                        intRef = new kotlin.jvm.internal.Ref.IntRef();
                        if (z) {
                        }
                        c02923 = new androidx.datastore.core.DataStoreImpl.C02923(objectRef, r9, intRef, null);
                        c02911.L$0 = corruptionException;
                        c02911.L$1 = objectRef;
                        c02911.L$2 = intRef;
                        c02911.L$3 = null;
                        c02911.label = 6;
                        if (r9.doWithWriteFileLock(z2, c02923, c02911) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        intRef2 = intRef;
                        objectRef3 = objectRef;
                        T t5 = objectRef3.element;
                        T t6 = objectRef3.element;
                        return new androidx.datastore.core.Data(t5, t6 != null ? t6.hashCode() : 0, intRef2.element);
                    }
                case 3:
                    z = c02911.Z$0;
                    androidx.datastore.core.DataStoreImpl dataStoreImpl2 = (androidx.datastore.core.DataStoreImpl) c02911.L$0;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    r2 = dataStoreImpl2;
                    int iIntValue2 = ((java.lang.Number) obj2).intValue();
                    androidx.datastore.core.InterProcessCoordinator coordinator5 = r2.getCoordinator();
                    androidx.datastore.core.DataStoreImpl.AnonymousClass2 anonymousClass3 = new androidx.datastore.core.DataStoreImpl.AnonymousClass2(r2, iIntValue2, null);
                    c02911.L$0 = r2;
                    c02911.Z$0 = z;
                    c02911.label = 4;
                    obj2 = (T) coordinator5.tryLock(anonymousClass3, c02911);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (androidx.datastore.core.Data) obj2;
                case 4:
                    boolean z4 = c02911.Z$0;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    return (androidx.datastore.core.Data) obj2;
                case 5:
                    z = c02911.Z$0;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) c02911.L$3;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) c02911.L$2;
                    corruptionException = (androidx.datastore.core.CorruptionException) c02911.L$1;
                    androidx.datastore.core.DataStoreImpl dataStoreImpl3 = (androidx.datastore.core.DataStoreImpl) c02911.L$0;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    objectRef2 = objectRef4;
                    objectRef = objectRef5;
                    r9 = dataStoreImpl3;
                    objectRef2.element = (T) obj2;
                    intRef = new kotlin.jvm.internal.Ref.IntRef();
                    if (z) {
                    }
                    c02923 = new androidx.datastore.core.DataStoreImpl.C02923(objectRef, r9, intRef, null);
                    c02911.L$0 = corruptionException;
                    c02911.L$1 = objectRef;
                    c02911.L$2 = intRef;
                    c02911.L$3 = null;
                    c02911.label = 6;
                    if (r9.doWithWriteFileLock(z2, c02923, c02911) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    intRef2 = intRef;
                    objectRef3 = objectRef;
                    T t7 = objectRef3.element;
                    T t8 = objectRef3.element;
                    return new androidx.datastore.core.Data(t7, t8 != null ? t8.hashCode() : 0, intRef2.element);
                case 6:
                    intRef2 = (kotlin.jvm.internal.Ref.IntRef) c02911.L$2;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) c02911.L$1;
                    corruptionException2 = (androidx.datastore.core.CorruptionException) c02911.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        T t9 = objectRef3.element;
                        T t10 = objectRef3.element;
                        return new androidx.datastore.core.Data(t9, t10 != null ? t10.hashCode() : 0, intRef2.element);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        kotlin.ExceptionsKt.addSuppressed(corruptionException2, th);
                        throw corruptionException2;
                    }
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (androidx.datastore.core.CorruptionException e4) {
            e = e4;
            r8 = r3;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2, reason: invalid class name */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", "T", "locked", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", i = {0, 1}, l = {370, 371}, m = "invokeSuspend", n = {"locked", "data"}, s = {"Z$0", "L$0"})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>>, java.lang.Object> {
        final /* synthetic */ int $preLockVersion;
        java.lang.Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, int i, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$preLockVersion = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.datastore.core.DataStoreImpl.AnonymousClass2 anonymousClass2 = new androidx.datastore.core.DataStoreImpl.AnonymousClass2(this.this$0, this.$preLockVersion, continuation);
            anonymousClass2.Z$0 = ((java.lang.Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, java.lang.Object obj) {
            return invoke(bool.booleanValue(), (kotlin.coroutines.Continuation) obj);
        }

        public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>> continuation) {
            return ((androidx.datastore.core.DataStoreImpl.AnonymousClass2) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0064  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            boolean z;
            java.lang.Object obj2;
            int iIntValue;
            int iHashCode;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                z = this.Z$0;
                this.Z$0 = z;
                this.label = 1;
                obj = this.this$0.readDataFromFileOrDefault(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    z = this.Z$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                iIntValue = ((java.lang.Number) obj).intValue();
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new androidx.datastore.core.Data(obj2, iHashCode, iIntValue);
            }
            if (z) {
                this.L$0 = obj;
                this.label = 2;
                java.lang.Object version = this.this$0.getCoordinator().getVersion(this);
                if (version == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = obj;
                obj = version;
                iIntValue = ((java.lang.Number) obj).intValue();
            } else {
                obj2 = obj;
                iIntValue = this.$preLockVersion;
            }
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new androidx.datastore.core.Data(obj2, iHashCode, iIntValue);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", i = {}, l = {387, 388, 390}, m = "invokeSuspend", n = {}, s = {})
    static final class C02923 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<T> $newData;
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef $version;
        java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02923(kotlin.jvm.internal.Ref.ObjectRef<T> objectRef, androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.jvm.internal.Ref.IntRef intRef, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C02923> continuation) {
            super(1, continuation);
            this.$newData = objectRef;
            this.this$0 = dataStoreImpl;
            this.$version = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.datastore.core.DataStoreImpl.C02923(this.$newData, this.this$0, this.$version, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.datastore.core.DataStoreImpl.C02923) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.jvm.internal.Ref.IntRef intRef;
            kotlin.jvm.internal.Ref.ObjectRef<T> objectRef;
            kotlin.jvm.internal.Ref.IntRef intRef2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef = this.$newData;
                    this.L$0 = objectRef;
                    this.label = 1;
                    obj = (T) this.this$0.readDataFromFileOrDefault(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i == 1) {
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            intRef = (kotlin.jvm.internal.Ref.IntRef) this.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            intRef.element = ((java.lang.Number) obj).intValue();
                            return kotlin.Unit.INSTANCE;
                        }
                        intRef2 = (kotlin.jvm.internal.Ref.IntRef) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    intRef2.element = ((java.lang.Number) obj).intValue();
                    return kotlin.Unit.INSTANCE;
                }
                objectRef.element = (T) obj;
                intRef2 = this.$version;
                this.L$0 = intRef2;
                this.label = 2;
                obj = (T) this.this$0.getCoordinator().getVersion(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                intRef2.element = ((java.lang.Number) obj).intValue();
            } catch (androidx.datastore.core.CorruptionException unused) {
                kotlin.jvm.internal.Ref.IntRef intRef3 = this.$version;
                this.L$0 = intRef3;
                this.label = 3;
                java.lang.Object objWriteData$datastore_core_release = this.this$0.writeData$datastore_core_release(this.$newData.element, true, this);
                if (objWriteData$datastore_core_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
                intRef = intRef3;
                obj = (T) objWriteData$datastore_core_release;
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> java.lang.Object doWithWriteFileLock(boolean z, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        if (z) {
            return function1.invoke(continuation);
        }
        return getCoordinator().lock(new androidx.datastore.core.DataStoreImpl.AnonymousClass3(function1, null), continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3, reason: invalid class name */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", i = {}, l = {416}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.AnonymousClass3> continuation) {
            super(1, continuation);
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.datastore.core.DataStoreImpl.AnonymousClass3(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super R> continuation) {
            return ((androidx.datastore.core.DataStoreImpl.AnonymousClass3) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> function1 = this.$block;
                this.label = 1;
                obj = function1.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001BD\u0012=\u0010\u0002\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00040\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u000e\u001a\u00020\nH\u0094@¢\u0006\u0002\u0010\u000fRG\u0010\r\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/RunOnce;", "initTasksList", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "(Landroidx/datastore/core/DataStoreImpl;Ljava/util/List;)V", "initTasks", "doRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class InitDataStore extends androidx.datastore.core.RunOnce {
        private java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> initTasks;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public InitDataStore(androidx.datastore.core.DataStoreImpl dataStoreImpl, java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> initTasksList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.this$0 = dataStoreImpl;
            this.initTasks = kotlin.collections.CollectionsKt.toList(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // androidx.datastore.core.RunOnce
        protected java.lang.Object doRun(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws androidx.datastore.core.CorruptionException {
            androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 dataStoreImpl$InitDataStore$doRun$1;
            androidx.datastore.core.DataStoreImpl.InitDataStore initDataStore;
            androidx.datastore.core.Data data;
            if (continuation instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) {
                dataStoreImpl$InitDataStore$doRun$1 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) continuation;
                if ((dataStoreImpl$InitDataStore$doRun$1.label & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$InitDataStore$doRun$1.label -= Integer.MIN_VALUE;
                } else {
                    dataStoreImpl$InitDataStore$doRun$1 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1(this, continuation);
                }
            } else {
                dataStoreImpl$InitDataStore$doRun$1 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1(this, continuation);
            }
            java.lang.Object dataOrHandleCorruption = dataStoreImpl$InitDataStore$doRun$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = dataStoreImpl$InitDataStore$doRun$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(dataOrHandleCorruption);
                java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list = this.initTasks;
                if (list != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list);
                    if (!list.isEmpty()) {
                        androidx.datastore.core.InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                        androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 dataStoreImpl$InitDataStore$doRun$initData$1 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this, null);
                        dataStoreImpl$InitDataStore$doRun$1.L$0 = this;
                        dataStoreImpl$InitDataStore$doRun$1.label = 2;
                        dataOrHandleCorruption = coordinator.lock(dataStoreImpl$InitDataStore$doRun$initData$1, dataStoreImpl$InitDataStore$doRun$1);
                        if (dataOrHandleCorruption == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        initDataStore = this;
                        data = (androidx.datastore.core.Data) dataOrHandleCorruption;
                    }
                }
                androidx.datastore.core.DataStoreImpl<T> dataStoreImpl = this.this$0;
                dataStoreImpl$InitDataStore$doRun$1.L$0 = this;
                dataStoreImpl$InitDataStore$doRun$1.label = 1;
                dataOrHandleCorruption = dataStoreImpl.readDataOrHandleCorruption(false, dataStoreImpl$InitDataStore$doRun$1);
                if (dataOrHandleCorruption == coroutine_suspended) {
                    return coroutine_suspended;
                }
                initDataStore = this;
                data = (androidx.datastore.core.Data) dataOrHandleCorruption;
            } else if (i == 1) {
                initDataStore = (androidx.datastore.core.DataStoreImpl.InitDataStore) dataStoreImpl$InitDataStore$doRun$1.L$0;
                kotlin.ResultKt.throwOnFailure(dataOrHandleCorruption);
                data = (androidx.datastore.core.Data) dataOrHandleCorruption;
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initDataStore = (androidx.datastore.core.DataStoreImpl.InitDataStore) dataStoreImpl$InitDataStore$doRun$1.L$0;
                kotlin.ResultKt.throwOnFailure(dataOrHandleCorruption);
                data = (androidx.datastore.core.Data) dataOrHandleCorruption;
            }
            ((androidx.datastore.core.DataStoreImpl) initDataStore.this$0).inMemoryCache.tryUpdate(data);
            return kotlin.Unit.INSTANCE;
        }
    }
}
