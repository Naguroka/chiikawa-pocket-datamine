package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class DefaultSpecialEffectsController extends androidx.fragment.app.SpecialEffectsController {
    DefaultSpecialEffectsController(android.view.ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    @Override // androidx.fragment.app.SpecialEffectsController
    void executeOperations(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> list, boolean z) {
        androidx.fragment.app.SpecialEffectsController.Operation operation = null;
        androidx.fragment.app.SpecialEffectsController.Operation operation2 = null;
        for (androidx.fragment.app.SpecialEffectsController.Operation operation3 : list) {
            androidx.fragment.app.SpecialEffectsController.Operation.State stateFrom = androidx.fragment.app.SpecialEffectsController.Operation.State.from(operation3.getFragment().mView);
            int i = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[operation3.getFinalState().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (stateFrom == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = operation3;
                }
            } else if (i == 4 && stateFrom != androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = operation3;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        final java.util.ArrayList arrayList3 = new java.util.ArrayList(list);
        for (final androidx.fragment.app.SpecialEffectsController.Operation operation4 : list) {
            androidx.core.os.CancellationSignal cancellationSignal = new androidx.core.os.CancellationSignal();
            operation4.markStartedSpecialEffect(cancellationSignal);
            arrayList.add(new androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo(operation4, cancellationSignal, z));
            androidx.core.os.CancellationSignal cancellationSignal2 = new androidx.core.os.CancellationSignal();
            operation4.markStartedSpecialEffect(cancellationSignal2);
            boolean z2 = false;
            if (z) {
                if (operation4 == operation) {
                    z2 = true;
                }
            } else if (operation4 == operation2) {
                z2 = true;
            }
            arrayList2.add(new androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo(operation4, cancellationSignal2, z, z2));
            operation4.addCompletionListener(new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                @Override // java.lang.Runnable
                public void run() {
                    if (arrayList3.contains(operation4)) {
                        arrayList3.remove(operation4);
                        androidx.fragment.app.DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                    }
                }
            });
        }
        java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> mapStartTransitions = startTransitions(arrayList2, arrayList3, z, operation, operation2);
        startAnimations(arrayList, arrayList3, mapStartTransitions.containsValue(true), mapStartTransitions);
        java.util.Iterator<androidx.fragment.app.SpecialEffectsController.Operation> it = arrayList3.iterator();
        while (it.hasNext()) {
            applyContainerChanges(it.next());
        }
        arrayList3.clear();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State;

        static {
            int[] iArr = new int[androidx.fragment.app.SpecialEffectsController.Operation.State.values().length];
            $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = iArr;
            try {
                iArr[androidx.fragment.app.SpecialEffectsController.Operation.State.GONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private void startAnimations(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> list, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> list2, boolean z, java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> map) {
        final android.view.ViewGroup container = getContainer();
        android.content.Context context = container.getContext();
        java.util.ArrayList<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> arrayList = new java.util.ArrayList();
        boolean z2 = false;
        for (final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animationInfo : list) {
            if (animationInfo.isVisibilityUnchanged()) {
                animationInfo.completeSpecialEffect();
            } else {
                androidx.fragment.app.FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
                if (animation == null) {
                    animationInfo.completeSpecialEffect();
                } else {
                    final android.animation.Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(animationInfo);
                    } else {
                        final androidx.fragment.app.SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        androidx.fragment.app.Fragment fragment = operation.getFragment();
                        if (java.lang.Boolean.TRUE.equals(map.get(operation))) {
                            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                android.util.Log.v("FragmentManager", "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo.completeSpecialEffect();
                        } else {
                            final boolean z3 = operation.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.GONE;
                            if (z3) {
                                list2.remove(operation);
                            }
                            final android.view.View view = fragment.mView;
                            container.startViewTransition(view);
                            animator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.2
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(android.animation.Animator animator2) {
                                    container.endViewTransition(view);
                                    if (z3) {
                                        operation.getFinalState().applyState(view);
                                    }
                                    animationInfo.completeSpecialEffect();
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            animationInfo.getSignal().setOnCancelListener(new androidx.core.os.CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.3
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public void onCancel() {
                                    animator.end();
                                }
                            });
                            z2 = true;
                        }
                    }
                }
            }
        }
        for (final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animationInfo2 : arrayList) {
            androidx.fragment.app.SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            androidx.fragment.app.Fragment fragment2 = operation2.getFragment();
            if (z) {
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    android.util.Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo2.completeSpecialEffect();
            } else if (z2) {
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    android.util.Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final android.view.View view2 = fragment2.mView;
                android.view.animation.Animation animation2 = (android.view.animation.Animation) androidx.core.util.Preconditions.checkNotNull(((androidx.fragment.app.FragmentAnim.AnimationOrAnimator) androidx.core.util.Preconditions.checkNotNull(animationInfo2.getAnimation(context))).animation);
                if (operation2.getFinalState() != androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation2);
                    animationInfo2.completeSpecialEffect();
                } else {
                    container.startViewTransition(view2);
                    androidx.fragment.app.FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new androidx.fragment.app.FragmentAnim.EndViewTransitionAnimation(animation2, container, view2);
                    endViewTransitionAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(android.view.animation.Animation animation3) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(android.view.animation.Animation animation3) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(android.view.animation.Animation animation3) {
                            container.post(new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    container.endViewTransition(view2);
                                    animationInfo2.completeSpecialEffect();
                                }
                            });
                        }
                    });
                    view2.startAnimation(endViewTransitionAnimation);
                }
                animationInfo2.getSignal().setOnCancelListener(new androidx.core.os.CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.5
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public void onCancel() {
                        view2.clearAnimation();
                        container.endViewTransition(view2);
                        animationInfo2.completeSpecialEffect();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r30v0, types: [androidx.fragment.app.DefaultSpecialEffectsController] */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.fragment.app.DefaultSpecialEffectsController] */
    /* JADX WARN: Type inference failed for: r6v18 */
    private java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> startTransitions(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> list, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> list2, final boolean z, final androidx.fragment.app.SpecialEffectsController.Operation operation, final androidx.fragment.app.SpecialEffectsController.Operation operation2) {
        android.view.View view;
        java.lang.Object obj;
        java.util.ArrayList<android.view.View> arrayList;
        java.lang.Object objMergeTransitionsTogether;
        java.util.ArrayList<android.view.View> arrayList2;
        java.util.HashMap map;
        androidx.fragment.app.SpecialEffectsController.Operation operation3;
        android.view.View view2;
        java.lang.Object objMergeTransitionsTogether2;
        androidx.fragment.app.SpecialEffectsController.Operation operation4;
        int i;
        java.util.ArrayList<android.view.View> arrayList3;
        java.util.HashMap map2;
        androidx.fragment.app.SpecialEffectsController.Operation operation5;
        android.view.View view3;
        java.util.ArrayList<android.view.View> arrayList4;
        ?? r5;
        androidx.core.app.SharedElementCallback exitTransitionCallback;
        androidx.core.app.SharedElementCallback enterTransitionCallback;
        java.util.ArrayList<java.lang.String> arrayList5;
        final android.view.View view4;
        java.lang.String strFindKeyForValue;
        java.util.ArrayList<java.lang.String> arrayList6;
        ?? r6 = this;
        androidx.fragment.app.SpecialEffectsController.Operation operation6 = operation;
        androidx.fragment.app.SpecialEffectsController.Operation operation7 = operation2;
        java.util.HashMap map3 = new java.util.HashMap();
        final androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl = null;
        for (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo transitionInfo : list) {
            if (!transitionInfo.isVisibilityUnchanged()) {
                androidx.fragment.app.FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
                if (fragmentTransitionImpl == null) {
                    fragmentTransitionImpl = handlingImpl;
                } else if (handlingImpl != null && fragmentTransitionImpl != handlingImpl) {
                    throw new java.lang.IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        int i2 = 0;
        if (fragmentTransitionImpl == null) {
            for (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo transitionInfo2 : list) {
                map3.put(transitionInfo2.getOperation(), false);
                transitionInfo2.completeSpecialEffect();
            }
            return map3;
        }
        android.view.View view5 = new android.view.View(getContainer().getContext());
        final android.graphics.Rect rect = new android.graphics.Rect();
        java.util.ArrayList<android.view.View> arrayList7 = new java.util.ArrayList<>();
        java.util.ArrayList<android.view.View> arrayList8 = new java.util.ArrayList<>();
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        boolean z2 = false;
        java.lang.Object obj2 = null;
        android.view.View view6 = null;
        androidx.collection.ArrayMap arrayMap2 = arrayMap;
        for (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo transitionInfo3 : list) {
            if (!transitionInfo3.hasSharedElementTransition() || operation6 == null || operation7 == null) {
                operation4 = operation7;
                i = i2;
                arrayList3 = arrayList8;
                map2 = map3;
                operation5 = operation6;
                view3 = view5;
                ?? r30 = r6;
                arrayList4 = arrayList7;
                r5 = r30;
                view6 = view6;
            } else {
                java.lang.Object objWrapTransitionInSet = fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(transitionInfo3.getSharedElementTransition()));
                java.util.ArrayList<java.lang.String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                java.util.ArrayList<java.lang.String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                java.util.ArrayList<java.lang.String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                android.view.View view7 = view6;
                int i3 = 0;
                while (i3 < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i3));
                    java.util.ArrayList<java.lang.String> arrayList9 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i3));
                    }
                    i3++;
                    sharedElementTargetNames = arrayList9;
                }
                java.util.ArrayList<java.lang.String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                if (z == 0) {
                    enterTransitionCallback = operation.getFragment().getExitTransitionCallback();
                    exitTransitionCallback = operation2.getFragment().getEnterTransitionCallback();
                } else {
                    enterTransitionCallback = operation.getFragment().getEnterTransitionCallback();
                    exitTransitionCallback = operation2.getFragment().getExitTransitionCallback();
                }
                int i4 = 0;
                for (int size = sharedElementSourceNames.size(); i4 < size; size = size) {
                    arrayMap2.put(sharedElementSourceNames.get(i4), sharedElementTargetNames2.get(i4));
                    i4++;
                }
                androidx.collection.ArrayMap arrayMap3 = new androidx.collection.ArrayMap();
                r6.findNamedViews(arrayMap3, operation.getFragment().mView);
                arrayMap3.retainAll(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    enterTransitionCallback.onMapSharedElements(sharedElementSourceNames, arrayMap3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        java.lang.String str = sharedElementSourceNames.get(size2);
                        android.view.View view8 = (android.view.View) arrayMap3.get(str);
                        if (view8 == null) {
                            arrayMap2.remove(str);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str.equals(androidx.core.view.ViewCompat.getTransitionName(view8))) {
                                arrayMap2.put(androidx.core.view.ViewCompat.getTransitionName(view8), (java.lang.String) arrayMap2.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    arrayMap2.retainAll(arrayMap3.keySet());
                }
                final androidx.collection.ArrayMap arrayMap4 = new androidx.collection.ArrayMap();
                r6.findNamedViews(arrayMap4, operation2.getFragment().mView);
                arrayMap4.retainAll(sharedElementTargetNames2);
                arrayMap4.retainAll(arrayMap2.values());
                if (exitTransitionCallback != null) {
                    exitTransitionCallback.onMapSharedElements(sharedElementTargetNames2, arrayMap4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        java.lang.String str2 = sharedElementTargetNames2.get(size3);
                        android.view.View view9 = (android.view.View) arrayMap4.get(str2);
                        if (view9 == null) {
                            java.lang.String strFindKeyForValue2 = androidx.fragment.app.FragmentTransition.findKeyForValue(arrayMap2, str2);
                            if (strFindKeyForValue2 != null) {
                                arrayMap2.remove(strFindKeyForValue2);
                            }
                        } else if (!str2.equals(androidx.core.view.ViewCompat.getTransitionName(view9)) && (strFindKeyForValue = androidx.fragment.app.FragmentTransition.findKeyForValue(arrayMap2, str2)) != null) {
                            arrayMap2.put(strFindKeyForValue, androidx.core.view.ViewCompat.getTransitionName(view9));
                        }
                    }
                } else {
                    androidx.fragment.app.FragmentTransition.retainValues(arrayMap2, arrayMap4);
                }
                r6.retainMatchingViews(arrayMap3, arrayMap2.keySet());
                r6.retainMatchingViews(arrayMap4, arrayMap2.values());
                if (arrayMap2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    arrayList3 = arrayList8;
                    view3 = view5;
                    view6 = view7;
                    obj2 = null;
                    i = 0;
                    operation4 = operation2;
                    map2 = map3;
                    operation5 = operation;
                    ?? r31 = r6;
                    arrayList4 = arrayList7;
                    r5 = r31;
                } else {
                    androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z, arrayMap3, true);
                    java.util.HashMap map4 = map3;
                    android.view.View view10 = view5;
                    java.util.ArrayList<android.view.View> arrayList10 = arrayList8;
                    arrayList4 = arrayList7;
                    androidx.core.view.OneShotPreDrawListener.add(getContainer(), new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.6
                        @Override // java.lang.Runnable
                        public void run() {
                            androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z, arrayMap4, false);
                        }
                    });
                    arrayList4.addAll(arrayMap3.values());
                    if (arrayList5.isEmpty()) {
                        i = 0;
                        view6 = view7;
                    } else {
                        i = 0;
                        android.view.View view11 = (android.view.View) arrayMap3.get(arrayList5.get(0));
                        fragmentTransitionImpl.setEpicenter(objWrapTransitionInSet, view11);
                        view6 = view11;
                    }
                    arrayList10.addAll(arrayMap4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view4 = (android.view.View) arrayMap4.get(sharedElementTargetNames2.get(i))) == null) {
                        r5 = this;
                    } else {
                        androidx.fragment.app.DefaultSpecialEffectsController defaultSpecialEffectsController = this;
                        androidx.core.view.OneShotPreDrawListener.add(getContainer(), new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.7
                            @Override // java.lang.Runnable
                            public void run() {
                                fragmentTransitionImpl.getBoundsOnScreen(view4, rect);
                            }
                        });
                        z2 = true;
                        r5 = defaultSpecialEffectsController;
                    }
                    fragmentTransitionImpl.setSharedElementTargets(objWrapTransitionInSet, view10, arrayList4);
                    view3 = view10;
                    arrayList3 = arrayList10;
                    fragmentTransitionImpl.scheduleRemoveTargets(objWrapTransitionInSet, null, null, null, null, objWrapTransitionInSet, arrayList3);
                    operation5 = operation;
                    map2 = map4;
                    map2.put(operation5, true);
                    operation4 = operation2;
                    map2.put(operation4, true);
                    obj2 = objWrapTransitionInSet;
                }
            }
            i2 = i;
            rect = rect;
            view5 = view3;
            arrayList8 = arrayList3;
            operation6 = operation5;
            map3 = map2;
            operation7 = operation4;
            fragmentTransitionImpl = fragmentTransitionImpl;
            arrayMap2 = arrayMap2;
            java.util.ArrayList<android.view.View> arrayList11 = arrayList4;
            r6 = r5;
            arrayList7 = arrayList11;
        }
        android.view.View view12 = view6;
        androidx.collection.ArrayMap arrayMap5 = arrayMap2;
        androidx.fragment.app.SpecialEffectsController.Operation operation8 = operation7;
        ?? r1 = i2;
        androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl2 = fragmentTransitionImpl;
        java.util.ArrayList<android.view.View> arrayList12 = arrayList8;
        java.util.HashMap map5 = map3;
        android.graphics.Rect rect2 = rect;
        androidx.fragment.app.SpecialEffectsController.Operation operation9 = operation6;
        android.view.View view13 = view5;
        ?? r32 = r6;
        java.util.ArrayList<android.view.View> arrayList13 = arrayList7;
        java.util.ArrayList arrayList14 = new java.util.ArrayList();
        java.util.Iterator<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> it = list.iterator();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = null;
        while (it.hasNext()) {
            androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo next = it.next();
            if (next.isVisibilityUnchanged()) {
                map5.put(next.getOperation(), java.lang.Boolean.valueOf((boolean) r1));
                next.completeSpecialEffect();
            } else {
                java.lang.Object objCloneTransition = fragmentTransitionImpl2.cloneTransition(next.getTransition());
                androidx.fragment.app.SpecialEffectsController.Operation operation10 = next.getOperation();
                boolean z3 = (obj2 == null || !(operation10 == operation9 || operation10 == operation8)) ? r1 == true ? 1 : 0 : true;
                if (objCloneTransition == null) {
                    if (!z3) {
                        map5.put(operation10, java.lang.Boolean.valueOf((boolean) r1));
                        next.completeSpecialEffect();
                    }
                    arrayList = arrayList13;
                    view = view13;
                    arrayList2 = arrayList12;
                    objMergeTransitionsTogether2 = obj3;
                    objMergeTransitionsTogether = obj4;
                    map = map5;
                    view2 = view12;
                } else {
                    final java.util.ArrayList<android.view.View> arrayList15 = new java.util.ArrayList<>();
                    java.lang.Object obj5 = obj3;
                    r32.captureTransitioningViews(arrayList15, operation10.getFragment().mView);
                    if (z3) {
                        if (operation10 == operation9) {
                            arrayList15.removeAll(arrayList13);
                        } else {
                            arrayList15.removeAll(arrayList12);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        fragmentTransitionImpl2.addTarget(objCloneTransition, view13);
                        arrayList = arrayList13;
                        view = view13;
                        arrayList2 = arrayList12;
                        operation3 = operation10;
                        objMergeTransitionsTogether = obj4;
                        map = map5;
                        obj = obj5;
                    } else {
                        fragmentTransitionImpl2.addTargets(objCloneTransition, arrayList15);
                        view = view13;
                        obj = obj5;
                        arrayList = arrayList13;
                        objMergeTransitionsTogether = obj4;
                        arrayList2 = arrayList12;
                        map = map5;
                        fragmentTransitionImpl2.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList15, null, null, null, null);
                        if (operation10.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.GONE) {
                            operation3 = operation10;
                            list2.remove(operation3);
                            java.util.ArrayList<android.view.View> arrayList16 = new java.util.ArrayList<>(arrayList15);
                            arrayList16.remove(operation3.getFragment().mView);
                            fragmentTransitionImpl2.scheduleHideFragmentView(objCloneTransition, operation3.getFragment().mView, arrayList16);
                            androidx.core.view.OneShotPreDrawListener.add(getContainer(), new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.8
                                @Override // java.lang.Runnable
                                public void run() {
                                    androidx.fragment.app.FragmentTransition.setViewVisibility(arrayList15, 4);
                                }
                            });
                        } else {
                            operation3 = operation10;
                        }
                    }
                    if (operation3.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList14.addAll(arrayList15);
                        if (z2) {
                            fragmentTransitionImpl2.setEpicenter(objCloneTransition, rect2);
                        }
                        view2 = view12;
                    } else {
                        view2 = view12;
                        fragmentTransitionImpl2.setEpicenter(objCloneTransition, view2);
                    }
                    map.put(operation3, true);
                    if (next.isOverlapAllowed()) {
                        objMergeTransitionsTogether = fragmentTransitionImpl2.mergeTransitionsTogether(objMergeTransitionsTogether, objCloneTransition, null);
                        objMergeTransitionsTogether2 = obj;
                    } else {
                        objMergeTransitionsTogether2 = fragmentTransitionImpl2.mergeTransitionsTogether(obj, objCloneTransition, null);
                    }
                }
                view12 = view2;
                obj4 = objMergeTransitionsTogether;
                obj3 = objMergeTransitionsTogether2;
                map5 = map;
                view13 = view;
                arrayList13 = arrayList;
                arrayList12 = arrayList2;
                r1 = 0;
            }
            it = it;
            r1 = r1;
        }
        java.util.ArrayList<android.view.View> arrayList17 = arrayList13;
        java.util.ArrayList<android.view.View> arrayList18 = arrayList12;
        java.util.HashMap map6 = map5;
        java.lang.Object objMergeTransitionsInSequence = fragmentTransitionImpl2.mergeTransitionsInSequence(obj4, obj3, obj2);
        for (final androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo transitionInfo4 : list) {
            if (!transitionInfo4.isVisibilityUnchanged()) {
                java.lang.Object transition = transitionInfo4.getTransition();
                androidx.fragment.app.SpecialEffectsController.Operation operation11 = transitionInfo4.getOperation();
                boolean z4 = obj2 != null && (operation11 == operation9 || operation11 == operation8);
                if (transition != null || z4) {
                    if (!androidx.core.view.ViewCompat.isLaidOut(getContainer())) {
                        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                            android.util.Log.v("FragmentManager", "SpecialEffectsController: Container " + getContainer() + " has not been laid out. Completing operation " + operation11);
                        }
                        transitionInfo4.completeSpecialEffect();
                    } else {
                        fragmentTransitionImpl2.setListenerForTransitionEnd(transitionInfo4.getOperation().getFragment(), objMergeTransitionsInSequence, transitionInfo4.getSignal(), new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.9
                            @Override // java.lang.Runnable
                            public void run() {
                                transitionInfo4.completeSpecialEffect();
                            }
                        });
                    }
                }
            }
        }
        if (!androidx.core.view.ViewCompat.isLaidOut(getContainer())) {
            return map6;
        }
        androidx.fragment.app.FragmentTransition.setViewVisibility(arrayList14, 4);
        java.util.ArrayList<java.lang.String> arrayListPrepareSetNameOverridesReordered = fragmentTransitionImpl2.prepareSetNameOverridesReordered(arrayList18);
        fragmentTransitionImpl2.beginDelayedTransition(getContainer(), objMergeTransitionsInSequence);
        fragmentTransitionImpl2.setNameOverridesReordered(getContainer(), arrayList17, arrayList18, arrayListPrepareSetNameOverridesReordered, arrayMap5);
        androidx.fragment.app.FragmentTransition.setViewVisibility(arrayList14, 0);
        fragmentTransitionImpl2.swapSharedElementTargets(obj2, arrayList17, arrayList18);
        return map6;
    }

    void retainMatchingViews(androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap, java.util.Collection<java.lang.String> collection) {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, android.view.View>> it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(androidx.core.view.ViewCompat.getTransitionName(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    void captureTransitioningViews(java.util.ArrayList<android.view.View> arrayList, android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (androidx.core.view.ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    captureTransitioningViews(arrayList, childAt);
                }
            }
            return;
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    void findNamedViews(java.util.Map<java.lang.String, android.view.View> map, android.view.View view) {
        java.lang.String transitionName = androidx.core.view.ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(map, childAt);
                }
            }
        }
    }

    void applyContainerChanges(androidx.fragment.app.SpecialEffectsController.Operation operation) {
        operation.getFinalState().applyState(operation.getFragment().mView);
    }

    private static class SpecialEffectsInfo {
        private final androidx.fragment.app.SpecialEffectsController.Operation mOperation;
        private final androidx.core.os.CancellationSignal mSignal;

        SpecialEffectsInfo(androidx.fragment.app.SpecialEffectsController.Operation operation, androidx.core.os.CancellationSignal cancellationSignal) {
            this.mOperation = operation;
            this.mSignal = cancellationSignal;
        }

        androidx.fragment.app.SpecialEffectsController.Operation getOperation() {
            return this.mOperation;
        }

        androidx.core.os.CancellationSignal getSignal() {
            return this.mSignal;
        }

        boolean isVisibilityUnchanged() {
            androidx.fragment.app.SpecialEffectsController.Operation.State stateFrom = androidx.fragment.app.SpecialEffectsController.Operation.State.from(this.mOperation.getFragment().mView);
            androidx.fragment.app.SpecialEffectsController.Operation.State finalState = this.mOperation.getFinalState();
            return stateFrom == finalState || !(stateFrom == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE || finalState == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE);
        }

        void completeSpecialEffect() {
            this.mOperation.completeSpecialEffect(this.mSignal);
        }
    }

    private static class AnimationInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private androidx.fragment.app.FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        AnimationInfo(androidx.fragment.app.SpecialEffectsController.Operation operation, androidx.core.os.CancellationSignal cancellationSignal, boolean z) {
            super(operation, cancellationSignal);
            this.mLoadedAnim = false;
            this.mIsPop = z;
        }

        androidx.fragment.app.FragmentAnim.AnimationOrAnimator getAnimation(android.content.Context context) {
            if (this.mLoadedAnim) {
                return this.mAnimation;
            }
            androidx.fragment.app.FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = androidx.fragment.app.FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE, this.mIsPop);
            this.mAnimation = animationOrAnimatorLoadAnimation;
            this.mLoadedAnim = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    private static class TransitionInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private final boolean mOverlapAllowed;
        private final java.lang.Object mSharedElementTransition;
        private final java.lang.Object mTransition;

        TransitionInfo(androidx.fragment.app.SpecialEffectsController.Operation operation, androidx.core.os.CancellationSignal cancellationSignal, boolean z, boolean z2) {
            java.lang.Object exitTransition;
            java.lang.Object enterTransition;
            boolean allowEnterTransitionOverlap;
            super(operation, cancellationSignal);
            if (operation.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                if (z) {
                    enterTransition = operation.getFragment().getReenterTransition();
                } else {
                    enterTransition = operation.getFragment().getEnterTransition();
                }
                this.mTransition = enterTransition;
                if (z) {
                    allowEnterTransitionOverlap = operation.getFragment().getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = operation.getFragment().getAllowEnterTransitionOverlap();
                }
                this.mOverlapAllowed = allowEnterTransitionOverlap;
            } else {
                if (z) {
                    exitTransition = operation.getFragment().getReturnTransition();
                } else {
                    exitTransition = operation.getFragment().getExitTransition();
                }
                this.mTransition = exitTransition;
                this.mOverlapAllowed = true;
            }
            if (!z2) {
                this.mSharedElementTransition = null;
            } else if (z) {
                this.mSharedElementTransition = operation.getFragment().getSharedElementReturnTransition();
            } else {
                this.mSharedElementTransition = operation.getFragment().getSharedElementEnterTransition();
            }
        }

        java.lang.Object getTransition() {
            return this.mTransition;
        }

        boolean isOverlapAllowed() {
            return this.mOverlapAllowed;
        }

        public boolean hasSharedElementTransition() {
            return this.mSharedElementTransition != null;
        }

        public java.lang.Object getSharedElementTransition() {
            return this.mSharedElementTransition;
        }

        androidx.fragment.app.FragmentTransitionImpl getHandlingImpl() {
            androidx.fragment.app.FragmentTransitionImpl handlingImpl = getHandlingImpl(this.mTransition);
            androidx.fragment.app.FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.mSharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl != null ? handlingImpl : handlingImpl2;
            }
            throw new java.lang.IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.mTransition + " which uses a different Transition  type than its shared element transition " + this.mSharedElementTransition);
        }

        private androidx.fragment.app.FragmentTransitionImpl getHandlingImpl(java.lang.Object obj) {
            if (obj == null) {
                return null;
            }
            if (androidx.fragment.app.FragmentTransition.PLATFORM_IMPL != null && androidx.fragment.app.FragmentTransition.PLATFORM_IMPL.canHandle(obj)) {
                return androidx.fragment.app.FragmentTransition.PLATFORM_IMPL;
            }
            if (androidx.fragment.app.FragmentTransition.SUPPORT_IMPL != null && androidx.fragment.app.FragmentTransition.SUPPORT_IMPL.canHandle(obj)) {
                return androidx.fragment.app.FragmentTransition.SUPPORT_IMPL;
            }
            throw new java.lang.IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
