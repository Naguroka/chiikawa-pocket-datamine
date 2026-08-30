package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface q {
    static com.five_corp.ad.internal.q a(final com.five_corp.ad.FiveAdCustomLayoutEventListener fiveAdCustomLayoutEventListener, final com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
        return new com.five_corp.ad.internal.q() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda1
            @Override // com.five_corp.ad.internal.q
            public final void a() {
                fiveAdCustomLayoutEventListener.onRemove(fiveAdCustomLayout);
            }
        };
    }

    void a();

    static com.five_corp.ad.internal.q a(final com.five_corp.ad.FiveAdNativeEventListener fiveAdNativeEventListener, final com.five_corp.ad.FiveAdNative fiveAdNative) {
        return new com.five_corp.ad.internal.q() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda0
            @Override // com.five_corp.ad.internal.q
            public final void a() {
                fiveAdNativeEventListener.onRemove(fiveAdNative);
            }
        };
    }
}
