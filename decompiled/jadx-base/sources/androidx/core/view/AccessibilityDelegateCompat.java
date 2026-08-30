package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityDelegateCompat {
    private static final android.view.View.AccessibilityDelegate DEFAULT_DELEGATE = new android.view.View.AccessibilityDelegate();
    private final android.view.View.AccessibilityDelegate mBridge;
    private final android.view.View.AccessibilityDelegate mOriginalDelegate;

    static final class AccessibilityDelegateAdapter extends android.view.View.AccessibilityDelegate {
        final androidx.core.view.AccessibilityDelegateCompat mCompat;

        AccessibilityDelegateAdapter(androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat) {
            this.mCompat = accessibilityDelegateCompat;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return this.mCompat.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            this.mCompat.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            accessibilityNodeInfoCompatWrap.setScreenReaderFocusable(androidx.core.view.ViewCompat.isScreenReaderFocusable(view));
            accessibilityNodeInfoCompatWrap.setHeading(androidx.core.view.ViewCompat.isAccessibilityHeading(view));
            accessibilityNodeInfoCompatWrap.setPaneTitle(androidx.core.view.ViewCompat.getAccessibilityPaneTitle(view));
            accessibilityNodeInfoCompatWrap.setStateDescription(androidx.core.view.ViewCompat.getStateDescription(view));
            this.mCompat.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatWrap);
            accessibilityNodeInfoCompatWrap.addSpansToExtras(accessibilityNodeInfo.getText(), view);
            java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = androidx.core.view.AccessibilityDelegateCompat.getActionList(view);
            for (int i = 0; i < actionList.size(); i++) {
                accessibilityNodeInfoCompatWrap.addAction(actionList.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            this.mCompat.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return this.mCompat.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(android.view.View view, int i) {
            this.mCompat.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            this.mCompat.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
            androidx.core.view.accessibility.AccessibilityNodeProviderCompat accessibilityNodeProvider = this.mCompat.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (android.view.accessibility.AccessibilityNodeProvider) accessibilityNodeProvider.getProvider();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
            return this.mCompat.performAccessibilityAction(view, i, bundle);
        }
    }

    public AccessibilityDelegateCompat() {
        this(DEFAULT_DELEGATE);
    }

    public AccessibilityDelegateCompat(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter(this);
    }

    android.view.View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void sendAccessibilityEvent(android.view.View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
    }

    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider = androidx.core.view.AccessibilityDelegateCompat.Api16Impl.getAccessibilityNodeProvider(this.mOriginalDelegate, view);
        if (accessibilityNodeProvider != null) {
            return new androidx.core.view.accessibility.AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    public boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        boolean zPerformAccessibilityAction = false;
        for (int i2 = 0; i2 < actionList.size(); i2++) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = actionList.get(i2);
            if (accessibilityActionCompat.getId() == i) {
                zPerformAccessibilityAction = accessibilityActionCompat.perform(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = androidx.core.view.AccessibilityDelegateCompat.Api16Impl.performAccessibilityAction(this.mOriginalDelegate, view, i, bundle);
        }
        return (zPerformAccessibilityAction || i != androidx.core.R.id.accessibility_action_clickable_span || bundle == null) ? zPerformAccessibilityAction : performClickableSpanAction(bundle.getInt(androidx.core.view.accessibility.AccessibilityClickableSpanCompat.SPAN_ID, -1), view);
    }

    private boolean performClickableSpanAction(int i, android.view.View view) {
        java.lang.ref.WeakReference weakReference;
        android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(androidx.core.R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (java.lang.ref.WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        android.text.style.ClickableSpan clickableSpan = (android.text.style.ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    private boolean isSpanStillValid(android.text.style.ClickableSpan clickableSpan, android.view.View view) {
        if (clickableSpan != null) {
            android.text.style.ClickableSpan[] clickableSpans = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.getClickableSpans(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; clickableSpans != null && i < clickableSpans.length; i++) {
                if (clickableSpan.equals(clickableSpans[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    static java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(android.view.View view) {
        java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> list = (java.util.List) view.getTag(androidx.core.R.id.tag_accessibility_actions);
        return list == null ? java.util.Collections.emptyList() : list;
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean performAccessibilityAction(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view, int i, android.os.Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }
}
