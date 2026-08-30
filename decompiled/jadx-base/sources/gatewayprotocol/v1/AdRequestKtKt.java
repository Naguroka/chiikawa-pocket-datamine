package gatewayprotocol.v1;

/* JADX INFO: compiled from: AdRequestKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0015\u001a\u00020\u00162\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0002\b\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u001c\u001a)\u0010\u001d\u001a\u00020\u0016*\u00020\u00162\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0002\b\u001bH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"bannerSizeOrNull", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;", "getBannerSizeOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "campaignStateOrNull", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignStateOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "sessionCountersOrNull", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "adRequest", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/AdRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeadRequest", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AdRequestKtKt {
    /* JADX INFO: renamed from: -initializeadRequest, reason: not valid java name */
    public static final gatewayprotocol.v1.AdRequestOuterClass.AdRequest m1243initializeadRequest(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.AdRequestKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.AdRequestKt.Dsl.Companion companion = gatewayprotocol.v1.AdRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder builderNewBuilder = gatewayprotocol.v1.AdRequestOuterClass.AdRequest.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.AdRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.AdRequestOuterClass.AdRequest copy(gatewayprotocol.v1.AdRequestOuterClass.AdRequest adRequest, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.AdRequestKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.AdRequestKt.Dsl.Companion companion = gatewayprotocol.v1.AdRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder builder = adRequest.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.AdRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasSessionCounters()) {
            return adRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasStaticDeviceInfo()) {
            return adRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignStateOrNull(gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasCampaignState()) {
            return adRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final gatewayprotocol.v1.AdRequestOuterClass.BannerSize getBannerSizeOrNull(gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasBannerSize()) {
            return adRequestOrBuilder.getBannerSize();
        }
        return null;
    }
}
