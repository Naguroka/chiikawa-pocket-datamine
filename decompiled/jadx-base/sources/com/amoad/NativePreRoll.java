package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class NativePreRoll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, com.amoad.ap> f172a = new java.util.HashMap();

    public static void prepareAd(android.content.Context context, java.lang.String str) {
        com.amoad.j.a(context).a(str, false, true);
    }

    public static void renderAd(android.content.Context context, java.lang.String str, java.lang.String str2, final android.view.ViewGroup viewGroup, com.amoad.Analytics analytics, final java.lang.Boolean bool, final com.amoad.OnReceiveListener onReceiveListener) {
        java.lang.String str3 = str + "-" + str2;
        java.util.Map<java.lang.String, com.amoad.ap> map = f172a;
        final com.amoad.ap apVar = map.get(str3);
        if (apVar == null) {
            apVar = new com.amoad.ap(context, str, str2);
            map.put(str3, apVar);
        }
        apVar.f230a = analytics;
        com.amoad.bc.a(context, new java.lang.Runnable() { // from class: com.amoad.NativePreRoll.1
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.ap apVar2 = apVar;
                android.view.ViewGroup viewGroup2 = viewGroup;
                java.lang.Boolean bool2 = bool;
                com.amoad.OnReceiveListener onReceiveListener2 = onReceiveListener;
                com.amoad.f fVar = new com.amoad.f(apVar2.b);
                fVar.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                fVar.setTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_MAIN_IMAGE);
                android.widget.Button button = new android.widget.Button(apVar2.b);
                button.setTextColor(-1);
                button.setShadowLayer(1.0f, 1.0f, 1.0f, -7829368);
                button.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
                button.setBackgroundDrawable(null);
                button.setTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_LINK);
                android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(apVar2.b);
                relativeLayout.setTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_INFORMATION_ICON);
                int iA = (int) ((com.amoad.x.a(apVar2.b) * 20.0f) + 0.5f);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(iA, iA);
                layoutParams.gravity = 53;
                android.content.Context context2 = apVar2.b;
                viewGroup2.removeView(viewGroup2.findViewWithTag("com.amoad.NativePreRollTemplate"));
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context2);
                frameLayout.setTag("com.amoad.NativePreRollTemplate");
                viewGroup2.addView(frameLayout, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(apVar2.b);
                linearLayout.setOrientation(1);
                frameLayout.addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 49;
                layoutParams2.width = -1;
                layoutParams2.height = 0;
                layoutParams2.weight = 1.0f;
                linearLayout.addView(fVar, layoutParams2);
                linearLayout.addView(button);
                frameLayout.addView(relativeLayout, layoutParams);
                button.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.amoad.ap.3

                    /* JADX INFO: renamed from: a */
                    final /* synthetic */ java.lang.ref.WeakReference f232a;
                    final /* synthetic */ java.lang.ref.WeakReference b;

                    AnonymousClass3() {
                        weakReference = weakReference;
                        weakReference = weakReference;
                    }

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        android.view.View view = (android.view.View) weakReference.get();
                        android.widget.Button button2 = (android.widget.Button) weakReference.get();
                        if (view == null || button2 == null) {
                            return;
                        }
                        float fA = com.amoad.x.a(com.amoad.ap.this.b);
                        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        float fA2 = com.amoad.au.a(com.amoad.ap.this.b, view.getWidth(), view.getHeight());
                        layoutParams3.gravity = 81;
                        float f = fA * fA2;
                        layoutParams3.width = (int) ((206.0f * f) + 0.5f);
                        layoutParams3.height = (int) ((f * 48.0f) + 0.5f);
                        button2.setLayoutParams(layoutParams3);
                        button2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                });
                if (bool2.booleanValue()) {
                    fVar.setClickable(true);
                    fVar.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.amoad.ap.2

                        /* JADX INFO: renamed from: a */
                        final /* synthetic */ android.widget.Button f231a;

                        AnonymousClass2() {
                            button = button;
                        }

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                            return button.dispatchTouchEvent(motionEvent);
                        }
                    });
                }
                try {
                    com.amoad.AMoAdNativeViewManager.getInstance(apVar2.b).a(apVar2.c, apVar2.d, frameLayout, null, new com.amoad.ao() { // from class: com.amoad.ap.1
                        final /* synthetic */ com.amoad.OnReceiveListener b;
                        final /* synthetic */ android.view.ViewGroup c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1() {
                            super(null);
                            onReceiveListener = onReceiveListener2;
                            viewGroup = viewGroup2;
                        }

                        @Override // com.amoad.ao
                        final void a(java.lang.String str4, java.lang.String str5, android.view.View view, com.amoad.Result result) {
                            if (onReceiveListener == null || result == com.amoad.Result.Success) {
                                return;
                            }
                            onReceiveListener.onReceive(com.amoad.ap.this.c, new com.amoad.AMoAdResult(com.amoad.au.a(result), str5, viewGroup, null));
                        }

                        @Override // com.amoad.ao
                        final void a(java.lang.String str4, java.lang.String str5, android.view.View view, com.amoad.Result result, com.amoad.AMoAdError aMoAdError) {
                            com.amoad.OnReceiveListener onReceiveListener3 = onReceiveListener;
                            if (onReceiveListener3 != null) {
                                onReceiveListener3.onReceive(com.amoad.ap.this.c, new com.amoad.AMoAdResult(com.amoad.au.a(result), str5, viewGroup, aMoAdError));
                            }
                        }
                    }, null, apVar2.f230a);
                } catch (java.lang.IllegalStateException e) {
                    if (onReceiveListener2 != null) {
                        onReceiveListener2.onReceive(apVar2.c, new com.amoad.AMoAdResult(com.amoad.AMoAdResult.Result.Failure, apVar2.d, viewGroup2, new com.amoad.AMoAdError(4001, java.text.MessageFormat.format("指定のsidでまだprepareAdされていません。先にprepareAdしてください。（sid={0}）", apVar2.c), e)));
                    }
                }
            }
        });
    }
}
