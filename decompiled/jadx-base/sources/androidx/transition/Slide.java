package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class Slide extends androidx.transition.Visibility {
    private static final java.lang.String PROPNAME_SCREEN_POSITION = "android:slide:screenPosition";
    private androidx.transition.Slide.CalculateSlide mSlideCalculator;
    private int mSlideEdge;
    private static final android.animation.TimeInterpolator sDecelerate = new android.view.animation.DecelerateInterpolator();
    private static final android.animation.TimeInterpolator sAccelerate = new android.view.animation.AccelerateInterpolator();
    private static final androidx.transition.Slide.CalculateSlide sCalculateLeft = new androidx.transition.Slide.CalculateSlideHorizontal() { // from class: androidx.transition.Slide.1
        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneX(android.view.ViewGroup viewGroup, android.view.View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    private static final androidx.transition.Slide.CalculateSlide sCalculateStart = new androidx.transition.Slide.CalculateSlideHorizontal() { // from class: androidx.transition.Slide.2
        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneX(android.view.ViewGroup viewGroup, android.view.View view) {
            if (androidx.core.view.ViewCompat.getLayoutDirection(viewGroup) == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    private static final androidx.transition.Slide.CalculateSlide sCalculateTop = new androidx.transition.Slide.CalculateSlideVertical() { // from class: androidx.transition.Slide.3
        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneY(android.view.ViewGroup viewGroup, android.view.View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    };
    private static final androidx.transition.Slide.CalculateSlide sCalculateRight = new androidx.transition.Slide.CalculateSlideHorizontal() { // from class: androidx.transition.Slide.4
        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneX(android.view.ViewGroup viewGroup, android.view.View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    private static final androidx.transition.Slide.CalculateSlide sCalculateEnd = new androidx.transition.Slide.CalculateSlideHorizontal() { // from class: androidx.transition.Slide.5
        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneX(android.view.ViewGroup viewGroup, android.view.View view) {
            if (androidx.core.view.ViewCompat.getLayoutDirection(viewGroup) == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    private static final androidx.transition.Slide.CalculateSlide sCalculateBottom = new androidx.transition.Slide.CalculateSlideVertical() { // from class: androidx.transition.Slide.6
        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneY(android.view.ViewGroup viewGroup, android.view.View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    };

    private interface CalculateSlide {
        float getGoneX(android.view.ViewGroup viewGroup, android.view.View view);

        float getGoneY(android.view.ViewGroup viewGroup, android.view.View view);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    private static abstract class CalculateSlideHorizontal implements androidx.transition.Slide.CalculateSlide {
        private CalculateSlideHorizontal() {
        }

        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneY(android.view.ViewGroup viewGroup, android.view.View view) {
            return view.getTranslationY();
        }
    }

    private static abstract class CalculateSlideVertical implements androidx.transition.Slide.CalculateSlide {
        private CalculateSlideVertical() {
        }

        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneX(android.view.ViewGroup viewGroup, android.view.View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        this.mSlideCalculator = sCalculateBottom;
        this.mSlideEdge = 80;
        setSlideEdge(80);
    }

    public Slide(int i) {
        this.mSlideCalculator = sCalculateBottom;
        this.mSlideEdge = 80;
        setSlideEdge(i);
    }

    public Slide(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSlideCalculator = sCalculateBottom;
        this.mSlideEdge = 80;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.SLIDE);
        int namedInt = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, (org.xmlpull.v1.XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        setSlideEdge(namedInt);
    }

    private void captureValues(androidx.transition.TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put(PROPNAME_SCREEN_POSITION, iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        captureValues(transitionValues);
    }

    public void setSlideEdge(int i) {
        if (i == 3) {
            this.mSlideCalculator = sCalculateLeft;
        } else if (i == 5) {
            this.mSlideCalculator = sCalculateRight;
        } else if (i == 48) {
            this.mSlideCalculator = sCalculateTop;
        } else if (i == 80) {
            this.mSlideCalculator = sCalculateBottom;
        } else if (i == 8388611) {
            this.mSlideCalculator = sCalculateStart;
        } else if (i == 8388613) {
            this.mSlideCalculator = sCalculateEnd;
        } else {
            throw new java.lang.IllegalArgumentException("Invalid slide direction");
        }
        this.mSlideEdge = i;
        androidx.transition.SidePropagation sidePropagation = new androidx.transition.SidePropagation();
        sidePropagation.setSide(i);
        setPropagation(sidePropagation);
    }

    public int getSlideEdge() {
        return this.mSlideEdge;
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get(PROPNAME_SCREEN_POSITION);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return androidx.transition.TranslationAnimationCreator.createAnimation(view, transitionValues2, iArr[0], iArr[1], this.mSlideCalculator.getGoneX(viewGroup, view), this.mSlideCalculator.getGoneY(viewGroup, view), translationX, translationY, sDecelerate, this);
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get(PROPNAME_SCREEN_POSITION);
        return androidx.transition.TranslationAnimationCreator.createAnimation(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.mSlideCalculator.getGoneX(viewGroup, view), this.mSlideCalculator.getGoneY(viewGroup, view), sAccelerate, this);
    }
}
