package com.google.protobuf;

/* JADX INFO: compiled from: TypeKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\f\u001a)\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"sourceContextOrNull", "Lcom/google/protobuf/SourceContext;", "Lcom/google/protobuf/TypeOrBuilder;", "getSourceContextOrNull", "(Lcom/google/protobuf/TypeOrBuilder;)Lcom/google/protobuf/SourceContext;", "type", "Lcom/google/protobuf/Type;", "block", "Lkotlin/Function1;", "Lcom/google/protobuf/TypeKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializetype", "copy", "protobuf-kotlin-lite"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TypeKtKt {
    /* JADX INFO: renamed from: -initializetype, reason: not valid java name */
    public static final com.google.protobuf.Type m912initializetype(kotlin.jvm.functions.Function1<? super com.google.protobuf.TypeKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.google.protobuf.TypeKt.Dsl.Companion companion = com.google.protobuf.TypeKt.Dsl.INSTANCE;
        com.google.protobuf.Type.Builder builderNewBuilder = com.google.protobuf.Type.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        com.google.protobuf.TypeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final com.google.protobuf.Type copy(com.google.protobuf.Type type, kotlin.jvm.functions.Function1<? super com.google.protobuf.TypeKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.google.protobuf.TypeKt.Dsl.Companion companion = com.google.protobuf.TypeKt.Dsl.INSTANCE;
        com.google.protobuf.Type.Builder builder = type.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        com.google.protobuf.TypeKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final com.google.protobuf.SourceContext getSourceContextOrNull(com.google.protobuf.TypeOrBuilder typeOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeOrBuilder, "<this>");
        if (typeOrBuilder.hasSourceContext()) {
            return typeOrBuilder.getSourceContext();
        }
        return null;
    }
}
