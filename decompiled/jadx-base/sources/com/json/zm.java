package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0010¢\u0006\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/ironsource/zm;", "Lcom/ironsource/c1;", "", "adUnitId", "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "<init>", "(Ljava/lang/String;Lcom/ironsource/mediationsdk/model/Placement;)V", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class zm extends com.json.c1 {
    /* JADX WARN: Multi-variable type inference failed */
    public zm() {
        this("", null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(java.lang.String adUnitId, com.json.mediationsdk.model.Placement placement) {
        super(com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD, adUnitId, placement, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public /* synthetic */ zm(java.lang.String str, com.json.mediationsdk.model.Placement placement, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : placement);
    }
}
