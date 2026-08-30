package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.amoad.AMoAdNativeListener f228a;

    /* JADX INFO: renamed from: com.amoad.ao$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f229a;

        static {
            int[] iArr = new int[com.amoad.Result.values().length];
            f229a = iArr;
            try {
                iArr[com.amoad.Result.Success.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f229a[com.amoad.Result.Empty.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f229a[com.amoad.Result.Failure.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    ao(com.amoad.AMoAdNativeListener aMoAdNativeListener) {
        this.f228a = aMoAdNativeListener;
    }

    static com.amoad.AMoAdNativeListener.Result a(com.amoad.Result result) {
        int i = com.amoad.ao.AnonymousClass1.f229a[result.ordinal()];
        if (i != 1) {
            return i != 2 ? com.amoad.AMoAdNativeListener.Result.Failure : com.amoad.AMoAdNativeListener.Result.Empty;
        }
        return com.amoad.AMoAdNativeListener.Result.Success;
    }

    void a(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.Result result) {
        com.amoad.AMoAdNativeListener aMoAdNativeListener = this.f228a;
        if (aMoAdNativeListener != null) {
            aMoAdNativeListener.onReceived(str, str2, view, a(result));
        }
    }

    void a(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.Result result, com.amoad.AMoAdError aMoAdError) {
        com.amoad.AMoAdNativeListener aMoAdNativeListener = this.f228a;
        if (aMoAdNativeListener != null) {
            aMoAdNativeListener.onImageReceived(str, str2, view, a(result));
        }
    }
}
