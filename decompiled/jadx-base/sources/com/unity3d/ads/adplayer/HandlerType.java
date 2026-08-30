package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: HandlerType.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/adplayer/HandlerType;", "", "jsPath", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getJsPath", "()Ljava/lang/String;", "CALLBACK", "INVOCATION", "EVENT", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum HandlerType {
    CALLBACK("handleCallback"),
    INVOCATION("handleInvocation"),
    EVENT("handleEvent");

    private final java.lang.String jsPath;

    HandlerType(java.lang.String str) {
        this.jsPath = str;
    }

    public final java.lang.String getJsPath() {
        return this.jsPath;
    }
}
