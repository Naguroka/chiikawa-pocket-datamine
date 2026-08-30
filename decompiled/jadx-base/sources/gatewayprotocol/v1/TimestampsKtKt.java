package gatewayprotocol.v1;

/* JADX INFO: compiled from: TimestampsKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\f\u001a)\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"timestampOrNull", "Lcom/google/protobuf/Timestamp;", "Lgatewayprotocol/v1/TimestampsOuterClass$TimestampsOrBuilder;", "getTimestampOrNull", "(Lgatewayprotocol/v1/TimestampsOuterClass$TimestampsOrBuilder;)Lcom/google/protobuf/Timestamp;", "timestamps", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/TimestampsKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializetimestamps", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TimestampsKtKt {
    /* JADX INFO: renamed from: -initializetimestamps, reason: not valid java name */
    public static final gatewayprotocol.v1.TimestampsOuterClass.Timestamps m1287initializetimestamps(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.TimestampsKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.TimestampsKt.Dsl.Companion companion = gatewayprotocol.v1.TimestampsKt.Dsl.INSTANCE;
        gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder builderNewBuilder = gatewayprotocol.v1.TimestampsOuterClass.Timestamps.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.TimestampsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.TimestampsOuterClass.Timestamps copy(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.TimestampsKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timestamps, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.TimestampsKt.Dsl.Companion companion = gatewayprotocol.v1.TimestampsKt.Dsl.INSTANCE;
        gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder builder = timestamps.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.TimestampsKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final com.google.protobuf.Timestamp getTimestampOrNull(gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder timestampsOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timestampsOrBuilder, "<this>");
        if (timestampsOrBuilder.hasTimestamp()) {
            return timestampsOrBuilder.getTimestamp();
        }
        return null;
    }
}
