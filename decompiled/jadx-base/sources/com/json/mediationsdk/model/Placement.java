package com.json.mediationsdk.model;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B;\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ironsource/mediationsdk/model/Placement;", "Lcom/ironsource/mediationsdk/model/BasePlacement;", "", "toString", "<set-?>", "e", "Ljava/lang/String;", "getRewardName", "()Ljava/lang/String;", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME, "", "f", "I", "getRewardAmount", "()I", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, com.json.y8.j, com.json.op.d, "", "isDefault", "Lcom/ironsource/hp;", "placementAvailabilitySettings", "<init>", "(ILjava/lang/String;ZLjava/lang/String;ILcom/ironsource/hp;)V", "placement", "(Lcom/ironsource/mediationsdk/model/BasePlacement;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class Placement extends com.json.mediationsdk.model.BasePlacement {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private java.lang.String rewardName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int rewardAmount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(int i, java.lang.String placementName, boolean z, java.lang.String rewardName, int i2, com.json.hp hpVar) {
        super(i, placementName, z, hpVar);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.rewardAmount = i2;
        this.rewardName = rewardName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(com.json.mediationsdk.model.BasePlacement placement) {
        super(placement.getPlacementId(), placement.getPlacementName(), placement.getIsDefault(), placement.getPlacementAvailabilitySettings());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        this.rewardName = "";
    }

    public final int getRewardAmount() {
        return this.rewardAmount;
    }

    public final java.lang.String getRewardName() {
        return this.rewardName;
    }

    @Override // com.json.mediationsdk.model.BasePlacement
    public java.lang.String toString() {
        return super.toString() + ", reward name: " + this.rewardName + " , amount: " + this.rewardAmount;
    }
}
