package androidx.datastore.core;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rR\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/UpdatingDataContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "parent", com.json.j5.p, "Landroidx/datastore/core/DataStoreImpl;", "(Landroidx/datastore/core/UpdatingDataContextElement;Landroidx/datastore/core/DataStoreImpl;)V", com.ironsource.y8.h.W, "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "checkNotUpdating", "", "candidate", "Landroidx/datastore/core/DataStore;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UpdatingDataContextElement implements kotlin.coroutines.CoroutineContext.Element {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.datastore.core.UpdatingDataContextElement.Companion INSTANCE = new androidx.datastore.core.UpdatingDataContextElement.Companion(null);
    private static final java.lang.String NESTED_UPDATE_ERROR_MESSAGE = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
    private final androidx.datastore.core.DataStoreImpl<?> instance;
    private final androidx.datastore.core.UpdatingDataContextElement parent;

    public UpdatingDataContextElement(androidx.datastore.core.UpdatingDataContextElement updatingDataContextElement, androidx.datastore.core.DataStoreImpl<?> instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        this.parent = updatingDataContextElement;
        this.instance = instance;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/datastore/core/UpdatingDataContextElement$Companion;", "", "()V", "NESTED_UPDATE_ERROR_MESSAGE", "", "getNESTED_UPDATE_ERROR_MESSAGE$datastore_core_release", "()Ljava/lang/String;", "Key", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getNESTED_UPDATE_ERROR_MESSAGE$datastore_core_release() {
            return androidx.datastore.core.UpdatingDataContextElement.NESTED_UPDATE_ERROR_MESSAGE;
        }

        /* JADX INFO: compiled from: DataStoreImpl.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/UpdatingDataContextElement$Companion$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/datastore/core/UpdatingDataContextElement;", "()V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Key implements kotlin.coroutines.CoroutineContext.Key<androidx.datastore.core.UpdatingDataContextElement> {
            public static final androidx.datastore.core.UpdatingDataContextElement.Companion.Key INSTANCE = new androidx.datastore.core.UpdatingDataContextElement.Companion.Key();

            private Key() {
            }
        }
    }

    public final void checkNotUpdating(androidx.datastore.core.DataStore<?> candidate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.instance == candidate) {
            throw new java.lang.IllegalStateException(NESTED_UPDATE_ERROR_MESSAGE.toString());
        }
        androidx.datastore.core.UpdatingDataContextElement updatingDataContextElement = this.parent;
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return androidx.datastore.core.UpdatingDataContextElement.Companion.Key.INSTANCE;
    }
}
