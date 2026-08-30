package androidx.core.view;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a5\u0010 \u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010'\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010(\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010)\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010*\u001a\u00020+*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a\u0014\u0010,\u001a\u00020-*\u00020\u00022\b\b\u0002\u0010.\u001a\u00020/\u001a(\u00100\u001a\u000201*\u00020\u00022\u0006\u00102\u001a\u0002032\u000e\b\u0004\u0010\"\u001a\b\u0012\u0004\u0012\u00020!04H\u0086\bø\u0001\u0000\u001a\"\u00105\u001a\u000201*\u00020\u00022\u0006\u00102\u001a\u0002032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!04H\u0007\u001a\u0017\u00106\u001a\u00020!*\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u0013H\u0086\b\u001a:\u00108\u001a\u00020!\"\n\b\u0000\u00109\u0018\u0001*\u00020:*\u00020\u00022\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\b<H\u0087\bø\u0001\u0000¢\u0006\u0002\b=\u001a)\u00108\u001a\u00020!*\u00020\u00022\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\b<H\u0086\bø\u0001\u0000\u001a5\u0010>\u001a\u00020!*\u00020\u00022\b\b\u0003\u0010?\u001a\u00020\u00132\b\b\u0003\u0010@\u001a\u00020\u00132\b\b\u0003\u0010A\u001a\u00020\u00132\b\b\u0003\u0010B\u001a\u00020\u0013H\u0086\b\u001a5\u0010C\u001a\u00020!*\u00020\u00022\b\b\u0003\u0010D\u001a\u00020\u00132\b\b\u0003\u0010@\u001a\u00020\u00132\b\b\u0003\u0010E\u001a\u00020\u00132\b\b\u0003\u0010B\u001a\u00020\u0013H\u0087\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\"*\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\"*\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r\"*\u0010\u0010\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r\"\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0016\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\"\u0016\u0010\u0018\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\"\u0016\u0010\u001a\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\"\u0016\u0010\u001c\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015\"\u0016\u0010\u001e\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, d2 = {"allViews", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "getAllViews", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "Landroid/view/ViewParent;", "getAncestors", "value", "", "isGone", "(Landroid/view/View;)Z", "setGone", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", com.json.pg.k, "setVisible", "marginBottom", "", "getMarginBottom", "(Landroid/view/View;)I", "marginEnd", "getMarginEnd", "marginLeft", "getMarginLeft", "marginRight", "getMarginRight", "marginStart", "getMarginStart", "marginTop", "getMarginTop", "doOnAttach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "doOnDetach", "doOnLayout", "doOnNextLayout", "doOnPreDraw", "Landroidx/core/view/OneShotPreDrawListener;", "drawToBitmap", "Landroid/graphics/Bitmap;", "config", "Landroid/graphics/Bitmap$Config;", "postDelayed", "Ljava/lang/Runnable;", "delayInMillis", "", "Lkotlin/Function0;", "postOnAnimationDelayed", "setPadding", "size", "updateLayoutParams", "T", "Landroid/view/ViewGroup$LayoutParams;", "block", "Lkotlin/ExtensionFunctionType;", "updateLayoutParamsTyped", "updatePadding", androidx.media3.extractor.text.ttml.TtmlNode.LEFT, "top", androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, "bottom", "updatePaddingRelative", androidx.media3.extractor.text.ttml.TtmlNode.START, androidx.media3.extractor.text.ttml.TtmlNode.END, "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ViewKt {
    public static final void doOnNextLayout(android.view.View view, final kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        view.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt.doOnNextLayout.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(android.view.View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                view2.removeOnLayoutChangeListener(this);
                action.invoke(view2);
            }
        });
    }

    public static final void doOnLayout(android.view.View view, final kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (androidx.core.view.ViewCompat.isLaidOut(view) && !view.isLayoutRequested()) {
            action.invoke(view);
        } else {
            view.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(android.view.View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    action.invoke(view2);
                }
            });
        }
    }

    public static final androidx.core.view.OneShotPreDrawListener doOnPreDraw(final android.view.View view, final kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        androidx.core.view.OneShotPreDrawListener oneShotPreDrawListenerAdd = androidx.core.view.OneShotPreDrawListener.add(view, new java.lang.Runnable() { // from class: androidx.core.view.ViewKt.doOnPreDraw.1
            @Override // java.lang.Runnable
            public final void run() {
                action.invoke(view);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(oneShotPreDrawListenerAdd, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return oneShotPreDrawListenerAdd;
    }

    public static final void doOnAttach(final android.view.View view, final kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
            action.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt.doOnAttach.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View view2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View view2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                    view.removeOnAttachStateChangeListener(this);
                    action.invoke(view2);
                }
            });
        }
    }

    public static final void doOnDetach(final android.view.View view, final kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (!androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
            action.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt.doOnDetach.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View view2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View view2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                    view.removeOnAttachStateChangeListener(this);
                    action.invoke(view2);
                }
            });
        }
    }

    public static /* synthetic */ void updatePaddingRelative$default(android.view.View view, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static final void updatePaddingRelative(android.view.View view, int i, int i2, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePadding$default(android.view.View view, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    public static final void updatePadding(android.view.View view, int i, int i2, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    public static final void setPadding(android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i, i, i, i);
    }

    public static final java.lang.Runnable postDelayed(android.view.View view, long j, final kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                action.invoke();
            }
        };
        view.postDelayed(runnable, j);
        return runnable;
    }

    public static final java.lang.Runnable postOnAnimationDelayed(android.view.View view, long j, final kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.core.view.ViewKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.core.view.ViewKt.m40postOnAnimationDelayed$lambda1(action);
            }
        };
        androidx.core.view.Api16Impl.postOnAnimationDelayed(view, runnable, j);
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postOnAnimationDelayed$lambda-1, reason: not valid java name */
    public static final void m40postOnAnimationDelayed$lambda1(kotlin.jvm.functions.Function0 action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "$action");
        action.invoke();
    }

    public static /* synthetic */ android.graphics.Bitmap drawToBitmap$default(android.view.View view, android.graphics.Bitmap.Config config, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final android.graphics.Bitmap drawToBitmap(android.view.View view, android.graphics.Bitmap.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        if (!androidx.core.view.ViewCompat.isLaidOut(view)) {
            throw new java.lang.IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final boolean isVisible(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final void setVisible(android.view.View view, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z ? 0 : 8);
    }

    public static final boolean isInvisible(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 4;
    }

    public static final void setInvisible(android.view.View view, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z ? 4 : 0);
    }

    public static final boolean isGone(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final void setGone(android.view.View view, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z ? 8 : 0);
    }

    public static final /* synthetic */ <T extends android.view.ViewGroup.LayoutParams> void updateLayoutParamsTyped(android.view.View view, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        block.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final int getMarginLeft(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginTop(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final int getMarginRight(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginBottom(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginStart(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return androidx.core.view.MarginLayoutParamsCompat.getMarginStart((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginEnd(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return androidx.core.view.MarginLayoutParamsCompat.getMarginEnd((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final kotlin.sequences.Sequence<android.view.ViewParent> getAncestors(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        return kotlin.sequences.SequencesKt.generateSequence(view.getParent(), androidx.core.view.ViewKt$ancestors$1.INSTANCE);
    }

    public static final kotlin.sequences.Sequence<android.view.View> getAllViews(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        return kotlin.sequences.SequencesKt.sequence(new androidx.core.view.ViewKt$allViews$1(view, null));
    }

    public static final void updateLayoutParams(android.view.View view, kotlin.jvm.functions.Function1<? super android.view.ViewGroup.LayoutParams, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        block.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }
}
