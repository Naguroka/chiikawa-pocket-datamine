package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class ViewCompat {
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @java.lang.Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @java.lang.Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    private static final java.lang.String TAG = "ViewCompat";
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    private static java.lang.reflect.Field sAccessibilityDelegateField;
    private static java.lang.reflect.Method sChildrenDrawingOrderMethod;
    private static java.lang.reflect.Method sDispatchFinishTemporaryDetach;
    private static java.lang.reflect.Method sDispatchStartTemporaryDetach;
    private static java.lang.reflect.Field sMinHeightField;
    private static boolean sMinHeightFieldFetched;
    private static java.lang.reflect.Field sMinWidthField;
    private static boolean sMinWidthFieldFetched;
    private static boolean sTempDetachBound;
    private static java.lang.ThreadLocal<android.graphics.Rect> sThreadLocalRect;
    private static java.util.WeakHashMap<android.view.View, java.lang.String> sTransitionNameMap;
    private static final java.util.concurrent.atomic.AtomicInteger sNextGeneratedId = new java.util.concurrent.atomic.AtomicInteger(1);
    private static java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> sViewPropertyAnimatorMap = null;
    private static boolean sAccessibilityDelegateCheckFailed = false;
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = {androidx.core.R.id.accessibility_custom_action_0, androidx.core.R.id.accessibility_custom_action_1, androidx.core.R.id.accessibility_custom_action_2, androidx.core.R.id.accessibility_custom_action_3, androidx.core.R.id.accessibility_custom_action_4, androidx.core.R.id.accessibility_custom_action_5, androidx.core.R.id.accessibility_custom_action_6, androidx.core.R.id.accessibility_custom_action_7, androidx.core.R.id.accessibility_custom_action_8, androidx.core.R.id.accessibility_custom_action_9, androidx.core.R.id.accessibility_custom_action_10, androidx.core.R.id.accessibility_custom_action_11, androidx.core.R.id.accessibility_custom_action_12, androidx.core.R.id.accessibility_custom_action_13, androidx.core.R.id.accessibility_custom_action_14, androidx.core.R.id.accessibility_custom_action_15, androidx.core.R.id.accessibility_custom_action_16, androidx.core.R.id.accessibility_custom_action_17, androidx.core.R.id.accessibility_custom_action_18, androidx.core.R.id.accessibility_custom_action_19, androidx.core.R.id.accessibility_custom_action_20, androidx.core.R.id.accessibility_custom_action_21, androidx.core.R.id.accessibility_custom_action_22, androidx.core.R.id.accessibility_custom_action_23, androidx.core.R.id.accessibility_custom_action_24, androidx.core.R.id.accessibility_custom_action_25, androidx.core.R.id.accessibility_custom_action_26, androidx.core.R.id.accessibility_custom_action_27, androidx.core.R.id.accessibility_custom_action_28, androidx.core.R.id.accessibility_custom_action_29, androidx.core.R.id.accessibility_custom_action_30, androidx.core.R.id.accessibility_custom_action_31};
    private static final androidx.core.view.OnReceiveContentViewBehavior NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = new androidx.core.view.OnReceiveContentViewBehavior() { // from class: androidx.core.view.ViewCompat$$ExternalSyntheticLambda0
        @Override // androidx.core.view.OnReceiveContentViewBehavior
        public final androidx.core.view.ContentInfoCompat onReceiveContent(androidx.core.view.ContentInfoCompat contentInfoCompat) {
            return androidx.core.view.ViewCompat.lambda$static$0(contentInfoCompat);
        }
    };
    private static final androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager = new androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(android.view.View view, android.view.KeyEvent keyEvent);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    static /* synthetic */ androidx.core.view.ContentInfoCompat lambda$static$0(androidx.core.view.ContentInfoCompat contentInfoCompat) {
        return contentInfoCompat;
    }

    private static android.graphics.Rect getEmptyTempRect() {
        if (sThreadLocalRect == null) {
            sThreadLocalRect = new java.lang.ThreadLocal<>();
        }
        android.graphics.Rect rect = sThreadLocalRect.get();
        if (rect == null) {
            rect = new android.graphics.Rect();
            sThreadLocalRect.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void saveAttributeDataForStyleable(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.view.ViewCompat.Api29Impl.saveAttributeDataForStyleable(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    @java.lang.Deprecated
    public static boolean canScrollHorizontally(android.view.View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @java.lang.Deprecated
    public static boolean canScrollVertically(android.view.View view, int i) {
        return view.canScrollVertically(i);
    }

    @java.lang.Deprecated
    public static int getOverScrollMode(android.view.View view) {
        return view.getOverScrollMode();
    }

    @java.lang.Deprecated
    public static void setOverScrollMode(android.view.View view, int i) {
        view.setOverScrollMode(i);
    }

    @java.lang.Deprecated
    public static void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @java.lang.Deprecated
    public static void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public static void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.unwrap());
    }

    public static void setAccessibilityDelegate(android.view.View view, androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (getAccessibilityDelegateInternal(view) instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new androidx.core.view.AccessibilityDelegateCompat();
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.getBridge());
    }

    public static void setAutofillHints(android.view.View view, java.lang.String... strArr) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.ViewCompat.Api26Impl.setAutofillHints(view, strArr);
        }
    }

    public static int getImportantForAutofill(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.ViewCompat.Api26Impl.getImportantForAutofill(view);
        }
        return 0;
    }

    public static void setImportantForAutofill(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.ViewCompat.Api26Impl.setImportantForAutofill(view, i);
        }
    }

    public static boolean isImportantForAutofill(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.ViewCompat.Api26Impl.isImportantForAutofill(view);
        }
        return true;
    }

    public static boolean hasAccessibilityDelegate(android.view.View view) {
        return getAccessibilityDelegateInternal(view) != null;
    }

    public static androidx.core.view.AccessibilityDelegateCompat getAccessibilityDelegate(android.view.View view) {
        android.view.View.AccessibilityDelegate accessibilityDelegateInternal = getAccessibilityDelegateInternal(view);
        if (accessibilityDelegateInternal == null) {
            return null;
        }
        if (accessibilityDelegateInternal instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter) {
            return ((androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter) accessibilityDelegateInternal).mCompat;
        }
        return new androidx.core.view.AccessibilityDelegateCompat(accessibilityDelegateInternal);
    }

    static void ensureAccessibilityDelegateCompat(android.view.View view) {
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new androidx.core.view.AccessibilityDelegateCompat();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
    }

    private static android.view.View.AccessibilityDelegate getAccessibilityDelegateInternal(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.view.ViewCompat.Api29Impl.getAccessibilityDelegate(view);
        }
        return getAccessibilityDelegateThroughReflection(view);
    }

    private static android.view.View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(android.view.View view) {
        if (sAccessibilityDelegateCheckFailed) {
            return null;
        }
        if (sAccessibilityDelegateField == null) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAccessibilityDelegate");
                sAccessibilityDelegateField = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.Throwable unused) {
                sAccessibilityDelegateCheckFailed = true;
                return null;
            }
        }
        try {
            java.lang.Object obj = sAccessibilityDelegateField.get(view);
            if (obj instanceof android.view.View.AccessibilityDelegate) {
                return (android.view.View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (java.lang.Throwable unused2) {
            sAccessibilityDelegateCheckFailed = true;
            return null;
        }
    }

    public static boolean hasTransientState(android.view.View view) {
        return androidx.core.view.ViewCompat.Api16Impl.hasTransientState(view);
    }

    public static void setHasTransientState(android.view.View view, boolean z) {
        androidx.core.view.ViewCompat.Api16Impl.setHasTransientState(view, z);
    }

    public static void postInvalidateOnAnimation(android.view.View view) {
        androidx.core.view.ViewCompat.Api16Impl.postInvalidateOnAnimation(view);
    }

    public static void postInvalidateOnAnimation(android.view.View view, int i, int i2, int i3, int i4) {
        androidx.core.view.ViewCompat.Api16Impl.postInvalidateOnAnimation(view, i, i2, i3, i4);
    }

    public static void postOnAnimation(android.view.View view, java.lang.Runnable runnable) {
        androidx.core.view.ViewCompat.Api16Impl.postOnAnimation(view, runnable);
    }

    public static void postOnAnimationDelayed(android.view.View view, java.lang.Runnable runnable, long j) {
        androidx.core.view.ViewCompat.Api16Impl.postOnAnimationDelayed(view, runnable, j);
    }

    public static int getImportantForAccessibility(android.view.View view) {
        return androidx.core.view.ViewCompat.Api16Impl.getImportantForAccessibility(view);
    }

    public static void setImportantForAccessibility(android.view.View view, int i) {
        androidx.core.view.ViewCompat.Api16Impl.setImportantForAccessibility(view, i);
    }

    public static boolean isImportantForAccessibility(android.view.View view) {
        return androidx.core.view.ViewCompat.Api21Impl.isImportantForAccessibility(view);
    }

    public static boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        return androidx.core.view.ViewCompat.Api16Impl.performAccessibilityAction(view, i, bundle);
    }

    public static int addAccessibilityAction(android.view.View view, java.lang.CharSequence charSequence, androidx.core.view.accessibility.AccessibilityViewCommand accessibilityViewCommand) {
        int availableActionIdFromResources = getAvailableActionIdFromResources(view, charSequence);
        if (availableActionIdFromResources != -1) {
            addAccessibilityAction(view, new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(availableActionIdFromResources, charSequence, accessibilityViewCommand));
        }
        return availableActionIdFromResources;
    }

    private static int getAvailableActionIdFromResources(android.view.View view, java.lang.CharSequence charSequence) {
        java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        for (int i = 0; i < actionList.size(); i++) {
            if (android.text.TextUtils.equals(charSequence, actionList.get(i).getLabel())) {
                return actionList.get(i).getId();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = ACCESSIBILITY_ACTIONS_RESOURCE_IDS;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z = true;
            for (int i5 = 0; i5 < actionList.size(); i5++) {
                z &= actionList.get(i5).getId() != i4;
            }
            if (z) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    public static void replaceAccessibilityAction(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, java.lang.CharSequence charSequence, androidx.core.view.accessibility.AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            removeAccessibilityAction(view, accessibilityActionCompat.getId());
        } else {
            addAccessibilityAction(view, accessibilityActionCompat.createReplacementAction(charSequence, accessibilityViewCommand));
        }
    }

    private static void addAccessibilityAction(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        ensureAccessibilityDelegateCompat(view);
        removeActionWithId(accessibilityActionCompat.getId(), view);
        getActionList(view).add(accessibilityActionCompat);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    public static void removeAccessibilityAction(android.view.View view, int i) {
        removeActionWithId(i, view);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    private static void removeActionWithId(int i, android.view.View view) {
        java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        for (int i2 = 0; i2 < actionList.size(); i2++) {
            if (actionList.get(i2).getId() == i) {
                actionList.remove(i2);
                return;
            }
        }
    }

    private static java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(android.view.View view) {
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(androidx.core.R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        view.setTag(androidx.core.R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void setStateDescription(android.view.View view, java.lang.CharSequence charSequence) {
        stateDescriptionProperty().set(view, charSequence);
    }

    public static java.lang.CharSequence getStateDescription(android.view.View view) {
        return stateDescriptionProperty().get(view);
    }

    public static void enableAccessibleClickableSpanSupport(android.view.View view) {
        ensureAccessibilityDelegateCompat(view);
    }

    public static androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider = androidx.core.view.ViewCompat.Api16Impl.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new androidx.core.view.accessibility.AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    @java.lang.Deprecated
    public static float getAlpha(android.view.View view) {
        return view.getAlpha();
    }

    @java.lang.Deprecated
    public static void setLayerType(android.view.View view, int i, android.graphics.Paint paint) {
        view.setLayerType(i, paint);
    }

    @java.lang.Deprecated
    public static int getLayerType(android.view.View view) {
        return view.getLayerType();
    }

    public static int getLabelFor(android.view.View view) {
        return androidx.core.view.ViewCompat.Api17Impl.getLabelFor(view);
    }

    public static void setLabelFor(android.view.View view, int i) {
        androidx.core.view.ViewCompat.Api17Impl.setLabelFor(view, i);
    }

    public static void setLayerPaint(android.view.View view, android.graphics.Paint paint) {
        androidx.core.view.ViewCompat.Api17Impl.setLayerPaint(view, paint);
    }

    public static int getLayoutDirection(android.view.View view) {
        return androidx.core.view.ViewCompat.Api17Impl.getLayoutDirection(view);
    }

    public static void setLayoutDirection(android.view.View view, int i) {
        androidx.core.view.ViewCompat.Api17Impl.setLayoutDirection(view, i);
    }

    public static android.view.ViewParent getParentForAccessibility(android.view.View view) {
        return androidx.core.view.ViewCompat.Api16Impl.getParentForAccessibility(view);
    }

    public static <T extends android.view.View> T requireViewById(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return (T) androidx.core.view.ViewCompat.Api28Impl.requireViewById(view, i);
        }
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalArgumentException("ID does not reference a View inside this View");
    }

    @java.lang.Deprecated
    public static boolean isOpaque(android.view.View view) {
        return view.isOpaque();
    }

    @java.lang.Deprecated
    public static int resolveSizeAndState(int i, int i2, int i3) {
        return android.view.View.resolveSizeAndState(i, i2, i3);
    }

    @java.lang.Deprecated
    public static int getMeasuredWidthAndState(android.view.View view) {
        return view.getMeasuredWidthAndState();
    }

    @java.lang.Deprecated
    public static int getMeasuredHeightAndState(android.view.View view) {
        return view.getMeasuredHeightAndState();
    }

    @java.lang.Deprecated
    public static int getMeasuredState(android.view.View view) {
        return view.getMeasuredState();
    }

    @java.lang.Deprecated
    public static int combineMeasuredStates(int i, int i2) {
        return android.view.View.combineMeasuredStates(i, i2);
    }

    public static int getAccessibilityLiveRegion(android.view.View view) {
        return androidx.core.view.ViewCompat.Api19Impl.getAccessibilityLiveRegion(view);
    }

    public static void setAccessibilityLiveRegion(android.view.View view, int i) {
        androidx.core.view.ViewCompat.Api19Impl.setAccessibilityLiveRegion(view, i);
    }

    public static int getPaddingStart(android.view.View view) {
        return androidx.core.view.ViewCompat.Api17Impl.getPaddingStart(view);
    }

    public static int getPaddingEnd(android.view.View view) {
        return androidx.core.view.ViewCompat.Api17Impl.getPaddingEnd(view);
    }

    public static void setPaddingRelative(android.view.View view, int i, int i2, int i3, int i4) {
        androidx.core.view.ViewCompat.Api17Impl.setPaddingRelative(view, i, i2, i3, i4);
    }

    private static void bindTempDetach() {
        try {
            sDispatchStartTemporaryDetach = android.view.View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new java.lang.Class[0]);
            sDispatchFinishTemporaryDetach = android.view.View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new java.lang.Class[0]);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.e(TAG, "Couldn't find method", e);
        }
        sTempDetachBound = true;
    }

    public static void dispatchStartTemporaryDetach(android.view.View view) {
        androidx.core.view.ViewCompat.Api24Impl.dispatchStartTemporaryDetach(view);
    }

    public static void dispatchFinishTemporaryDetach(android.view.View view) {
        androidx.core.view.ViewCompat.Api24Impl.dispatchFinishTemporaryDetach(view);
    }

    @java.lang.Deprecated
    public static float getTranslationX(android.view.View view) {
        return view.getTranslationX();
    }

    @java.lang.Deprecated
    public static float getTranslationY(android.view.View view) {
        return view.getTranslationY();
    }

    @java.lang.Deprecated
    public static android.graphics.Matrix getMatrix(android.view.View view) {
        return view.getMatrix();
    }

    public static int getMinimumWidth(android.view.View view) {
        return androidx.core.view.ViewCompat.Api16Impl.getMinimumWidth(view);
    }

    public static int getMinimumHeight(android.view.View view) {
        return androidx.core.view.ViewCompat.Api16Impl.getMinimumHeight(view);
    }

    public static androidx.core.view.ViewPropertyAnimatorCompat animate(android.view.View view) {
        if (sViewPropertyAnimatorMap == null) {
            sViewPropertyAnimatorMap = new java.util.WeakHashMap<>();
        }
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = sViewPropertyAnimatorMap.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new androidx.core.view.ViewPropertyAnimatorCompat(view);
        sViewPropertyAnimatorMap.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    @java.lang.Deprecated
    public static void setTranslationX(android.view.View view, float f) {
        view.setTranslationX(f);
    }

    @java.lang.Deprecated
    public static void setTranslationY(android.view.View view, float f) {
        view.setTranslationY(f);
    }

    @java.lang.Deprecated
    public static void setAlpha(android.view.View view, float f) {
        view.setAlpha(f);
    }

    @java.lang.Deprecated
    public static void setX(android.view.View view, float f) {
        view.setX(f);
    }

    @java.lang.Deprecated
    public static void setY(android.view.View view, float f) {
        view.setY(f);
    }

    @java.lang.Deprecated
    public static void setRotation(android.view.View view, float f) {
        view.setRotation(f);
    }

    @java.lang.Deprecated
    public static void setRotationX(android.view.View view, float f) {
        view.setRotationX(f);
    }

    @java.lang.Deprecated
    public static void setRotationY(android.view.View view, float f) {
        view.setRotationY(f);
    }

    @java.lang.Deprecated
    public static void setScaleX(android.view.View view, float f) {
        view.setScaleX(f);
    }

    @java.lang.Deprecated
    public static void setScaleY(android.view.View view, float f) {
        view.setScaleY(f);
    }

    @java.lang.Deprecated
    public static float getPivotX(android.view.View view) {
        return view.getPivotX();
    }

    @java.lang.Deprecated
    public static void setPivotX(android.view.View view, float f) {
        view.setPivotX(f);
    }

    @java.lang.Deprecated
    public static float getPivotY(android.view.View view) {
        return view.getPivotY();
    }

    @java.lang.Deprecated
    public static void setPivotY(android.view.View view, float f) {
        view.setPivotY(f);
    }

    @java.lang.Deprecated
    public static float getRotation(android.view.View view) {
        return view.getRotation();
    }

    @java.lang.Deprecated
    public static float getRotationX(android.view.View view) {
        return view.getRotationX();
    }

    @java.lang.Deprecated
    public static float getRotationY(android.view.View view) {
        return view.getRotationY();
    }

    @java.lang.Deprecated
    public static float getScaleX(android.view.View view) {
        return view.getScaleX();
    }

    @java.lang.Deprecated
    public static float getScaleY(android.view.View view) {
        return view.getScaleY();
    }

    @java.lang.Deprecated
    public static float getX(android.view.View view) {
        return view.getX();
    }

    @java.lang.Deprecated
    public static float getY(android.view.View view) {
        return view.getY();
    }

    public static void setElevation(android.view.View view, float f) {
        androidx.core.view.ViewCompat.Api21Impl.setElevation(view, f);
    }

    public static float getElevation(android.view.View view) {
        return androidx.core.view.ViewCompat.Api21Impl.getElevation(view);
    }

    public static void setTranslationZ(android.view.View view, float f) {
        androidx.core.view.ViewCompat.Api21Impl.setTranslationZ(view, f);
    }

    public static float getTranslationZ(android.view.View view) {
        return androidx.core.view.ViewCompat.Api21Impl.getTranslationZ(view);
    }

    public static void setTransitionName(android.view.View view, java.lang.String str) {
        androidx.core.view.ViewCompat.Api21Impl.setTransitionName(view, str);
    }

    public static java.lang.String getTransitionName(android.view.View view) {
        return androidx.core.view.ViewCompat.Api21Impl.getTransitionName(view);
    }

    @java.lang.Deprecated
    public static int getWindowSystemUiVisibility(android.view.View view) {
        return androidx.core.view.ViewCompat.Api16Impl.getWindowSystemUiVisibility(view);
    }

    public static void requestApplyInsets(android.view.View view) {
        androidx.core.view.ViewCompat.Api20Impl.requestApplyInsets(view);
    }

    @java.lang.Deprecated
    public static void setChildrenDrawingOrderEnabled(android.view.ViewGroup viewGroup, boolean z) {
        if (sChildrenDrawingOrderMethod == null) {
            try {
                sChildrenDrawingOrderMethod = android.view.ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException e) {
                android.util.Log.e(TAG, "Unable to find childrenDrawingOrderEnabled", e);
            }
            sChildrenDrawingOrderMethod.setAccessible(true);
        }
        try {
            sChildrenDrawingOrderMethod.invoke(viewGroup, java.lang.Boolean.valueOf(z));
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e2);
        } catch (java.lang.IllegalArgumentException e3) {
            android.util.Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            android.util.Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e4);
        }
    }

    public static boolean getFitsSystemWindows(android.view.View view) {
        return androidx.core.view.ViewCompat.Api16Impl.getFitsSystemWindows(view);
    }

    @java.lang.Deprecated
    public static void setFitsSystemWindows(android.view.View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    @java.lang.Deprecated
    public static void jumpDrawablesToCurrentState(android.view.View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void setOnApplyWindowInsetsListener(android.view.View view, androidx.core.view.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        androidx.core.view.ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, onApplyWindowInsetsListener);
    }

    public static androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            android.view.WindowInsets windowInsetsOnApplyWindowInsets = androidx.core.view.ViewCompat.Api20Impl.onApplyWindowInsets(view, windowInsets);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsets)) {
                return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    public static androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            android.view.WindowInsets windowInsetsDispatchApplyWindowInsets = androidx.core.view.ViewCompat.Api20Impl.dispatchApplyWindowInsets(view, windowInsets);
            if (!windowInsetsDispatchApplyWindowInsets.equals(windowInsets)) {
                return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsetsDispatchApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void setSystemGestureExclusionRects(android.view.View view, java.util.List<android.graphics.Rect> list) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.view.ViewCompat.Api29Impl.setSystemGestureExclusionRects(view, list);
        }
    }

    public static java.util.List<android.graphics.Rect> getSystemGestureExclusionRects(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.view.ViewCompat.Api29Impl.getSystemGestureExclusionRects(view);
        }
        return java.util.Collections.emptyList();
    }

    public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View view) {
        return androidx.core.view.ViewCompat.Api23Impl.getRootWindowInsets(view);
    }

    public static androidx.core.view.WindowInsetsCompat computeSystemWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.graphics.Rect rect) {
        return androidx.core.view.ViewCompat.Api21Impl.computeSystemWindowInsets(view, windowInsetsCompat, rect);
    }

    @java.lang.Deprecated
    public static androidx.core.view.WindowInsetsControllerCompat getWindowInsetsController(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.ViewCompat.Api30Impl.getWindowInsetsController(view);
        }
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                android.view.Window window = ((android.app.Activity) context).getWindow();
                if (window != null) {
                    return androidx.core.view.WindowCompat.getInsetsController(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void setWindowInsetsAnimationCallback(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
        androidx.core.view.WindowInsetsAnimationCompat.setCallback(view, callback);
    }

    public static void setOnReceiveContentListener(android.view.View view, java.lang.String[] strArr, androidx.core.view.OnReceiveContentListener onReceiveContentListener) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.core.view.ViewCompat.Api31Impl.setOnReceiveContentListener(view, strArr, onReceiveContentListener);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        if (onReceiveContentListener != null) {
            androidx.core.util.Preconditions.checkArgument(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                if (str.startsWith(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES)) {
                    z = true;
                    break;
                }
            }
            androidx.core.util.Preconditions.checkArgument(!z, "A MIME type set here must not start with *: " + java.util.Arrays.toString(strArr));
        }
        view.setTag(androidx.core.R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(androidx.core.R.id.tag_on_receive_content_listener, onReceiveContentListener);
    }

    public static java.lang.String[] getOnReceiveContentMimeTypes(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.view.ViewCompat.Api31Impl.getReceiveContentMimeTypes(view);
        }
        return (java.lang.String[]) view.getTag(androidx.core.R.id.tag_on_receive_content_mime_types);
    }

    public static androidx.core.view.ContentInfoCompat performReceiveContent(android.view.View view, androidx.core.view.ContentInfoCompat contentInfoCompat) {
        if (android.util.Log.isLoggable(TAG, 3)) {
            android.util.Log.d(TAG, "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + com.ironsource.y8.i.d + view.getId() + com.ironsource.y8.i.e);
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.view.ViewCompat.Api31Impl.performReceiveContent(view, contentInfoCompat);
        }
        androidx.core.view.OnReceiveContentListener onReceiveContentListener = (androidx.core.view.OnReceiveContentListener) view.getTag(androidx.core.R.id.tag_on_receive_content_listener);
        if (onReceiveContentListener != null) {
            androidx.core.view.ContentInfoCompat contentInfoCompatOnReceiveContent = onReceiveContentListener.onReceiveContent(view, contentInfoCompat);
            if (contentInfoCompatOnReceiveContent == null) {
                return null;
            }
            return getFallback(view).onReceiveContent(contentInfoCompatOnReceiveContent);
        }
        return getFallback(view).onReceiveContent(contentInfoCompat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static androidx.core.view.OnReceiveContentViewBehavior getFallback(android.view.View view) {
        if (view instanceof androidx.core.view.OnReceiveContentViewBehavior) {
            return (androidx.core.view.OnReceiveContentViewBehavior) view;
        }
        return NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR;
    }

    private static final class Api31Impl {
        private Api31Impl() {
        }

        public static void setOnReceiveContentListener(android.view.View view, java.lang.String[] strArr, androidx.core.view.OnReceiveContentListener onReceiveContentListener) {
            if (onReceiveContentListener == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new androidx.core.view.ViewCompat.OnReceiveContentListenerAdapter(onReceiveContentListener));
            }
        }

        public static java.lang.String[] getReceiveContentMimeTypes(android.view.View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.ContentInfoCompat performReceiveContent(android.view.View view, androidx.core.view.ContentInfoCompat contentInfoCompat) {
            android.view.ContentInfo contentInfo = contentInfoCompat.toContentInfo();
            android.view.ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfo);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfo ? contentInfoCompat : androidx.core.view.ContentInfoCompat.toContentInfoCompat(contentInfoPerformReceiveContent);
        }
    }

    private static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {
        private final androidx.core.view.OnReceiveContentListener mJetpackListener;

        OnReceiveContentListenerAdapter(androidx.core.view.OnReceiveContentListener onReceiveContentListener) {
            this.mJetpackListener = onReceiveContentListener;
        }

        @Override // android.view.OnReceiveContentListener
        public android.view.ContentInfo onReceiveContent(android.view.View view, android.view.ContentInfo contentInfo) {
            androidx.core.view.ContentInfoCompat contentInfoCompat = androidx.core.view.ContentInfoCompat.toContentInfoCompat(contentInfo);
            androidx.core.view.ContentInfoCompat contentInfoCompatOnReceiveContent = this.mJetpackListener.onReceiveContent(view, contentInfoCompat);
            if (contentInfoCompatOnReceiveContent == null) {
                return null;
            }
            return contentInfoCompatOnReceiveContent == contentInfoCompat ? contentInfo : contentInfoCompatOnReceiveContent.toContentInfo();
        }
    }

    @java.lang.Deprecated
    public static void setSaveFromParentEnabled(android.view.View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    @java.lang.Deprecated
    public static void setActivated(android.view.View view, boolean z) {
        view.setActivated(z);
    }

    public static boolean hasOverlappingRendering(android.view.View view) {
        return androidx.core.view.ViewCompat.Api16Impl.hasOverlappingRendering(view);
    }

    public static boolean isPaddingRelative(android.view.View view) {
        return androidx.core.view.ViewCompat.Api17Impl.isPaddingRelative(view);
    }

    public static void setBackground(android.view.View view, android.graphics.drawable.Drawable drawable) {
        androidx.core.view.ViewCompat.Api16Impl.setBackground(view, drawable);
    }

    public static android.content.res.ColorStateList getBackgroundTintList(android.view.View view) {
        return androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintList(view);
    }

    public static void setBackgroundTintList(android.view.View view, android.content.res.ColorStateList colorStateList) {
        androidx.core.view.ViewCompat.Api21Impl.setBackgroundTintList(view, colorStateList);
    }

    public static android.graphics.PorterDuff.Mode getBackgroundTintMode(android.view.View view) {
        return androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintMode(view);
    }

    public static void setBackgroundTintMode(android.view.View view, android.graphics.PorterDuff.Mode mode) {
        androidx.core.view.ViewCompat.Api21Impl.setBackgroundTintMode(view, mode);
    }

    public static void setNestedScrollingEnabled(android.view.View view, boolean z) {
        androidx.core.view.ViewCompat.Api21Impl.setNestedScrollingEnabled(view, z);
    }

    public static boolean isNestedScrollingEnabled(android.view.View view) {
        return androidx.core.view.ViewCompat.Api21Impl.isNestedScrollingEnabled(view);
    }

    public static boolean startNestedScroll(android.view.View view, int i) {
        return androidx.core.view.ViewCompat.Api21Impl.startNestedScroll(view, i);
    }

    public static void stopNestedScroll(android.view.View view) {
        androidx.core.view.ViewCompat.Api21Impl.stopNestedScroll(view);
    }

    public static boolean hasNestedScrollingParent(android.view.View view) {
        return androidx.core.view.ViewCompat.Api21Impl.hasNestedScrollingParent(view);
    }

    public static boolean dispatchNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int[] iArr) {
        return androidx.core.view.ViewCompat.Api21Impl.dispatchNestedScroll(view, i, i2, i3, i4, iArr);
    }

    public static boolean dispatchNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int[] iArr2) {
        return androidx.core.view.ViewCompat.Api21Impl.dispatchNestedPreScroll(view, i, i2, iArr, iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(android.view.View view, int i, int i2) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            return ((androidx.core.view.NestedScrollingChild2) view).startNestedScroll(i, i2);
        }
        if (i2 == 0) {
            return startNestedScroll(view, i);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(android.view.View view, int i) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            ((androidx.core.view.NestedScrollingChild2) view).stopNestedScroll(i);
        } else if (i == 0) {
            stopNestedScroll(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(android.view.View view, int i) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            ((androidx.core.view.NestedScrollingChild2) view).hasNestedScrollingParent(i);
            return false;
        }
        if (i == 0) {
            return hasNestedScrollingParent(view);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (view instanceof androidx.core.view.NestedScrollingChild3) {
            ((androidx.core.view.NestedScrollingChild3) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
        } else {
            dispatchNestedScroll(view, i, i2, i3, i4, iArr, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int[] iArr, int i5) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            return ((androidx.core.view.NestedScrollingChild2) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return dispatchNestedScroll(view, i, i2, i3, i4, iArr);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            return ((androidx.core.view.NestedScrollingChild2) view).dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return dispatchNestedPreScroll(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    public static boolean dispatchNestedFling(android.view.View view, float f, float f2, boolean z) {
        return androidx.core.view.ViewCompat.Api21Impl.dispatchNestedFling(view, f, f2, z);
    }

    public static boolean dispatchNestedPreFling(android.view.View view, float f, float f2) {
        return androidx.core.view.ViewCompat.Api21Impl.dispatchNestedPreFling(view, f, f2);
    }

    public static boolean isInLayout(android.view.View view) {
        return androidx.core.view.ViewCompat.Api18Impl.isInLayout(view);
    }

    public static boolean isLaidOut(android.view.View view) {
        return androidx.core.view.ViewCompat.Api19Impl.isLaidOut(view);
    }

    public static boolean isLayoutDirectionResolved(android.view.View view) {
        return androidx.core.view.ViewCompat.Api19Impl.isLayoutDirectionResolved(view);
    }

    public static float getZ(android.view.View view) {
        return androidx.core.view.ViewCompat.Api21Impl.getZ(view);
    }

    public static void setZ(android.view.View view, float f) {
        androidx.core.view.ViewCompat.Api21Impl.setZ(view, f);
    }

    public static void offsetTopAndBottom(android.view.View view, int i) {
        view.offsetTopAndBottom(i);
    }

    private static void compatOffsetTopAndBottom(android.view.View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            java.lang.Object parent = view.getParent();
            if (parent instanceof android.view.View) {
                tickleInvalidationFlag((android.view.View) parent);
            }
        }
    }

    public static void offsetLeftAndRight(android.view.View view, int i) {
        view.offsetLeftAndRight(i);
    }

    private static void compatOffsetLeftAndRight(android.view.View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            java.lang.Object parent = view.getParent();
            if (parent instanceof android.view.View) {
                tickleInvalidationFlag((android.view.View) parent);
            }
        }
    }

    private static void tickleInvalidationFlag(android.view.View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void setClipBounds(android.view.View view, android.graphics.Rect rect) {
        androidx.core.view.ViewCompat.Api18Impl.setClipBounds(view, rect);
    }

    public static android.graphics.Rect getClipBounds(android.view.View view) {
        return androidx.core.view.ViewCompat.Api18Impl.getClipBounds(view);
    }

    public static boolean isAttachedToWindow(android.view.View view) {
        return androidx.core.view.ViewCompat.Api19Impl.isAttachedToWindow(view);
    }

    public static boolean hasOnClickListeners(android.view.View view) {
        return androidx.core.view.ViewCompat.Api15Impl.hasOnClickListeners(view);
    }

    public static void setScrollIndicators(android.view.View view, int i) {
        androidx.core.view.ViewCompat.Api23Impl.setScrollIndicators(view, i);
    }

    public static void setScrollIndicators(android.view.View view, int i, int i2) {
        androidx.core.view.ViewCompat.Api23Impl.setScrollIndicators(view, i, i2);
    }

    public static int getScrollIndicators(android.view.View view) {
        return androidx.core.view.ViewCompat.Api23Impl.getScrollIndicators(view);
    }

    public static void setPointerIcon(android.view.View view, androidx.core.view.PointerIconCompat pointerIconCompat) {
        androidx.core.view.ViewCompat.Api24Impl.setPointerIcon(view, (android.view.PointerIcon) (pointerIconCompat != null ? pointerIconCompat.getPointerIcon() : null));
    }

    public static android.view.Display getDisplay(android.view.View view) {
        return androidx.core.view.ViewCompat.Api17Impl.getDisplay(view);
    }

    public static void setTooltipText(android.view.View view, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.ViewCompat.Api26Impl.setTooltipText(view, charSequence);
        }
    }

    public static boolean startDragAndDrop(android.view.View view, android.content.ClipData clipData, android.view.View.DragShadowBuilder dragShadowBuilder, java.lang.Object obj, int i) {
        return androidx.core.view.ViewCompat.Api24Impl.startDragAndDrop(view, clipData, dragShadowBuilder, obj, i);
    }

    public static void cancelDragAndDrop(android.view.View view) {
        androidx.core.view.ViewCompat.Api24Impl.cancelDragAndDrop(view);
    }

    public static void updateDragShadow(android.view.View view, android.view.View.DragShadowBuilder dragShadowBuilder) {
        androidx.core.view.ViewCompat.Api24Impl.updateDragShadow(view, dragShadowBuilder);
    }

    public static int getNextClusterForwardId(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.ViewCompat.Api26Impl.getNextClusterForwardId(view);
        }
        return -1;
    }

    public static void setNextClusterForwardId(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.ViewCompat.Api26Impl.setNextClusterForwardId(view, i);
        }
    }

    public static boolean isKeyboardNavigationCluster(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.ViewCompat.Api26Impl.isKeyboardNavigationCluster(view);
        }
        return false;
    }

    public static void setKeyboardNavigationCluster(android.view.View view, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.ViewCompat.Api26Impl.setKeyboardNavigationCluster(view, z);
        }
    }

    public static boolean isFocusedByDefault(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.ViewCompat.Api26Impl.isFocusedByDefault(view);
        }
        return false;
    }

    public static void setFocusedByDefault(android.view.View view, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.ViewCompat.Api26Impl.setFocusedByDefault(view, z);
        }
    }

    public static android.view.View keyboardNavigationClusterSearch(android.view.View view, android.view.View view2, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.ViewCompat.Api26Impl.keyboardNavigationClusterSearch(view, view2, i);
        }
        return null;
    }

    public static void addKeyboardNavigationClusters(android.view.View view, java.util.Collection<android.view.View> collection, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.ViewCompat.Api26Impl.addKeyboardNavigationClusters(view, collection, i);
        }
    }

    public static boolean restoreDefaultFocus(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.ViewCompat.Api26Impl.restoreDefaultFocus(view);
        }
        return view.requestFocus();
    }

    public static boolean hasExplicitFocusable(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.ViewCompat.Api26Impl.hasExplicitFocusable(view);
        }
        return view.hasFocusable();
    }

    public static int generateViewId() {
        return androidx.core.view.ViewCompat.Api17Impl.generateViewId();
    }

    public static void addOnUnhandledKeyEventListener(android.view.View view, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.view.ViewCompat.Api28Impl.addOnUnhandledKeyEventListener(view, onUnhandledKeyEventListenerCompat);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            view.setTag(androidx.core.R.id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(onUnhandledKeyEventListenerCompat);
        if (arrayList.size() == 1) {
            androidx.core.view.ViewCompat.UnhandledKeyEventManager.registerListeningView(view);
        }
    }

    public static void removeOnUnhandledKeyEventListener(android.view.View view, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.view.ViewCompat.Api28Impl.removeOnUnhandledKeyEventListener(view, onUnhandledKeyEventListenerCompat);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(onUnhandledKeyEventListenerCompat);
            if (arrayList.size() == 0) {
                androidx.core.view.ViewCompat.UnhandledKeyEventManager.unregisterListeningView(view);
            }
        }
    }

    @java.lang.Deprecated
    protected ViewCompat() {
    }

    static boolean dispatchUnhandledKeyEventBeforeHierarchy(android.view.View view, android.view.KeyEvent keyEvent) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return androidx.core.view.ViewCompat.UnhandledKeyEventManager.at(view).preDispatch(keyEvent);
    }

    static boolean dispatchUnhandledKeyEventBeforeCallback(android.view.View view, android.view.KeyEvent keyEvent) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return androidx.core.view.ViewCompat.UnhandledKeyEventManager.at(view).dispatch(view, keyEvent);
    }

    public static void setScreenReaderFocusable(android.view.View view, boolean z) {
        screenReaderFocusableProperty().set(view, java.lang.Boolean.valueOf(z));
    }

    public static boolean isScreenReaderFocusable(android.view.View view) {
        java.lang.Boolean bool = screenReaderFocusableProperty().get(view);
        return bool != null && bool.booleanValue();
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> screenReaderFocusableProperty() {
        return new androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean>(androidx.core.R.id.tag_screen_reader_focusable, java.lang.Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public java.lang.Boolean frameworkGet(android.view.View view) {
                return java.lang.Boolean.valueOf(androidx.core.view.ViewCompat.Api28Impl.isScreenReaderFocusable(view));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public void frameworkSet(android.view.View view, java.lang.Boolean bool) {
                androidx.core.view.ViewCompat.Api28Impl.setScreenReaderFocusable(view, bool.booleanValue());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(java.lang.Boolean bool, java.lang.Boolean bool2) {
                return !booleanNullToFalseEquals(bool, bool2);
            }
        };
    }

    public static void setAccessibilityPaneTitle(android.view.View view, java.lang.CharSequence charSequence) {
        paneTitleProperty().set(view, charSequence);
        if (charSequence != null) {
            sAccessibilityPaneVisibilityManager.addAccessibilityPane(view);
        } else {
            sAccessibilityPaneVisibilityManager.removeAccessibilityPane(view);
        }
    }

    public static java.lang.CharSequence getAccessibilityPaneTitle(android.view.View view) {
        return paneTitleProperty().get(view);
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> paneTitleProperty() {
        return new androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence>(androidx.core.R.id.tag_accessibility_pane_title, java.lang.CharSequence.class, 8, 28) { // from class: androidx.core.view.ViewCompat.2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public java.lang.CharSequence frameworkGet(android.view.View view) {
                return androidx.core.view.ViewCompat.Api28Impl.getAccessibilityPaneTitle(view);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public void frameworkSet(android.view.View view, java.lang.CharSequence charSequence) {
                androidx.core.view.ViewCompat.Api28Impl.setAccessibilityPaneTitle(view, charSequence);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
                return !android.text.TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> stateDescriptionProperty() {
        return new androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence>(androidx.core.R.id.tag_state_description, java.lang.CharSequence.class, 64, 30) { // from class: androidx.core.view.ViewCompat.3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public java.lang.CharSequence frameworkGet(android.view.View view) {
                return androidx.core.view.ViewCompat.Api30Impl.getStateDescription(view);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public void frameworkSet(android.view.View view, java.lang.CharSequence charSequence) {
                androidx.core.view.ViewCompat.Api30Impl.setStateDescription(view, charSequence);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
                return !android.text.TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    public static boolean isAccessibilityHeading(android.view.View view) {
        java.lang.Boolean bool = accessibilityHeadingProperty().get(view);
        return bool != null && bool.booleanValue();
    }

    public static void setAccessibilityHeading(android.view.View view, boolean z) {
        accessibilityHeadingProperty().set(view, java.lang.Boolean.valueOf(z));
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> accessibilityHeadingProperty() {
        return new androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean>(androidx.core.R.id.tag_accessibility_heading, java.lang.Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public java.lang.Boolean frameworkGet(android.view.View view) {
                return java.lang.Boolean.valueOf(androidx.core.view.ViewCompat.Api28Impl.isAccessibilityHeading(view));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public void frameworkSet(android.view.View view, java.lang.Boolean bool) {
                androidx.core.view.ViewCompat.Api28Impl.setAccessibilityHeading(view, bool.booleanValue());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(java.lang.Boolean bool, java.lang.Boolean bool2) {
                return !booleanNullToFalseEquals(bool, bool2);
            }
        };
    }

    static abstract class AccessibilityViewProperty<T> {
        private final int mContentChangeType;
        private final int mFrameworkMinimumSdk;
        private final int mTagKey;
        private final java.lang.Class<T> mType;

        private boolean extrasAvailable() {
            return true;
        }

        abstract T frameworkGet(android.view.View view);

        abstract void frameworkSet(android.view.View view, T t);

        AccessibilityViewProperty(int i, java.lang.Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        AccessibilityViewProperty(int i, java.lang.Class<T> cls, int i2, int i3) {
            this.mTagKey = i;
            this.mType = cls;
            this.mContentChangeType = i2;
            this.mFrameworkMinimumSdk = i3;
        }

        void set(android.view.View view, T t) {
            if (frameworkAvailable()) {
                frameworkSet(view, t);
            } else if (extrasAvailable() && shouldUpdate(get(view), t)) {
                androidx.core.view.ViewCompat.ensureAccessibilityDelegateCompat(view);
                view.setTag(this.mTagKey, t);
                androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, this.mContentChangeType);
            }
        }

        T get(android.view.View view) {
            if (frameworkAvailable()) {
                return frameworkGet(view);
            }
            if (!extrasAvailable()) {
                return null;
            }
            T t = (T) view.getTag(this.mTagKey);
            if (this.mType.isInstance(t)) {
                return t;
            }
            return null;
        }

        private boolean frameworkAvailable() {
            return android.os.Build.VERSION.SDK_INT >= this.mFrameworkMinimumSdk;
        }

        boolean shouldUpdate(T t, T t2) {
            return !t2.equals(t);
        }

        boolean booleanNullToFalseEquals(java.lang.Boolean bool, java.lang.Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }
    }

    static void notifyViewAccessibilityStateChangedIfNeeded(android.view.View view, int i) {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = getAccessibilityPaneTitle(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (getAccessibilityLiveRegion(view) != 0 || z) {
                android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                androidx.core.view.ViewCompat.Api19Impl.setContentChangeTypes(accessibilityEventObtain, i);
                if (z) {
                    accessibilityEventObtain.getText().add(getAccessibilityPaneTitle(view));
                    setViewImportanceForAccessibilityIfNeeded(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i == 32) {
                android.view.accessibility.AccessibilityEvent accessibilityEventObtain2 = android.view.accessibility.AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                androidx.core.view.ViewCompat.Api19Impl.setContentChangeTypes(accessibilityEventObtain2, i);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(getAccessibilityPaneTitle(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    androidx.core.view.ViewCompat.Api19Impl.notifySubtreeAccessibilityStateChanged(view.getParent(), view, view, i);
                } catch (java.lang.AbstractMethodError e) {
                    android.util.Log.e(TAG, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    private static void setViewImportanceForAccessibilityIfNeeded(android.view.View view) {
        if (getImportantForAccessibility(view) == 0) {
            setImportantForAccessibility(view, 1);
        }
        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            if (getImportantForAccessibility((android.view.View) parent) == 4) {
                setImportantForAccessibility(view, 2);
                return;
            }
        }
    }

    static class AccessibilityPaneVisibilityManager implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {
        private final java.util.WeakHashMap<android.view.View, java.lang.Boolean> mPanesToVisible = new java.util.WeakHashMap<>();

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
        }

        AccessibilityPaneVisibilityManager() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (android.os.Build.VERSION.SDK_INT < 28) {
                for (java.util.Map.Entry<android.view.View, java.lang.Boolean> entry : this.mPanesToVisible.entrySet()) {
                    checkPaneVisibility(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            registerForLayoutCallback(view);
        }

        void addAccessibilityPane(android.view.View view) {
            this.mPanesToVisible.put(view, java.lang.Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (androidx.core.view.ViewCompat.Api19Impl.isAttachedToWindow(view)) {
                registerForLayoutCallback(view);
            }
        }

        void removeAccessibilityPane(android.view.View view) {
            this.mPanesToVisible.remove(view);
            view.removeOnAttachStateChangeListener(this);
            unregisterForLayoutCallback(view);
        }

        private void checkPaneVisibility(android.view.View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, z2 ? 16 : 32);
                this.mPanesToVisible.put(view, java.lang.Boolean.valueOf(z2));
            }
        }

        private void registerForLayoutCallback(android.view.View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void unregisterForLayoutCallback(android.view.View view) {
            androidx.core.view.ViewCompat.Api16Impl.removeOnGlobalLayoutListener(view.getViewTreeObserver(), this);
        }
    }

    static class UnhandledKeyEventManager {
        private static final java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> sViewsWithListeners = new java.util.ArrayList<>();
        private java.util.WeakHashMap<android.view.View, java.lang.Boolean> mViewsContainingListeners = null;
        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> mCapturedKeys = null;
        private java.lang.ref.WeakReference<android.view.KeyEvent> mLastDispatchedPreViewKeyEvent = null;

        UnhandledKeyEventManager() {
        }

        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> getCapturedKeys() {
            if (this.mCapturedKeys == null) {
                this.mCapturedKeys = new android.util.SparseArray<>();
            }
            return this.mCapturedKeys;
        }

        static androidx.core.view.ViewCompat.UnhandledKeyEventManager at(android.view.View view) {
            androidx.core.view.ViewCompat.UnhandledKeyEventManager unhandledKeyEventManager = (androidx.core.view.ViewCompat.UnhandledKeyEventManager) view.getTag(androidx.core.R.id.tag_unhandled_key_event_manager);
            if (unhandledKeyEventManager != null) {
                return unhandledKeyEventManager;
            }
            androidx.core.view.ViewCompat.UnhandledKeyEventManager unhandledKeyEventManager2 = new androidx.core.view.ViewCompat.UnhandledKeyEventManager();
            view.setTag(androidx.core.R.id.tag_unhandled_key_event_manager, unhandledKeyEventManager2);
            return unhandledKeyEventManager2;
        }

        boolean dispatch(android.view.View view, android.view.KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                recalcViewsWithUnhandled();
            }
            android.view.View viewDispatchInOrder = dispatchInOrder(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewDispatchInOrder != null && !android.view.KeyEvent.isModifierKey(keyCode)) {
                    getCapturedKeys().put(keyCode, new java.lang.ref.WeakReference<>(viewDispatchInOrder));
                }
            }
            return viewDispatchInOrder != null;
        }

        private android.view.View dispatchInOrder(android.view.View view, android.view.KeyEvent keyEvent) {
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> weakHashMap = this.mViewsContainingListeners;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        android.view.View viewDispatchInOrder = dispatchInOrder(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewDispatchInOrder != null) {
                            return viewDispatchInOrder;
                        }
                    }
                }
                if (onUnhandledKeyEvent(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        boolean preDispatch(android.view.KeyEvent keyEvent) {
            java.lang.ref.WeakReference<android.view.View> weakReferenceValueAt;
            int iIndexOfKey;
            java.lang.ref.WeakReference<android.view.KeyEvent> weakReference = this.mLastDispatchedPreViewKeyEvent;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.mLastDispatchedPreViewKeyEvent = new java.lang.ref.WeakReference<>(keyEvent);
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> capturedKeys = getCapturedKeys();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = capturedKeys.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = capturedKeys.valueAt(iIndexOfKey);
                capturedKeys.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = capturedKeys.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            android.view.View view = weakReferenceValueAt.get();
            if (view != null && androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
                onUnhandledKeyEvent(view, keyEvent);
            }
            return true;
        }

        private boolean onUnhandledKeyEvent(android.view.View view, android.view.KeyEvent keyEvent) {
            java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        static void registerListeningView(android.view.View view) {
            java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> arrayList = sViewsWithListeners;
            synchronized (arrayList) {
                java.util.Iterator<java.lang.ref.WeakReference<android.view.View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                sViewsWithListeners.add(new java.lang.ref.WeakReference<>(view));
            }
        }

        static void unregisterListeningView(android.view.View view) {
            synchronized (sViewsWithListeners) {
                int i = 0;
                while (true) {
                    java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> arrayList = sViewsWithListeners;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i).get() == view) {
                        arrayList.remove(i);
                        return;
                    }
                    i++;
                }
            }
        }

        private void recalcViewsWithUnhandled() {
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> weakHashMap = this.mViewsContainingListeners;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> arrayList = sViewsWithListeners;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.mViewsContainingListeners == null) {
                    this.mViewsContainingListeners = new java.util.WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> arrayList2 = sViewsWithListeners;
                    android.view.View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.mViewsContainingListeners.put(view, java.lang.Boolean.TRUE);
                        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                            this.mViewsContainingListeners.put((android.view.View) parent, java.lang.Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View view) {
            return androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(view);
        }

        static androidx.core.view.WindowInsetsCompat computeSystemWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.graphics.Rect rect) {
            android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        static void setOnApplyWindowInsetsListener(final android.view.View view, final androidx.core.view.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (android.os.Build.VERSION.SDK_INT < 30) {
                view.setTag(androidx.core.R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener);
            }
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener((android.view.View.OnApplyWindowInsetsListener) view.getTag(androidx.core.R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.Api21Impl.1
                    androidx.core.view.WindowInsetsCompat mLastInsets = null;

                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public android.view.WindowInsets onApplyWindowInsets(android.view.View view2, android.view.WindowInsets windowInsets) {
                        androidx.core.view.WindowInsetsCompat windowInsetsCompat = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view2);
                        if (android.os.Build.VERSION.SDK_INT < 30) {
                            androidx.core.view.ViewCompat.Api21Impl.callCompatInsetAnimationCallback(windowInsets, view);
                            if (windowInsetsCompat.equals(this.mLastInsets)) {
                                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat).toWindowInsets();
                            }
                        }
                        this.mLastInsets = windowInsetsCompat;
                        androidx.core.view.WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat);
                        if (android.os.Build.VERSION.SDK_INT >= 30) {
                            return windowInsetsCompatOnApplyWindowInsets.toWindowInsets();
                        }
                        androidx.core.view.ViewCompat.requestApplyInsets(view2);
                        return windowInsetsCompatOnApplyWindowInsets.toWindowInsets();
                    }
                });
            }
        }

        static void callCompatInsetAnimationCallback(android.view.WindowInsets windowInsets, android.view.View view) {
            android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (android.view.View.OnApplyWindowInsetsListener) view.getTag(androidx.core.R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static boolean dispatchNestedFling(android.view.View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        static boolean dispatchNestedPreFling(android.view.View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        static float getZ(android.view.View view) {
            return view.getZ();
        }

        static void setZ(android.view.View view, float f) {
            view.setZ(f);
        }

        static void setElevation(android.view.View view, float f) {
            view.setElevation(f);
        }

        static void setTranslationZ(android.view.View view, float f) {
            view.setTranslationZ(f);
        }

        static float getTranslationZ(android.view.View view) {
            return view.getTranslationZ();
        }

        static void setTransitionName(android.view.View view, java.lang.String str) {
            view.setTransitionName(str);
        }

        static boolean isImportantForAccessibility(android.view.View view) {
            return view.isImportantForAccessibility();
        }

        static float getElevation(android.view.View view) {
            return view.getElevation();
        }

        static java.lang.String getTransitionName(android.view.View view) {
            return view.getTransitionName();
        }

        static void setBackgroundTintList(android.view.View view, android.content.res.ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static android.content.res.ColorStateList getBackgroundTintList(android.view.View view) {
            return view.getBackgroundTintList();
        }

        static android.graphics.PorterDuff.Mode getBackgroundTintMode(android.view.View view) {
            return view.getBackgroundTintMode();
        }

        static void setBackgroundTintMode(android.view.View view, android.graphics.PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void setNestedScrollingEnabled(android.view.View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        static boolean isNestedScrollingEnabled(android.view.View view) {
            return view.isNestedScrollingEnabled();
        }

        static boolean startNestedScroll(android.view.View view, int i) {
            return view.startNestedScroll(i);
        }

        static void stopNestedScroll(android.view.View view) {
            view.stopNestedScroll();
        }

        static boolean hasNestedScrollingParent(android.view.View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean dispatchNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        static boolean dispatchNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View view) {
            android.view.WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            androidx.core.view.WindowInsetsCompat windowInsetsCompat = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.setRootWindowInsets(windowInsetsCompat);
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
            return windowInsetsCompat;
        }

        static void setScrollIndicators(android.view.View view, int i) {
            view.setScrollIndicators(i);
        }

        static void setScrollIndicators(android.view.View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }

        static int getScrollIndicators(android.view.View view) {
            return view.getScrollIndicators();
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static void saveAttributeDataForStyleable(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        static android.view.View.AccessibilityDelegate getAccessibilityDelegate(android.view.View view) {
            return view.getAccessibilityDelegate();
        }

        static void setSystemGestureExclusionRects(android.view.View view, java.util.List<android.graphics.Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }

        static java.util.List<android.graphics.Rect> getSystemGestureExclusionRects(android.view.View view) {
            return view.getSystemGestureExclusionRects();
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        public static androidx.core.view.WindowInsetsControllerCompat getWindowInsetsController(android.view.View view) {
            android.view.WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return androidx.core.view.WindowInsetsControllerCompat.toWindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }

        static void setStateDescription(android.view.View view, java.lang.CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        static java.lang.CharSequence getStateDescription(android.view.View view) {
            return view.getStateDescription();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void setAutofillHints(android.view.View view, java.lang.String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void setTooltipText(android.view.View view, java.lang.CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }

        static int getNextClusterForwardId(android.view.View view) {
            return view.getNextClusterForwardId();
        }

        static void setNextClusterForwardId(android.view.View view, int i) {
            view.setNextClusterForwardId(i);
        }

        static boolean isKeyboardNavigationCluster(android.view.View view) {
            return view.isKeyboardNavigationCluster();
        }

        static void setKeyboardNavigationCluster(android.view.View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        static boolean isFocusedByDefault(android.view.View view) {
            return view.isFocusedByDefault();
        }

        static void setFocusedByDefault(android.view.View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        static android.view.View keyboardNavigationClusterSearch(android.view.View view, android.view.View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        static void addKeyboardNavigationClusters(android.view.View view, java.util.Collection<android.view.View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        static boolean restoreDefaultFocus(android.view.View view) {
            return view.restoreDefaultFocus();
        }

        static boolean hasExplicitFocusable(android.view.View view) {
            return view.hasExplicitFocusable();
        }

        static int getImportantForAutofill(android.view.View view) {
            return view.getImportantForAutofill();
        }

        static void setImportantForAutofill(android.view.View view, int i) {
            view.setImportantForAutofill(i);
        }

        static boolean isImportantForAutofill(android.view.View view) {
            return view.isImportantForAutofill();
        }
    }

    static class Api18Impl {
        private Api18Impl() {
        }

        static boolean isInLayout(android.view.View view) {
            return view.isInLayout();
        }

        static void setClipBounds(android.view.View view, android.graphics.Rect rect) {
            view.setClipBounds(rect);
        }

        static android.graphics.Rect getClipBounds(android.view.View view) {
            return view.getClipBounds();
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static boolean isLaidOut(android.view.View view) {
            return view.isLaidOut();
        }

        static boolean isAttachedToWindow(android.view.View view) {
            return view.isAttachedToWindow();
        }

        static boolean isLayoutDirectionResolved(android.view.View view) {
            return view.isLayoutDirectionResolved();
        }

        static int getAccessibilityLiveRegion(android.view.View view) {
            return view.getAccessibilityLiveRegion();
        }

        static void setAccessibilityLiveRegion(android.view.View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        static void setContentChangeTypes(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }

        static void notifySubtreeAccessibilityStateChanged(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }
    }

    static class Api15Impl {
        private Api15Impl() {
        }

        static boolean hasOnClickListeners(android.view.View view) {
            return view.hasOnClickListeners();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void setPointerIcon(android.view.View view, android.view.PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean startDragAndDrop(android.view.View view, android.content.ClipData clipData, android.view.View.DragShadowBuilder dragShadowBuilder, java.lang.Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        static void cancelDragAndDrop(android.view.View view) {
            view.cancelDragAndDrop();
        }

        static void updateDragShadow(android.view.View view, android.view.View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }

        static void dispatchStartTemporaryDetach(android.view.View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void dispatchFinishTemporaryDetach(android.view.View view) {
            view.dispatchFinishTemporaryDetach();
        }
    }

    static class Api17Impl {
        private Api17Impl() {
        }

        static android.view.Display getDisplay(android.view.View view) {
            return view.getDisplay();
        }

        static int generateViewId() {
            return android.view.View.generateViewId();
        }

        static int getLabelFor(android.view.View view) {
            return view.getLabelFor();
        }

        static void setLabelFor(android.view.View view, int i) {
            view.setLabelFor(i);
        }

        static void setLayerPaint(android.view.View view, android.graphics.Paint paint) {
            view.setLayerPaint(paint);
        }

        static int getLayoutDirection(android.view.View view) {
            return view.getLayoutDirection();
        }

        static void setLayoutDirection(android.view.View view, int i) {
            view.setLayoutDirection(i);
        }

        static int getPaddingStart(android.view.View view) {
            return view.getPaddingStart();
        }

        static int getPaddingEnd(android.view.View view) {
            return view.getPaddingEnd();
        }

        static void setPaddingRelative(android.view.View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }

        static boolean isPaddingRelative(android.view.View view) {
            return view.isPaddingRelative();
        }
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static boolean hasTransientState(android.view.View view) {
            return view.hasTransientState();
        }

        static void setHasTransientState(android.view.View view, boolean z) {
            view.setHasTransientState(z);
        }

        static void postInvalidateOnAnimation(android.view.View view) {
            view.postInvalidateOnAnimation();
        }

        static void postInvalidateOnAnimation(android.view.View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        static void postOnAnimation(android.view.View view, java.lang.Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void postOnAnimationDelayed(android.view.View view, java.lang.Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        static int getImportantForAccessibility(android.view.View view) {
            return view.getImportantForAccessibility();
        }

        static void setImportantForAccessibility(android.view.View view, int i) {
            view.setImportantForAccessibility(i);
        }

        static android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
            return view.getAccessibilityNodeProvider();
        }

        static android.view.ViewParent getParentForAccessibility(android.view.View view) {
            return view.getParentForAccessibility();
        }

        static int getMinimumWidth(android.view.View view) {
            return view.getMinimumWidth();
        }

        static int getMinimumHeight(android.view.View view) {
            return view.getMinimumHeight();
        }

        static int getWindowSystemUiVisibility(android.view.View view) {
            return view.getWindowSystemUiVisibility();
        }

        static void requestFitSystemWindows(android.view.View view) {
            view.requestFitSystemWindows();
        }

        static boolean getFitsSystemWindows(android.view.View view) {
            return view.getFitsSystemWindows();
        }

        static boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        static boolean hasOverlappingRendering(android.view.View view) {
            return view.hasOverlappingRendering();
        }

        static void setBackground(android.view.View view, android.graphics.drawable.Drawable drawable) {
            view.setBackground(drawable);
        }

        static void removeOnGlobalLayoutListener(android.view.ViewTreeObserver viewTreeObserver, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static <T> T requireViewById(android.view.View view, int i) {
            return (T) view.requireViewById(i);
        }

        static java.lang.CharSequence getAccessibilityPaneTitle(android.view.View view) {
            return view.getAccessibilityPaneTitle();
        }

        static void setAccessibilityPaneTitle(android.view.View view, java.lang.CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void setAccessibilityHeading(android.view.View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        static boolean isAccessibilityHeading(android.view.View view) {
            return view.isAccessibilityHeading();
        }

        static boolean isScreenReaderFocusable(android.view.View view) {
            return view.isScreenReaderFocusable();
        }

        static void setScreenReaderFocusable(android.view.View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }

        static void addOnUnhandledKeyEventListener(android.view.View view, final androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            androidx.collection.SimpleArrayMap simpleArrayMap = (androidx.collection.SimpleArrayMap) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null) {
                simpleArrayMap = new androidx.collection.SimpleArrayMap();
                view.setTag(androidx.core.R.id.tag_unhandled_key_listeners, simpleArrayMap);
            }
            java.util.Objects.requireNonNull(onUnhandledKeyEventListenerCompat);
            android.view.View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new android.view.View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.ViewCompat$Api28Impl$$ExternalSyntheticLambda0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(android.view.View view2, android.view.KeyEvent keyEvent) {
                    return onUnhandledKeyEventListenerCompat.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            simpleArrayMap.put(onUnhandledKeyEventListenerCompat, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static void removeOnUnhandledKeyEventListener(android.view.View view, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            android.view.View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.SimpleArrayMap simpleArrayMap = (androidx.collection.SimpleArrayMap) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null || (onUnhandledKeyEventListener = (android.view.View.OnUnhandledKeyEventListener) simpleArrayMap.get(onUnhandledKeyEventListenerCompat)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    static class Api20Impl {
        private Api20Impl() {
        }

        static void requestApplyInsets(android.view.View view) {
            view.requestApplyInsets();
        }

        static android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static android.view.WindowInsets dispatchApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }
    }
}
