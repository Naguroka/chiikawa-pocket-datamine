package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: AndroidCampaignRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0016R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidCampaignRepository;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "getSharedDataTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;)V", "campaigns", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "getCampaign", "opportunityId", "Lcom/google/protobuf/ByteString;", "getCampaignState", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "removeState", "", "setCampaign", "campaign", "setLoadTimestamp", "setShowTimestamp", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidCampaignRepository implements com.unity3d.ads.core.data.repository.CampaignRepository {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, gatewayprotocol.v1.CampaignStateOuterClass.Campaign>> campaigns;
    private final com.unity3d.ads.core.domain.GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(com.unity3d.ads.core.domain.GetSharedDataTimestamps getSharedDataTimestamps) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.campaigns = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.MapsKt.emptyMap());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setCampaign(com.google.protobuf.ByteString opportunityId, gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign) {
        java.util.Map<java.lang.String, gatewayprotocol.v1.CampaignStateOuterClass.Campaign> value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaign, "campaign");
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, gatewayprotocol.v1.CampaignStateOuterClass.Campaign>> mutableStateFlow = this.campaigns;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.MapsKt.plus(value, kotlin.TuplesKt.to(opportunityId.toStringUtf8(), campaign))));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setShowTimestamp(com.google.protobuf.ByteString opportunityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            gatewayprotocol.v1.CampaignKt.Dsl.Companion companion = gatewayprotocol.v1.CampaignKt.Dsl.INSTANCE;
            gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            gatewayprotocol.v1.CampaignKt.Dsl dsl_create = companion._create(builder);
            dsl_create.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            setCampaign(opportunityId, dsl_create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public gatewayprotocol.v1.CampaignStateOuterClass.Campaign getCampaign(com.google.protobuf.ByteString opportunityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        return this.campaigns.getValue().get(opportunityId.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void removeState(com.google.protobuf.ByteString opportunityId) {
        java.util.Map<java.lang.String, gatewayprotocol.v1.CampaignStateOuterClass.Campaign> value;
        java.lang.String stringUtf8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, gatewayprotocol.v1.CampaignStateOuterClass.Campaign>> mutableStateFlow = this.campaigns;
        do {
            value = mutableStateFlow.getValue();
            stringUtf8 = opportunityId.toStringUtf8();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.MapsKt.minus(value, stringUtf8)));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setLoadTimestamp(com.google.protobuf.ByteString opportunityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            gatewayprotocol.v1.CampaignKt.Dsl.Companion companion = gatewayprotocol.v1.CampaignKt.Dsl.INSTANCE;
            gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            gatewayprotocol.v1.CampaignKt.Dsl dsl_create = companion._create(builder);
            dsl_create.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            setCampaign(opportunityId, dsl_create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState() {
        java.util.Collection<gatewayprotocol.v1.CampaignStateOuterClass.Campaign> collectionValues = this.campaigns.getValue().values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : collectionValues) {
            if (((gatewayprotocol.v1.CampaignStateOuterClass.Campaign) obj).hasShowTimestamp()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
        java.util.List list = (java.util.List) pair.component1();
        java.util.List list2 = (java.util.List) pair.component2();
        gatewayprotocol.v1.CampaignStateKt.Dsl.Companion companion = gatewayprotocol.v1.CampaignStateKt.Dsl.INSTANCE;
        gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder builderNewBuilder = gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.CampaignStateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllShownCampaigns(dsl_create.getShownCampaigns(), list);
        dsl_create.addAllLoadedCampaigns(dsl_create.getLoadedCampaigns(), list2);
        return dsl_create._build();
    }
}
