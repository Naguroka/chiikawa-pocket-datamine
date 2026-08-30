package gatewayprotocol.v1;

/* JADX INFO: compiled from: CampaignKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0007\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000e\u001a)\u0010\u000f\u001a\u00020\b*\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"loadTimestampOrNull", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignOrBuilder;", "getLoadTimestampOrNull", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignOrBuilder;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "showTimestampOrNull", "getShowTimestampOrNull", "campaign", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/CampaignKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializecampaign", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CampaignKtKt {
    /* JADX INFO: renamed from: -initializecampaign, reason: not valid java name */
    public static final gatewayprotocol.v1.CampaignStateOuterClass.Campaign m1247initializecampaign(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.CampaignKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.CampaignKt.Dsl.Companion companion = gatewayprotocol.v1.CampaignKt.Dsl.INSTANCE;
        gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builderNewBuilder = gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.CampaignKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.CampaignStateOuterClass.Campaign copy(gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.CampaignKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaign, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.CampaignKt.Dsl.Companion companion = gatewayprotocol.v1.CampaignKt.Dsl.INSTANCE;
        gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.CampaignKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final gatewayprotocol.v1.TimestampsOuterClass.Timestamps getLoadTimestampOrNull(gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasLoadTimestamp()) {
            return campaignOrBuilder.getLoadTimestamp();
        }
        return null;
    }

    public static final gatewayprotocol.v1.TimestampsOuterClass.Timestamps getShowTimestampOrNull(gatewayprotocol.v1.CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasShowTimestamp()) {
            return campaignOrBuilder.getShowTimestamp();
        }
        return null;
    }
}
