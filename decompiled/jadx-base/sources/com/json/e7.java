package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/ironsource/e7;", "Lcom/ironsource/mediationsdk/model/BasePlacement;", "", "toString", "", com.json.y8.j, com.json.op.d, "", "isDefault", "Lcom/ironsource/hp;", "placementAvailabilitySettings", "<init>", "(ILjava/lang/String;ZLcom/ironsource/hp;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class e7 extends com.json.mediationsdk.model.BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(int i, java.lang.String placementName, boolean z, com.json.hp hpVar) {
        super(i, placementName, z, hpVar);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.json.mediationsdk.model.BasePlacement
    public java.lang.String toString() {
        return super.toString() + ", placementId: " + getPlacementId();
    }
}
