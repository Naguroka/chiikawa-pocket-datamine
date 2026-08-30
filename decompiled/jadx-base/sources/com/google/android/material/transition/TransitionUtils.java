package com.google.android.material.transition;

/* JADX INFO: loaded from: classes5.dex */
class TransitionUtils {
    static final int NO_ATTR_RES_ID = 0;
    static final int NO_DURATION = -1;
    private static final int PATH_TYPE_ARC = 1;
    private static final int PATH_TYPE_LINEAR = 0;
    private static final android.graphics.RectF transformAlphaRectF = new android.graphics.RectF();

    interface CanvasOperation {
        void run(android.graphics.Canvas canvas);
    }

    interface CornerSizeBinaryOperator {
        com.google.android.material.shape.CornerSize apply(com.google.android.material.shape.CornerSize cornerSize, com.google.android.material.shape.CornerSize cornerSize2);
    }

    static <T> T defaultIfNull(T t, T t2) {
        return t != null ? t : t2;
    }

    static float lerp(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    private TransitionUtils() {
    }

    static boolean maybeApplyThemeInterpolator(androidx.transition.Transition transition, android.content.Context context, int i, android.animation.TimeInterpolator timeInterpolator) {
        if (i == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(context, i, timeInterpolator));
        return true;
    }

    static boolean maybeApplyThemeDuration(androidx.transition.Transition transition, android.content.Context context, int i) {
        int iResolveThemeDuration;
        if (i == 0 || transition.getDuration() != -1 || (iResolveThemeDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(context, i, -1)) == -1) {
            return false;
        }
        transition.setDuration(iResolveThemeDuration);
        return true;
    }

    static boolean maybeApplyThemePath(androidx.transition.Transition transition, android.content.Context context, int i) {
        androidx.transition.PathMotion pathMotionResolveThemePath;
        if (i == 0 || (pathMotionResolveThemePath = resolveThemePath(context, i)) == null) {
            return false;
        }
        transition.setPathMotion(pathMotionResolveThemePath);
        return true;
    }

    static androidx.transition.PathMotion resolveThemePath(android.content.Context context, int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        if (typedValue.type == 16) {
            int i2 = typedValue.data;
            if (i2 == 0) {
                return null;
            }
            if (i2 == 1) {
                return new com.google.android.material.transition.MaterialArcMotion();
            }
            throw new java.lang.IllegalArgumentException("Invalid motion path type: " + i2);
        }
        if (typedValue.type == 3) {
            return new androidx.transition.PatternPathMotion(androidx.core.graphics.PathParser.createPathFromPathData(java.lang.String.valueOf(typedValue.string)));
        }
        throw new java.lang.IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
    }

    static com.google.android.material.shape.ShapeAppearanceModel convertToRelativeCornerSizes(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel, final android.graphics.RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.TransitionUtils.1
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public com.google.android.material.shape.CornerSize apply(com.google.android.material.shape.CornerSize cornerSize) {
                return cornerSize instanceof com.google.android.material.shape.RelativeCornerSize ? cornerSize : new com.google.android.material.shape.RelativeCornerSize(cornerSize.getCornerSize(rectF) / rectF.height());
            }
        });
    }

    static com.google.android.material.shape.ShapeAppearanceModel transformCornerSizes(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel2, android.graphics.RectF rectF, com.google.android.material.transition.TransitionUtils.CornerSizeBinaryOperator cornerSizeBinaryOperator) {
        return (isShapeAppearanceSignificant(shapeAppearanceModel, rectF) ? shapeAppearanceModel : shapeAppearanceModel2).toBuilder().setTopLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }

    private static boolean isShapeAppearanceSignificant(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel, android.graphics.RectF rectF) {
        return (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) ? false : true;
    }

    static float lerp(float f, float f2, float f3, float f4, float f5) {
        return lerp(f, f2, f3, f4, f5, false);
    }

    static float lerp(float f, float f2, float f3, float f4, float f5, boolean z) {
        if (z && (f5 < 0.0f || f5 > 1.0f)) {
            return lerp(f, f2, f5);
        }
        if (f5 < f3) {
            return f;
        }
        return f5 > f4 ? f2 : lerp(f, f2, (f5 - f3) / (f4 - f3));
    }

    static int lerp(int i, int i2, float f, float f2, float f3) {
        if (f3 < f) {
            return i;
        }
        return f3 > f2 ? i2 : (int) lerp(i, i2, (f3 - f) / (f2 - f));
    }

    static com.google.android.material.shape.ShapeAppearanceModel lerp(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel2, final android.graphics.RectF rectF, final android.graphics.RectF rectF2, final float f, final float f2, final float f3) {
        if (f3 < f) {
            return shapeAppearanceModel;
        }
        return f3 > f2 ? shapeAppearanceModel2 : transformCornerSizes(shapeAppearanceModel, shapeAppearanceModel2, rectF, new com.google.android.material.transition.TransitionUtils.CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.TransitionUtils.2
            @Override // com.google.android.material.transition.TransitionUtils.CornerSizeBinaryOperator
            public com.google.android.material.shape.CornerSize apply(com.google.android.material.shape.CornerSize cornerSize, com.google.android.material.shape.CornerSize cornerSize2) {
                return new com.google.android.material.shape.AbsoluteCornerSize(com.google.android.material.transition.TransitionUtils.lerp(cornerSize.getCornerSize(rectF), cornerSize2.getCornerSize(rectF2), f, f2, f3));
            }
        });
    }

    static android.graphics.Shader createColorShader(int i) {
        return new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, android.graphics.Shader.TileMode.CLAMP);
    }

    static android.view.View findDescendantOrAncestorById(android.view.View view, int i) {
        android.view.View viewFindViewById = view.findViewById(i);
        return viewFindViewById != null ? viewFindViewById : findAncestorById(view, i);
    }

    static android.view.View findAncestorById(android.view.View view, int i) {
        java.lang.String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                java.lang.Object parent = view.getParent();
                if (!(parent instanceof android.view.View)) {
                    break;
                }
                view = (android.view.View) parent;
            } else {
                return view;
            }
        }
        throw new java.lang.IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    static android.graphics.RectF getRelativeBounds(android.view.View view) {
        return new android.graphics.RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    static android.graphics.Rect getRelativeBoundsRect(android.view.View view) {
        return new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    static android.graphics.RectF getLocationOnScreen(android.view.View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new android.graphics.RectF(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    static float calculateArea(android.graphics.RectF rectF) {
        return rectF.width() * rectF.height();
    }

    private static int saveLayerAlphaCompat(android.graphics.Canvas canvas, android.graphics.Rect rect, int i) {
        android.graphics.RectF rectF = transformAlphaRectF;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    static void transform(android.graphics.Canvas canvas, android.graphics.Rect rect, float f, float f2, float f3, int i, com.google.android.material.transition.TransitionUtils.CanvasOperation canvasOperation) {
        if (i <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (i < 255) {
            saveLayerAlphaCompat(canvas, rect, i);
        }
        canvasOperation.run(canvas);
        canvas.restoreToCount(iSave);
    }

    static void maybeAddTransition(androidx.transition.TransitionSet transitionSet, androidx.transition.Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    static void maybeRemoveTransition(androidx.transition.TransitionSet transitionSet, androidx.transition.Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }
}
