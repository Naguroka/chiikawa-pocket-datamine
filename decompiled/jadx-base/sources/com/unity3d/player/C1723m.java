package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1723m implements com.google.android.gms.tasks.OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.IAssetPackManagerStatusQueryCallback f3935a;
    private android.os.Looper b = android.os.Looper.myLooper();
    private java.lang.String[] c;

    public C1723m(java.lang.String[] strArr, com.unity3d.player.IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        this.f3935a = iAssetPackManagerStatusQueryCallback;
        this.c = strArr;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task task) {
        int errorCode;
        if (this.f3935a == null) {
            return;
        }
        int i = 0;
        try {
            com.google.android.play.core.assetpacks.AssetPackStates assetPackStates = (com.google.android.play.core.assetpacks.AssetPackStates) task.getResult();
            java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.AssetPackState> mapPackStates = assetPackStates.packStates();
            int size = mapPackStates.size();
            java.lang.String[] strArr = new java.lang.String[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (com.google.android.play.core.assetpacks.AssetPackState assetPackState : mapPackStates.values()) {
                strArr[i] = assetPackState.name();
                iArr[i] = assetPackState.status();
                iArr2[i] = assetPackState.errorCode();
                i++;
            }
            new android.os.Handler(this.b).post(new com.unity3d.player.RunnableC1721l(this.f3935a, assetPackStates.totalBytes(), strArr, iArr, iArr2));
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e) {
            e = e;
            java.lang.String message = e.getMessage();
            java.lang.String[] strArr2 = this.c;
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                int errorCode2 = -100;
                if (i2 >= length) {
                    java.lang.String[] strArr3 = this.c;
                    int[] iArr3 = new int[strArr3.length];
                    int[] iArr4 = new int[strArr3.length];
                    for (int i3 = 0; i3 < this.c.length; i3++) {
                        iArr3[i3] = 0;
                        java.lang.Throwable cause = e;
                        while (true) {
                            if (cause instanceof com.google.android.play.core.assetpacks.AssetPackException) {
                                errorCode = ((com.google.android.play.core.assetpacks.AssetPackException) cause).getErrorCode();
                                break;
                            }
                            cause = cause.getCause();
                            if (cause == null) {
                                errorCode = -100;
                                break;
                            }
                        }
                        iArr4[i3] = errorCode;
                    }
                    new android.os.Handler(this.b).post(new com.unity3d.player.RunnableC1721l(this.f3935a, 0L, this.c, iArr3, iArr4));
                    return;
                }
                java.lang.String str = strArr2[i2];
                if (message.contains(str)) {
                    android.os.Handler handler = new android.os.Handler(this.b);
                    com.unity3d.player.IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback = this.f3935a;
                    java.lang.String[] strArr4 = {str};
                    int[] iArr5 = {0};
                    int[] iArr6 = new int[1];
                    while (!(e instanceof com.google.android.play.core.assetpacks.AssetPackException)) {
                        e = e.getCause();
                        if (e == null) {
                            iArr6[0] = errorCode2;
                            handler.post(new com.unity3d.player.RunnableC1721l(iAssetPackManagerStatusQueryCallback, 0L, strArr4, iArr5, iArr6));
                            return;
                        }
                    }
                    errorCode2 = ((com.google.android.play.core.assetpacks.AssetPackException) e).getErrorCode();
                    iArr6[0] = errorCode2;
                    handler.post(new com.unity3d.player.RunnableC1721l(iAssetPackManagerStatusQueryCallback, 0L, strArr4, iArr5, iArr6));
                    return;
                }
                i2++;
            }
        }
    }
}
