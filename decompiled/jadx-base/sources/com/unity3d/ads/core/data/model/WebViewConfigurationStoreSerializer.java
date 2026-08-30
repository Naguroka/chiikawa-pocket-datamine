package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: WebViewConfigurationStoreSerializer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/model/WebViewConfigurationStoreSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "()V", "defaultValue", "getDefaultValue", "()Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", org.jacoco.core.runtime.AgentOptions.OUTPUT, "Ljava/io/OutputStream;", "(Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebViewConfigurationStoreSerializer implements androidx.datastore.core.Serializer<com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore> {
    private final com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore defaultValue;

    public WebViewConfigurationStoreSerializer() {
        com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ java.lang.Object writeTo(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, java.io.OutputStream outputStream, kotlin.coroutines.Continuation continuation) {
        return writeTo2(webViewConfigurationStore, outputStream, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore getDefaultValue() {
        return this.defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    public java.lang.Object readFrom(java.io.InputStream inputStream, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore> continuation) throws java.io.IOException {
        try {
            com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore from = com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(inputStream);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "parseFrom(input)");
            return from;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new androidx.datastore.core.CorruptionException("Cannot read proto.", e);
        }
    }

    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public java.lang.Object writeTo2(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, java.io.OutputStream outputStream, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        webViewConfigurationStore.writeTo(outputStream);
        return kotlin.Unit.INSTANCE;
    }
}
