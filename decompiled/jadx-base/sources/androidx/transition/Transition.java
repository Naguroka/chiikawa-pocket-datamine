package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Transition implements java.lang.Cloneable {
    static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final java.lang.String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final java.lang.String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final java.lang.String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final java.lang.String MATCH_NAME_STR = "name";
    private java.util.ArrayList<androidx.transition.TransitionValues> mEndValuesList;
    private androidx.transition.Transition.EpicenterCallback mEpicenterCallback;
    private androidx.collection.ArrayMap<java.lang.String, java.lang.String> mNameOverrides;
    androidx.transition.TransitionPropagation mPropagation;
    private java.util.ArrayList<androidx.transition.TransitionValues> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final androidx.transition.PathMotion STRAIGHT_PATH_MOTION = new androidx.transition.PathMotion() { // from class: androidx.transition.Transition.1
        @Override // androidx.transition.PathMotion
        public android.graphics.Path getPath(float f, float f2, float f3, float f4) {
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    private static java.lang.ThreadLocal<androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo>> sRunningAnimators = new java.lang.ThreadLocal<>();
    private java.lang.String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private android.animation.TimeInterpolator mInterpolator = null;
    java.util.ArrayList<java.lang.Integer> mTargetIds = new java.util.ArrayList<>();
    java.util.ArrayList<android.view.View> mTargets = new java.util.ArrayList<>();
    private java.util.ArrayList<java.lang.String> mTargetNames = null;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypes = null;
    private java.util.ArrayList<java.lang.Integer> mTargetIdExcludes = null;
    private java.util.ArrayList<android.view.View> mTargetExcludes = null;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypeExcludes = null;
    private java.util.ArrayList<java.lang.String> mTargetNameExcludes = null;
    private java.util.ArrayList<java.lang.Integer> mTargetIdChildExcludes = null;
    private java.util.ArrayList<android.view.View> mTargetChildExcludes = null;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypeChildExcludes = null;
    private androidx.transition.TransitionValuesMaps mStartValues = new androidx.transition.TransitionValuesMaps();
    private androidx.transition.TransitionValuesMaps mEndValues = new androidx.transition.TransitionValuesMaps();
    androidx.transition.TransitionSet mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    java.util.ArrayList<android.animation.Animator> mCurrentAnimators = new java.util.ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private java.util.ArrayList<androidx.transition.Transition.TransitionListener> mListeners = null;
    private java.util.ArrayList<android.animation.Animator> mAnimators = new java.util.ArrayList<>();
    private androidx.transition.PathMotion mPathMotion = STRAIGHT_PATH_MOTION;

    public static abstract class EpicenterCallback {
        public abstract android.graphics.Rect onGetEpicenter(androidx.transition.Transition transition);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MatchOrder {
    }

    public interface TransitionListener {
        void onTransitionCancel(androidx.transition.Transition transition);

        void onTransitionEnd(androidx.transition.Transition transition);

        void onTransitionPause(androidx.transition.Transition transition);

        void onTransitionResume(androidx.transition.Transition transition);

        void onTransitionStart(androidx.transition.Transition transition);
    }

    private static boolean isValidMatch(int i) {
        return i >= 1 && i <= 4;
    }

    public abstract void captureEndValues(androidx.transition.TransitionValues transitionValues);

    public abstract void captureStartValues(androidx.transition.TransitionValues transitionValues);

    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        return null;
    }

    public java.lang.String[] getTransitionProperties() {
        return null;
    }

    public Transition() {
    }

    public Transition(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.TRANSITION);
        android.content.res.XmlResourceParser xmlResourceParser = (android.content.res.XmlResourceParser) attributeSet;
        long namedInt = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (namedInt >= 0) {
            setDuration(namedInt);
        }
        long namedInt2 = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (namedInt2 > 0) {
            setStartDelay(namedInt2);
        }
        int namedResourceId = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context, namedResourceId));
        }
        java.lang.String namedString = androidx.core.content.res.TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (namedString != null) {
            setMatchOrder(parseMatchOrder(namedString));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private static int[] parseMatchOrder(java.lang.String str) {
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(strTrim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                iArr[i] = 4;
            } else if (strTrim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new android.view.InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
            }
            i++;
        }
        return iArr;
    }

    public androidx.transition.Transition setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public androidx.transition.Transition setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public androidx.transition.Transition setInterpolator(android.animation.TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public android.animation.TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!isValidMatch(iArr[i])) {
                throw new java.lang.IllegalArgumentException("matches contains invalid value");
            }
            if (alreadyContains(iArr, i)) {
                throw new java.lang.IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    private static boolean alreadyContains(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private void matchInstances(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap2) {
        androidx.transition.TransitionValues transitionValuesRemove;
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            android.view.View viewKeyAt = arrayMap.keyAt(size);
            if (viewKeyAt != null && isValidTarget(viewKeyAt) && (transitionValuesRemove = arrayMap2.remove(viewKeyAt)) != null && isValidTarget(transitionValuesRemove.view)) {
                this.mStartValuesList.add(arrayMap.removeAt(size));
                this.mEndValuesList.add(transitionValuesRemove);
            }
        }
    }

    private void matchItemIds(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap2, androidx.collection.LongSparseArray<android.view.View> longSparseArray, androidx.collection.LongSparseArray<android.view.View> longSparseArray2) {
        android.view.View view;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            android.view.View viewValueAt = longSparseArray.valueAt(i);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = longSparseArray2.get(longSparseArray.keyAt(i))) != null && isValidTarget(view)) {
                androidx.transition.TransitionValues transitionValues = arrayMap.get(viewValueAt);
                androidx.transition.TransitionValues transitionValues2 = arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.mStartValuesList.add(transitionValues);
                    this.mEndValuesList.add(transitionValues2);
                    arrayMap.remove(viewValueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchIds(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap2, android.util.SparseArray<android.view.View> sparseArray, android.util.SparseArray<android.view.View> sparseArray2) {
        android.view.View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            android.view.View viewValueAt = sparseArray.valueAt(i);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                androidx.transition.TransitionValues transitionValues = arrayMap.get(viewValueAt);
                androidx.transition.TransitionValues transitionValues2 = arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.mStartValuesList.add(transitionValues);
                    this.mEndValuesList.add(transitionValues2);
                    arrayMap.remove(viewValueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchNames(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap2, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap3, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap4) {
        android.view.View view;
        int size = arrayMap3.size();
        for (int i = 0; i < size; i++) {
            android.view.View viewValueAt = arrayMap3.valueAt(i);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = arrayMap4.get(arrayMap3.keyAt(i))) != null && isValidTarget(view)) {
                androidx.transition.TransitionValues transitionValues = arrayMap.get(viewValueAt);
                androidx.transition.TransitionValues transitionValues2 = arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.mStartValuesList.add(transitionValues);
                    this.mEndValuesList.add(transitionValues2);
                    arrayMap.remove(viewValueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void addUnmatched(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap2) {
        for (int i = 0; i < arrayMap.size(); i++) {
            androidx.transition.TransitionValues transitionValuesValueAt = arrayMap.valueAt(i);
            if (isValidTarget(transitionValuesValueAt.view)) {
                this.mStartValuesList.add(transitionValuesValueAt);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < arrayMap2.size(); i2++) {
            androidx.transition.TransitionValues transitionValuesValueAt2 = arrayMap2.valueAt(i2);
            if (isValidTarget(transitionValuesValueAt2.view)) {
                this.mEndValuesList.add(transitionValuesValueAt2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private void matchStartAndEnd(androidx.transition.TransitionValuesMaps transitionValuesMaps, androidx.transition.TransitionValuesMaps transitionValuesMaps2) {
        androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap = new androidx.collection.ArrayMap<>(transitionValuesMaps.mViewValues);
        androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap2 = new androidx.collection.ArrayMap<>(transitionValuesMaps2.mViewValues);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    matchInstances(arrayMap, arrayMap2);
                } else if (i2 == 2) {
                    matchNames(arrayMap, arrayMap2, transitionValuesMaps.mNameValues, transitionValuesMaps2.mNameValues);
                } else if (i2 == 3) {
                    matchIds(arrayMap, arrayMap2, transitionValuesMaps.mIdValues, transitionValuesMaps2.mIdValues);
                } else if (i2 == 4) {
                    matchItemIds(arrayMap, arrayMap2, transitionValuesMaps.mItemIdValues, transitionValuesMaps2.mItemIdValues);
                }
                i++;
            } else {
                addUnmatched(arrayMap, arrayMap2);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    protected void createAnimators(android.view.ViewGroup viewGroup, androidx.transition.TransitionValuesMaps transitionValuesMaps, androidx.transition.TransitionValuesMaps transitionValuesMaps2, java.util.ArrayList<androidx.transition.TransitionValues> arrayList, java.util.ArrayList<androidx.transition.TransitionValues> arrayList2) {
        android.animation.Animator animatorCreateAnimator;
        int i;
        int i2;
        android.view.View view;
        android.animation.Animator animator;
        androidx.transition.TransitionValues transitionValues;
        android.animation.Animator animator2;
        androidx.transition.TransitionValues transitionValues2;
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> runningAnimators = getRunningAnimators();
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            androidx.transition.TransitionValues transitionValues3 = arrayList.get(i3);
            androidx.transition.TransitionValues transitionValues4 = arrayList2.get(i3);
            if (transitionValues3 != null && !transitionValues3.mTargetedTransitions.contains(this)) {
                transitionValues3 = null;
            }
            if (transitionValues4 != null && !transitionValues4.mTargetedTransitions.contains(this)) {
                transitionValues4 = null;
            }
            if (transitionValues3 == null && transitionValues4 == null) {
                i = size;
                i2 = i3;
            } else if (!(transitionValues3 == null || transitionValues4 == null || isTransitionRequired(transitionValues3, transitionValues4)) || (animatorCreateAnimator = createAnimator(viewGroup, transitionValues3, transitionValues4)) == null) {
                i = size;
                i2 = i3;
            } else {
                if (transitionValues4 != null) {
                    view = transitionValues4.view;
                    java.lang.String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        transitionValues2 = new androidx.transition.TransitionValues(view);
                        i = size;
                        androidx.transition.TransitionValues transitionValues5 = transitionValuesMaps2.mViewValues.get(view);
                        if (transitionValues5 != null) {
                            int i4 = 0;
                            while (i4 < transitionProperties.length) {
                                transitionValues2.values.put(transitionProperties[i4], transitionValues5.values.get(transitionProperties[i4]));
                                i4++;
                                i3 = i3;
                                transitionValues5 = transitionValues5;
                            }
                        }
                        i2 = i3;
                        int size2 = runningAnimators.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                animator2 = animatorCreateAnimator;
                                break;
                            }
                            androidx.transition.Transition.AnimationInfo animationInfo = runningAnimators.get(runningAnimators.keyAt(i5));
                            if (animationInfo.mValues != null && animationInfo.mView == view && animationInfo.mName.equals(getName()) && animationInfo.mValues.equals(transitionValues2)) {
                                animator2 = null;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        i = size;
                        i2 = i3;
                        animator2 = animatorCreateAnimator;
                        transitionValues2 = null;
                    }
                    animator = animator2;
                    transitionValues = transitionValues2;
                } else {
                    i = size;
                    i2 = i3;
                    view = transitionValues3.view;
                    animator = animatorCreateAnimator;
                    transitionValues = null;
                }
                if (animator != null) {
                    androidx.transition.TransitionPropagation transitionPropagation = this.mPropagation;
                    if (transitionPropagation != null) {
                        long startDelay = transitionPropagation.getStartDelay(viewGroup, this, transitionValues3, transitionValues4);
                        sparseIntArray.put(this.mAnimators.size(), (int) startDelay);
                        jMin = java.lang.Math.min(startDelay, jMin);
                    }
                    runningAnimators.put(animator, new androidx.transition.Transition.AnimationInfo(view, getName(), this, androidx.transition.ViewUtils.getWindowId(viewGroup), transitionValues));
                    this.mAnimators.add(animator);
                    jMin = jMin;
                }
            }
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                android.animation.Animator animator3 = this.mAnimators.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i6)) - jMin) + animator3.getStartDelay());
            }
        }
    }

    boolean isValidTarget(android.view.View view) {
        java.util.ArrayList<java.lang.Class<?>> arrayList;
        java.util.ArrayList<java.lang.String> arrayList2;
        int id = view.getId();
        java.util.ArrayList<java.lang.Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(java.lang.Integer.valueOf(id))) {
            return false;
        }
        java.util.ArrayList<android.view.View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        java.util.ArrayList<java.lang.Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && androidx.core.view.ViewCompat.getTransitionName(view) != null && this.mTargetNameExcludes.contains(androidx.core.view.ViewCompat.getTransitionName(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(java.lang.Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        java.util.ArrayList<java.lang.String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(androidx.core.view.ViewCompat.getTransitionName(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (this.mTargetTypes.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> getRunningAnimators() {
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> arrayMap = sRunningAnimators.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> arrayMap2 = new androidx.collection.ArrayMap<>();
        sRunningAnimators.set(arrayMap2);
        return arrayMap2;
    }

    protected void runAnimators() {
        start();
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> runningAnimators = getRunningAnimators();
        for (android.animation.Animator animator : this.mAnimators) {
            if (runningAnimators.containsKey(animator)) {
                start();
                runAnimator(animator, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    private void runAnimator(android.animation.Animator animator, final androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> arrayMap) {
        if (animator != null) {
            animator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.transition.Transition.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator2) {
                    androidx.transition.Transition.this.mCurrentAnimators.add(animator2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator2) {
                    arrayMap.remove(animator2);
                    androidx.transition.Transition.this.mCurrentAnimators.remove(animator2);
                }
            });
            animate(animator);
        }
    }

    public androidx.transition.Transition addTarget(android.view.View view) {
        this.mTargets.add(view);
        return this;
    }

    public androidx.transition.Transition addTarget(int i) {
        if (i != 0) {
            this.mTargetIds.add(java.lang.Integer.valueOf(i));
        }
        return this;
    }

    public androidx.transition.Transition addTarget(java.lang.String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new java.util.ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public androidx.transition.Transition addTarget(java.lang.Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new java.util.ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public androidx.transition.Transition removeTarget(android.view.View view) {
        this.mTargets.remove(view);
        return this;
    }

    public androidx.transition.Transition removeTarget(int i) {
        if (i != 0) {
            this.mTargetIds.remove(java.lang.Integer.valueOf(i));
        }
        return this;
    }

    public androidx.transition.Transition removeTarget(java.lang.String str) {
        java.util.ArrayList<java.lang.String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public androidx.transition.Transition removeTarget(java.lang.Class<?> cls) {
        java.util.ArrayList<java.lang.Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    private static <T> java.util.ArrayList<T> excludeObject(java.util.ArrayList<T> arrayList, T t, boolean z) {
        if (t == null) {
            return arrayList;
        }
        if (z) {
            return androidx.transition.Transition.ArrayListManager.add(arrayList, t);
        }
        return androidx.transition.Transition.ArrayListManager.remove(arrayList, t);
    }

    public androidx.transition.Transition excludeTarget(android.view.View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    public androidx.transition.Transition excludeTarget(int i, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i, z);
        return this;
    }

    public androidx.transition.Transition excludeTarget(java.lang.String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    public androidx.transition.Transition excludeChildren(android.view.View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    public androidx.transition.Transition excludeChildren(int i, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    private java.util.ArrayList<java.lang.Integer> excludeId(java.util.ArrayList<java.lang.Integer> arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        if (z) {
            return androidx.transition.Transition.ArrayListManager.add(arrayList, java.lang.Integer.valueOf(i));
        }
        return androidx.transition.Transition.ArrayListManager.remove(arrayList, java.lang.Integer.valueOf(i));
    }

    private java.util.ArrayList<android.view.View> excludeView(java.util.ArrayList<android.view.View> arrayList, android.view.View view, boolean z) {
        if (view == null) {
            return arrayList;
        }
        if (z) {
            return androidx.transition.Transition.ArrayListManager.add(arrayList, view);
        }
        return androidx.transition.Transition.ArrayListManager.remove(arrayList, view);
    }

    public androidx.transition.Transition excludeTarget(java.lang.Class<?> cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public androidx.transition.Transition excludeChildren(java.lang.Class<?> cls, boolean z) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    private java.util.ArrayList<java.lang.Class<?>> excludeType(java.util.ArrayList<java.lang.Class<?>> arrayList, java.lang.Class<?> cls, boolean z) {
        if (cls == null) {
            return arrayList;
        }
        if (z) {
            return androidx.transition.Transition.ArrayListManager.add(arrayList, cls);
        }
        return androidx.transition.Transition.ArrayListManager.remove(arrayList, cls);
    }

    public java.util.List<java.lang.Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public java.util.List<android.view.View> getTargets() {
        return this.mTargets;
    }

    public java.util.List<java.lang.String> getTargetNames() {
        return this.mTargetNames;
    }

    public java.util.List<java.lang.Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    void captureValues(android.view.ViewGroup viewGroup, boolean z) {
        java.util.ArrayList<java.lang.String> arrayList;
        java.util.ArrayList<java.lang.Class<?>> arrayList2;
        androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                android.view.View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (viewFindViewById != null) {
                    androidx.transition.TransitionValues transitionValues = new androidx.transition.TransitionValues(viewFindViewById);
                    if (z) {
                        captureStartValues(transitionValues);
                    } else {
                        captureEndValues(transitionValues);
                    }
                    transitionValues.mTargetedTransitions.add(this);
                    capturePropagationValues(transitionValues);
                    if (z) {
                        addViewValues(this.mStartValues, viewFindViewById, transitionValues);
                    } else {
                        addViewValues(this.mEndValues, viewFindViewById, transitionValues);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                android.view.View view = this.mTargets.get(i2);
                androidx.transition.TransitionValues transitionValues2 = new androidx.transition.TransitionValues(view);
                if (z) {
                    captureStartValues(transitionValues2);
                } else {
                    captureEndValues(transitionValues2);
                }
                transitionValues2.mTargetedTransitions.add(this);
                capturePropagationValues(transitionValues2);
                if (z) {
                    addViewValues(this.mStartValues, view, transitionValues2);
                } else {
                    addViewValues(this.mEndValues, view, transitionValues2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z);
        }
        if (z || (arrayMap = this.mNameOverrides) == null) {
            return;
        }
        int size = arrayMap.size();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.mStartValues.mNameValues.remove(this.mNameOverrides.keyAt(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            android.view.View view2 = (android.view.View) arrayList3.get(i4);
            if (view2 != null) {
                this.mStartValues.mNameValues.put(this.mNameOverrides.valueAt(i4), view2);
            }
        }
    }

    private static void addViewValues(androidx.transition.TransitionValuesMaps transitionValuesMaps, android.view.View view, androidx.transition.TransitionValues transitionValues) {
        transitionValuesMaps.mViewValues.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (transitionValuesMaps.mIdValues.indexOfKey(id) >= 0) {
                transitionValuesMaps.mIdValues.put(id, null);
            } else {
                transitionValuesMaps.mIdValues.put(id, view);
            }
        }
        java.lang.String transitionName = androidx.core.view.ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            if (transitionValuesMaps.mNameValues.containsKey(transitionName)) {
                transitionValuesMaps.mNameValues.put(transitionName, null);
            } else {
                transitionValuesMaps.mNameValues.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof android.widget.ListView) {
            android.widget.ListView listView = (android.widget.ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (transitionValuesMaps.mItemIdValues.indexOfKey(itemIdAtPosition) >= 0) {
                    android.view.View view2 = transitionValuesMaps.mItemIdValues.get(itemIdAtPosition);
                    if (view2 != null) {
                        androidx.core.view.ViewCompat.setHasTransientState(view2, false);
                        transitionValuesMaps.mItemIdValues.put(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                androidx.core.view.ViewCompat.setHasTransientState(view, true);
                transitionValuesMaps.mItemIdValues.put(itemIdAtPosition, view);
            }
        }
    }

    void clearValues(boolean z) {
        if (z) {
            this.mStartValues.mViewValues.clear();
            this.mStartValues.mIdValues.clear();
            this.mStartValues.mItemIdValues.clear();
        } else {
            this.mEndValues.mViewValues.clear();
            this.mEndValues.mIdValues.clear();
            this.mEndValues.mItemIdValues.clear();
        }
    }

    private void captureHierarchy(android.view.View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        java.util.ArrayList<java.lang.Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(java.lang.Integer.valueOf(id))) {
            java.util.ArrayList<android.view.View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                java.util.ArrayList<java.lang.Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof android.view.ViewGroup) {
                    androidx.transition.TransitionValues transitionValues = new androidx.transition.TransitionValues(view);
                    if (z) {
                        captureStartValues(transitionValues);
                    } else {
                        captureEndValues(transitionValues);
                    }
                    transitionValues.mTargetedTransitions.add(this);
                    capturePropagationValues(transitionValues);
                    if (z) {
                        addViewValues(this.mStartValues, view, transitionValues);
                    } else {
                        addViewValues(this.mEndValues, view, transitionValues);
                    }
                }
                if (view instanceof android.view.ViewGroup) {
                    java.util.ArrayList<java.lang.Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(java.lang.Integer.valueOf(id))) {
                        java.util.ArrayList<android.view.View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            java.util.ArrayList<java.lang.Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                captureHierarchy(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public androidx.transition.TransitionValues getTransitionValues(android.view.View view, boolean z) {
        androidx.transition.TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z);
        }
        return (z ? this.mStartValues : this.mEndValues).mViewValues.get(view);
    }

    androidx.transition.TransitionValues getMatchedTransitionValues(android.view.View view, boolean z) {
        androidx.transition.TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getMatchedTransitionValues(view, z);
        }
        java.util.ArrayList<androidx.transition.TransitionValues> arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            androidx.transition.TransitionValues transitionValues = arrayList.get(i);
            if (transitionValues == null) {
                return null;
            }
            if (transitionValues.view == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (z ? this.mEndValuesList : this.mStartValuesList).get(i);
        }
        return null;
    }

    public void pause(android.view.View view) {
        if (this.mEnded) {
            return;
        }
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            androidx.transition.AnimatorUtils.pause(this.mCurrentAnimators.get(size));
        }
        java.util.ArrayList<androidx.transition.Transition.TransitionListener> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((androidx.transition.Transition.TransitionListener) arrayList2.get(i)).onTransitionPause(this);
            }
        }
        this.mPaused = true;
    }

    public void resume(android.view.View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
                    androidx.transition.AnimatorUtils.resume(this.mCurrentAnimators.get(size));
                }
                java.util.ArrayList<androidx.transition.Transition.TransitionListener> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((androidx.transition.Transition.TransitionListener) arrayList2.get(i)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    void playTransition(android.view.ViewGroup viewGroup) {
        androidx.transition.Transition.AnimationInfo animationInfo;
        this.mStartValuesList = new java.util.ArrayList<>();
        this.mEndValuesList = new java.util.ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        androidx.transition.WindowIdImpl windowId = androidx.transition.ViewUtils.getWindowId(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            android.animation.Animator animatorKeyAt = runningAnimators.keyAt(i);
            if (animatorKeyAt != null && (animationInfo = runningAnimators.get(animatorKeyAt)) != null && animationInfo.mView != null && windowId.equals(animationInfo.mWindowId)) {
                androidx.transition.TransitionValues transitionValues = animationInfo.mValues;
                android.view.View view = animationInfo.mView;
                androidx.transition.TransitionValues transitionValues2 = getTransitionValues(view, true);
                androidx.transition.TransitionValues matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues2 == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.mViewValues.get(view);
                }
                if (!(transitionValues2 == null && matchedTransitionValues == null) && animationInfo.mTransition.isTransitionRequired(transitionValues, matchedTransitionValues)) {
                    if (animatorKeyAt.isRunning() || animatorKeyAt.isStarted()) {
                        animatorKeyAt.cancel();
                    } else {
                        runningAnimators.remove(animatorKeyAt);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public boolean isTransitionRequired(androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return false;
        }
        java.lang.String[] transitionProperties = getTransitionProperties();
        if (transitionProperties != null) {
            for (java.lang.String str : transitionProperties) {
                if (!isValueChanged(transitionValues, transitionValues2, str)) {
                }
            }
            return false;
        }
        java.util.Iterator<java.lang.String> it = transitionValues.values.keySet().iterator();
        while (it.hasNext()) {
            if (isValueChanged(transitionValues, transitionValues2, it.next())) {
            }
        }
        return false;
        return true;
    }

    private static boolean isValueChanged(androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2, java.lang.String str) {
        java.lang.Object obj = transitionValues.values.get(str);
        java.lang.Object obj2 = transitionValues2.values.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    protected void animate(android.animation.Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.transition.Transition.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator2) {
                androidx.transition.Transition.this.end();
                animator2.removeListener(this);
            }
        });
        animator.start();
    }

    protected void start() {
        if (this.mNumInstances == 0) {
            java.util.ArrayList<androidx.transition.Transition.TransitionListener> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((androidx.transition.Transition.TransitionListener) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    protected void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            java.util.ArrayList<androidx.transition.Transition.TransitionListener> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.transition.Transition.TransitionListener) arrayList2.get(i2)).onTransitionEnd(this);
                }
            }
            for (int i3 = 0; i3 < this.mStartValues.mItemIdValues.size(); i3++) {
                android.view.View viewValueAt = this.mStartValues.mItemIdValues.valueAt(i3);
                if (viewValueAt != null) {
                    androidx.core.view.ViewCompat.setHasTransientState(viewValueAt, false);
                }
            }
            for (int i4 = 0; i4 < this.mEndValues.mItemIdValues.size(); i4++) {
                android.view.View viewValueAt2 = this.mEndValues.mItemIdValues.valueAt(i4);
                if (viewValueAt2 != null) {
                    androidx.core.view.ViewCompat.setHasTransientState(viewValueAt2, false);
                }
            }
            this.mEnded = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void forceToEnd(android.view.ViewGroup viewGroup) {
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        androidx.transition.WindowIdImpl windowId = androidx.transition.ViewUtils.getWindowId(viewGroup);
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(runningAnimators);
        runningAnimators.clear();
        for (int i = size - 1; i >= 0; i--) {
            androidx.transition.Transition.AnimationInfo animationInfo = (androidx.transition.Transition.AnimationInfo) arrayMap.valueAt(i);
            if (animationInfo.mView != null && windowId != null && windowId.equals(animationInfo.mWindowId)) {
                ((android.animation.Animator) arrayMap.keyAt(i)).end();
            }
        }
    }

    protected void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        java.util.ArrayList<androidx.transition.Transition.TransitionListener> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((androidx.transition.Transition.TransitionListener) arrayList2.get(i)).onTransitionCancel(this);
        }
    }

    public androidx.transition.Transition addListener(androidx.transition.Transition.TransitionListener transitionListener) {
        if (this.mListeners == null) {
            this.mListeners = new java.util.ArrayList<>();
        }
        this.mListeners.add(transitionListener);
        return this;
    }

    public androidx.transition.Transition removeListener(androidx.transition.Transition.TransitionListener transitionListener) {
        java.util.ArrayList<androidx.transition.Transition.TransitionListener> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(transitionListener);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    public void setPathMotion(androidx.transition.PathMotion pathMotion) {
        if (pathMotion == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pathMotion;
        }
    }

    public androidx.transition.PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    public void setEpicenterCallback(androidx.transition.Transition.EpicenterCallback epicenterCallback) {
        this.mEpicenterCallback = epicenterCallback;
    }

    public androidx.transition.Transition.EpicenterCallback getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public android.graphics.Rect getEpicenter() {
        androidx.transition.Transition.EpicenterCallback epicenterCallback = this.mEpicenterCallback;
        if (epicenterCallback == null) {
            return null;
        }
        return epicenterCallback.onGetEpicenter(this);
    }

    public void setPropagation(androidx.transition.TransitionPropagation transitionPropagation) {
        this.mPropagation = transitionPropagation;
    }

    public androidx.transition.TransitionPropagation getPropagation() {
        return this.mPropagation;
    }

    void capturePropagationValues(androidx.transition.TransitionValues transitionValues) {
        java.lang.String[] propagationProperties;
        if (this.mPropagation == null || transitionValues.values.isEmpty() || (propagationProperties = this.mPropagation.getPropagationProperties()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= propagationProperties.length) {
                z = true;
                break;
            } else if (!transitionValues.values.containsKey(propagationProperties[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.mPropagation.captureValues(transitionValues);
    }

    void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public java.lang.String toString() {
        return toString("");
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public androidx.transition.Transition mo467clone() {
        try {
            androidx.transition.Transition transition = (androidx.transition.Transition) super.clone();
            transition.mAnimators = new java.util.ArrayList<>();
            transition.mStartValues = new androidx.transition.TransitionValuesMaps();
            transition.mEndValues = new androidx.transition.TransitionValuesMaps();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            return transition;
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    public java.lang.String getName() {
        return this.mName;
    }

    java.lang.String toString(java.lang.String str) {
        java.lang.String str2 = str + getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(hashCode()) + ": ";
        if (this.mDuration != -1) {
            str2 = str2 + "dur(" + this.mDuration + ") ";
        }
        if (this.mStartDelay != -1) {
            str2 = str2 + "dly(" + this.mStartDelay + ") ";
        }
        if (this.mInterpolator != null) {
            str2 = str2 + "interp(" + this.mInterpolator + ") ";
        }
        if (this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) {
            return str2;
        }
        java.lang.String str3 = str2 + "tgts(";
        if (this.mTargetIds.size() > 0) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.mTargetIds.get(i);
            }
        }
        if (this.mTargets.size() > 0) {
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.mTargets.get(i2);
            }
        }
        return str3 + ")";
    }

    private static class AnimationInfo {
        java.lang.String mName;
        androidx.transition.Transition mTransition;
        androidx.transition.TransitionValues mValues;
        android.view.View mView;
        androidx.transition.WindowIdImpl mWindowId;

        AnimationInfo(android.view.View view, java.lang.String str, androidx.transition.Transition transition, androidx.transition.WindowIdImpl windowIdImpl, androidx.transition.TransitionValues transitionValues) {
            this.mView = view;
            this.mName = str;
            this.mValues = transitionValues;
            this.mWindowId = windowIdImpl;
            this.mTransition = transition;
        }
    }

    private static class ArrayListManager {
        private ArrayListManager() {
        }

        static <T> java.util.ArrayList<T> add(java.util.ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        static <T> java.util.ArrayList<T> remove(java.util.ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }
}
