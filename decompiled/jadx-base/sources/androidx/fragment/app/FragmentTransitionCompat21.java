package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentTransitionCompat21 extends androidx.fragment.app.FragmentTransitionImpl {
    FragmentTransitionCompat21() {
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean canHandle(java.lang.Object obj) {
        return obj instanceof android.transition.Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object cloneTransition(java.lang.Object obj) {
        if (obj != null) {
            return ((android.transition.Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object wrapTransitionInSet(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        transitionSet.addTransition((android.transition.Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setSharedElementTargets(java.lang.Object obj, android.view.View view, java.util.ArrayList<android.view.View> arrayList) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
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
            ((android.transition.Transition) obj).setEpicenterCallback(new android.transition.Transition.EpicenterCallback() { // from class: androidx.fragment.app.FragmentTransitionCompat21.1
                @Override // android.transition.Transition.EpicenterCallback
                public android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTargets(java.lang.Object obj, java.util.ArrayList<android.view.View> arrayList) {
        android.transition.Transition transition = (android.transition.Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof android.transition.TransitionSet) {
            android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
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

    private static boolean hasSimpleTarget(android.transition.Transition transition) {
        return (isNullOrEmpty(transition.getTargetIds()) && isNullOrEmpty(transition.getTargetNames()) && isNullOrEmpty(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object mergeTransitionsTogether(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((android.transition.Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((android.transition.Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((android.transition.Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleHideFragmentView(java.lang.Object obj, final android.view.View view, final java.util.ArrayList<android.view.View> arrayList) {
        ((android.transition.Transition) obj).addListener(new android.transition.Transition.TransitionListener() { // from class: androidx.fragment.app.FragmentTransitionCompat21.2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(android.transition.Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(android.transition.Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(android.transition.Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(android.transition.Transition transition) {
                transition.removeListener(this);
                transition.addListener(this);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(android.transition.Transition transition) {
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
        android.transition.Transition ordering = (android.transition.Transition) obj;
        android.transition.Transition transition = (android.transition.Transition) obj2;
        android.transition.Transition transition2 = (android.transition.Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new android.transition.TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void beginDelayedTransition(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        android.transition.TransitionManager.beginDelayedTransition(viewGroup, (android.transition.Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleRemoveTargets(java.lang.Object obj, final java.lang.Object obj2, final java.util.ArrayList<android.view.View> arrayList, final java.lang.Object obj3, final java.util.ArrayList<android.view.View> arrayList2, final java.lang.Object obj4, final java.util.ArrayList<android.view.View> arrayList3) {
        ((android.transition.Transition) obj).addListener(new android.transition.Transition.TransitionListener() { // from class: androidx.fragment.app.FragmentTransitionCompat21.3
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(android.transition.Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(android.transition.Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(android.transition.Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(android.transition.Transition transition) {
                java.lang.Object obj5 = obj2;
                if (obj5 != null) {
                    androidx.fragment.app.FragmentTransitionCompat21.this.replaceTargets(obj5, arrayList, null);
                }
                java.lang.Object obj6 = obj3;
                if (obj6 != null) {
                    androidx.fragment.app.FragmentTransitionCompat21.this.replaceTargets(obj6, arrayList2, null);
                }
                java.lang.Object obj7 = obj4;
                if (obj7 != null) {
                    androidx.fragment.app.FragmentTransitionCompat21.this.replaceTargets(obj7, arrayList3, null);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(android.transition.Transition transition) {
                transition.removeListener(this);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setListenerForTransitionEnd(androidx.fragment.app.Fragment fragment, java.lang.Object obj, androidx.core.os.CancellationSignal cancellationSignal, final java.lang.Runnable runnable) {
        ((android.transition.Transition) obj).addListener(new android.transition.Transition.TransitionListener() { // from class: androidx.fragment.app.FragmentTransitionCompat21.4
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(android.transition.Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(android.transition.Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(android.transition.Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(android.transition.Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(android.transition.Transition transition) {
                runnable.run();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void swapSharedElementTargets(java.lang.Object obj, java.util.ArrayList<android.view.View> arrayList, java.util.ArrayList<android.view.View> arrayList2) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            replaceTargets(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void replaceTargets(java.lang.Object obj, java.util.ArrayList<android.view.View> arrayList, java.util.ArrayList<android.view.View> arrayList2) {
        java.util.List<android.view.View> targets;
        android.transition.Transition transition = (android.transition.Transition) obj;
        int i = 0;
        if (transition instanceof android.transition.TransitionSet) {
            android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                replaceTargets(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (hasSimpleTarget(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTarget(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((android.transition.Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void removeTarget(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((android.transition.Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(java.lang.Object obj, final android.graphics.Rect rect) {
        if (obj != null) {
            ((android.transition.Transition) obj).setEpicenterCallback(new android.transition.Transition.EpicenterCallback() { // from class: androidx.fragment.app.FragmentTransitionCompat21.5
                @Override // android.transition.Transition.EpicenterCallback
                public android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
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
