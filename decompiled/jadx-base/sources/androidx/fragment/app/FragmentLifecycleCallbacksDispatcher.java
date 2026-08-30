package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentLifecycleCallbacksDispatcher {
    private final androidx.fragment.app.FragmentManager mFragmentManager;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> mLifecycleCallbacks = new java.util.concurrent.CopyOnWriteArrayList<>();

    private static final class FragmentLifecycleCallbacksHolder {
        final androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks mCallback;
        final boolean mRecursive;

        FragmentLifecycleCallbacksHolder(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
            this.mCallback = fragmentLifecycleCallbacks;
            this.mRecursive = z;
        }
    }

    FragmentLifecycleCallbacksDispatcher(androidx.fragment.app.FragmentManager fragmentManager) {
        this.mFragmentManager = fragmentManager;
    }

    public void registerFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        this.mLifecycleCallbacks.add(new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder(fragmentLifecycleCallbacks, z));
    }

    public void unregisterFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        synchronized (this.mLifecycleCallbacks) {
            int size = this.mLifecycleCallbacks.size();
            for (int i = 0; i < size; i++) {
                if (this.mLifecycleCallbacks.get(i).mCallback == fragmentLifecycleCallbacks) {
                    this.mLifecycleCallbacks.remove(i);
                    break;
                }
            }
        }
    }

    void dispatchOnFragmentPreAttached(androidx.fragment.app.Fragment fragment, boolean z) {
        android.content.Context context = this.mFragmentManager.getHost().getContext();
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentPreAttached(fragment, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentPreAttached(this.mFragmentManager, fragment, context);
            }
        }
    }

    void dispatchOnFragmentAttached(androidx.fragment.app.Fragment fragment, boolean z) {
        android.content.Context context = this.mFragmentManager.getHost().getContext();
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentAttached(fragment, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentAttached(this.mFragmentManager, fragment, context);
            }
        }
    }

    void dispatchOnFragmentPreCreated(androidx.fragment.app.Fragment fragment, android.os.Bundle bundle, boolean z) {
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentPreCreated(fragment, bundle, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentPreCreated(this.mFragmentManager, fragment, bundle);
            }
        }
    }

    void dispatchOnFragmentCreated(androidx.fragment.app.Fragment fragment, android.os.Bundle bundle, boolean z) {
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentCreated(fragment, bundle, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentCreated(this.mFragmentManager, fragment, bundle);
            }
        }
    }

    void dispatchOnFragmentActivityCreated(androidx.fragment.app.Fragment fragment, android.os.Bundle bundle, boolean z) {
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentActivityCreated(fragment, bundle, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentActivityCreated(this.mFragmentManager, fragment, bundle);
            }
        }
    }

    void dispatchOnFragmentViewCreated(androidx.fragment.app.Fragment fragment, android.view.View view, android.os.Bundle bundle, boolean z) {
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentViewCreated(fragment, view, bundle, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentViewCreated(this.mFragmentManager, fragment, view, bundle);
            }
        }
    }

    void dispatchOnFragmentStarted(androidx.fragment.app.Fragment fragment, boolean z) {
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentStarted(fragment, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentStarted(this.mFragmentManager, fragment);
            }
        }
    }

    void dispatchOnFragmentResumed(androidx.fragment.app.Fragment fragment, boolean z) {
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentResumed(fragment, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentResumed(this.mFragmentManager, fragment);
            }
        }
    }

    void dispatchOnFragmentPaused(androidx.fragment.app.Fragment fragment, boolean z) {
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentPaused(fragment, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentPaused(this.mFragmentManager, fragment);
            }
        }
    }

    void dispatchOnFragmentStopped(androidx.fragment.app.Fragment fragment, boolean z) {
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentStopped(fragment, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentStopped(this.mFragmentManager, fragment);
            }
        }
    }

    void dispatchOnFragmentSaveInstanceState(androidx.fragment.app.Fragment fragment, android.os.Bundle bundle, boolean z) {
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentSaveInstanceState(fragment, bundle, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentSaveInstanceState(this.mFragmentManager, fragment, bundle);
            }
        }
    }

    void dispatchOnFragmentViewDestroyed(androidx.fragment.app.Fragment fragment, boolean z) {
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentViewDestroyed(fragment, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentViewDestroyed(this.mFragmentManager, fragment);
            }
        }
    }

    void dispatchOnFragmentDestroyed(androidx.fragment.app.Fragment fragment, boolean z) {
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentDestroyed(fragment, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentDestroyed(this.mFragmentManager, fragment);
            }
        }
    }

    void dispatchOnFragmentDetached(androidx.fragment.app.Fragment fragment, boolean z) {
        androidx.fragment.app.Fragment parent = this.mFragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentDetached(fragment, true);
        }
        for (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.mLifecycleCallbacks) {
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentDetached(this.mFragmentManager, fragment);
            }
        }
    }
}
