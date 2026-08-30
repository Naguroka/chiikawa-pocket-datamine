package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidHandleOpenUrl.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleOpenUrl;", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "invoke", "", "url", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidHandleOpenUrl implements com.unity3d.ads.core.domain.HandleOpenUrl {
    private final android.content.Context context;

    public AndroidHandleOpenUrl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    public void invoke(java.lang.String url, java.lang.String packageName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        android.content.Intent intent = new android.content.Intent();
        if (packageName == null) {
            packageName = null;
        } else {
            if (!(packageName.length() > 0)) {
                packageName = null;
            }
        }
        intent.setPackage(packageName);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(url));
        intent.setFlags(268435456);
        this.context.startActivity(intent);
    }
}
