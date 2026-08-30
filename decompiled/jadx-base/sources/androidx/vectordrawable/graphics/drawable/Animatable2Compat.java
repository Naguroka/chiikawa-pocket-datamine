package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes3.dex */
public interface Animatable2Compat extends android.graphics.drawable.Animatable {
    void clearAnimationCallbacks();

    void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback);

    boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback);

    public static abstract class AnimationCallback {
        android.graphics.drawable.Animatable2.AnimationCallback mPlatformCallback;

        public void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
        }

        public void onAnimationStart(android.graphics.drawable.Drawable drawable) {
        }

        android.graphics.drawable.Animatable2.AnimationCallback getPlatformCallback() {
            if (this.mPlatformCallback == null) {
                this.mPlatformCallback = new android.graphics.drawable.Animatable2.AnimationCallback() { // from class: androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback.1
                    @Override // android.graphics.drawable.Animatable2.AnimationCallback
                    public void onAnimationStart(android.graphics.drawable.Drawable drawable) {
                        androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback.this.onAnimationStart(drawable);
                    }

                    @Override // android.graphics.drawable.Animatable2.AnimationCallback
                    public void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
                        androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback.this.onAnimationEnd(drawable);
                    }
                };
            }
            return this.mPlatformCallback;
        }
    }
}
