package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidByteStringDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidByteStringDataSource;", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "dataStore", "Landroidx/datastore/core/DataStore;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "(Landroidx/datastore/core/DataStore;)V", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "", "data", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidByteStringDataSource implements com.unity3d.ads.core.data.datasource.ByteStringDataSource {
    private final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> dataStore;

    public AndroidByteStringDataSource(androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidByteStringDataSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "exception", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2", f = "AndroidByteStringDataSource.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.AnonymousClass2> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.AnonymousClass2 anonymousClass2 = new com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.AnonymousClass2(continuation);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th;
            return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                java.lang.Throwable th = (java.lang.Throwable) this.L$1;
                if (!(th instanceof androidx.datastore.core.CorruptionException)) {
                    throw th;
                }
                com.unity3d.ads.datastore.ByteStringStoreKt.Dsl.Companion companion = com.unity3d.ads.datastore.ByteStringStoreKt.Dsl.INSTANCE;
                com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                com.unity3d.ads.datastore.ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
                com.google.protobuf.ByteString EMPTY = com.google.protobuf.ByteString.EMPTY;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                dsl_create.setData(EMPTY);
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(dsl_create._build(), this) == coroutine_suspended) {
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

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public java.lang.Object get(kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> continuation) {
        return kotlinx.coroutines.flow.FlowKt.first(kotlinx.coroutines.flow.FlowKt.m2834catch(this.dataStore.getData(), new com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.AnonymousClass2(null)), continuation);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidByteStringDataSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "currentData"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2", f = "AndroidByteStringDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16342 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore>, java.lang.Object> {
        final /* synthetic */ com.google.protobuf.ByteString $data;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16342(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.C16342> continuation) {
            super(2, continuation);
            this.$data = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.C16342 c16342 = new com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.C16342(this.$data, continuation);
            c16342.L$0 = obj;
            return c16342;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> continuation) {
            return ((com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.C16342) create(byteStringStore, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().setData(this.$data).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteStringStoreBuild, "currentData.toBuilder()\n…\n                .build()");
            return byteStringStoreBuild;
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public java.lang.Object set(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objUpdateData = this.dataStore.updateData(new com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.C16342(byteString, null), continuation);
        return objUpdateData == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateData : kotlin.Unit.INSTANCE;
    }
}
