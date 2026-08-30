package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: CampaignRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "", "getCampaign", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "opportunityId", "Lcom/google/protobuf/ByteString;", "getCampaignState", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "removeState", "", "setCampaign", "campaign", "setLoadTimestamp", "setShowTimestamp", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CampaignRepository {
    gatewayprotocol.v1.CampaignStateOuterClass.Campaign getCampaign(com.google.protobuf.ByteString opportunityId);

    gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState();

    void removeState(com.google.protobuf.ByteString opportunityId);

    void setCampaign(com.google.protobuf.ByteString opportunityId, gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign);

    void setLoadTimestamp(com.google.protobuf.ByteString opportunityId);

    void setShowTimestamp(com.google.protobuf.ByteString opportunityId);
}
