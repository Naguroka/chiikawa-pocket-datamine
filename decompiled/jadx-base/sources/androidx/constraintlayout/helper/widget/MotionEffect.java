package androidx.constraintlayout.helper.widget;

/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends androidx.constraintlayout.motion.widget.MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final java.lang.String TAG = "FadeMove";
    private static final int UNSET = -1;
    public static final int WEST = 3;
    private int fadeMove;
    private float motionEffectAlpha;
    private int motionEffectEnd;
    private int motionEffectStart;
    private boolean motionEffectStrictMove;
    private int motionEffectTranslationX;
    private int motionEffectTranslationY;
    private int viewTransitionId;

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isDecorator() {
        return true;
    }

    public MotionEffect(android.content.Context context) {
        super(context);
        this.motionEffectAlpha = 0.1f;
        this.motionEffectStart = 49;
        this.motionEffectEnd = 50;
        this.motionEffectTranslationX = 0;
        this.motionEffectTranslationY = 0;
        this.motionEffectStrictMove = true;
        this.viewTransitionId = -1;
        this.fadeMove = -1;
    }

    public MotionEffect(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.motionEffectAlpha = 0.1f;
        this.motionEffectStart = 49;
        this.motionEffectEnd = 50;
        this.motionEffectTranslationX = 0;
        this.motionEffectTranslationY = 0;
        this.motionEffectStrictMove = true;
        this.viewTransitionId = -1;
        this.fadeMove = -1;
        init(context, attrs);
    }

    public MotionEffect(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.motionEffectAlpha = 0.1f;
        this.motionEffectStart = 49;
        this.motionEffectEnd = 50;
        this.motionEffectTranslationX = 0;
        this.motionEffectTranslationY = 0;
        this.motionEffectStrictMove = true;
        this.viewTransitionId = -1;
        this.fadeMove = -1;
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.MotionEffect);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_start) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.motionEffectStart);
                    this.motionEffectStart = i2;
                    this.motionEffectStart = java.lang.Math.max(java.lang.Math.min(i2, 99), 0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_end) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.motionEffectEnd);
                    this.motionEffectEnd = i3;
                    this.motionEffectEnd = java.lang.Math.max(java.lang.Math.min(i3, 99), 0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_translationX) {
                    this.motionEffectTranslationX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.motionEffectTranslationX);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_translationY) {
                    this.motionEffectTranslationY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.motionEffectTranslationY);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_alpha) {
                    this.motionEffectAlpha = typedArrayObtainStyledAttributes.getFloat(index, this.motionEffectAlpha);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_move) {
                    this.fadeMove = typedArrayObtainStyledAttributes.getInt(index, this.fadeMove);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_strict) {
                    this.motionEffectStrictMove = typedArrayObtainStyledAttributes.getBoolean(index, this.motionEffectStrictMove);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_viewTransition) {
                    this.viewTransitionId = typedArrayObtainStyledAttributes.getResourceId(index, this.viewTransitionId);
                }
            }
            int i4 = this.motionEffectStart;
            int i5 = this.motionEffectEnd;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.motionEffectStart = i4 - 1;
                } else {
                    this.motionEffectEnd = i5 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0164  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0188, code lost:
    
        if (r14 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019c, code lost:
    
        if (r14 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ac, code lost:
    
        if (r15 == 0.0f) goto L56;
     */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> controllerMap) {
        androidx.constraintlayout.motion.widget.Key keyAttributes;
        androidx.constraintlayout.motion.widget.Key keyAttributes2;
        androidx.constraintlayout.motion.widget.Key keyAttributes3;
        boolean z;
        java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> map = controllerMap;
        android.view.View[] views = getViews((androidx.constraintlayout.widget.ConstraintLayout) getParent());
        if (views == null) {
            android.util.Log.v(TAG, androidx.constraintlayout.motion.widget.Debug.getLoc() + " views = null");
            return;
        }
        androidx.constraintlayout.motion.widget.Key keyAttributes4 = new androidx.constraintlayout.motion.widget.KeyAttributes();
        androidx.constraintlayout.motion.widget.Key keyAttributes5 = new androidx.constraintlayout.motion.widget.KeyAttributes();
        keyAttributes4.setValue("alpha", java.lang.Float.valueOf(this.motionEffectAlpha));
        keyAttributes5.setValue("alpha", java.lang.Float.valueOf(this.motionEffectAlpha));
        keyAttributes4.setFramePosition(this.motionEffectStart);
        keyAttributes5.setFramePosition(this.motionEffectEnd);
        androidx.constraintlayout.motion.widget.KeyPosition keyPosition = new androidx.constraintlayout.motion.widget.KeyPosition();
        keyPosition.setFramePosition(this.motionEffectStart);
        keyPosition.setType(0);
        keyPosition.setValue("percentX", 0);
        keyPosition.setValue("percentY", 0);
        androidx.constraintlayout.motion.widget.KeyPosition keyPosition2 = new androidx.constraintlayout.motion.widget.KeyPosition();
        keyPosition2.setFramePosition(this.motionEffectEnd);
        keyPosition2.setType(0);
        keyPosition2.setValue("percentX", 1);
        keyPosition2.setValue("percentY", 1);
        androidx.constraintlayout.motion.widget.Key keyAttributes6 = null;
        if (this.motionEffectTranslationX > 0) {
            keyAttributes = new androidx.constraintlayout.motion.widget.KeyAttributes();
            keyAttributes2 = new androidx.constraintlayout.motion.widget.KeyAttributes();
            keyAttributes.setValue("translationX", java.lang.Integer.valueOf(this.motionEffectTranslationX));
            keyAttributes.setFramePosition(this.motionEffectEnd);
            keyAttributes2.setValue("translationX", 0);
            keyAttributes2.setFramePosition(this.motionEffectEnd - 1);
        } else {
            keyAttributes = null;
            keyAttributes2 = null;
        }
        if (this.motionEffectTranslationY > 0) {
            keyAttributes6 = new androidx.constraintlayout.motion.widget.KeyAttributes();
            keyAttributes3 = new androidx.constraintlayout.motion.widget.KeyAttributes();
            keyAttributes6.setValue("translationY", java.lang.Integer.valueOf(this.motionEffectTranslationY));
            keyAttributes6.setFramePosition(this.motionEffectEnd);
            keyAttributes3.setValue("translationY", 0);
            keyAttributes3.setFramePosition(this.motionEffectEnd - 1);
        } else {
            keyAttributes3 = null;
        }
        int i = this.fadeMove;
        if (i == -1) {
            int[] iArr = new int[4];
            for (android.view.View view : views) {
                androidx.constraintlayout.motion.widget.MotionController motionController = map.get(view);
                if (motionController != null) {
                    float finalX = motionController.getFinalX() - motionController.getStartX();
                    float finalY = motionController.getFinalY() - motionController.getStartY();
                    if (finalY < 0.0f) {
                        iArr[1] = iArr[1] + 1;
                    }
                    if (finalY > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (finalX > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (finalX < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
            }
            int i2 = iArr[0];
            i = 0;
            for (int i3 = 1; i3 < 4; i3++) {
                int i4 = iArr[i3];
                if (i2 < i4) {
                    i = i3;
                    i2 = i4;
                }
            }
        }
        int i5 = 0;
        while (i5 < views.length) {
            androidx.constraintlayout.motion.widget.MotionController motionController2 = map.get(views[i5]);
            if (motionController2 != null) {
                float finalX2 = motionController2.getFinalX() - motionController2.getStartX();
                float finalY2 = motionController2.getFinalY() - motionController2.getStartY();
                if (i == 0) {
                    if (finalY2 > 0.0f) {
                        if (this.motionEffectStrictMove) {
                        }
                    }
                } else if (i == 1) {
                    if (finalY2 < 0.0f) {
                        if (this.motionEffectStrictMove) {
                        }
                    }
                } else if (i != 2) {
                    z = i != 3 || finalX2 <= 0.0f || (this.motionEffectStrictMove && finalY2 != 0.0f);
                } else if (finalX2 < 0.0f) {
                    if (this.motionEffectStrictMove) {
                    }
                }
                if (z) {
                    int i6 = this.viewTransitionId;
                    if (i6 == -1) {
                        motionController2.addKey(keyAttributes4);
                        motionController2.addKey(keyAttributes5);
                        motionController2.addKey(keyPosition);
                        motionController2.addKey(keyPosition2);
                        if (this.motionEffectTranslationX > 0) {
                            motionController2.addKey(keyAttributes);
                            motionController2.addKey(keyAttributes2);
                        }
                        if (this.motionEffectTranslationY > 0) {
                            motionController2.addKey(keyAttributes6);
                            motionController2.addKey(keyAttributes3);
                        }
                    } else {
                        motionLayout.applyViewTransition(i6, motionController2);
                    }
                }
            }
            i5++;
            map = controllerMap;
        }
    }
}
