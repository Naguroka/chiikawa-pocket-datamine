package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
class ViewOverlayApi14 implements com.google.android.material.internal.ViewOverlayImpl {
    protected com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup overlayViewGroup;

    ViewOverlayApi14(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        this.overlayViewGroup = new com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup(context, viewGroup, view, this);
    }

    static com.google.android.material.internal.ViewOverlayApi14 createFrom(android.view.View view) {
        android.view.ViewGroup contentView = com.google.android.material.internal.ViewUtils.getContentView(view);
        if (contentView == null) {
            return null;
        }
        int childCount = contentView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = contentView.getChildAt(i);
            if (childAt instanceof com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup) {
                return ((com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup) childAt).viewOverlay;
            }
        }
        return new com.google.android.material.internal.ViewGroupOverlayApi14(contentView.getContext(), contentView, view);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(android.graphics.drawable.Drawable drawable) {
        this.overlayViewGroup.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(android.graphics.drawable.Drawable drawable) {
        this.overlayViewGroup.remove(drawable);
    }

    static class OverlayViewGroup extends android.view.ViewGroup {
        static java.lang.reflect.Method invalidateChildInParentFastMethod;
        private boolean disposed;
        java.util.ArrayList<android.graphics.drawable.Drawable> drawables;
        android.view.ViewGroup hostView;
        android.view.View requestingView;
        com.google.android.material.internal.ViewOverlayApi14 viewOverlay;

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        static {
            try {
                invalidateChildInParentFastMethod = android.view.ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", java.lang.Integer.TYPE, java.lang.Integer.TYPE, android.graphics.Rect.class);
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }

        OverlayViewGroup(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, com.google.android.material.internal.ViewOverlayApi14 viewOverlayApi14) {
            super(context);
            this.drawables = null;
            this.hostView = viewGroup;
            this.requestingView = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.viewOverlay = viewOverlayApi14;
        }

        public void add(android.graphics.drawable.Drawable drawable) {
            assertNotDisposed();
            if (this.drawables == null) {
                this.drawables = new java.util.ArrayList<>();
            }
            if (this.drawables.contains(drawable)) {
                return;
            }
            this.drawables.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void remove(android.graphics.drawable.Drawable drawable) {
            java.util.ArrayList<android.graphics.drawable.Drawable> arrayList = this.drawables;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                disposeIfEmpty();
            }
        }

        @Override // android.view.View
        protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
            java.util.ArrayList<android.graphics.drawable.Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.drawables) != null && arrayList.contains(drawable));
        }

        public void add(android.view.View view) {
            assertNotDisposed();
            if (view.getParent() instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
                if (viewGroup != this.hostView && viewGroup.getParent() != null && androidx.core.view.ViewCompat.isAttachedToWindow(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.hostView.getLocationOnScreen(iArr2);
                    androidx.core.view.ViewCompat.offsetLeftAndRight(view, iArr[0] - iArr2[0]);
                    androidx.core.view.ViewCompat.offsetTopAndBottom(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public void remove(android.view.View view) {
            super.removeView(view);
            disposeIfEmpty();
        }

        private void assertNotDisposed() {
            if (this.disposed) {
                throw new java.lang.IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void disposeIfEmpty() {
            if (getChildCount() == 0) {
                java.util.ArrayList<android.graphics.drawable.Drawable> arrayList = this.drawables;
                if (arrayList == null || arrayList.size() == 0) {
                    this.disposed = true;
                    this.hostView.removeView(this);
                }
            }
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(android.graphics.Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.hostView.getLocationOnScreen(iArr);
            this.requestingView.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new android.graphics.Rect(0, 0, this.requestingView.getWidth(), this.requestingView.getHeight()));
            super.dispatchDraw(canvas);
            java.util.ArrayList<android.graphics.drawable.Drawable> arrayList = this.drawables;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.drawables.get(i).draw(canvas);
            }
        }

        private void getOffset(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.hostView.getLocationOnScreen(iArr2);
            this.requestingView.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        protected android.view.ViewParent invalidateChildInParentFast(int i, int i2, android.graphics.Rect rect) {
            if (this.hostView == null || invalidateChildInParentFastMethod == null) {
                return null;
            }
            try {
                getOffset(new int[2]);
                invalidateChildInParentFastMethod.invoke(this.hostView, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), rect);
                return null;
            } catch (java.lang.IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (java.lang.reflect.InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
            if (this.hostView == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.hostView != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                getOffset(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }
    }
}
