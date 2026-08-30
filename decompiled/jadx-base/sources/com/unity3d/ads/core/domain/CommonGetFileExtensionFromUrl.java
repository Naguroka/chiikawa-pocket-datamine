package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: CommonGetFileExtensionFromUrl.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetFileExtensionFromUrl;", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "removeUrlQuery", "Lcom/unity3d/ads/core/domain/RemoveUrlQuery;", "(Lcom/unity3d/ads/core/domain/RemoveUrlQuery;)V", "getRemoveUrlQuery", "()Lcom/unity3d/ads/core/domain/RemoveUrlQuery;", "invoke", "", "url", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonGetFileExtensionFromUrl implements com.unity3d.ads.core.domain.GetFileExtensionFromUrl {
    private final com.unity3d.ads.core.domain.RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(com.unity3d.ads.core.domain.RemoveUrlQuery removeUrlQuery) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeUrlQuery, "removeUrlQuery");
        this.removeUrlQuery = removeUrlQuery;
    }

    public final com.unity3d.ads.core.domain.RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    public java.lang.String invoke(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.lang.String strInvoke = this.removeUrlQuery.invoke(url);
        if (strInvoke == null) {
            return null;
        }
        java.lang.String strSubstringAfterLast$default = kotlin.text.StringsKt.substringAfterLast$default(strInvoke, '/', (java.lang.String) null, 2, (java.lang.Object) null);
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) strSubstringAfterLast$default, '.', false, 2, (java.lang.Object) null)) {
            return null;
        }
        java.lang.String strSubstringAfterLast$default2 = kotlin.text.StringsKt.substringAfterLast$default(strSubstringAfterLast$default, '.', (java.lang.String) null, 2, (java.lang.Object) null);
        return strSubstringAfterLast$default2.length() == 0 ? null : strSubstringAfterLast$default2;
    }
}
