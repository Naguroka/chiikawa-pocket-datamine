package com.unity3d.services.store.core;

/* JADX INFO: compiled from: StoreWebViewError.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/core/StoreWebViewError;", "Lcom/unity3d/scar/adapter/common/WebViewAdsError;", "errorCategory", "", "description", "", "errorArguments", "", "", "(Ljava/lang/Enum;Ljava/lang/String;[Ljava/lang/Object;)V", "getDomain", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StoreWebViewError extends com.unity3d.scar.adapter.common.WebViewAdsError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(java.lang.Enum<?> r2, java.lang.String str, java.lang.Object... errorArguments) {
        super(r2, str, java.util.Arrays.copyOf(errorArguments, errorArguments.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorArguments, "errorArguments");
    }

    @Override // com.unity3d.scar.adapter.common.WebViewAdsError, com.unity3d.scar.adapter.common.IUnityAdsError
    public java.lang.String getDomain() {
        return com.unity3d.services.core.webview.WebViewEventCategory.STORE.name();
    }
}
