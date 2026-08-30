package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class FragmentTransitionSupport extends androidx.fragment.app.FragmentTransitionImpl {
    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean canHandle(java.lang.Object obj) {
        return obj instanceof androidx.transition.Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object cloneTransition(java.lang.Object obj) {
        if (obj != null) {
            return ((androidx.transition.Transition) obj).mo467clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object wrapTransitionInSet(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        androidx.transition.TransitionSet transitionSet = new androidx.transition.TransitionSet();
        transitionSet.addTransition((androidx.transition.Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setSharedElementTargets(java.lang.Object obj, android.view.View view, java.util.ArrayList<android.view.View> arrayList) {
        androidx.transition.TransitionSet transitionSet = (androidx.transition.TransitionSet) obj;
        java.util.List<android.view.View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bfsAddViewChildren(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        addTargets(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(java.lang.Object obj, android.view.View view) {
        if (view != null) {
            final android.graphics.Rect rect = new android.graphics.Rect();
            getBoundsOnScreen(view, rect);
            ((androidx.transition.Transition) obj).setEpicenterCallback(new androidx.transition.Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.1
                @Override // androidx.transition.Transition.EpicenterCallback
                public android.graphics.Rect onGetEpicenter(androidx.transition.Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTargets(java.lang.Object obj, java.util.ArrayList<android.view.View> arrayList) {
        androidx.transition.Transition transition = (androidx.transition.Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof androidx.transition.TransitionSet) {
            androidx.transition.TransitionSet transitionSet = (androidx.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                addTargets(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (hasSimpleTarget(transition) || !isNullOrEmpty(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    private static boolean hasSimpleTarget(androidx.transition.Transition transition) {
        return (isNullOrEmpty(transition.getTargetIds()) && isNullOrEmpty(transition.getTargetNames()) && isNullOrEmpty(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object mergeTransitionsTogether(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        androidx.transition.TransitionSet transitionSet = new androidx.transition.TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((androidx.transition.Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((androidx.transition.Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((androidx.transition.Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleHideFragmentView(java.lang.Object obj, final android.view.View view, final java.util.ArrayList<android.view.View> arrayList) {
        ((androidx.transition.Transition) obj).addListener(new androidx.transition.Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.2
            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(androidx.transition.Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(androidx.transition.Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(androidx.transition.Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(androidx.transition.Transition transition) {
                transition.removeListener(this);
                transition.addListener(this);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(androidx.transition.Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((android.view.View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object mergeTransitionsInSequence(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        androidx.transition.Transition ordering = (androidx.transition.Transition) obj;
        androidx.transition.Transition transition = (androidx.transition.Transition) obj2;
        androidx.transition.Transition transition2 = (androidx.transition.Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new androidx.transition.TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        androidx.transition.TransitionSet transitionSet = new androidx.transition.TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void beginDelayedTransition(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        androidx.transition.TransitionManager.beginDelayedTransition(viewGroup, (androidx.transition.Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleRemoveTargets(java.lang.Object obj, final java.lang.Object obj2, final java.util.ArrayList<android.view.View> arrayList, final java.lang.Object obj3, final java.util.ArrayList<android.view.View> arrayList2, final java.lang.Object obj4, final java.util.ArrayList<android.view.View> arrayList3) {
        ((androidx.transition.Transition) obj).addListener(new androidx.transition.TransitionListenerAdapter() { // from class: androidx.transition.FragmentTransitionSupport.3
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionStart(androidx.transition.Transition transition) {
                java.lang.Object obj5 = obj2;
                if (obj5 != null) {
                    androidx.transition.FragmentTransitionSupport.this.replaceTargets(obj5, arrayList, null);
                }
                java.lang.Object obj6 = obj3;
                if (obj6 != null) {
                    androidx.transition.FragmentTransitionSupport.this.replaceTargets(obj6, arrayList2, null);
                }
                java.lang.Object obj7 = obj4;
                if (obj7 != null) {
                    androidx.transition.FragmentTransitionSupport.this.replaceTargets(obj7, arrayList3, null);
                }
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(androidx.transition.Transition transition) {
                transition.removeListener(this);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setListenerForTransitionEnd(androidx.fragment.app.Fragment fragment, java.lang.Object obj, androidx.core.os.CancellationSignal cancellationSignal, final java.lang.Runnable runnable) {
        final androidx.transition.Transition transition = (androidx.transition.Transition) obj;
        cancellationSignal.setOnCancelListener(new androidx.core.os.CancellationSignal.OnCancelListener() { // from class: androidx.transition.FragmentTransitionSupport.4
            @Override // androidx.core.os.CancellationSignal.OnCancelListener
            public void onCancel() {
                transition.cancel();
            }
        });
        transition.addListener(new androidx.transition.Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.5
            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(androidx.transition.Transition transition2) {
                runnable.run();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void swapSharedElementTargets(java.lang.Object obj, java.util.ArrayList<android.view.View> arrayList, java.util.ArrayList<android.view.View> arrayList2) {
        androidx.transition.TransitionSet transitionSet = (androidx.transition.TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            replaceTargets(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void replaceTargets(java.lang.Object obj, java.util.ArrayList<android.view.View> arrayList, java.util.ArrayList<android.view.View> arrayList2) {
        androidx.transition.Transition transition = (androidx.transition.Transition) obj;
        int i = 0;
        if (transition instanceof androidx.transition.TransitionSet) {
            androidx.transition.TransitionSet transitionSet = (androidx.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                replaceTargets(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (hasSimpleTarget(transition)) {
            return;
        }
        java.util.List<android.view.View> targets = transition.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTarget(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((androidx.transition.Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void removeTarget(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((androidx.transition.Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(java.lang.Object obj, final android.graphics.Rect rect) {
        if (obj != null) {
            ((androidx.transition.Transition) obj).setEpicenterCallback(new androidx.transition.Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.6
                @Override // androidx.transition.Transition.EpicenterCallback
                public android.graphics.Rect onGetEpicenter(androidx.transition.Transition transition) {
                    android.graphics.Rect rect2 = rect;
                    if (rect2 == null || rect2.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }
}
