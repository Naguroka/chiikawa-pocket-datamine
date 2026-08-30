package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentTransition {
    private static final int[] INVERSE_OPS = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    static final androidx.fragment.app.FragmentTransitionImpl PLATFORM_IMPL = new androidx.fragment.app.FragmentTransitionCompat21();
    static final androidx.fragment.app.FragmentTransitionImpl SUPPORT_IMPL = resolveSupportImpl();

    interface Callback {
        void onComplete(androidx.fragment.app.Fragment fragment, androidx.core.os.CancellationSignal cancellationSignal);

        void onStart(androidx.fragment.app.Fragment fragment, androidx.core.os.CancellationSignal cancellationSignal);
    }

    private static androidx.fragment.app.FragmentTransitionImpl resolveSupportImpl() {
        try {
            return (androidx.fragment.app.FragmentTransitionImpl) java.lang.Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static void startTransitions(android.content.Context context, androidx.fragment.app.FragmentContainer fragmentContainer, java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2, int i, int i2, boolean z, androidx.fragment.app.FragmentTransition.Callback callback) {
        android.view.ViewGroup viewGroup;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            androidx.fragment.app.BackStackRecord backStackRecord = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                calculatePopFragments(backStackRecord, sparseArray, z);
            } else {
                calculateFragments(backStackRecord, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            android.view.View view = new android.view.View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int iKeyAt = sparseArray.keyAt(i4);
                androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMapCalculateNameOverrides = calculateNameOverrides(iKeyAt, arrayList, arrayList2, i, i2);
                androidx.fragment.app.FragmentTransition.FragmentContainerTransition fragmentContainerTransition = (androidx.fragment.app.FragmentTransition.FragmentContainerTransition) sparseArray.valueAt(i4);
                if (fragmentContainer.onHasView() && (viewGroup = (android.view.ViewGroup) fragmentContainer.onFindViewById(iKeyAt)) != null) {
                    if (z) {
                        configureTransitionsReordered(viewGroup, fragmentContainerTransition, view, arrayMapCalculateNameOverrides, callback);
                    } else {
                        configureTransitionsOrdered(viewGroup, fragmentContainerTransition, view, arrayMapCalculateNameOverrides, callback);
                    }
                }
            }
        }
    }

    private static androidx.collection.ArrayMap<java.lang.String, java.lang.String> calculateNameOverrides(int i, java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2, int i2, int i3) {
        java.util.ArrayList<java.lang.String> arrayList3;
        java.util.ArrayList<java.lang.String> arrayList4;
        androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap = new androidx.collection.ArrayMap<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            androidx.fragment.app.BackStackRecord backStackRecord = arrayList.get(i4);
            if (backStackRecord.interactsWith(i)) {
                boolean zBooleanValue = arrayList2.get(i4).booleanValue();
                if (backStackRecord.mSharedElementSourceNames != null) {
                    int size = backStackRecord.mSharedElementSourceNames.size();
                    if (zBooleanValue) {
                        arrayList3 = backStackRecord.mSharedElementSourceNames;
                        arrayList4 = backStackRecord.mSharedElementTargetNames;
                    } else {
                        java.util.ArrayList<java.lang.String> arrayList5 = backStackRecord.mSharedElementSourceNames;
                        arrayList3 = backStackRecord.mSharedElementTargetNames;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        java.lang.String str = arrayList4.get(i5);
                        java.lang.String str2 = arrayList3.get(i5);
                        java.lang.String strRemove = arrayMap.remove(str2);
                        if (strRemove != null) {
                            arrayMap.put(str, strRemove);
                        } else {
                            arrayMap.put(str, str2);
                        }
                    }
                }
            }
        }
        return arrayMap;
    }

    private static void configureTransitionsReordered(android.view.ViewGroup viewGroup, androidx.fragment.app.FragmentTransition.FragmentContainerTransition fragmentContainerTransition, android.view.View view, androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, final androidx.fragment.app.FragmentTransition.Callback callback) {
        java.lang.Object obj;
        androidx.fragment.app.Fragment fragment = fragmentContainerTransition.lastIn;
        final androidx.fragment.app.Fragment fragment2 = fragmentContainerTransition.firstOut;
        androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImplChooseImpl = chooseImpl(fragment2, fragment);
        if (fragmentTransitionImplChooseImpl == null) {
            return;
        }
        boolean z = fragmentContainerTransition.lastInIsPop;
        boolean z2 = fragmentContainerTransition.firstOutIsPop;
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<android.view.View> arrayList2 = new java.util.ArrayList<>();
        java.lang.Object enterTransition = getEnterTransition(fragmentTransitionImplChooseImpl, fragment, z);
        java.lang.Object exitTransition = getExitTransition(fragmentTransitionImplChooseImpl, fragment2, z2);
        java.lang.Object objConfigureSharedElementsReordered = configureSharedElementsReordered(fragmentTransitionImplChooseImpl, viewGroup, view, arrayMap, fragmentContainerTransition, arrayList2, arrayList, enterTransition, exitTransition);
        if (enterTransition == null && objConfigureSharedElementsReordered == null) {
            obj = exitTransition;
            if (obj == null) {
                return;
            }
        } else {
            obj = exitTransition;
        }
        java.util.ArrayList<android.view.View> arrayListConfigureEnteringExitingViews = configureEnteringExitingViews(fragmentTransitionImplChooseImpl, obj, fragment2, arrayList2, view);
        java.util.ArrayList<android.view.View> arrayListConfigureEnteringExitingViews2 = configureEnteringExitingViews(fragmentTransitionImplChooseImpl, enterTransition, fragment, arrayList, view);
        setViewVisibility(arrayListConfigureEnteringExitingViews2, 4);
        java.lang.Object objMergeTransitions = mergeTransitions(fragmentTransitionImplChooseImpl, enterTransition, obj, objConfigureSharedElementsReordered, fragment, z);
        if (fragment2 != null && arrayListConfigureEnteringExitingViews != null && (arrayListConfigureEnteringExitingViews.size() > 0 || arrayList2.size() > 0)) {
            final androidx.core.os.CancellationSignal cancellationSignal = new androidx.core.os.CancellationSignal();
            callback.onStart(fragment2, cancellationSignal);
            fragmentTransitionImplChooseImpl.setListenerForTransitionEnd(fragment2, objMergeTransitions, cancellationSignal, new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentTransition.1
                @Override // java.lang.Runnable
                public void run() {
                    callback.onComplete(fragment2, cancellationSignal);
                }
            });
        }
        if (objMergeTransitions != null) {
            replaceHide(fragmentTransitionImplChooseImpl, obj, fragment2, arrayListConfigureEnteringExitingViews);
            java.util.ArrayList<java.lang.String> arrayListPrepareSetNameOverridesReordered = fragmentTransitionImplChooseImpl.prepareSetNameOverridesReordered(arrayList);
            fragmentTransitionImplChooseImpl.scheduleRemoveTargets(objMergeTransitions, enterTransition, arrayListConfigureEnteringExitingViews2, obj, arrayListConfigureEnteringExitingViews, objConfigureSharedElementsReordered, arrayList);
            fragmentTransitionImplChooseImpl.beginDelayedTransition(viewGroup, objMergeTransitions);
            fragmentTransitionImplChooseImpl.setNameOverridesReordered(viewGroup, arrayList2, arrayList, arrayListPrepareSetNameOverridesReordered, arrayMap);
            setViewVisibility(arrayListConfigureEnteringExitingViews2, 0);
            fragmentTransitionImplChooseImpl.swapSharedElementTargets(objConfigureSharedElementsReordered, arrayList2, arrayList);
        }
    }

    private static void replaceHide(androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, java.lang.Object obj, androidx.fragment.app.Fragment fragment, final java.util.ArrayList<android.view.View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            fragmentTransitionImpl.scheduleHideFragmentView(obj, fragment.getView(), arrayList);
            androidx.core.view.OneShotPreDrawListener.add(fragment.mContainer, new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentTransition.2
                @Override // java.lang.Runnable
                public void run() {
                    androidx.fragment.app.FragmentTransition.setViewVisibility(arrayList, 4);
                }
            });
        }
    }

    private static void configureTransitionsOrdered(android.view.ViewGroup viewGroup, androidx.fragment.app.FragmentTransition.FragmentContainerTransition fragmentContainerTransition, android.view.View view, androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, final androidx.fragment.app.FragmentTransition.Callback callback) {
        java.lang.Object obj;
        androidx.fragment.app.Fragment fragment = fragmentContainerTransition.lastIn;
        final androidx.fragment.app.Fragment fragment2 = fragmentContainerTransition.firstOut;
        androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImplChooseImpl = chooseImpl(fragment2, fragment);
        if (fragmentTransitionImplChooseImpl == null) {
            return;
        }
        boolean z = fragmentContainerTransition.lastInIsPop;
        boolean z2 = fragmentContainerTransition.firstOutIsPop;
        java.lang.Object enterTransition = getEnterTransition(fragmentTransitionImplChooseImpl, fragment, z);
        java.lang.Object exitTransition = getExitTransition(fragmentTransitionImplChooseImpl, fragment2, z2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<android.view.View> arrayList2 = new java.util.ArrayList<>();
        java.lang.Object objConfigureSharedElementsOrdered = configureSharedElementsOrdered(fragmentTransitionImplChooseImpl, viewGroup, view, arrayMap, fragmentContainerTransition, arrayList, arrayList2, enterTransition, exitTransition);
        if (enterTransition == null && objConfigureSharedElementsOrdered == null) {
            obj = exitTransition;
            if (obj == null) {
                return;
            }
        } else {
            obj = exitTransition;
        }
        java.util.ArrayList<android.view.View> arrayListConfigureEnteringExitingViews = configureEnteringExitingViews(fragmentTransitionImplChooseImpl, obj, fragment2, arrayList, view);
        if (arrayListConfigureEnteringExitingViews == null || arrayListConfigureEnteringExitingViews.isEmpty()) {
            obj = null;
        }
        java.lang.Object obj2 = obj;
        fragmentTransitionImplChooseImpl.addTarget(enterTransition, view);
        java.lang.Object objMergeTransitions = mergeTransitions(fragmentTransitionImplChooseImpl, enterTransition, obj2, objConfigureSharedElementsOrdered, fragment, fragmentContainerTransition.lastInIsPop);
        if (fragment2 != null && arrayListConfigureEnteringExitingViews != null && (arrayListConfigureEnteringExitingViews.size() > 0 || arrayList.size() > 0)) {
            final androidx.core.os.CancellationSignal cancellationSignal = new androidx.core.os.CancellationSignal();
            callback.onStart(fragment2, cancellationSignal);
            fragmentTransitionImplChooseImpl.setListenerForTransitionEnd(fragment2, objMergeTransitions, cancellationSignal, new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentTransition.3
                @Override // java.lang.Runnable
                public void run() {
                    callback.onComplete(fragment2, cancellationSignal);
                }
            });
        }
        if (objMergeTransitions != null) {
            java.util.ArrayList<android.view.View> arrayList3 = new java.util.ArrayList<>();
            fragmentTransitionImplChooseImpl.scheduleRemoveTargets(objMergeTransitions, enterTransition, arrayList3, obj2, arrayListConfigureEnteringExitingViews, objConfigureSharedElementsOrdered, arrayList2);
            scheduleTargetChange(fragmentTransitionImplChooseImpl, viewGroup, fragment, view, arrayList2, enterTransition, arrayList3, obj2, arrayListConfigureEnteringExitingViews);
            fragmentTransitionImplChooseImpl.setNameOverridesOrdered(viewGroup, arrayList2, arrayMap);
            fragmentTransitionImplChooseImpl.beginDelayedTransition(viewGroup, objMergeTransitions);
            fragmentTransitionImplChooseImpl.scheduleNameReset(viewGroup, arrayList2, arrayMap);
        }
    }

    private static void scheduleTargetChange(final androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, android.view.ViewGroup viewGroup, final androidx.fragment.app.Fragment fragment, final android.view.View view, final java.util.ArrayList<android.view.View> arrayList, final java.lang.Object obj, final java.util.ArrayList<android.view.View> arrayList2, final java.lang.Object obj2, final java.util.ArrayList<android.view.View> arrayList3) {
        androidx.core.view.OneShotPreDrawListener.add(viewGroup, new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentTransition.4
            @Override // java.lang.Runnable
            public void run() {
                java.lang.Object obj3 = obj;
                if (obj3 != null) {
                    fragmentTransitionImpl.removeTarget(obj3, view);
                    arrayList2.addAll(androidx.fragment.app.FragmentTransition.configureEnteringExitingViews(fragmentTransitionImpl, obj, fragment, arrayList, view));
                }
                if (arrayList3 != null) {
                    if (obj2 != null) {
                        java.util.ArrayList<android.view.View> arrayList4 = new java.util.ArrayList<>();
                        arrayList4.add(view);
                        fragmentTransitionImpl.replaceTargets(obj2, arrayList3, arrayList4);
                    }
                    arrayList3.clear();
                    arrayList3.add(view);
                }
            }
        });
    }

    private static androidx.fragment.app.FragmentTransitionImpl chooseImpl(androidx.fragment.app.Fragment fragment, androidx.fragment.app.Fragment fragment2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (fragment != null) {
            java.lang.Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            java.lang.Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            java.lang.Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            java.lang.Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            java.lang.Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            java.lang.Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl = PLATFORM_IMPL;
        if (fragmentTransitionImpl != null && canHandleAll(fragmentTransitionImpl, arrayList)) {
            return fragmentTransitionImpl;
        }
        androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl2 = SUPPORT_IMPL;
        if (fragmentTransitionImpl2 != null && canHandleAll(fragmentTransitionImpl2, arrayList)) {
            return fragmentTransitionImpl2;
        }
        if (fragmentTransitionImpl == null && fragmentTransitionImpl2 == null) {
            return null;
        }
        throw new java.lang.IllegalArgumentException("Invalid Transition types");
    }

    private static boolean canHandleAll(androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, java.util.List<java.lang.Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!fragmentTransitionImpl.canHandle(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static java.lang.Object getSharedElementTransition(androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, androidx.fragment.app.Fragment fragment, androidx.fragment.app.Fragment fragment2, boolean z) {
        java.lang.Object sharedElementEnterTransition;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            sharedElementEnterTransition = fragment2.getSharedElementReturnTransition();
        } else {
            sharedElementEnterTransition = fragment.getSharedElementEnterTransition();
        }
        return fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(sharedElementEnterTransition));
    }

    private static java.lang.Object getEnterTransition(androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, androidx.fragment.app.Fragment fragment, boolean z) {
        java.lang.Object enterTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            enterTransition = fragment.getReenterTransition();
        } else {
            enterTransition = fragment.getEnterTransition();
        }
        return fragmentTransitionImpl.cloneTransition(enterTransition);
    }

    private static java.lang.Object getExitTransition(androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, androidx.fragment.app.Fragment fragment, boolean z) {
        java.lang.Object exitTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        return fragmentTransitionImpl.cloneTransition(exitTransition);
    }

    private static java.lang.Object configureSharedElementsReordered(final androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, android.view.ViewGroup viewGroup, android.view.View view, androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, androidx.fragment.app.FragmentTransition.FragmentContainerTransition fragmentContainerTransition, java.util.ArrayList<android.view.View> arrayList, java.util.ArrayList<android.view.View> arrayList2, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        final android.view.View view2;
        final android.graphics.Rect rect;
        final androidx.fragment.app.Fragment fragment = fragmentContainerTransition.lastIn;
        final androidx.fragment.app.Fragment fragment2 = fragmentContainerTransition.firstOut;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        final boolean z = fragmentContainerTransition.lastInIsPop;
        java.lang.Object sharedElementTransition = arrayMap.isEmpty() ? null : getSharedElementTransition(fragmentTransitionImpl, fragment, fragment2, z);
        androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMapCaptureOutSharedElements = captureOutSharedElements(fragmentTransitionImpl, arrayMap, sharedElementTransition, fragmentContainerTransition);
        final androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMapCaptureInSharedElements = captureInSharedElements(fragmentTransitionImpl, arrayMap, sharedElementTransition, fragmentContainerTransition);
        if (arrayMap.isEmpty()) {
            if (arrayMapCaptureOutSharedElements != null) {
                arrayMapCaptureOutSharedElements.clear();
            }
            if (arrayMapCaptureInSharedElements != null) {
                arrayMapCaptureInSharedElements.clear();
            }
            obj3 = null;
        } else {
            addSharedElementsWithMatchingNames(arrayList, arrayMapCaptureOutSharedElements, arrayMap.keySet());
            addSharedElementsWithMatchingNames(arrayList2, arrayMapCaptureInSharedElements, arrayMap.values());
            obj3 = sharedElementTransition;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        callSharedElementStartEnd(fragment, fragment2, z, arrayMapCaptureOutSharedElements, true);
        if (obj3 != null) {
            arrayList2.add(view);
            fragmentTransitionImpl.setSharedElementTargets(obj3, view, arrayList);
            setOutEpicenter(fragmentTransitionImpl, obj3, obj2, arrayMapCaptureOutSharedElements, fragmentContainerTransition.firstOutIsPop, fragmentContainerTransition.firstOutTransaction);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            android.view.View inEpicenterView = getInEpicenterView(arrayMapCaptureInSharedElements, fragmentContainerTransition, obj, z);
            if (inEpicenterView != null) {
                fragmentTransitionImpl.setEpicenter(obj, rect2);
            }
            rect = rect2;
            view2 = inEpicenterView;
        } else {
            view2 = null;
            rect = null;
        }
        androidx.core.view.OneShotPreDrawListener.add(viewGroup, new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentTransition.5
            @Override // java.lang.Runnable
            public void run() {
                androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(fragment, fragment2, z, arrayMapCaptureInSharedElements, false);
                android.view.View view3 = view2;
                if (view3 != null) {
                    fragmentTransitionImpl.getBoundsOnScreen(view3, rect);
                }
            }
        });
        return obj3;
    }

    private static void addSharedElementsWithMatchingNames(java.util.ArrayList<android.view.View> arrayList, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap, java.util.Collection<java.lang.String> collection) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            android.view.View viewValueAt = arrayMap.valueAt(size);
            if (collection.contains(androidx.core.view.ViewCompat.getTransitionName(viewValueAt))) {
                arrayList.add(viewValueAt);
            }
        }
    }

    private static java.lang.Object configureSharedElementsOrdered(final androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, android.view.ViewGroup viewGroup, final android.view.View view, final androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, final androidx.fragment.app.FragmentTransition.FragmentContainerTransition fragmentContainerTransition, final java.util.ArrayList<android.view.View> arrayList, final java.util.ArrayList<android.view.View> arrayList2, final java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        android.graphics.Rect rect;
        final androidx.fragment.app.Fragment fragment = fragmentContainerTransition.lastIn;
        final androidx.fragment.app.Fragment fragment2 = fragmentContainerTransition.firstOut;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        final boolean z = fragmentContainerTransition.lastInIsPop;
        java.lang.Object sharedElementTransition = arrayMap.isEmpty() ? null : getSharedElementTransition(fragmentTransitionImpl, fragment, fragment2, z);
        androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMapCaptureOutSharedElements = captureOutSharedElements(fragmentTransitionImpl, arrayMap, sharedElementTransition, fragmentContainerTransition);
        if (arrayMap.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(arrayMapCaptureOutSharedElements.values());
            obj3 = sharedElementTransition;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        callSharedElementStartEnd(fragment, fragment2, z, arrayMapCaptureOutSharedElements, true);
        if (obj3 != null) {
            rect = new android.graphics.Rect();
            fragmentTransitionImpl.setSharedElementTargets(obj3, view, arrayList);
            setOutEpicenter(fragmentTransitionImpl, obj3, obj2, arrayMapCaptureOutSharedElements, fragmentContainerTransition.firstOutIsPop, fragmentContainerTransition.firstOutTransaction);
            if (obj != null) {
                fragmentTransitionImpl.setEpicenter(obj, rect);
            }
        } else {
            rect = null;
        }
        final java.lang.Object obj4 = obj3;
        final android.graphics.Rect rect2 = rect;
        androidx.core.view.OneShotPreDrawListener.add(viewGroup, new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentTransition.6
            @Override // java.lang.Runnable
            public void run() {
                androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMapCaptureInSharedElements = androidx.fragment.app.FragmentTransition.captureInSharedElements(fragmentTransitionImpl, arrayMap, obj4, fragmentContainerTransition);
                if (arrayMapCaptureInSharedElements != null) {
                    arrayList2.addAll(arrayMapCaptureInSharedElements.values());
                    arrayList2.add(view);
                }
                androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(fragment, fragment2, z, arrayMapCaptureInSharedElements, false);
                java.lang.Object obj5 = obj4;
                if (obj5 != null) {
                    fragmentTransitionImpl.swapSharedElementTargets(obj5, arrayList, arrayList2);
                    android.view.View inEpicenterView = androidx.fragment.app.FragmentTransition.getInEpicenterView(arrayMapCaptureInSharedElements, fragmentContainerTransition, obj, z);
                    if (inEpicenterView != null) {
                        fragmentTransitionImpl.getBoundsOnScreen(inEpicenterView, rect2);
                    }
                }
            }
        });
        return obj3;
    }

    private static androidx.collection.ArrayMap<java.lang.String, android.view.View> captureOutSharedElements(androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, java.lang.Object obj, androidx.fragment.app.FragmentTransition.FragmentContainerTransition fragmentContainerTransition) {
        androidx.core.app.SharedElementCallback exitTransitionCallback;
        java.util.ArrayList<java.lang.String> arrayList;
        if (arrayMap.isEmpty() || obj == null) {
            arrayMap.clear();
            return null;
        }
        androidx.fragment.app.Fragment fragment = fragmentContainerTransition.firstOut;
        androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap2 = new androidx.collection.ArrayMap<>();
        fragmentTransitionImpl.findNamedViews(arrayMap2, fragment.requireView());
        androidx.fragment.app.BackStackRecord backStackRecord = fragmentContainerTransition.firstOutTransaction;
        if (fragmentContainerTransition.firstOutIsPop) {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = backStackRecord.mSharedElementTargetNames;
        } else {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = backStackRecord.mSharedElementSourceNames;
        }
        if (arrayList != null) {
            arrayMap2.retainAll(arrayList);
        }
        if (exitTransitionCallback != null) {
            exitTransitionCallback.onMapSharedElements(arrayList, arrayMap2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                java.lang.String str = arrayList.get(size);
                android.view.View view = arrayMap2.get(str);
                if (view == null) {
                    arrayMap.remove(str);
                } else if (!str.equals(androidx.core.view.ViewCompat.getTransitionName(view))) {
                    arrayMap.put(androidx.core.view.ViewCompat.getTransitionName(view), arrayMap.remove(str));
                }
            }
        } else {
            arrayMap.retainAll(arrayMap2.keySet());
        }
        return arrayMap2;
    }

    static androidx.collection.ArrayMap<java.lang.String, android.view.View> captureInSharedElements(androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, java.lang.Object obj, androidx.fragment.app.FragmentTransition.FragmentContainerTransition fragmentContainerTransition) {
        androidx.core.app.SharedElementCallback enterTransitionCallback;
        java.util.ArrayList<java.lang.String> arrayList;
        java.lang.String strFindKeyForValue;
        androidx.fragment.app.Fragment fragment = fragmentContainerTransition.lastIn;
        android.view.View view = fragment.getView();
        if (arrayMap.isEmpty() || obj == null || view == null) {
            arrayMap.clear();
            return null;
        }
        androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap2 = new androidx.collection.ArrayMap<>();
        fragmentTransitionImpl.findNamedViews(arrayMap2, view);
        androidx.fragment.app.BackStackRecord backStackRecord = fragmentContainerTransition.lastInTransaction;
        if (fragmentContainerTransition.lastInIsPop) {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = backStackRecord.mSharedElementSourceNames;
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = backStackRecord.mSharedElementTargetNames;
        }
        if (arrayList != null) {
            arrayMap2.retainAll(arrayList);
            arrayMap2.retainAll(arrayMap.values());
        }
        if (enterTransitionCallback != null) {
            enterTransitionCallback.onMapSharedElements(arrayList, arrayMap2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                java.lang.String str = arrayList.get(size);
                android.view.View view2 = arrayMap2.get(str);
                if (view2 == null) {
                    java.lang.String strFindKeyForValue2 = findKeyForValue(arrayMap, str);
                    if (strFindKeyForValue2 != null) {
                        arrayMap.remove(strFindKeyForValue2);
                    }
                } else if (!str.equals(androidx.core.view.ViewCompat.getTransitionName(view2)) && (strFindKeyForValue = findKeyForValue(arrayMap, str)) != null) {
                    arrayMap.put(strFindKeyForValue, androidx.core.view.ViewCompat.getTransitionName(view2));
                }
            }
        } else {
            retainValues(arrayMap, arrayMap2);
        }
        return arrayMap2;
    }

    static java.lang.String findKeyForValue(androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, java.lang.String str) {
        int size = arrayMap.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(arrayMap.valueAt(i))) {
                return arrayMap.keyAt(i);
            }
        }
        return null;
    }

    static android.view.View getInEpicenterView(androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap, androidx.fragment.app.FragmentTransition.FragmentContainerTransition fragmentContainerTransition, java.lang.Object obj, boolean z) {
        java.lang.String str;
        androidx.fragment.app.BackStackRecord backStackRecord = fragmentContainerTransition.lastInTransaction;
        if (obj == null || arrayMap == null || backStackRecord.mSharedElementSourceNames == null || backStackRecord.mSharedElementSourceNames.isEmpty()) {
            return null;
        }
        if (z) {
            str = backStackRecord.mSharedElementSourceNames.get(0);
        } else {
            str = backStackRecord.mSharedElementTargetNames.get(0);
        }
        return arrayMap.get(str);
    }

    private static void setOutEpicenter(androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, java.lang.Object obj, java.lang.Object obj2, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap, boolean z, androidx.fragment.app.BackStackRecord backStackRecord) {
        java.lang.String str;
        if (backStackRecord.mSharedElementSourceNames == null || backStackRecord.mSharedElementSourceNames.isEmpty()) {
            return;
        }
        if (z) {
            str = backStackRecord.mSharedElementTargetNames.get(0);
        } else {
            str = backStackRecord.mSharedElementSourceNames.get(0);
        }
        android.view.View view = arrayMap.get(str);
        fragmentTransitionImpl.setEpicenter(obj, view);
        if (obj2 != null) {
            fragmentTransitionImpl.setEpicenter(obj2, view);
        }
    }

    static void retainValues(androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap2) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            if (!arrayMap2.containsKey(arrayMap.valueAt(size))) {
                arrayMap.removeAt(size);
            }
        }
    }

    static void callSharedElementStartEnd(androidx.fragment.app.Fragment fragment, androidx.fragment.app.Fragment fragment2, boolean z, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap, boolean z2) {
        androidx.core.app.SharedElementCallback enterTransitionCallback;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int size = arrayMap == null ? 0 : arrayMap.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(arrayMap.keyAt(i));
                arrayList.add(arrayMap.valueAt(i));
            }
            if (z2) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    static java.util.ArrayList<android.view.View> configureEnteringExitingViews(androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, java.lang.Object obj, androidx.fragment.app.Fragment fragment, java.util.ArrayList<android.view.View> arrayList, android.view.View view) {
        if (obj == null) {
            return null;
        }
        java.util.ArrayList<android.view.View> arrayList2 = new java.util.ArrayList<>();
        android.view.View view2 = fragment.getView();
        if (view2 != null) {
            fragmentTransitionImpl.captureTransitioningViews(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        fragmentTransitionImpl.addTargets(obj, arrayList2);
        return arrayList2;
    }

    static void setViewVisibility(java.util.ArrayList<android.view.View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    private static java.lang.Object mergeTransitions(androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, androidx.fragment.app.Fragment fragment, boolean z) {
        boolean allowEnterTransitionOverlap;
        if (obj == null || obj2 == null || fragment == null) {
            allowEnterTransitionOverlap = true;
        } else if (z) {
            allowEnterTransitionOverlap = fragment.getAllowReturnTransitionOverlap();
        } else {
            allowEnterTransitionOverlap = fragment.getAllowEnterTransitionOverlap();
        }
        if (allowEnterTransitionOverlap) {
            return fragmentTransitionImpl.mergeTransitionsTogether(obj2, obj, obj3);
        }
        return fragmentTransitionImpl.mergeTransitionsInSequence(obj2, obj, obj3);
    }

    public static void calculateFragments(androidx.fragment.app.BackStackRecord backStackRecord, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> sparseArray, boolean z) {
        int size = backStackRecord.mOps.size();
        for (int i = 0; i < size; i++) {
            addToFirstInLastOut(backStackRecord, backStackRecord.mOps.get(i), sparseArray, false, z);
        }
    }

    public static void calculatePopFragments(androidx.fragment.app.BackStackRecord backStackRecord, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> sparseArray, boolean z) {
        if (backStackRecord.mManager.getContainer().onHasView()) {
            for (int size = backStackRecord.mOps.size() - 1; size >= 0; size--) {
                addToFirstInLastOut(backStackRecord, backStackRecord.mOps.get(size), sparseArray, true, z);
            }
        }
    }

    static boolean supportsTransition() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0058  */
    /* JADX WARN: Code duplicated, block: B:55:0x0071  */
    /* JADX WARN: Code duplicated, block: B:56:0x0073  */
    /* JADX WARN: Code duplicated, block: B:63:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0084  */
    /* JADX WARN: Code duplicated, block: B:65:0x0087  */
    /* JADX WARN: Code duplicated, block: B:69:0x008f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0091  */
    private static void addToFirstInLastOut(androidx.fragment.app.BackStackRecord backStackRecord, androidx.fragment.app.FragmentTransaction.Op op, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        androidx.fragment.app.Fragment fragment = op.mFragment;
        if (fragment == null || (i = fragment.mContainerId) == 0) {
            return;
        }
        int i2 = z ? INVERSE_OPS[op.mCmd] : op.mCmd;
        boolean z7 = false;
        boolean z8 = true;
        if (i2 == 1) {
            if (z2) {
                z3 = fragment.mIsNewlyAdded;
            } else if (!fragment.mAdded || fragment.mHidden) {
                z3 = false;
            } else {
                z3 = true;
            }
            z4 = false;
            z7 = z3;
            z5 = false;
        } else if (i2 == 3) {
            if (z2 ? !fragment.mAdded || fragment.mHidden : fragment.mAdded || fragment.mView == null || fragment.mView.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0f) {
                z6 = false;
            } else {
                z6 = true;
            }
            z4 = z6;
            z5 = true;
            z8 = false;
        } else if (i2 == 4) {
            if (!z2 ? !(!fragment.mAdded || fragment.mHidden) : fragment.mHiddenChanged && fragment.mAdded && fragment.mHidden) {
                z6 = false;
            } else {
                z6 = true;
            }
            z4 = z6;
            z5 = true;
            z8 = false;
        } else if (i2 == 5) {
            if (z2) {
                if (fragment.mHiddenChanged && !fragment.mHidden && fragment.mAdded) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = fragment.mHidden;
            }
            z4 = false;
            z7 = z3;
            z5 = false;
        } else if (i2 == 6) {
            if (z2) {
                z6 = false;
            } else {
                z6 = false;
            }
            z4 = z6;
            z5 = true;
            z8 = false;
        } else if (i2 != 7) {
            z5 = false;
            z8 = false;
            z4 = false;
        } else {
            if (z2) {
                z3 = fragment.mIsNewlyAdded;
            } else {
                if (fragment.mAdded) {
                }
                z3 = false;
            }
            z4 = false;
            z7 = z3;
            z5 = false;
        }
        androidx.fragment.app.FragmentTransition.FragmentContainerTransition fragmentContainerTransitionEnsureContainer = sparseArray.get(i);
        if (z7) {
            fragmentContainerTransitionEnsureContainer = ensureContainer(fragmentContainerTransitionEnsureContainer, sparseArray, i);
            fragmentContainerTransitionEnsureContainer.lastIn = fragment;
            fragmentContainerTransitionEnsureContainer.lastInIsPop = z;
            fragmentContainerTransitionEnsureContainer.lastInTransaction = backStackRecord;
        }
        if (!z2 && z8) {
            if (fragmentContainerTransitionEnsureContainer != null && fragmentContainerTransitionEnsureContainer.firstOut == fragment) {
                fragmentContainerTransitionEnsureContainer.firstOut = null;
            }
            if (!backStackRecord.mReorderingAllowed) {
                androidx.fragment.app.FragmentManager fragmentManager = backStackRecord.mManager;
                fragmentManager.getFragmentStore().makeActive(fragmentManager.createOrGetFragmentStateManager(fragment));
                fragmentManager.moveToState(fragment);
            }
        }
        if (z4 && (fragmentContainerTransitionEnsureContainer == null || fragmentContainerTransitionEnsureContainer.firstOut == null)) {
            fragmentContainerTransitionEnsureContainer = ensureContainer(fragmentContainerTransitionEnsureContainer, sparseArray, i);
            fragmentContainerTransitionEnsureContainer.firstOut = fragment;
            fragmentContainerTransitionEnsureContainer.firstOutIsPop = z;
            fragmentContainerTransitionEnsureContainer.firstOutTransaction = backStackRecord;
        }
        if (z2 || !z5 || fragmentContainerTransitionEnsureContainer == null || fragmentContainerTransitionEnsureContainer.lastIn != fragment) {
            return;
        }
        fragmentContainerTransitionEnsureContainer.lastIn = null;
    }

    private static androidx.fragment.app.FragmentTransition.FragmentContainerTransition ensureContainer(androidx.fragment.app.FragmentTransition.FragmentContainerTransition fragmentContainerTransition, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> sparseArray, int i) {
        if (fragmentContainerTransition != null) {
            return fragmentContainerTransition;
        }
        androidx.fragment.app.FragmentTransition.FragmentContainerTransition fragmentContainerTransition2 = new androidx.fragment.app.FragmentTransition.FragmentContainerTransition();
        sparseArray.put(i, fragmentContainerTransition2);
        return fragmentContainerTransition2;
    }

    static class FragmentContainerTransition {
        public androidx.fragment.app.Fragment firstOut;
        public boolean firstOutIsPop;
        public androidx.fragment.app.BackStackRecord firstOutTransaction;
        public androidx.fragment.app.Fragment lastIn;
        public boolean lastInIsPop;
        public androidx.fragment.app.BackStackRecord lastInTransaction;

        FragmentContainerTransition() {
        }
    }

    private FragmentTransition() {
    }
}
