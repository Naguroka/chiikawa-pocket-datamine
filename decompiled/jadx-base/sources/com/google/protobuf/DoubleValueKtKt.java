package com.google.protobuf;

/* JADX INFO: compiled from: DoubleValueKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"doubleValue", "Lcom/google/protobuf/DoubleValue;", "block", "Lkotlin/Function1;", "Lcom/google/protobuf/DoubleValueKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializedoubleValue", "copy", "protobuf-kotlin-lite"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DoubleValueKtKt {
    /* JADX INFO: renamed from: -initializedoubleValue, reason: not valid java name */
    public static final com.google.protobuf.DoubleValue m893initializedoubleValue(kotlin.jvm.functions.Function1<? super com.google.protobuf.DoubleValueKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.google.protobuf.DoubleValueKt.Dsl.Companion companion = com.google.protobuf.DoubleValueKt.Dsl.INSTANCE;
        com.google.protobuf.DoubleValue.Builder builderNewBuilder = com.google.protobuf.DoubleValue.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        com.google.protobuf.DoubleValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final com.google.protobuf.DoubleValue copy(com.google.protobuf.DoubleValue doubleValue, kotlin.jvm.functions.Function1<? super com.google.protobuf.DoubleValueKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(doubleValue, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.google.protobuf.DoubleValueKt.Dsl.Companion companion = com.google.protobuf.DoubleValueKt.Dsl.INSTANCE;
        com.google.protobuf.DoubleValue.Builder builder = doubleValue.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        com.google.protobuf.DoubleValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
