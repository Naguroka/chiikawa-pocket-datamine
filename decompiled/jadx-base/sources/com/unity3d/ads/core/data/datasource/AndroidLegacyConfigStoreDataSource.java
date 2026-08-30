package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidLegacyConfigStoreDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLegacyConfigStoreDataSource;", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "storageManager", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "(Lcom/unity3d/ads/core/data/manager/StorageManager;)V", "get", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "", "data", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidLegacyConfigStoreDataSource implements com.unity3d.ads.core.data.datasource.ByteStringDataSource {
    public static final java.lang.String KEY_CONFIGURATION_STORE = "configuration.store";
    private final com.unity3d.ads.core.data.manager.StorageManager storageManager;

    public AndroidLegacyConfigStoreDataSource(com.unity3d.ads.core.data.manager.StorageManager storageManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.storageManager = storageManager;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public java.lang.Object get(kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> continuation) {
        java.lang.Object objM1301constructorimpl;
        java.lang.Object obj = this.storageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE).get(KEY_CONFIGURATION_STORE);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(str != null ? com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64(str, true) : null);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        com.google.protobuf.ByteString EMPTY = (com.google.protobuf.ByteString) (kotlin.Result.m1307isFailureimpl(objM1301constructorimpl) ? null : objM1301constructorimpl);
        com.unity3d.ads.datastore.ByteStringStoreKt.Dsl.Companion companion3 = com.unity3d.ads.datastore.ByteStringStoreKt.Dsl.INSTANCE;
        com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        com.unity3d.ads.datastore.ByteStringStoreKt.Dsl dsl_create = companion3._create(builderNewBuilder);
        if (EMPTY == null) {
            EMPTY = com.google.protobuf.ByteString.EMPTY;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        }
        dsl_create.setData(EMPTY);
        return dsl_create._build();
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public java.lang.Object set(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.services.core.device.Storage storage = this.storageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
        storage.set(KEY_CONFIGURATION_STORE, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(byteString, true));
        storage.writeStorage();
        return kotlin.Unit.INSTANCE;
    }
}
