package gatewayprotocol.v1;

/* JADX INFO: compiled from: NativeConfigurationKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0017\u001a\u00020\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001dH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u001e\u001a)\u0010\u001f\u001a\u00020\u0018*\u00020\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001dH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\b\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\b\"\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"adOperationsOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfigurationOrBuilder;", "getAdOperationsOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfigurationOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "adPolicyOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "getAdPolicyOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfigurationOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "diagnosticEventsOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "getDiagnosticEventsOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfigurationOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "featureFlagsOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlagsOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfigurationOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "initPolicyOrNull", "getInitPolicyOrNull", "operativeEventPolicyOrNull", "getOperativeEventPolicyOrNull", "otherPolicyOrNull", "getOtherPolicyOrNull", "nativeConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializenativeConfiguration", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NativeConfigurationKtKt {
    /* JADX INFO: renamed from: -initializenativeConfiguration, reason: not valid java name */
    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration m1271initializenativeConfiguration(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.NativeConfigurationKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.NativeConfigurationKt.Dsl.Companion companion = gatewayprotocol.v1.NativeConfigurationKt.Dsl.INSTANCE;
        gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder builderNewBuilder = gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.NativeConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration copy(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.NativeConfigurationKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeConfiguration, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.NativeConfigurationKt.Dsl.Companion companion = gatewayprotocol.v1.NativeConfigurationKt.Dsl.INSTANCE;
        gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.NativeConfigurationKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEventsOrNull(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasDiagnosticEvents()) {
            return nativeConfigurationOrBuilder.getDiagnosticEvents();
        }
        return null;
    }

    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getInitPolicyOrNull(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasInitPolicy()) {
            return nativeConfigurationOrBuilder.getInitPolicy();
        }
        return null;
    }

    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getAdPolicyOrNull(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasAdPolicy()) {
            return nativeConfigurationOrBuilder.getAdPolicy();
        }
        return null;
    }

    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicyOrNull(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasOperativeEventPolicy()) {
            return nativeConfigurationOrBuilder.getOperativeEventPolicy();
        }
        return null;
    }

    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOtherPolicyOrNull(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasOtherPolicy()) {
            return nativeConfigurationOrBuilder.getOtherPolicy();
        }
        return null;
    }

    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperationsOrNull(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasAdOperations()) {
            return nativeConfigurationOrBuilder.getAdOperations();
        }
        return null;
    }

    public static final gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags getFeatureFlagsOrNull(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasFeatureFlags()) {
            return nativeConfigurationOrBuilder.getFeatureFlags();
        }
        return null;
    }
}
