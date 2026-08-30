package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: InitializationState.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/model/InitializationState;", "", "(Ljava/lang/String;I)V", "toString", "", "NOT_INITIALIZED", "INITIALIZING", "INITIALIZED", "FAILED", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum InitializationState {
    NOT_INITIALIZED,
    INITIALIZING,
    INITIALIZED,
    FAILED;

    @Override // java.lang.Enum
    public java.lang.String toString() {
        java.lang.String string = super.toString();
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        java.lang.String lowerCase = string.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
