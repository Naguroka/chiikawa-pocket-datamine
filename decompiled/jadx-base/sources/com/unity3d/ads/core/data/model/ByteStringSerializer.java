package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: ByteStringSerializer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/model/ByteStringSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "()V", "defaultValue", "getDefaultValue", "()Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", org.jacoco.core.runtime.AgentOptions.OUTPUT, "Ljava/io/OutputStream;", "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ByteStringSerializer implements androidx.datastore.core.Serializer<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> {
    private final com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore defaultValue;

    public ByteStringSerializer() {
        com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore defaultInstance = com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.getDefaultInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ java.lang.Object writeTo(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStore, java.io.OutputStream outputStream, kotlin.coroutines.Continuation continuation) {
        return writeTo2(byteStringStore, outputStream, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore getDefaultValue() {
        return this.defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    public java.lang.Object readFrom(java.io.InputStream inputStream, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> continuation) throws java.io.IOException {
        try {
            com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore from = com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.parseFrom(inputStream);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "parseFrom(input)");
            return from;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new androidx.datastore.core.CorruptionException("Cannot read proto.", e);
        }
    }

    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public java.lang.Object writeTo2(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStore, java.io.OutputStream outputStream, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        byteStringStore.writeTo(outputStream);
        return kotlin.Unit.INSTANCE;
    }
}
