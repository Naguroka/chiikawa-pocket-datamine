package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
class au {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f246a = "au";

    /* JADX INFO: renamed from: com.amoad.au$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f250a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.amoad.AMoAdNativeListener.Result.values().length];
            b = iArr;
            try {
                iArr[com.amoad.AMoAdNativeListener.Result.Success.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                b[com.amoad.AMoAdNativeListener.Result.Empty.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                b[com.amoad.AMoAdNativeListener.Result.Failure.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.amoad.Result.values().length];
            f250a = iArr2;
            try {
                iArr2[com.amoad.Result.Success.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f250a[com.amoad.Result.Empty.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f250a[com.amoad.Result.Failure.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    static final class a implements com.amoad.AMoAdNativeFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.amoad.AMoAdNativeFailureListener f259a;

        a(com.amoad.AMoAdNativeFailureListener aMoAdNativeFailureListener) {
            this.f259a = aMoAdNativeFailureListener;
        }

        @Override // com.amoad.AMoAdNativeFailureListener
        public final void onFailure(java.lang.String str, java.lang.String str2, android.view.View view) {
            com.amoad.AMoAdNativeFailureListener aMoAdNativeFailureListener = this.f259a;
            if (aMoAdNativeFailureListener != null) {
                aMoAdNativeFailureListener.onFailure(str, str2, view);
                this.f259a = null;
            }
        }
    }

    au() {
    }

    public static float a(android.content.Context context, int i, int i2) {
        float fA = com.amoad.x.a(context);
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (i <= 0) {
            i = displayMetrics.widthPixels;
        }
        float f = i;
        if (i2 <= 0) {
            i2 = displayMetrics.heightPixels;
        }
        return com.amoad.l.a(context) ? i2 / ((int) ((fA * 480.0f) + 0.5f)) : f / ((int) ((fA * 320.0f) + 0.5f));
    }

    static android.view.View a(android.content.Context context, int i) {
        return android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) null);
    }

    static com.amoad.AMoAdResult.Result a(com.amoad.Result result) {
        int i = com.amoad.au.AnonymousClass2.f250a[result.ordinal()];
        if (i != 1) {
            return i != 2 ? com.amoad.AMoAdResult.Result.Failure : com.amoad.AMoAdResult.Result.Empty;
        }
        return com.amoad.AMoAdResult.Result.Success;
    }

    static com.amoad.Result a(com.amoad.AMoAdNativeListener.Result result) {
        int i = com.amoad.au.AnonymousClass2.b[result.ordinal()];
        if (i != 1) {
            return i != 2 ? com.amoad.Result.Failure : com.amoad.Result.Empty;
        }
        return com.amoad.Result.Success;
    }

    static java.lang.String a(java.lang.String str, com.amoad.Analytics analytics) {
        return analytics != null ? str + com.ironsource.y8.i.c + analytics.toString() : str;
    }

    static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strA = com.amoad.l.a(str3, com.adjust.sdk.Constants.ENCODING);
        return (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(strA)) ? str : str + com.ironsource.y8.i.c + str2 + com.ironsource.y8.i.b + strA;
    }

    static /* synthetic */ void a(final android.content.Context context, android.view.View view, final com.amoad.i iVar) {
        android.view.View viewFindViewWithTag = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_LINK);
        if (viewFindViewWithTag instanceof android.widget.Button) {
            android.widget.Button button = (android.widget.Button) viewFindViewWithTag;
            final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(button);
            com.amoad.t.a(context).a(new com.amoad.af(button, iVar.t, new com.amoad.i.a() { // from class: com.amoad.au.10
                @Override // com.amoad.i.a
                public final void a(final com.amoad.d dVar, com.amoad.AMoAdError aMoAdError) {
                    android.widget.Button button2 = (android.widget.Button) weakReference.get();
                    if (button2 != null) {
                        com.amoad.au.a(context, button2, dVar.f300a, (android.graphics.Bitmap) null);
                        if (android.text.TextUtils.isEmpty(iVar.u)) {
                            return;
                        }
                        com.amoad.t.a(context).a(new com.amoad.af(new android.widget.Button(context), iVar.u, new com.amoad.i.a() { // from class: com.amoad.au.10.1
                            @Override // com.amoad.i.a
                            public final void a(com.amoad.d dVar2, com.amoad.AMoAdError aMoAdError2) {
                                android.widget.Button button3 = (android.widget.Button) weakReference.get();
                                if (button3 != null) {
                                    com.amoad.au.a(context, button3, dVar.f300a, dVar2.f300a);
                                }
                            }
                        }));
                    }
                }
            }));
        }
    }

    static void a(android.content.Context context, final android.view.View view, final com.amoad.i iVar, final java.lang.String str) {
        if (!(view instanceof android.view.ViewGroup)) {
            com.amoad.Logger.w(f246a, "passed view to `sendImpression` is not an instance of ViewGroup.");
            return;
        }
        java.lang.String str2 = com.amoad.bm.f296a + "_Impression";
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        viewGroup.removeView(view.findViewWithTag(str2));
        if (iVar.K) {
            return;
        }
        com.amoad.bm bmVar = new com.amoad.bm(context, 0.0d, iVar.p, new com.amoad.bm.a() { // from class: com.amoad.au.8
            @Override // com.amoad.bm.a
            public final void a(com.amoad.bm bmVar2) {
                ((android.view.ViewGroup) view).removeView(bmVar2);
            }

            @Override // com.amoad.bm.a
            public final void b(com.amoad.bm bmVar2) {
                com.amoad.i iVar2 = iVar;
                java.lang.String str3 = str;
                if (!iVar2.K) {
                    iVar2.K = true;
                    com.amoad.l.a(iVar2.f310a, com.amoad.au.a(com.amoad.au.a(iVar2.i, iVar2.J), "tag", str3));
                }
                ((android.view.ViewGroup) view).removeView(bmVar2);
            }
        });
        bmVar.setTag(str2);
        viewGroup.addView(bmVar);
    }

    static void a(final android.content.Context context, final android.view.View view, final com.amoad.i iVar, final java.lang.String str, final java.lang.String str2, com.amoad.AMoAdNativeFailureListener aMoAdNativeFailureListener, final com.amoad.ao aoVar, final com.amoad.AMoAdNativeViewCoder aMoAdNativeViewCoder) {
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(view);
        android.view.View viewFindViewWithTag = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_TITLE_LONG);
        if (viewFindViewWithTag instanceof android.widget.TextView) {
            ((android.widget.TextView) viewFindViewWithTag).setText(iVar.b);
        }
        android.view.View viewFindViewWithTag2 = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_TITLE_SHORT);
        if (viewFindViewWithTag2 instanceof android.widget.TextView) {
            ((android.widget.TextView) viewFindViewWithTag2).setText(iVar.c);
        }
        android.view.View viewFindViewWithTag3 = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_SERVICE_NAME);
        if (viewFindViewWithTag3 instanceof android.widget.TextView) {
            ((android.widget.TextView) viewFindViewWithTag3).setText(iVar.f);
        }
        final com.amoad.au.a aVar = new com.amoad.au.a(aMoAdNativeFailureListener);
        android.view.View viewFindViewWithTag4 = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_ICON_IMAGE);
        if (viewFindViewWithTag4 instanceof com.amoad.f) {
            com.amoad.f fVar = (com.amoad.f) viewFindViewWithTag4;
            fVar.setImage(null);
            final java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(fVar);
            iVar.a(fVar, iVar.g, new com.amoad.i.a() { // from class: com.amoad.au.3
                @Override // com.amoad.i.a
                public final void a(com.amoad.d dVar, com.amoad.AMoAdError aMoAdError) {
                    com.amoad.f fVar2 = (com.amoad.f) weakReference2.get();
                    if (fVar2 != null && dVar.a()) {
                        fVar2.setImage(dVar);
                        fVar2.a();
                    }
                    if (dVar == null || !dVar.a()) {
                        aVar.onFailure(str, str2, view);
                    }
                    com.amoad.au.b(str, str2, (android.view.View) weakReference.get(), (dVar == null || !dVar.a()) ? com.amoad.Result.Failure : com.amoad.Result.Success, aoVar);
                }
            });
        }
        android.view.View viewFindViewWithTag5 = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_MAIN_IMAGE);
        if (viewFindViewWithTag5 instanceof com.amoad.f) {
            com.amoad.f fVar2 = (com.amoad.f) viewFindViewWithTag5;
            fVar2.setImage(null);
            if (!android.text.TextUtils.isEmpty(iVar.h)) {
                final java.lang.ref.WeakReference weakReference3 = new java.lang.ref.WeakReference(fVar2);
                iVar.a(fVar2, iVar.h, new com.amoad.i.a() { // from class: com.amoad.au.4
                    @Override // com.amoad.i.a
                    public final void a(com.amoad.d dVar, com.amoad.AMoAdError aMoAdError) {
                        com.amoad.f fVar3 = (com.amoad.f) weakReference3.get();
                        if (fVar3 != null && dVar.a()) {
                            fVar3.setImage(dVar);
                            fVar3.a();
                            com.amoad.au.b(context, view, iVar, str2);
                            if (!android.text.TextUtils.isEmpty(iVar.t)) {
                                com.amoad.au.a(context, view, iVar);
                            }
                        }
                        if (dVar == null || !dVar.a()) {
                            aVar.onFailure(str, str2, view);
                        }
                        com.amoad.au.a(str, str2, (android.view.View) weakReference.get(), (dVar == null || !dVar.a()) ? com.amoad.Result.Failure : com.amoad.Result.Success, aoVar, aMoAdError);
                    }
                });
            }
        }
        android.view.View viewFindViewWithTag6 = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_MAIN_VIDEO);
        if (viewFindViewWithTag6 instanceof com.amoad.AMoAdNativeMainVideoView) {
            com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView = (com.amoad.AMoAdNativeMainVideoView) viewFindViewWithTag6;
            aMoAdNativeMainVideoView.setImage(null);
            aMoAdNativeMainVideoView.setMediaPlayer(null);
            if (!android.text.TextUtils.isEmpty(iVar.w)) {
                final java.lang.ref.WeakReference weakReference4 = new java.lang.ref.WeakReference(aMoAdNativeMainVideoView);
                iVar.a(aMoAdNativeMainVideoView, iVar.w, new com.amoad.i.a() { // from class: com.amoad.au.5
                    @Override // com.amoad.i.a
                    public final void a(com.amoad.d dVar, com.amoad.AMoAdError aMoAdError) {
                        com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView2 = (com.amoad.AMoAdNativeMainVideoView) weakReference4.get();
                        if (aMoAdNativeMainVideoView2 != null && dVar.a()) {
                            aMoAdNativeMainVideoView2.setImage(dVar);
                            aMoAdNativeMainVideoView2.d.a();
                        }
                        if (dVar == null || !dVar.a()) {
                            aVar.onFailure(str, str2, view);
                        }
                        if (((dVar == null || !dVar.a()) ? com.amoad.Result.Failure : com.amoad.Result.Success) == com.amoad.Result.Failure || android.text.TextUtils.isEmpty(iVar.v)) {
                            com.amoad.au.a(str, str2, (android.view.View) weakReference.get(), com.amoad.Result.Failure, aoVar, aMoAdError);
                        } else {
                            com.amoad.i iVar2 = iVar;
                            com.amoad.bh.a(iVar2.f310a).a(new com.amoad.bi(aMoAdNativeMainVideoView2, iVar2.v, new com.amoad.i.b() { // from class: com.amoad.au.5.1
                                @Override // com.amoad.i.b
                                public final void a(android.media.MediaPlayer mediaPlayer, com.amoad.AMoAdError aMoAdError2) {
                                    java.lang.String str3;
                                    java.lang.String str4;
                                    android.view.View view2;
                                    com.amoad.Result result;
                                    com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView3 = (com.amoad.AMoAdNativeMainVideoView) weakReference4.get();
                                    if (aMoAdNativeMainVideoView3 == null || mediaPlayer == null) {
                                        aVar.onFailure(str, str2, view);
                                        str3 = str;
                                        str4 = str2;
                                        view2 = (android.view.View) weakReference.get();
                                        result = com.amoad.Result.Failure;
                                    } else {
                                        aMoAdNativeMainVideoView3.setMediaPlayer(mediaPlayer);
                                        aMoAdNativeMainVideoView3.setNativeInfo(iVar);
                                        com.amoad.au.b(context, view, iVar, str2);
                                        str3 = str;
                                        str4 = str2;
                                        view2 = (android.view.View) weakReference.get();
                                        result = com.amoad.Result.Success;
                                    }
                                    com.amoad.au.a(str3, str4, view2, result, aoVar, aMoAdError2);
                                }
                            }));
                        }
                    }
                });
            }
        }
        android.view.View viewFindViewWithTag7 = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_LINK);
        android.view.View view2 = viewFindViewWithTag7 == null ? view : viewFindViewWithTag7;
        final android.view.View view3 = view2;
        final android.view.GestureDetector gestureDetector = new android.view.GestureDetector(context, new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.amoad.au.6
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                if (aMoAdNativeViewCoder.getTouchType() != com.amoad.AMoAdNativeViewCoder.TouchType.DoubleTap) {
                    return false;
                }
                com.amoad.au.a(context, new com.amoad.a(motionEvent.getX(), motionEvent.getY()), new android.util.Size(view3.getMeasuredWidth(), view3.getMeasuredHeight()), iVar, str, str2, (android.view.View) weakReference.get(), aoVar);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
                if (aMoAdNativeViewCoder.getTouchType() != com.amoad.AMoAdNativeViewCoder.TouchType.SingleTap) {
                    return false;
                }
                com.amoad.au.a(context, new com.amoad.a(motionEvent.getX(), motionEvent.getY()), new android.util.Size(view3.getMeasuredWidth(), view3.getMeasuredHeight()), iVar, str, str2, (android.view.View) weakReference.get(), aoVar);
                return true;
            }
        });
        view2.setClickable(true);
        view2.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.amoad.au.7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view4, android.view.MotionEvent motionEvent) {
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_INFORMATION_ICON);
        if (relativeLayout != null) {
            relativeLayout.addView(new com.amoad.ah(context));
        }
    }

    static /* synthetic */ void a(android.content.Context context, android.widget.Button button, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        java.lang.CharSequence charSequence;
        android.graphics.drawable.Drawable drawable;
        if (bitmap == null && bitmap2 == null) {
            android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RectShape());
            shapeDrawable.getPaint().setColor(android.graphics.Color.parseColor("#FFBF00"));
            shapeDrawable.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            shapeDrawable.getPaint().setAntiAlias(true);
            android.graphics.drawable.ShapeDrawable shapeDrawable2 = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RectShape());
            shapeDrawable2.getPaint().setColor(android.graphics.Color.parseColor("#FFFFFF"));
            shapeDrawable2.getPaint().setStyle(android.graphics.Paint.Style.STROKE);
            shapeDrawable2.getPaint().setAntiAlias(true);
            shapeDrawable2.getPaint().setStrokeWidth(10.0f);
            android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{shapeDrawable, shapeDrawable2});
            layerDrawable.setLayerInset(0, 5, 5, 5, 5);
            charSequence = "詳細はこちら";
            drawable = layerDrawable;
        } else {
            android.content.res.Resources resources = context.getResources();
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            if (bitmap != null && bitmap2 == null) {
                stateListDrawable.addState(new int[]{-16842919}, new android.graphics.drawable.BitmapDrawable(resources, bitmap));
            } else if (bitmap != null || bitmap2 == null) {
                stateListDrawable.addState(new int[]{-16842919}, new android.graphics.drawable.BitmapDrawable(resources, bitmap));
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new android.graphics.drawable.BitmapDrawable(resources, bitmap2));
            } else {
                stateListDrawable.addState(new int[]{-16842919}, new android.graphics.drawable.BitmapDrawable(resources, bitmap2));
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new android.graphics.drawable.BitmapDrawable(resources, bitmap2));
            }
            charSequence = null;
            drawable = stateListDrawable;
        }
        button.setText(charSequence);
        button.setBackgroundDrawable(drawable);
    }

    static /* synthetic */ void a(android.content.Context context, com.amoad.a aVar, android.util.Size size, com.amoad.i iVar, java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.ao aoVar) {
        if (view != null && aoVar != null && aoVar.f228a != null) {
            aoVar.f228a.onClicked(str, str2, view);
        }
        java.lang.String strA = com.amoad.l.a(iVar.d, aVar, size);
        if (iVar.e != null) {
            com.amoad.l.d(context, strA);
            java.util.Iterator<java.lang.String> it = iVar.e.iterator();
            while (it.hasNext()) {
                a(context, a(it.next(), iVar.J), str2);
            }
            return;
        }
        if (!iVar.o || android.text.TextUtils.isEmpty(iVar.n)) {
            try {
                a(context, a(strA, iVar.J), 268435456);
            } catch (android.content.ActivityNotFoundException unused) {
            }
        } else {
            try {
                a(context, "market://details?id=".concat(java.lang.String.valueOf(iVar.n)), 335544320);
            } catch (android.content.ActivityNotFoundException unused2) {
            }
            a(context, a(strA, iVar.J), str2);
        }
    }

    private static void a(android.content.Context context, java.lang.String str, int i) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        intent.addFlags(i);
        context.startActivity(intent);
    }

    private static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.amoad.l.e(context, a(str, "tag", str2));
    }

    static void a(final android.content.Context context, java.lang.String str, final java.lang.String str2, final java.lang.ref.WeakReference<android.view.View> weakReference, final com.amoad.AMoAdNativeFailureListener aMoAdNativeFailureListener, final com.amoad.ao aoVar, final com.amoad.AMoAdNativeViewCoder aMoAdNativeViewCoder, final com.amoad.Analytics analytics) {
        com.amoad.j.a(context).a(str, new com.amoad.av() { // from class: com.amoad.au.1
            @Override // com.amoad.av
            public final void a(java.lang.String str3, com.amoad.AMoAdNativeListener.Result result, com.amoad.i iVar) {
                android.view.View view = (android.view.View) weakReference.get();
                if (view == null) {
                    return;
                }
                com.amoad.au.a(str3, str2, view, com.amoad.au.a(result), aoVar);
                if (iVar != null) {
                    iVar.J = analytics;
                    com.amoad.au.a(context, view, iVar, str2);
                    com.amoad.au.a(context, view, iVar, str3, str2, aMoAdNativeFailureListener, aoVar, aMoAdNativeViewCoder);
                } else {
                    com.amoad.AMoAdNativeFailureListener aMoAdNativeFailureListener2 = aMoAdNativeFailureListener;
                    if (aMoAdNativeFailureListener2 != null) {
                        aMoAdNativeFailureListener2.onFailure(str3, str2, view);
                    }
                }
            }
        });
    }

    static void a(android.view.View view) {
        android.view.View viewFindViewWithTag = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_TITLE_LONG);
        if (viewFindViewWithTag instanceof android.widget.TextView) {
            ((android.widget.TextView) viewFindViewWithTag).setText((java.lang.CharSequence) null);
        }
        android.view.View viewFindViewWithTag2 = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_TITLE_SHORT);
        if (viewFindViewWithTag2 instanceof android.widget.TextView) {
            ((android.widget.TextView) viewFindViewWithTag2).setText((java.lang.CharSequence) null);
        }
        android.view.View viewFindViewWithTag3 = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_SERVICE_NAME);
        if (viewFindViewWithTag3 instanceof android.widget.TextView) {
            ((android.widget.TextView) viewFindViewWithTag3).setText((java.lang.CharSequence) null);
        }
        android.view.View viewFindViewWithTag4 = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_ICON_IMAGE);
        if (viewFindViewWithTag4 instanceof android.widget.ImageView) {
            ((android.widget.ImageView) viewFindViewWithTag4).setImageBitmap(null);
        }
        android.view.View viewFindViewWithTag5 = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_MAIN_IMAGE);
        if (viewFindViewWithTag5 instanceof android.widget.ImageView) {
            ((android.widget.ImageView) viewFindViewWithTag5).setImageBitmap(null);
        }
        android.view.View viewFindViewWithTag6 = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_MAIN_VIDEO);
        if (viewFindViewWithTag6 instanceof com.amoad.AMoAdNativeMainVideoView) {
            com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView = (com.amoad.AMoAdNativeMainVideoView) viewFindViewWithTag6;
            aMoAdNativeMainVideoView.setImage(null);
            aMoAdNativeMainVideoView.setMediaPlayer(null);
        }
        android.view.View viewFindViewWithTag7 = view.findViewWithTag(com.amoad.AMoAdNativeViewManager.AMOAD_NATIVE_VIEW_LINK);
        if (viewFindViewWithTag7 != null) {
            view = viewFindViewWithTag7;
        }
        view.setOnTouchListener(null);
    }

    static void a(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.Result result, com.amoad.ao aoVar) {
        if (view == null || aoVar == null) {
            return;
        }
        aoVar.a(str, str2, view, result);
    }

    static void a(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.Result result, com.amoad.ao aoVar, com.amoad.AMoAdError aMoAdError) {
        if (view == null || aoVar == null) {
            return;
        }
        aoVar.a(str, str2, view, result, aMoAdError);
    }

    static void b(android.content.Context context, final android.view.View view, final com.amoad.i iVar, final java.lang.String str) {
        if (!(view instanceof android.view.ViewGroup)) {
            com.amoad.Logger.w(f246a, "passed view to `sendViewableImpression` is not an instance of ViewGroup.");
            return;
        }
        java.lang.String str2 = com.amoad.bm.f296a + "_ViewableImpression";
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        viewGroup.removeView(view.findViewWithTag(str2));
        if (iVar.L) {
            return;
        }
        com.amoad.bm bmVar = new com.amoad.bm(context, 0.5d, com.amoad.g.b, new com.amoad.bm.a() { // from class: com.amoad.au.9
            @Override // com.amoad.bm.a
            public final void a(com.amoad.bm bmVar2) {
                ((android.view.ViewGroup) view).removeView(bmVar2);
            }

            @Override // com.amoad.bm.a
            public final void b(com.amoad.bm bmVar2) {
                com.amoad.i iVar2 = iVar;
                java.lang.String str3 = str;
                if (!iVar2.L) {
                    iVar2.L = true;
                    com.amoad.l.b(iVar2.f310a, com.amoad.au.a(com.amoad.au.a(iVar2.j, iVar2.J), "tag", str3));
                }
                ((android.view.ViewGroup) view).removeView(bmVar2);
            }
        });
        bmVar.setTag(str2);
        viewGroup.addView(bmVar);
    }

    static void b(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.Result result, com.amoad.ao aoVar) {
        if (view == null || aoVar == null || aoVar.f228a == null) {
            return;
        }
        aoVar.f228a.onIconReceived(str, str2, view, com.amoad.ao.a(result));
    }
}
