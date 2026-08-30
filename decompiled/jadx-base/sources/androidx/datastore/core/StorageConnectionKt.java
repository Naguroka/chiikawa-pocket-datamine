package androidx.datastore.core;

/* JADX INFO: compiled from: StorageConnection.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001a&\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0006\u001a\u0002H\u0001H\u0086@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"readData", "T", "Landroidx/datastore/core/StorageConnection;", "(Landroidx/datastore/core/StorageConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "", "value", "(Landroidx/datastore/core/StorageConnection;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StorageConnectionKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$readData$2, reason: invalid class name */
    /* JADX INFO: compiled from: StorageConnection.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "T", "Landroidx/datastore/core/ReadScope;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.datastore.core.ReadScope<T>, java.lang.Boolean, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super androidx.datastore.core.StorageConnectionKt.AnonymousClass2> continuation) {
            super(3, continuation);
        }

        public final java.lang.Object invoke(androidx.datastore.core.ReadScope<T> readScope, boolean z, kotlin.coroutines.Continuation<? super T> continuation) {
            androidx.datastore.core.StorageConnectionKt.AnonymousClass2 anonymousClass2 = new androidx.datastore.core.StorageConnectionKt.AnonymousClass2(continuation);
            anonymousClass2.L$0 = readScope;
            return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Boolean bool, java.lang.Object obj2) {
            return invoke((androidx.datastore.core.ReadScope) obj, bool.booleanValue(), (kotlin.coroutines.Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = ((androidx.datastore.core.ReadScope) this.L$0).readData(this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.lang.Object readData(androidx.datastore.core.StorageConnection<T> storageConnection, kotlin.coroutines.Continuation<? super T> continuation) {
        return storageConnection.readScope(new androidx.datastore.core.StorageConnectionKt.AnonymousClass2(null), continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$writeData$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: StorageConnection.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/datastore/core/WriteScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.StorageConnectionKt$writeData$2", f = "StorageConnection.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    static final class C02992<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.core.WriteScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ T $value;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02992(T t, kotlin.coroutines.Continuation<? super androidx.datastore.core.StorageConnectionKt.C02992> continuation) {
            super(2, continuation);
            this.$value = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.datastore.core.StorageConnectionKt.C02992 c02992 = new androidx.datastore.core.StorageConnectionKt.C02992(this.$value, continuation);
            c02992.L$0 = obj;
            return c02992;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.datastore.core.WriteScope<T> writeScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.datastore.core.StorageConnectionKt.C02992) create(writeScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (((androidx.datastore.core.WriteScope) this.L$0).writeData(this.$value, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final <T> java.lang.Object writeData(androidx.datastore.core.StorageConnection<T> storageConnection, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objWriteScope = storageConnection.writeScope(new androidx.datastore.core.StorageConnectionKt.C02992(t, null), continuation);
        return objWriteScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteScope : kotlin.Unit.INSTANCE;
    }
}
