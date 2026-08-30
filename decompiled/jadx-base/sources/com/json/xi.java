package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/xi;", "", "", "onAdInstanceDidShow", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "onAdInstanceDidFailedToShow", "onAdInstanceDidBecomeVisible", "onAdInstanceDidDismiss", "onAdInstanceDidClick", "", "demandSourceId", "", "amount", "onAdInstanceDidReward", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface xi {
    void onAdInstanceDidBecomeVisible();

    void onAdInstanceDidClick();

    void onAdInstanceDidDismiss();

    void onAdInstanceDidFailedToShow(com.json.mediationsdk.logger.IronSourceError error);

    void onAdInstanceDidReward(java.lang.String demandSourceId, int amount);

    void onAdInstanceDidShow();
}
