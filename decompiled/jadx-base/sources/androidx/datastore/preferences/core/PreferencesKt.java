package androidx.datastore.preferences.core;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0086@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"edit", "Landroidx/datastore/preferences/core/Preferences;", "Landroidx/datastore/core/DataStore;", "transform", "Lkotlin/Function2;", "Landroidx/datastore/preferences/core/MutablePreferences;", "Lkotlin/coroutines/Continuation;", "", "", "(Landroidx/datastore/core/DataStore;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-preferences-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PreferencesKt {

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.PreferencesKt$edit$2, reason: invalid class name */
    /* JADX INFO: compiled from: Preferences.kt */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function2<? super androidx.datastore.preferences.core.MutablePreferences, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.PreferencesKt.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.datastore.preferences.core.PreferencesKt.AnonymousClass2 anonymousClass2 = new androidx.datastore.preferences.core.PreferencesKt.AnonymousClass2(this.$transform, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.datastore.preferences.core.Preferences preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> continuation) {
            return ((androidx.datastore.preferences.core.PreferencesKt.AnonymousClass2) create(preferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.datastore.preferences.core.MutablePreferences mutablePreferences = (androidx.datastore.preferences.core.MutablePreferences) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                return mutablePreferences;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.datastore.preferences.core.MutablePreferences mutablePreferences2 = ((androidx.datastore.preferences.core.Preferences) this.L$0).toMutablePreferences();
            kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.$transform;
            this.L$0 = mutablePreferences2;
            this.label = 1;
            return function2.invoke(mutablePreferences2, this) == coroutine_suspended ? coroutine_suspended : mutablePreferences2;
        }
    }

    public static final java.lang.Object edit(androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore, kotlin.jvm.functions.Function2<? super androidx.datastore.preferences.core.MutablePreferences, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> continuation) {
        return dataStore.updateData(new androidx.datastore.preferences.core.PreferencesKt.AnonymousClass2(function2, null), continuation);
    }
}
