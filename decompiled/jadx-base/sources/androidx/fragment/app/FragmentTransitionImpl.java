package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentTransitionImpl {
    public abstract void addTarget(java.lang.Object obj, android.view.View view);

    public abstract void addTargets(java.lang.Object obj, java.util.ArrayList<android.view.View> arrayList);

    public abstract void beginDelayedTransition(android.view.ViewGroup viewGroup, java.lang.Object obj);

    public abstract boolean canHandle(java.lang.Object obj);

    public abstract java.lang.Object cloneTransition(java.lang.Object obj);

    public abstract java.lang.Object mergeTransitionsInSequence(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    public abstract java.lang.Object mergeTransitionsTogether(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    public abstract void removeTarget(java.lang.Object obj, android.view.View view);

    public abstract void replaceTargets(java.lang.Object obj, java.util.ArrayList<android.view.View> arrayList, java.util.ArrayList<android.view.View> arrayList2);

    public abstract void scheduleHideFragmentView(java.lang.Object obj, android.view.View view, java.util.ArrayList<android.view.View> arrayList);

    public abstract void scheduleRemoveTargets(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList<android.view.View> arrayList, java.lang.Object obj3, java.util.ArrayList<android.view.View> arrayList2, java.lang.Object obj4, java.util.ArrayList<android.view.View> arrayList3);

    public abstract void setEpicenter(java.lang.Object obj, android.graphics.Rect rect);

    public abstract void setEpicenter(java.lang.Object obj, android.view.View view);

    public abstract void setSharedElementTargets(java.lang.Object obj, android.view.View view, java.util.ArrayList<android.view.View> arrayList);

    public abstract void swapSharedElementTargets(java.lang.Object obj, java.util.ArrayList<android.view.View> arrayList, java.util.ArrayList<android.view.View> arrayList2);

    public abstract java.lang.Object wrapTransitionInSet(java.lang.Object obj);

    protected void getBoundsOnScreen(android.view.View view, android.graphics.Rect rect) {
        if (androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
            android.graphics.RectF rectF = new android.graphics.RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            java.lang.Object parent = view.getParent();
            while (parent instanceof android.view.View) {
                android.view.View view2 = (android.view.View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(java.lang.Math.round(rectF.left), java.lang.Math.round(rectF.top), java.lang.Math.round(rectF.right), java.lang.Math.round(rectF.bottom));
        }
    }

    java.util.ArrayList<java.lang.String> prepareSetNameOverridesReordered(java.util.ArrayList<android.view.View> arrayList) {
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = arrayList.get(i);
            arrayList2.add(androidx.core.view.ViewCompat.getTransitionName(view));
            androidx.core.view.ViewCompat.setTransitionName(view, null);
        }
        return arrayList2;
    }

    void setNameOverridesReordered(android.view.View view, final java.util.ArrayList<android.view.View> arrayList, final java.util.ArrayList<android.view.View> arrayList2, final java.util.ArrayList<java.lang.String> arrayList3, java.util.Map<java.lang.String, java.lang.String> map) {
        final int size = arrayList2.size();
        final java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (int i = 0; i < size; i++) {
            android.view.View view2 = arrayList.get(i);
            java.lang.String transitionName = androidx.core.view.ViewCompat.getTransitionName(view2);
            arrayList4.add(transitionName);
            if (transitionName != null) {
                androidx.core.view.ViewCompat.setTransitionName(view2, null);
                java.lang.String str = map.get(transitionName);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        androidx.core.view.ViewCompat.setTransitionName(arrayList2.get(i2), transitionName);
                        break;
                    }
                }
            }
        }
        androidx.core.view.OneShotPreDrawListener.add(view, new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentTransitionImpl.1
            @Override // java.lang.Runnable
            public void run() {
                for (int i3 = 0; i3 < size; i3++) {
                    androidx.core.view.ViewCompat.setTransitionName((android.view.View) arrayList2.get(i3), (java.lang.String) arrayList3.get(i3));
                    androidx.core.view.ViewCompat.setTransitionName((android.view.View) arrayList.get(i3), (java.lang.String) arrayList4.get(i3));
                }
            }
        });
    }

    void captureTransitioningViews(java.util.ArrayList<android.view.View> arrayList, android.view.View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                if (androidx.core.view.ViewGroupCompat.isTransitionGroup(viewGroup)) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    captureTransitioningViews(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    void findNamedViews(java.util.Map<java.lang.String, android.view.View> map, android.view.View view) {
        if (view.getVisibility() == 0) {
            java.lang.String transitionName = androidx.core.view.ViewCompat.getTransitionName(view);
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    findNamedViews(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    void setNameOverridesOrdered(android.view.View view, final java.util.ArrayList<android.view.View> arrayList, final java.util.Map<java.lang.String, java.lang.String> map) {
        androidx.core.view.OneShotPreDrawListener.add(view, new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentTransitionImpl.2
            @Override // java.lang.Runnable
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    android.view.View view2 = (android.view.View) arrayList.get(i);
                    java.lang.String transitionName = androidx.core.view.ViewCompat.getTransitionName(view2);
                    if (transitionName != null) {
                        androidx.core.view.ViewCompat.setTransitionName(view2, androidx.fragment.app.FragmentTransitionImpl.findKeyForValue(map, transitionName));
                    }
                }
            }
        });
    }

    public void setListenerForTransitionEnd(androidx.fragment.app.Fragment fragment, java.lang.Object obj, androidx.core.os.CancellationSignal cancellationSignal, java.lang.Runnable runnable) {
        runnable.run();
    }

    void scheduleNameReset(android.view.ViewGroup viewGroup, final java.util.ArrayList<android.view.View> arrayList, final java.util.Map<java.lang.String, java.lang.String> map) {
        androidx.core.view.OneShotPreDrawListener.add(viewGroup, new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentTransitionImpl.3
            @Override // java.lang.Runnable
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    android.view.View view = (android.view.View) arrayList.get(i);
                    androidx.core.view.ViewCompat.setTransitionName(view, (java.lang.String) map.get(androidx.core.view.ViewCompat.getTransitionName(view)));
                }
            }
        });
    }

    protected static void bfsAddViewChildren(java.util.List<android.view.View> list, android.view.View view) {
        int size = list.size();
        if (containedBeforeIndex(list, view, size)) {
            return;
        }
        if (androidx.core.view.ViewCompat.getTransitionName(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            android.view.View view2 = list.get(i);
            if (view2 instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    android.view.View childAt = viewGroup.getChildAt(i2);
                    if (!containedBeforeIndex(list, childAt, size) && androidx.core.view.ViewCompat.getTransitionName(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean containedBeforeIndex(java.util.List<android.view.View> list, android.view.View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean isNullOrEmpty(java.util.List list) {
        return list == null || list.isEmpty();
    }

    static java.lang.String findKeyForValue(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
