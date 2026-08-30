package gatewayprotocol.v1;

/* JADX INFO: compiled from: DiagnosticEventKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\f\u001a)\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"timestampsOrNull", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder;", "getTimestampsOrNull", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "diagnosticEvent", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializediagnosticEvent", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticEventKtKt {
    /* JADX INFO: renamed from: -initializediagnosticEvent, reason: not valid java name */
    public static final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent m1252initializediagnosticEvent(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.DiagnosticEventKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.DiagnosticEventKt.Dsl.Companion companion = gatewayprotocol.v1.DiagnosticEventKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builderNewBuilder = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.DiagnosticEventKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent copy(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.DiagnosticEventKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEvent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.DiagnosticEventKt.Dsl.Companion companion = gatewayprotocol.v1.DiagnosticEventKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder = diagnosticEvent.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.DiagnosticEventKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestampsOrNull(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder diagnosticEventOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEventOrBuilder, "<this>");
        if (diagnosticEventOrBuilder.hasTimestamps()) {
            return diagnosticEventOrBuilder.getTimestamps();
        }
        return null;
    }
}
