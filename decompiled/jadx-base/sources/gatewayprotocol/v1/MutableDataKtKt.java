package gatewayprotocol.v1;

/* JADX INFO: compiled from: MutableDataKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0010\u001a)\u0010\u0011\u001a\u00020\n*\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"allowedPiiOrNull", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableDataOrBuilder;", "getAllowedPiiOrNull", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableDataOrBuilder;)Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "sessionCountersOrNull", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableDataOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "mutableData", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/MutableDataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializemutableData", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MutableDataKtKt {
    /* JADX INFO: renamed from: -initializemutableData, reason: not valid java name */
    public static final gatewayprotocol.v1.MutableDataOuterClass.MutableData m1270initializemutableData(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.MutableDataKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.MutableDataKt.Dsl.Companion companion = gatewayprotocol.v1.MutableDataKt.Dsl.INSTANCE;
        gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder builderNewBuilder = gatewayprotocol.v1.MutableDataOuterClass.MutableData.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.MutableDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.MutableDataOuterClass.MutableData copy(gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.MutableDataKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableData, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.MutableDataKt.Dsl.Companion companion = gatewayprotocol.v1.MutableDataKt.Dsl.INSTANCE;
        gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder builder = mutableData.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.MutableDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasSessionCounters()) {
            return mutableDataOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(gatewayprotocol.v1.MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasAllowedPii()) {
            return mutableDataOrBuilder.getAllowedPii();
        }
        return null;
    }
}
