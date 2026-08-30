package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class AnimatorUtils {

    interface AnimatorPauseListenerCompat {
        void onAnimationPause(android.animation.Animator animator);

        void onAnimationResume(android.animation.Animator animator);
    }

    static void addPauseListener(android.animation.Animator animator, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    static void pause(android.animation.Animator animator) {
        animator.pause();
    }

    static void resume(android.animation.Animator animator) {
        animator.resume();
    }

    private AnimatorUtils() {
    }
}
