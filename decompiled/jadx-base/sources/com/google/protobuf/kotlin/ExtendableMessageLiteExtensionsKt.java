package com.google.protobuf.kotlin;

/* JADX INFO: compiled from: ExtendableMessageLiteExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\u0000\u001a\u00020\u0001\"\u0012\b\u0000\u0010\u0002*\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u00030\u0003\"\u0012\b\u0001\u0010\u0004*\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u00030\u0005*\u0002H\u00042\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u00030\u0007H\u0086\u0002¢\u0006\u0002\u0010\b\u001aX\u0010\t\u001a\u0002H\n\"\u0012\b\u0000\u0010\u0002*\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u00030\u0003\"\u0012\b\u0001\u0010\u000b*\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u00030\u0005\"\b\b\u0002\u0010\n*\u00020\f*\u0002H\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0007H\u0086\u0002¢\u0006\u0002\u0010\r\u001ad\u0010\u000e\u001a\u00020\u000f\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00100\u0003\"\u0014\b\u0001\u0010\u0010*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00100\u0011\"\b\b\u0002\u0010\n*\u00020\f*\u0002H\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u00072\u0006\u0010\u0012\u001a\u0002H\nH\u0086\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"contains", "", "M", "Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessage;", "MorBT", "Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessageOrBuilder;", "extension", "Lcom/google/protobuf/ExtensionLite;", "(Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessageOrBuilder;Lcom/google/protobuf/ExtensionLite;)Z", "get", "T", "MOrBT", "", "(Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessageOrBuilder;Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;", "set", "", "B", "Lcom/google/protobuf/GeneratedMessageLite$ExtendableBuilder;", "value", "(Lcom/google/protobuf/GeneratedMessageLite$ExtendableBuilder;Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)V", "protobuf-kotlin-lite"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ExtendableMessageLiteExtensionsKt {
    public static final <M extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<M, ?>, MOrBT extends com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>, T> T get(MOrBT morbt, com.google.protobuf.ExtensionLite<M, T> extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(morbt, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "extension");
        T t = (T) morbt.getExtension(extension);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(t, "getExtension(extension)");
        return t;
    }

    public static final <M extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<M, B>, B extends com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<M, B>, T> void set(B b, com.google.protobuf.ExtensionLite<M, T> extension, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "extension");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        b.setExtension(extension, value);
    }

    public static final <M extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<M, ?>, MorBT extends com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>> boolean contains(MorBT morbt, com.google.protobuf.ExtensionLite<M, ?> extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(morbt, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "extension");
        return morbt.hasExtension(extension);
    }
}
