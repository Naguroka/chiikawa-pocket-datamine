package com.google.protobuf;

/* JADX INFO: compiled from: ValueKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0010\u001a)\u0010\u0011\u001a\u00020\n*\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"listValueOrNull", "Lcom/google/protobuf/ListValue;", "Lcom/google/protobuf/ValueOrBuilder;", "getListValueOrNull", "(Lcom/google/protobuf/ValueOrBuilder;)Lcom/google/protobuf/ListValue;", "structValueOrNull", "Lcom/google/protobuf/Struct;", "getStructValueOrNull", "(Lcom/google/protobuf/ValueOrBuilder;)Lcom/google/protobuf/Struct;", "value", "Lcom/google/protobuf/Value;", "block", "Lkotlin/Function1;", "Lcom/google/protobuf/ValueKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializevalue", "copy", "protobuf-kotlin-lite"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ValueKtKt {
    /* JADX INFO: renamed from: -initializevalue, reason: not valid java name */
    public static final com.google.protobuf.Value m915initializevalue(kotlin.jvm.functions.Function1<? super com.google.protobuf.ValueKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.google.protobuf.ValueKt.Dsl.Companion companion = com.google.protobuf.ValueKt.Dsl.INSTANCE;
        com.google.protobuf.Value.Builder builderNewBuilder = com.google.protobuf.Value.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        com.google.protobuf.ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final com.google.protobuf.Value copy(com.google.protobuf.Value value, kotlin.jvm.functions.Function1<? super com.google.protobuf.ValueKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.google.protobuf.ValueKt.Dsl.Companion companion = com.google.protobuf.ValueKt.Dsl.INSTANCE;
        com.google.protobuf.Value.Builder builder = value.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        com.google.protobuf.ValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final com.google.protobuf.Struct getStructValueOrNull(com.google.protobuf.ValueOrBuilder valueOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasStructValue()) {
            return valueOrBuilder.getStructValue();
        }
        return null;
    }

    public static final com.google.protobuf.ListValue getListValueOrNull(com.google.protobuf.ValueOrBuilder valueOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasListValue()) {
            return valueOrBuilder.getListValue();
        }
        return null;
    }
}
