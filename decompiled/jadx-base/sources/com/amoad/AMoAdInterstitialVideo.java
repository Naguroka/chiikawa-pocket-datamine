package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class AMoAdInterstitialVideo {
    private static final java.util.Map<java.lang.String, com.amoad.AMoAdInterstitialVideo> b = new java.util.HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.amoad.AMoAdNativeMainVideoView f120a;
    private final java.lang.String c;
    private final java.lang.String d;
    private com.amoad.AMoAdInterstitialVideo.Listener f;
    private boolean h;
    private boolean j;
    private boolean g = true;
    private com.amoad.AMoAdNativeListener i = new com.amoad.AMoAdNativeListener() { // from class: com.amoad.AMoAdInterstitialVideo.1
        @Override // com.amoad.AMoAdNativeListener
        public final void onClicked(java.lang.String str, java.lang.String str2, android.view.View view) {
            com.amoad.AMoAdInterstitialVideo.a(com.amoad.AMoAdInterstitialVideo.this);
        }

        @Override // com.amoad.AMoAdNativeListener
        public final void onIconReceived(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.AMoAdNativeListener.Result result) {
        }

        @Override // com.amoad.AMoAdNativeListener
        public final void onImageReceived(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.AMoAdNativeListener.Result result) {
            com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo;
            com.amoad.AdResult adResult;
            com.amoad.AMoAdInterstitialVideo.this.h = result == com.amoad.AMoAdNativeListener.Result.Success;
            int i = com.amoad.AMoAdInterstitialVideo.AnonymousClass2.f123a[result.ordinal()];
            if (i == 1) {
                aMoAdInterstitialVideo = com.amoad.AMoAdInterstitialVideo.this;
                adResult = com.amoad.AdResult.Success;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    com.amoad.AMoAdInterstitialVideo.a(com.amoad.AMoAdInterstitialVideo.this, com.amoad.AdResult.Empty);
                    return;
                }
                aMoAdInterstitialVideo = com.amoad.AMoAdInterstitialVideo.this;
                adResult = com.amoad.AdResult.Failure;
            }
            com.amoad.AMoAdInterstitialVideo.a(aMoAdInterstitialVideo, adResult);
        }

        @Override // com.amoad.AMoAdNativeListener
        public final void onReceived(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.AMoAdNativeListener.Result result) {
            int i = com.amoad.AMoAdInterstitialVideo.AnonymousClass2.f123a[result.ordinal()];
            if (i == 2) {
                com.amoad.AMoAdInterstitialVideo.a(com.amoad.AMoAdInterstitialVideo.this, com.amoad.AdResult.Failure);
            } else {
                if (i != 3) {
                    return;
                }
                com.amoad.AMoAdInterstitialVideo.a(com.amoad.AMoAdInterstitialVideo.this, com.amoad.AdResult.Empty);
            }
        }
    };
    private com.amoad.NativeVideoView.b k = new com.amoad.NativeVideoView.b() { // from class: com.amoad.AMoAdInterstitialVideo.3
        @Override // com.amoad.NativeVideoView.b
        public final void a(com.amoad.NativeVideoView.State state) {
            int i = com.amoad.AMoAdInterstitialVideo.AnonymousClass2.b[state.ordinal()];
            if (i == 1) {
                com.amoad.AMoAdInterstitialVideo.b(com.amoad.AMoAdInterstitialVideo.this);
            } else if (i == 2) {
                com.amoad.AMoAdInterstitialVideo.c(com.amoad.AMoAdInterstitialVideo.this);
            } else {
                if (i != 3) {
                    return;
                }
                com.amoad.AMoAdInterstitialVideo.this.a();
            }
        }
    };
    private final android.os.Handler e = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: com.amoad.AMoAdInterstitialVideo$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f123a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.amoad.NativeVideoView.State.values().length];
            b = iArr;
            try {
                iArr[com.amoad.NativeVideoView.State.Playing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                b[com.amoad.NativeVideoView.State.PlaybackCompleted.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                b[com.amoad.NativeVideoView.State.Error.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.amoad.AMoAdNativeListener.Result.values().length];
            f123a = iArr2;
            try {
                iArr2[com.amoad.AMoAdNativeListener.Result.Success.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f123a[com.amoad.AMoAdNativeListener.Result.Failure.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f123a[com.amoad.AMoAdNativeListener.Result.Empty.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public interface Listener {
        void onClick(com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo);

        void onComplete(com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo);

        void onDismissed(com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo);

        void onFailed(com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo);

        void onLoad(com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo, com.amoad.AdResult adResult);

        void onShown(com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo);

        void onStart(com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo);
    }

    private AMoAdInterstitialVideo(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.c = str;
        this.d = str2;
        com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView = new com.amoad.AMoAdNativeMainVideoView(context.getApplicationContext());
        aMoAdNativeMainVideoView.setTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_MAIN_VIDEO);
        aMoAdNativeMainVideoView.c = true;
        aMoAdNativeMainVideoView.b.g = false;
        aMoAdNativeMainVideoView.b.f174a.c = true;
        this.f120a = aMoAdNativeMainVideoView;
        aMoAdNativeMainVideoView.b.a(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        final com.amoad.AMoAdInterstitialVideo.Listener listener = this.f;
        this.e.post(new java.lang.Runnable() { // from class: com.amoad.AMoAdInterstitialVideo.7
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdInterstitialVideo.Listener listener2 = listener;
                if (listener2 != null) {
                    listener2.onFailed(com.amoad.AMoAdInterstitialVideo.this);
                }
            }
        });
    }

    private void a(android.content.Context context) {
        this.h = false;
        com.amoad.AMoAdNativeViewManager.getInstance(context).clearAd(this.c, this.d);
    }

    private void a(android.content.Context context, com.amoad.bk bkVar) {
        com.amoad.NativeVideoView nativeVideoView = this.f120a.b;
        com.amoad.l.a(context, bkVar, com.amoad.l.a(nativeVideoView), nativeVideoView.f174a.f(), nativeVideoView.h());
    }

    static /* synthetic */ void a(com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo) {
        final com.amoad.AMoAdInterstitialVideo.Listener listener = aMoAdInterstitialVideo.f;
        aMoAdInterstitialVideo.e.post(new java.lang.Runnable() { // from class: com.amoad.AMoAdInterstitialVideo.10
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdInterstitialVideo.Listener listener2 = listener;
                if (listener2 != null) {
                    listener2.onClick(com.amoad.AMoAdInterstitialVideo.this);
                }
            }
        });
    }

    static /* synthetic */ void a(com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo, final com.amoad.AdResult adResult) {
        final com.amoad.AMoAdInterstitialVideo.Listener listener = aMoAdInterstitialVideo.f;
        aMoAdInterstitialVideo.e.post(new java.lang.Runnable() { // from class: com.amoad.AMoAdInterstitialVideo.4
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdInterstitialVideo.Listener listener2 = listener;
                if (listener2 != null) {
                    listener2.onLoad(com.amoad.AMoAdInterstitialVideo.this, adResult);
                }
            }
        });
    }

    static /* synthetic */ void b(com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo) {
        final com.amoad.AMoAdInterstitialVideo.Listener listener = aMoAdInterstitialVideo.f;
        aMoAdInterstitialVideo.e.post(new java.lang.Runnable() { // from class: com.amoad.AMoAdInterstitialVideo.5
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdInterstitialVideo.Listener listener2 = listener;
                if (listener2 != null) {
                    listener2.onStart(com.amoad.AMoAdInterstitialVideo.this);
                }
            }
        });
    }

    static /* synthetic */ void c(com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo) {
        final com.amoad.AMoAdInterstitialVideo.Listener listener = aMoAdInterstitialVideo.f;
        aMoAdInterstitialVideo.e.post(new java.lang.Runnable() { // from class: com.amoad.AMoAdInterstitialVideo.6
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdInterstitialVideo.Listener listener2 = listener;
                if (listener2 != null) {
                    listener2.onComplete(com.amoad.AMoAdInterstitialVideo.this);
                }
            }
        });
    }

    public static com.amoad.AMoAdInterstitialVideo sharedInstance(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo;
        com.amoad.AMoAdNativeViewManager.getInstance(context).prepareAd(str, false, true);
        java.lang.String str3 = java.lang.String.format("%s,%s", str, str2);
        java.util.Map<java.lang.String, com.amoad.AMoAdInterstitialVideo> map = b;
        synchronized (map) {
            if (!map.containsKey(str3)) {
                map.put(str3, new com.amoad.AMoAdInterstitialVideo(context, str, str2));
            }
            aMoAdInterstitialVideo = map.get(str3);
        }
        return aMoAdInterstitialVideo;
    }

    final void a(android.app.Activity activity) {
        if (this.f120a.f137a != null && this.f120a.f137a.F != null) {
            a(activity, this.f120a.f137a.F);
        }
        final com.amoad.AMoAdInterstitialVideo.Listener listener = this.f;
        this.e.post(new java.lang.Runnable() { // from class: com.amoad.AMoAdInterstitialVideo.8
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdInterstitialVideo.Listener listener2 = listener;
                if (listener2 != null) {
                    listener2.onShown(com.amoad.AMoAdInterstitialVideo.this);
                }
            }
        });
    }

    final void b(android.app.Activity activity) {
        if (this.f120a.f137a != null && this.f120a.f137a.G != null) {
            a(activity, this.f120a.f137a.G);
        }
        this.j = false;
        a((android.content.Context) activity);
        final com.amoad.AMoAdInterstitialVideo.Listener listener = this.f;
        this.e.post(new java.lang.Runnable() { // from class: com.amoad.AMoAdInterstitialVideo.9
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdInterstitialVideo.Listener listener2 = listener;
                if (listener2 != null) {
                    listener2.onDismissed(com.amoad.AMoAdInterstitialVideo.this);
                }
            }
        });
    }

    final void c(android.app.Activity activity) {
        this.j = false;
        a((android.content.Context) activity);
        a();
    }

    public final void dismiss(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.amoad.AMoAdInterstitialVideoActivity.class);
        intent.setAction("com.amoad.AMoAdInterstitialVideoActivity.action.dismiss");
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public final boolean isCancellable() {
        return this.g;
    }

    public final boolean isLoaded() {
        return this.h;
    }

    public final void load(android.content.Context context) {
        a(context);
        com.amoad.AMoAdNativeViewManager.getInstance(context).renderAd(this.c, this.d, this.f120a, null, this.i, null, null);
    }

    public final void setCancellable(boolean z) {
        this.g = z;
    }

    public final void setListener(com.amoad.AMoAdInterstitialVideo.Listener listener) {
        this.f = listener;
    }

    public final void show(android.content.Context context) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.RuntimeException("Called from wrong thread.");
        }
        if (this.h && !this.j) {
            this.j = true;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.amoad.AMoAdInterstitialVideoActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("com.amoad.AMoAdInterstitialVideoActivity.extra.sid", this.c);
            intent.putExtra("com.amoad.AMoAdInterstitialVideoActivity.extra.tag", this.d);
            context.startActivity(intent);
        }
    }
}
