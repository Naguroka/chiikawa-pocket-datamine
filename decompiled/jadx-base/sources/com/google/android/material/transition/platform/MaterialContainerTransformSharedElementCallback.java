package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialContainerTransformSharedElementCallback extends android.app.SharedElementCallback {
    private static java.lang.ref.WeakReference<android.view.View> capturedSharedElement;
    private android.graphics.Rect returnEndBounds;
    private boolean entering = true;
    private boolean transparentWindowBackgroundEnabled = true;
    private boolean sharedElementReenterTransitionEnabled = false;
    private com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider shapeProvider = new com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeableViewShapeProvider();

    public interface ShapeProvider {
        com.google.android.material.shape.ShapeAppearanceModel provideShape(android.view.View view);
    }

    public static class ShapeableViewShapeProvider implements com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider
        public com.google.android.material.shape.ShapeAppearanceModel provideShape(android.view.View view) {
            if (view instanceof com.google.android.material.shape.Shapeable) {
                return ((com.google.android.material.shape.Shapeable) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @Override // android.app.SharedElementCallback
    public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View view, android.graphics.Matrix matrix, android.graphics.RectF rectF) {
        capturedSharedElement = new java.lang.ref.WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    public android.view.View onCreateSnapshotView(android.content.Context context, android.os.Parcelable parcelable) {
        java.lang.ref.WeakReference<android.view.View> weakReference;
        android.view.View view;
        com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModelProvideShape;
        android.view.View viewOnCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (viewOnCreateSnapshotView != null && (weakReference = capturedSharedElement) != null && this.shapeProvider != null && (view = weakReference.get()) != null && (shapeAppearanceModelProvideShape = this.shapeProvider.provideShape(view)) != null) {
            viewOnCreateSnapshotView.setTag(com.google.android.material.R.id.mtrl_motion_snapshot_view, shapeAppearanceModelProvideShape);
        }
        return viewOnCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, android.view.View> map) {
        android.view.View view;
        android.app.Activity activity;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (activity = com.google.android.material.internal.ContextUtils.getActivity(view.getContext())) == null) {
            return;
        }
        android.view.Window window = activity.getWindow();
        if (this.entering) {
            setUpEnterTransform(window);
        } else {
            setUpReturnTransform(activity, window);
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(com.google.android.material.R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.entering || list2.isEmpty() || this.returnEndBounds == null) {
            return;
        }
        android.view.View view = list2.get(0);
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.returnEndBounds.width(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.returnEndBounds.height(), 1073741824));
        view.layout(this.returnEndBounds.left, this.returnEndBounds.top, this.returnEndBounds.right, this.returnEndBounds.bottom);
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view) instanceof android.view.View)) {
            list2.get(0).setTag(com.google.android.material.R.id.mtrl_motion_snapshot_view, null);
        }
        if (!this.entering && !list2.isEmpty()) {
            this.returnEndBounds = com.google.android.material.transition.platform.TransitionUtils.getRelativeBoundsRect(list2.get(0));
        }
        this.entering = false;
    }

    public com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider getShapeProvider() {
        return this.shapeProvider;
    }

    public void setShapeProvider(com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider shapeProvider) {
        this.shapeProvider = shapeProvider;
    }

    public boolean isTransparentWindowBackgroundEnabled() {
        return this.transparentWindowBackgroundEnabled;
    }

    public void setTransparentWindowBackgroundEnabled(boolean z) {
        this.transparentWindowBackgroundEnabled = z;
    }

    public boolean isSharedElementReenterTransitionEnabled() {
        return this.sharedElementReenterTransitionEnabled;
    }

    public void setSharedElementReenterTransitionEnabled(boolean z) {
        this.sharedElementReenterTransitionEnabled = z;
    }

    private void setUpEnterTransform(final android.view.Window window) {
        android.transition.Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof com.google.android.material.transition.platform.MaterialContainerTransform) {
            com.google.android.material.transition.platform.MaterialContainerTransform materialContainerTransform = (com.google.android.material.transition.platform.MaterialContainerTransform) sharedElementEnterTransition;
            if (!this.sharedElementReenterTransitionEnabled) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.transparentWindowBackgroundEnabled) {
                updateBackgroundFadeDuration(window, materialContainerTransform);
                materialContainerTransform.addListener(new com.google.android.material.transition.platform.TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.1
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionStart(android.transition.Transition transition) {
                        com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.removeWindowBackground(window);
                    }

                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionEnd(android.transition.Transition transition) {
                        com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.restoreWindowBackground(window);
                    }
                });
            }
        }
    }

    private void setUpReturnTransform(final android.app.Activity activity, final android.view.Window window) {
        android.transition.Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof com.google.android.material.transition.platform.MaterialContainerTransform) {
            com.google.android.material.transition.platform.MaterialContainerTransform materialContainerTransform = (com.google.android.material.transition.platform.MaterialContainerTransform) sharedElementReturnTransition;
            materialContainerTransform.setHoldAtEndEnabled(true);
            materialContainerTransform.addListener(new com.google.android.material.transition.platform.TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.2
                @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                public void onTransitionEnd(android.transition.Transition transition) {
                    android.view.View view;
                    if (com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.capturedSharedElement != null && (view = (android.view.View) com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.capturedSharedElement.get()) != null) {
                        view.setAlpha(1.0f);
                        java.lang.ref.WeakReference unused = com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.capturedSharedElement = null;
                    }
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
            });
            if (this.transparentWindowBackgroundEnabled) {
                updateBackgroundFadeDuration(window, materialContainerTransform);
                materialContainerTransform.addListener(new com.google.android.material.transition.platform.TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.3
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionStart(android.transition.Transition transition) {
                        com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.removeWindowBackground(window);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void removeWindowBackground(android.view.Window window) {
        android.graphics.drawable.Drawable windowBackground = getWindowBackground(window);
        if (windowBackground == null) {
            return;
        }
        windowBackground.mutate().setColorFilter(androidx.core.graphics.BlendModeColorFilterCompat.createBlendModeColorFilterCompat(0, androidx.core.graphics.BlendModeCompat.CLEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void restoreWindowBackground(android.view.Window window) {
        android.graphics.drawable.Drawable windowBackground = getWindowBackground(window);
        if (windowBackground == null) {
            return;
        }
        windowBackground.mutate().clearColorFilter();
    }

    private static android.graphics.drawable.Drawable getWindowBackground(android.view.Window window) {
        return window.getDecorView().getBackground();
    }

    private static void updateBackgroundFadeDuration(android.view.Window window, com.google.android.material.transition.platform.MaterialContainerTransform materialContainerTransform) {
        if (materialContainerTransform.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(materialContainerTransform.getDuration());
        }
    }
}
