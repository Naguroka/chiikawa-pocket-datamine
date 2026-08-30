package androidx.datastore.preferences.core;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u0004JA\u0010\t\u001a\u00020\u000221\u0010\n\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000bH\u0096@¢\u0006\u0002\u0010\u0011R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStore;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "delegate", "(Landroidx/datastore/core/DataStore;)V", "data", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "updateData", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferenceDataStore implements androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> {
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> delegate;

    @Override // androidx.datastore.core.DataStore
    public kotlinx.coroutines.flow.Flow<androidx.datastore.preferences.core.Preferences> getData() {
        return this.delegate.getData();
    }

    public PreferenceDataStore(androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.PreferenceDataStore$updateData$2, reason: invalid class name */
    /* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, java.lang.Object> $transform;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function2<? super androidx.datastore.preferences.core.Preferences, ? super kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.PreferenceDataStore.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.datastore.preferences.core.PreferenceDataStore.AnonymousClass2 anonymousClass2 = new androidx.datastore.preferences.core.PreferenceDataStore.AnonymousClass2(this.$transform, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.datastore.preferences.core.Preferences preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> continuation) {
            return ((androidx.datastore.preferences.core.PreferenceDataStore.AnonymousClass2) create(preferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.datastore.preferences.core.Preferences preferences = (androidx.datastore.preferences.core.Preferences) this.L$0;
                kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, java.lang.Object> function2 = this.$transform;
                this.label = 1;
                obj = function2.invoke(preferences, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            androidx.datastore.preferences.core.Preferences preferences2 = (androidx.datastore.preferences.core.Preferences) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNull(preferences2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((androidx.datastore.preferences.core.MutablePreferences) preferences2).freeze$datastore_preferences_core();
            return preferences2;
        }
    }

    @Override // androidx.datastore.core.DataStore
    public java.lang.Object updateData(kotlin.jvm.functions.Function2<? super androidx.datastore.preferences.core.Preferences, ? super kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> continuation) {
        return this.delegate.updateData(new androidx.datastore.preferences.core.PreferenceDataStore.AnonymousClass2(function2, null), continuation);
    }
}
